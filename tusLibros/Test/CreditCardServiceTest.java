import exceptions.InvalidArgumentException;
import java.util.Date;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import service.CreditCardService;
import serviceImpl.CreditCardServiceImpl;

public class CreditCardServiceTest {

  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  private CreditCardService creditCardService = new CreditCardServiceImpl();

  @Test
  public void testCreditCardValidation() {
    expectedException.expect(InvalidArgumentException.class);
    expectedException.expectMessage(CreditCardServiceImpl.FORMATO_DE_FECHA_INVALIDO);
    creditCardService.verifyCrediteCard("1234123412341234", "152017", "John Doe", new Date());
  }

}
