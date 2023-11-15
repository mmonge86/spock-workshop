import org.mmonge.Account
import org.mmonge.AccountHelper
import spock.lang.*


class MockExampleSpec extends Specification {

    Account testObj
    AccountHelper accountHelperMock = Mock()

    def setup() {
        testObj = new Account(helper: accountHelperMock)
    }

    def "should validate account on creation v1"() {
        given:
        accountHelperMock.validateAccount(testObj) >> true

        when:
        def isAccountValid = testObj.createAccount("some-id")

        then:
        isAccountValid

        and: "should fail when using other account"

        when:
        Account newAccount = new Account(helper: accountHelperMock)
        isAccountValid = newAccount.createAccount("asd")

        then:
        !isAccountValid

    }



    def "should validate account on creation v2"() {
        when:
        def isAccountValid = testObj.createAccount("some-id")

        then: "test the interaction"
        isAccountValid
        1 * accountHelperMock.validateAccount(testObj) >> true
    }


}