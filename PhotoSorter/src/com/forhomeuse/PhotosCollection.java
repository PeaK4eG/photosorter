package com.forhomeuse;

import java.io.File;
import java.util.ArrayList;

public class PhotosCollection extends ArrayList<Photo> {

    public void addFromDir(String dir){
        File[] picFiles = new File(dir).listFiles(File::isFile);
        int len = picFiles.length;
        for(int I = 0; I < len; I++){
            if (picFiles[I].toString().toUpperCase().contains("JPG")){
                add(new Photo(picFiles[I].toString()));
            }
        }
    }
}
