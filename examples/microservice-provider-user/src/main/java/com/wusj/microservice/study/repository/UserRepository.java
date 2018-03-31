package com.wusj.microservice.study.repository;

import com.wusj.microservice.study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wusj on 2018/3/27.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
