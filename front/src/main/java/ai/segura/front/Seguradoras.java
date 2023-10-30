package ai.segura.front;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "/seguradoras", layout = NavBarApp.class)
public class Seguradoras extends VerticalLayout {

    private H1 titulo = new H1("Seguradoras funciona!");

    public Seguradoras(){
        add(titulo);
    }

}
