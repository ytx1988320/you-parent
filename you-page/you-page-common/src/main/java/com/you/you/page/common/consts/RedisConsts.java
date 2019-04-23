/**
 * Copyright (C), 2019
 * FileName: RedisConsts
 * Author:   york
 * Date:     2019/3/28 9:44
 */
package com.you.you.page.common.consts;

/**
 * 〈一句话功能简述〉<br> 
 * 〈redis常量〉
 *
 * @author york
 * @create 2019/3/28
 * @since 1.0.0
 */
public class RedisConsts {

    /** 后台用户key */
    public final static String BACK_USER_KEY = "BACK_USER_";
    /** H5端用户key */
    public final static String FRONT_USER_KEY = "FRONT_USER_";
    /** 系统数据字典缓存key */
    public final static String BACK_SYS_DATA_DICT_KEY = "BACK_SYS_DATA_DICT_KEY";
    /** 系统数据省市区缓存key */
    public final static String BACK_SYS_DATA_CITY_KEY = "BACK_SYS_DATA_CITY_KEY";

    /** 视频播放统计缓存key */
    public final static String FRONT_VIDEO_PLAYTIMES_KEY = "VIDEO_PLAYTIMES_";
    /** 视频分享统计缓存key */
    public final static String FRONT_SHARE_PLAYTIMES_KEY = "VIDEO_SHARETIMES_";
    /** 视频点赞统计缓存key */
    public final static String FRONT_VIDEO_CLICKTIMES_KEY = "VIDEO_CLICKTIMES_";
    /** 评论点赞统计缓存key */
    public final static String FRONT_COMMENT_CLICKTIMES_KEY = "COMMENT_CLICKTIMES_";
    /** 歌曲收藏缓存key */
    public final static String FRONT_MUSIC_COLLECTION_KEY = "FRONT_MUSIC_COLLECTION";
    /** 视频收藏缓存key */
    public final static String FRONT_VIDEO_COLLECTION_KEY = "FRONT_VIDEO_COLLECTION";
}