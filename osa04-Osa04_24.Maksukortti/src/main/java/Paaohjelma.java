
public class Paaohjelma {

    public static void main(String[] args) {
        Maksukortti p_kortti = new Maksukortti(20);
        Maksukortti m_kortti = new Maksukortti(30);
        p_kortti.syoMaukkaasti();
        m_kortti.syoEdullisesti();
        System.out.println("Pekka "+p_kortti);
        System.out.println("Matti "+m_kortti);
        p_kortti.lataaRahaa(20);
        m_kortti.syoMaukkaasti();
        System.out.println("Pekka "+p_kortti);
        System.out.println("Matti "+m_kortti);
        p_kortti.syoEdullisesti();
        p_kortti.syoEdullisesti();
        m_kortti.lataaRahaa(50);
        System.out.println("Pekka "+p_kortti);
        System.out.println("Matti "+m_kortti);
    }
}
