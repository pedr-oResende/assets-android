public class StarterAssets extends Assets {

    public StarterAssets(StarterFilePath filePath) {
        super(filePath);
        createBibleIcon();
        createDonationIcon();
        createGroupsIcon();
        createEventIcon();
        createLiveIcon();
        createMessagesIcon();
        createPrayerIcon();
        createDiaryIcon();
        createNotesIcon();
        createGuideIcon();
        createJobsIcon();
        createDownloadsIcon();
        createReadingsIcon();
    }

    protected void createBibleIcon(){
        StarterFilePath starterFilePath = (StarterFilePath) filePath;
        createOptimizedAssetFromImage(starterFilePath.getBibleIconPath(),starterFilePath.getBibleIconOutputPath());
    }

    protected void createDonationIcon() {
        StarterFilePath starterFilePath = (StarterFilePath) filePath;
        createOptimizedAssetFromImage(starterFilePath.getDonationIconPath(),starterFilePath.getDonationIconOutputPath());
    }

    protected void createGroupsIcon() {
        StarterFilePath starterFilePath = (StarterFilePath) filePath;
        createOptimizedAssetFromImage(starterFilePath.getGroupsIconPath(),starterFilePath.getGroupsIconOutputPath());
    }

    protected void createEventIcon(){
        StarterFilePath starterFilePath = (StarterFilePath) filePath;
        createOptimizedAssetFromImage(starterFilePath.getEventIconPath(),starterFilePath.getEventIconOutputPath());
    }

    protected void createLiveIcon() {
        StarterFilePath starterFilePath = (StarterFilePath) filePath;
        createOptimizedAssetFromImage(starterFilePath.getLiveIconPath(),starterFilePath.getLiveIconOutputPath());
    }

    protected void createMessagesIcon() {
        StarterFilePath starterFilePath = (StarterFilePath) filePath;
        createOptimizedAssetFromImage(starterFilePath.getPreachIconPath(),starterFilePath.getPreachIconOutputPath());
    }

    protected void createPrayerIcon() {
        StarterFilePath starterFilePath = (StarterFilePath) filePath;
        createOptimizedAssetFromImage(starterFilePath.getPrayerIconPath(),starterFilePath.getPrayerIconOutputPath());
    }

    protected void createDiaryIcon()  {
        StarterFilePath starterFilePath = (StarterFilePath) filePath;
        createOptimizedAssetFromImage(starterFilePath.getDiaryIconPath(),starterFilePath.getDiaryIconOutputPath());
    }

    protected void createNotesIcon() {
        StarterFilePath starterFilePath = (StarterFilePath) filePath;
        createOptimizedAssetFromImage(starterFilePath.getNotesIconPath(),starterFilePath.getNotesIconOutputPath());
    }

    protected void createGuideIcon()  {
        StarterFilePath starterFilePath = (StarterFilePath) filePath;
        createOptimizedAssetFromImage(starterFilePath.getReadingIconPath(),starterFilePath.getReadingIconOutputPath());
    }

    protected void createJobsIcon()  {
        StarterFilePath starterFilePath = (StarterFilePath) filePath;
        createOptimizedAssetFromImage(starterFilePath.getContactIconPath(),starterFilePath.getContactIconOutputPath());
    }

    protected void createDownloadsIcon()  {
        StarterFilePath starterFilePath = (StarterFilePath) filePath;
        createOptimizedAssetFromImage(starterFilePath.getDownloadsIconPath(),starterFilePath.getDownloadsIconOutputPath());
    }

    protected void createReadingsIcon() {
        StarterFilePath starterFilePath = (StarterFilePath) filePath;
        createOptimizedAssetFromImage(starterFilePath.getDownloadsIconPath(),starterFilePath.getDownloadsIconOutputPath());
    }

}
