import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class ColorAssets extends Assets {
    BufferedReader csvReader;
    Map<String, String> convertNameMap = new HashMap<>();
    Map<String, String> mapCores = new HashMap<>();

    /*Colors name on android project*/
    private String primaryAndroidName = "primary";
    private String onPrimaryAndroidName = "on_primary";
    private String primaryVariantAndroidName = "primary_variant";
    private String onPrimaryVariantAndroidName = "on_primary_variant";
    private String onPrimaryVariantAlternativeAndroidName = "on_primary_variant_alternative";
    private String secondaryAndroidName = "secondary";
    private String onSecondaryAndroidName = "on_secondary";
    private String secondaryVariantAndroidName = "secondary_variant";
    private String onSecondaryVariantAndroidName = "on_secondary_variant";
    private String backgroundAndroidName = "background";
    private String onBackgroundAndroidName = "on_background";
    private String onBackgroundVariantAndroidName = "on_background_variant";
    private String surfaceAndroidName = "surface";
    private String onSurfaceAndroidName = "on_surface";
    private String onSurfaceVariantAndroidName = "on_surface_variant";

    /*Colors name on sheet*/
    private String primarySheetName = "Primary";
    private String onPrimarySheetName = "On Primary";
    private String primaryVariantSheetName = "Primary Variant";
    private String onPrimaryVariantSheetName = "On Primary Variant";
    private String onPrimaryVariantAlternativeSheetName = "On Primary Alternative";
    private String secondarySheetName = "Secondary";
    private String onSecondarySheetName = "On Secondary";
    private String secondaryVariantSheetName = "Secondary Variant";
    private String onSecondaryVariantSheetName = "On Secondary Variant";
    private String backgroundSheetName = "Background";
    private String onBackgroundSheetName = "On Background";
    private String onBackgroundVariantSheetName = "On Background Alternative";
    private String surfaceSheetName = "Surface";
    private String onSurfaceSheetName = "On Surface";
    private String onSurfaceVariantSheetName = "On Surface Variant";

    public ColorAssets(FilePath filePath){
        super(filePath);
        initMap();
        readCsvFile();
        convert();
    }

    private void initMap() {
        convertNameMap.put(primarySheetName, primaryAndroidName);
        convertNameMap.put(onPrimarySheetName, onPrimaryAndroidName);
        convertNameMap.put(primaryVariantSheetName, primaryVariantAndroidName);
        convertNameMap.put(onPrimaryVariantSheetName, primaryVariantAndroidName);
        convertNameMap.put(onPrimaryVariantAlternativeSheetName, onPrimaryVariantAlternativeSheetName);
        convertNameMap.put(secondarySheetName, secondaryAndroidName);
        convertNameMap.put(onSecondarySheetName, onSecondaryAndroidName);
        convertNameMap.put(secondaryVariantSheetName, secondaryVariantAndroidName);
        convertNameMap.put(onSecondaryVariantSheetName, onSecondaryVariantAndroidName);
        convertNameMap.put(backgroundSheetName, backgroundAndroidName);
        convertNameMap.put(onBackgroundSheetName, onBackgroundAndroidName);
        convertNameMap.put(onBackgroundVariantSheetName, onBackgroundVariantAndroidName);
        convertNameMap.put(surfaceSheetName, surfaceAndroidName);
        convertNameMap.put(onSurfaceSheetName, onSurfaceAndroidName);
        convertNameMap.put(onSurfaceVariantSheetName, onSurfaceVariantAndroidName);
    }

    private void readCsvFile() {
        try {
            csvReader = new BufferedReader(new FileReader(filePath.getSheetInfoPath()));
            System.out.println("Encontrei o arquivo csv, tentarei ler o arquivo");

        } catch (Exception e){
            System.out.println("Não Encontrei o arquivo csv, o nome do arquivo deve ser planilha.csv");
        }
    }

    private void convert() {
//        String value = convertNameMap.get("Primary");
//        mapCores.put(value, "cor correspondente");
        try {
            String row = csvReader.readLine();

            while (row!= null){
                if (rowHasKeyString(row)){
                    String[] splittedRow = row.split(",");

                    for (int i = 0; i < splittedRow.length - 1; i++) {
                        if (convertNameMap.containsKey(splittedRow[i])){

                        }
                    }
                }
                row = csvReader.readLine();

            }

        } catch (Exception e){

        }
    }

    private boolean rowHasKeyString(String row) {
        return row.contains(primarySheetName) || row.contains(secondarySheetName) || row.contains(backgroundSheetName) || row.contains(surfaceSheetName);
    }

//    private void createMapWithEmptyValues(){
//        convertNameMap.put(backgroundAndroidName, "");
//        convertNameMap.put(onBackgroundAndroidName, "");
//        convertNameMap.put(onBackgroundVariantAndroidName, "");
//        convertNameMap.put(primaryAndroidName, "");
//        convertNameMap.put(onPrimaryAndroidName, "");
//        convertNameMap.put(primaryVariantAndroidName, "");
//        convertNameMap.put(onPrimaryVariantAndroidName, "");
//        convertNameMap.put(onPrimaryVariantAlternativeAndroidName, "");
//        convertNameMap.put(secondaryAndroidName, "");
//        convertNameMap.put(onSecondaryAndroidName, "");
//        convertNameMap.put(secondaryVariantAndroidName, "");
//        convertNameMap.put(onSecondaryVariantAndroidName, "");
//        convertNameMap.put(surfaceAndroidName, "");
//        convertNameMap.put(onSurfaceAndroidName, "");
//        convertNameMap.put(onSurfaceVariantAndroidName, "");
//    }


}
