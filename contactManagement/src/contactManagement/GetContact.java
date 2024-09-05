package contactManagement;

import java.sql.*;

public class GetContact {
      
	public void displayContact() throws SQLException {
		String query="select * from contact ";
		Connection con=DBConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
		System.out.println("contact id:"+rs.getInt(1)+" name:"+rs.getString(2)+" phone_no:"+rs.getLong(3)+" email_id:"+rs.getString(4));
		}
		con.close();
		
	}
}
