package lzw.service;

import java.util.List;
import lzw.idao.DAOFactory;
import lzw.idao.IHelpInfoDAO;
import lzw.model.HelpInfo;

public class HelpInfoSrv {
	private IHelpInfoDAO helpInfoDAO = DAOFactory.creatHelpInfoDAO();
	
	public int add(HelpInfo helpInfo){
		return helpInfoDAO.insert(helpInfo); 		
	}
	
	public int modify(HelpInfo helpInfo){
		return helpInfoDAO.update(helpInfo); 		
	}
	
	public int delete(int ID){
		return helpInfoDAO.delete(ID); 		
	}
	
	public List<HelpInfo> Fetch(String condt){
		return helpInfoDAO.select(condt);		
	}
	
	public List<HelpInfo> FetchAll(){
		return helpInfoDAO.select("");		
	}
	
}