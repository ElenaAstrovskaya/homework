package hw7;

import java.io.*;
import java.sql.SQLOutput;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class WorkWithDir {
    // Создать на диске каталог (папку). В созданном каталоге создать три файла с
    //содержимым. Заархивировать эти три файла в одном архиве.
    //Переименовать каталог. Вывести в консоль все содержимое каталога.
    //Удалить каталог.
    public static void main(String[] args) {

        File testDir = new File("D://tmp//testDir");

        boolean created = testDir.mkdir();
        if (created) {
            System.out.println("The folder \"testDir\" is created");
        } else {
            System.out.println("The folder \"testDir\" is not created");
        }

        File testFile1 = new File("D://tmp//testDir", "testFile1.txt");
        File testFile2 = new File("D://tmp//testDir", "testFile2.txt");
        File testFile3 = new File("D://tmp//testDir", "testFile3.txt");

        try {
            FileWriter fw1 = new FileWriter("D://tmp//testDir//testFile1.txt");
            fw1.write("Some text for file 1");
            fw1.flush();
            fw1.close();

            FileWriter fw2 = new FileWriter("D://tmp//testDir//testFile2.txt");
            fw2.write("Some text for file 2");
            fw2.flush();
            fw2.close();

            FileWriter fw3 = new FileWriter("D://tmp//testDir//testFile3.txt");
            fw3.write("Some text for file 3");
            fw3.flush();
            fw3.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String filename1 = "D://tmp//testDir//testFile1.txt";
        String filename2 = "D://tmp//testDir//testFile2.txt";
        String filename3 = "D://tmp//testDir//testFile3.txt";
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("D://tmp//testDir//testArchive.zip"));
             FileInputStream fis1 = new FileInputStream(filename1);
             FileInputStream fis2 = new FileInputStream(filename2);
             FileInputStream fis3 = new FileInputStream(filename3)) {
            ZipEntry file1 = new ZipEntry("testFile1.txt");
            zos.putNextEntry(file1);
            byte[] buffer1 = new byte[fis1.available()];
            fis1.read(buffer1);
            zos.write(buffer1);

            ZipEntry file2 = new ZipEntry("testFile2.txt");
            zos.putNextEntry(file2);
            byte[] buffer2 = new byte[fis2.available()];
            fis2.read(buffer2);
            zos.write(buffer2);

            ZipEntry file3 = new ZipEntry("testFile3.txt");
            zos.putNextEntry(file3);
            byte[] buffer3 = new byte[fis3.available()];
            fis3.read(buffer3);
            zos.write(buffer3);

            zos.closeEntry();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        File newName = new File("D://tmp//testRenamedDir");
        testDir.renameTo(newName);
        System.out.printf("The folder %s is renamed to %s\n", testDir, newName);

        System.out.println();
        System.out.printf("The folder %s contains:\n", newName);
        for (File test : newName.listFiles()) {
            System.out.println(test.getName() + " is file");
        }

        System.out.println();
        for (File test : newName.listFiles()) {
            System.out.println(test.getName() + " is deleted");
            test.delete();
        }

        boolean deleted = newName.delete();
        if (deleted)
            System.out.printf("The folder %s is deleted\n", newName);

        System.out.println();
        System.out.println("All done!");
    }
}
