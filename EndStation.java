
public class EndStation extends Station {


    public EndStation(String color, String name) {
            super(color, name);
        }


    
    public String color = "";
    public String name = "";

    public void makeEnd(){
        if(this.previous != null){
            this.previous = null;
        }
        if(this.next != null){
            this.next = null;
        }
    }
}
