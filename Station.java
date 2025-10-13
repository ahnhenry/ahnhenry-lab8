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
        if(this.color != "" && this.name != ""){
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
        return inService;
    }

    public boolean switchAvailable(){
        return !isAvailable();
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

    public String prev(){
        String prevName = "" ;
        if(this.previous != null){
            prevName = this.previous.name;
    
        }
        else{
            prevName = "none";
        }
        return prevName;
      }
    
      public String next(){
        String nextName = "" ;
        if(this.next != null){
            nextName = this.next.name;
    
        }
        else{
            nextName = "none";
        }
        return nextName;
      }

      public int tripLength(Station station){
        int length = 0;
        Station current = this;

        while(current != station && current != null){
            length++;
            current = current.next;
        }
        if(current == station){
            return length + 1;
        }

        return -1;

      }

    @Override
    public String toString(){

        return "STATION" + " " + name + ":" + " " + color + " " + "line," + "in service:" + inService(this) +  " ," + "previous station: " + prev() + ", " + "next station: " + next() + ", " ;       
    }
}
