package Files;


public class Main {
    public static void main(String[] args) {
        File[] files = new File[]{
                new Document("j110-lab2-hiers.docx", 23212, "docx", 2),
                new Image("spb-map.png", 1703527, "image", 1024, 3072),
                new Multimedia("06-PrettyGirl.mp3", 7893454, "audio", "Eric Clapton, Pretty Girl", 5, 28),
                new Video("BackToTheFuture1.avi", 1470984192, "video", "Back to the future I, 1985", 1,  48, 8, 640, 352)
        };
        File.printAll(files);
        System.out.println();
        System.out.println();
        Document[] documents = new Document[] {
                new Document("j110-lab1.docx", 23212, "docx", 2),
                new Document("j110-lab2.docx", 11547, "docx", 4),
                new Document("j110-lab3.docx", 14678, "docx", 7),
                new Document("j110-lab4.docx", 22157, "docx", 9),
        }; // Метод File.printAll() может быть вызван для печати массива типа Document, поскольку тип Document унаследовал данный метод от класса File
        File.printAll(documents);
    }
}
