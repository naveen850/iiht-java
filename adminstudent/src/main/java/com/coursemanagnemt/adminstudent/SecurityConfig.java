package com.coursemanagnemt.adminstudent;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//@Configuration
//@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication().withUser("naveen").password("{noop}naveenbkm").roles("user");
	auth.inMemoryAuthentication().withUser("bekkam").password("{noop}naveen850").roles("ADMIN");	
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.httpBasic().and().authorizeRequests().antMatchers(HttpMethod.GET,"/").permitAll()
      .antMatchers(HttpMethod.GET,"/adminregister").hasRole("user") .and().csrf().disable().formLogin().disable();
		
	}
	

}
