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

    /**
     * Constructs a new Word
     */
    public Word( String dTranslation, String mTranslation){
        miwokTranslation = mTranslation;
        defaultTranslation = dTranslation;
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
}
