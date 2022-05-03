package views.mainwindow;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        mitarbeiterAnzeige.setSize(new Dimension(160, 30));
        mitarbeiterAnzeige.setLocation(new Point(10, 100));

        JTextField mitarbeiterAnlageName = new JTextField("Vorname");
        mitarbeiterAnlageName.setSize(new Dimension(80, 30));
        mitarbeiterAnlageName.setLocation(new Point(210, 100));

        JTextField mitarbeiterAnlageAlter = new JTextField("Alter");
        mitarbeiterAnlageAlter.setSize(new Dimension(60, 30));
        mitarbeiterAnlageAlter.setLocation(new Point(310, 100));

        JButton btn = new JButton("Lade Mitarbeiter");
        btn.setSize(new Dimension(160, 30));
        btn.setLocation(new Point(10, 160));

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                Mitarbeiter m1 = new Mitarbeiter();
                try {
                    m1 = FileHandler.readJson("Mitarbeiter.json", Mitarbeiter.class);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                JTextField mitarbeiterAnzeige = new JTextField(m1.toString());
                mitarbeiterAnzeige.setSize(new Dimension(160, 30));
                mitarbeiterAnzeige.setLocation(new Point(10, 100));
                add(mitarbeiterAnzeige);
            }

        });

        JButton btn1 = new JButton("Setze Mitarbeiter");
        btn1.setSize(new Dimension(160, 30));
        btn1.setLocation(new Point(210, 160));

        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                {

                    String a = mitarbeiterAnlageName.getText();

                    String b = mitarbeiterAnlageAlter.getText();

                    int alter = Integer.parseInt(b);

                    Mitarbeiter m2 = new Mitarbeiter(a, alter);

                    System.out.println(m2);


                }

            }

        });

        super.add(mitarbeiterAnzeige);
        super.add(mitarbeiterAnlageName);
        super.add(mitarbeiterAnlageAlter);
        super.add(btn);
        super.add(btn1);
        super.setVisible(true);
    }

}
