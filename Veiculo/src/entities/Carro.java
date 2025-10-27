package entities;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro() {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String acelerar() {
        velocidade += 10;
        return "O carro acelerou! Velocidade atual: "
                            + velocidade
                             + " km/h";
    }

    public String frear() {
        if (velocidade >= 10) {
            velocidade -= 10;
        } else {
            velocidade = 0;
        }
        return "O carro freiou! Velocidade atual: "
                            + velocidade
                            + " km/h";
    }

    public void mostrarInfo() {
        System.out.println("Marca: "
                            + marca
                            + "\nModelo: "
                            + modelo
                            + "\nAno: "
                            + ano
                            + "\nVelocidade: "
                            + velocidade
                            + "km/h");
    }
}
