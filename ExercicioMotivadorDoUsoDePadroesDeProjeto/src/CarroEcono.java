

public class CarroEcono extends Carro{

    private MotorEcono motor;
    
    public CarroEcono(String modelo, TipoCombustivel tipoCombustivel, int consumoMotor, int capacidadeTanque){
        super(modelo, tipoCombustivel, consumoMotor, capacidadeTanque);
    }

    @Override
    public MotorEcono getMotor(){
        return motor;
    }

    @Override
    protected void setMotor(TipoCombustivel tipo, int consumoPrimario, int consumoSecundario){
        motor = new MotorEcono(tipo, consumoPrimario);
    }
}
