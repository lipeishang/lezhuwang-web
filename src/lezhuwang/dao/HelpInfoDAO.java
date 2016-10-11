package lezhuwang.dao;
import lezhuwang.idao.IHelpInfoDAO;
import lezhuwang.model.HelpInfo;
import lezhuwang.util.DBUtil;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;


public  class HelpInfoDAO implements IHelpInfoDAO {
    public HelpInfo select(int HelpInfoId) {
        
        return null;
    }
    public int update(HelpInfo helpInfo) {
        int rtn=0;
        try {
            String sql = "update help_info set " +  "help_info_id =" + helpInfo.getHelpInfoId() + ","
            		 + "help_info_text = '" + helpInfo.getHelpInfoText() + "',"
            		 + "be_help_user_id =" + helpInfo.getBeHelpUserId() + ","
            		 + "help_user_id =" + helpInfo.getHelpUserId() + ","
            		 + "help_location = '" + helpInfo.getHelpLocation() + "',"
            		 + "help_tag =" + helpInfo.getHelpTag() + ","
            		 + "help_create_date ='" + helpInfo.getHelpCreateDate() + "',"
            		 + "help_dieline_date ='" + helpInfo.getHelpDielineDate() + "',"
            		 + "help_readed_num =" + helpInfo.getHelpReadedNum();


            sql += " where HelpInfo_id = " + "'" + helpInfo.getHelpInfoId() + "';";

            System.out.println(sql);
            DBUtil db = new DBUtil();
            db.openConnection();
            rtn =db.execCommand(sql);
            db.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rtn;
    } 
    public int insert(HelpInfo helpInfo) {
        int rtn=0;
        try {
            String sql = "insert help_info(help_info_id, help_info_text, be_help_user_id,"
            		+ "help_user_id, help_location, help_tag,help_create_date,"
            		+ "help_dieline_date, help_readed_num) "
                    +" values("
                    + helpInfo.getHelpInfoId() + ",'"
                    + helpInfo.getHelpInfoText() + "',"
                    + helpInfo.getBeHelpUserId() + ","
                    + helpInfo.getHelpUserId() + ",'"
                    + helpInfo.getHelpLocation() + "',"
                    + helpInfo.getHelpTag() + ",'"
                    + helpInfo.getHelpCreateDate() + "','"
                    + helpInfo.getHelpDielineDate() + "',"
                    + helpInfo.getHelpReadedNum()
                    + ");" ;
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
            String sql = "delect from help_info where 'helpInfo_id = '" + ID;
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
	public List<HelpInfo> select(String helpInfoId) {
		List<HelpInfo> list = new ArrayList<HelpInfo>();
        try {
            String sql = "select * from help_info where help_info_id = "
                    + " '" + helpInfoId +"'";
            DBUtil db = new DBUtil();
            //System.out.println(sql);
            db.openConnection();
            ResultSet rst = db.execQuery(sql);
            if(rst != null) {
                while(rst.next()) {
                	HelpInfo helpInfo = new HelpInfo();
                    helpInfo.setHelpInfoId(rst.getInt("help_info_id"));
                    helpInfo.setHelpInfoText(rst.getString("help_info_text"));
                    helpInfo.setBeHelpUserId(rst.getInt("be_help_user_id"));
                    helpInfo.setHelpUserId(rst.getInt("help_user_id"));
                    helpInfo.setHelpLocation(rst.getString("help_location"));
                    helpInfo.setHelpTag(rst.getInt("help_tag"));
                    helpInfo.setHelpCreateDate(rst.getTime("help_create_date"));
                    helpInfo.setHelpDielineDate(rst.getTime("help_dieline_date"));
                    helpInfo.setHelpReadedNum(rst.getInt("help_readed_num"));
                    list.add(helpInfo);
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

