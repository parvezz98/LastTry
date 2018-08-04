package Tempp;


public class Duplicate {
 public static void main(String []arg){
	   String test="rahull";
       String temp = "";
          
     for (int i = 0; i < test.length(); i++){
           if (temp.indexOf(test.charAt(i)) == - 1){
              temp = temp + test.charAt(i);

        }
     }
     System.out.println(temp);


  

  }
	
}
