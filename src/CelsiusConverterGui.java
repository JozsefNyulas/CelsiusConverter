import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGui extends JFrame
{
    private JPanel mainPanel;
    private JTextField celsiusTxtField;
    private JLabel celsiulLabel;
    private JButton convertButton;
    private JLabel fahrenHeitLabel;



    public CelsiusConverterGui(String title)
    {
        super(title);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();





        convertButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // get text from celsiusTextField
                // convert to double
                // update the fahreinheit label

                int tempFahr = (int)(Double.parseDouble(celsiusTxtField.getText() ) * 1.8 + 32);

                fahrenHeitLabel.setText(tempFahr + " fahrenheit");


            }
        });



    }


}
