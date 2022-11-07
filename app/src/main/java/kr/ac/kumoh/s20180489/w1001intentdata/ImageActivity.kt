package kr.ac.kumoh.s20180489.w1001intentdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.ac.kumoh.s20180489.w1001intentdata.databinding.ActivityImageBinding

class ImageActivity : AppCompatActivity() {
    val binding by lazy { ActivityImageBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val res = when (intent.getStringExtra(MainActivity.keyName)) {
            "gundam" -> R.drawable.gundam
            "zaku" -> R.drawable.zaku
            else -> R.drawable.ic_launcher_foreground
        }
        binding.imgGundam.setImageResource(res)
    }
}