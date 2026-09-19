package eu.kanade.tachiyomi.extension.en.scythescans

import eu.kanade.tachiyomi.multisrc.mangathemesia.MangaThemesia
import keiyoushi.annotation.Source
import keiyoushi.network.rateLimit
import okhttp3.OkHttpClient
import java.text.SimpleDateFormat
import java.util.Locale

@Source
abstract class ScytheScans : MangaThemesia() {

    // Matches "September 14, 2026" while safely supporting single-digit day formats
    override val dateFormat = SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH)

    override fun OkHttpClient.Builder.configureClient() = rateLimit(3)
}