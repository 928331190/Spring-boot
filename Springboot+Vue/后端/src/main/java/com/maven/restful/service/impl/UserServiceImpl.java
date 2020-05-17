package com.maven.restful.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.restful.dao.UserDao;
import com.maven.restful.pojo.User;
import com.maven.restful.service.UserService;

/**
 * 
* Title: UserServiceImpl
* Description: 
* 用户操作实现类 
* Version:1.0.0  
* @author chengl
* @date 2020年5月4日
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
    private UserDao userDao;
	
	
	@Override
	public boolean addUser(User user) {
		boolean flag=false;
		try{
			userDao.addUser(user);
			flag=true;
		}catch(Exception e){
			System.out.println("新增失败!");
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean updateUser(User user) {
		boolean flag=false;
		try{
			userDao.updateUser(user);
			flag=true;
		}catch(Exception e){
			System.out.println("修改失败!");
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean deleteUser(int id) {
		boolean flag=false;
		try{
			userDao.deleteUser(id);
			flag=true;
		}catch(Exception e){
			System.out.println("删除失败!");
			e.printStackTrace();
		}
		return flag;
	}

	/*
	 * @Override public User findUserByName(String userName) { return
	 * userDao.findUserByName(userName); }
	 */

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}
	
	@Override
	public User findUserById(String userId) {
		return userDao.findUserById(userId);
	}
	
	
	 @Override public User findUserByName(String userName) { return
	 userDao.findUserByName(userName); }
	 
}
