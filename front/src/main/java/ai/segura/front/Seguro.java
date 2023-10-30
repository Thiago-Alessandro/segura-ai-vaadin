package ai.segura.front;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seguro {

    private String nome;
    private String descricao;
    private String seguradora;
    private String segurados;
    private Double preco;
    private String validade;

}
