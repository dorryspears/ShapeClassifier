import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeClassifierTest {

    @DisplayName("Test evaluateGuess with no parameters")
    @Test
    public void testEvaluateGuessNoParameters() {
        ShapeClassifier s = new ShapeClassifier();
        String result = s.evaluateGuess("");
        assertEquals("No", result);
    }

    @DisplayName("Test evaluateGuess with one parameter (Line)")
    @Test
    public void testEvaluateGuessOneParameterLine() {
        ShapeClassifier s = new ShapeClassifier();
        String result = s.evaluateGuess("Line,Small,Yes,5");
        assertEquals("Wrong Size,Wrong Even/Odd", result);
    }

    @DisplayName("Test evaluateGuess with two parameters (Circle)")
    @Test
    public void testEvaluateGuessTwoParametersCircle() {
        ShapeClassifier s = new ShapeClassifier();
        String result = s.evaluateGuess("Circle,Small,Yes,5,5");
        assertEquals("Yes: Wrong Even/Odd", result);
    }

    @DisplayName("Test evaluateGuess with two parameters (Ellipse)")
    @Test
    public void testEvaluateGuessTwoParametersEllipse() {
        ShapeClassifier s = new ShapeClassifier();
        String result = s.evaluateGuess("Ellipse,Small,Yes,5,10");
        assertEquals("No: Suggestion=Ellipse", result);
    }
}