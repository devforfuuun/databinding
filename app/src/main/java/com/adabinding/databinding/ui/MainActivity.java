package com.adabinding.databinding.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.adabinding.databinding.R;
import com.adabinding.databinding.databinding.ActivityMainBinding;
import com.adabinding.databinding.handlers.UserHandler;
import com.adabinding.databinding.pojo.User;

public class MainActivity extends AppCompatActivity implements UserHandler {

    private ActivityMainBinding mBinding;
//    private TextView userName;
//    private TextView address;
//    private TextView phoneNumber;
//    private TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        setUpViews();
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("John Doe",
                "USA, Str. South Congress, No. 234A",
                "+345898374930",
                "johndoe@gmail.com");
        mBinding.setUser(user);
        mBinding.setHandler(this);
    }

    @Override
    public void onClickDone(View view) {
        Toast.makeText(this, "Done button clicked", Toast.LENGTH_LONG).show();
    }

//    private void setUpViews() {
//        userName = findViewById(R.id.user_name);
//        address = findViewById(R.id.address);
//        phoneNumber = findViewById(R.id.phoneNumber);
//        email = findViewById(R.id.email_address);
//    }
}
