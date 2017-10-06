import java.net.HttpURLConnection
import java.net.URL

/**
 * Created by RMH on 9/4/17.
 *
 * A wrapper around the getbible.net API designed for quick easy access to the endpoints.
 */
class BibleWrap {

	/**
	 * The foundation of the URL used for every call to the API.
	 */
	private val baseURL = "http://getbible.net/json?p="

	/**
	 * Blanket function to get any passage with a valid endpoint. This should be used
	 * with caution because it can easily be the cause of an error if you attempt to
	 * call a non-existent endpoint.
	 */
	fun getPassage(passage: String): Boolean {
		// Connect to the URL.
		val connection = URL(baseURL + passage).openConnection() as HttpURLConnection
		// Set a user agent to fool the API into thinking it's a browser request.
		connection.addRequestProperty("User-Agent", "Mozilla/4.0")
		// Store the entire contents of the JSON data as a String.
		val data = connection.inputStream.bufferedReader().readText()

		println(data)
		return true
	}

	/**
	 * Function to get any single chapter from the specified book.
	 */
	fun getChapter(book: String, chapter, Int): Boolean {
		// TODO: get the chapter.
		return true
	}
}