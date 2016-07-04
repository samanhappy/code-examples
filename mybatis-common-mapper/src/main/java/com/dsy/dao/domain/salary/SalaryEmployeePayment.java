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
     * 员工姓名
     */
    @Column(name = "employee_name")
    private String employeeName;

    /**
     * 员工编号
     */
    @Column(name = "employee_no")
    private String employeeNo;

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
     * 岗位ID
     */
    @Column(name = "post_id")
    private Integer postId;

    /**
     * 岗位名称
     */
    @Column(name = "post_name")
    private String postName;

    /**
     * 工资卡卡号
     */
    @Column(name = "salary_card_num")
    private String salaryCardNum;

    /**
     * 工资卡所在银行
     */
    @Column(name = "salary_card_bank")
    private String salaryCardBank;

    /**
     * 部门名称
     */
    @Column(name = "department_name")
    private String departmentName;

    /**
     * 社保公积金结算年月
     */
    @Column(name = "social_fund_year_month")
    private Integer socialFundYearMonth;

    /**
     * 基本工资
     */
    @Column(name = "salary_base")
    private BigDecimal salaryBase;

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
     * 社保结算ID
     */
    @Column(name = "social_employee_payment_id")
    private Integer socialEmployeePaymentId;

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
     * 结算明细，JSON格式字符串
     */
    @Column(name = "payment_detail")
    private String paymentDetail;

    /**
     * 个人所得税
     */
    @Column(name = "personal_tax_sum")
    private BigDecimal personalTaxSum;

    /**
     * 应发工资
     */
    @Column(name = "total_pay_amount")
    private BigDecimal totalPayAmount;

    /**
     * 实发工资
     */
    @Column(name = "final_pay_amount")
    private BigDecimal finalPayAmount;

    /**
     * 企业支付总额
     */
    @Column(name = "enterprise_payment_sum")
    private BigDecimal enterprisePaymentSum;

    /**
     * 补缴起始月
     */
    @Column(name = "add_pay_start_year_month")
    private Integer addPayStartYearMonth;

    /**
     * 补缴结束月
     */
    @Column(name = "add_pay_end_year_month")
    private Integer addPayEndYearMonth;

    /**
     * 补缴金额企业部分
     */
    @Column(name = "add_enterprise_payment_sum")
    private BigDecimal addEnterprisePaymentSum;

    /**
     * 补缴金额个人部分
     */
    @Column(name = "add_personal_payment_sum")
    private BigDecimal addPersonalPaymentSum;

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
     * 获取员工编号
     *
     * @return employee_no - 员工编号
     */
    public String getEmployeeNo() {
        return employeeNo;
    }

    /**
     * 设置员工编号
     *
     * @param employeeNo 员工编号
     */
    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
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
     * 获取岗位ID
     *
     * @return post_id - 岗位ID
     */
    public Integer getPostId() {
        return postId;
    }

    /**
     * 设置岗位ID
     *
     * @param postId 岗位ID
     */
    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    /**
     * 获取岗位名称
     *
     * @return post_name - 岗位名称
     */
    public String getPostName() {
        return postName;
    }

    /**
     * 设置岗位名称
     *
     * @param postName 岗位名称
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }

    /**
     * 获取工资卡卡号
     *
     * @return salary_card_num - 工资卡卡号
     */
    public String getSalaryCardNum() {
        return salaryCardNum;
    }

    /**
     * 设置工资卡卡号
     *
     * @param salaryCardNum 工资卡卡号
     */
    public void setSalaryCardNum(String salaryCardNum) {
        this.salaryCardNum = salaryCardNum;
    }

    /**
     * 获取工资卡所在银行
     *
     * @return salary_card_bank - 工资卡所在银行
     */
    public String getSalaryCardBank() {
        return salaryCardBank;
    }

    /**
     * 设置工资卡所在银行
     *
     * @param salaryCardBank 工资卡所在银行
     */
    public void setSalaryCardBank(String salaryCardBank) {
        this.salaryCardBank = salaryCardBank;
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
     * 获取基本工资
     *
     * @return salary_base - 基本工资
     */
    public BigDecimal getSalaryBase() {
        return salaryBase;
    }

    /**
     * 设置基本工资
     *
     * @param salaryBase 基本工资
     */
    public void setSalaryBase(BigDecimal salaryBase) {
        this.salaryBase = salaryBase;
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
     * 获取社保结算ID
     *
     * @return social_employee_payment_id - 社保结算ID
     */
    public Integer getSocialEmployeePaymentId() {
        return socialEmployeePaymentId;
    }

    /**
     * 设置社保结算ID
     *
     * @param socialEmployeePaymentId 社保结算ID
     */
    public void setSocialEmployeePaymentId(Integer socialEmployeePaymentId) {
        this.socialEmployeePaymentId = socialEmployeePaymentId;
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
     * 获取个人所得税
     *
     * @return personal_tax_sum - 个人所得税
     */
    public BigDecimal getPersonalTaxSum() {
        return personalTaxSum;
    }

    /**
     * 设置个人所得税
     *
     * @param personalTaxSum 个人所得税
     */
    public void setPersonalTaxSum(BigDecimal personalTaxSum) {
        this.personalTaxSum = personalTaxSum;
    }

    /**
     * 获取应发工资
     *
     * @return total_pay_amount - 应发工资
     */
    public BigDecimal getTotalPayAmount() {
        return totalPayAmount;
    }

    /**
     * 设置应发工资
     *
     * @param totalPayAmount 应发工资
     */
    public void setTotalPayAmount(BigDecimal totalPayAmount) {
        this.totalPayAmount = totalPayAmount;
    }

    /**
     * 获取实发工资
     *
     * @return final_pay_amount - 实发工资
     */
    public BigDecimal getFinalPayAmount() {
        return finalPayAmount;
    }

    /**
     * 设置实发工资
     *
     * @param finalPayAmount 实发工资
     */
    public void setFinalPayAmount(BigDecimal finalPayAmount) {
        this.finalPayAmount = finalPayAmount;
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
     * 获取补缴起始月
     *
     * @return add_pay_start_year_month - 补缴起始月
     */
    public Integer getAddPayStartYearMonth() {
        return addPayStartYearMonth;
    }

    /**
     * 设置补缴起始月
     *
     * @param addPayStartYearMonth 补缴起始月
     */
    public void setAddPayStartYearMonth(Integer addPayStartYearMonth) {
        this.addPayStartYearMonth = addPayStartYearMonth;
    }

    /**
     * 获取补缴结束月
     *
     * @return add_pay_end_year_month - 补缴结束月
     */
    public Integer getAddPayEndYearMonth() {
        return addPayEndYearMonth;
    }

    /**
     * 设置补缴结束月
     *
     * @param addPayEndYearMonth 补缴结束月
     */
    public void setAddPayEndYearMonth(Integer addPayEndYearMonth) {
        this.addPayEndYearMonth = addPayEndYearMonth;
    }

    /**
     * 获取补缴金额企业部分
     *
     * @return add_enterprise_payment_sum - 补缴金额企业部分
     */
    public BigDecimal getAddEnterprisePaymentSum() {
        return addEnterprisePaymentSum;
    }

    /**
     * 设置补缴金额企业部分
     *
     * @param addEnterprisePaymentSum 补缴金额企业部分
     */
    public void setAddEnterprisePaymentSum(BigDecimal addEnterprisePaymentSum) {
        this.addEnterprisePaymentSum = addEnterprisePaymentSum;
    }

    /**
     * 获取补缴金额个人部分
     *
     * @return add_personal_payment_sum - 补缴金额个人部分
     */
    public BigDecimal getAddPersonalPaymentSum() {
        return addPersonalPaymentSum;
    }

    /**
     * 设置补缴金额个人部分
     *
     * @param addPersonalPaymentSum 补缴金额个人部分
     */
    public void setAddPersonalPaymentSum(BigDecimal addPersonalPaymentSum) {
        this.addPersonalPaymentSum = addPersonalPaymentSum;
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