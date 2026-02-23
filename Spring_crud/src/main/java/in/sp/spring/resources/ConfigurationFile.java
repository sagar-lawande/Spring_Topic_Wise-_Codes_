package in.sp.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("in.sp.spring")
public class ConfigurationFile {
	
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_module");
		ds.setUsername("root");
		ds.setPassword("Sagar12");
		return ds;
	}
	
	@Bean
	public JdbcTemplate addData() {
		JdbcTemplate jt=new JdbcTemplate();
		jt.setDataSource(dataSource());
		return jt;
	}

}
