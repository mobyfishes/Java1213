package day2;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Assignment2 {

    public static int countFiles = 0;
    public static int countFolders = 0;
    public static Set<String> map = new HashSet<String>();

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        while(true) {
            System.out.println("\nPlease Enter Folder Path or enter q to exit");
            String x = keyboard.nextLine();
            if (x.equals("q")){
                System.out.println("Terminating...");
                break;
            }

            int num = 0;
            Criteria criteria;
            try{
                System.out.println("Enter 1 for include sub folder, 0 for not.");
                String tamp = keyboard.nextLine();
                num = Integer.parseInt(tamp);
                if (num > 1 || num < 0){
                    System.out.println("Error: Please enter a valid number.");
                }
                else{
                    criteria = new Criteria(x, num);
                    count(criteria);
                }

            }
            catch(NumberFormatException e){
                System.out.println("Error: Please enter a valid number.");
            }

        }
    }


    public static void count(Criteria criteria){

        if (criteria.getIncludeSubFolder() == 1){
            getAllFile(criteria.folderPath);
        }
        else if(criteria.getIncludeSubFolder() == 0){
            getFile(criteria.folderPath);
        }

        System.out.println("\nInside the foder: " + criteria.getFolderPath());
        System.out.println("Total folder(s):" + countFolders);
        System.out.println("Total file(s):" + countFiles);
        System.out.println("Total " + map.size() + " types of extension(s)");
        countFiles = 0;
        countFolders = 0;
        map.clear();
    }

    /**
     * Only counting sub-folders and files inside this folder.
     * @param folderPath folder path
     */
    private static void getFile(String folderPath) {
        File f = new File(folderPath);
        File[] files = f.listFiles();

        if (files != null)
            for (int i = 0; i < files.length; i++) {

                File file = files[i];

                if (file.isDirectory()) {
                    countFolders++;
                }
                else{
                    countFiles++;
                    int extensionIndex = file.getName().lastIndexOf('.');
                    if (extensionIndex > 0) {
                        String extension = file.getName().substring(extensionIndex+1);
                        map.add(extension);
                    }
                }
            }
    }

    /**
     * Counting all files in the sub-folders and sub-folders inside this folder.
     * @param dirPath folder path
     */
    private static void getAllFile(String dirPath) {
        File f = new File(dirPath);
        File[] files = f.listFiles();

        if (files != null)
            for (int i = 0; i < files.length; i++) {

                File file = files[i];

                if (file.isDirectory()) {
                    countFolders++;
                    getAllFile(file.getAbsolutePath());
                }
                else{
                    countFiles++;
                    int extensionIndex = file.getName().lastIndexOf('.');
                    if (extensionIndex > 0) {
                        String extension = file.getName().substring(extensionIndex+1);
                        map.add(extension);
                    }
                }
            }
    }

    static class Criteria{
        private String folderPath;
        private int includeSubFolder = 0;

        public Criteria(){

        }

        public Criteria(String s, int i){
            this.folderPath = s;
            this.includeSubFolder = i;
        }

        public String getFolderPath() {
            return folderPath;
        }

        public int getIncludeSubFolder() {
            return includeSubFolder;
        }

    }

}
