class MethodFinal{  
  final void run(){System.out.println("running");}  
}  
     
class Honda extends MethodFinal{  
   void run(){System.out.println("running safely with 100kmph");}  
     
   public static void main(String args[]){  
   Honda honda= new Honda();  
   honda.run();  
   }  
} 
