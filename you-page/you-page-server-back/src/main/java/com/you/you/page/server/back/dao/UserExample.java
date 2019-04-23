package com.you.you.page.server.back.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWeichatIdIsNull() {
            addCriterion("weichat_id is null");
            return (Criteria) this;
        }

        public Criteria andWeichatIdIsNotNull() {
            addCriterion("weichat_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeichatIdEqualTo(String value) {
            addCriterion("weichat_id =", value, "weichatId");
            return (Criteria) this;
        }

        public Criteria andWeichatIdNotEqualTo(String value) {
            addCriterion("weichat_id <>", value, "weichatId");
            return (Criteria) this;
        }

        public Criteria andWeichatIdGreaterThan(String value) {
            addCriterion("weichat_id >", value, "weichatId");
            return (Criteria) this;
        }

        public Criteria andWeichatIdGreaterThanOrEqualTo(String value) {
            addCriterion("weichat_id >=", value, "weichatId");
            return (Criteria) this;
        }

        public Criteria andWeichatIdLessThan(String value) {
            addCriterion("weichat_id <", value, "weichatId");
            return (Criteria) this;
        }

        public Criteria andWeichatIdLessThanOrEqualTo(String value) {
            addCriterion("weichat_id <=", value, "weichatId");
            return (Criteria) this;
        }

        public Criteria andWeichatIdLike(String value) {
            addCriterion("weichat_id like", value, "weichatId");
            return (Criteria) this;
        }

        public Criteria andWeichatIdNotLike(String value) {
            addCriterion("weichat_id not like", value, "weichatId");
            return (Criteria) this;
        }

        public Criteria andWeichatIdIn(List<String> values) {
            addCriterion("weichat_id in", values, "weichatId");
            return (Criteria) this;
        }

        public Criteria andWeichatIdNotIn(List<String> values) {
            addCriterion("weichat_id not in", values, "weichatId");
            return (Criteria) this;
        }

        public Criteria andWeichatIdBetween(String value1, String value2) {
            addCriterion("weichat_id between", value1, value2, "weichatId");
            return (Criteria) this;
        }

        public Criteria andWeichatIdNotBetween(String value1, String value2) {
            addCriterion("weichat_id not between", value1, value2, "weichatId");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andUserImageIsNull() {
            addCriterion("user_image is null");
            return (Criteria) this;
        }

        public Criteria andUserImageIsNotNull() {
            addCriterion("user_image is not null");
            return (Criteria) this;
        }

        public Criteria andUserImageEqualTo(String value) {
            addCriterion("user_image =", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageNotEqualTo(String value) {
            addCriterion("user_image <>", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageGreaterThan(String value) {
            addCriterion("user_image >", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageGreaterThanOrEqualTo(String value) {
            addCriterion("user_image >=", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageLessThan(String value) {
            addCriterion("user_image <", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageLessThanOrEqualTo(String value) {
            addCriterion("user_image <=", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageLike(String value) {
            addCriterion("user_image like", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageNotLike(String value) {
            addCriterion("user_image not like", value, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageIn(List<String> values) {
            addCriterion("user_image in", values, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageNotIn(List<String> values) {
            addCriterion("user_image not in", values, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageBetween(String value1, String value2) {
            addCriterion("user_image between", value1, value2, "userImage");
            return (Criteria) this;
        }

        public Criteria andUserImageNotBetween(String value1, String value2) {
            addCriterion("user_image not between", value1, value2, "userImage");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAuthLevelIsNull() {
            addCriterion("auth_level is null");
            return (Criteria) this;
        }

        public Criteria andAuthLevelIsNotNull() {
            addCriterion("auth_level is not null");
            return (Criteria) this;
        }

        public Criteria andAuthLevelEqualTo(Integer value) {
            addCriterion("auth_level =", value, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelNotEqualTo(Integer value) {
            addCriterion("auth_level <>", value, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelGreaterThan(Integer value) {
            addCriterion("auth_level >", value, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_level >=", value, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelLessThan(Integer value) {
            addCriterion("auth_level <", value, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelLessThanOrEqualTo(Integer value) {
            addCriterion("auth_level <=", value, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelIn(List<Integer> values) {
            addCriterion("auth_level in", values, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelNotIn(List<Integer> values) {
            addCriterion("auth_level not in", values, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelBetween(Integer value1, Integer value2) {
            addCriterion("auth_level between", value1, value2, "authLevel");
            return (Criteria) this;
        }

        public Criteria andAuthLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_level not between", value1, value2, "authLevel");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceIsNull() {
            addCriterion("position_province is null");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceIsNotNull() {
            addCriterion("position_province is not null");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceEqualTo(Integer value) {
            addCriterion("position_province =", value, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceNotEqualTo(Integer value) {
            addCriterion("position_province <>", value, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceGreaterThan(Integer value) {
            addCriterion("position_province >", value, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_province >=", value, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceLessThan(Integer value) {
            addCriterion("position_province <", value, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("position_province <=", value, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceIn(List<Integer> values) {
            addCriterion("position_province in", values, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceNotIn(List<Integer> values) {
            addCriterion("position_province not in", values, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceBetween(Integer value1, Integer value2) {
            addCriterion("position_province between", value1, value2, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("position_province not between", value1, value2, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionCityIsNull() {
            addCriterion("position_city is null");
            return (Criteria) this;
        }

        public Criteria andPositionCityIsNotNull() {
            addCriterion("position_city is not null");
            return (Criteria) this;
        }

        public Criteria andPositionCityEqualTo(Integer value) {
            addCriterion("position_city =", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityNotEqualTo(Integer value) {
            addCriterion("position_city <>", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityGreaterThan(Integer value) {
            addCriterion("position_city >", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_city >=", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityLessThan(Integer value) {
            addCriterion("position_city <", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityLessThanOrEqualTo(Integer value) {
            addCriterion("position_city <=", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityIn(List<Integer> values) {
            addCriterion("position_city in", values, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityNotIn(List<Integer> values) {
            addCriterion("position_city not in", values, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityBetween(Integer value1, Integer value2) {
            addCriterion("position_city between", value1, value2, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityNotBetween(Integer value1, Integer value2) {
            addCriterion("position_city not between", value1, value2, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionDetailIsNull() {
            addCriterion("position_detail is null");
            return (Criteria) this;
        }

        public Criteria andPositionDetailIsNotNull() {
            addCriterion("position_detail is not null");
            return (Criteria) this;
        }

        public Criteria andPositionDetailEqualTo(String value) {
            addCriterion("position_detail =", value, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailNotEqualTo(String value) {
            addCriterion("position_detail <>", value, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailGreaterThan(String value) {
            addCriterion("position_detail >", value, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailGreaterThanOrEqualTo(String value) {
            addCriterion("position_detail >=", value, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailLessThan(String value) {
            addCriterion("position_detail <", value, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailLessThanOrEqualTo(String value) {
            addCriterion("position_detail <=", value, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailLike(String value) {
            addCriterion("position_detail like", value, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailNotLike(String value) {
            addCriterion("position_detail not like", value, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailIn(List<String> values) {
            addCriterion("position_detail in", values, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailNotIn(List<String> values) {
            addCriterion("position_detail not in", values, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailBetween(String value1, String value2) {
            addCriterion("position_detail between", value1, value2, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andPositionDetailNotBetween(String value1, String value2) {
            addCriterion("position_detail not between", value1, value2, "positionDetail");
            return (Criteria) this;
        }

        public Criteria andChildNameIsNull() {
            addCriterion("child_name is null");
            return (Criteria) this;
        }

        public Criteria andChildNameIsNotNull() {
            addCriterion("child_name is not null");
            return (Criteria) this;
        }

        public Criteria andChildNameEqualTo(String value) {
            addCriterion("child_name =", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameNotEqualTo(String value) {
            addCriterion("child_name <>", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameGreaterThan(String value) {
            addCriterion("child_name >", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameGreaterThanOrEqualTo(String value) {
            addCriterion("child_name >=", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameLessThan(String value) {
            addCriterion("child_name <", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameLessThanOrEqualTo(String value) {
            addCriterion("child_name <=", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameLike(String value) {
            addCriterion("child_name like", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameNotLike(String value) {
            addCriterion("child_name not like", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameIn(List<String> values) {
            addCriterion("child_name in", values, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameNotIn(List<String> values) {
            addCriterion("child_name not in", values, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameBetween(String value1, String value2) {
            addCriterion("child_name between", value1, value2, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameNotBetween(String value1, String value2) {
            addCriterion("child_name not between", value1, value2, "childName");
            return (Criteria) this;
        }

        public Criteria andChildAgeIsNull() {
            addCriterion("child_age is null");
            return (Criteria) this;
        }

        public Criteria andChildAgeIsNotNull() {
            addCriterion("child_age is not null");
            return (Criteria) this;
        }

        public Criteria andChildAgeEqualTo(Integer value) {
            addCriterion("child_age =", value, "childAge");
            return (Criteria) this;
        }

        public Criteria andChildAgeNotEqualTo(Integer value) {
            addCriterion("child_age <>", value, "childAge");
            return (Criteria) this;
        }

        public Criteria andChildAgeGreaterThan(Integer value) {
            addCriterion("child_age >", value, "childAge");
            return (Criteria) this;
        }

        public Criteria andChildAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_age >=", value, "childAge");
            return (Criteria) this;
        }

        public Criteria andChildAgeLessThan(Integer value) {
            addCriterion("child_age <", value, "childAge");
            return (Criteria) this;
        }

        public Criteria andChildAgeLessThanOrEqualTo(Integer value) {
            addCriterion("child_age <=", value, "childAge");
            return (Criteria) this;
        }

        public Criteria andChildAgeIn(List<Integer> values) {
            addCriterion("child_age in", values, "childAge");
            return (Criteria) this;
        }

        public Criteria andChildAgeNotIn(List<Integer> values) {
            addCriterion("child_age not in", values, "childAge");
            return (Criteria) this;
        }

        public Criteria andChildAgeBetween(Integer value1, Integer value2) {
            addCriterion("child_age between", value1, value2, "childAge");
            return (Criteria) this;
        }

        public Criteria andChildAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("child_age not between", value1, value2, "childAge");
            return (Criteria) this;
        }

        public Criteria andChildSexIsNull() {
            addCriterion("child_sex is null");
            return (Criteria) this;
        }

        public Criteria andChildSexIsNotNull() {
            addCriterion("child_sex is not null");
            return (Criteria) this;
        }

        public Criteria andChildSexEqualTo(Integer value) {
            addCriterion("child_sex =", value, "childSex");
            return (Criteria) this;
        }

        public Criteria andChildSexNotEqualTo(Integer value) {
            addCriterion("child_sex <>", value, "childSex");
            return (Criteria) this;
        }

        public Criteria andChildSexGreaterThan(Integer value) {
            addCriterion("child_sex >", value, "childSex");
            return (Criteria) this;
        }

        public Criteria andChildSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("child_sex >=", value, "childSex");
            return (Criteria) this;
        }

        public Criteria andChildSexLessThan(Integer value) {
            addCriterion("child_sex <", value, "childSex");
            return (Criteria) this;
        }

        public Criteria andChildSexLessThanOrEqualTo(Integer value) {
            addCriterion("child_sex <=", value, "childSex");
            return (Criteria) this;
        }

        public Criteria andChildSexIn(List<Integer> values) {
            addCriterion("child_sex in", values, "childSex");
            return (Criteria) this;
        }

        public Criteria andChildSexNotIn(List<Integer> values) {
            addCriterion("child_sex not in", values, "childSex");
            return (Criteria) this;
        }

        public Criteria andChildSexBetween(Integer value1, Integer value2) {
            addCriterion("child_sex between", value1, value2, "childSex");
            return (Criteria) this;
        }

        public Criteria andChildSexNotBetween(Integer value1, Integer value2) {
            addCriterion("child_sex not between", value1, value2, "childSex");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNull() {
            addCriterion("capital is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNotNull() {
            addCriterion("capital is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalEqualTo(Integer value) {
            addCriterion("capital =", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotEqualTo(Integer value) {
            addCriterion("capital <>", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThan(Integer value) {
            addCriterion("capital >", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(Integer value) {
            addCriterion("capital >=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThan(Integer value) {
            addCriterion("capital <", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThanOrEqualTo(Integer value) {
            addCriterion("capital <=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalIn(List<Integer> values) {
            addCriterion("capital in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotIn(List<Integer> values) {
            addCriterion("capital not in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBetween(Integer value1, Integer value2) {
            addCriterion("capital between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotBetween(Integer value1, Integer value2) {
            addCriterion("capital not between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andFrozenCapitalIsNull() {
            addCriterion("frozen_capital is null");
            return (Criteria) this;
        }

        public Criteria andFrozenCapitalIsNotNull() {
            addCriterion("frozen_capital is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenCapitalEqualTo(Integer value) {
            addCriterion("frozen_capital =", value, "frozenCapital");
            return (Criteria) this;
        }

        public Criteria andFrozenCapitalNotEqualTo(Integer value) {
            addCriterion("frozen_capital <>", value, "frozenCapital");
            return (Criteria) this;
        }

        public Criteria andFrozenCapitalGreaterThan(Integer value) {
            addCriterion("frozen_capital >", value, "frozenCapital");
            return (Criteria) this;
        }

        public Criteria andFrozenCapitalGreaterThanOrEqualTo(Integer value) {
            addCriterion("frozen_capital >=", value, "frozenCapital");
            return (Criteria) this;
        }

        public Criteria andFrozenCapitalLessThan(Integer value) {
            addCriterion("frozen_capital <", value, "frozenCapital");
            return (Criteria) this;
        }

        public Criteria andFrozenCapitalLessThanOrEqualTo(Integer value) {
            addCriterion("frozen_capital <=", value, "frozenCapital");
            return (Criteria) this;
        }

        public Criteria andFrozenCapitalIn(List<Integer> values) {
            addCriterion("frozen_capital in", values, "frozenCapital");
            return (Criteria) this;
        }

        public Criteria andFrozenCapitalNotIn(List<Integer> values) {
            addCriterion("frozen_capital not in", values, "frozenCapital");
            return (Criteria) this;
        }

        public Criteria andFrozenCapitalBetween(Integer value1, Integer value2) {
            addCriterion("frozen_capital between", value1, value2, "frozenCapital");
            return (Criteria) this;
        }

        public Criteria andFrozenCapitalNotBetween(Integer value1, Integer value2) {
            addCriterion("frozen_capital not between", value1, value2, "frozenCapital");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNull() {
            addCriterion("visible is null");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNotNull() {
            addCriterion("visible is not null");
            return (Criteria) this;
        }

        public Criteria andVisibleEqualTo(Integer value) {
            addCriterion("visible =", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotEqualTo(Integer value) {
            addCriterion("visible <>", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThan(Integer value) {
            addCriterion("visible >", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThanOrEqualTo(Integer value) {
            addCriterion("visible >=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThan(Integer value) {
            addCriterion("visible <", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThanOrEqualTo(Integer value) {
            addCriterion("visible <=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleIn(List<Integer> values) {
            addCriterion("visible in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotIn(List<Integer> values) {
            addCriterion("visible not in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleBetween(Integer value1, Integer value2) {
            addCriterion("visible between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotBetween(Integer value1, Integer value2) {
            addCriterion("visible not between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIsNull() {
            addCriterion("auth_time is null");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIsNotNull() {
            addCriterion("auth_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTimeEqualTo(Date value) {
            addCriterion("auth_time =", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotEqualTo(Date value) {
            addCriterion("auth_time <>", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeGreaterThan(Date value) {
            addCriterion("auth_time >", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auth_time >=", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeLessThan(Date value) {
            addCriterion("auth_time <", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeLessThanOrEqualTo(Date value) {
            addCriterion("auth_time <=", value, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeIn(List<Date> values) {
            addCriterion("auth_time in", values, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotIn(List<Date> values) {
            addCriterion("auth_time not in", values, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeBetween(Date value1, Date value2) {
            addCriterion("auth_time between", value1, value2, "authTime");
            return (Criteria) this;
        }

        public Criteria andAuthTimeNotBetween(Date value1, Date value2) {
            addCriterion("auth_time not between", value1, value2, "authTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}