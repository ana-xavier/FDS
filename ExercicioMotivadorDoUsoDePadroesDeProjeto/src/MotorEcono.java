public class MotorEcono extends Motor {

    private final static int MINIMO_CONSUMO = 10;
    private final static int REDUCAO_KM = 5000;

    public MotorEcono(TipoCombustivel tipoMotor, int consumo) {
        super(tipoMotor, consumo);
    }

    public int getReducaoConsumo(){
        return getQuilometragem() / REDUCAO_KM;
    }

    @Override
    public int getConsumo(TipoCombustivel tipoCombustivel) {
        int reducaoConsumo = getReducaoConsumo();
        int consumoAtual = super.getConsumo(tipoCombustivel) - reducaoConsumo;

        return consumoAtual > MINIMO_CONSUMO ? consumoAtual : MINIMO_CONSUMO;
    }

    @Override
    public String toString(){
        return "Motor [consumo=" + getConsumo(getTipoMotor()) +  ", redução do consumo=" + getReducaoConsumo() + ", quilometragem=" + getQuilometragem() + ", tipoMotor=" + getTipoMotor() + "]";
    }
}
