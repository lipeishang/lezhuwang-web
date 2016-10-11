package lezhuwang.dao;

import lezhuwang.idao.IUserDAO;
import lezhuwang.model.User;
import lezhuwang.util.DBUtil;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public  class UserDAO implements IUserDAO {
    public User select(int userId) {
       return null;
    }
    public int update(User user) {
        int rtn=0;
        try {
            String sql = "update user set " + "user_name = '" + user.getUserName() + "', " 
            			+ "user_login_name = '" + user.getUserLoginName()+ "',"
            			+ "user_password = '" + user.getUserPasswd() + "'," 
            			+ "user_sex = '" + user.getUserSex() + "'," 
            			+ "user_location = '" + user.getUserLocation() + "',"
            			+ "user_email = '" +  user.getUserEmail() + "',"
            			+ "user_phone = '" +  user.getUserPhone() + "'," 
            			+ "user_acount =" + user.getUserAcount() + ","
            			+ "user_trust =" + user.getUserTrust() + "," 
            			+ "user_pic_path = '" + user.getUserPicPath() + "'";


            sql += " where user_name = " + "'"+user.getUserId()+"'";

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
    public int insert(User user) {
        int rtn=0;
        try {
            String sql = "insert user(user_name , user_login_name, user_password, user_sex, "
            		 + "user_location , user_email, user_phone, user_acount, user_trust, user_pic_path) "
                     +" values('"
                     + user.getUserName() + "', '" 
                     + user.getUserLoginName() + "','"
                     + user.getUserPasswd() + "','" 
                     + user.getUserSex() + "','" 
                     + user.getUserLocation() + "','" 
                     + user.getUserEmail() + "','" 
                     + user.getUserPhone() + "'," 
                     + user.getUserAcount() + "," 
                     + user.getUserTrust() + ",'" 
                     + user.getUserPicPath() + "');" ;
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
            String sql = "delect from user where 'user_id = '" + ID;
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
	public List<User> select(String userId) {
		List<User> list = new ArrayList<User>();
        try {
            String sql = "select * from user where user_id = " + userId + ";";
            DBUtil db = new DBUtil();
            //System.out.println(sql);
            db.openConnection();
            ResultSet rst = db.execQuery(sql);
            if(rst != null) {
                while(rst.next()) {
                	User user = new User();
                    user.setUserId(rst.getInt("user_id"));
                    user.setUserName(rst.getString("user_name"));
                    user.setUserLoginName(rst.getString("user_login_name"));
                    user.setUserPasswd(rst.getString("user_password"));
                    user.setUserSex(rst.getString("user_sex"));
                    user.setUserLocation(rst.getString("user_location"));
                    user.setUserEmail(rst.getString("user_email"));
                    user.setUserPhone(rst.getString("user_phone"));
                    user.setUserAcount(rst.getFloat("user_acount"));
                    user.setUserTrust(rst.getInt("user_trust"));
                    user.setUserPicPath(rst.getString("user_pic_path"));
                    list.add(user);
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
