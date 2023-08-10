package HaloBase;

import java.util.Random;

public class Test {
    Random ran = new Random();
    public String ime = "xyz" + ran.nextInt(999999);
    public String email = ime + "@sharklasers.com";
    public String password;
    public String regSuccessfulMsg = "Registracija je uspela!\n" +
            "Kako bi Vaš nalog postao aktivan, neophodno je da kliknite na link u mejlu koji Vam je poslat na : " + email + " !";
    public String activeSuccessfulMsg = "Vaš nalog je uspešno aktiviran!\n" +
            "Produžite na stranicu za logovanje kako biste pristupili našem portalu. Prijava";
}
