public class Motor {

    private TipoCombustivel tipoMotor;
    private int consumoPrimario, consumoSecundario; // em quilometros por unidade. Ex: Km/Lt
    private int quilometragem;

    public Motor(TipoCombustivel tipoMotor, int consumo) {
        this.tipoMotor = tipoMotor;
        this.consumoPrimario = consumo;
        this.consumoSecundario = consumo;
    }

    public Motor(TipoCombustivel tipoMotor, int consumoPrimario, int consumoSecundario) {
        this.tipoMotor = tipoMotor;
        this.consumoPrimario = consumoPrimario;
        this.consumoSecundario = consumoSecundario;
    }

    public int getConsumo(TipoCombustivel tipoCombustivel) {
        return tipoCombustivel == TipoCombustivel.GASOLINA ? consumoPrimario : consumoSecundario;
    }

    public TipoCombustivel getTipoMotor() {
        return this.tipoMotor;
    }

    public int getQuilometragem() {
        return this.quilometragem;
    }

    public int combustivelNecessario(int distancia, TipoCombustivel tipoCombustivel) {
        return  distancia / getConsumo(tipoCombustivel);
    }

    public void percorre(int distancia) {
        quilometragem += distancia;
    }

    @Override
    public String toString() {
        return tipoMotor != TipoCombustivel.FLEX ? "Motor [consumo=" + consumoPrimario + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoMotor
                + "]":
                "Motor [consumo gasolina=" + consumoPrimario + ", consumo álcool=" + consumoSecundario + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoMotor
                + "]";
         
    }
}