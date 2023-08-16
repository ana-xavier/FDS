- Aulas da disciplina de Fundamentos de Desenvolvimento de Software (FDS)

# Enunciado do exercício

Analise as classes, Carro, Motor e TanqueCombustivel. Verifique a lista de
solicitacoes e apresente o código modificado de maneira a atender a todas.
Apresente também um relatório que discuta o impacto das modificações propostas e
se as classes originais poderiam ter sido pensadas de outra forma para dar conta
melhor de eventuais modificações.

Para cada uma das solicitações que seguem crie uma instancia do modelo respectivo, 
abasteça, faça uma viagem e chame o método "toString" para exibir a situação final.

1) Crie um novo modelo de carro chamado "Esportivo". Este é movido a gasolina,
   consome 6 Km/lt e o tanque tem capacidade para 45 litros.

2) Crie um novo modelo de carro chamado "Utilitario". Este é movido a diesel,
   consome 5 Km/lt e o tanque tem capacidade para 70 litros.

3) Crie um novo modelo de carro chamado "SUV". Este é movido a gasolina, consome
   8 Km/lt, o tanque tem capacidade para 55 litros e é "FLEX" porque já prevê
   uma futura modificação nos motores.

4) Crie um novo modelo de carro chamado "SUVFlex". Este é FLEX (gasolina ou
   alcool) e consome 8 Km/lt de gasolina ou 6 Km/lt de alcool. O tanque é "FLEX"
   e tem 65 litros de capacidade. Por simplicidade assuma que o conteúdo do tanque 
   é sempre o do último abastecimento.

5) Crie um novo modelo de carro chamado "Econo". É movido a gasolina, tanque tem
   capacidade para 55 litros e caracterizam-se por ser extremamente econômicos.
   O consumo deste quando novo é de 20 Km/lt, porém este consumo reduz 1 Km/lt a
   cada 5000 Km até que se estabiliza em 10 Km/lt.
