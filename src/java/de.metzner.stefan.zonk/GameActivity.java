package de.metzner.stefan.zonk;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class GameActivity extends AppCompatActivity {

    private String[] doors = {"Niete", "Niete", "Niete"};
    private int winningDoorIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // Zufällig eine Tür für den Gewinn auswählen
        Random random = new Random();
        winningDoorIndex = random.nextInt(3);
        doors[winningDoorIndex] = "Gewinn";

        findViewById(R.id.door1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDoorClick(0, (ImageView) v);
            }
        });

        findViewById(R.id.door2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDoorClick(1, (ImageView) v);
            }
        });

        findViewById(R.id.door3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDoorClick(2, (ImageView) v);
            }
        });
    }

    private void onDoorClick(int doorIndex, ImageView doorImageView) {
        String result = doors[doorIndex];
        if (result.equals("Gewinn")) {
            // Zeige Gewinnbild und -beschreibung an
            doorImageView.setImageResource(R.drawable.winning_image); // Setze die Ressource für das Gewinnbild
            Toast.makeText(this, "Herzlichen Glückwunsch! Du hast gewonnen!", Toast.LENGTH_SHORT).show();
        } else {
            // Zeige Nietenbild (Teufel) an
            doorImageView.setImageResource(R.drawable.devil_image); // Setze die Ressource für das Teufelbild
            Toast.makeText(this, "Leider eine Niete. Besser Glück nächstes Mal!", Toast.LENGTH_SHORT).show();
        }
        // Hier kannst du weitere Logik für den Spielverlauf implementieren
    }
}
