package com.admin.collegeapi.config;

import com.admin.collegeapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserService userService;

    @Autowired
    public SecurityConfig(UserService userService) {
        this.userService = userService;
    }

    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers("/login*","/signup*","/roles*").permitAll();


//        http.csrf().disable()
//                .authorizeRequests().antMatchers("/").permitAll()
//                .anyRequest().authenticated()
//                .and().formLogin().loginPage("/login").defaultSuccessUrl("/welcome").failureUrl("/login?error=true").permitAll()
//                .and().logout().deleteCookies("JSESSIONID").logoutUrl("/logout").logoutSuccessUrl("/login");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}