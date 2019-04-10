import java.sql.*;
class MysqlCon{
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy","root","");
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from cashier"); 
			rs.first(); 
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(6));
			rs.last(); 
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(6));
			rs.absolute(2); 
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(6));  
			con.close();  
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}