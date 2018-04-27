/**
 * 
 */
package model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.*;
/**
 * @author Denilson
 */
public class ConnectionSQLserver {
	
	
	public Connection connesioneDB() throws SQLException 
	{
		 	Connection conn = null;	        
	        String dbName = "DB_FORNITORI";
	        String serverip="localhost";
	        String serverport="1433";
	        String url = "jdbc:sqlserver://"+serverip+"\\SQLEXPRESS:"+serverport+";databaseName="+dbName+"";
	        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	        String databaseUserName = "sa";
	        String databasePassword = "admin1234";
	        try {
	            Class.forName(driver).newInstance();
	            conn = DriverManager.getConnection(url, databaseUserName, databasePassword);
	            if(conn!=null) 
	            	{
	            	System.out.println("Connessione Riuscita");
	            	}
	            }
	        		catch (Exception e) 
			        		{
			            	e.printStackTrace();
			            	e.getMessage();
			            	System.out.println("errore qui");
			        		}
		return conn;
	}
	
//	public List<Fornitori> getFornitori() {
//	List<Fornitori>listafornitori=new ArrayList<>();
//	
//	Statement stmt=null;
//	ResultSet rs = null;
//	Connection con = null;
//    
//	try {
//        Context ctx = (Context) new InitialContext().lookup("java:comp/env");
//        BasicDataSource ds = (BasicDataSource)ctx.lookup("jdbc/sqlserver");
//        con = ds.getConnection();
//
//        String sql = "select * from DB_FORNITORI.dbo.VW_BodyRentalVendor";     
//        stmt = con.createStatement();
//        rs = stmt.executeQuery(sql);
//        //Add in all info
//        while (rs.next())
//        		{
//        		int id= rs.getInt(1);
//                String company=rs.getString(2);
//                String companyName_No_=rs.getString(3);
//                String name=rs.getString(4);
//                String name2=rs.getString(5);
//                String address=rs.getString(6);
//                String address2=rs.getString(7);
//                String city=rs.getString(8);
//                String post_code=rs.getString(9);
//                String countryRegion_code=rs.getString(11);
//                String e_mail=rs.getString(11);
//                String phone_no_=rs.getString(12);
//                String fax_no_=rs.getString(13);
//                String vatRegistration_no_=rs.getString(14);
//                int blocked_qualification=rs.getInt(2);
//                int qualification_notes=rs.getInt(2);                  
//                   
//                Fornitori f=new Fornitori(id,company, companyName_No_, 
//                		name, name2, address, address2, city, post_code, 
//                		countryRegion_code, e_mail, phone_no_, fax_no_, 
//                		vatRegistration_no_, blocked_qualification, qualification_notes);   
//                
//                listafornitori.add(f);
//        	    }
//        }
//    		catch (SQLException | NamingException e) 
//    		{
//    			System.out.println("sonoo qui 1");
//            e.printStackTrace();
//        }
//			finally
//    		{
//            try { con.close();  } 
//            catch (SQLException e) {System.out.println("sonoo qui 2");}
//            try { rs.close();   } catch (SQLException | NullPointerException e) {System.out.println("sonoo qui 3");}
//            try { stmt.close(); } catch (SQLException e) {System.out.println("sonoo qui 4");}
//    		} // End finally (try catch)
//	return listafornitori;
//	}
	
	public static void main(String[] args) {
		Statement stmt;
		ResultSet result;
		ConnectionSQLserver c=new ConnectionSQLserver();
        Connection conex=null;
        List<Fornitori> lista=new ArrayList<>();
        
        
        try {
        	conex=c.connesioneDB();
            stmt = conex.createStatement();
            result = null;
            //String pa,us;
            result = stmt.executeQuery("select * from VW_BodyRentalVendor;");
            while (result.next())
    		{
    		int id= result.getInt(1);
            String company=result.getString(2);
            String companyName_No_=result.getString(3);
            String name=result.getString(4);
            String name2=result.getString(5);
            String address=result.getString(6);
            String address2=result.getString(7);
            String city=result.getString(8);
            String post_code=result.getString(9);
            String countryRegion_code=result.getString(10);
            String e_mail=result.getString(11);
            String phone_no_=result.getString(12);
            String fax_no_=result.getString(13);
            String vatRegistration_no_=result.getString(14);
            int blocked_qualification=result.getInt(15);
            int qualification_notes=result.getInt(16);                  
               
            Fornitori f=new Fornitori(id,company, companyName_No_, 
            		name, name2, address, address2, city, post_code, 
            		countryRegion_code, e_mail, phone_no_, fax_no_, 
            		vatRegistration_no_, blocked_qualification, qualification_notes);   
            
            lista.add(f);
            }
            
            for (int i = 0; i < lista.size(); i++)
            {
            	System.out.println("lista --> "+lista.get(i));
			}
            
            
//            if(result.next()) {
//            	System.out.println("connesssooooooo wiiii");
//            }
//            while (result.next()) {
//                us=result.getString("uname");
//                pa = result.getString("pass");              
//                System.out.println(us+"  "+pa);
//            }

            conex.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println();
        }
    }
	
	
		
	}
		/* Connection conn = null;
		 
	        try {
	        	  String dbURL = "jdbc:sqlserver://localhost:1433\\DB_FORNITORI";
//	            String user = "sa";
//	            String pass = "adminadmin";
	            conn = DriverManager.getConnection(dbURL);
	            if (conn != null) {
	                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
	                System.out.println("Driver name: " + dm.getDriverName());
	                System.out.println("Driver version: " + dm.getDriverVersion());
	                System.out.println("Product name: " + dm.getDatabaseProductName());
	                System.out.println("Product version: " + dm.getDatabaseProductVersion());
	            }
	 
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	            ex.getMessage();
	        } finally {
	            try {
	                if (conn != null && !conn.isClosed()) {
	                    conn.close();
	                }
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	            }
	        }
	    }*/

	


