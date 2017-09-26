package mx.antonioyee.lazydi.di

import android.widget.ImageView

/**
 * Created by Antonio Yee <yee.antonio@gmail.com> (http://antonioyee.mx/) on 26/09/17.
 */

interface ImageLoader {

	fun loadImage(url: String, view: ImageView)

}