package controladores;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vistas2.Principal;

/**
 *
 * @author Gonz@_
 */
public class ConfiguracionControlador implements MouseListener     {
    private Principal principal;

    public ConfiguracionControlador(Principal principal) {
        this.principal = principal;
         this.principal.btn_salir.addMouseListener(this); //poner el boton salir a la escucha
    }
    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
            //BOTON SALIR
        if(e.getSource()==principal.btn_salir ){
            principal.btn_salir.setBackground(new Color(153,0,0));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
         if(e.getSource()==principal.btn_salir ){
            principal.btn_salir.setBackground(new Color(23,37,84));
        }
    }
    
}
