import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarNuevosDatos extends JFrame{
    private JButton ingresarButton;
    private JTextField NuevoCui;
    private JPanel Jpanel;
    private JTextField ingresarfecha;
    private JTextField Dosisnueva;
    private JLabel Dosis;
    private JLabel fechalb;

    public AgregarNuevosDatos(){
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VacunaApp vacuna = new VacunaApp();
                String cui = NuevoCui.getText();
                String datos = "Dosis " + Dosisnueva.getText() + ", Fecha " + ingresarfecha.getText();
                vacuna.guardararchivo(cui, datos);
                NuevoCui.setText("");
                Dosisnueva.setText("");
                ingresarfecha.setText("");

                // Muestra una ventana emergente para confirmar que se ha agregado la información correctamente
                JOptionPane.showMessageDialog(null, "La información ha sido agregada correctamente.");

                JOptionPane.showMessageDialog(null, "Datos ingresados para el CUI " + cui);
            }
        });
    }

    public void iniciar(){
        AgregarNuevosDatos f = new AgregarNuevosDatos();
        f.setContentPane(new AgregarNuevosDatos().Jpanel);
        f.setSize(500, 500);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.pack();
    }
}