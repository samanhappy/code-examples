package com.dsy.dao.domain.salary;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_social_citydata")
public class SocialCitydata {
    /**
     * 地区ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 地区名称
     */
    private String name;

    /**
     * 社保最高基数
     */
    @Column(name = "social_security_max_base")
    private BigDecimal socialSecurityMaxBase;

    /**
     * 社保最低基数
     */
    @Column(name = "social_security_min_base")
    private BigDecimal socialSecurityMinBase;

    /**
     * 养老保险最高基数
     */
    @Column(name = "ylao_max_base")
    private BigDecimal ylaoMaxBase;

    /**
     * 养老保险最低基数
     */
    @Column(name = "ylao_min_base")
    private BigDecimal ylaoMinBase;

    /**
     * 养老保险企业比例
     */
    @Column(name = "ylao_enterprise_proportion")
    private BigDecimal ylaoEnterpriseProportion;

    /**
     * 养老保险个人比例
     */
    @Column(name = "ylao_personal_proportion")
    private BigDecimal ylaoPersonalProportion;

    /**
     * 医疗保险最高基数
     */
    @Column(name = "yliao_max_base")
    private BigDecimal yliaoMaxBase;

    /**
     * 医疗保险最低基数
     */
    @Column(name = "yliao_min_base")
    private BigDecimal yliaoMinBase;

    /**
     * 医疗保险企业比例
     */
    @Column(name = "yliao_enterprise_proportion")
    private BigDecimal yliaoEnterpriseProportion;

    /**
     * 医疗保险个人比例
     */
    @Column(name = "yliao_personal_proportion")
    private BigDecimal yliaoPersonalProportion;

    /**
     * 失业保险最高基数
     */
    @Column(name = "sye_max_base")
    private BigDecimal syeMaxBase;

    /**
     * 失业保险最低基数
     */
    @Column(name = "sye_min_base")
    private BigDecimal syeMinBase;

    /**
     * 失业保险企业比例
     */
    @Column(name = "sye_enterprise_proportion")
    private BigDecimal syeEnterpriseProportion;

    /**
     * 失业保险个人比例
     */
    @Column(name = "sye_personal_proportion")
    private BigDecimal syePersonalProportion;

    /**
     * 工伤保险最高基数
     */
    @Column(name = "gs_max_base")
    private BigDecimal gsMaxBase;

    /**
     * 工伤保险最低基数
     */
    @Column(name = "gs_min_base")
    private BigDecimal gsMinBase;

    /**
     * 工伤保险企业比例
     */
    @Column(name = "gs_enterprise_proportion")
    private BigDecimal gsEnterpriseProportion;

    /**
     * 工伤保险个人比例
     */
    @Column(name = "gs_personal_proportion")
    private BigDecimal gsPersonalProportion;

    /**
     * 生育保险最高基数
     */
    @Column(name = "syu_max_base")
    private BigDecimal syuMaxBase;

    /**
     * 生育保险最低基数
     */
    @Column(name = "syu_min_base")
    private BigDecimal syuMinBase;

    /**
     * 生育保险企业比例
     */
    @Column(name = "syu_enterprise_proportion")
    private BigDecimal syuEnterpriseProportion;

    /**
     * 生育保险个人比例
     */
    @Column(name = "syu_personal_proportion")
    private BigDecimal syuPersonalProportion;

    /**
     * 大病保险企业支付
     */
    @Column(name = "db_enterprise_payment")
    private BigDecimal dbEnterprisePayment;

    /**
     * 大病保险个人支付
     */
    @Column(name = "db_personal_payment")
    private BigDecimal dbPersonalPayment;

    /**
     * 住房公积金最高基数
     */
    @Column(name = "zf_max_base")
    private BigDecimal zfMaxBase;

    /**
     * 住房公积金最低基数
     */
    @Column(name = "zf_min_base")
    private BigDecimal zfMinBase;

    /**
     * 住房公积金企业比例
     */
    @Column(name = "zf_enterprise_proportion")
    private BigDecimal zfEnterpriseProportion;

    /**
     * 住房公积金个人比例
     */
    @Column(name = "zf_personal_proportion")
    private BigDecimal zfPersonalProportion;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 获取地区ID
     *
     * @return id - 地区ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置地区ID
     *
     * @param id 地区ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取地区名称
     *
     * @return name - 地区名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置地区名称
     *
     * @param name 地区名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取社保最高基数
     *
     * @return social_security_max_base - 社保最高基数
     */
    public BigDecimal getSocialSecurityMaxBase() {
        return socialSecurityMaxBase;
    }

    /**
     * 设置社保最高基数
     *
     * @param socialSecurityMaxBase 社保最高基数
     */
    public void setSocialSecurityMaxBase(BigDecimal socialSecurityMaxBase) {
        this.socialSecurityMaxBase = socialSecurityMaxBase;
    }

    /**
     * 获取社保最低基数
     *
     * @return social_security_min_base - 社保最低基数
     */
    public BigDecimal getSocialSecurityMinBase() {
        return socialSecurityMinBase;
    }

    /**
     * 设置社保最低基数
     *
     * @param socialSecurityMinBase 社保最低基数
     */
    public void setSocialSecurityMinBase(BigDecimal socialSecurityMinBase) {
        this.socialSecurityMinBase = socialSecurityMinBase;
    }

    /**
     * 获取养老保险最高基数
     *
     * @return ylao_max_base - 养老保险最高基数
     */
    public BigDecimal getYlaoMaxBase() {
        return ylaoMaxBase;
    }

    /**
     * 设置养老保险最高基数
     *
     * @param ylaoMaxBase 养老保险最高基数
     */
    public void setYlaoMaxBase(BigDecimal ylaoMaxBase) {
        this.ylaoMaxBase = ylaoMaxBase;
    }

    /**
     * 获取养老保险最低基数
     *
     * @return ylao_min_base - 养老保险最低基数
     */
    public BigDecimal getYlaoMinBase() {
        return ylaoMinBase;
    }

    /**
     * 设置养老保险最低基数
     *
     * @param ylaoMinBase 养老保险最低基数
     */
    public void setYlaoMinBase(BigDecimal ylaoMinBase) {
        this.ylaoMinBase = ylaoMinBase;
    }

    /**
     * 获取养老保险企业比例
     *
     * @return ylao_enterprise_proportion - 养老保险企业比例
     */
    public BigDecimal getYlaoEnterpriseProportion() {
        return ylaoEnterpriseProportion;
    }

    /**
     * 设置养老保险企业比例
     *
     * @param ylaoEnterpriseProportion 养老保险企业比例
     */
    public void setYlaoEnterpriseProportion(BigDecimal ylaoEnterpriseProportion) {
        this.ylaoEnterpriseProportion = ylaoEnterpriseProportion;
    }

    /**
     * 获取养老保险个人比例
     *
     * @return ylao_personal_proportion - 养老保险个人比例
     */
    public BigDecimal getYlaoPersonalProportion() {
        return ylaoPersonalProportion;
    }

    /**
     * 设置养老保险个人比例
     *
     * @param ylaoPersonalProportion 养老保险个人比例
     */
    public void setYlaoPersonalProportion(BigDecimal ylaoPersonalProportion) {
        this.ylaoPersonalProportion = ylaoPersonalProportion;
    }

    /**
     * 获取医疗保险最高基数
     *
     * @return yliao_max_base - 医疗保险最高基数
     */
    public BigDecimal getYliaoMaxBase() {
        return yliaoMaxBase;
    }

    /**
     * 设置医疗保险最高基数
     *
     * @param yliaoMaxBase 医疗保险最高基数
     */
    public void setYliaoMaxBase(BigDecimal yliaoMaxBase) {
        this.yliaoMaxBase = yliaoMaxBase;
    }

    /**
     * 获取医疗保险最低基数
     *
     * @return yliao_min_base - 医疗保险最低基数
     */
    public BigDecimal getYliaoMinBase() {
        return yliaoMinBase;
    }

    /**
     * 设置医疗保险最低基数
     *
     * @param yliaoMinBase 医疗保险最低基数
     */
    public void setYliaoMinBase(BigDecimal yliaoMinBase) {
        this.yliaoMinBase = yliaoMinBase;
    }

    /**
     * 获取医疗保险企业比例
     *
     * @return yliao_enterprise_proportion - 医疗保险企业比例
     */
    public BigDecimal getYliaoEnterpriseProportion() {
        return yliaoEnterpriseProportion;
    }

    /**
     * 设置医疗保险企业比例
     *
     * @param yliaoEnterpriseProportion 医疗保险企业比例
     */
    public void setYliaoEnterpriseProportion(BigDecimal yliaoEnterpriseProportion) {
        this.yliaoEnterpriseProportion = yliaoEnterpriseProportion;
    }

    /**
     * 获取医疗保险个人比例
     *
     * @return yliao_personal_proportion - 医疗保险个人比例
     */
    public BigDecimal getYliaoPersonalProportion() {
        return yliaoPersonalProportion;
    }

    /**
     * 设置医疗保险个人比例
     *
     * @param yliaoPersonalProportion 医疗保险个人比例
     */
    public void setYliaoPersonalProportion(BigDecimal yliaoPersonalProportion) {
        this.yliaoPersonalProportion = yliaoPersonalProportion;
    }

    /**
     * 获取失业保险最高基数
     *
     * @return sye_max_base - 失业保险最高基数
     */
    public BigDecimal getSyeMaxBase() {
        return syeMaxBase;
    }

    /**
     * 设置失业保险最高基数
     *
     * @param syeMaxBase 失业保险最高基数
     */
    public void setSyeMaxBase(BigDecimal syeMaxBase) {
        this.syeMaxBase = syeMaxBase;
    }

    /**
     * 获取失业保险最低基数
     *
     * @return sye_min_base - 失业保险最低基数
     */
    public BigDecimal getSyeMinBase() {
        return syeMinBase;
    }

    /**
     * 设置失业保险最低基数
     *
     * @param syeMinBase 失业保险最低基数
     */
    public void setSyeMinBase(BigDecimal syeMinBase) {
        this.syeMinBase = syeMinBase;
    }

    /**
     * 获取失业保险企业比例
     *
     * @return sye_enterprise_proportion - 失业保险企业比例
     */
    public BigDecimal getSyeEnterpriseProportion() {
        return syeEnterpriseProportion;
    }

    /**
     * 设置失业保险企业比例
     *
     * @param syeEnterpriseProportion 失业保险企业比例
     */
    public void setSyeEnterpriseProportion(BigDecimal syeEnterpriseProportion) {
        this.syeEnterpriseProportion = syeEnterpriseProportion;
    }

    /**
     * 获取失业保险个人比例
     *
     * @return sye_personal_proportion - 失业保险个人比例
     */
    public BigDecimal getSyePersonalProportion() {
        return syePersonalProportion;
    }

    /**
     * 设置失业保险个人比例
     *
     * @param syePersonalProportion 失业保险个人比例
     */
    public void setSyePersonalProportion(BigDecimal syePersonalProportion) {
        this.syePersonalProportion = syePersonalProportion;
    }

    /**
     * 获取工伤保险最高基数
     *
     * @return gs_max_base - 工伤保险最高基数
     */
    public BigDecimal getGsMaxBase() {
        return gsMaxBase;
    }

    /**
     * 设置工伤保险最高基数
     *
     * @param gsMaxBase 工伤保险最高基数
     */
    public void setGsMaxBase(BigDecimal gsMaxBase) {
        this.gsMaxBase = gsMaxBase;
    }

    /**
     * 获取工伤保险最低基数
     *
     * @return gs_min_base - 工伤保险最低基数
     */
    public BigDecimal getGsMinBase() {
        return gsMinBase;
    }

    /**
     * 设置工伤保险最低基数
     *
     * @param gsMinBase 工伤保险最低基数
     */
    public void setGsMinBase(BigDecimal gsMinBase) {
        this.gsMinBase = gsMinBase;
    }

    /**
     * 获取工伤保险企业比例
     *
     * @return gs_enterprise_proportion - 工伤保险企业比例
     */
    public BigDecimal getGsEnterpriseProportion() {
        return gsEnterpriseProportion;
    }

    /**
     * 设置工伤保险企业比例
     *
     * @param gsEnterpriseProportion 工伤保险企业比例
     */
    public void setGsEnterpriseProportion(BigDecimal gsEnterpriseProportion) {
        this.gsEnterpriseProportion = gsEnterpriseProportion;
    }

    /**
     * 获取工伤保险个人比例
     *
     * @return gs_personal_proportion - 工伤保险个人比例
     */
    public BigDecimal getGsPersonalProportion() {
        return gsPersonalProportion;
    }

    /**
     * 设置工伤保险个人比例
     *
     * @param gsPersonalProportion 工伤保险个人比例
     */
    public void setGsPersonalProportion(BigDecimal gsPersonalProportion) {
        this.gsPersonalProportion = gsPersonalProportion;
    }

    /**
     * 获取生育保险最高基数
     *
     * @return syu_max_base - 生育保险最高基数
     */
    public BigDecimal getSyuMaxBase() {
        return syuMaxBase;
    }

    /**
     * 设置生育保险最高基数
     *
     * @param syuMaxBase 生育保险最高基数
     */
    public void setSyuMaxBase(BigDecimal syuMaxBase) {
        this.syuMaxBase = syuMaxBase;
    }

    /**
     * 获取生育保险最低基数
     *
     * @return syu_min_base - 生育保险最低基数
     */
    public BigDecimal getSyuMinBase() {
        return syuMinBase;
    }

    /**
     * 设置生育保险最低基数
     *
     * @param syuMinBase 生育保险最低基数
     */
    public void setSyuMinBase(BigDecimal syuMinBase) {
        this.syuMinBase = syuMinBase;
    }

    /**
     * 获取生育保险企业比例
     *
     * @return syu_enterprise_proportion - 生育保险企业比例
     */
    public BigDecimal getSyuEnterpriseProportion() {
        return syuEnterpriseProportion;
    }

    /**
     * 设置生育保险企业比例
     *
     * @param syuEnterpriseProportion 生育保险企业比例
     */
    public void setSyuEnterpriseProportion(BigDecimal syuEnterpriseProportion) {
        this.syuEnterpriseProportion = syuEnterpriseProportion;
    }

    /**
     * 获取生育保险个人比例
     *
     * @return syu_personal_proportion - 生育保险个人比例
     */
    public BigDecimal getSyuPersonalProportion() {
        return syuPersonalProportion;
    }

    /**
     * 设置生育保险个人比例
     *
     * @param syuPersonalProportion 生育保险个人比例
     */
    public void setSyuPersonalProportion(BigDecimal syuPersonalProportion) {
        this.syuPersonalProportion = syuPersonalProportion;
    }

    /**
     * 获取大病保险企业支付
     *
     * @return db_enterprise_payment - 大病保险企业支付
     */
    public BigDecimal getDbEnterprisePayment() {
        return dbEnterprisePayment;
    }

    /**
     * 设置大病保险企业支付
     *
     * @param dbEnterprisePayment 大病保险企业支付
     */
    public void setDbEnterprisePayment(BigDecimal dbEnterprisePayment) {
        this.dbEnterprisePayment = dbEnterprisePayment;
    }

    /**
     * 获取大病保险个人支付
     *
     * @return db_personal_payment - 大病保险个人支付
     */
    public BigDecimal getDbPersonalPayment() {
        return dbPersonalPayment;
    }

    /**
     * 设置大病保险个人支付
     *
     * @param dbPersonalPayment 大病保险个人支付
     */
    public void setDbPersonalPayment(BigDecimal dbPersonalPayment) {
        this.dbPersonalPayment = dbPersonalPayment;
    }

    /**
     * 获取住房公积金最高基数
     *
     * @return zf_max_base - 住房公积金最高基数
     */
    public BigDecimal getZfMaxBase() {
        return zfMaxBase;
    }

    /**
     * 设置住房公积金最高基数
     *
     * @param zfMaxBase 住房公积金最高基数
     */
    public void setZfMaxBase(BigDecimal zfMaxBase) {
        this.zfMaxBase = zfMaxBase;
    }

    /**
     * 获取住房公积金最低基数
     *
     * @return zf_min_base - 住房公积金最低基数
     */
    public BigDecimal getZfMinBase() {
        return zfMinBase;
    }

    /**
     * 设置住房公积金最低基数
     *
     * @param zfMinBase 住房公积金最低基数
     */
    public void setZfMinBase(BigDecimal zfMinBase) {
        this.zfMinBase = zfMinBase;
    }

    /**
     * 获取住房公积金企业比例
     *
     * @return zf_enterprise_proportion - 住房公积金企业比例
     */
    public BigDecimal getZfEnterpriseProportion() {
        return zfEnterpriseProportion;
    }

    /**
     * 设置住房公积金企业比例
     *
     * @param zfEnterpriseProportion 住房公积金企业比例
     */
    public void setZfEnterpriseProportion(BigDecimal zfEnterpriseProportion) {
        this.zfEnterpriseProportion = zfEnterpriseProportion;
    }

    /**
     * 获取住房公积金个人比例
     *
     * @return zf_personal_proportion - 住房公积金个人比例
     */
    public BigDecimal getZfPersonalProportion() {
        return zfPersonalProportion;
    }

    /**
     * 设置住房公积金个人比例
     *
     * @param zfPersonalProportion 住房公积金个人比例
     */
    public void setZfPersonalProportion(BigDecimal zfPersonalProportion) {
        this.zfPersonalProportion = zfPersonalProportion;
    }

    /**
     * 获取更新时间
     *
     * @return updatetime - 更新时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置更新时间
     *
     * @param updatetime 更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}