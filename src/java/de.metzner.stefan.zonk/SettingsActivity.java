package de.metzner.stefan.zonk;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Lade vorhandene Einstellungen und zeige sie an
        Settings savedSettings = loadSettingsFromJson(); // Implementiere diese Funktion entsprechend
        // Zeige die gespeicherten Einstellungen an (z.B., mithilfe von EditText-Widgets)
    }

    // Funktion zum Laden von Einstellungen aus einer JSON-Datei
    private Settings loadSettingsFromJson() {
        // Implementiere diese Funktion entsprechend deiner JSON-Struktur und Rückgabetyp
        // Hier kannst du eine JSON-Datei lesen und die Einstellungen des Spiels zurückgeben
        return null;
    }
}
