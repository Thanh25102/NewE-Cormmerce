package com.buimanhthanh.controller.ssr;

import com.buimanhthanh.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private ProductService productService;

    @GetMapping(value = {"/"})
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("latestProducts", productService.findLatest(8));
        return "index";
    }

    @GetMapping(value = {"/elements"})
    public String elements(ModelMap modelMap) {
        return "elements";
    }

    @GetMapping(value = {"/blog"})
    public String blog(ModelMap modelMap) {
        return "blog";
    }

    @GetMapping(value = {"/single-blog"})
    public String singleBlog(ModelMap modelMap) {
        return "single-blog";
    }
}
