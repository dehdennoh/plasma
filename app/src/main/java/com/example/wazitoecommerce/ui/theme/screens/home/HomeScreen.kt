package com.example.plasmalink.ui.theme.screens.home

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.DetailsActivity
import com.example.wazitoecommerce.InsertActivity
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ROUT_ADD_DETAILS
import com.example.wazitoecommerce.navigation.ROUT_ADMIN
import com.example.wazitoecommerce.navigation.ROUT_LOGIN
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController){
    Column(
        modifier = Modifier
            .paint(
                painterResource(id = R.drawable.img_3),
                contentScale = ContentScale.FillBounds
            )
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        val mContext = LocalContext.current

        //TopAppBar
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

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings ,
                        contentDescription = "settings", tint = Color.White)
                }
            }
        )
        //End of TopUpBar


        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
        ) {

            //Card one
            Card(
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.baa),
                            contentDescription = "classic",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }

                }
            }

            //End of card one
            Spacer(modifier = Modifier.width(10.dp))

            //Card one
            Card(
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bea),
                            contentDescription = "classic",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }


                }
            }

            //End of card one
            Spacer(modifier = Modifier.width(10.dp))

            //Card one
            Card(
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.bee),
                            contentDescription = "classic",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }

                }
            }
        }

Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(ROUT_ADD_DETAILS)
        }) {
            Text(text = "PLASMA REQUEST")
        }

        Button(onClick = {
            mContext.startActivity(Intent(mContext, InsertActivity::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
        )
        {
            Text(text = "PLASMA DONATE")

        }


        Button(onClick = {
            navController.navigate(ROUT_LOGIN)
        }) {
            Text(text = "ADMIN")
        }




    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun HomeScreenPreview(){
    WazitoECommerceTheme {
        HomeScreen(navController = rememberNavController())
    }
}