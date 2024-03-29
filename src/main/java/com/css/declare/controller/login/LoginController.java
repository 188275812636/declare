package com.css.declare.controller.login;

import com.css.declare.service.login.LoginService;
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
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     *@描述 简单的登录拦截
     *@user rgy
     *@date 2019/8/27
     */
    @RequestMapping(value = {"/", "/login.do"})
    public ModelAndView login(HttpServletRequest request) {
        Object user = request.getSession().getAttribute("user");

        if(user!=null){

            return new ModelAndView("redirect:/home.do");
        }
        return new ModelAndView("login/login");
    }

    /**
     *@描述 登录
     *@user rgy
     *@date 2019/8/27
     */
    @ResponseBody
    @RequestMapping(value = {"/loginIn.do"})
    public JsonResponse loginIn(HttpServletRequest request) throws Exception {
       JsonResponse jsonResponse = loginService.queryUser(request);
        return jsonResponse;
    }

    /**
     *@描述 登出
     *@user rgy
     *@date 2019/8/27
     */
    @RequestMapping(value = {"/logOut.do"})
    public ModelAndView logOut(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return new ModelAndView("redirect:/home.do");
    }

}