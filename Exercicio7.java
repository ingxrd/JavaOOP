// Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar,desligar a lâmpada.
        class lampada{
            String Marca;
            int Watts;
            String Tipo;
            double Preco;
            boolean Inteligente;
            int Tensao;
            char EficienciaEnergetica;
            boolean ligada;

            public void ligar() {
                ligada = true;
            }

            public void desligar(){
                ligada = false;
        }
        void mostrarLigadaeDesligada(){
            if  (ligada){
                System.out.println("A lampada está ligada.");
            } else {
                System.out.println("A lampada está desligada.");
            }
        }
        }


        public class Exercicio7 {
            public static void main(String[] args) {
                lampada lampada1 = new lampada();
                lampada1.desligar();
                lampada1.mostrarLigadaeDesligada();
                lampada1.ligar();
                lampada1.mostrarLigadaeDesligada();
                

            }
        }
