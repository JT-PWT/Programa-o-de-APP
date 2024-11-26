// Interfere ContaBancaria
interface ContaBancaria {
    void depositar(double valor);
    void scar (double valor);
    double consultarSaldo();
}

//Classe ContaCorrente
class import java.util.ArrayList;
import java.util.List;

// Clase produto
class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

//Classe Pedido
class Pedido {
    private int numero;
    private String data;
    private List<Produto> produtos;

    public Pedido(int numero, String data) {
        this.numero = numero;
        this.data = data;
        this.produtos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public String getData() {
        return data;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado ao pedido.");
    }
}

// Classe Principal
public class Main5 {

    public static void main(String[] args) {
        Produto produto1 = new Produto(1,"Camiseta",29.90);
        Produto produto2 = new Produto(2,"Calça",79.90);

        Pedido pedido = new Pedido(101,"2024-11-21");
        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);

        System.out.println("Pedido número: " + pedido.getNumero());
        System.out.println("Data do pedido: " + pedido.getData());
    }
}
 implements ContaBancaria {
    private String titular;
    private double saldo;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0; // Slado inicial
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printIn("Depositado: R$ " + valor + ". Saldo atual: R$ " + saldo);
        } else {
            System.out.printIn("Valor de depósito deve ser positivo.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printIn("Sacado: R$ " + valor = ". Saldo atual: R$ " + saldo);
        } else {
            System.out.printIn("Saque inválido. Verifique o valor.");
        }
    }

    @Override
    public double consultaraldo() {
        return saldo;
    }

    public String getTitular() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}

// Classe Principal
public class Main6 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaCorrente("Jõao Silva");

        conta.depositar(10000); //Deposita R$ 1.0000
        conta.sacar(300); // Saca R$ 300
        System.out.printIn("Slado atual: R$ " + conta.consultarSaldo()); // Consulta saldo
        conta.sacar(800); // tenta sacar mais do que o saldo disponível
        conta.depositar(-50); //Tenta depositarum valor negativo

    }
}