package com.lianfu.gasserversys.config;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

import java.util.ArrayList;
import java.util.List;


/**
 * 自定义Realm
 * @author lenovo
 *
 */
public class UserRealm extends AuthorizingRealm{

    /**
     * 执行授权逻辑
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
        System.out.println("执行授权逻辑");

        //给资源进行授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        List<String> list=new ArrayList();
        list.add("user:list");
        list.add("user:ll");
        list.add("user:aa");




        for (String a:list){
        //添加资源的授权字符串
        info.addStringPermission(a);
         }
        //到数据库查询当前登录用户的授权字符串
        //获取当前登录用户
        Subject subject = SecurityUtils.getSubject();
       /* User user = (User)subject.getPrincipal();
        User dbUser = userSerivce.findById(user.getId());*/

       /* info.addStringPermission(dbUser.getPerms());*/

        return info;
    }


    /**
     * 执行认证逻辑
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
        System.out.println("执行认证逻辑");

        //编写shiro判断逻辑，判断用户名和密码
        //1.判断用户名
        UsernamePasswordToken token = (UsernamePasswordToken)arg0;

       /* User user = userSerivce.findByName(token.getUsername());*/

       /* if(user==null){
            //用户名不存在
            return null;//shiro底层会抛出UnKnowAccountException
        }*/

        /*//2.判断密码
        return new SimpleAuthenticationInfo(user,user.getPassword(),"");*/
        return null;
    }

}
