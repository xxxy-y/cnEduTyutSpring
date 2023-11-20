package cn.edu.tyut.controller;

import cn.edu.tyut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author 羊羊
 * @ClassName UserController
 * @SubmitTime 周一
 * @DATE 2023/11/20
 * @Time 17:02
 * @Package_Name cn.edu.tyut.controller
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void save() {
        this.userService.save();
        System.out.println("UserController.save()");
    }
}