package lzw.service;

import java.util.List;
import lzw.idao.DAOFactory;
import lzw.idao.IUserDAO;
import lzw.model.User;

public class UserSrv {
	private IUserDAO userDAO=DAOFactory.creatUserDAO();
	
	public int add(User user){
		return userDAO.insert(user); 		
	}
	
	public int modify(User user){
		return userDAO.update(user); 		
	}
	
	public int delete(int ID){
		return userDAO.delete(ID); 		
	}
	
	public List<User> Fetch(String condt){
		return userDAO.select(condt);		
	}
	
	public List<User> FetchAll(){
		return userDAO.select("");		
	}

	public boolean checkPwd(String userLoginName, String userPswd) {
		return userDAO.checkPwd(userLoginName, userPswd);
	}
	
}
