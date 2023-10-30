package ai.segura.front;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "/inicio", layout = NavBarApp.class)
public class Inicio extends VerticalLayout {

    private H1 titulo = new H1("Inicio funciona!");

    public Inicio(){
        add(titulo);
    }


}
