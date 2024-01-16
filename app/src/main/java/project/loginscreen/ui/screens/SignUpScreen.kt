package project.loginscreen.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import project.loginscreen.R
import project.loginscreen.components.ButtonComponent
import project.loginscreen.components.CheckboxComponent
import project.loginscreen.components.ClickableLoginTextComponent
import project.loginscreen.components.DividerComponent
import project.loginscreen.components.HeadingTextComponent
import project.loginscreen.components.MyTextFieldComponent
import project.loginscreen.components.NormalTextComponent
import project.loginscreen.components.PasswordFieldComponent
import project.loginscreen.navigation.AppRouter
import project.loginscreen.navigation.Screen

@Composable
fun SignUpScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ){
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value= stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.first_name),
                painterResource = painterResource(id = R.drawable.profile)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.last_name),
                painterResource = painterResource(id = R.drawable.profile)
            )
            MyTextFieldComponent(labelValue = stringResource(id = R.string.email),
                painterResource(id = R.drawable.message)
            )
            PasswordFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.lock)
            )
            CheckboxComponent(value = stringResource(id = R.string.terms_and_conditions),
                onTextSelected = {
                    AppRouter.navigateTo(Screen.TermsAndConditionsScreen)

            }
            )
            Spacer(modifier = Modifier.height(120.dp))
            
            ButtonComponent(value = stringResource(id = R.string.register))

            Spacer(modifier = Modifier.height(40.dp))

            DividerComponent()
            
            ClickableLoginTextComponent(tryingToLogin = true, onTextSelected ={
                AppRouter.navigateTo(Screen.LoginScreen)
            })
        }

    }
}

@Preview
@Composable
fun DefaultPreviewSignUpScreen(){
    SignUpScreen()
}