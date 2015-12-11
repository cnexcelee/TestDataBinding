package com.example.lijia.testdatabinding;


import android.databinding.DataBindingUtil;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;


import com.example.lijia.testdatabinding.databinding.DatabindingBinding;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DatabindingBinding binding = DataBindingUtil.setContentView(this,R.layout.databinding);
        User user = new User("Tom","beijing");
        binding.setUser(user);

//        setContentView(R.layout.databinding);
    }

}
