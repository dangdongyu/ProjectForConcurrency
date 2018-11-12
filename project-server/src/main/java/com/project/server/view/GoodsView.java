package com.project.server.view;

import com.project.data.entity.User;
import com.project.service.service.BaseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * 商品类VIEW
 */
@Controller
public class GoodsView {

    private static Logger logger = Logger.getLogger(GoodsView.class);

    @Autowired
    private BaseService baseService;

    @RequestMapping(value = "/goods/list",method = RequestMethod.GET)
    public String goodsList(Model model){
        User user = baseService.hello();
        model.addAttribute("user",user);
        return "goodsList";
    }
}
