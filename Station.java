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

    public void addNext(Station nextStation){
        this.next = nextStation;
    
    }

    public void addPrev(Station prevStation){
        this.previous = prevStation;
    }

    public boolean isAvailable(){

        return false;
    }


    public String toString(){

        return "STATION" + " " + name + ":" + " " + color + " " + "line," + "in service: true," + "previous station: " + "none, " ;       
    }
}
