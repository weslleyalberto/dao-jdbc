package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args){
       Department obj = new Department(1,"Books");
       Seller seller = new Seller(1,"Weslley","email@gmail.com",new Date(),3000.99, obj);
       System.out.println(obj);
       System.out.println(seller);
    }
}
