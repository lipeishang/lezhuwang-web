package lzw.model;

import java.sql.Time;

public class HelpInfo {
	 	private int HelpInfoId;
		private String HelpInfoText;
		private int BeHelpUserId;
		private int HelpUserId;
		private String HelpLocation;
		private int HelpTag;
		private Time HelpCreateDate;
		private Time HelpDielineDate;
		private int HelpReadedNum;
	  

		public HelpInfo () {}
		public HelpInfo(int HelpInfoId, String HelpInfoText, int BeHelpUserId, int HelpUserId, 
				String HelpLocation, int HelpTag, Time HelpCreateDate, Time HelpDielineDate, 
				int HelpReadedNum) {
			this.HelpInfoId = HelpInfoId;
			this.HelpInfoText = HelpInfoText;
			this.BeHelpUserId = BeHelpUserId;
			this.HelpUserId = HelpUserId;
	        this.HelpLocation = HelpLocation;
	        this.HelpTag = HelpTag;
	        this.HelpCreateDate = HelpCreateDate;
	        this.HelpDielineDate = HelpDielineDate;
	        this.HelpReadedNum = HelpReadedNum;
		}
		public int getHelpInfoId() {
			return HelpInfoId;
		}
		public void setHelpInfoId(int helpInfoId) {
			HelpInfoId = helpInfoId;
		}
		public String getHelpInfoText() {
			return HelpInfoText;
		}
		public void setHelpInfoText(String helpInfoText) {
			HelpInfoText = helpInfoText;
		}
		public int getBeHelpUserId() {
			return BeHelpUserId;
		}
		public void setBeHelpUserId(int beHelpUserId) {
			BeHelpUserId = beHelpUserId;
		}
		public int getHelpUserId() {
			return HelpUserId;
		}
		public void setHelpUserId(int helpUserId) {
			HelpUserId = helpUserId;
		}
		public String getHelpLocation() {
			return HelpLocation;
		}
		public void setHelpLocation(String helpLocation) {
			HelpLocation = helpLocation;
		}
		public int getHelpTag() {
			return HelpTag;
		}
		public void setHelpTag(int helpTag) {
			HelpTag = helpTag;
		}
		public Time getHelpCreateDate() {
			return HelpCreateDate;
		}
		public void setHelpCreateDate(Time helpCreateDate) {
			HelpCreateDate = helpCreateDate;
		}
		public Time getHelpDielineDate() {
			return HelpDielineDate;
		}
		public void setHelpDielineDate(Time helpDielineDate) {
			HelpDielineDate = helpDielineDate;
		}
		public int getHelpReadedNum() {
			return HelpReadedNum;
		}
		public void setHelpReadedNum(int helpReadedNum) {
			HelpReadedNum = helpReadedNum;
		}
}
