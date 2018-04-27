
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Denilson
 */
public class Dao_Fornitori 
{
	public List<Fornitori> getAllFornitori()
	{
		Statement stmt;
		ResultSet result;
		ConnectionSQLserver c=new ConnectionSQLserver();
        Connection conex=null;
        List<Fornitori> lista=new ArrayList<>();
        
        
        try {
        	conex=c.connesioneDB();
            stmt = conex.createStatement();
            String query="select * from VW_BodyRentalVendor;";
            result = null;
            //String pa,us;
            result = stmt.executeQuery(query);
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
		     }	    	catch (Exception e) 
					        {
							e.getMessage();e.printStackTrace();System.out.println("error here DAO");
					        }
        return lista;
}
	
	public Fornitori getFornitore(String partitaIVA) 
	{
	Fornitori fornitore=null;
	PreparedStatement myPrep=null;
	ResultSet result = null;
	ConnectionSQLserver c=new ConnectionSQLserver();
    Connection conex=null;
    
	    try {
	    	conex=c.connesioneDB();
	    	String query="SELECT * FROM VW_BodyRentalVendor where VATRegistration_No_= ?";
	    	myPrep=conex.prepareStatement(query);
	    	myPrep.setString(1, partitaIVA);
	    	result=myPrep.executeQuery();
	    	
		    	if(result.next()) 
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
			               
			            fornitore=new Fornitori(id,company, companyName_No_, 
			            		name, name2, address, address2, city, post_code, 
			            		countryRegion_code, e_mail, phone_no_, fax_no_, 
			            		vatRegistration_no_, blocked_qualification, qualification_notes);
			            
			    	}
	
				}
			   		catch (Exception e) 
					    {
						e.printStackTrace();
						System.out.println("qui l'errore asd"+
						e.getMessage());
					    }
	    finally {
			try {
				myPrep.close();
				result.close();
				conex.close();
			} catch (Exception e2) {
				System.out.println("i m heaaarr ahahaahha");
			}
		}

	    return fornitore;
    
    }
	
	public Fornitori getFornitoreByIva(String pIva) 
	{
		PreparedStatement myPrep=null;
		ResultSet result=null;
		ConnectionSQLserver c=new ConnectionSQLserver();
	    Connection conex=null;
	    Fornitori fornitore=null;
	    
		
	    String query="select * from VW_BodyRentalVendor where VATRegistration_No_=?";
	    
	    try {
	    	conex=c.connesioneDB();
	    	myPrep=conex.prepareStatement(query);
	    	myPrep.setString(1, pIva);
	    	result=myPrep.executeQuery();
	    	}
	    catch (Exception e) {
			// TODO: handle exception
		}
	    finally {
			try {
				myPrep.close();
				result.close();
				conex.close();
			} catch (Exception e2) {
				System.out.println("i m heaaarr ahahaahha");
			}
		}
	    
		return fornitore;
		
	}
	
	}

    
    
//
//    stmt = conex.createStatement();
//    result = null;
//    //String pa,us;
//    result = stmt.executeQuery(query);
//            if (result.next())
//    		{
//    		int id= result.getInt(1);
//            String company=result.getString(2);
//            String companyName_No_=result.getString(3);
//            String name=result.getString(4);
//            String name2=result.getString(5);
//            String address=result.getString(6);
//            String address2=result.getString(7);
//            String city=result.getString(8);
//            String post_code=result.getString(9);
//            String countryRegion_code=result.getString(10);
//            String e_mail=result.getString(11);
//            String phone_no_=result.getString(12);
//            String fax_no_=result.getString(13);
//            String vatRegistration_no_=result.getString(14);
//            int blocked_qualification=result.getInt(15);
//            int qualification_notes=result.getInt(16);                  
//               
//           fornitore=new Fornitori(id,company, companyName_No_, 
//            		name, name2, address, address2, city, post_code, 
//            		countryRegion_code, e_mail, phone_no_, fax_no_, 
//            		vatRegistration_no_, blocked_qualification, qualification_notes);
//    		}
//            else {System.out.println("Partita Iva inesistente");}
//     }	    	catch (Exception e) 
//			        {
//					e.getMessage();e.printStackTrace();System.out.println("error here DAO");
//			        }
//return fornitore;
//
//}