package com.dsy.dao.domain.salary;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_salary_payment")
public class SalaryPayment {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 公司ID
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
     * 薪资方案ID
     */
    @Column(name = "plan_id")
    private Integer planId;

    /**
     * 薪资方案名称
     */
    @Column(name = "plan_name")
    private String planName;

    /**
     * 薪资结算年月
     */
    @Column(name = "salary_year_month")
    private Integer salaryYearMonth;

    /**
     * 社保公积金结算年月
     */
    @Column(name = "social_fund_year_month")
    private Integer socialFundYearMonth;

    /**
     * 结算名称
     */
    private String name;

    /**
     * 确认状态 1待确认 2已确认
     */
    @Column(name = "confirm_status")
    private Integer confirmStatus;

    /**
     * 发放状态 1待发放 2已发放
     */
    @Column(name = "pay_status")
    private Integer payStatus;

    /**
     * 工资条设置
     */
    @Column(name = "payslip_setting")
    private String payslipSetting;

    /**
     * 员工人数
     */
    @Column(name = "employee_count")
    private Integer employeeCount;

    /**
     * 结算总额
     */
    @Column(name = "payment_sum")
    private BigDecimal paymentSum;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取公司ID
     *
     * @return corporate_id - 公司ID
     */
    public Integer getCorporateId() {
        return corporateId;
    }

    /**
     * 设置公司ID
     *
     * @param corporateId 公司ID
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
     * 获取薪资方案ID
     *
     * @return plan_id - 薪资方案ID
     */
    public Integer getPlanId() {
        return planId;
    }

    /**
     * 设置薪资方案ID
     *
     * @param planId 薪资方案ID
     */
    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    /**
     * 获取薪资方案名称
     *
     * @return plan_name - 薪资方案名称
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * 设置薪资方案名称
     *
     * @param planName 薪资方案名称
     */
    public void setPlanName(String planName) {
        this.planName = planName;
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
     * 获取社保公积金结算年月
     *
     * @return social_fund_year_month - 社保公积金结算年月
     */
    public Integer getSocialFundYearMonth() {
        return socialFundYearMonth;
    }

    /**
     * 设置社保公积金结算年月
     *
     * @param socialFundYearMonth 社保公积金结算年月
     */
    public void setSocialFundYearMonth(Integer socialFundYearMonth) {
        this.socialFundYearMonth = socialFundYearMonth;
    }

    /**
     * 获取结算名称
     *
     * @return name - 结算名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置结算名称
     *
     * @param name 结算名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取确认状态 1待确认 2已确认
     *
     * @return confirm_status - 确认状态 1待确认 2已确认
     */
    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    /**
     * 设置确认状态 1待确认 2已确认
     *
     * @param confirmStatus 确认状态 1待确认 2已确认
     */
    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    /**
     * 获取发放状态 1待发放 2已发放
     *
     * @return pay_status - 发放状态 1待发放 2已发放
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * 设置发放状态 1待发放 2已发放
     *
     * @param payStatus 发放状态 1待发放 2已发放
     */
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 获取工资条设置
     *
     * @return payslip_setting - 工资条设置
     */
    public String getPayslipSetting() {
        return payslipSetting;
    }

    /**
     * 设置工资条设置
     *
     * @param payslipSetting 工资条设置
     */
    public void setPayslipSetting(String payslipSetting) {
        this.payslipSetting = payslipSetting;
    }

    /**
     * 获取员工人数
     *
     * @return employee_count - 员工人数
     */
    public Integer getEmployeeCount() {
        return employeeCount;
    }

    /**
     * 设置员工人数
     *
     * @param employeeCount 员工人数
     */
    public void setEmployeeCount(Integer employeeCount) {
        this.employeeCount = employeeCount;
    }

    /**
     * 获取结算总额
     *
     * @return payment_sum - 结算总额
     */
    public BigDecimal getPaymentSum() {
        return paymentSum;
    }

    /**
     * 设置结算总额
     *
     * @param paymentSum 结算总额
     */
    public void setPaymentSum(BigDecimal paymentSum) {
        this.paymentSum = paymentSum;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}