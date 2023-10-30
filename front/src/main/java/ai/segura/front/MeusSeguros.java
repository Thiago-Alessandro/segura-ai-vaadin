package ai.segura.front;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.Collection;

@Route(value = "/meus-seguros", layout = NavBarApp.class)
public class MeusSeguros extends VerticalLayout {

    public MeusSeguros(){

        Seguro seguro = new Seguro("opa, aqui eu setarei meu nome", "ola eu estou testando a descrição", "aa", "bb",45.0, "cc");
        Collection<Seguro> listaSeguros = new ArrayList<>();
        listaSeguros.add(seguro);

        Grid<Seguro> tabelaSeguro = new Grid<>(Seguro.class);
        tabelaSeguro.setItems(listaSeguros);
        add(new H1("Meus seguros"));
        add(tabelaSeguro);
    }

}
