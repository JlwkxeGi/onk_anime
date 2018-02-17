package com.onk.anime.controller.comic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: onk_anime
 * @description: 漫画base
 * @author: chenh
 * @create: 2018-02-18 00:22
 **/
@Controller
@RequestMapping("web/manage/comic")
public class ComicController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("modelKey","test");
        return "comic/index.ftl";
    }
}
