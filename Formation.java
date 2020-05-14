
import java.util.*;

public class Formation {
	private String name;
	private String code;
	private ArrayList<Cours> listeCours;
	
	public Formation(String p_name, String p_code, ArrayList<Cours> p_listeCours) {
		this.name = p_name;
		this.code = p_code;
		this.listeCours = p_listeCours;
	}
	  
    public void setCode(String p_code){
        this.code = p_code;
    }
    
    public void setName(String p_name){
        this.name = p_name;
    }
    
    public void setListeCours(ArrayList<Cours> p_listeCours){
        this.listeCours = p_listeCours;
    }
    
    public String getCode(){
       return this.code; 
    }
    
    public String getName(){
       return this.name; 
    }
    
    public ArrayList<Cours> getListeCours(){
        return this.listeCours; 
     }
  
    
    
    public String toString() {
        String test;
        test = this.code + " " + this.name + "\n";
        test = test + " Liste des Cours : ";
        
        for(int i = 0; i < listeCours.size() ; i++){
            test = test + listeCours.get(i);
            test += "\n";
        }
            
        return test;
    }
	

}
