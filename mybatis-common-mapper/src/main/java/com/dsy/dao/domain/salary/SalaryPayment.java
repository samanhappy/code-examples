package com.dsy.dao.domain.salary;

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
     * 社保方案ID
     */
    @Column(name = "social_id")
    private Integer socialId;

    /**
     * 社保方案名称
     */
    @Column(name = "social_name")
    private String socialName;

    /**
     * 结算年
     */
    private Integer year;

    /**
     * 结算月
     */
    private Integer month;

    /**
     * 结算名称
     */
    private String name;

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
    private Double paymentSum;

    /**
     * 更新时间
     */
    private Date updatetime;

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
     * 获取社保方案ID
     *
     * @return social_id - 社保方案ID
     */
    public Integer getSocialId() {
        return socialId;
    }

    /**
     * 设置社保方案ID
     *
     * @param socialId 社保方案ID
     */
    public void setSocialId(Integer socialId) {
        this.socialId = socialId;
    }

    /**
     * 获取社保方案名称
     *
     * @return social_name - 社保方案名称
     */
    public String getSocialName() {
        return socialName;
    }

    /**
     * 设置社保方案名称
     *
     * @param socialName 社保方案名称
     */
    public void setSocialName(String socialName) {
        this.socialName = socialName;
    }

    /**
     * 获取结算年
     *
     * @return year - 结算年
     */
    public Integer getYear() {
        return year;
    }

    /**
     * 设置结算年
     *
     * @param year 结算年
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * 获取结算月
     *
     * @return month - 结算月
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * 设置结算月
     *
     * @param month 结算月
     */
    public void setMonth(Integer month) {
        this.month = month;
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
    public Double getPaymentSum() {
        return paymentSum;
    }

    /**
     * 设置结算总额
     *
     * @param paymentSum 结算总额
     */
    public void setPaymentSum(Double paymentSum) {
        this.paymentSum = paymentSum;
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