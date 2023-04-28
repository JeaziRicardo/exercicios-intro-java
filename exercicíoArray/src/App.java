import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String [] countries = new String[4];

        for (int index = 0; index < 4; index += 1) {
            countries[index] = JOptionPane.showInputDialog("Digite o nome de um país");
        }

        for (String countriesList : countries) {
            System.out.println(countriesList);
        }
    }
}
