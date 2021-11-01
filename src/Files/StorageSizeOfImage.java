package Files;

public class StorageSizeOfImage {
    private int height;
    private int width;

    public StorageSizeOfImage(int height, int width) {
        setHeight(height);
        setWidth(width);
    }

    public void setHeight(int height) {
        if(height > 0) {
            this.height = height;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        if(width > 0) {
            this.width = width;
        }
    }

    public int getWidth() {
        return width;
    }

    public String toString() {
        return height + "x" + width;
    }

}
