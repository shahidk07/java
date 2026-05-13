import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;
insert data using java
class Main{
    public static void main(String[] args) {
        //load driver
        Class.forName("drivername");
        Connection con=DriverManager.getConnection("url","user","password");
    
    Statement st=con.createStatement();
    st.executeUpdate("INSERT INTO Students VALUES(1,"Shahid")");
    // read from database
    Resultset rs=st.executeQuery("")
    }

}
