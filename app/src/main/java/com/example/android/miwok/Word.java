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

    // Raw audio associated with the word
    private int rawResourceID;

    /**
     *  Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Constructs a new Word
     */
    public Word( String dTranslation, String mTranslation, int mRawResourceID){
        miwokTranslation = mTranslation;
        defaultTranslation = dTranslation;
        rawResourceID = mRawResourceID;
    }

    public Word( String dTranslation, String mTranslation, int mImageResourceID, int mRawResourceID){
        miwokTranslation = mTranslation;
        defaultTranslation = dTranslation;
        imageResourceID = mImageResourceID;
        rawResourceID = mRawResourceID;
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
     * Gets the image resource for the word
     * @return the image resource for the word
     */
    public int getRawResourceID(){ return rawResourceID; }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return imageResourceID != NO_IMAGE_PROVIDED;
    }

    /**
     *
     * Returns the string representation of the {@Link Word} object
     */
    @Override
    public String toString() {
        return "Word{" +
                "miwokTranslation='" + miwokTranslation + '\'' +
                ", defaultTranslation='" + defaultTranslation + '\'' +
                ", imageResourceID=" + imageResourceID +
                ", rawResourceID=" + rawResourceID +
                '}';
    }
}
