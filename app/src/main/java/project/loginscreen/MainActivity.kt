package project.loginscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import project.loginscreen.ui.screens.SignUpScreen
import project.loginscreen.ui.theme.LoginScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreenTheme {
                LoginScreenApp()
            }
        }
    }
}
@Preview
@Composable
fun DefaultPreview(){
    LoginScreenApp()
}