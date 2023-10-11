made changes here
import java.sql.*;

class db{

		private Connection con;
		private Statement stm;
		private PreparedStatement pst;
		private ResultSet rst;

	public db(){

		try{

			Class.forName("com.mysql.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","");
			System.out.println("Connection Established....");

		}catch(Exception e){}
	}

	public void insert(int code, String name, int score) throws Exception{
		pst=con.prepareStatement("INSERT INTO CRICKETER(CCODE,NAME,SCORE) VALUES(?,?,?)");
		pst.setInt(1,code);
		pst.setString(2,name);
		pst.setInt(3,score);
		pst.executeUpdate();
		System.out.println("table updated...");
	}

	public void display() throws Exception{
		pst=con.prepareStatement("SELECT * FROM CRICKETER");
		rst=pst.executeQuery();
		while(rst.next()){
			System.out.printf("%-15s%-20s%-5s\n",rst.getString(1),rst.getString(2),rst.getString(3));
		}
	}

	public void update(int code,String name,int score) throws Exception{
		pst=con.prepareStatement("UPDATE CRICKETER SET NAME=?,SCORE=? WHERE CCODE=?");
		pst.setString(1,name);
		pst.setInt(2,score);
		pst.setInt(3,code);
		pst.executeUpdate();
	}

	public void search(int code) throws Exception{
		pst=con.prepareStatement("SELECT * FROM CRICKETER WHERE CCODE=?");
		pst.setInt(1,code);
		rst=pst.executeQuery();
		if(rst.next()){
			System.out.printf("%-15s%-20s%-5s",rst.getString(1),rst.getString(2),rst.getString(3));
		}
		else{
			System.out.println("Person not found");
		}
	}

	public void delete(String name) throws Exception{
		pst=con.prepareStatement("DELETE FROM CRICKETER WHERE NAME=?");
		pst.setString(1,name);
		pst.executeUpdate();
	}	

	public void close() throws Exception{
		con.close();
		System.out.println("Connection closed....");
		}
}