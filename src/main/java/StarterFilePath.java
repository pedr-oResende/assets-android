public class StarterFilePath extends FilePath {
    private String bibleIconName = "Bible.png";
    private String donationIconName = "Donation.png";
    private String groupsIconName = "GetInvolved.png";
    private String eventIconName = "Inscriptions.png";
    private String liveIconName = "Live.png";
    private String messagesIconName = "Messages.png";
    private String preachIconName = "Prayer.png";
    private String diaryIconName = "Schedule.png";
    private String notesIconName = "Notes.png";
    private String readingIconName = "Reading.png";
    private String jobsIconName = "Resume.png";
    private String downloadsIconName = "Downloads.png";
    private String readingsIconName = "Reading.png";
    private String contactIconName = "Contact.png";

    public StarterFilePath(String parentPath){
        super(parentPath);
    }

    public String getBibleIconPath(){
        return parentPath + bibleIconName;
    }

    public String getBibleIconOutputPath(){
        return outputPath + ResultFolder.NO_DPI_FOLDER.path + "ic_bible_circle.png";
    }

    public String getDonationIconPath(){
        return parentPath + donationIconName;
    }

    public String getDonationIconOutputPath(){
        return outputPath + ResultFolder.NO_DPI_FOLDER.path + "ic_donnations.png";
    }

    public String getGroupsIconPath(){
        return parentPath + groupsIconName;
    }

    public String getGroupsIconOutputPath(){
        return outputPath + ResultFolder.NO_DPI_FOLDER.path + "ic_store.png";
    }

    public String getEventIconPath(){
        return parentPath + eventIconName;
    }

    public String getEventIconOutputPath(){
        return outputPath + ResultFolder.NO_DPI_FOLDER.path + "ic_inscriptions.png";
    }

    public String getLiveIconPath(){
        return parentPath + liveIconName;
    }

    public String getLiveIconOutputPath(){
        return outputPath + ResultFolder.NO_DPI_FOLDER.path + "ic_live.png";
    }

    public String getPreachIconPath(){
        return parentPath + messagesIconName;
    }

    public String getPreachIconOutputPath(){
        return outputPath + ResultFolder.NO_DPI_FOLDER.path + "ic_words.png";
    }

    public String getPrayerIconPath(){
        return parentPath + preachIconName;
    }

    public String getPrayerIconOutputPath(){
        return outputPath + ResultFolder.NO_DPI_FOLDER.path + "ic_prayer.png";
    }

    public String getDiaryIconPath(){
        return parentPath + diaryIconName;
    }

    public String getDiaryIconOutputPath(){
        return outputPath + ResultFolder.NO_DPI_FOLDER.path + "ic_agenda.png";
    }

    public String getNotesIconPath(){
        return parentPath + notesIconName;
    }

    public String getNotesIconOutputPath(){
        return outputPath + ResultFolder.NO_DPI_FOLDER.path + "ic_annotations.png";
    }

    public String getReadingIconPath(){
        return parentPath + readingIconName;
    }

    public String getReadingIconOutputPath(){
        return outputPath + ResultFolder.NO_DPI_FOLDER.path + "ic_reading.png";
    }

    public String getContactIconPath(){
        return parentPath + contactIconName;
    }

    public String getContactIconOutputPath(){
        return outputPath + ResultFolder.NO_DPI_FOLDER.path + "ic_contact.png";
    }

    public String getDownloadsIconPath(){
        return parentPath + downloadsIconName;
    }

    public String getDownloadsIconOutputPath(){
        return outputPath + ResultFolder.NO_DPI_FOLDER.path + "ic_ebooks.png";
    }

    public String getReadingsIconPath(){
        return parentPath + readingsIconName;
    }

    public String getReadingsIconOutputPath(){
        return outputPath + ResultFolder.NO_DPI_FOLDER.path + "ic_reading.png";
    }
}
