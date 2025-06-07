import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SportskaOpremaApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Prodavnica Sportske Opreme - SPORTSHOP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel title = new JLabel("Izaberi sportsku opremu:", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(title);

        JCheckBox lopta1 = new JCheckBox("Fudbalska lopta");
        JCheckBox lopta2 = new JCheckBox("Kosarkaska lopta");
        JCheckBox lopta3 = new JCheckBox("Teniska loptica");

        JCheckBox patike1 = new JCheckBox("Patike za trcanje");
        JCheckBox patike2 = new JCheckBox("Kosarkaske patike");
        JCheckBox patike3 = new JCheckBox("Fudbalske kopacke");

        JCheckBox dres1 = new JCheckBox("Dres - Srbija");
        JCheckBox dres2 = new JCheckBox("Dres - Brazil");
        JCheckBox dres3 = new JCheckBox("Dres - Argentina");

        panel.add(lopta1);
        panel.add(lopta2);
        panel.add(lopta3);
        panel.add(patike1);
        panel.add(patike2);
        panel.add(patike3);
        panel.add(dres1);
        panel.add(dres2);
        panel.add(dres3);

        JButton kupiBtn = new JButton("KUPI");
        kupiBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        kupiBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder izbor = new StringBuilder("Izabrali ste:\n");

                if (lopta1.isSelected()) izbor.append("- Fudbalska lopta\n");
                if (lopta2.isSelected()) izbor.append("- Kosarkaska lopta\n");
                if (lopta3.isSelected()) izbor.append("- Teniska loptica\n");

                if (patike1.isSelected()) izbor.append("- Patike za trcanje\n");
                if (patike2.isSelected()) izbor.append("- Kosarkaske patike\n");
                if (patike3.isSelected()) izbor.append("- Fudbalske kopacke\n");

                if (dres1.isSelected()) izbor.append("- Dres Srbija\n");
                if (dres2.isSelected()) izbor.append("- Dres Brazil\n");
                if (dres3.isSelected()) izbor.append("- Dres Argentina\n");

                int opcija = JOptionPane.showOptionDialog(
                        frame,
                        izbor.toString(),
                        "Potvrda kupovine",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        new String[]{"KUPI", "ODUSTANI"},
                        "KUPI"
                );

                if (opcija == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(frame, "Hvala na kupovini!");
                }
            }
        });

        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(kupiBtn);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
