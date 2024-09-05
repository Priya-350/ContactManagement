package contactManagement;

import java.sql.*;

public class UpdateContact {
	public void updateName(String name,int id) throws SQLException {
		
		
		String query="update contact set name=? where id=?";
				Connection con= DBConnection.getConnection();
				PreparedStatement pst=con.prepareStatement(query);
				pst.setString(1,name);
				pst.setInt(2, id);
				int rows=pst.executeUpdate();
				if(rows>0) {
		    	    System.out.println("Contact Updated Successfully!!");
		    	}
		    	else {
		    		System.out.println("sorry no contact exist!!");
		    	}		
	}
    public void updatePhone(String phone,int id) throws SQLException {
		
		   String query="update contact set ph_no=? where id=?";
				Connection con= DBConnection.getConnection();
				PreparedStatement pst=con.prepareStatement(query);
				pst.setString(1,phone);
				pst.setInt(2, id);
				int rows=pst.executeUpdate();
				if(rows>0) {
		    	    System.out.println("Contact Updated Successfully!!");
		    	}
		    	else {
		    		System.out.println("sorry no contact exist!!");
		    	}		
	}
public void updateEmail(String email,int id) throws SQLException {
		
		
		String query="update contact set email_addr=? where id=?";
				Connection con= DBConnection.getConnection();
				PreparedStatement pst=con.prepareStatement(query);
				pst.setString(1,email);
				pst.setInt(2, id);
				int rows=pst.executeUpdate();
				if(rows>0) {
		    	    System.out.println("Contact Updated Successfully!!");
		    	}
		    	else {
		    		System.out.println("sorry no contact exist!!");
		    	}		
	}
}
