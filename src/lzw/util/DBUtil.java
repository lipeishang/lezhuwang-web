package lzw.util;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties; 

public class DBUtil {
	private final String dbConnFile = "/resource/database/jdbc.properties";
	private Connection conn=null;
	private String dbDriver; 
    private String dbURL;
    private String userName;
    private String password;
    
    private void loadConnProperties(){  
        Properties props = new Properties();  
        try {  
        	props.load(new FileInputStream(this.getClass().getResource("/").toString() + dbConnFile));
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        this.dbDriver = props.getProperty("driver");
        this.dbURL = props.getProperty("url");  
        this.userName = props.getProperty("username");  
        this.password = props.getProperty("password");  
     
    }
    
	public boolean openConnection(){
		try {  
			loadConnProperties();
            Class.forName(dbDriver);  
            this.conn = DriverManager.getConnection(dbURL,userName,password);
            return true;
        } catch(ClassNotFoundException classnotfoundexception) {  
              classnotfoundexception.printStackTrace();  
            System.err.println("db: " + classnotfoundexception.getMessage());  
        } catch(SQLException sqlexception) {  
            System.err.println("db.getconn(): " + sqlexception.getMessage());  
        }
		return	false;
	}


	protected void finalize() throws Exception{
		try {
		if(null!=conn)
			conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
     }
	
	
	public ResultSet execQuery(String sql) throws Exception {
		ResultSet rstSet = null;
		try {
			if (null == conn)
				throw new Exception("Database not connected!");
			Statement stmt = conn.createStatement();
			rstSet = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rstSet;
	}

	public ResultSet getInsertObjectIDs(String insertSql) throws Exception{
		ResultSet rst = null;
		try {
			if(null==conn)
				throw new Exception("Database not connected!");
			
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate(insertSql, Statement.RETURN_GENERATED_KEYS);
			rst = stmt.getGeneratedKeys();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rst;
	}

	public int execCommand(String sql) throws Exception{
		int flag = 0;
		try {
			if(null==conn)
				throw new Exception("Database not connected!");
			
			Statement stmt = conn.createStatement();
			flag = stmt.executeUpdate(sql);
			
			stmt.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	
	public PreparedStatement execPrepared(String psql) throws Exception {
		PreparedStatement pstmt = null ;
		try {
			if (null == conn)
				throw new Exception("Database not connected!");
			pstmt = conn.prepareStatement(psql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}
		
	public void close(ResultSet rst) throws Exception {
		try {
			Statement stmt = rst.getStatement();
			rst.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	public void close(Statement stmt) throws Exception {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close() throws SQLException, Exception{
		if(null!=conn){
			conn.close();
			conn=null;
		}
	}
	
	public Connection getConn() {
		return conn;
	}

}
