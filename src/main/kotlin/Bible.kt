/**
 * Created by RMH on 1/1/18.
 */
class Bible(){

	// Required fields.

	/**
	 * The chronological number of the book.
	 */
	private var bookNumber: Int = 0

	/**
	 * The name of the book.
	 */
	private var bookName: String = ""

	/**
	 * The total number of chapters in the book.
	 */
	private var numberOfChapters: Int = 0

	fun setBookNumber(number: Int) {
		bookNumber = number
	}

	fun setBookName(name: String) {
		bookName = name
	}

	fun setNumberOfChapters(chapters: Int) {
		numberOfChapters = chapters
	}

	fun getBookNumber(): Int = bookNumber

	fun getBookName(): String = bookName

	fun getNumberOfChapters(): Int = numberOfChapters
}