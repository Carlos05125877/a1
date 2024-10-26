import javax.swing.*;
import java.awt.*;


public class PaginaInicial extends JFrame{
    public  PaginaInicial(){
        setTitle("Modo Avião");

        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(null);
        JButton jButton = new JButton("Entrar");
        jButton.setBounds(100, 200, 250, 70);
        jButton.setBackground(new Color(10,10,10));
        add(jButton);

        setVisible(true);
    }

}
