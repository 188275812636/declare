package com.css.declare.controller.login;

import com.css.declare.service.login.RegisterService;
import com.css.declare.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * \* User: rgy
 * \* Date: 2019/8/19 10:20
 * \
 */
@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    /**
     *@描述 注册页面
     *@user rgy
     *@date 2019/8/27
     */
    @RequestMapping(value = {"/register.do"})
    public ModelAndView register(HttpServletRequest request) {

        return new ModelAndView("login/register");
    }
    /**
     *@描述 注册
     *@user rgy
     *@date 2019/8/27
     */
    @ResponseBody
    @RequestMapping(value = {"/to_register.do"})
    public JsonResponse to_register(HttpServletRequest request) throws Exception {

        JsonResponse jsonResponse = registerService.addUser(request);
        return jsonResponse;
    }

}