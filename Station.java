public class Station {
    String color;
    String name;
    Boolean inService;
    Station previous;
    Station next;
   

    public Station(String color, String name ){
        this.color = color;
        this.name = name;
        this.previous = null;
        this.next = null;
        inService = true;

        
    }

    public Boolean inService(Station station){
        if(station.color != "" && station.name != ""){
            inService = true;
        }
        else{ 
            inService = false;
        }

        return inService;
    }

    public void addNext(Station nextStation){
        this.next = nextStation;
    
    }

    public void addPrev(Station prevStation){
        this.previous = prevStation;
    }

    public boolean isAvailable(){

        return false;
    }
    public void connect(Station station){
        this.next = station;
        station.previous = this;
    }
    public void connect(EndStation Station){
        Station end = new EndStation(color, name);

        this.next = end;
        end.previous = this;
        
    }

    public Station prevExist(){
        if(this.previous != null){
            return this.previous;
        }
        else{
            return null;
        }
    }


    public String toString(){

        return "STATION" + " " + name + ":" + " " + color + " " + "line," + "in service: true," + "previous station: " + "none, " ;       
    }
}
