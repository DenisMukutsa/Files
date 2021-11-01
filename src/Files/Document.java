package Files;

public class Document extends File {
    private String format;
    private int numberOfPages;

    public Document(String name, int size, String format, int numberOfPages) {
        super(name, size);
        setFormat(format);
        setNumberOfPages(numberOfPages);
    }

    public void setFormat(String format) {
        if(format != null && !format.equals("")) {
            this.format = format;
        }
    }

    public void setNumberOfPages(int numberOfPages) {
        if(numberOfPages > 0) {
            this.numberOfPages = numberOfPages;
        }
    }

    public String getFormat() {
        return format;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String toString() {
        return String.format("%-20s|", getName()) + String.format("%10d|", getSize()) + String.format("%-30s", getFormat() + ", " + getNumberOfPages() + " pages");
    }
}
