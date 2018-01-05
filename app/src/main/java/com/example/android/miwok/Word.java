package com.example.android.miwok;

import android.content.Context;

/**
 * Created by conni on 11/22/2017.
 */

public class Word {

    // Miwok translation of the Word
    private String miwokTranslation;

    // Default language translation of the word
    private String defaultTranslation;

    // Image associated with the word
    private int imageResourceID = NO_IMAGE_PROVIDED;

    /**
     *  Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Constructs a new Word
     */
    public Word( String dTranslation, String mTranslation){
        miwokTranslation = mTranslation;
        defaultTranslation = dTranslation;
    }

    public Word( String dTranslation, String mTranslation, int mImageResourceID){
        miwokTranslation = mTranslation;
        defaultTranslation = dTranslation;
        imageResourceID = mImageResourceID;
    }

    /**
     * Gets the Miwok translation of the word.
     * @return the Miwok translation of the word.
     */
    public String getMiwokTranslation(){
        return miwokTranslation;
    }

    /**
     * Gets the default translation of the word.
     * @return the default translation of the word.
     */
    public String getDefaultTranslation(){
        return defaultTranslation;
    }

    /**
     * Gets the image resource for the word
     * @return the image resource for the word
     */
    public int getImageResourceID(){ return imageResourceID; }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return imageResourceID != NO_IMAGE_PROVIDED;
    }
}
