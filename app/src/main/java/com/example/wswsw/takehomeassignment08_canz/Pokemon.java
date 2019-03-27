package com.example.wswsw.takehomeassignment08_canz;

public class Pokemon {
    public int name;
    public int type;
    public int photoId;
    public boolean hasShiny;
    public int shinyLogo;

    public Pokemon(int name, int type, int photoId, boolean hasShiny){
        this.name = name;
        this.type = type;
        this.photoId = photoId;
        this.hasShiny = hasShiny;
    }

    public Pokemon(int name, int type, int photoId, boolean hasShiny,int shinyLogo){
        this.name = name;
        this.type = type;
        this.photoId = photoId;
        this.hasShiny = hasShiny;
        this.shinyLogo=shinyLogo;
    }

    public int getName(){return name;}

    public int getType(){return type;}

    public int getPhotoId(){return photoId;}

    public boolean getHasShiny(){return hasShiny;}

    public int getShinyLogo(){return shinyLogo;}


    public void setName(int name){this.name=name;}
    public void setType(int type){this.type=type;}
    public void setPhotoId(int photoId){this.photoId=photoId;}
    public void setHasShiny(boolean aShiny){this.hasShiny=aShiny;}
    public void setShinyLogo(int shinyLogo){this.shinyLogo=shinyLogo;}



    public Pokemon() {
    }
}
