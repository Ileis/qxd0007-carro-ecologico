public class Carro {

    private int tanque = 0;
    private int passageiros = 0;
    private int quilometragem = 0;

    public int getPassageiros() {
        return passageiros;
    }

    public int getCombustivel() {
        return tanque;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public boolean embarcar() {

        if(passageiros < 2){
            passageiros++;

            return true;
        }
        return false;
    }

    public boolean desembarcar() {

        if(passageiros > 0){
            passageiros--;

            return true;
        }
        return false;
    }

    public boolean dirigir(int distancia) {

        if((passageiros > 0) && (tanque > 0)){
            if(distancia < tanque){
                tanque -= distancia;
                quilometragem += distancia;

                return true;
            }

            quilometragem += tanque;
            tanque = 0;
        }
        return false;
    }

    public boolean abastecer(int quantidade) {

        if((tanque < 100) && (quantidade > 0)){
            if(quantidade > (100 - tanque))
                tanque = 100;
            else
                tanque += quantidade;

            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "passageiros=" + getPassageiros() +
                ", combustivel=" + getCombustivel() +
                ", quilometragem=" + getQuilometragem() +
                '}';
    }
}
