package com.gfso.hibernate.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class HibernateConfig {
	//below are generated by spring boot automatically
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	@Autowired
    private DataSource dataSource;
	@Autowired
	private PlatformTransactionManager transactionManager;
	
	//sessionFactory no need now, we will use JPA, not hibernate directly
//	@Bean
//	public SessionFactory getSessionFactory() {
//		if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
//			throw new NullPointerException("factory is not a hibernate factory");
//		}
//		return entityManagerFactory.unwrap(SessionFactory.class);
//	}
}