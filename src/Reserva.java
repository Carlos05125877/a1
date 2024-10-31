import javax.swing.*;
import java.awt.*;
import java.util.Date;

public  class Reserva extends JFrame  {
    private int id;
    private Usuario usuario;
    private Voo voo;
    private Date dataReserva;
    private String status;

    public Reserva() {
        setTitle("Reservas");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Realizar reserva");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.NORTH);


    }

    // ... outros atributos e métodos

}
