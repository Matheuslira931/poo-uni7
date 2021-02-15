class Carro {
  String marca;
  String modelo;
  int tanque;
  int andar;

  void andar(int distancia){

    int bebeu;

    bebeu = distancia / 8;

    if(tanque >= bebeu){
      System.out.println("Carro andou " + distancia + "km");

      tanque = tanque - bebeu;
    }else {
      System.out.println("Abastecer o carro");
    }

  }
}