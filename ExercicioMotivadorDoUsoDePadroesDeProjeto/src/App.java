public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);

        // 1 - Crie um novo modelo de carro chamado "Esportivo". Este é movido a gasolina,
        // consome 6 Km/lt e o tanque tem capacidade para 45 litros.
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);

        // 2 - Crie um novo modelo de carro chamado "Utilitario". Este é movido a diesel, consome 5 Km/lt e o
        // tanque tem capacidade para 70 litros.
        Carro utilitario = new Carro("Utilitario", TipoCombustivel.ALCOOL, 5, 70);

        // 3 - Crie um novo modelo de carro chamado "SUV". Este é movido a gasolina, consome 8 Km/lt, o tanque tem
        // capacidade para 55 litros e é "FLEX" porque já prevê uma futura modificação nos motores.
        Carro suv = new Carro("SUV", TipoCombustivel.FLEX, 8, 55);

        // 4 - Crie um novo modelo de carro chamado "SUVFlex". Este é FLEX (gasolina ou alcool) e consome 8 Km/lt de gasolina
        // ou 6 Km/lt de alcool. O tanque é "FLEX" e tem 65 litros de capacidade. Por simplicidade assuma que o conteúdo
        // do tanque é sempre o do último abastecimento.

        Carro suvflex = new Carro("SUVFlex", TipoCombustivel.FLEX, 8, 6, 65);

        System.out.println("Tipos de veiculos:");
        System.out.println(basico);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250, TipoCombustivel.GASOLINA);
        basico.viaja(150, TipoCombustivel.GASOLINA);
        System.out.println(basico);
    }
}
