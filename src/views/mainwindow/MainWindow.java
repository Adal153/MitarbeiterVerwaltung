package views.mainwindow;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import helpers.FileHandler;
import mitarbeiterverwaltung.Mitarbeiter;

public class MainWindow extends JPanel {

    public MainWindow() {
        super.setLayout(null);
        JButton btn = new JButton("Mitarbeiter auslesen");
        btn.setSize(new Dimension(120, 30));
        btn.setLocation(new Point(140,160));

        btn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Mitarbeiter m1 = new Mitarbeiter();
		try {
			m1 = FileHandler.readJson("Mitarbeiter.json", Mitarbeiter.class);
		} catch (Exception a) {
			// TODO Auto-generated catch block
			a.printStackTrace();
		}
		System.out.println(m1);
                
            }

        });

        super.add(btn);
        super.setVisible(true);
    }

    
    
}
