import java.util.*;

class Message{

  String sender;
  String reciver;
  String content;
  

Message(String sender, String reciver, String content){

  this.sender = sender;
  this.reciver = reciver;
  this.content = content;
  

}
}

public class Digitalpostman{
public static void main(String [] args){

ArrayList<Message> msg = new ArrayList<>();

Scanner sc= new Scanner(System.in);
String encryp = "";
String decryp = "";
System.out.println(" ");
System.out.println("Welcome to the Digital postman.");
while(true){
System.out.println("Choose option: ");
System.out.println("Opption 1 send massage:");
System.out.println("Opption 2 view encoded:");
System.out.println("Opption 3 decoded");
System.out.println("Opption 4 exit");

int choice = sc.nextInt();
sc.nextLine();

switch(choice){

case 1:

      System.out.print("Enter Sender name : ");
      String sname =sc.nextLine();
      System.out.print("Enter Receiver name : ");
      String rname =sc.nextLine();
      System.out.print("Enter Massage: ");
      String sms =sc.nextLine();
      
      

      for(int i=0; i<sms.length(); i++){
       char ch = sms.charAt(i);
       char newch = (char)(ch+3);
       encryp += newch;
       
       }
       msg.add(new Message(sname , rname , encryp));
      System.out.println("Massage completely converted");
      break;

case 2:

       if(msg.isEmpty()){
       System.out.println("Massage box is Empty.First add some massage");
       }else{
       for(Message m : msg){
       System.out.println("Sender name: " + m.sender);
       System.out.println("Reciver name: " + m.reciver);
       System.out.println("Massage: "+ encryp);
       }
       }
       break; 

case 3 :
        if(msg.isEmpty()){
        System.out.println("massage box is empty");
        }else{
        System.out.println("enter the msg number to decoded: ");
        int num = sc.nextInt();
        sc.nextLine();
        if(num > 0 && num<= msg.size()){
          for(int i=0; i<encryp.length(); i++){
           char ch = encryp.charAt(i);
           char newch = (char)(ch-3);
           decryp += newch;
        
          }
        System.out.println("Send massage was: " + decryp);
        }else{
       System.out.println("invalid massage number.");
       }
       }  
       break;
case 4:
       System.out.println("Thank you for using Digital postman.");
       sc.close();
       return;
default:
       System.out.println(" Invalid option! try again.");
      
}
}
}
}


