package com.lianfu.gasserversys.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {




    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);

      /*  添加Shiro内置过滤器
         * Shiro内置过滤器，可以实现权限相关的拦截器
         *    常用的过滤器：
         *       anon: 无需认证（登录）可以访问
         *       authc: 必须认证才可以访问
         *       user: 如果使用rememberMe的功能可以直接访问
         *       perms： 该资源必须得到资源权限才可以访问
         *       role: 该资源必须得到角色权限才可以访问*/


        Map<String,String> filterMap = new LinkedHashMap<String,String>();
filterMap.put("/add", "authc");
		filterMap.put("/update", "authc");



        //放行login.html页面
        filterMap.put("../index/aa", "anon");
        filterMap.put("/swagger-ui.html", "anon");
        filterMap.put("/swagger-resources", "anon");
        filterMap.put("/v2/api-docs", "anon");
        filterMap.put("/webjars/springfox-swagger-ui/**", "anon");
        filterMap.put("/configuration/security", "anon");
        filterMap.put("/configuration/ui", "anon");

        //授权过滤器
        //注意：当前授权拦截后，shiro会自动跳转到未授权页面
        filterMap.put("../index/admin", "perms[user:list]");
        filterMap.put("../index/gasdevice", "perms[user:ll]");
        filterMap.put("../index/gasuser", "perms[user:aa]");

        filterMap.put("/*", "authc");

        //修改调整的登录页面
        shiroFilterFactoryBean.setLoginUrl("/toLogin");
        //设置未授权提示页面
        shiroFilterFactoryBean.setUnauthorizedUrl("/noAuth");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);


        return shiroFilterFactoryBean;
    }
/*
*
     * 创建DefaultWebSecurityManager*/


    @Bean(name="securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联realm
        securityManager.setRealm(userRealm);
        return securityManager;
    }

/**
     * 创建Realm*/


    @Bean(name="userRealm")
    public UserRealm getRealm(){
        return new UserRealm();
    }

/**
     * 配置ShiroDialect，用于thymeleaf和shiro标签配合使用
     */

/*@Bean
    public ShiroDialect getShiroDialect(){
        return new ShiroDialect();
    }*/

}
