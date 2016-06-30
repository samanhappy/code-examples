package com.dsy.dao.domain.salary;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_social_payment")
public class SocialPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 结算名称
     */
    private String name;

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
     * 社保公积金结算年月
     */
    @Column(name = "social_fund_year_month")
    private Integer socialFundYearMonth;

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