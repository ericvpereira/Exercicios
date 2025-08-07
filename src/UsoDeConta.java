import static java.lang.System.out;
import java.io.IOException;

public class UsoDeConta {

    public static void main(String[] args) throws IOException {

        Conta minhaConta = new Conta();
        Conta suaConta = new Conta();

        minhaConta.setNome("Eric");
        minhaConta.setEndereco("Rua A, 123");
        minhaConta.setSaldo(1000);

        suaConta.setNome("João");
        suaConta.setEndereco("Rua B, 456");
        suaConta.setSaldo(1500.00);

        out.print(minhaConta.getNome());
        out.print("(");
        out.print(minhaConta.getEndereco());
        out.print(") tem $");
        out.print(minhaConta.getSaldo());
        out.println();

        out.print(suaConta.getNome());
        out.print(" (");
        out.print(suaConta.getEndereco());
        out.print(") tem $");
        out.print(suaConta.getSaldo());
    }
}