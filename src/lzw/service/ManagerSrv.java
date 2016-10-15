package lzw.service;

import java.util.List;
import lzw.idao.DAOFactory;
import lzw.idao.IManagerDAO;
import lzw.model.Manager;

public class ManagerSrv {
	private IManagerDAO managerDAO = DAOFactory.creatManagerDAO();
	
	public int add(Manager manager){
		return managerDAO.insert(manager); 		
	}
	
	public int modify(Manager manager){
		return managerDAO.update(manager); 		
	}
	
	public int delete(int ID){
		return managerDAO.delete(ID); 		
	}
	
	public List<Manager> Fetch(String condt){
		return managerDAO.select(condt);		
	}
	
	public List<Manager> FetchAll(){
		return managerDAO.select("");		
	}
	
}