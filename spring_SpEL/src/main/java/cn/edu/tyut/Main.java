package cn.edu.tyut;

import cn.edu.tyut.config.MainConfiguration;
import cn.edu.tyut.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Objects;

/**
 * @Author 羊羊
 * @ClassName Main
 * @SubmitTime 周三
 * @DATE 2023/11/22
 * @Time 15:00
 * @Package_Name cn.edu.tyut
 */
public class Main {
    public static void main(String[] args) {
        ExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression1 = expressionParser.parseExpression("'Hello World!'");
        Expression expression2 = expressionParser.parseExpression("'Hello World!'.toUpperCase()");
        Expression expression3 = expressionParser.parseExpression("'Hello World!'.getBytes()");
        Expression expression4 = expressionParser.parseExpression("'Hello World!'.getBytes().length");
        Expression expression5 = expressionParser.parseExpression("new String('Hello World!').toUpperCase()");
        System.out.println(expression1.getValue());
        System.out.println(expression2.getValue());
        System.out.println(expression3.getValue());
        System.out.println(expression4.getValue());
        System.out.println(expression5.getValue());
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Student student = applicationContext.getBean("student", Student.class);
        Expression expression = expressionParser.parseExpression("name.getBytes().length");
        System.out.println(expression.getValue(student));
        Expression expression6 = expressionParser.parseExpression("name");
        expression6.setValue(student, "wqt");
        System.out.println(student);
        Expression expression7 = expressionParser.parseExpression("66 > 77");
        System.out.println(Objects.requireNonNull(expression7.getValue()).getClass());
        // 对于那些需要导入才能使用的类，我们需要使用一个特殊的语法
        Expression expression8 = expressionParser.parseExpression("T(cn.edu.tyut.entity.Student).test()");
        Expression expression9 = expressionParser.parseExpression("map['test']");
        System.out.println(expression9.getValue(student));
        Expression expression10 = expressionParser.parseExpression("list[2]");
        System.out.println(expression10.getValue(student));
        Expression expression11 = expressionParser.parseExpression("{1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9}");
        System.out.println(expression11.getValue());
        Expression expression12 = expressionParser.parseExpression("{{1, 2, 3},{ 4, 5, 6}}");
        System.out.println(expression12.getValue());
        Expression expression13 = expressionParser.parseExpression("{name: 'wqt', address: {tel : '4894', wa: 'wa'}}");
        System.out.println(expression13.getValue());
        Expression exp = expressionParser.parseExpression("list1.?[name == '高等数学']");
        System.out.println(exp.getValue(student));
        Expression exp1 = expressionParser.parseExpression("list1.?[score > 3]");
        System.out.println(exp1.getValue(student));
        Expression exp2 = expressionParser.parseExpression("list1.![name]");
        System.out.println(exp2.getValue(student));
        Expression exp3 = expressionParser.parseExpression("name?.toUpperCase()");
        System.out.println(exp3.getValue(student));
    }
}