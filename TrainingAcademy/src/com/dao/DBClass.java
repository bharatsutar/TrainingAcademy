package com.dao;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sql.RowSet;
import javax.sql.rowset.RowSetProvider;

public class DBClass {
	
	Connection cn;
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/trainingacademy","root","root");
		
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void closeDB() {
		try {
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Get Data
//    public ResultSet getData(String sql,Object ... args){
//        ResultSet rs=null;
//        try{
//            connectDB();
//            PreparedStatement ps=cn.prepareStatement(sql);
//            int i=1;
//            for(Object obj : args){
//                ps.setObject(i, obj);
//                i++;
//            }
//            rs=ps.executeQuery();
//           
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//        return rs;
//        
//    }
    public RowSet getAll(String query,Object ... args){
    		         RowSet rs=null;
    		         try{
    		             rs=RowSetProvider.newFactory().createJdbcRowSet();
    		             rs.setUrl("jdbc:mysql://localhost:3307/trainingacademy");
    		             rs.setUsername("root");
    		             rs.setPassword("root");
    		             rs.setCommand(query);
    		             for(int i=0;i<args.length;i++)
    		             {
    		                 rs.setObject(i+1, args[i]);
    		             }
    		             rs.execute();
    		         } catch (SQLException ex) {
    		            Logger.getLogger(DBClass.class.getName()).log(Level.SEVERE, null, ex);
    		        }
    		         return rs;
    		     }
    
    
    public int updateDB(String query,Object ... args)throws Exception{
        int row_affeceted=-1;
        connectDB();
      
           PreparedStatement ps=cn.prepareStatement(query);
           for(int i=0;i<args.length;i++)
           {
               if(args[i] instanceof File){
//                   FileInputStream in=new FileInputStream((File)args[i]);                
//                   ps.setBinaryStream(i+1, in);
                   
               }else{
                   ps.setObject(i+1, args[i]);
               }
           }
           row_affeceted=ps.executeUpdate();

        closeDB();
        return row_affeceted;
    }
    
    

    

}