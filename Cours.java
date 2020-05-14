
interface Comparable{
    public int compareTo(Object obj);
}

public class Cours implements Comparable{
    private String code;
    private String intitule;
    private int volumeH;
    
    public Cours(String pcode, String pintitule, int pvolumeH){
	code = pcode;
        intitule = pintitule;
        volumeH = pvolumeH;
    }  
    
    public void setCode(String newCode){
        this.code = newCode;
    }
    public void setIntitule(String newIntitule){
        this.intitule = newIntitule;
    }
    public void setVolume(int newVol){
        this.volumeH = newVol;
    }
    public String getCode(){
       return this.code; 
    }
    public String getIntitule(){
       return this.intitule; 
    }
    public int getVolume(){
       return this.volumeH; 
    }
    
    @Override
    public int compareTo(Object obj) {
        String intitule = ((Cours)obj).getIntitule();
        return this.intitule.compareTo(intitule);
    }
    
    public String toString() {
        String test;
        test = this.code + " " + this.intitule + " " + this.volumeH;
	return test;
    }
}
