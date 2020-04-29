package com.example.android.miwok;

//class for display words

public class Word {

    //states of the class
    private int img_res = -1;
    private String mEnglishtrans; // private variables
    private String mMiowktrans;     // so starts with 'm'
    private int mAudioResourceId;

    public Word(String eng, String miwok, int img, int audio){      // constructor for 2text and 1 img
        mEnglishtrans = eng;
        mMiowktrans = miwok;
        img_res = img;
        mAudioResourceId = audio;
    }

    public Word(String eng, String miwok, int audio){      // constructor for only text
        mEnglishtrans = eng;
        mMiowktrans = miwok;
        mAudioResourceId = audio;
    }

    //func to return eng word
    //getter methods
    public String getdefaulttrans()
    {
        return mEnglishtrans;
    }

    public String getmiowktrans(){
        return mMiowktrans;
    }

    public int getImg_res(){
        return img_res;
    }

    public boolean hasimg(){
        if (img_res != -1)
            return true;
        else
            return false;}

            // Click alt + insert ------------ for debugging
    @Override
    public String toString() {
        return "Word{" +
                "img_res=" + img_res +
                ", mEnglishtrans='" + mEnglishtrans + '\'' +
                ", mMiowktrans='" + mMiowktrans + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }

    public int getAudioResource(){
        return mAudioResourceId;


    }
}
