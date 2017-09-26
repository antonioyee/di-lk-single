package mx.antonioyee.lazydi

import android.app.Application
import android.widget.ImageView
import com.squareup.picasso.Picasso
import mx.antonioyee.lazydi.di.ImageLoader

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> (http://antonioyee.mx/) on 26/09/17.
 */

class App: Application() {

	override fun onCreate() {
		super.onCreate()
		App.app = this
	}

	companion object {
		var app: App? = null

		fun getConfig() = hashMapOf(
				"myName" to "Yee",
				"imageLoader" to object : ImageLoader {

					override fun loadImage(url: String, view: ImageView) {
						Picasso.with(app).load(url).into(view)
					}

				}
		)
	}

}