package ai.segura.front;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route(value = "/perfil", layout = NavBarApp.class)
public class Perfil extends VerticalLayout {

    private H1 titulo = new H1("Perfil funciona!");
    public Perfil(){
        add(titulo);
    }
}
