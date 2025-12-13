import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ItineraryTicket {
    public static void getItenernaryTicket(HashMap<String,String>ticket)
    {
        Set<String>to=ticket.keySet();
        // to.e.
    }
    public static void main(String[] args) {
        HashMap<String,String>ticket=new HashMap<>();
        ticket.put("Chennai","Bengaluru");
        ticket.put("Mumbai","Delhi");
        ticket.put("Goa","Chennai");
        ticket.put("Delhi","Goa");
        System.out.println(ticket);
    }
}
