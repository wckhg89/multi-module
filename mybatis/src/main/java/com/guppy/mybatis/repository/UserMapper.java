package com.guppy.mybatis.repository;

import com.guppy.mybatis.repository.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by kanghonggu on 2017. 6. 25..
 */

@Mapper
public interface UserMapper {

    List<Member> findAll();

    List<Member> findByUserName(@Param("userName") String userName);

    Member findOne(Long id);

    Boolean exists(Long id);

    void save(Member user);

    void update(Member user);

    void delete(Member user);

}
