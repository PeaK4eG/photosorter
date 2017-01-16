package com.forhomeuse;

public class Main {

    public static void main(String[] args) {
        long milliSec = System.currentTimeMillis();
        String startDir = "D:\\Imp\\Photo";
        String outputDir = "D:\\Imp\\Sorted\\Out";
        String errorDir = "D:\\Imp\\Sorted\\Wrong";
        System.out.println("Started");
        try{
            Sorter sorter = new Sorter(startDir);
            sorter.LoadInfo();
            sorter.MovePhotos(outputDir, errorDir);
        } finally {
            milliSec -= System.currentTimeMillis();
            System.out.println("Finished in " + -milliSec + " msec");
        }
    }
}
