import java.lang.String;


public class String_methods{

  
    public static void main(String[] args) {
	
          
   String s1="Nikhil";
   String s2="Dwivedi";
   String s3="MY NAME IS NIKHIL";
   String s4="Hello";
   String s5="Nikhil";
   System.out.println("Methods of String in java");
  
   System.out.println("Char at index 2(third position):  "+ s1.charAt(2));
   System.out.println("concat method Nikhil concat Dwivedi : " +s1.concat(s2));
   System.out.println("Checkiing length of s3  :"+s3.length());
   System.out.println("compare between s1 and s5 :  "+s1.compareTo(s5));
   System.out.println("contains method check s4 is contain Hello : "+s4.contains("Hello"));
   System.out.println("this method Converting s3 to lower case : "+ s3.toLowerCase());
   StringBuffer s6=new StringBuffer("nikhil");
        s6.delete(1,3);
        System.out.println(s6);
		StringBuffer s7=new StringBuffer("Hello");
        s7.insert(1,"nikhil");
        System.out.println(s7);
		StringBuffer s8=new StringBuffer("nikhil");
        s8.delete(1,3);
        System.out.println(s8);
		StringBuffer s9=new StringBuffer("Hello");
        s9.replace(0,3,"mr.dwivedi");
        System.out.println(s9);
    }
    
}
