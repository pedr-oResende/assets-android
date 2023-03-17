import java.io.File;

public class FilePath {
    public enum ResultFolder {
        NO_DPI_FOLDER("drawable-nodpi/"),
        MDPI_FOLDER("drawable-mdpi/"),
        HDPI_FOLDER("drawable-hdpi/"),
        XHDPI_FOLDER("drawable-xhdpi/"),
        XXHDPI_FOLDER("drawable-xxhdpi/"),
        XXXHDPI_FOLDER("drawable-xxxhdpi/");

        public String path;
        ResultFolder(String path){
            this.path = path;
        }
    }

    protected String parentPath;
    protected String outputPath;
    protected String toolbarIconName = "nav.png";
    protected String loginIconName = "login.png";
    protected String splashIconName = "splash.png";
    protected String poweredByIconName = "inchurch.png";
    protected String splashBackgroundName = "background.png";
    protected String playStoreIconName = "playstore-icon.png";
    protected String pushIconName = "push.png";
    protected String sheetInfoName = "planilha.csv";

    public FilePath(String parentPath){
        this.parentPath = parentPath;
        outputPath = parentPath + "res/";
        createAllFolders();
    }

    public String getToolbarIconPath(){
        return parentPath + toolbarIconName;
    }

    public String getToolbarIconOutputPath(ResultFolder resultFolder){
        return outputPath + resultFolder.path + "ic_logo_toolbar.png";
    }

    public String getLoginIconPath(){
        return parentPath + loginIconName;
    }

    public String getLoginIconOutputPath(ResultFolder resultFolder){
        return outputPath + resultFolder.path + "ic_logo_app.png";
    }

    public String getPoweredByIconPath(){
        return parentPath + poweredByIconName;
    }

    public String getPoweredByIconOutputPath(ResultFolder resultFolder){
        return outputPath + resultFolder.path + "ic_powered_by.png";
    }

    public String getSplashBackgroundPath(){
        return parentPath + splashBackgroundName;
    }

    public String getSplashBackgroundOutputPath(ResultFolder resultFolder){
        return outputPath + resultFolder.path + "bg_splash.png";
    }

    public String getSplashIconPath(){
        return parentPath + splashIconName;
    }

    public String getSplashIconOutputPath(ResultFolder resultFolder){
        return outputPath + resultFolder.path + "ic_logo_splash.png";
    }

    public String getPlayStoreIconLargePath(){
        return parentPath + playStoreIconName;
    }

    public String getPlayStoreIconLargeOutputPath(ResultFolder resultFolder){
        return outputPath + resultFolder.path + "ic_onesignal_large_icon_default.png";
    }

    public String getPushIconPath(){
        return parentPath + pushIconName;
    }

    public String getPushIconOutputPath(ResultFolder resultFolder){
        return outputPath + resultFolder.path + "ic_stat_onesignal_default.png";
    }

    public String getSheetInfoPath() {
        return parentPath + sheetInfoName;
    }


    public void createAllFolders(){
        File file = new File(outputPath + ResultFolder.NO_DPI_FOLDER.path);
        if(!file.exists()){
            file.mkdirs();
        }

        file = new File(outputPath + ResultFolder.MDPI_FOLDER.path);
        if(!file.exists()){
            file.mkdirs();
        }

        file = new File(outputPath + ResultFolder.HDPI_FOLDER.path);
        if(!file.exists()){
            file.mkdirs();
        }

        file = new File(outputPath + ResultFolder.XHDPI_FOLDER.path);
        if(!file.exists()){
            file.mkdirs();
        }

        file = new File(outputPath + ResultFolder.XXHDPI_FOLDER.path);
        if(!file.exists()){
            file.mkdirs();
        }

        file = new File(outputPath + ResultFolder.XXXHDPI_FOLDER.path);
        if(!file.exists()){
            file.mkdirs();
        }
    }
}
