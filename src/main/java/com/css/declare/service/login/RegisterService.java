package com.css.declare.service.login;

import com.css.declare.entity.S_User;
import com.css.declare.entity.S_UserRepository;
import com.css.declare.util.JsonResponse;
import com.css.declare.util.UuidUtil;
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
public class RegisterService {
    @Autowired
    private JdbcTemplate secondJdbcTemplate;
    @Autowired
    private S_UserRepository userRepository;

    /**
     *@描述 新增用户
     *@user rgy
     *@date 2019/8/27
     */
    public JsonResponse addUser(HttpServletRequest request) {
        JsonResponse jsonResponse = new JsonResponse();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String truename = request.getParameter("truename");
        S_User userEntity = new S_User();
        if(userEntity==null){
            userEntity = new S_User();
        }else{
            jsonResponse.setMsg("用户名已存在！");
            jsonResponse.setCode("-1");
            return jsonResponse;
        }
        userEntity.setId(UuidUtil.getUUID());

        userRepository.save(userEntity);
        System.out.println("注册成功！");
        jsonResponse.setMsg("注册成功！");
        return jsonResponse;
    }
}