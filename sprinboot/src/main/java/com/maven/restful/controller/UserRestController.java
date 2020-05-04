package com.maven.restful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maven.restful.pojo.User;
import com.maven.restful.service.UserService;



/**
 * 
* Title: UserRestController
* Description: 
* 用户控制层
* Version:1.0.0  
* @author chengl
* @date 2020年5月4日
 */
@RestController
@RequestMapping(value = "/api")
public class UserRestController {
	@Autowired
    private UserService userService;
 
	@RequestMapping(value = "/user", method = RequestMethod.POST)
    public boolean addUser(@RequestBody User user) {
    	System.out.println("开始新增...");
        return userService.addUser(user);
    }
    
	@RequestMapping(value = "/user", method = RequestMethod.PUT)
    public boolean updateUser(@RequestBody User user) {
    	System.out.println("开始更新...");
        return userService.updateUser(user);
    }
	
	@RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "userId", required = true) int userId) {
    	System.out.println("开始删除...");
        return userService.deleteUser(userId);
    }
	
	/*
	 * @RequestMapping(value = "/userName", method = RequestMethod.GET) public User
	 * findByUserName(@RequestParam(value = "userName", required = true) String
	 * userName) { System.out.println("开始查询..."); return
	 * userService.findUserByName(userName); }
	 */
    
    @RequestMapping(value = "/userId", method = RequestMethod.GET)
    public User findByUserId(@RequestParam(value = "userId", required = true) String userId) {
    	System.out.println("开始查询...");
        return userService.findUserById(userId);
    }
    
    @RequestMapping(value = "/userName", method = RequestMethod.GET)
    public User findByUserName(@RequestParam(value = "userName", required = true) String userName) {
    	System.out.println("开始查询...");
        return userService.findUserByName(userName);
    }
    
    @RequestMapping(value = "/userAll", method = RequestMethod.GET)
    public List<User> findByUserAge() {
    	System.out.println("开始查询所有数据...");
        return userService.findAll();
    }
}
