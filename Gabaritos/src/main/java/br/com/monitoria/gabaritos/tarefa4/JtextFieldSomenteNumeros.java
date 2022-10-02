/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.monitoria.gabaritos.tarefa4;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public final class JtextFieldSomenteNumeros extends JTextField {

    public JtextFieldSomenteNumeros() {
        super();
        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldKeyTyped(evt);
            }
        });
    }

    private void jTextFieldKeyTyped(KeyEvent evt) {

        String caracteres = "0987654321.";// lista de caracters que devem ser aceitos
        if (!caracteres.contains(evt.getKeyChar() + "")) {// se o caracter que gerou o evento não estiver na lista
            evt.consume();//aciona esse propriedade para eliminar a ação do evento
        }
    }
}
