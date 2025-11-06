package com.example.navigasiku

enum class Navigasi {
    Formulir,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
){

    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulir.name,
            modifier = Modifier.padding(paddingValues = isiRuang)
        ){
            composable(route = Navigasi.Formulir.name){
                FormIsian(
                    // pilihanJK = JenisK.map { id -> konteks.resources.getString(id) },
                    onSubmitClick = {
                        navController.navigate(route = Navigasi.Detail.name)
                    }
                )
            }

