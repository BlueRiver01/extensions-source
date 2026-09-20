package eu.kanade.tachiyomi.extension.en.erosscans

import eu.kanade.tachiyomi.multisrc.mangathemesia.MangaThemesia
import java.time.format.DateTimeFormatter
import java.util.Locale
import keiyoushi.annotation.Source
import keiyoushi.network.rateLimit
import okhttp3.OkHttpClient

@Source
abstract class ScytheScans : MangaThemesia() {

    override val dateFormat: DateTimeFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH)

    override fun OkHttpClient.Builder.configureClient() = rateLimit(3)
}