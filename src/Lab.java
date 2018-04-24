import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class Lab {
	// test

	private String name;
	private String location;
	private Equipment arrEq[];
	private static final int SIZE_EQ=15;
	private int nbEq;
	public Lab(String name , String location) {
		this.name=name;
		this.location=location;
		arrEq = new Equipment[SIZE_EQ];
		nbEq=0;
	}
	public void addEquipment(Equipment e)throws Exception {

		if (nbEq<arrEq.length) {
			if(e instanceof LapTop) {
				arrEq[nbEq++] = new LapTop((LapTop)e);
			}else {
				arrEq[nbEq++] = new Printer((Printer)e);
			}	
			System.out.println("Added");
			
		}else {
			throw new Exception("The array is full");
		}
		
		
		
		
		
		
		
		
		
	}
    public void saveLaptop(String f)throws IOException{
    	File F = new File(f);
    	FileOutputStream F1 = new FileOutputStream(F);
    	ObjectOutputStream F2 = new ObjectOutputStream(F1);
    	//Equipment[] Lap = new Equipment[nbEq];
    	//int nbLab=0;
    	for(int i=0 ; i<SIZE_EQ ; i++) {
    		if (arrEq[i] instanceof LapTop) {
    			F2.writeObject(arrEq[i]);
    			//Lap[nbLab++]=arrEq[i];
    		}
    	}
    	//F2.writeObject(Lap);
    	F2.close();
    	
    }
    public void readAddPrinter(String f)throws IOException,ClassNotFoundException{
    	File F = new File(f);
    	FileInputStream F1 = new FileInputStream(F);
    	ObjectInputStream F2 = new ObjectInputStream(F1);
    	//Equipment[] Pr = new Equipment[nbEq];
    	Equipment P;
    	//int nbPr=0;
    	boolean stop = true;
    	try {
        	while (stop){
        		P = (Equipment)F2.readObject();
        		if(P instanceof Printer) {
        			addEquipment(P);
        		}
        		
        	}
    	}catch(ArrayIndexOutOfBoundsException e) {
    		
    	}catch(Exception e) {
    		
    	}

    	F2.close();
    	
    }
    public int getNbPrinters(int s)throws Exception{
    	int nb=0;
    	if(s>=15) {
    		for(int i=0;i<nbEq ; i++) {
    			if(arrEq[i] instanceof Printer && ((Printer)arrEq[i]).getSpeed()>s) {
    				nb++;
    				
    			}
    		}
    	}else {
    		throw new Exception("Number Must be more then 15 !!!");
    	}
    	return nb;
    }
    public Printer[] getPrinters(int s)throws Exception{
    	

    	try {
        	int nbPrGrS = getNbPrinters(s);
        	Printer[] Pr = new Printer[nbPrGrS];
        	int nbPr=0;
        	for(int i=0; i<nbEq ; i++) {
        		if (arrEq[i] instanceof Printer && ((Printer)arrEq[i]).getSpeed()>s) {
        			Pr[nbPr++]= (Printer) arrEq[i];
        		}
        	}

        	
        	return Pr;
    	}catch(Exception e) {
    		return null;
    }
}
    
    
    
}
