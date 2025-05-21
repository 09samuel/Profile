package com.accessibilityapp.profile

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.AvTimer
import androidx.compose.material.icons.filled.CurrencyRupee
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.Money
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen(innerPadding: PaddingValues) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .verticalScroll(rememberScrollState())
    ) {


        Column(
            modifier = Modifier

                .background(MaterialTheme.colorScheme.surface)

                .padding(start = 16.dp, end = 16.dp, bottom = 40.dp)

        ) {
            // Top App Bar
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back", tint = Color.White)
                Spacer(modifier = Modifier.width(8.dp))
                Text("Profile", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.weight(1f))
                OutlinedButton(
                    onClick = {},
                    border = BorderStroke(1.dp, Color.LightGray.copy(alpha = 0.6f)),
                    modifier = Modifier
                        .padding(8.dp)
                        .alpha(0.6f)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Message,
                            contentDescription = "support",
                            modifier = Modifier.size(20.dp),
                            tint = Color.LightGray.copy(alpha = 0.6f)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "support",
                            color = Color.LightGray.copy(alpha = 0.6f),
                            style = MaterialTheme.typography.labelSmall
                        )
                    }
                }

            }

            Spacer(modifier = Modifier.height(36.dp))

            // Profile section
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Default.Person, // Replace with actual image
                    contentDescription = "Profile Picture",
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                        .background(Color.DarkGray)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Column {
                    Text(
                        "andaz Kumar",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        "member since Dec, 2020",
                        color = Color.LightGray.copy(alpha = 0.6f),
                        fontSize = 14.sp
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                OutlinedButton(
                    onClick = {},
                    shape = CircleShape,
                    border = BorderStroke(1.dp, Color.LightGray.copy(alpha = 0.6f)),
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = Color.LightGray.copy(alpha = 0.6f)
                    ),
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier
                        .padding(8.dp)
                        .size(48.dp)
                        .alpha(0.6f)
                ) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Edit",
                        tint = Color.LightGray.copy(alpha = 0.6f)
                    )
                }

            }

            Spacer(modifier = Modifier.height(24.dp))

            // CRED Garage
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .alpha(0.6f),
                shape = RectangleShape,
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
                border = BorderStroke(0.5.dp, Color.LightGray.copy(alpha = 0.4f)),
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 24.dp)
                ) {
                    OutlinedButton(
                        onClick = {},
                        shape = CircleShape,
                        border = BorderStroke(1.dp, Color.LightGray.copy(alpha = 0.6f)),
                        contentPadding = PaddingValues(0.dp),
                        modifier = Modifier
                            .padding(8.dp)
                            .size(48.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.DirectionsCar,
                            contentDescription = "Car",
                            tint = Color.White,
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))
                    Column {
                        Text(
                            text = "get to know your vehicles, inside out",
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            style = MaterialTheme.typography.labelSmall
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Row {
                            Text(
                                text = "CRED garage",
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.bodyLarge
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Icon(
                                imageVector = Icons.Default.ArrowForward,
                                contentDescription = "Go",
                                tint = Color.White,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }


                }
            }


            Spacer(modifier = Modifier.height(36.dp))

            Column {
                ProfileInfoItem(Icons.Default.AvTimer, "credit score", "757", true)
                Divider(
                    color = MaterialTheme.colorScheme.surfaceDim,
                    thickness = 0.5.dp,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
                ProfileInfoItem(Icons.Default.CurrencyRupee, "lifetime cashback", "₹3", false)
                Divider(
                    color = MaterialTheme.colorScheme.surfaceDim,
                    thickness = 0.5.dp,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
                ProfileInfoItem(Icons.Default.Money, "bank balance", "check", false)
            }


        }
        Spacer(modifier = Modifier.height(24.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.background)
                .padding(horizontal = 16.dp)
        ) {
            Text("YOUR REWARDS & BENEFITS", color = Color.Gray, letterSpacing = 1.5.sp, fontWeight = FontWeight.SemiBold)

            Spacer(modifier = Modifier.height(16.dp))

            RewardInfoItem("cashback balance", "₹0")
            Divider(
                color = MaterialTheme.colorScheme.surfaceDim,
                thickness = 0.5.dp,
                modifier = Modifier.padding(vertical = 16.dp)
            )

            RewardInfoItem("coins", "26,46,583")
            Divider(
                color = MaterialTheme.colorScheme.surfaceDim,
                thickness = 0.5.dp,
                modifier = Modifier.padding(vertical = 16.dp)
            )

            RewardInfoItem("win upto Rs 1000", "refer and earn")

            Spacer(modifier = Modifier.height(60.dp))

            Text("TRANSACTIONS & SUPPORT", color = Color.Gray, letterSpacing = 1.5.sp, fontWeight = FontWeight.SemiBold)
            Spacer(modifier = Modifier.height(16.dp))
            RewardInfoItem("all transactions", "")

        }
    }
}

@Composable
fun ProfileInfoItem(imageVector: ImageVector, title: String, value: String, highlight: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        OutlinedButton(
            onClick = {},
            shape = CircleShape,
            border = BorderStroke(1.dp, Color.LightGray.copy(alpha = 0.6f)),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.LightGray.copy(alpha = 0.6f)
            ),
            contentPadding = PaddingValues(0.dp),
            modifier = Modifier

                .size(24.dp)
                .alpha(0.6f)
        ) {
            Icon(
                imageVector = imageVector,
                contentDescription = "Edit",
                tint = Color.LightGray.copy(alpha = 0.6f),
                modifier = Modifier.size(16.dp)
            )
        }

        Spacer(modifier = Modifier.width(8.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = title,
                color = Color.White,
                fontSize = 16.sp
            )
            if (highlight) {
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "· REFRESH AVAILABLE",
                    color = Color.Green,
                    fontWeight = FontWeight.SemiBold,
                    letterSpacing = 1.25.sp,
                    fontSize = 12.sp
                )
            }
        }

        if (value.isNotEmpty()) {
            Text(
                text = value,
                color = Color.White
            )
            Spacer(modifier = Modifier.width(4.dp))
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "Arrow",
                tint = Color.White
            )
        }
    }
}


@Composable
fun RewardInfoItem(title: String, value: String) {
    Column(
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = title,
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.onSurface
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "Arrow",
                tint = Color.White
            )
        }

        Text(
            text = value,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}


