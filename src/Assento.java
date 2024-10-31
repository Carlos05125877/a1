import javax.swing.*;
import java.awt.*;

public class Assento extends JFrame {
    private int id;
    private Voo voo;
    private boolean ocupado;
    // ... outros atributos e métodos

    public Assento() {
        setTitle("Nova Página");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        JLabel label = new JLabel("Bem-vindo à Nova Página!");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        add(label);

    }
}
