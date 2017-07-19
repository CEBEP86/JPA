package xyz.samsonovs.TemplateJSP.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "xyz.samsonovs.TemplateJSP.repositories")
@EnableTransactionManagement

public class Config {


    @Value("jdbc:postgresql://localhost:5432/testFor_TrendSoft")
    String url;
    @Value("ii")
    String user;
    @Value("ii")
    String pass;
    @Value("org.postgresql.Driver")
    String draive;

    @Bean
    public DataSource dataSource() {
        final HikariConfig config = new HikariConfig();
        config.setJdbcUrl(url);
        config.setDriverClassName(draive);
        config.setUsername(user);
        config.setPassword(pass);


        return new HikariDataSource(config);
    }

    @Bean
    public EntityManagerFactory entityManagerFactory() {

        System.out.print("uo");

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();

        //vendorAdapter.setGenerateDdl(true);
        System.out.print("uo");
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("xyz.samsonovs.TemplateJSP.domain");
        factory.setDataSource(dataSource());
        factory.afterPropertiesSet();
        return factory.getObject();
    }
}


