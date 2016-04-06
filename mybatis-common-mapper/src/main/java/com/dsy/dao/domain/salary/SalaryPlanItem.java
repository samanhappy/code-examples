package com.dsy.dao.domain.salary;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_salary_plan_item")
public class SalaryPlanItem {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 薪资方案ID
     */
    @Column(name = "plan_id")
    private Integer planId;

    /**
     * 薪资项目ID
     */
    @Column(name = "item_id")
    private Integer itemId;

    /**
     * 薪资项目计算公式
     */
    private String expression;

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
     * 获取薪资项目ID
     *
     * @return item_id - 薪资项目ID
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 设置薪资项目ID
     *
     * @param itemId 薪资项目ID
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取薪资项目计算公式
     *
     * @return expression - 薪资项目计算公式
     */
    public String getExpression() {
        return expression;
    }

    /**
     * 设置薪资项目计算公式
     *
     * @param expression 薪资项目计算公式
     */
    public void setExpression(String expression) {
        this.expression = expression;
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