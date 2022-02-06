package com.goodcakes.service.mapper;

import com.goodcakes.dao.entity.UserEntity;
import com.goodcakes.web.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

 public UserEntity userEntityForm (UserModel userModel){
     UserEntity userEntity = new UserEntity();
     userEntity.setId(userModel.getId());
     userEntity.setEmail(userModel.getEmail());
     userEntity.setLogin(userModel.getLogin());
     userEntity.setPassword(userModel.getPassword());
     return userEntity;
 }

 public UserModel userModelForm(UserEntity userEntity){
     UserModel userModel = new UserModel();
     userModel.setId(userEntity.getId());
     userModel.setEmail(userEntity.getEmail());
     userModel.setPassword(userEntity.getPassword());
     userModel.setLogin(userEntity.getLogin());
     return userModel;
 }
}
