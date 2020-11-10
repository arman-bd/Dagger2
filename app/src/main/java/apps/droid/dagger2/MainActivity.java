package apps.droid.dagger2;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import apps.droid.dagger2.databinding.ActivityMainBinding;
import apps.droid.dagger2.network.MainApi;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.target.setText("Hello Test");
    }
}