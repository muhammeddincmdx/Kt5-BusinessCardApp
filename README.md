
## Final View
![resim](https://github.com/muhammeddincmdx/Kt5-BusinessCardApp/assets/54439858/096517af-687a-4038-95e2-479307b687ac)


````
@Composable
fun BusinessCard(modifier: Modifier=Modifier) {
    val android_image = painterResource(id = R.drawable.ic_android_black_24dp)
    val phone_image = painterResource(id = R.drawable.baseline_local_phone_24)
    val email_image = painterResource(id = R.drawable.baseline_alternate_email_24)
    val share_image = painterResource(id = R.drawable.baseline_share_24)
    val background_img = painterResource(id = R.drawable.androidparty)

    Image(
        painter = background_img,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        alpha = 0.5F
    )
    Column(modifier= modifier.fillMaxSize()) {

        Column (modifier = modifier
            .weight(1f)
            .fillMaxSize(), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally){
            Image(painter = android_image, contentDescription = null)
            Text(
                text = "Muhammed DİNÇ",
                Modifier.padding(8.dp),
                fontSize = 25.sp,
                fontWeight = FontWeight.Light
            )
            Text(
                text = "Maker",
                fontSize = 22.sp,
                color = Color.Red,
                fontWeight = FontWeight.SemiBold,
                modifier = modifier.padding(bottom = 55.dp)
            )
        }


        Column (modifier=modifier.weight(1F)){
            Row(
                modifier = modifier
                    .padding(bottom = 5.dp, start = 60.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Image(painter = phone_image, contentDescription = null)
                Text(text = "+90 550 100 1020", modifier = modifier.padding(start = 10.dp))
            }
            Row(
                modifier = modifier
                    .padding(bottom = 5.dp, start = 60.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Image(painter = share_image, contentDescription = null)
                Text(text = "github.com/muhammeddincmdx", modifier = modifier.padding(start = 10.dp))
            }

            Row(
                modifier = modifier
                    .padding(bottom = 5.dp, start = 60.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Image(painter = email_image, contentDescription = null)
                Text("me.muhammed.dinc@gmail.com", modifier = modifier.padding(start = 10.dp))
            }
        }

    }
}

````
