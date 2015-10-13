package com.c_platform.yq.bean;

import java.util.Date;

public class YqSoftwareInfo {
    private Long id;

    private Long verCode;

    private String verName;

    private String updateUrl;

    private Integer force;

    private Integer isActive;

    private String apkHash;

    private Long apkSize;

    private String upgradeContent;

    private Integer isEnable;

    private String clientType;

    private String upgradeTip;

    private String notificationTip;

    private Date createTime;

    private Date updateTime;

    private Long updateUid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVerCode() {
        return verCode;
    }

    public void setVerCode(Long verCode) {
        this.verCode = verCode;
    }

    public String getVerName() {
        return verName;
    }

    public void setVerName(String verName) {
        this.verName = verName;
    }

    public String getUpdateUrl() {
        return updateUrl;
    }

    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl;
    }

    public Integer getForce() {
        return force;
    }

    public void setForce(Integer force) {
        this.force = force;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getApkHash() {
        return apkHash;
    }

    public void setApkHash(String apkHash) {
        this.apkHash = apkHash;
    }

    public Long getApkSize() {
        return apkSize;
    }

    public void setApkSize(Long apkSize) {
        this.apkSize = apkSize;
    }

    public String getUpgradeContent() {
        return upgradeContent;
    }

    public void setUpgradeContent(String upgradeContent) {
        this.upgradeContent = upgradeContent;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getUpgradeTip() {
        return upgradeTip;
    }

    public void setUpgradeTip(String upgradeTip) {
        this.upgradeTip = upgradeTip;
    }

    public String getNotificationTip() {
        return notificationTip;
    }

    public void setNotificationTip(String notificationTip) {
        this.notificationTip = notificationTip;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(Long updateUid) {
        this.updateUid = updateUid;
    }
}