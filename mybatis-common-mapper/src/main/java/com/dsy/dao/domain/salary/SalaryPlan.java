package com.dsy.dao.domain.salary;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_salary_plan")
public class SalaryPlan {
    /**
     * 薪资方案id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 公司id
     */
    @Column(name = "corporate_id")
    private Integer corporateId;

    /**
     * 方案名称
     */
    private String name;

    /**
     * 状态 1启用 2停用
     */
    private Integer status;

    /**
     * 方案说明
     */
    private String remark;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 获取薪资方案id
     *
     * @return id - 薪资方案id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置薪资方案id
     *
     * @param id 薪资方案id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取公司id
     *
     * @return corporate_id - 公司id
     */
    public Integer getCorporateId() {
        return corporateId;
    }

    /**
     * 设置公司id
     *
     * @param corporateId 公司id
     */
    public void setCorporateId(Integer corporateId) {
        this.corporateId = corporateId;
    }

    /**
     * 获取方案名称
     *
     * @return name - 方案名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置方案名称
     *
     * @param name 方案名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取状态 1启用 2停用
     *
     * @return status - 状态 1启用 2停用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 1启用 2停用
     *
     * @param status 状态 1启用 2停用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取方案说明
     *
     * @return remark - 方案说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置方案说明
     *
     * @param remark 方案说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
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