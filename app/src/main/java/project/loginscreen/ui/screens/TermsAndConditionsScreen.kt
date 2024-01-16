package project.loginscreen.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import project.loginscreen.R
import project.loginscreen.components.HeadingTextComponent
import project.loginscreen.navigation.AppRouter
import project.loginscreen.navigation.Screen
import project.loginscreen.navigation.SystemBackButtonHandler

@Composable
fun TermsAndConditionsScreen() {
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(16.dp)){
        HeadingTextComponent(value = stringResource(id = R.string.terms_and_conditions))
    }
    SystemBackButtonHandler {
        AppRouter.navigateTo(Screen.SignUpScreen)
    }
}