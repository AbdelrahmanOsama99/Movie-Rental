/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie_rental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Boda
 */
public class Movie_Rental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic
        
        Connection myconShop= null; //To connect to database
        Statement mystatShop= null; //setting the query 
        ResultSet myresShop= null; //preservering the result after applying the query
        
        
        
        String url= "jdbc:sqlserver://LAPTOP-9B39BBIR:1433;databaseName=MOVIE_RENTAL";
        String user = "Abdo";
        String password="Abdo123";
        
        
        int Payment_ID;
        float Discount;
        Scanner input = new Scanner(System.in);
        
        
        //Codes for reading data from database  
        String query="Select * from cash";
        
        // try catch block
        try{
            
          //making the connection
          myconShop = DriverManager.getConnection(url, user, password);
          mystatShop =  myconShop.createStatement();
          myresShop = mystatShop.executeQuery(query);
          
          while(myresShop.next()){
              Payment_ID = myresShop.getInt(1);
              Discount=myresShop.getFloat(2);
              System.out.println("\t"+Payment_ID+"\t"+Discount);
          }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        //code for writing to database
        /*System.out.println("Please enter ID");
        Payment_ID = input.nextInt();
        input.nextLine();
        System.out.println("Enter Discount");*/
        
        
        
        
        
    }
    
}
