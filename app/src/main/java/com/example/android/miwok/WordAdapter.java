package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by conni on 11/22/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    @NonNull

    private Context context;
    private List<Word> wordsList = new ArrayList<>();
    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> list, int colorResourceId){
        super(context, 0, list);
        this.context = context;
        this.wordsList = list;
        this.mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);

        Word currentWord = wordsList.get(position);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        TextView name = (TextView)listItem.findViewById(R.id.miwok_text_view);
        name.setText(currentWord.getMiwokTranslation());
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
