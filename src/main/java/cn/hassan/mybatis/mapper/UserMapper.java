package cn.hassan.mybatis.mapper;

import cn.hassan.mybatis.pojo.User;
import cn.hassan.mybatis.vo.QueryVo;

public interface UserMapper {

	User findUserById(Integer id);

	User findUserByUsername(QueryVo vo);
}
