package project.loginscreen

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import project.loginscreen.navigation.AppRouter
import project.loginscreen.navigation.Screen
import project.loginscreen.ui.screens.LoginScreen
import project.loginscreen.ui.screens.SignUpScreen
import project.loginscreen.ui.screens.TermsAndConditionsScreen

@Composable
fun LoginScreenApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
        ){
        Crossfade(targetState = AppRouter.currentScreen, label = "") { currentScreen ->
            when(currentScreen.value){
                is Screen.SignUpScreen ->{
                    SignUpScreen()
                }
                is Screen.TermsAndConditionsScreen ->{
                    TermsAndConditionsScreen()
                }
                is Screen.LoginScreen ->{
                    LoginScreen()
                }
            }
        }
    }
}
