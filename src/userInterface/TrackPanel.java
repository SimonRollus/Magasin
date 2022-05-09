package userInterface;

import javax.swing.*;
import java.awt.*;

public class TrackPanel extends JPanel {
    public TrackPanel() {

       setBackground(Color.YELLOW);


        //TABLE

        String[] columnNames = {"Id", "User", "dateTimeCompletion", "dateTimeDelivery", "statusID", "note"};
        String[][] data = {{"1", "simrol", "02-05-2022", "02-05-2022", "1", "Manque un produit"} ,{"2", "olidid", "03-05-2022", "05-05-2022", "2", "Manque un produit"}};

        JTable table = new JTable(data, columnNames);
        JScrollPane sp = new JScrollPane(table);

        this.add(sp);


        // FILTER


        // COMMAND DETAIL


    }


}
