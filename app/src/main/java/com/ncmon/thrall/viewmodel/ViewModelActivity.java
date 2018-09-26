package com.ncmon.thrall.viewmodel;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.ncmon.thrall.R;

/**
 * @author ncmon on 2018/9/26
 */
public class ViewModelActivity extends AppCompatActivity implements View.OnClickListener {
    CommunicateViewModel communicateViewModel;
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewmodel);
        textView = findViewById(R.id.textView);
        textView.setOnClickListener(this);
        communicateViewModel = ViewModelProviders.of(this).get(CommunicateViewModel.class);
        communicateViewModel.getName().observe(this, s -> textView.setText(s));
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textView:
                communicateViewModel.setName("ViewModel Test");
                break;
        }
    }
}
