//import javax.swing.*;
//import javax.swing.border.*;
//import java.awt.*;


public class Main {
    static Server chat = new Server();
    public static void main(String args[]){
        chat.Add(new Chatter("Rick", chat));
        chat.Add(new Chatter("Morty", chat));
        chat.Add(new Chatter("Summer", chat));
        chat.Add(new Chatter("Beth", chat));
    }
}
