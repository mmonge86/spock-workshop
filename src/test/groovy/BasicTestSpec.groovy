import org.mmonge.BasicTest
import spock.lang.Specification

class BasicTestSpec extends Specification{

    BasicTest testObj

    def setup() {
        testObj = new BasicTest()
    }

    def "it should return a string converted to upper case"() {
        when: "toUpper() is called with a given string"
        def result = testObj.toUpper("Hello world!")

        then: "it should return the same string, but converted"
        print("the result is $result")
        result == "HELLO WORLD!"

    }
}
