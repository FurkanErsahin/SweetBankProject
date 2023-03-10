package gui.ayarlar;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TextAyarlari {
    /*
    *Text odaklanma ayarları
    */
    private static String originalText;
    private static Color originalFgColor;

    public static void checkTheTextFocusGained(JTextField textField, String org) {
        originalText = org;

        if (textField.getText().trim().equals(org)) {
            originalFgColor = textField.getForeground();
            textField.setText("");
        }
        textField.setForeground(Color.blue);
    }

    public static void checkTheTextFocusLost(JTextField textField) {
        if (textField.getText().trim().equals("")) {
            textField.setText(originalText);
            textField.setForeground(originalFgColor);
        } else {
            textField.setForeground(Color.BLACK);
        }

    }

    /*
    *Key ayarları
    */
    
    public static void setOnlyNumber(JTextField textField){
        textField.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(!Character.isDigit(c)){
                e.consume();}
            }
        
        
        });
        
    }    
    public static void setOnlyAlphabetic(JTextField textField){
        textField.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(!Character.isAlphabetic(c)){
                e.consume();}
            }
        
        
        });
        
    }   
    
    /*
    *Limit Ayarları
    */
    private static int limit;
    public static void setMaxLimit(JTextField textField,int lim){
        limit=lim;
        textField.setDocument(new PlainDocument(){
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if(str == null){
                return;}
                if(getLength() + str.length()<=limit)
                super.insertString(offs, str, a);
            }
            
        });    
    }      
}
