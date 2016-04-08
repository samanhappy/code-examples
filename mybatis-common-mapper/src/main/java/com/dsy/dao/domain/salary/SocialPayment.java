package com.dsy.dao.domain.salary;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_social_payment")
public class SocialPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
     * 公司ID
     */
    @Column(name = "corporate_id")
    private Integer corporateId;

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
     * 结算名称
     */
    private String name;

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
    private Date createtime;

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
     * @return createtime - 更新时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置更新时间
     *
     * @param createtime 更新时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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