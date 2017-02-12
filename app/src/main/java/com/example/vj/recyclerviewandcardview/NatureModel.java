package com.example.vj.recyclerviewandcardview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vaibhav on 06/02/2017.
 */

public class NatureModel {
    private int imageID;
    private String title;


    public int getImageID(){
        return imageID;
    }
    public void setImageID(int imageID){
        this.imageID=imageID;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public static List<NatureModel> getObjectList(){

        List<NatureModel> dataList = new ArrayList<>();
        int[] images = getImages();

        for (int i=0; i<images.length; i++) {
            NatureModel nature = new NatureModel();
            nature.setImageID(images[i]);
            nature.setTitle("Picture  " +i);
            dataList.add(nature);
        }
        return dataList;
    }

    private static int[] getImages(){

        int[] images={
                R.drawable.ani_cat_five, R.drawable.ani_cat_four, R.drawable.ani_cat_one,
                R.drawable.ani_cat_seven, R.drawable.ani_cat_six, R.drawable.ani_cat_three,
                R.drawable.ani_cat_two, R.drawable.ani_deer_four, R.drawable.ani_deer_one,
                R.drawable.ani_deer_three, R.drawable.ani_deer_two, R.drawable.ani_dog_five,
                R.drawable.ani_dog_four, R.drawable.ani_dog_two, R.drawable.bird_parrot_eight,
                R.drawable.bird_parrot_four,R.drawable.bird_parrot_five, R.drawable.bird_parrot_one,
                R.drawable.bird_parrot_two,R.drawable.bird_parrot_six, R.drawable.bird_parrot_seven
        };
        return images;
    }
}
