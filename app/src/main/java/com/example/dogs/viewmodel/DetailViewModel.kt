package com.example.dogs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dogs.model.DogBreed

class DetailViewModel: ViewModel() {


    val dogLiveData = MutableLiveData<DogBreed>()

    fun fetch(){
        dogLiveData.value = DogBreed("1", "Corgi", "12 years",
            "breedGroup", "breepFor" , "temperament", "imageUrl")
    }

}