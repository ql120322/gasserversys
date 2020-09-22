package com.lianfu.gasserversys.mapper;



import com.lianfu.gasserversys.mode.GasUser;

import java.util.List;

public interface GasUserMapper {


    int  SetUser(GasUser gasUser);
    int GetUserUid(String username);
    String GetUserWherUsername(String username); // 根据账户查 做 账户不可以重名


    List<GasUser> GetUserAll();
  /*  GasUser GetUser(String username,String password);*/

  /*  GasUser GetUserWherUsername(String username); */// 根据账户查 做 账户不可以重名







}
