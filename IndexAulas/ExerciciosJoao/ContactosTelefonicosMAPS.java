package AulasJoao;

// https://www.hackerrank.com/challenges/30-dictionaries-and-maps
import java.util.*;
import java.io.*;

class ContactosTelefonicosMAPS{
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      Map<String,String> myMap = new HashMap<String,String>();
      for(int i = 0; i < n; i++){
          String name = in.next();
          int phone = in.nextInt();
          myMap.put(name,Integer.toString(phone));
          
      }
      while(in.hasNext()){
          String s = in.next();
          if (myMap.containsKey(s)) { System.out.println(s+"="+myMap.get(s)); }
              else System.out.println("Not found");
          
      }
      in.close();
  }
}
