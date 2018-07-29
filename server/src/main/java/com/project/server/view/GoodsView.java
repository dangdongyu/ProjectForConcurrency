package com.project.server.view;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 商品类VIEW
 */
@Controller
public class GoodsView {

    private static Logger logger = Logger.getLogger(GoodsView.class);


    @RequestMapping(value = "/goods/list",method = RequestMethod.GET)
    public String goodsList(){
        return "goodsList";
    }
}
