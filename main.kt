import kotlin.math.*

fun main() {

  exercicio01()
  exercicio02()
  exercicio03()
  exercicio04()
  exercicio05()
  exercicio06()
  exercicio07()
  exercicio08()
  exercicio09()
  exercicio10()
  exercicio11()
  exercicio12()
  exercicio13()  
  
}

fun exercicio01() {

  /* 
  Exercício: Mensagem de boas-vindas
  Crie um programa em Kotlin que receba o nome da pessoa e informe que o nome  
  do professor é "Higor"e exiba uma mensagem de boas-vindas personalizada.
  Ex: Digite seu nome:
  Usuário: Ana
  Saída: Olá Ana! Bem-vindo à aula do Professor Higor!
  */

  println("Insira seu nome:")
  var nome: String = readLine()!!
  println("Olá, " + nome + "! Bem-vindo(a) à aula do Professor Higor!")
  
}

fun exercicio02() {

  /*
  Exercício: Conversão de Celsius para Fahrenheit
  Elabore um programa em Kotlin que converta uma temperatura de Celsius para      Fahrenheit usando a fórmula: (celsius * 9/5) + 32.
  Ex: Digite a temperatura em Celsius:
  Usuário: 25
  Saída: 25°C é igual a 77°F
  */

  println("Digite uma temperatura em graus Celsius:")
  var temperaturaCelsius: Double = readLine()!!.toDouble()
  val temperaturaFahreinheit = (temperaturaCelsius * 9.toDouble() / 5.toDouble()) + 32.toDouble()

  println("$temperaturaCelsius°C é igual a $temperaturaFahreinheit°F")
  
}

fun exercicio03() {

  /*
  Exercício: Cálculo da área de um triângulo
  Desenvolva um programa em Kotlin que calcule a área de um triângulo usando a 
  fórmula: (base * altura) / 2.
  Ex: Digite a base do triângulo em cm:
  Usuário: 10 Digite a altura do triângulo em cm:
  Usuário: 5
  Saída: A área do triângulo é 25cm²
  */

  println("Digite a base do Triângulo em cm:")
  var baseTriangulo: Double = readLine()!!.toDouble()
  println("Digite a altura do Triângulo em cm:")
  var alturaTriangulo: Double = readLine()!!.toDouble()

  val areaTriangulo = (baseTriangulo * alturaTriangulo) / 2
  println("A área do triângulo é " + areaTriangulo + " cm²")
  
}

fun exercicio04() {

  /*  
  Exercício: Conversão de Reais para Dólares
  Crie um programa em Kotlin  que converta um valor em reais para dólares,
  considerando a taxa de câmbio R$5,50 = $1,00.
  Ex: Digite o valor em reais:
  Usuário: 50
  Saída: R$50,00 é igual a $9,09
  */

  println("Digite o valor em reais:")
  var valorReal:Double = readLine()!!.toDouble()

  val valorDolar = valorReal/5.5
  println("R$"+valorReal+" é igual a $"+valorDolar)

}

fun exercicio05() {

  /*  
  Exercício: Cálculo do IMC
  Elabore um programa em Kotlin que calcule o Índice de Massa Corporal (IMC) de 
  uma pessoa usando a fórmula: peso / (altura * altura).
  Ex: Digite seu peso em kg:
  Usuário: 70 Digite sua altura em metros:
  Usuário: 1.75
  Saída: Seu IMC é 22.86
  */
  
  println("Digite seu peso em kg:")
  var massaCorporal:Double = readLine()!!.toDouble()
  println("Digite sua altura em metros:")
  var altura:Double = readLine()!!.toDouble()

  val IMC = massaCorporal/altura.pow(2)
  println("Seu IMC é $IMC")

}

fun exercicio06() {

  /*
  Exercício: Cálculo do perímetro de um círculo
  Desenvolva um programa em Kotlin que calcule o perímetro de um círculo usando 
  a fórmula: 2 * π * raio.
  Ex: Digite o raio do círculo em cm:
  Usuário: 5
  Saída: O perímetro do círculo é 31.4cm
  */
  
  println("Digite o raio do círculo em cm:")
  var raioCirculo: Double = readLine()!!.toDouble()

  val perimetroCirculo = 2 * PI * raioCirculo
  println("O perímetro do círculo é $perimetroCirculo cm")
  
}

fun exercicio07() {

  /*
  Exercício: Conversão de km/h para m/s
  Crie um programa em Kotlin  que converta uma velocidade de km/h para m/s 
  usando a fórmula: km/h * 1000 / 3600.
  Ex: Digite a velocidade em km/h:
  Usuário: 72
  Saída: 72km/h é igual a 20m/s
  */
  
  println("Digite a velocidade em km/h:")
  var velocidadeQuilometroPorHora: Double = readLine()!!.toDouble()

  val velocidadeMetroPorSegundo = velocidadeQuilometroPorHora * 1000 / 3600
  println("$velocidadeQuilometroPorHora km/h é igual a $velocidadeMetroPorSegundo m/s")
  
}

fun exercicio08() {

  /*
  Exercício: Cálculo do volume de uma esfera
  Elabore um programa em Kotlin que calcule o volume de uma esfera usando a 
  fórmula: (4/3) * π * raio³.
  Ex: Digite o raio da esfera em cm:
  Usuário: 3
  Saída: O volume da esfera é 113.1cm³
  */

  println("Digite o raio da esfera em cm:")
  var raioEsfera: Double = readLine()!!.toDouble()

  val volumeEsfera = (4.toDouble() / 3.toDouble()) * PI * raioEsfera.pow(3)
  println("O volume da esfera é $volumeEsfera cm³")
  
}

fun exercicio09() {

  /*
  Exercício: Conversão de Celsius para Kelvin
  Desenvolva um programa em Kotlin que converta uma temperatura de Celsius para 
  Kelvin usando a fórmula: celsius + 273.15.
  Ex: Digite a temperatura em Celsius:
  Usuário: 25
  Saída: 25°C é igual a 298.15K
  */
  
  println("Digite a temperatura em Celsius:")
  var temperaturaCelsius: Double = readLine()!!.toDouble()

  val temperaturaKelvin = temperaturaCelsius + 273.15
  println("$temperaturaCelsius °C é igual a $temperaturaKelvin K")
  
}

fun exercicio10() {

  /*
  Exercício: Exibição de nome na tela
  Desenvolva um programa em Kotlin  que exiba seu nome na tela.
  Ex: Digite seu nome:
  Usuário: Maria
  Saída: Olá, Maria!
  */
  
  println("Digite seu nome:")
  var nome: String = readLine()!!

  println("Olá, $nome!")
  
}

fun exercicio11() {

  /*
  Exercício: Soma de três variáveis
  Desenvolva um programa em Kotlin que calcule a soma de três variáveis e 
  imprima o resultado na tela.
  Ex: Digite três números:
  Usuário: 5 10 15
  Saída: A soma dos números é: 30
  */


  println("Digite três números:")
  var numeroUm = readLine()!!.toDouble()
  var numeroDois = readLine()!!.toDouble()
  var numeroTres = readLine()!!.toDouble()

  println("A soma dos números inseridos é igual a " + (numeroUm + numeroDois + numeroTres))
  
}

fun exercicio12() {

  /*
  Exercício: Subtração de idades
  Desenvolva um programa em Kotlin que peça duas idades e imprima subtração das 
  idades  e mostre na tela.
  Ex: Digite duas idades
  Usuário: 5 7
  Saída: A diferença entre as idades é: -2
  */

  println("Digite duas idades:")
  var idadeUm = readLine()!!.toInt()
  var idadeDois = readLine()!!.toInt()
  var moduloDiferenca = 0
  val diferença = (idadeUm - idadeDois)

  if (diferença<1){
    moduloDiferenca = diferença*(-1)
  }

  println("A diferença entre as idades é de $moduloDiferenca anos")
  
}

fun exercicio13() {

  /*
  Exercício: Conversão de metros para milímetros
  Desenvolva um programa em Kotlin que leia um valor em metros e o exiba 
  convertido em milímetros.
  Ex: Digite um valor em metros:
  Usuário: 1.5
  Saída: 1.5 metros equivalem a 1500 milímetros
  */

  println("Digite um valor em metros:")
  var valorMetro = readLine()!!.toDouble()

  println("$valorMetro metros equivalem a "+valorMetro*1000+" milímetros")
  
}
