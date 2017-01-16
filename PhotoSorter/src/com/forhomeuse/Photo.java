package com.forhomeuse;

public class Photo {
    private String FFileName;
    private String FPath;
    private Boolean FHashExist = false;
    private int FHash = 0;
    private int FSize = 0;

    public Photo(String fullPath){
        int delimIndex = fullPath.lastIndexOf("\\");
        FFileName = fullPath.substring(delimIndex + 1);
        FPath = fullPath.substring(0, delimIndex + 1);
        // todo Calc size of file
        FSize = 0;
    }

    @Override
    public String toString() {
        return FPath + FFileName;
    }

    public int getSize(){
        return FSize;
    }

    @Override
    public int hashCode() {
        if (!FHashExist){
            // todo Implement hash generation
            FHash = 0;
            FHashExist = true;
        };
        return FHash;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Photo) {
            Photo tmp = (Photo) obj;
            if (FSize == tmp.getSize()) {
                return hashCode() == tmp.hashCode();
                // todo Add comparing by start of file
            }
            else
                return false;
        } else {
            return false;
        }
    }

    public String OutputDir(){
        // todo Generate output dir for file. It should be like a year/month/day folder. Probably with description
        return "";
    }

    public String NewFileName(){
        // todo Generate file name with desription of file, that describe source of file
        return "";
    }

    public String FileName(){
        return FPath + FFileName;
    }
}
