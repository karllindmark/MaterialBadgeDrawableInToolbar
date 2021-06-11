package re.ntz.materialbadgedrawableintoolbar

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.badge.BadgeUtils

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.inflateMenu(R.menu.activity_main)

        val badgeDrawable = BadgeDrawable.create(toolbar.context)
        badgeDrawable.number = 300
        badgeDrawable.backgroundColor = Color.RED

        BadgeUtils.attachBadgeDrawable(badgeDrawable, toolbar, R.id.action)
    }
}