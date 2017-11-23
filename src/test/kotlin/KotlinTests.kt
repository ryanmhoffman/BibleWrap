import org.junit.Test
import kotlin.test.assertTrue

/**
 * Created by RMH on 9/4/17.
 */
class KotlinTests {

	// Test cases

	@Test
	fun printResults(){
		val bw = BibleWrap()
		assertTrue { bw.getPassage("John1") }
	}

	@Test
	fun printBook(){
		val wrap = BibleWrap()
		assertTrue { wrap.getBook(Books.THIRD_JOHN) }
	}

	@Test
	fun printChapter(){
		val bible = BibleWrap()
		assertTrue { bible.getChapter(Books.COLOSSIANS, 1) }
	}

}