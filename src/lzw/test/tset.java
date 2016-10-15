package lzw.test;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import lzw.model.HelpInfo;
import lzw.model.Manager;
import lzw.model.User;
import lzw.service.HelpInfoSrv;
import lzw.service.ManagerSrv;
import lzw.service.UserSrv;

public class tset {

	public static void main(String[] args) {
		UserSrv userSrv = new UserSrv();
		ManagerSrv managerSrv = new ManagerSrv();
		HelpInfoSrv helpInfoSrv = new HelpInfoSrv();
		User user = new User();
		Manager manager = new Manager();
		HelpInfo helpInfo = new HelpInfo();
		
		//user.setUserId(1);
		user.setUserName("wang1");
		user.setUserLoginName("wang1@work.com");
		user.setUserPasswd("admin");
		user.setUserLocation("西安");
		user.setUserSex("男");
		user.setUserPhone("123456");
		user.setUserEmail("wang1@work.com");
		user.setUserAcount(100);
		user.setUserTrust(66);
		user.setUserPicPath("src/image/img1.jpg");
		
		userSrv.add(user);
		User user1 = userSrv.Fetch("1").get(0);
		System.out.print(user1.getUserName() + "\n");
		
		//manager.setManagerId(1);
		manager.setManagerName("ren");
		manager.setManagerLoginName("ren@work.com");
		manager.setManagerPasswd("admin");
		manager.setManagerPhone("123456");
		manager.setManagerEmail("ren@work.com");
		manager.setManagerPicPath("src/image/img2.jpg");
		
		managerSrv.add(manager);
		Manager manager1 = managerSrv.Fetch("1").get(0);
		System.out.print(manager1.getManagerName() + "\n");
		
		//helpInfo.setHelpInfoId(1);
		helpInfo.setHelpInfoText("取快递");
		helpInfo.setHelpLocation("西安");
		helpInfo.setHelpUserId(1);
		helpInfo.setBeHelpUserId(2);
		helpInfo.setHelpTag(0);
		helpInfo.setHelpCreateDate(new Time(1));
		helpInfo.setHelpDielineDate(new Time(1));
		helpInfo.setHelpReadedNum(0);
		
		helpInfoSrv.add(helpInfo);
		HelpInfo helpInfo1 = helpInfoSrv.Fetch("1").get(0);
		System.out.print(helpInfo1.getHelpInfoText() + "\n");
	}

}
