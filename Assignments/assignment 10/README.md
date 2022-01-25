## JDBC CRUD Operation
* See screenshots inside images folder's README.md
### Create
```package com.prajwal.db;
import java.sql.*;
public class InsertDemo {
    public static void main(String[] args) throws SQLException{
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbconnect", "root", "prazal123");

            Statement st = con.createStatement();

            String sql = "INSERT INTO artists VALUES (5,'Martin Jensen','unranked')";
            st.executeUpdate(sql);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
```
### Read
```
package com.prajwal.db;

import java.sql.*;

public class ReadDemo {
    public static void main(String[] args) throws SQLException {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbconnect", "root", "prazal123");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from artists");
            System.out.println("Id"+"\t"+"Name"+"\t"+"\t"+"\t"+"Rank");
            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+"\t"+rs.getString(3));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
```
### Update
```
package com.prajwal.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static void main(String[] args) throws SQLException {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbconnect", "root", "prazal123");
            Statement st = con.createStatement();
            String st1= "update artists set name='Knife Party' where id = 5";
            st.executeUpdate(st1);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
```
### Delete
```
package com.prajwal.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteDemo {
    public static void main(String[] args) throws SQLException {
        try{
            Scanner sc = new Scanner (System.in);
            System.out.println ("enter artists id no\n");
            int id = sc.nextInt ();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbconnect", "root", "prazal123");

            Statement st = con.createStatement();
            int row = st.executeUpdate ("delete from artists where id = " +id);
            if (row == 0)
                System.out.println ("artist does not exist");
            else
                System.out.println ("artist removed successfully");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
```