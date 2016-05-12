package com.dsy.dao.domain.salary;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_salary_employee_payment")
public class SalaryEmployeePayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 薪资结算ID
     */
    @Column(name = "payment_id")
    private Integer paymentId;

    /**
     * 薪资结算年月
     */
    @Column(name = "salary_year_month")
    private Integer salaryYearMonth;

    /**
     * 员工ID
     */
    @Column(name = "employee_id")
    private Integer employeeId;

    /**
     * 员工编号
     */
    @Column(name = "employee_no")
    private Integer employeeNo;

    /**
     * 员工姓名
     */
    @Column(name = "employee_name")
    private String employeeName;

    /**
     * 身份证号
     */
    @Column(name = "id_no")
    private String idNo;

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
     * 部门名称
     */
    @Column(name = "department_name")
    private String departmentName;

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
     * 社保缴费基数
     */
    @Column(name = "social_security_base")
    private Integer socialSecurityBase;

    /**
     * 公积金缴费基数
     */
    @Column(name = "house_fund_base")
    private Integer houseFundBase;

    /**
     * 住房保险个人支付
     */
    @Column(name = "zf_personal_payment")
    private BigDecimal zfPersonalPayment;

    /**
     * 社保个人支付合计
     */
    @Column(name = "social_personal_payment_sum")
    private BigDecimal socialPersonalPaymentSum;

    /**
     * 结算明细，JSON格式字符串
     */
    @Column(name = "payment_detail")
    private String paymentDetail;

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
     * 获取薪资结算年月
     *
     * @return salary_year_month - 薪资结算年月
     */
    public Integer getSalaryYearMonth() {
        return salaryYearMonth;
    }

    /**
     * 设置薪资结算年月
     *
     * @param salaryYearMonth 薪资结算年月
     */
    public void setSalaryYearMonth(Integer salaryYearMonth) {
        this.salaryYearMonth = salaryYearMonth;
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
     * 获取员工编号
     *
     * @return employee_no - 员工编号
     */
    public Integer getEmployeeNo() {
        return employeeNo;
    }

    /**
     * 设置员工编号
     *
     * @param employeeNo 员工编号
     */
    public void setEmployeeNo(Integer employeeNo) {
        this.employeeNo = employeeNo;
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
     * 获取部门名称
     *
     * @return department_name - 部门名称
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * 设置部门名称
     *
     * @param departmentName 部门名称
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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
     * 获取社保缴费基数
     *
     * @return social_security_base - 社保缴费基数
     */
    public Integer getSocialSecurityBase() {
        return socialSecurityBase;
    }

    /**
     * 设置社保缴费基数
     *
     * @param socialSecurityBase 社保缴费基数
     */
    public void setSocialSecurityBase(Integer socialSecurityBase) {
        this.socialSecurityBase = socialSecurityBase;
    }

    /**
     * 获取公积金缴费基数
     *
     * @return house_fund_base - 公积金缴费基数
     */
    public Integer getHouseFundBase() {
        return houseFundBase;
    }

    /**
     * 设置公积金缴费基数
     *
     * @param houseFundBase 公积金缴费基数
     */
    public void setHouseFundBase(Integer houseFundBase) {
        this.houseFundBase = houseFundBase;
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
     * 获取结算明细，JSON格式字符串
     *
     * @return payment_detail - 结算明细，JSON格式字符串
     */
    public String getPaymentDetail() {
        return paymentDetail;
    }

    /**
     * 设置结算明细，JSON格式字符串
     *
     * @param paymentDetail 结算明细，JSON格式字符串
     */
    public void setPaymentDetail(String paymentDetail) {
        this.paymentDetail = paymentDetail;
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