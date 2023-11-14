import org.mmonge.Account
import org.mmonge.AccountHelper
import spock.lang.*


class MockExampleSpec extends Specification {

    Account testObj
    AccountHelper accountHelperMock = Mock()

    def setup() {
        testObj = new Account(helper: accountHelperMock)
        accountHelperMock.validateAccount(_ as Account) >> true

    }

    def "should validate account on creation"() {
        when:
        def isAccountValid = testObj.createAccount("some-id")

        then:
        isAccountValid
    }

}