import java.util.*;
import java.io.*;
import java.lang.*;


public class Sort {
  public static void main(String args[]) throws Exception{
	  try { 
 
		  ArrayList<String[]> ans = new ArrayList<String[]>();
		  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\gupta\\Desktop\\Test - Sheet1.csv"));
		  String empty_str = "";
		  HashSet<String> hs = new HashSet<>();
		  
		  
		  while((empty_str = br.readLine()) != null) {
			  String[] test = empty_str.split(",");
			  
			  if(hs.contains(test[0])) continue;
			  
			  hs.add(test[0]);
			  ans.add(test);
		  }
		  
		  //=======================GET CSV FILE DATA=======================// 
		  
		  System.out.println(ans);
		  
		  Collections.sort(ans, (a1,a2)->a1[0].compareTo(a2[0]));
		  
		  BufferedWriter bffr = new BufferedWriter(new FileWriter("C:\\Users\\gupta\\Desktop\\Test1.csv"));
		  PrintWriter pr = new PrintWriter(bffr);
		  
		  for(String[] str_array:ans) {
			  String test = "";
			  for(String str:str_array) {
				  test+=str+",";
			  }
			  pr.println(test);
			  pr.flush();
		  }
		  
		  
		  //======Sort CSV data in form of name and Save in another CSV File=======//
		  
		  Collections.sort(ans, (a1,a2)->Integer.valueOf(a1[1])-Integer.valueOf(a2[1]));
		  
		  pr = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\gupta\\Desktop\\Test2.csv")));
		  
		  for(String[] str_array:ans) {
			  String test = "";
			  for(String str:str_array) {
				  test+=str+",";
			  }
			  pr.println(test);
			  pr.flush();
		  }
		  
		  pr.close();
		  
		  
		  //======Sort CSV data in form of Age and Save in another CSV File=======//
		  
	  }catch(Exception e) {
		  System.out.println(e);
	  }
  }
}

	

