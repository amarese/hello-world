package pe.mar.example.helloworld.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import pe.mar.example.helloworld.dto.Friend;

@Mapper
public interface FriendMapper {
    @Select("SELECT * FROM `friends` WHERE `group` = #{group}")
    List<Friend> findByGroup(@Param("group") String group);
}