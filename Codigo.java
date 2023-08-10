public class Cliente {
    private String nome;
    private String cpf;
}

public class Seguro {
    float valor;
    boolean vigencia;
    private Veiculo VeiculoAssegurado;
    private Cliente Proprietario;
    private Cliente[] assegurados;
}

public class Veiculo {
    private int ano;
    private String marca;
    private String cor;
    private String placa;
    private Modelo modelo;
}

public class Modelo {
    private String nome;
}
