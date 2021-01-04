package org.example;
import org.example.user_interface.Window;

public class App {
    public static void main(String[] args){
        Window win = new Window();
        javax.swing.SwingUtilities.invokeLater(win);
        win.addFigure();
    }
}
