package com.dsy.dao.domain.salary;

import java.math.BigDecimal;
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
    private BigDecimal socialSecurityBase;

    /**
     * 公积金缴费基数
     */
    @Column(name = "house_fund_base")
    private BigDecimal houseFundBase;

    /**
     * 养老保险企业支付
     */
    @Column(name = "ylao_enterprise_payment")
    private BigDecimal ylaoEnterprisePayment;

    /**
     * 养老保险个人支付
     */
    @Column(name = "ylao_personal_payment")
    private BigDecimal ylaoPersonalPayment;

    /**
     * 医疗保险企业支付
     */
    @Column(name = "yliao_enterprise_payment")
    private BigDecimal yliaoEnterprisePayment;

    /**
     * 医疗保险个人支付
     */
    @Column(name = "yliao_personal_payment")
    private BigDecimal yliaoPersonalPayment;

    /**
     * 失业保险企业支付
     */
    @Column(name = "sye_enterprise_payment")
    private BigDecimal syeEnterprisePayment;

    /**
     * 失业保险个人支付
     */
    @Column(name = "sye_personal_payment")
    private BigDecimal syePersonalPayment;

    /**
     * 工伤保险企业支付
     */
    @Column(name = "gs_enterprise_payment")
    private BigDecimal gsEnterprisePayment;

    /**
     * 工伤保险个人支付
     */
    @Column(name = "gs_personal_payment")
    private BigDecimal gsPersonalPayment;

    /**
     * 生育保险企业支付
     */
    @Column(name = "syu_enterprise_payment")
    private BigDecimal syuEnterprisePayment;

    /**
     * 生育保险个人支付
     */
    @Column(name = "syu_personal_payment")
    private BigDecimal syuPersonalPayment;

    /**
     * 住房保险企业支付
     */
    @Column(name = "zf_enterprise_payment")
    private BigDecimal zfEnterprisePayment;

    /**
     * 住房保险个人支付
     */
    @Column(name = "zf_personal_payment")
    private BigDecimal zfPersonalPayment;

    /**
     * 社保企业支付合计
     */
    @Column(name = "social_enterprise_payment_sum")
    private BigDecimal socialEnterprisePaymentSum;

    /**
     * 社保个人支付合计
     */
    @Column(name = "social_personal_payment_sum")
    private BigDecimal socialPersonalPaymentSum;

    /**
     * 企业支付总额
     */
    @Column(name = "enterprise_payment_sum")
    private BigDecimal enterprisePaymentSum;

    /**
     * 个人支付总额
     */
    @Column(name = "personal_payment_sum")
    private BigDecimal personalPaymentSum;

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
    public BigDecimal getSocialSecurityBase() {
        return socialSecurityBase;
    }

    /**
     * 设置社保缴费基数
     *
     * @param socialSecurityBase 社保缴费基数
     */
    public void setSocialSecurityBase(BigDecimal socialSecurityBase) {
        this.socialSecurityBase = socialSecurityBase;
    }

    /**
     * 获取公积金缴费基数
     *
     * @return house_fund_base - 公积金缴费基数
     */
    public BigDecimal getHouseFundBase() {
        return houseFundBase;
    }

    /**
     * 设置公积金缴费基数
     *
     * @param houseFundBase 公积金缴费基数
     */
    public void setHouseFundBase(BigDecimal houseFundBase) {
        this.houseFundBase = houseFundBase;
    }

    /**
     * 获取养老保险企业支付
     *
     * @return ylao_enterprise_payment - 养老保险企业支付
     */
    public BigDecimal getYlaoEnterprisePayment() {
        return ylaoEnterprisePayment;
    }

    /**
     * 设置养老保险企业支付
     *
     * @param ylaoEnterprisePayment 养老保险企业支付
     */
    public void setYlaoEnterprisePayment(BigDecimal ylaoEnterprisePayment) {
        this.ylaoEnterprisePayment = ylaoEnterprisePayment;
    }

    /**
     * 获取养老保险个人支付
     *
     * @return ylao_personal_payment - 养老保险个人支付
     */
    public BigDecimal getYlaoPersonalPayment() {
        return ylaoPersonalPayment;
    }

    /**
     * 设置养老保险个人支付
     *
     * @param ylaoPersonalPayment 养老保险个人支付
     */
    public void setYlaoPersonalPayment(BigDecimal ylaoPersonalPayment) {
        this.ylaoPersonalPayment = ylaoPersonalPayment;
    }

    /**
     * 获取医疗保险企业支付
     *
     * @return yliao_enterprise_payment - 医疗保险企业支付
     */
    public BigDecimal getYliaoEnterprisePayment() {
        return yliaoEnterprisePayment;
    }

    /**
     * 设置医疗保险企业支付
     *
     * @param yliaoEnterprisePayment 医疗保险企业支付
     */
    public void setYliaoEnterprisePayment(BigDecimal yliaoEnterprisePayment) {
        this.yliaoEnterprisePayment = yliaoEnterprisePayment;
    }

    /**
     * 获取医疗保险个人支付
     *
     * @return yliao_personal_payment - 医疗保险个人支付
     */
    public BigDecimal getYliaoPersonalPayment() {
        return yliaoPersonalPayment;
    }

    /**
     * 设置医疗保险个人支付
     *
     * @param yliaoPersonalPayment 医疗保险个人支付
     */
    public void setYliaoPersonalPayment(BigDecimal yliaoPersonalPayment) {
        this.yliaoPersonalPayment = yliaoPersonalPayment;
    }

    /**
     * 获取失业保险企业支付
     *
     * @return sye_enterprise_payment - 失业保险企业支付
     */
    public BigDecimal getSyeEnterprisePayment() {
        return syeEnterprisePayment;
    }

    /**
     * 设置失业保险企业支付
     *
     * @param syeEnterprisePayment 失业保险企业支付
     */
    public void setSyeEnterprisePayment(BigDecimal syeEnterprisePayment) {
        this.syeEnterprisePayment = syeEnterprisePayment;
    }

    /**
     * 获取失业保险个人支付
     *
     * @return sye_personal_payment - 失业保险个人支付
     */
    public BigDecimal getSyePersonalPayment() {
        return syePersonalPayment;
    }

    /**
     * 设置失业保险个人支付
     *
     * @param syePersonalPayment 失业保险个人支付
     */
    public void setSyePersonalPayment(BigDecimal syePersonalPayment) {
        this.syePersonalPayment = syePersonalPayment;
    }

    /**
     * 获取工伤保险企业支付
     *
     * @return gs_enterprise_payment - 工伤保险企业支付
     */
    public BigDecimal getGsEnterprisePayment() {
        return gsEnterprisePayment;
    }

    /**
     * 设置工伤保险企业支付
     *
     * @param gsEnterprisePayment 工伤保险企业支付
     */
    public void setGsEnterprisePayment(BigDecimal gsEnterprisePayment) {
        this.gsEnterprisePayment = gsEnterprisePayment;
    }

    /**
     * 获取工伤保险个人支付
     *
     * @return gs_personal_payment - 工伤保险个人支付
     */
    public BigDecimal getGsPersonalPayment() {
        return gsPersonalPayment;
    }

    /**
     * 设置工伤保险个人支付
     *
     * @param gsPersonalPayment 工伤保险个人支付
     */
    public void setGsPersonalPayment(BigDecimal gsPersonalPayment) {
        this.gsPersonalPayment = gsPersonalPayment;
    }

    /**
     * 获取生育保险企业支付
     *
     * @return syu_enterprise_payment - 生育保险企业支付
     */
    public BigDecimal getSyuEnterprisePayment() {
        return syuEnterprisePayment;
    }

    /**
     * 设置生育保险企业支付
     *
     * @param syuEnterprisePayment 生育保险企业支付
     */
    public void setSyuEnterprisePayment(BigDecimal syuEnterprisePayment) {
        this.syuEnterprisePayment = syuEnterprisePayment;
    }

    /**
     * 获取生育保险个人支付
     *
     * @return syu_personal_payment - 生育保险个人支付
     */
    public BigDecimal getSyuPersonalPayment() {
        return syuPersonalPayment;
    }

    /**
     * 设置生育保险个人支付
     *
     * @param syuPersonalPayment 生育保险个人支付
     */
    public void setSyuPersonalPayment(BigDecimal syuPersonalPayment) {
        this.syuPersonalPayment = syuPersonalPayment;
    }

    /**
     * 获取住房保险企业支付
     *
     * @return zf_enterprise_payment - 住房保险企业支付
     */
    public BigDecimal getZfEnterprisePayment() {
        return zfEnterprisePayment;
    }

    /**
     * 设置住房保险企业支付
     *
     * @param zfEnterprisePayment 住房保险企业支付
     */
    public void setZfEnterprisePayment(BigDecimal zfEnterprisePayment) {
        this.zfEnterprisePayment = zfEnterprisePayment;
    }

    /**
     * 获取住房保险个人支付
     *
     * @return zf_personal_payment - 住房保险个人支付
     */
    public BigDecimal getZfPersonalPayment() {
        return zfPersonalPayment;
    }

    /**
     * 设置住房保险个人支付
     *
     * @param zfPersonalPayment 住房保险个人支付
     */
    public void setZfPersonalPayment(BigDecimal zfPersonalPayment) {
        this.zfPersonalPayment = zfPersonalPayment;
    }

    /**
     * 获取社保企业支付合计
     *
     * @return social_enterprise_payment_sum - 社保企业支付合计
     */
    public BigDecimal getSocialEnterprisePaymentSum() {
        return socialEnterprisePaymentSum;
    }

    /**
     * 设置社保企业支付合计
     *
     * @param socialEnterprisePaymentSum 社保企业支付合计
     */
    public void setSocialEnterprisePaymentSum(BigDecimal socialEnterprisePaymentSum) {
        this.socialEnterprisePaymentSum = socialEnterprisePaymentSum;
    }

    /**
     * 获取社保个人支付合计
     *
     * @return social_personal_payment_sum - 社保个人支付合计
     */
    public BigDecimal getSocialPersonalPaymentSum() {
        return socialPersonalPaymentSum;
    }

    /**
     * 设置社保个人支付合计
     *
     * @param socialPersonalPaymentSum 社保个人支付合计
     */
    public void setSocialPersonalPaymentSum(BigDecimal socialPersonalPaymentSum) {
        this.socialPersonalPaymentSum = socialPersonalPaymentSum;
    }

    /**
     * 获取企业支付总额
     *
     * @return enterprise_payment_sum - 企业支付总额
     */
    public BigDecimal getEnterprisePaymentSum() {
        return enterprisePaymentSum;
    }

    /**
     * 设置企业支付总额
     *
     * @param enterprisePaymentSum 企业支付总额
     */
    public void setEnterprisePaymentSum(BigDecimal enterprisePaymentSum) {
        this.enterprisePaymentSum = enterprisePaymentSum;
    }

    /**
     * 获取个人支付总额
     *
     * @return personal_payment_sum - 个人支付总额
     */
    public BigDecimal getPersonalPaymentSum() {
        return personalPaymentSum;
    }

    /**
     * 设置个人支付总额
     *
     * @param personalPaymentSum 个人支付总额
     */
    public void setPersonalPaymentSum(BigDecimal personalPaymentSum) {
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