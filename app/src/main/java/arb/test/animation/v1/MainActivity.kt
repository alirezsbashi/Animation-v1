package arb.test.animation.v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_alpha.setOnClickListener {

            img.alpha = 0f
            img.animate().alpha(1f).duration = 8000

        }

        btn_rotation.setOnClickListener {

            img.rotation = 0f
            img.animate().rotation(360f).duration = 8000

        }

        btn_ScaleX.setOnClickListener {

            img.scaleX = 1f
            img.animate().scaleX(0.5f).duration = 8000

        }

        btn_ScaleY.setOnClickListener {

            img.scaleY = 1f
            img.animate().scaleY(0.5f).duration = 8000

        }

    }
}
