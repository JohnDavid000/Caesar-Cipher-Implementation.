import service.CaesarCipherImpl;
import service.DecryptMessage;
import service.EncryptMessage;

public class main {
    public static void main(String[] args) {
       
        // EncryptMessage message = new EncryptMessage(5, "Hello");
        // message.encryptMessages();

        // DecryptMessage secondMessage = new DecryptMessage(4, "NSLR HEZMH");
        // secondMessage.decryptMessages();

        CaesarCipherImpl imp = new CaesarCipherImpl();
        imp.startEcnryptionAndDecryption();
    }
}