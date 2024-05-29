package it.massimoregoli.converter.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import it.massimoregoli.converter.Repository

@Suppress("UNCHECKED_CAST")
class ViewModelFactory(private val repository: Repository)  :
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        if (modelClass.isAssignableFrom(TemperatureViewModel::class.java))
            TemperatureViewModel(repository) as T
        else if (modelClass.isAssignableFrom(DistancesViewModel::class.java))
            DistancesViewModel(repository) as T
        else
            WeightsViewModel(repository) as T
}
