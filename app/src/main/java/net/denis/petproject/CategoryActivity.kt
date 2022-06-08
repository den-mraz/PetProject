package net.denis.petproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.denis.petproject.databinding.ActivityCategoryBinding

class CategoryActivity : AppCompatActivity() {
    lateinit var binding: ActivityCategoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}