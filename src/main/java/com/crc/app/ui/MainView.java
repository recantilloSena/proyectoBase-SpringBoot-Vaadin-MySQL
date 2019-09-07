
package com.crc.app.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

/**
 *
 * @author RICARDO
 */
@Route("index")
public class MainView  extends VerticalLayout{

    TextField input = new TextField();
    Button boton    = new Button();
    
    public MainView() {
        input.setLabel("Digite su Nombre");
        boton.setText("Aceptar");
                
        add(input,boton);
        
    }
    
    
    
}
