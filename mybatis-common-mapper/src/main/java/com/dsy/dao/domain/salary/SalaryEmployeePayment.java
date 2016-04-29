package com.dsy.dao.domain.salary;

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