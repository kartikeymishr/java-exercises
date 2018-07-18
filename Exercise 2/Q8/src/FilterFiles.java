import java.io.File;

public class FilterFiles {

    public void listing(File[] listOfFiles, String searchString) {
        for (File file : listOfFiles) {
            if (file.isDirectory()) {
                listing(file.listFiles(), searchString);
            } else if (file.getName().contains(searchString)) {
                System.out.println(file.getName());
            }
        }
    }

    public static void main(String[] args) {
        // Search folder
        File folder = new File("/home/kartikey/Desktop");
        File[] listOfFiles = folder.listFiles();
        FilterFiles ff = new FilterFiles();
        ff.listing(listOfFiles, ".xml");
    }
}