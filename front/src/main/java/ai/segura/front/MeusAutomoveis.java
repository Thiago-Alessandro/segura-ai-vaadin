package ai.segura.front;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "/meus-automoveis", layout = NavBarApp.class)
public class MeusAutomoveis extends VerticalLayout {

    private H1 titulo = new H1("Meus Automóveis funciona!");

    public MeusAutomoveis(){
        add(titulo);
    }

}
