package com.css.declare.service.login;

import com.css.declare.entity.S_User;
import com.css.declare.entity.S_UserRepository;
import com.css.declare.util.JsonResponse;
import com.css.declare.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;


/**
 * \* User: rgy
 * \* Date: 2019/8/19 13:42
 * \
 */
@Service
public class LoginService {
    @Autowired
    private JdbcTemplate secondJdbcTemplate;

    @Autowired
    private S_UserRepository s_userRepository;

    public JsonResponse queryUser(HttpServletRequest request) throws Exception {
        JsonResponse jsonResponse = new JsonResponse();
        String sjhm = request.getParameter("sjhm");
        String pwd = MD5Utils.md52(request.getParameter("pwd"));
        S_User user = s_userRepository.findBySjhmAndPwd(sjhm,pwd);
        if(user!=null){
            //管理员
            jsonResponse.setMsg("校验成功！");
            jsonResponse.setCode("0");
            request.getSession().setAttribute("user",user);//用户名存入该用户的session 中
        }else{
            jsonResponse.setMsg("用户名或密码错误");
            jsonResponse.setCode("-1");
        }
        return jsonResponse;
    }
}