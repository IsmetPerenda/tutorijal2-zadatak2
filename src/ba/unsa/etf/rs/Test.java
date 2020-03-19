package ba.unsa.etf.rs;


import javafx.scene.control.*;

public class Test {
    public Button button;
    public TextField inputText;
    public TextArea text;

    public boolean sumaCifara(int broj) {
        int suma_cifara = 0;
        int prvi_broj = broj;
        while (broj > 0) {
            suma_cifara = suma_cifara + broj % 10;
            broj = broj / 10;
        }
        return prvi_broj % suma_cifara == 0;
    }

    public void ispisiBrojeve() {
        String input = inputText.getText();
            int userNumber = Integer.parseInt(input);
            text.setText("Brojevi su:" + '\n');
            int brojac = 0;
            for (int i = 1; i <= userNumber; i++) {
                if (i == userNumber && sumaCifara(i)) {
                    text.appendText(i+" ");
                    brojac++;
                    break;
                }
                if (sumaCifara(i)) {
                    text.appendText(i+ " ");
                    brojac++;
                }
                if (brojac % 5 == 0)
                    text.appendText("\n");
            }

        }
    }
