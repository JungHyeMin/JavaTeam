package projec;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class administration {
	
	void shutDown(){
		try{
		    Process p = Runtime.getRuntime().exec("shutdown -s -t 0");
		    
		    
			}catch(Exception e){
		    System.out.println(e);
		}
	}
	
	void reStart(){
		try{
		    Process p = Runtime.getRuntime().exec("shutdown -r -t 0");
		    
		    
			}catch(Exception e){
		    System.out.println(e);
		}
	}
	
	void logOff(){
		try{
		    Process p = Runtime.getRuntime().exec("shutdown -l");
		    
		    
			}catch(Exception e){
		    System.out.println(e);
		}
	}
	
	void notePad(){
		try{
		    Process p = Runtime.getRuntime().exec("notepad");
		    
			}catch(Exception e){
		    System.out.println(e);
		}
	}
	
	void calc(){
		try{
		    Process p = Runtime.getRuntime().exec("calc"); 
		    
			}catch(Exception e){
		    System.out.println(e);
		}
	}
	
	void aPaint(){
		try{
		    Process p = Runtime.getRuntime().exec("mspaint"); 
		    
			}catch(Exception e){
		    System.out.println(e);
		}
	}
	
	void cmd(){
		try{
		    Process p = Runtime.getRuntime().exec("cmd.exe /c start ");
		    
			}catch(Exception e){
		    System.out.println(e);
		}
	}
	
}