package org.samanhappy.spring;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
//import org.springside.modules.test.spring.Profiles;

// springside支持Profiles设定
//@ActiveProfiles(Profiles.UNIT_TEST)
public abstract class SpringTransactionalTestCase extends AbstractTransactionalJUnit4SpringContextTests{
	
	protected DataSource dataSource;
	
	@Override
	@Autowired
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
		this.dataSource = dataSource;
	}

}
