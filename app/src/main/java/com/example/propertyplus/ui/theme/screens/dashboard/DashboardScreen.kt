package com.example.propertyplus.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.navigation.ROUT_HOME
import com.example.propertyplus.navigation.ROUT_PROPERTY
import com.example.propertyplus.ui.theme.NewGrey
import com.example.propertyplus.ui.theme.NewOrange
import com.example.propertyplus.ui.theme.NewYellow


@Composable
fun DashboardScreen(navController: NavController){

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {

        Text(
            text ="PropertyPlus",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Gray,
        )
        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "home",
            modifier = androidx.compose.ui.Modifier.size(100.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))


        Text(
            text ="Manage your properties with ease.",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.DarkGray,
        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))

        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp)
                    .clickable {
                        navController.navigate(ROUT_HOME)
                    },
                elevation = CardDefaults.cardElevation(10.dp),
                shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp),
                colors = CardDefaults.cardColors(NewGrey)
            ){
                //Row1
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp)) {
                       Column {
                           Spacer(modifier = androidx.compose.ui.Modifier.height(15.dp))

                           Box(
                               modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center )
                           {
                               Image(
                                   painter = painterResource(id = R.drawable.img_1),
                                   contentDescription = "home",
                                   modifier = Modifier.size(100.dp)
                               )
                           }

                           Text(
                               text = "Home.",
                               fontSize = 20.sp,
                               fontFamily = FontFamily.SansSerif,
                               color = Color.DarkGray,
                               modifier = Modifier.fillMaxWidth(),
                               textAlign = TextAlign.Center

                           )

                       }
                    }
                    //End of Card

                    Spacer(modifier = androidx.compose.ui.Modifier.width(20.dp))

                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp),
                    ) {
                        Column {
                            Spacer(modifier = androidx.compose.ui.Modifier.height(15.dp))

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        navController.navigate(ROUT_PROPERTY)
                                    },

                                contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_2),
                                    contentDescription = "home",
                                    modifier = Modifier.size(100.dp)

                                )
                            }

                            Text(
                                text ="Property.",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.DarkGray,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }
                    }

                    //End of Card

                }

                //End of row1

                //Row2

                Row(modifier = Modifier.padding(20.dp)) {
                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp),) {
                        Column {
                            Spacer(modifier = androidx.compose.ui.Modifier.height(15.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_3),
                                    contentDescription = "home",
                                    modifier = Modifier.size(100.dp)
                                )
                            }

                            Text(
                                text = "Settings.",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.DarkGray,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }
                    }
                    //End of Card

                    Spacer(modifier = androidx.compose.ui.Modifier.width(20.dp))

                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp),) {
                        Column {
                            Spacer(modifier = androidx.compose.ui.Modifier.height(15.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_4),
                                    contentDescription = "home",
                                    modifier = Modifier.size(100.dp)

                                )
                            }

                            Text(
                                text = "Profile.",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.DarkGray,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }
                    }

                    //End of Card

                }

                //End of Row2

                //Row 3
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp), ) {
                        Column {
                            Spacer(modifier = androidx.compose.ui.Modifier.height(15.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_1),
                                    contentDescription = "home",
                                    modifier = Modifier.size(100.dp)
                                )
                            }

                            Text(
                                text = "Profile.",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.DarkGray,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }
                    }
                    //End of Card

                    Spacer(modifier = androidx.compose.ui.Modifier.width(20.dp))

                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp),) {
                        Column {
                            Spacer(modifier = androidx.compose.ui.Modifier.height(15.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_1),
                                    contentDescription = "home",
                                    modifier = Modifier.size(100.dp)

                                )
                            }

                            Text(
                                text = "Home.",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.DarkGray,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }
                    }

                    //End of Card

                }
                //End of Row 3






            }
              }



    }




}
@Composable
@Preview(showBackground = true)
fun  DashboardScreenPreview(){


    DashboardScreen(rememberNavController())
}