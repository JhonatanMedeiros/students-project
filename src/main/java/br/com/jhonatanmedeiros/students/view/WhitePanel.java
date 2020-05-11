package br.com.jhonatanmedeiros.students.view;

import java.awt.Color;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Jhonatan Hardt de Medeiros<https://jhonatanmedeiros.com>
 */
public class WhitePanel extends JPanel {

    public WhitePanel() {
        this.setBackground(Color.WHITE);
    }

    public WhitePanel(MigLayout layout) {
        this();
        super.setLayout(layout);
    }

}
