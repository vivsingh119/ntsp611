package com.nt.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class AopConfig {

	@Bean(name="dsTxMgmr")
	public    DataSourceTransactionManager createDsTxMgmt(DataSource ds) {
		return new DataSourceTransactionManager(ds);
	}
	
	
}
