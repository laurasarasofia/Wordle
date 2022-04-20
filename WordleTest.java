import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WordleTest {

    @Test
    public void vertailuEri(){
        String arvaus="katti";
        String vastaus="kissa";
        VertaaSanat sanat = new VertaaSanat(arvaus, vastaus);
        assertEquals(false, sanat.vertaa());
    }
    public void vertailuSama(){
        String arvaus="kissa";
        String vastaus="kissa";
        VertaaSanat sanat = new VertaaSanat(arvaus, vastaus);
        assertEquals(false, sanat.vertaa());
    }
    
}
