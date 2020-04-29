package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mbackground_Clr;

    //custom constructor
    public WordAdapter(Activity context, ArrayList<Word> words, int back_colr)
    {
        //2nd argument is 0 since we are not using only one text view
        super(context, 0, words);
        mbackground_Clr = back_colr;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        //checking if existing view is being used, else inflating
        View listitemview = convertView;
        if (listitemview == null) {
            listitemview = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentword = getItem(position);

        TextView nameTextView = (TextView) listitemview.findViewById(R.id.miowk_v);
        // Get the version name from the current word object and
        // set this text on the name TextView
        nameTextView.setText(currentword.getmiowktrans());

        // Find the TextView in the list_item.xml layout with the ID english trans
        TextView numberTextView = (TextView) listitemview.findViewById(R.id.eng_v);
        // Get the eng trans from the current word object and
        // set this text on the number TextView
        numberTextView.setText(currentword.getdefaulttrans());

        //image view
        ImageView img = (ImageView) listitemview.findViewById(R.id.img);
        if (currentword.hasimg()) { //if image is associated with the word
            //get the image from current word object
            img.setImageResource(currentword.getImg_res());
            img.setVisibility(View.VISIBLE);
        }
        else
            //GONE--> so that no imageview space is taken
            img.setVisibility(View.GONE);

        // Set the theme color for the list item
        View textContainer = listitemview.findViewById(R.id.wordstrans);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mbackground_Clr);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listitemview;
    }
}
