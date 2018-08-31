package com.nasa.sanjeev.nasaapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LiveFragment extends Fragment implements View.OnClickListener {

    public LiveFragment(){

    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_live, container, false);

        TextView issCameraEarthView = rootView.findViewById(R.id.iss_camera_earth_view);
        TextView nasaMediaTv = rootView.findViewById(R.id.nasa_media_tv);
        TextView nasaLiveTv = rootView.findViewById(R.id.nasa_live_tv);

        TextViewCompat.setAutoSizeTextTypeWithDefaults(issCameraEarthView, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM);
        TextViewCompat.setAutoSizeTextTypeWithDefaults(nasaLiveTv, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM);
        TextViewCompat.setAutoSizeTextTypeWithDefaults(nasaMediaTv, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM);

        issCameraEarthView.setOnClickListener(this);
        nasaMediaTv.setOnClickListener(this);
        nasaLiveTv.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iss_camera_earth_view :
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=znCFFSlc5nI")));
                break;
            case R.id.nasa_media_tv :
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=P11y8N22Rq0")));
                break;
            case R.id.nasa_live_tv :
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=wwMDvPCGeE0")));
        }
    }
}
