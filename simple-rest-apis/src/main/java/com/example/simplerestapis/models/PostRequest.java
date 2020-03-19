package com.example.simplerestapis.models;
// import java.util.*;
// public class PostRequest{
// public void PostRequest(){
    
// }

//    String emailList;
//     public String getEmails(){
        
//         return emailList;
        
//     }
//     public void setEmails(String emailList){
       
//             this.emailList=emailList;
//             //System.out.println("I am in set emails"+this.emailList);
        
//     }
//     }
public class PostRequest {
	
	String[] emailList;
	public String[] getEmailList() {
		return emailList;
	}
	
	
	public void setEmailList(String[] emailList) {
		this.emailList = emailList;
	}

}
