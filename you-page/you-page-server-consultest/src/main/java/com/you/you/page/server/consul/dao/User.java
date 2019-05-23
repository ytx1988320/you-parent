package com.you.you.page.server.consul.dao;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 4188545336886435432L;
    private Integer id;

    private String weichatId;

    private String nickname;

    private String userImage;

    private Integer type;

    private Integer authLevel;

    private String userPhone;

    private String name;

    private Integer sex;

    private Integer positionProvince;

    private Integer positionCity;

    private String positionDetail;

    private String childName;

    private Integer childAge;

    private Integer childSex;

    private Integer capital;

    private Integer frozenCapital;

    private Integer visible;

    private Date createTime;

    private Date authTime;

    private String remark;

}