package Files;


public class Multimedia extends File {
    private String format;
    private String description;
    private StorageDurationMedia duration;

    public Multimedia(String name, int size, String format, String description, int minutes, int seconds) {
        super(name, size);
        setFormat(format);
        setDescription(description);
        duration = new StorageDurationMedia(minutes, seconds);
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
        return String.format("%-20s|", getName()) + String.format("%10s|", getSize()) + String.format("%-30s", getFormat() + ", " + getDescription() + ", " + duration.toString());
    }
}
