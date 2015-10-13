package test.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import test.model.YqInfo;
import test.service.YqInfoService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author liuzh_3nofxnp
 * @since 2015-09-19 17:17
 */
@Service("countryService")
public class YqInfoServiceImpl extends BaseService<YqInfo> implements YqInfoService {

    @Override
    public List<YqInfo> selectPage(YqInfo yqInfo, int page, int rows) {
        Example example = new Example(YqInfo.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtil.isNotEmpty(yqInfo.getTextInfo())) {
            criteria.andLike("textInfo", "%" + yqInfo.getTextInfo() + "%");
        }
        if (yqInfo.getId() != null) {
            criteria.andEqualTo("id", yqInfo.getId());
        }
        //分页查询
        PageHelper.startPage(page, rows, false);
        return selectByExample(example);
    }

	@Override
	public PageInfo<YqInfo> selectPageInfo(YqInfo yqInfo, int page, int rows) {
		 Example example = new Example(YqInfo.class);
	        Example.Criteria criteria = example.createCriteria();
	        if (StringUtil.isNotEmpty(yqInfo.getTextInfo())) {
	            criteria.andLike("textInfo", "%" + yqInfo.getTextInfo() + "%");
	        }
	        if (yqInfo.getId() != null) {
	            criteria.andEqualTo("id", yqInfo.getId());
	        }
	        //分页查询，默认查询总数count
	        PageHelper.startPage(page, rows);
	        List<YqInfo> list = selectByExample(example);
	        PageInfo<YqInfo> pageInfo = new PageInfo<YqInfo>(list);
	        return pageInfo;
	}

}
