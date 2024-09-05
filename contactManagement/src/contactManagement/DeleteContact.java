package contactManagement;
import java.sql.*;
public class DeleteContact {
    public void deleteContact(String name) throws SQLException {
      
    	
    	String query="delete from contact where name=?";
    	Connection con=DBConnection.getConnection();
    	PreparedStatement pst=con.prepareStatement(query);
    	pst.setString(1,name );
    	int rows=pst.executeUpdate();
    	if(rows>0) {
    	    System.out.println("Contact Deleted Successfully!!");
    	}
    	else {
    		System.out.println("sorry no contact exist!!");
    	}
    	
    			
    }
}
