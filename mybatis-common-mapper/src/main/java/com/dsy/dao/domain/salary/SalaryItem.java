package com.dsy.dao.domain.salary;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_salary_item")
public class SalaryItem {
    /**
     * 薪资项目
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 企业id
     */
    @Column(name = "corporate_id")
    private Integer corporateId;

    /**
     * 项目名称
     */
    @Column(name = "item_name")
    private String itemName;

    /**
     * 1:收入项目 2：扣款项目 3：其他项目
     */
    @Column(name = "salary_type")
    private Integer salaryType;

    /**
     * 1输入项 2计算项
     */
    @Column(name = "item_type")
    private Integer itemType;

    /**
     * 是否计税 1计税 2不计税
     */
    @Column(name = "is_tax")
    private Integer isTax;

    /**
     * 状态 1启用 2不启用
     */
    private Integer status;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 获取薪资项目
     *
     * @return id - 薪资项目
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置薪资项目
     *
     * @param id 薪资项目
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取企业id
     *
     * @return corporate_id - 企业id
     */
    public Integer getCorporateId() {
        return corporateId;
    }

    /**
     * 设置企业id
     *
     * @param corporateId 企业id
     */
    public void setCorporateId(Integer corporateId) {
        this.corporateId = corporateId;
    }

    /**
     * 获取项目名称
     *
     * @return item_name - 项目名称
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置项目名称
     *
     * @param itemName 项目名称
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获取1:收入项目 2：扣款项目 3：其他项目
     *
     * @return salary_type - 1:收入项目 2：扣款项目 3：其他项目
     */
    public Integer getSalaryType() {
        return salaryType;
    }

    /**
     * 设置1:收入项目 2：扣款项目 3：其他项目
     *
     * @param salaryType 1:收入项目 2：扣款项目 3：其他项目
     */
    public void setSalaryType(Integer salaryType) {
        this.salaryType = salaryType;
    }

    /**
     * 获取1输入项 2计算项
     *
     * @return item_type - 1输入项 2计算项
     */
    public Integer getItemType() {
        return itemType;
    }

    /**
     * 设置1输入项 2计算项
     *
     * @param itemType 1输入项 2计算项
     */
    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    /**
     * 获取是否计税 1计税 2不计税
     *
     * @return is_tax - 是否计税 1计税 2不计税
     */
    public Integer getIsTax() {
        return isTax;
    }

    /**
     * 设置是否计税 1计税 2不计税
     *
     * @param isTax 是否计税 1计税 2不计税
     */
    public void setIsTax(Integer isTax) {
        this.isTax = isTax;
    }

    /**
     * 获取状态 1启用 2不启用
     *
     * @return status - 状态 1启用 2不启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 1启用 2不启用
     *
     * @param status 状态 1启用 2不启用
     */
    public void setStatus(Integer status) {
        this.status = status;
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