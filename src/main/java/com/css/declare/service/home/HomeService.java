package com.css.declare.service.home;

import com.css.declare.entity.S_User;
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
        List<Map<String, Object>> gnmk = this.secondJdbcTemplate.queryForList(
                "SELECT *,SUBSTRING(mk_url,2) as mk_url1 FROM gn_mk T WHERE T.yxbz='Y'");
        jsonResponse.getRepData().put("gnmk",gnmk);
        return jsonResponse;
    }

    /**
     *@描述 查询功能菜单
     *@user rgy
     *@date 2019/8/27 10:19
     */
    public JsonResponse queryAllGncd(HttpServletRequest request) {
        JsonResponse jsonResponse = new JsonResponse();
        S_User s_user = (S_User) request.getSession().getAttribute("user");
        String yhlx = s_user.getYhlx();
        List<Map<String, Object>> gncd = this.secondJdbcTemplate.queryForList(

                "SELECT * FROM gn_cd T WHERE T.yxbz='Y' and t.yhlx=?",yhlx);
        jsonResponse.getRepData().put("gncd",gncd);
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