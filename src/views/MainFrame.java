package views;

import java.awt.Dimension;
import javax.swing.JFrame;


import views.mainwindow.MainWindow;

// Java Framework für die GUI: Swing
public class MainFrame extends JFrame {

    public MainFrame () {
        super.setTitle("Mitarbeiterverwaltung Cheech & Chong Ltd.");
        super.setSize(new Dimension(600, 400)); //Breite & Höhe in Pixel
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null); // Fenster startet mittig auf dem Bildschirm
        
        MainWindow mw = new MainWindow();
        super.getContentPane().add(mw);

        super.setVisible(true); // Macht das Fenster sichtbar
    }

}
