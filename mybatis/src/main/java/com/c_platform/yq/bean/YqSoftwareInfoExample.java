package com.c_platform.yq.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.javaw.mybatis.generator.Page;

public class YqSoftwareInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public YqSoftwareInfoExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVerCodeIsNull() {
            addCriterion("VER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVerCodeIsNotNull() {
            addCriterion("VER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVerCodeEqualTo(Long value) {
            addCriterion("VER_CODE =", value, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeNotEqualTo(Long value) {
            addCriterion("VER_CODE <>", value, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeGreaterThan(Long value) {
            addCriterion("VER_CODE >", value, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("VER_CODE >=", value, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeLessThan(Long value) {
            addCriterion("VER_CODE <", value, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeLessThanOrEqualTo(Long value) {
            addCriterion("VER_CODE <=", value, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeIn(List<Long> values) {
            addCriterion("VER_CODE in", values, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeNotIn(List<Long> values) {
            addCriterion("VER_CODE not in", values, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeBetween(Long value1, Long value2) {
            addCriterion("VER_CODE between", value1, value2, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerCodeNotBetween(Long value1, Long value2) {
            addCriterion("VER_CODE not between", value1, value2, "verCode");
            return (Criteria) this;
        }

        public Criteria andVerNameIsNull() {
            addCriterion("VER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVerNameIsNotNull() {
            addCriterion("VER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVerNameEqualTo(String value) {
            addCriterion("VER_NAME =", value, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameNotEqualTo(String value) {
            addCriterion("VER_NAME <>", value, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameGreaterThan(String value) {
            addCriterion("VER_NAME >", value, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameGreaterThanOrEqualTo(String value) {
            addCriterion("VER_NAME >=", value, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameLessThan(String value) {
            addCriterion("VER_NAME <", value, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameLessThanOrEqualTo(String value) {
            addCriterion("VER_NAME <=", value, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameLike(String value) {
            addCriterion("VER_NAME like", value, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameNotLike(String value) {
            addCriterion("VER_NAME not like", value, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameIn(List<String> values) {
            addCriterion("VER_NAME in", values, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameNotIn(List<String> values) {
            addCriterion("VER_NAME not in", values, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameBetween(String value1, String value2) {
            addCriterion("VER_NAME between", value1, value2, "verName");
            return (Criteria) this;
        }

        public Criteria andVerNameNotBetween(String value1, String value2) {
            addCriterion("VER_NAME not between", value1, value2, "verName");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlIsNull() {
            addCriterion("UPDATE_URL is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlIsNotNull() {
            addCriterion("UPDATE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlEqualTo(String value) {
            addCriterion("UPDATE_URL =", value, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlNotEqualTo(String value) {
            addCriterion("UPDATE_URL <>", value, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlGreaterThan(String value) {
            addCriterion("UPDATE_URL >", value, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_URL >=", value, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlLessThan(String value) {
            addCriterion("UPDATE_URL <", value, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_URL <=", value, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlLike(String value) {
            addCriterion("UPDATE_URL like", value, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlNotLike(String value) {
            addCriterion("UPDATE_URL not like", value, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlIn(List<String> values) {
            addCriterion("UPDATE_URL in", values, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlNotIn(List<String> values) {
            addCriterion("UPDATE_URL not in", values, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlBetween(String value1, String value2) {
            addCriterion("UPDATE_URL between", value1, value2, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andUpdateUrlNotBetween(String value1, String value2) {
            addCriterion("UPDATE_URL not between", value1, value2, "updateUrl");
            return (Criteria) this;
        }

        public Criteria andForceIsNull() {
            addCriterion("FORCE is null");
            return (Criteria) this;
        }

        public Criteria andForceIsNotNull() {
            addCriterion("FORCE is not null");
            return (Criteria) this;
        }

        public Criteria andForceEqualTo(Integer value) {
            addCriterion("FORCE =", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceNotEqualTo(Integer value) {
            addCriterion("FORCE <>", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceGreaterThan(Integer value) {
            addCriterion("FORCE >", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceGreaterThanOrEqualTo(Integer value) {
            addCriterion("FORCE >=", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceLessThan(Integer value) {
            addCriterion("FORCE <", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceLessThanOrEqualTo(Integer value) {
            addCriterion("FORCE <=", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceIn(List<Integer> values) {
            addCriterion("FORCE in", values, "force");
            return (Criteria) this;
        }

        public Criteria andForceNotIn(List<Integer> values) {
            addCriterion("FORCE not in", values, "force");
            return (Criteria) this;
        }

        public Criteria andForceBetween(Integer value1, Integer value2) {
            addCriterion("FORCE between", value1, value2, "force");
            return (Criteria) this;
        }

        public Criteria andForceNotBetween(Integer value1, Integer value2) {
            addCriterion("FORCE not between", value1, value2, "force");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("IS_ACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("IS_ACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Integer value) {
            addCriterion("IS_ACTIVE =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Integer value) {
            addCriterion("IS_ACTIVE <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Integer value) {
            addCriterion("IS_ACTIVE >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_ACTIVE >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Integer value) {
            addCriterion("IS_ACTIVE <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Integer value) {
            addCriterion("IS_ACTIVE <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Integer> values) {
            addCriterion("IS_ACTIVE in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Integer> values) {
            addCriterion("IS_ACTIVE not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Integer value1, Integer value2) {
            addCriterion("IS_ACTIVE between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_ACTIVE not between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andApkHashIsNull() {
            addCriterion("APK_HASH is null");
            return (Criteria) this;
        }

        public Criteria andApkHashIsNotNull() {
            addCriterion("APK_HASH is not null");
            return (Criteria) this;
        }

        public Criteria andApkHashEqualTo(String value) {
            addCriterion("APK_HASH =", value, "apkHash");
            return (Criteria) this;
        }

        public Criteria andApkHashNotEqualTo(String value) {
            addCriterion("APK_HASH <>", value, "apkHash");
            return (Criteria) this;
        }

        public Criteria andApkHashGreaterThan(String value) {
            addCriterion("APK_HASH >", value, "apkHash");
            return (Criteria) this;
        }

        public Criteria andApkHashGreaterThanOrEqualTo(String value) {
            addCriterion("APK_HASH >=", value, "apkHash");
            return (Criteria) this;
        }

        public Criteria andApkHashLessThan(String value) {
            addCriterion("APK_HASH <", value, "apkHash");
            return (Criteria) this;
        }

        public Criteria andApkHashLessThanOrEqualTo(String value) {
            addCriterion("APK_HASH <=", value, "apkHash");
            return (Criteria) this;
        }

        public Criteria andApkHashLike(String value) {
            addCriterion("APK_HASH like", value, "apkHash");
            return (Criteria) this;
        }

        public Criteria andApkHashNotLike(String value) {
            addCriterion("APK_HASH not like", value, "apkHash");
            return (Criteria) this;
        }

        public Criteria andApkHashIn(List<String> values) {
            addCriterion("APK_HASH in", values, "apkHash");
            return (Criteria) this;
        }

        public Criteria andApkHashNotIn(List<String> values) {
            addCriterion("APK_HASH not in", values, "apkHash");
            return (Criteria) this;
        }

        public Criteria andApkHashBetween(String value1, String value2) {
            addCriterion("APK_HASH between", value1, value2, "apkHash");
            return (Criteria) this;
        }

        public Criteria andApkHashNotBetween(String value1, String value2) {
            addCriterion("APK_HASH not between", value1, value2, "apkHash");
            return (Criteria) this;
        }

        public Criteria andApkSizeIsNull() {
            addCriterion("APK_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andApkSizeIsNotNull() {
            addCriterion("APK_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andApkSizeEqualTo(Long value) {
            addCriterion("APK_SIZE =", value, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeNotEqualTo(Long value) {
            addCriterion("APK_SIZE <>", value, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeGreaterThan(Long value) {
            addCriterion("APK_SIZE >", value, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("APK_SIZE >=", value, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeLessThan(Long value) {
            addCriterion("APK_SIZE <", value, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeLessThanOrEqualTo(Long value) {
            addCriterion("APK_SIZE <=", value, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeIn(List<Long> values) {
            addCriterion("APK_SIZE in", values, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeNotIn(List<Long> values) {
            addCriterion("APK_SIZE not in", values, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeBetween(Long value1, Long value2) {
            addCriterion("APK_SIZE between", value1, value2, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeNotBetween(Long value1, Long value2) {
            addCriterion("APK_SIZE not between", value1, value2, "apkSize");
            return (Criteria) this;
        }

        public Criteria andUpgradeContentIsNull() {
            addCriterion("UPGRADE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeContentIsNotNull() {
            addCriterion("UPGRADE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeContentEqualTo(String value) {
            addCriterion("UPGRADE_CONTENT =", value, "upgradeContent");
            return (Criteria) this;
        }

        public Criteria andUpgradeContentNotEqualTo(String value) {
            addCriterion("UPGRADE_CONTENT <>", value, "upgradeContent");
            return (Criteria) this;
        }

        public Criteria andUpgradeContentGreaterThan(String value) {
            addCriterion("UPGRADE_CONTENT >", value, "upgradeContent");
            return (Criteria) this;
        }

        public Criteria andUpgradeContentGreaterThanOrEqualTo(String value) {
            addCriterion("UPGRADE_CONTENT >=", value, "upgradeContent");
            return (Criteria) this;
        }

        public Criteria andUpgradeContentLessThan(String value) {
            addCriterion("UPGRADE_CONTENT <", value, "upgradeContent");
            return (Criteria) this;
        }

        public Criteria andUpgradeContentLessThanOrEqualTo(String value) {
            addCriterion("UPGRADE_CONTENT <=", value, "upgradeContent");
            return (Criteria) this;
        }

        public Criteria andUpgradeContentLike(String value) {
            addCriterion("UPGRADE_CONTENT like", value, "upgradeContent");
            return (Criteria) this;
        }

        public Criteria andUpgradeContentNotLike(String value) {
            addCriterion("UPGRADE_CONTENT not like", value, "upgradeContent");
            return (Criteria) this;
        }

        public Criteria andUpgradeContentIn(List<String> values) {
            addCriterion("UPGRADE_CONTENT in", values, "upgradeContent");
            return (Criteria) this;
        }

        public Criteria andUpgradeContentNotIn(List<String> values) {
            addCriterion("UPGRADE_CONTENT not in", values, "upgradeContent");
            return (Criteria) this;
        }

        public Criteria andUpgradeContentBetween(String value1, String value2) {
            addCriterion("UPGRADE_CONTENT between", value1, value2, "upgradeContent");
            return (Criteria) this;
        }

        public Criteria andUpgradeContentNotBetween(String value1, String value2) {
            addCriterion("UPGRADE_CONTENT not between", value1, value2, "upgradeContent");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNull() {
            addCriterion("IS_ENABLE is null");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNotNull() {
            addCriterion("IS_ENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnableEqualTo(Integer value) {
            addCriterion("IS_ENABLE =", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotEqualTo(Integer value) {
            addCriterion("IS_ENABLE <>", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThan(Integer value) {
            addCriterion("IS_ENABLE >", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_ENABLE >=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThan(Integer value) {
            addCriterion("IS_ENABLE <", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThanOrEqualTo(Integer value) {
            addCriterion("IS_ENABLE <=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableIn(List<Integer> values) {
            addCriterion("IS_ENABLE in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotIn(List<Integer> values) {
            addCriterion("IS_ENABLE not in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableBetween(Integer value1, Integer value2) {
            addCriterion("IS_ENABLE between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_ENABLE not between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNull() {
            addCriterion("CLIENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNotNull() {
            addCriterion("CLIENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(String value) {
            addCriterion("CLIENT_TYPE =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotEqualTo(String value) {
            addCriterion("CLIENT_TYPE <>", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThan(String value) {
            addCriterion("CLIENT_TYPE >", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_TYPE >=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThan(String value) {
            addCriterion("CLIENT_TYPE <", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_TYPE <=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLike(String value) {
            addCriterion("CLIENT_TYPE like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotLike(String value) {
            addCriterion("CLIENT_TYPE not like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeIn(List<String> values) {
            addCriterion("CLIENT_TYPE in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotIn(List<String> values) {
            addCriterion("CLIENT_TYPE not in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeBetween(String value1, String value2) {
            addCriterion("CLIENT_TYPE between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotBetween(String value1, String value2) {
            addCriterion("CLIENT_TYPE not between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andUpgradeTipIsNull() {
            addCriterion("UPGRADE_TIP is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeTipIsNotNull() {
            addCriterion("UPGRADE_TIP is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeTipEqualTo(String value) {
            addCriterion("UPGRADE_TIP =", value, "upgradeTip");
            return (Criteria) this;
        }

        public Criteria andUpgradeTipNotEqualTo(String value) {
            addCriterion("UPGRADE_TIP <>", value, "upgradeTip");
            return (Criteria) this;
        }

        public Criteria andUpgradeTipGreaterThan(String value) {
            addCriterion("UPGRADE_TIP >", value, "upgradeTip");
            return (Criteria) this;
        }

        public Criteria andUpgradeTipGreaterThanOrEqualTo(String value) {
            addCriterion("UPGRADE_TIP >=", value, "upgradeTip");
            return (Criteria) this;
        }

        public Criteria andUpgradeTipLessThan(String value) {
            addCriterion("UPGRADE_TIP <", value, "upgradeTip");
            return (Criteria) this;
        }

        public Criteria andUpgradeTipLessThanOrEqualTo(String value) {
            addCriterion("UPGRADE_TIP <=", value, "upgradeTip");
            return (Criteria) this;
        }

        public Criteria andUpgradeTipLike(String value) {
            addCriterion("UPGRADE_TIP like", value, "upgradeTip");
            return (Criteria) this;
        }

        public Criteria andUpgradeTipNotLike(String value) {
            addCriterion("UPGRADE_TIP not like", value, "upgradeTip");
            return (Criteria) this;
        }

        public Criteria andUpgradeTipIn(List<String> values) {
            addCriterion("UPGRADE_TIP in", values, "upgradeTip");
            return (Criteria) this;
        }

        public Criteria andUpgradeTipNotIn(List<String> values) {
            addCriterion("UPGRADE_TIP not in", values, "upgradeTip");
            return (Criteria) this;
        }

        public Criteria andUpgradeTipBetween(String value1, String value2) {
            addCriterion("UPGRADE_TIP between", value1, value2, "upgradeTip");
            return (Criteria) this;
        }

        public Criteria andUpgradeTipNotBetween(String value1, String value2) {
            addCriterion("UPGRADE_TIP not between", value1, value2, "upgradeTip");
            return (Criteria) this;
        }

        public Criteria andNotificationTipIsNull() {
            addCriterion("NOTIFICATION_TIP is null");
            return (Criteria) this;
        }

        public Criteria andNotificationTipIsNotNull() {
            addCriterion("NOTIFICATION_TIP is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationTipEqualTo(String value) {
            addCriterion("NOTIFICATION_TIP =", value, "notificationTip");
            return (Criteria) this;
        }

        public Criteria andNotificationTipNotEqualTo(String value) {
            addCriterion("NOTIFICATION_TIP <>", value, "notificationTip");
            return (Criteria) this;
        }

        public Criteria andNotificationTipGreaterThan(String value) {
            addCriterion("NOTIFICATION_TIP >", value, "notificationTip");
            return (Criteria) this;
        }

        public Criteria andNotificationTipGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFICATION_TIP >=", value, "notificationTip");
            return (Criteria) this;
        }

        public Criteria andNotificationTipLessThan(String value) {
            addCriterion("NOTIFICATION_TIP <", value, "notificationTip");
            return (Criteria) this;
        }

        public Criteria andNotificationTipLessThanOrEqualTo(String value) {
            addCriterion("NOTIFICATION_TIP <=", value, "notificationTip");
            return (Criteria) this;
        }

        public Criteria andNotificationTipLike(String value) {
            addCriterion("NOTIFICATION_TIP like", value, "notificationTip");
            return (Criteria) this;
        }

        public Criteria andNotificationTipNotLike(String value) {
            addCriterion("NOTIFICATION_TIP not like", value, "notificationTip");
            return (Criteria) this;
        }

        public Criteria andNotificationTipIn(List<String> values) {
            addCriterion("NOTIFICATION_TIP in", values, "notificationTip");
            return (Criteria) this;
        }

        public Criteria andNotificationTipNotIn(List<String> values) {
            addCriterion("NOTIFICATION_TIP not in", values, "notificationTip");
            return (Criteria) this;
        }

        public Criteria andNotificationTipBetween(String value1, String value2) {
            addCriterion("NOTIFICATION_TIP between", value1, value2, "notificationTip");
            return (Criteria) this;
        }

        public Criteria andNotificationTipNotBetween(String value1, String value2) {
            addCriterion("NOTIFICATION_TIP not between", value1, value2, "notificationTip");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUidIsNull() {
            addCriterion("UPDATE_UID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUidIsNotNull() {
            addCriterion("UPDATE_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUidEqualTo(Long value) {
            addCriterion("UPDATE_UID =", value, "updateUid");
            return (Criteria) this;
        }

        public Criteria andUpdateUidNotEqualTo(Long value) {
            addCriterion("UPDATE_UID <>", value, "updateUid");
            return (Criteria) this;
        }

        public Criteria andUpdateUidGreaterThan(Long value) {
            addCriterion("UPDATE_UID >", value, "updateUid");
            return (Criteria) this;
        }

        public Criteria andUpdateUidGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATE_UID >=", value, "updateUid");
            return (Criteria) this;
        }

        public Criteria andUpdateUidLessThan(Long value) {
            addCriterion("UPDATE_UID <", value, "updateUid");
            return (Criteria) this;
        }

        public Criteria andUpdateUidLessThanOrEqualTo(Long value) {
            addCriterion("UPDATE_UID <=", value, "updateUid");
            return (Criteria) this;
        }

        public Criteria andUpdateUidIn(List<Long> values) {
            addCriterion("UPDATE_UID in", values, "updateUid");
            return (Criteria) this;
        }

        public Criteria andUpdateUidNotIn(List<Long> values) {
            addCriterion("UPDATE_UID not in", values, "updateUid");
            return (Criteria) this;
        }

        public Criteria andUpdateUidBetween(Long value1, Long value2) {
            addCriterion("UPDATE_UID between", value1, value2, "updateUid");
            return (Criteria) this;
        }

        public Criteria andUpdateUidNotBetween(Long value1, Long value2) {
            addCriterion("UPDATE_UID not between", value1, value2, "updateUid");
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