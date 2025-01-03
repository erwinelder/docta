package cz.cvut.docta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import cz.cvut.docta.core.data.local.getDatabaseBuilder
import cz.cvut.docta.core.data.local.getRoomDatabase
import cz.cvut.docta.core.presentation.App

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}