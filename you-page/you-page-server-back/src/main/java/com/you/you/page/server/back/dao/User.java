package com.you.you.page.server.back.dao;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWeichatId() {
        return weichatId;
    }

    public void setWeichatId(String weichatId) {
        this.weichatId = weichatId == null ? null : weichatId.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage == null ? null : userImage.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAuthLevel() {
        return authLevel;
    }

    public void setAuthLevel(Integer authLevel) {
        this.authLevel = authLevel;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getPositionProvince() {
        return positionProvince;
    }

    public void setPositionProvince(Integer positionProvince) {
        this.positionProvince = positionProvince;
    }

    public Integer getPositionCity() {
        return positionCity;
    }

    public void setPositionCity(Integer positionCity) {
        this.positionCity = positionCity;
    }

    public String getPositionDetail() {
        return positionDetail;
    }

    public void setPositionDetail(String positionDetail) {
        this.positionDetail = positionDetail == null ? null : positionDetail.trim();
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName == null ? null : childName.trim();
    }

    public Integer getChildAge() {
        return childAge;
    }

    public void setChildAge(Integer childAge) {
        this.childAge = childAge;
    }

    public Integer getChildSex() {
        return childSex;
    }

    public void setChildSex(Integer childSex) {
        this.childSex = childSex;
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public Integer getFrozenCapital() {
        return frozenCapital;
    }

    public void setFrozenCapital(Integer frozenCapital) {
        this.frozenCapital = frozenCapital;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getAuthTime() {
        return authTime;
    }

    public void setAuthTime(Date authTime) {
        this.authTime = authTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", weichatId=").append(weichatId);
        sb.append(", nickname=").append(nickname);
        sb.append(", userImage=").append(userImage);
        sb.append(", type=").append(type);
        sb.append(", authLevel=").append(authLevel);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", positionProvince=").append(positionProvince);
        sb.append(", positionCity=").append(positionCity);
        sb.append(", positionDetail=").append(positionDetail);
        sb.append(", childName=").append(childName);
        sb.append(", childAge=").append(childAge);
        sb.append(", childSex=").append(childSex);
        sb.append(", capital=").append(capital);
        sb.append(", frozenCapital=").append(frozenCapital);
        sb.append(", visible=").append(visible);
        sb.append(", createTime=").append(createTime);
        sb.append(", authTime=").append(authTime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}