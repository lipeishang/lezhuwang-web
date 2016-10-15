package lzw.idao;
import lzw.dao.*;

public class DAOFactory {
	public static IUserDAO creatUserDAO(){
		return new UserDAO();
	}
	public static IHelpInfoDAO creatHelpInfoDAO(){
		return new HelpInfoDAO();
	}
	public static IManagerDAO creatManagerDAO(){
		return new ManagerDAO();
	}
}
