
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class TehtavienhallintaTest {

        Tehtavienhallinta hallinta;
    
    @Before
    public void start(){
        this.hallinta = new Tehtavienhallinta();
    }
    
    @Test
    public void tehtavalistaAlussaTyhhja(){
        assertEquals(0, this.hallinta.tehtavalista().size());
    }
    
    @Test
    public void tehtavanLisaaminenKasvattaaListanKokoaYhdella(){
        this.hallinta.lisaa("kirjoita testi");
        assertEquals(1, this.hallinta.tehtavalista().size());
    }
    
    @Test
    public void lisattyTehtavaLoytyyTehtavalistalta(){
        this.hallinta.lisaa("kirjoita testi");
        assertTrue(this.hallinta.tehtavalista().contains("kirjoita testi"));
    }
    
    @Test
    public void tehdyksiMerrkaamatonEiOleTehty(){
        this.hallinta.lisaa("Uusi tehtävä");
        this.hallinta.merkkaaTehdyksi("Uusi tehtävä");
        assertTrue(this.hallinta.onTehty("Uusi tehtävä"));
    }
    
    @Test
    public void tehydksiMerkkaamatonEiOleTehty(){
        this.hallinta.lisaa("Uusi tehtävä");
        this.hallinta.merkkaaTehdyksi("Uusi tehtävä");
        assertFalse(this.hallinta.onTehty("Joku tehtävä"));
    }
    
    @Test
    public void lisaaJaPoistaTehtava(){
        this.hallinta.lisaa("osta omena");
        this.hallinta.poista("osta omena");
        assertEquals(0, this.hallinta.tehtavalista().size());
    }
}
