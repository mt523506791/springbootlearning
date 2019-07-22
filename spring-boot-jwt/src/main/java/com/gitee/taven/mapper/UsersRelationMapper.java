package com.gitee.taven.mapper;

import com.gitee.taven.entity.Users;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

public interface UsersRelationMapper {

	//@Select("select * from users where `username`=#{username}")
	 Users getUserByUsername(String username);
	
}
