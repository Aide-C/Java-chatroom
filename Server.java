import java.util.ArrayList;

public class Server implements IServer {
    private ArrayList<IChatter> Chatters = new ArrayList<>();

    public void Add(IChatter x){
        Chatters.add(x);
    }

    public void newMessage(String From, String Message){
        for(IChatter chatter : Chatters){
            chatter.newMessage(From, Message);
        }
    }
}
