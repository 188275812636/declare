package com.css.declare.service.home;

import com.css.declare.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * \* User: rgy
 * \* Date: 2019/8/19 15:38
 * \
 */
@Service
public class HomeService {
    @Autowired
    private JdbcTemplate secondJdbcTemplate;

    /**
     *@描述 查询功能模块
     *@user rgy
     *@date 2019/8/27
     */
    public JsonResponse queryGnmk(HttpServletRequest request) {
        JsonResponse jsonResponse = new JsonResponse();

        return jsonResponse;
    }

    /**
     *@描述 查询功能菜单
     *@user rgy
     *@date 2019/8/27 10:19
     */
    public JsonResponse queryGncdByMkid(HttpServletRequest request) {
        JsonResponse jsonResponse = new JsonResponse();

        return jsonResponse;
    }

    /**
     *@描述 根据分类查询物品
     *@user rgy
     *@date 2019/8/28 11:30
     */
    public JsonResponse querySpBygnid(HttpServletRequest request) {
        JsonResponse jsonResponse = new JsonResponse();

        return jsonResponse;
    }
}