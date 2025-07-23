import java.io.File;
import java.io.FileWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the folder path : ");
        String filePath = scanner.nextLine();

        while(true){
            System.out.println("1.Create a note.");
            System.out.println("2.Write to the note.");
            System.out.println("3.Read note.");
            System.out.println("4.Delete note.");
            System.out.println("5.List all notes.");
            System.out.println("6.Exit");
            System.out.println("Enter your choice : ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1 : createNote(filePath);
                break;
                case 2 : writeNote(filePath);
                break;
                case 3 : readFile(filePath);
                break;
                case 4 : deleteNote(filePath);
                break;
                case 5 : listAllNotes(filePath);
                break;
                case 6 :
                    System.out.println("Exiting..... Goodbye.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!!");
            }
        }
    }
    public static void createNote(String filePath){
        System.out.println("Enter note filename (e.g., note.txt): ");
        String filename = scanner.nextLine();

        File file = new File(filePath+"/"+filename);
        try{
            if(file.createNewFile()){
                System.out.println("File created successfully.");
            }else System.out.println("File already exist.");
        }catch (Exception e){
            System.out.println("An error occurred.");
        }
    }
    public static void writeNote(String folderPath){
        System.out.println("Enter fileName to write : ");
        String fileName = scanner.nextLine();
        System.out.println("Write : \n");
        String text = scanner.nextLine();
        File file = new File(folderPath+"/"+fileName);
        try{
            FileWriter writer = new FileWriter(file, true);
            writer.write(text+"\n");
            writer.close();
            System.out.println("Text written successfully.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
    public static void readFile(String filePath){
        System.out.println("Enter the filename to read : ");
        String filename = scanner.nextLine();
        File file = new File(filePath+"/"+filename);
        try{
            Scanner filescanner = new Scanner(file);
            while(filescanner.hasNextLine()){
                String line = filescanner.nextLine();
                System.out.println(line);
            }
            filescanner.close();
        }catch (Exception e){
            System.out.println("An error occurred.");
        }
    }
    public static void deleteNote(String filePath){
        System.out.println("Enter the filename to delete : ");
        String filename = scanner.nextLine();
        File file = new File(filePath+"/"+filename);
        try{
            if(file.exists()){
                if(file.delete()){
                    System.out.println("Note deleted successfully.");
                }else System.out.println("Failed to delete the note.");
            }else System.out.println("File do not exists.");
        }catch (Exception e){
            System.out.println("An error occurred.");
            String message = e.getMessage();
            System.out.println(message);
        }
    }
    public static void listAllNotes(String filePath){
        File folder = new File(filePath);
        try{
            if(!folder.exists() || !folder.isDirectory()){
                System.out.println("Folder doesn't exists or not in the directory.");
                return;
            }
            File[] notes = folder.listFiles();

            if(notes == null || notes.length == 0)
                System.out.println("No notes found.");
            else{
                System.out.println("List of notes : ");
                for(File file : notes){
                    System.out.println("-"+file.getName());
                }
            }

        }catch (Exception e){
            System.out.println("An error occurred.\n"+e.getMessage());
        }
    }
}
