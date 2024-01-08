import Pages.HomePage;
import org.testng.annotations.Test;

public class Test_Swiping extends BaseTest{

    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
        new HomePage(driver).enterGraphics()
                .enterVertices();

    }
}
