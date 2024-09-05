package contactManagement;

import java.sql.SQLException;
import java.util.Scanner;

public class Contact {
     public static void main(String[] args)  {
    	 Scanner sc=new Scanner(System.in);
    	 int choice;
    	try {
    	 
    	 do {
    		 
    	 System.out.println("1.Display conatct \n 2.Insert Contact \n 3.Update Contact\n 4.Delete Contact\n 5.Exit");
    	 choice=sc.nextInt();
    	 switch(choice) {
    	 case 1:
    		 GetContact gc =new GetContact();
        	 gc.displayContact();
        	 break;
    	 case 2:
    		 System.out.println("enter contact name");
    		 sc.nextLine();
    		 String name=sc.nextLine();
    		 
    		 System.out.println("enter contact number");
    		 String ph_no=sc.next();
    		 System.out.println("enter contact mail_id");
    		 String email_id=sc.next();
    		 InsertContact ic =new  InsertContact();
        	 ic.insertContact(name,ph_no,email_id);
        	 break;
    	 case 3:
    		 System.out.println("Available contacts:\n");
    		 GetContact gc1 =new GetContact();
        	 gc1.displayContact();
        	 System.out.println();
    	     UpdateContact uc=new UpdateContact();
    		 System.out.println("which contact id do you want to update?");
    		 int id=sc.nextInt();
    		 System.out.println("which one do you want to update??");
    		 System.out.println("1.name\n2.phone number\n 3.email id");
    		 int ch=sc.nextInt();
    		 switch(ch) {
    		 case 1:
    			 System.out.println("enter contact name to update");
    			 String uname=sc.next();
    			 uc.updateName(uname,id);
    			break;
    		 case 2:
    			 System.out.println("enter contact phone no to update");
    			 String uph_no=sc.next();
    			 uc.updatePhone(uph_no,id);
    			 break;
    		 case 3:
    			 System.out.println("enter contact mail_id to update");
    			 String umail=sc.next();
    			 uc.updateEmail(umail,id);
    			 break;
    		default:
    			
    			System.out.println("please enter valid option!!");
    			
    		 }
    		 break;
    		
        	 
    	 case 4:
    		 System.out.println("enter contact name to delete ");
    		 String contact_name=sc.next();
    		 DeleteContact dc=new DeleteContact();
        	 dc.deleteContact(contact_name);
        	 break;
    	 case 5:
    		 System.out.println("Thank You!!");
    		 System.exit(0);
    		 break;
    	default:
    		System.out.println("please enter valid option !!!");
    	 }
    
    	 }while(choice!=5);
     }
     
     catch(Exception e) {
    	 System.out.println(e);
    	 
     }
    	finally {
    		sc.close();
    	}
}
}

