package assignmentWesam;

public class LinkedListOfLabs {
	private Node Head;
	public LinkedListOfLabs() {
		Head=null;
	}
	public void instertAtFront(Lab l) {
		Node N = new Node(l);
		N.setNext(Head);
		Head=N;
		
	}
    public void insertAtBack(Lab l) {
    	Node N = new Node(l);
    	if(Head==null) {
    		Head=N;
    	}else {
    		Node curr=Head;
    		while(curr.getNext()!=null) {
    			curr= curr.getNext();
    		}
    		curr.setNext(N);
    	}
    	
    }
    public int countLabs(int s) throws Exception {
       int num=0;
       Node curr=Head;

       try {
           while(curr!=null) {
         	  if(curr.getData().getNbPrinters(s)>0) {
         		  num++;
         		  curr=curr.getNext();  
         	  }
           }            
       }catch(Exception e) {
       	
        }
    
    	
    	return num;
 
    }
    public void split(LinkedListOfLabs List1 ,LinkedListOfLabs List2 , int s) {
    	Node curr = Head;
    	
    	try {
    		
    		while(curr!=null) {
    			
    			if(curr.getData().getNbPrinters(s)>0) {
    				List1.insertAtBack(curr.getData());
    			}else {
    				List2.instertAtFront(curr.getData());
    			}
    			curr = curr.getNext();
		
    		}
    		
    	}catch(Exception e) {
    		
    	}
	
    	
    }
}
