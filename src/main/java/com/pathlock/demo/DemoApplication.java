package com.pathlock.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.pathlock.demo.entity.Role;
import com.pathlock.demo.entity.User;
import com.pathlock.service.IService;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {

	@Autowired 
	private IService<User> userService;
	
	@Autowired 
	private IService<Role> roleService;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Role role1 = roleService.saveOrUpdate(new Role(1L, "admin"));
		Role role2  = roleService.saveOrUpdate(new Role(2L, "user"));
		System.out.println("******************" + role1.getName());
		System.out.println("******************" + role1.getId());
		System.out.println("******************" + role2.getName());
		System.out.println("******************" + role2.getId());
		
		User user1 = new User();
		user1.setId(1);
		user1.setEmail("test@user.com");
		user1.setName("Test User");
		user1.setMobile("9787456545");
		user1.setRole(roleService.findById(role1.getId()).get());
		user1.setPassword(new BCryptPasswordEncoder().encode("testuser"));
		userService.saveOrUpdate(user1);
		
		User user2 = new User();
		user2.setId(2);
		user2.setEmail("test@admin.com");
		user2.setName("Test Admin");
		user2.setMobile("9787456545");
		user2.setRole(roleService.findById(role2.getId()).get());
		user2.setPassword(new BCryptPasswordEncoder().encode("testadmin"));
		userService.saveOrUpdate(user2);
	}

}
