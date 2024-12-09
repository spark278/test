//package com.spark.betaSite.jpaRepository;
//
//import com.spark.betaSite.models.User.Role;
//import com.spark.betaSite.models.User.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.Optional;
//
//public interface userRepository extends JpaRepository<Long, User> {
//
//    Optional<User> findByMailname(String mailname);
//
//    void insertUserRole(Long userID, Role role);
//}
