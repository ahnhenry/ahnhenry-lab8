public class TransferStation extends Station{
    public TransferStation(String color, String name) {
        super(color, name);
        ;
        
    }


    public void addTransferStationPrev(Station prevStation){
        this.previous = prevStation;
    }

    public void addTransferStationNext(Station nextStation){
        this.next = nextStation; 
    }

    public String prevEx(){
        if(this.prevExist() == null){
            return this.prevExist();
        }
        else{
            return "false";
        }
    }
    
    public String toString(){
        return "TRANSFERSTATION: " + name + ": " + color + " line, " + "in service: " 
        + super.inService(this) + ", " + "previous station: " +  ;
    }
    
}
