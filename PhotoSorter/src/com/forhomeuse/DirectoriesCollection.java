package com.forhomeuse;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoriesCollection extends ArrayList<String> {

    private void AddAllSubDir(String subDir){
        add(subDir);
        File[] directories = new File(subDir).listFiles(File::isDirectory);
        int dirLength = directories.length;
        for(int I = 0; I < dirLength; I++){
            AddAllSubDir(directories[I].toString());
        }
    }

    public DirectoriesCollection(String dir){
        AddAllSubDir(dir);
    }
}
