import com.tinify.Tinify;

import java.util.*;


public class Main {
    private static final String API_KEY_0 = "FMzr1VCxGDbNQtG0RY5TR6r5xwscFKGj";
    private static final String API_KEY_1 = "ffQ3ZrxFLWy8KsghHF7tpDyyGdwjgRC6";
    private static final String API_KEY_2 = "brrwqgKZ7dpYdKcBhZPxz6CbbtMDTF44";
    private static final String API_KEY_3 = "r6SNCtgFqlv14F83tMZwxJ4p3qt94sYv";
    private static final String API_KEY_4 = "9mDx3dg1NKdLH4TNvqcNshvMxtgzzLhn";
    private static final String API_KEY_5 = "SLtyLV57VFKW7KtVF90hpMqJtxH1hlSc";
    private static final String API_KEY_6 = "QgpXNtzCjQzNyNhMTL3WdH4SytgTScmy";
    private static final String API_KEY_7 = "9XJR4VvDSh7Xz51DRBb64JpHxKzSvpSl";
    private static final String API_KEY_8 = "6v8LYPbBTNnBmzPGXDj1c0vl42r5LQqX";
    private static List<Assets> assets = new ArrayList<>();
    private static int quantity;

    public static void main(String[] args) {
        quantity = askQuantity();

        for (int i = 0; i < quantity; i++){
            FilePath filePath = new FilePath(askUserParentPath());
            assets.add(new Assets(filePath));
        }

        for (Assets assets :assets) {
            Tinify.setKey(API_KEY_0);

            assets.generateAssets();
            if (assets.getWasCompleted()){
                System.out.println("Finalizado com sucesso");
            } else {
                System.out.println("Ocorreu um erro, verifique os assets");
            }
        }
        System.exit(0);
    }

    private static int askQuantity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos WL's diferentes?");
        int quantity = scanner.nextInt();
        return quantity;
    }


    private static String askUserParentPath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o caminho da pasta dos assets");
        String path = scanner.nextLine();
        if (!path.endsWith("/")){
            path = path + "/";
        }
        return path;
    }
}
