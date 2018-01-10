package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by conni on 11/22/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    @NonNull

    private int mColorResourceId;
    private Word currentWord;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId){
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        Word currentWord = getItem(position);

        TextView name = (TextView)listItem.findViewById(R.id.miwok_text_view);
        name.setText(currentWord.getMiwokTranslation());

        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        name.setBackgroundColor(color);

        TextView release = (TextView)listItem.findViewById(R.id.default_text_view);
        release.setText(currentWord.getDefaultTranslation());
        release.setBackgroundColor(color);

        ImageView image = (ImageView)listItem.findViewById(R.id.word_image);
        if(currentWord.hasImage()){
            image.setImageResource(currentWord.getImageResourceID());
        }else{
            image.setVisibility(View.GONE);
        }

        return listItem;
    }
}
