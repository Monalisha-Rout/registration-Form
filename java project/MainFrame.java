import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame{

    final private Font mainFont = new Font("Segoe print",Font.BOLD,18);
    JTextField tfFirstName,tfLastName;
    JLabel lbWelcome;

    public void initialize(){
        JLabel lbFirstName = new JLabel("first Name");
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        JPanel formJPanel = new JPanel();
        formJPanel.setLayout(new GridLayout(4,1,5,5));
        formJPanel.setOpaque(false);
        formJPanel.add(lbFirstName);
        formJPanel.add(tfFirstName);
        formJPanel.add(lbLastName);
        formJPanel.add(tfLastName);

        // *****************************welcome label*************************

        lbWelcome = new JLabel();
        lbWelcome .setFont(mainFont);

//*********************button label **********************************/

        JButton btnOK =new JButton("ok");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                lbWelcome.setText("Hello"+" "+firstName+" "+lastName);
            }

        });

         JButton btnClear =new JButton("clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");

            }
        });


      JPanel buttonsPanel = new JPanel();
      buttonsPanel.setLayout(new GridLayout(1,2,5,5));
      buttonsPanel.setOpaque(false);
      buttonsPanel.add(btnOK);
      buttonsPanel.add(btnClear);




    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    mainPanel.setBackground(new Color(128,128,255));
    mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    mainPanel.add(formJPanel,BorderLayout.NORTH);
    mainPanel.add(lbWelcome,BorderLayout.CENTER);
    mainPanel.add(buttonsPanel,BorderLayout.SOUTH);

    add(mainPanel);
    
    
    
    setTitle("welcome");
    setSize(500,600);
    setMaximumSize(new Dimension(300 ,400));
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}