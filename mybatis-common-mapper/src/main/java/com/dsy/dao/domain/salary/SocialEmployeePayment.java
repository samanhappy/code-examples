package com.dsy.dao.domain.salary;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_social_employee_payment")
public class SocialEmployeePayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 薪资结算ID
     */
    @Column(name = "payment_id")
    private Integer paymentId;

    /**
     * 企业ID
     */
    @Column(name = "corporate_id")
    private Integer corporateId;

    /**
     * 部门ID
     */
    @Column(name = "department_id")
    private Integer departmentId;

    /**
     * 员工ID
     */
    @Column(name = "employee_id")
    private Integer employeeId;

    /**
     * 员工姓名
     */
    @Column(name = "employee_name")
    private String employeeName;

    /**
     * 地区id
     */
    @Column(name = "city_id")
    private Integer cityId;

    /**
     * 地区名称
     */
    @Column(name = "city_name")
    private String cityName;

    /**
     * 社保结算年月
     */
    @Column(name = "social_year_month")
    private Integer socialYearMonth;

    /**
     * 公积金结算年月
     */
    @Column(name = "fund_year_month")
    private Integer fundYearMonth;

    /**
     * 身份证号
     */
    @Column(name = "id_no")
    private String idNo;

    /**
     * 社保号
     */
    @Column(name = "social_security_no")
    private String socialSecurityNo;

    /**
     * 公积金号
     */
    @Column(name = "house_fund_no")
    private String houseFundNo;

    /**
     * 社保缴费基数
     */
    @Column(name = "social_security_base")
    private Float socialSecurityBase;

    /**
     * 公积金缴费基数
     */
    @Column(name = "house_fund_base")
    private Float houseFundBase;

    /**
     * 养老保险企业支付
     */
    @Column(name = "ylao_enterprise_payment")
    private Float ylaoEnterprisePayment;

    /**
     * 养老保险个人支付
     */
    @Column(name = "ylao_personal_payment")
    private Float ylaoPersonalPayment;

    /**
     * 医疗保险企业支付
     */
    @Column(name = "yliao_enterprise_payment")
    private Float yliaoEnterprisePayment;

    /**
     * 医疗保险个人支付
     */
    @Column(name = "yliao_personal_payment")
    private Float yliaoPersonalPayment;

    /**
     * 失业保险企业支付
     */
    @Column(name = "sye_enterprise_payment")
    private Float syeEnterprisePayment;

    /**
     * 失业保险个人支付
     */
    @Column(name = "sye_personal_payment")
    private Float syePersonalPayment;

    /**
     * 工伤保险企业支付
     */
    @Column(name = "gs_enterprise_payment")
    private Float gsEnterprisePayment;

    /**
     * 工伤保险个人支付
     */
    @Column(name = "gs_personal_payment")
    private Float gsPersonalPayment;

    /**
     * 生育保险企业支付
     */
    @Column(name = "syu_enterprise_payment")
    private Float syuEnterprisePayment;

    /**
     * 生育保险个人支付
     */
    @Column(name = "syu_personal_payment")
    private Float syuPersonalPayment;

    /**
     * 住房保险企业支付
     */
    @Column(name = "zf_enterprise_payment")
    private Float zfEnterprisePayment;

    /**
     * 住房保险个人支付
     */
    @Column(name = "zf_personal_payment")
    private Float zfPersonalPayment;

    /**
     * 企业支付总额
     */
    @Column(name = "enterprise_payment_sum")
    private Float enterprisePaymentSum;

    /**
     * 个人支付总额
     */
    @Column(name = "personal_payment_sum")
    private Float personalPaymentSum;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取薪资结算ID
     *
     * @return payment_id - 薪资结算ID
     */
    public Integer getPaymentId() {
        return paymentId;
    }

    /**
     * 设置薪资结算ID
     *
     * @param paymentId 薪资结算ID
     */
    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * 获取企业ID
     *
     * @return corporate_id - 企业ID
     */
    public Integer getCorporateId() {
        return corporateId;
    }

    /**
     * 设置企业ID
     *
     * @param corporateId 企业ID
     */
    public void setCorporateId(Integer corporateId) {
        this.corporateId = corporateId;
    }

    /**
     * 获取部门ID
     *
     * @return department_id - 部门ID
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置部门ID
     *
     * @param departmentId 部门ID
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取员工ID
     *
     * @return employee_id - 员工ID
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置员工ID
     *
     * @param employeeId 员工ID
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获取员工姓名
     *
     * @return employee_name - 员工姓名
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 设置员工姓名
     *
     * @param employeeName 员工姓名
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * 获取地区id
     *
     * @return city_id - 地区id
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 设置地区id
     *
     * @param cityId 地区id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取地区名称
     *
     * @return city_name - 地区名称
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置地区名称
     *
     * @param cityName 地区名称
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 获取社保结算年月
     *
     * @return social_year_month - 社保结算年月
     */
    public Integer getSocialYearMonth() {
        return socialYearMonth;
    }

    /**
     * 设置社保结算年月
     *
     * @param socialYearMonth 社保结算年月
     */
    public void setSocialYearMonth(Integer socialYearMonth) {
        this.socialYearMonth = socialYearMonth;
    }

    /**
     * 获取公积金结算年月
     *
     * @return fund_year_month - 公积金结算年月
     */
    public Integer getFundYearMonth() {
        return fundYearMonth;
    }

    /**
     * 设置公积金结算年月
     *
     * @param fundYearMonth 公积金结算年月
     */
    public void setFundYearMonth(Integer fundYearMonth) {
        this.fundYearMonth = fundYearMonth;
    }

    /**
     * 获取身份证号
     *
     * @return id_no - 身份证号
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * 设置身份证号
     *
     * @param idNo 身份证号
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
     * 获取社保号
     *
     * @return social_security_no - 社保号
     */
    public String getSocialSecurityNo() {
        return socialSecurityNo;
    }

    /**
     * 设置社保号
     *
     * @param socialSecurityNo 社保号
     */
    public void setSocialSecurityNo(String socialSecurityNo) {
        this.socialSecurityNo = socialSecurityNo;
    }

    /**
     * 获取公积金号
     *
     * @return house_fund_no - 公积金号
     */
    public String getHouseFundNo() {
        return houseFundNo;
    }

    /**
     * 设置公积金号
     *
     * @param houseFundNo 公积金号
     */
    public void setHouseFundNo(String houseFundNo) {
        this.houseFundNo = houseFundNo;
    }

    /**
     * 获取社保缴费基数
     *
     * @return social_security_base - 社保缴费基数
     */
    public Float getSocialSecurityBase() {
        return socialSecurityBase;
    }

    /**
     * 设置社保缴费基数
     *
     * @param socialSecurityBase 社保缴费基数
     */
    public void setSocialSecurityBase(Float socialSecurityBase) {
        this.socialSecurityBase = socialSecurityBase;
    }

    /**
     * 获取公积金缴费基数
     *
     * @return house_fund_base - 公积金缴费基数
     */
    public Float getHouseFundBase() {
        return houseFundBase;
    }

    /**
     * 设置公积金缴费基数
     *
     * @param houseFundBase 公积金缴费基数
     */
    public void setHouseFundBase(Float houseFundBase) {
        this.houseFundBase = houseFundBase;
    }

    /**
     * 获取养老保险企业支付
     *
     * @return ylao_enterprise_payment - 养老保险企业支付
     */
    public Float getYlaoEnterprisePayment() {
        return ylaoEnterprisePayment;
    }

    /**
     * 设置养老保险企业支付
     *
     * @param ylaoEnterprisePayment 养老保险企业支付
     */
    public void setYlaoEnterprisePayment(Float ylaoEnterprisePayment) {
        this.ylaoEnterprisePayment = ylaoEnterprisePayment;
    }

    /**
     * 获取养老保险个人支付
     *
     * @return ylao_personal_payment - 养老保险个人支付
     */
    public Float getYlaoPersonalPayment() {
        return ylaoPersonalPayment;
    }

    /**
     * 设置养老保险个人支付
     *
     * @param ylaoPersonalPayment 养老保险个人支付
     */
    public void setYlaoPersonalPayment(Float ylaoPersonalPayment) {
        this.ylaoPersonalPayment = ylaoPersonalPayment;
    }

    /**
     * 获取医疗保险企业支付
     *
     * @return yliao_enterprise_payment - 医疗保险企业支付
     */
    public Float getYliaoEnterprisePayment() {
        return yliaoEnterprisePayment;
    }

    /**
     * 设置医疗保险企业支付
     *
     * @param yliaoEnterprisePayment 医疗保险企业支付
     */
    public void setYliaoEnterprisePayment(Float yliaoEnterprisePayment) {
        this.yliaoEnterprisePayment = yliaoEnterprisePayment;
    }

    /**
     * 获取医疗保险个人支付
     *
     * @return yliao_personal_payment - 医疗保险个人支付
     */
    public Float getYliaoPersonalPayment() {
        return yliaoPersonalPayment;
    }

    /**
     * 设置医疗保险个人支付
     *
     * @param yliaoPersonalPayment 医疗保险个人支付
     */
    public void setYliaoPersonalPayment(Float yliaoPersonalPayment) {
        this.yliaoPersonalPayment = yliaoPersonalPayment;
    }

    /**
     * 获取失业保险企业支付
     *
     * @return sye_enterprise_payment - 失业保险企业支付
     */
    public Float getSyeEnterprisePayment() {
        return syeEnterprisePayment;
    }

    /**
     * 设置失业保险企业支付
     *
     * @param syeEnterprisePayment 失业保险企业支付
     */
    public void setSyeEnterprisePayment(Float syeEnterprisePayment) {
        this.syeEnterprisePayment = syeEnterprisePayment;
    }

    /**
     * 获取失业保险个人支付
     *
     * @return sye_personal_payment - 失业保险个人支付
     */
    public Float getSyePersonalPayment() {
        return syePersonalPayment;
    }

    /**
     * 设置失业保险个人支付
     *
     * @param syePersonalPayment 失业保险个人支付
     */
    public void setSyePersonalPayment(Float syePersonalPayment) {
        this.syePersonalPayment = syePersonalPayment;
    }

    /**
     * 获取工伤保险企业支付
     *
     * @return gs_enterprise_payment - 工伤保险企业支付
     */
    public Float getGsEnterprisePayment() {
        return gsEnterprisePayment;
    }

    /**
     * 设置工伤保险企业支付
     *
     * @param gsEnterprisePayment 工伤保险企业支付
     */
    public void setGsEnterprisePayment(Float gsEnterprisePayment) {
        this.gsEnterprisePayment = gsEnterprisePayment;
    }

    /**
     * 获取工伤保险个人支付
     *
     * @return gs_personal_payment - 工伤保险个人支付
     */
    public Float getGsPersonalPayment() {
        return gsPersonalPayment;
    }

    /**
     * 设置工伤保险个人支付
     *
     * @param gsPersonalPayment 工伤保险个人支付
     */
    public void setGsPersonalPayment(Float gsPersonalPayment) {
        this.gsPersonalPayment = gsPersonalPayment;
    }

    /**
     * 获取生育保险企业支付
     *
     * @return syu_enterprise_payment - 生育保险企业支付
     */
    public Float getSyuEnterprisePayment() {
        return syuEnterprisePayment;
    }

    /**
     * 设置生育保险企业支付
     *
     * @param syuEnterprisePayment 生育保险企业支付
     */
    public void setSyuEnterprisePayment(Float syuEnterprisePayment) {
        this.syuEnterprisePayment = syuEnterprisePayment;
    }

    /**
     * 获取生育保险个人支付
     *
     * @return syu_personal_payment - 生育保险个人支付
     */
    public Float getSyuPersonalPayment() {
        return syuPersonalPayment;
    }

    /**
     * 设置生育保险个人支付
     *
     * @param syuPersonalPayment 生育保险个人支付
     */
    public void setSyuPersonalPayment(Float syuPersonalPayment) {
        this.syuPersonalPayment = syuPersonalPayment;
    }

    /**
     * 获取住房保险企业支付
     *
     * @return zf_enterprise_payment - 住房保险企业支付
     */
    public Float getZfEnterprisePayment() {
        return zfEnterprisePayment;
    }

    /**
     * 设置住房保险企业支付
     *
     * @param zfEnterprisePayment 住房保险企业支付
     */
    public void setZfEnterprisePayment(Float zfEnterprisePayment) {
        this.zfEnterprisePayment = zfEnterprisePayment;
    }

    /**
     * 获取住房保险个人支付
     *
     * @return zf_personal_payment - 住房保险个人支付
     */
    public Float getZfPersonalPayment() {
        return zfPersonalPayment;
    }

    /**
     * 设置住房保险个人支付
     *
     * @param zfPersonalPayment 住房保险个人支付
     */
    public void setZfPersonalPayment(Float zfPersonalPayment) {
        this.zfPersonalPayment = zfPersonalPayment;
    }

    /**
     * 获取企业支付总额
     *
     * @return enterprise_payment_sum - 企业支付总额
     */
    public Float getEnterprisePaymentSum() {
        return enterprisePaymentSum;
    }

    /**
     * 设置企业支付总额
     *
     * @param enterprisePaymentSum 企业支付总额
     */
    public void setEnterprisePaymentSum(Float enterprisePaymentSum) {
        this.enterprisePaymentSum = enterprisePaymentSum;
    }

    /**
     * 获取个人支付总额
     *
     * @return personal_payment_sum - 个人支付总额
     */
    public Float getPersonalPaymentSum() {
        return personalPaymentSum;
    }

    /**
     * 设置个人支付总额
     *
     * @param personalPaymentSum 个人支付总额
     */
    public void setPersonalPaymentSum(Float personalPaymentSum) {
        this.personalPaymentSum = personalPaymentSum;
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