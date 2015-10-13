package test.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import test.model.YqInfo;


/**
 * @author liuzh_3nofxnp
 * @since 2015-09-19 17:17
 */
public interface YqInfoService extends IService<YqInfo> {

    /**
     * 根据条件分页查询
     *
     * @param country
     * @param page
     * @param rows
     * @return
     */
    List<YqInfo> selectPage(YqInfo yqInfo, int page, int rows);
    
    /**
     * 根据条件分页查询
     *
     * @param country
     * @param page
     * @param rows
     * @return
     */
    PageInfo<YqInfo> selectPageInfo(YqInfo yqInfo, int page, int rows);

}
