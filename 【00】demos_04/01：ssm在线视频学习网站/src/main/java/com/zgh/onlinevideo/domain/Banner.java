package com.zgh.onlinevideo.domain;

import java.util.Date;

/**
 * banner
 * 
 * @author zgh
 * @version 1.0.0 2020-11-16
 */
public class Banner implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 4159805125505612495L;

    /* This code was generated by TableGo tools, mark 1 begin. */

    /** id */
    private Integer id;

    /** bannerImgUrl */
    private String bannerImgUrl;

    /** flag */
    private Integer flag;

    /** 广告图分类，区分展示页面 */
    private Integer type;

    /** createTime */
    private Date createTime;

    /** bannerUrl */
    private String bannerUrl;

    /* This code was generated by TableGo tools, mark 1 end. */

    /* This code was generated by TableGo tools, mark 2 begin. */

    /**
     * 获取id
     * 
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置id
     * 
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取bannerImgUrl
     * 
     * @return bannerImgUrl
     */
    public String getBannerImgUrl() {
        return this.bannerImgUrl;
    }

    /**
     * 设置bannerImgUrl
     * 
     * @param bannerImgUrl
     */
    public void setBannerImgUrl(String bannerImgUrl) {
        this.bannerImgUrl = bannerImgUrl;
    }

    /**
     * 获取flag
     * 
     * @return flag
     */
    public Integer getFlag() {
        return this.flag;
    }

    /**
     * 设置flag
     * 
     * @param flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * 获取广告图分类，区分展示页面
     * 
     * @return 广告图分类
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * 设置广告图分类，区分展示页面
     * 
     * @param type
     *          广告图分类
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取createTime
     * 
     * @return createTime
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置createTime
     * 
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取bannerUrl
     * 
     * @return bannerUrl
     */
    public String getBannerUrl() {
        return this.bannerUrl;
    }

    /**
     * 设置bannerUrl
     * 
     * @param bannerUrl
     */
    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    /* This code was generated by TableGo tools, mark 2 end. */
}