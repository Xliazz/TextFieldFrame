import javax.swing.JFrame;
public class TextFieldTest {
    public static void main (String[] args){
        
        TextFieldFrame textFieldFrame = new TextFieldFrame();
        TextFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TextFieldFrame.setSize(350,100);
        textFieldFrame.setVisible(true);
    }
}