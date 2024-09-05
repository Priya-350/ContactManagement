package contactManagement;

import java.sql.*;
public class InsertContact {

    public void insertContact(String name,String ph_no,String email_id) throws SQLException {
    	String query="insert into contact(name,ph_no,email_addr) values(?,?,?)";
    	Connection con=DBConnection.getConnection();
    	PreparedStatement pst=con.prepareStatement(query);
    	pst.setString(1,name);
    
    	pst.setString(2,ph_no);
    	pst.setString(3, email_id);
    	int rows=pst.executeUpdate();
    	if(rows>0) {
    	    System.out.println("Contact Inserted Successfully!!");
    	}
    	else {
    		System.out.println("sorry can't insert contact!!");
    	}
    	
    }
}
