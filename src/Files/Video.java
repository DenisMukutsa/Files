package Files;


public class Video extends File {
    private String format;
    private String description;
    private int heigth;
    private int width;
    private StorageDurationMedia duration;
    private StorageSizeOfImage sizeOfImage;

    public Video(String name, int size, String format, String description, int hours, int minutes, int seconds, int height, int width) {
        super(name, size);
        sizeOfImage = new StorageSizeOfImage(height, width);
        duration = new StorageDurationMedia(hours, minutes, seconds);
        setFormat(format);
        setDescription(description);
    }

    public void setFormat(String format) {
        if(format != null && !format.equals("")) {
            this.format = format;
        }
    }

    public void setDescription(String description) {
        if(description != null && !description.equals("")) {
            this.description = description;
        }
    }

    public String getFormat() {
        return format;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return String.format("%-20s|", getName()) + String.format("%10s", getSize()) + "|" + getFormat() + ", " + getDescription() + ", " + duration.toString() + ", " + sizeOfImage.toString();
    }

}
