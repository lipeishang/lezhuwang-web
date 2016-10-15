/*==============================================================*/
/* DBMS name:      MySQL 6                                    */
/* Created on:     2016/10/10                                   */
/*==============================================================*/


/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/

DROP TABLE IF EXISTS user;
CREATE TABLE user (
  user_id INT(8) NOT NULL AUTO_INCREMENT,
  user_name VARCHAR(40) NOT NULL,
  user_login_name VARCHAR(40) NOT NULL,
  user_password VARCHAR(40) NOT NULL,
  user_sex CHAR(2) CHECK (user_sex IN ('ÄÐ','Å®')),
  user_location VARCHAR(200) NOT NULL,
  user_email VARCHAR(20) NOT NULL,
  user_phone INT(11) NOT NULL,
  user_acount FLOAT(1) NOT NULL,
  user_trust INT(5) NOT NULL,
  user_pic_path VARCHAR(40) NOT NULL,
  PRIMARY KEY (user_id)
);

/*==============================================================*/
/* Table: manager                                               */
/*==============================================================*/

DROP TABLE IF EXISTS manager;
CREATE TABLE manager (
  manager_id INT(8) NOT NULL AUTO_INCREMENT,
  manager_name VARCHAR(40) NOT NULL,
  manager_login_name VARCHAR(40) NOT NULL,
  manager_password VARCHAR(40) NOT NULL,
  manager_email VARCHAR(20) NOT NULL,
  manager_phone INT(11) NOT NULL,
  manager_pic_path VARCHAR(40) NOT NULL,
  PRIMARY KEY (manager_id)
);

/*==============================================================*/
/* Table: help_info                                             */
/*==============================================================*/

DROP TABLE IF EXISTS help_info;
CREATE TABLE help_info (
    help_info_id INT(8) NOT NULL AUTO_INCREMENT,
    help_info_text VARCHAR(200) NOT NULL,
    be_help_user_id INT(5) NOT NULL,
    help_user_id INT(5) NOT NULL,
    help_location VARCHAR(200) NOT NULL,
    help_tag INT NOT NULL,
    help_create_date DATE NOT NULL,
    help_dieline_date DATE NOT NULL,
    help_readed_num INT NOT NULL,
    PRIMARY KEY (help_info_id),
    KEY FK_help_id (help_user_id),
    KEY FK_be_help_id (be_help_user_id)
);

ALTER TABLE help_info ADD CONSTRAINT FK_help_id FOREIGN KEY (help_user_id) 
   REFERENCES user (user_id) ON DELETE restrict ON UPDATE restrict;

alter table help_info add CONSTRAINT FK_be_help_id FOREIGN KEY (be_help_user_id) 
   REFERENCES user (user_id) ON DELETE restrict ON UPDATE restrict;


