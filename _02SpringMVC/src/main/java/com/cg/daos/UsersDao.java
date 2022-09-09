package com.cg.daos;
import org.springframework.data.jpa.repository.JpaRepository;


import com.cg.beans.Users;



public interface UsersDao extends JpaRepository<Users, Long> {
	

}
