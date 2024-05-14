package com.example.wazitoecommerce.ui.theme.screens.admin


import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.DetailsActivity
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ROUT_LOGIN
import com.example.wazitoecommerce.navigation.ROUT_VIEW_DETAILS
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun adminScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .paint(
                painterResource(id = R.drawable.imgg),
                contentScale = ContentScale.FillBounds
            )
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
    val mContext = LocalContext.current



        TopAppBar(
            title = { Text(text = "PLASMA LINK", color = Color.White)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = {
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack ,
                        contentDescription = "Arrowback", tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share ,
                        contentDescription = "share", tint = Color.White)
                }

            }
        )
        //End of TopUpBar


    Button(onClick = {
        navController.navigate(ROUT_VIEW_DETAILS)
    }) {
        Text(text = "View Recipient")
    }



    Button(onClick = {
        mContext.startActivity(Intent(mContext,DetailsActivity::class.java))
    },
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(Color.Red),
    )
    {
        Text(text = "View donor details")

    }


}
}

@Composable
@Preview(showBackground = true)
fun adminScreenPreview(){
    WazitoECommerceTheme {
       adminScreen(navController = rememberNavController())
    }
}