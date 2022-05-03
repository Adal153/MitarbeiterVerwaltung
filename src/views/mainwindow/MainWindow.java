package views.mainwindow;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.*;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import helpers.FileHandler;
import mitarbeiterverwaltung.Mitarbeiter;

public class MainWindow extends JPanel {

    public MainWindow() {
        super.setLayout(null);

        Mitarbeiter m1 = new Mitarbeiter();
        try {
            m1 = FileHandler.readJson("Mitarbeiter.json", Mitarbeiter.class);
        } catch (Exception a) {
            // TODO Auto-generated catch block
            a.printStackTrace();
        }

        JTextField mitarbeiterAnzeige = new JTextField(m1.toString());
        mitarbeiterAnzeige.setSize(new Dimension(200, 30));
        mitarbeiterAnzeige.setLocation(new Point(50, 100));

        JTextField mitarbeiterAnlageName = new JTextField("Vorname");
        mitarbeiterAnlageName.setSize(new Dimension(80, 30));
        mitarbeiterAnlageName.setLocation(new Point(370, 100));

        JTextField mitarbeiterAnlageAlter = new JTextField("Alter");
        mitarbeiterAnlageAlter.setSize(new Dimension(60, 30));
        mitarbeiterAnlageAlter.setLocation(new Point(470, 100));

        JButton btnLade = new JButton("Lade Mitarbeiter");
        btnLade.setSize(new Dimension(200, 30));
        btnLade.setLocation(new Point(50, 160));

        btnLade.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                Mitarbeiter m2 = new Mitarbeiter();
                try {
                    m2 = FileHandler.readJson("Mitarbeiter.json", Mitarbeiter.class);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
                mitarbeiterAnzeige.setVisible(false);
                JTextField mitarbeiterAnzeigeNeu = new JTextField(m2.toString());
                mitarbeiterAnzeigeNeu.setSize(new Dimension(160, 30));
                mitarbeiterAnzeigeNeu.setLocation(new Point(10, 100));
                add(mitarbeiterAnzeigeNeu);
                System.out.println(m2);
            }

        });

        JButton btnSetze = new JButton("Setze Mitarbeiter");
        btnSetze.setSize(new Dimension(160, 30));
        btnSetze.setLocation(new Point(370, 160));

        btnSetze.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                {
                    String a = mitarbeiterAnlageName.getText();

                    String b = mitarbeiterAnlageAlter.getText();

                    int alter = Integer.parseInt(b);

                    Mitarbeiter m1 = new Mitarbeiter(a, alter);

                    helpers.FileHandler.writeJson("Mitarbeiter.json", m1);
                }

            }

        });

        super.add(mitarbeiterAnzeige);
        super.add(mitarbeiterAnlageName);
        super.add(mitarbeiterAnlageAlter);
        super.add(btnLade);
        super.add(btnSetze);
        super.setVisible(true);
    }

    

}
