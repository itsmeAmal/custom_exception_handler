/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customexception;

/**
 *
 * @author amal
 */
public class UnauthorizedOriginException extends Exception{
    public UnauthorizedOriginException(String Message){
        super(Message); 
    }
}

