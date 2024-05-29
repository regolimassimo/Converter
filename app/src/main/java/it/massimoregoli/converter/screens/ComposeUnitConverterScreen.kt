package it.massimoregoli.converter.screens

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.vector.ImageVector
import it.massimoregoli.converter.R
import androidx.compose.material.icons.filled.SquareFoot
import androidx.compose.material.icons.filled.Thermostat
import androidx.compose.material.icons.filled.Balance
sealed class ComposeUnitConverterScreen(val route: String,
                                 @StringRes val label: Int,
                                 val icon: ImageVector
) {
    companion object {
        val screens = listOf(
            Temperature,
            Distances,
            Weights
        )

        const val ROUTE_TEMPERATURE = "temperature"
        const val ROUTE_DISTANCES = "distances"
        const val ROUTE_WEIGHTS = "weights"
    }

    private data object Temperature : ComposeUnitConverterScreen(
        ROUTE_TEMPERATURE,
        R.string.temperature,
        Icons.Default.Thermostat
    )

    private data object Distances : ComposeUnitConverterScreen(
        ROUTE_DISTANCES,
        R.string.distances,
        Icons.Default.SquareFoot
    )

    private data object Weights : ComposeUnitConverterScreen(
        ROUTE_WEIGHTS,
        R.string.weights,
        Icons.Default.Balance
    )
}