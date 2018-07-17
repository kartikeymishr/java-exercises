import java.io.File;

public class FilterFiles {

    // Listing all files in a directory. Recursive call for multiple sub-directories.
    public void listFilesInFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesInFolder(fileEntry);
            } else {
                System.out.println(fileEntry.getName());
            }
        }
    }

    public static void main(String[] args) {
        FilterFiles ff = new FilterFiles();

        final File folder = new File("/home/kartikey/Desktop");
        ff.listFilesInFolder(folder);
    }
}
