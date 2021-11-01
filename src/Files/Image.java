package Files;

public class Image extends File {
    private String format;
    private int height;
    private int width;

    public Image(String name, int size, String format, int height, int width) {
        super(name, size);
        setFormat(format);
        setHeight(height);
        setWidth(width);

    }

    public void setFormat(String format) {
        if(format != null && !format.equals("")) {
            this.format = format;
        }
    }

    public void setHeight(int height) {
        if(height > 0) {
            this.height = height;
        }
    }

    public void setWidth(int width) {
        if(width > 0) {
            this.width = width;
        }
    }

    public String getFormat() {
        return format;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String toString() {
        return String.format("%-20s|", getName()) + String.format("%10s|", getSize()) + String.format("%-30s", getFormat() + ", " + getHeight() + "x" + getWidth());
    }
}
