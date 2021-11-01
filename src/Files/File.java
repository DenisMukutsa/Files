package Files;

public abstract class File {
    private String name;
    private int size;

    public File(String name, int size) {
        setName(name);
        setSize(size);
    }

    public void setName(String name) {
        if(name != null && !name.equals("")) {
            this.name = name;
        }
    }

    public void setSize(int size) {
        if(size > 0) {
            this.size = size;
        }
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public abstract String toString();

    public static void printAll(File[] files) {
        System.out.println("-―".repeat(35));
        System.out.println(String.format("%-20s|","File name") + String.format("%-10s|","Size") + String.format("%-10s","Details"));
        System.out.println("\u002D".repeat(45));
        for(File file : files) {
            System.out.println(file.toString());
        }
        System.out.println("-―".repeat(35));
    }

}
