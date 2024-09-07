package fabian.arevalo.lastfmapi;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class TopArtists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_artists);
        // Inicializa el ImageSlider
        ImageSlider imageSlider = findViewById(R.id.imagen_slider);

        // Crea la lista de SlideModel
        List<SlideModel> imagenList = new ArrayList<>();
        imagenList.add(new SlideModel(R.raw.splash1, getString(R.string.topArtist), ScaleTypes.CENTER_CROP));
        imagenList.add(new SlideModel(R.raw.splash2, getString(R.string.lastFm), ScaleTypes.CENTER_CROP));
        imagenList.add(new SlideModel(R.raw.splash3, getString(R.string.mensaje), ScaleTypes.CENTER_CROP));

        // Establece la lista en el ImageSlider
        imageSlider.setImageList(imagenList, ScaleTypes.CENTER_CROP);
    }
}