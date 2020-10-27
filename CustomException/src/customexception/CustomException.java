/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customexception;

import java.sql.SQLException;

/**
 *
 * @author personal
 */
public class CustomException {

    public static void testMethod()throws UnauthorizedOriginException{
        System.out.println("hi i'm in....");
        // this should contain SQL Statements
        
    }
    
    public static void main(String[] args) {
        try {
            CustomException.testMethod();
        } catch (SQLException e) {
            throw new UnauthorizedOriginException("Faile to execute TestMethod");
        }
    }
}
