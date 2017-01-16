package com.forhomeuse;

public class Sorter {
    private DirectoriesCollection dc;
    private PhotosCollection pc;
    private PhotosCollection uc;

    public Sorter(String dir){
        dc = new DirectoriesCollection(dir);
        pc = new PhotosCollection();
        uc = new PhotosCollection();
        int fullSize = dc.size();
        for(int I = 0; I < fullSize; I++){
            pc.addFromDir(dc.get(I));
        }
    }

    public void LoadInfo(){
        for(int I = 0; I < pc.size(); I++){
            System.out.println(pc.get(I).toString());
            // todo Put all photos one by one to set
        }
    }

    public void MovePhotos(String outputDir, String unsortedDir){
        // todo move all photos to output directory from set
    }

}
