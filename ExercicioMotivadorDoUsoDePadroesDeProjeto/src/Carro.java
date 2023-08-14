public class Carro {

    private String modelo;
    private Motor motor;
    private TipoCombustivel tipoTanque;
    private TanqueCombustivel tanque;

    public Carro(String modelo, TipoCombustivel tipoCombustivel, int consumoMotor, int capacidadeTanque) {
        this.modelo = modelo;

        setMotor(tipoCombustivel, consumoMotor, consumoMotor);
        setTanque(tipoCombustivel, capacidadeTanque);
    }

    public Carro(String modelo, TipoCombustivel tipoCombustivel, TipoCombustivel tipoTanque, int consumoMotor, int capacidadeTanque) {
        this.modelo = modelo;
        this.tipoTanque = tipoTanque;
        setMotor(tipoCombustivel, consumoMotor, consumoMotor);
        setTanque(tipoCombustivel, capacidadeTanque);
    }

     public Carro(String modelo, TipoCombustivel tipoCombustivel, int consumoPrimario, int consumoSecundario, int capacidadeTanque) {
        this.modelo = modelo;
        setMotor(tipoCombustivel, consumoPrimario, consumoSecundario);
        setTanque(tipoCombustivel, capacidadeTanque);
    }

    protected void setMotor(TipoCombustivel tipo, int consumoPrimario, int consumoSecundario){
        if (consumoPrimario == consumoSecundario)
            motor = new Motor(tipo, consumoPrimario);
        else
            motor = new Motor(tipo, consumoPrimario, consumoSecundario);
    }

    protected void setTanque(TipoCombustivel tipo, int capacidade){
        tanque = new TanqueCombustivel(tipo, capacidade);
    }

    public String getModelo() {
        return modelo;
    }

    public int getCombustivelDisponivel() {
        return tanque.getCombustivelDisponivel();
    }

    public Motor getMotor(){
        return motor;
    }

    // Retorna a quantidade efetivamente abastecida
    public int abastece(TipoCombustivel tipoCombustivel, int quantidade) {
        int capacidadeLivre = tanque.getCapacidade() - tanque.getCombustivelDisponivel();
        
        if (capacidadeLivre < quantidade) {
            tanque.abastece(tipoCombustivel, capacidadeLivre);
            return capacidadeLivre;
        } else {
            tanque.abastece(tipoCombustivel, quantidade);
            return quantidade;
        }
    }

    // Retorna a distancia que consegue viajar com o combustivel remanescente
    public int verificaSePodeViajar(int distancia, TipoCombustivel tipoCombustivel) {
        int combustivelNecessario = getMotor().combustivelNecessario(distancia, tipoCombustivel);
        if (tanque.getCombustivelDisponivel() >= combustivelNecessario) {
            return distancia;
        } else {
            return tanque.getCombustivelDisponivel() * getMotor().getConsumo(tipoCombustivel);
        }
    }

    // Retorna true se conseguiu viajar
    public boolean viaja(int distancia, TipoCombustivel tipoCombustivel) {
        if (verificaSePodeViajar(distancia, tipoCombustivel) >= distancia) {
            getMotor().percorre(distancia);
            tanque.gasta(getMotor().combustivelNecessario(distancia, tipoCombustivel));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Carro:\n  Modelo=" + modelo + "\n  Motor=" + getMotor() + "\n  Tanque=" + tanque;
    }
}
