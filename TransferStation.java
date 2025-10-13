import java.util.ArrayList;

public class TransferStation extends Station{
    
    public ArrayList<Station> otherStations = new ArrayList<>();


    public TransferStation(String color, String name) {
        super(color, name); 
    }


    public void addTransferStationPrev(Station prevStation){
            this.previous = prevStation;
            otherStations.add(prevStation);
            
    }


    public void addTransferStationNext(Station nextStation){
        this.next = nextStation; 
        otherStations.add(nextStation);
    }


  public String prevEx(){
    String prevName = "" ;
    if(this.previous != null){
        prevName = this.previous.name;

    }
    else{
        prevName = "none";
    }
    return prevName;
  }

  public String nextEx(){
    String nextName = "" ;
    if(this.next != null){
        nextName = this.next.name;

    }
    else{
        nextName = "none";
    }
    return nextName;
  }


  public String transfers(){
    String transfersList ="";
    for(int i = 0; i < otherStations.size(); i++){
        transfersList = "\t" + transfersList + otherStations.get(i).toString() + "\n";
    }

    return transfersList;
  }
    
    public String toString(){
        return "TRANSFERSTATION: " + name + ": " + color + " line, " + "in service: " 
        + super.inService(this) + ", previous station: " + prevEx() + ", previous station: " + nextEx() + "\n\tTransfers: \n" + transfers() ;
    }

    
}

