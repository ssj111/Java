package com.zgh.onlinevideo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zgh.onlinevideo.domain.Banner;
import com.zgh.onlinevideo.domain.CourseTopic;
import com.zgh.onlinevideo.service.BannerService;
import com.zgh.onlinevideo.service.CourseTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PageController {

    @Autowired
    CourseTopicService courseTopicService;

    @Autowired
    BannerService bannerService;

    // 首页
    @RequestMapping("/")
    public String indexPage(Model model) {

        // 设置头页面的导航条当前焦点位置
        model.addAttribute("focusIndex", 1);

        // 获取首页数据

        // banner
        List<Banner> bannerList = bannerService.getIndexBanner();

        // 最新
        // 设置分页 第几页，显示N个
        PageHelper.startPage(1, 4);
        PageInfo<CourseTopic> newsetTopicList = courseTopicService.getIndexNewestTopic();

        // type=3
        // 设置分页 第几页，显示N个
        PageHelper.startPage(1, 4);
        PageInfo<CourseTopic> courseTopicList = courseTopicService.getIndexCourseTopic(3);

        model.addAttribute("newsetTopicList", newsetTopicList);
        model.addAttribute("courseTopicList", courseTopicList);
        model.addAttribute("bannerList", bannerList);

        return "index";
    }

    // 工具
    @RequestMapping("/tools")
    public String toolsPage(Model model) {
        model.addAttribute("focusIndex", 5);
        return "tools";
    }

    // vip
    @RequestMapping("/vip")
    public String vipPage(Model model) {
        model.addAttribute("focusIndex", 3);
        return "vip";
    }

    // 直播
    @RequestMapping("/live")
    public String livePage(Model model) {
        model.addAttribute("focusIndex", 4);
        return "redirect:https://www.bilibili.com/";
    }

    // 课程列表
    @RequestMapping("/course_list")
    public String courseListPage(Model model) {
        model.addAttribute("focusIndex", 2); //头页面聚焦
        model.addAttribute("courseTypeId", 0);//全部课程 无论类型

        PageHelper.startPage(1, 4);
        PageInfo<CourseTopic> newsetTopicList = courseTopicService.getIndexNewestTopic();
        model.addAttribute("topicList", newsetTopicList);

        return "course_list";
    }

    // 课程列表 显示某一分类
    @RequestMapping("/course_list/type/{courseTypeId}")
    public String courseListPage(@PathVariable Integer courseTypeId, Integer pageNum, Model model) {

        model.addAttribute("courseTypeId", courseTypeId);//课程某一分类

        if (pageNum == null || pageNum <= 1) {
            pageNum = 1;
        }

        PageHelper.startPage(pageNum, 4);
        PageInfo<CourseTopic> courseTopicList = null;
        if (courseTypeId == 0) {
            // 最新专题
            courseTopicList = courseTopicService.getIndexNewestTopic();
        } else {
            // 对应类型专题
            courseTopicList = courseTopicService.getIndexCourseTopic(courseTypeId);
        }

        model.addAttribute("topicList", courseTopicList);

        return "course_list";
    }

    @RequestMapping("/course_video")
    public String courseVideoPage() {
        return "course_video";
    }

}
