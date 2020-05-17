package com.maven.restful.service;

import java.util.List;

import com.maven.restful.pojo.User;


/**
 * 
* Title: UserService
* Description: 
* 用户接口 
* Version:1.0.0  
* @author chengl
* @date 2020年5月4日
 */
public interface UserService {
	
	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	boolean addUser(User user);
	
	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	boolean updateUser(User user);
	
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	boolean deleteUser(int id);
	
	 /**
     * 根据用户名字查询用户信息
     * @param userName
     */
	User findUserByName(String userName);
    
    /**
     * 查询所有
     * @return
     */
	List<User> findAll();
	
	//根据用户ID查询用户信息
	User findUserById(String userId);

}
