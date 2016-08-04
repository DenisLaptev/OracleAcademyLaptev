package Theory.WorkWithFileSystem;

/**
 * Created by lapte on 07.07.2016.
 */

import java.io.*;
import java.util.*;

public class FileList4 {


    public static ArrayList<File> AllFiles(ArrayList<File> files) {

        ListIterator<File> iter = files.listIterator();             //устанавливаем итератор на начало списка

        while (iter.hasNext()) {                                     //идем до конца списка, пока будут файлы
            File file = iter.next();                                //сохраняем в переменную рассматриваемый файл или директорию
            if (file.isDirectory()) {                                //если файл - директория
                int count = iter.nextIndex();                       //запоминаем положение в списке
                iter.remove();                                      //удаляем папку
                files.addAll(Arrays.asList(file.listFiles()));      //добавляем в конец списка все содержимое удаленной папки
                iter = files.listIterator(count);                   //устанавливаем итератор на след элемент сразу после удаленной директории
            }
        }


        return files;
    }

    public static void main(String[] args) {

        String patg_to_dir = "C:\\Users\\lapte\\IdeaProjects\\OracleAcademyMavenProject\\src\\main\\java\\HomeWork.Programming.Practice1";           //наша директория
        File dir = new File(patg_to_dir);

        ArrayList<File> files = new ArrayList<File>(Arrays.asList(dir.listFiles()));        //получаем все файлы из текущей директории

        files = FileList4.AllFiles(files);           //здесь возвращаем список всех файлов из директории и поддерикторий

        Iterator<File> iter = files.iterator();

        while (iter.hasNext()) {                                     //выводим абсолютные пути к файлам
            System.out.println(iter.next().getAbsolutePath());
        }
    }
}
