package lzw.dao;

import lzw.idao.IManagerDAO;
import lzw.model.Manager;
import lzw.util.DBUtil;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public  class ManagerDAO implements IManagerDAO {
    public Manager select(int managerId) {
        
        return null;
    }
    public int update(Manager manager) {
        int rtn=0;
        try {
            String sql = "update Manager set " + "manager_name = '" + manager.getManagerName() + "', " 
            			+ "manager_login_name = '" + manager.getManagerLoginName()+ "',"
            		    + "manager_password = '" + manager.getManagerPasswd() + "'," 
            			+ "manager_email = '" +  manager.getManagerEmail() + "',"
            		    + "manager_phone = '" +  manager.getManagerPhone() + "'," 
            			+ "manager_pic_path = '" + manager.getManagerPicPath() + "'";


            sql += " where manager_name = " + "'"+manager.getManagerId()+"'";

         //   System.out.println(sql);
            DBUtil db = new DBUtil();
            db.openConnection();
            rtn =db.execCommand(sql);
            db.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rtn;
    }
    public int insert(Manager manager) {
        int rtn=0;
        try {
            String sql = "insert Manager(manager_name , manager_login_name, manager_password, manager_email, manager_phone, manager_pic_path) "
                     +" values('"
                     + manager.getManagerName() + "','" 
                     + manager.getManagerLoginName() + "','"
                     + manager.getManagerPasswd() + "','" 
                     + manager.getManagerEmail() + "','" 
                     + manager.getManagerPhone() + "','" 
                     + manager.getManagerPicPath() + "')";
            //System.out.println(sql);
            DBUtil db = new DBUtil();
            db.openConnection();
            rtn =db.execCommand(sql);
            db.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rtn;
    }
	@Override
	public int delete(int ID) {
		int rtn=0;
        try {
            String sql = "delect from Manager where 'manager_id = '" + ID;
            //System.out.println(sql);
            DBUtil db = new DBUtil();
            db.openConnection();
            rtn =db.execCommand(sql);
            db.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rtn;
	}
	@Override
	public List<Manager> select(String managerId) {
		List<Manager> list = new ArrayList<Manager>();
        try {
            String sql = "select * from manager where manager_id = " + managerId + ";";
            DBUtil db = new DBUtil();
            //System.out.println(sql);
            db.openConnection();
            ResultSet rst = db.execQuery(sql);
            if(rst != null) {
                while(rst.next()) {
                	Manager manager = new Manager();
                    manager.setManagerId(rst.getInt("manager_id"));
                    manager.setManagerName(rst.getString("manager_name"));
                    manager.setManagerLoginName(rst.getString("manager_login_name"));
                    manager.setManagerPasswd(rst.getString("manager_password"));
                    manager.setManagerEmail(rst.getString("manager_email"));
                    manager.setManagerPhone(rst.getString("manager_phone"));
                    manager.setManagerPicPath(rst.getString("manager_pic_path"));
                    list.add(manager);
                }
            }
            db.close(rst);
            db.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
        return list;
	}
	
}

