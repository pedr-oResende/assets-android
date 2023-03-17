import com.tinify.Options;
import com.tinify.Source;
import com.tinify.Tinify;
import java.io.File;

public class Assets {
    FilePath filePath;
    Boolean wasCompleted = true;

    public Assets(FilePath filePath) {
        this.filePath = filePath;
    }

    public void generateAssets(){
        createOptimizedToolbarIcon();
        createOptimizedSplashBackground();
        createOptimizedPoweredByIcon();
        try {
            createAllSplashIconVersions();
            createAllLoginIconVersions();
            createAllPushIconVersions();
            createOneSignalLargeIcon();
        } catch (Exception e){
            System.out.println(e);
            wasCompleted = false;
        }
    }

    protected void createOptimizedToolbarIcon() {
        createOptimizedAssetFromImage(filePath.getToolbarIconPath(), filePath.getToolbarIconOutputPath(FilePath.ResultFolder.NO_DPI_FOLDER));
    }

    public Boolean getWasCompleted(){
        return wasCompleted;
    }

    protected void createOptimizedSplashBackground() {
        createOptimizedAssetFromImage(filePath.getSplashBackgroundPath(), filePath.getSplashBackgroundOutputPath(FilePath.ResultFolder.NO_DPI_FOLDER));
    }

    protected void createOptimizedPoweredByIcon() {
        createOptimizedAssetFromImage(filePath.getPoweredByIconPath(), filePath.getPoweredByIconOutputPath(FilePath.ResultFolder.XXXHDPI_FOLDER));
    }
    
    protected void createAllSplashIconVersions() throws Exception {
        File file = new File(filePath.getSplashIconPath());

        if (file.exists()) {
            Integer size = 650;
            Source source = Tinify.fromFile(filePath.getSplashIconPath());

            Options xxxhdpiOptions = new Options();
            xxxhdpiOptions.with("method", "scale")
                    .with("width", size);
            Source xxxhdpiResized = source.resize(xxxhdpiOptions);
            xxxhdpiResized.toFile(filePath.getSplashIconOutputPath(FilePath.ResultFolder.XXXHDPI_FOLDER));

            Options xxhdpiOptions = new Options();
            xxhdpiOptions.with("method", "scale")
                    .with("width", Math.round((size * 0.75)));
            Source xxhdpiResized = source.resize(xxhdpiOptions);
            xxhdpiResized.toFile(filePath.getSplashIconOutputPath(FilePath.ResultFolder.XXHDPI_FOLDER));

            Options xhdpiOptions = new Options();
            xhdpiOptions.with("method", "scale")
                    .with("width", Math.round(size * 0.5));
            Source xhdpiResized = source.resize(xhdpiOptions);
            xhdpiResized.toFile(filePath.getSplashIconOutputPath(FilePath.ResultFolder.XHDPI_FOLDER));

            Options hdpiOptions = new Options();
            hdpiOptions.with("method", "scale")
                    .with("width", Math.round(size * 0.375));
            Source hdpiResized = source.resize(hdpiOptions);
            hdpiResized.toFile(filePath.getSplashIconOutputPath(FilePath.ResultFolder.HDPI_FOLDER));

            Options mdpiOptions = new Options();
            mdpiOptions.with("method", "scale")
                    .with("width", Math.round(size * 0.25));
            Source mdpiResized = source.resize(mdpiOptions);
            mdpiResized.toFile(filePath.getSplashIconOutputPath(FilePath.ResultFolder.MDPI_FOLDER));

            System.out.println("Criei a logo da splash");
        } else {
            System.out.println("Não achei a logo da splash");
        }

    }

    protected void createAllLoginIconVersions() throws Exception {
        File file = new File(filePath.getLoginIconPath());
        if (file.exists()) {
            int size = 700;
            Source source = Tinify.fromFile(filePath.getLoginIconPath());

            Options xxxhdpiOptions = new Options();
            xxxhdpiOptions.with("method", "scale")
                    .with("width", size);
            Source xxxhdpiResized = source.resize(xxxhdpiOptions);
            xxxhdpiResized.toFile(filePath.getLoginIconOutputPath(FilePath.ResultFolder.XXXHDPI_FOLDER));

            Options xxhdpiOptions = new Options();
            xxhdpiOptions.with("method", "scale")
                    .with("width", Math.round((size * 0.75)));
            Source xxhdpiResized = source.resize(xxhdpiOptions);
            xxhdpiResized.toFile(filePath.getLoginIconOutputPath(FilePath.ResultFolder.XXHDPI_FOLDER));

            Options xhdpiOptions = new Options();
            xhdpiOptions.with("method", "scale")
                    .with("width", Math.round(size * 0.5));
            Source xhdpiResized = source.resize(xhdpiOptions);
            xhdpiResized.toFile(filePath.getLoginIconOutputPath(FilePath.ResultFolder.XHDPI_FOLDER));

            Options hdpiOptions = new Options();
            hdpiOptions.with("method", "scale")
                    .with("width", Math.round(size * 0.375));
            Source hdpiResized = source.resize(hdpiOptions);
            hdpiResized.toFile(filePath.getLoginIconOutputPath(FilePath.ResultFolder.HDPI_FOLDER));

            Options mdpiOptions = new Options();
            mdpiOptions.with("method", "scale")
                    .with("width", Math.round(size * 0.25));
            Source mdpiResized = source.resize(mdpiOptions);
            mdpiResized.toFile(filePath.getLoginIconOutputPath(FilePath.ResultFolder.MDPI_FOLDER));

            System.out.println("Criei a logo do login");
        } else {
            System.out.println("Não achei a logo do login");
        }

    }

    protected void createAllPushIconVersions() throws Exception {
        File file = new File(filePath.getPushIconPath());
        if (file.exists()) {
            Integer size = 96;
            Source source = Tinify.fromFile(filePath.getPushIconPath());
            source.toFile(filePath.getPushIconOutputPath(FilePath.ResultFolder.XXXHDPI_FOLDER));

            Options xxhdpiOptions = new Options();
            xxhdpiOptions.with("method", "scale")
                    .with("width", Math.round((size * 0.75)));
            Source xxhdpiResized = source.resize(xxhdpiOptions);
            xxhdpiResized.toFile(filePath.getPushIconOutputPath(FilePath.ResultFolder.XXHDPI_FOLDER));

            Options xhdpiOptions = new Options();
            xhdpiOptions.with("method", "scale")
                    .with("width", Math.round(size * 0.5));
            Source xhdpiResized = source.resize(xhdpiOptions);
            xhdpiResized.toFile(filePath.getPushIconOutputPath(FilePath.ResultFolder.XHDPI_FOLDER));

            Options hdpiOptions = new Options();
            hdpiOptions.with("method", "scale")
                    .with("width", Math.round(size * 0.375));
            Source hdpiResized = source.resize(hdpiOptions);
            hdpiResized.toFile(filePath.getPushIconOutputPath(FilePath.ResultFolder.HDPI_FOLDER));

            Options mdpiOptions = new Options();
            mdpiOptions.with("method", "scale")
                    .with("width", Math.round(size * 0.25));
            Source mdpiResized = source.resize(mdpiOptions);
            mdpiResized.toFile(filePath.getPushIconOutputPath(FilePath.ResultFolder.MDPI_FOLDER));

            System.out.println("Criei a logo de push");
        } else {
            System.out.println("Não achei a logo de push");
        }

    }

    protected void createOneSignalLargeIcon()  {
        createOptimizedAssetFromImage(filePath.getPlayStoreIconLargePath(), filePath.getPlayStoreIconLargeOutputPath(FilePath.ResultFolder.XXXHDPI_FOLDER));
    }

    protected void createOptimizedAssetFromImage(String inputPath, String outputPath) {
        File file = new File(inputPath);
        if (file.exists()) {
            try {
                Source source = Tinify.fromFile(inputPath);
                source.toFile(outputPath);
                System.out.println("Criei o arquivo: " + outputPath);
            } catch (Exception e) {
                System.out.println("Ocorreu um erro ao processar as imagens");
                System.out.println(e);
            }
        } else {
            System.out.println("Não encontrei o caminho: " + inputPath);
        }

    }
}
