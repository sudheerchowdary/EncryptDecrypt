package com.sudheer.encryp.decrypt;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

/**
 * Created with IntelliJ IDEA.
 * User: Sudheer Chowdary
 * Date: 3/17/16
 * Time: 6:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class EncryptDecryptServiceImpl implements EncryptDecryptService {

    private String algorithm = "AES";
    private String myEncryptionKey = "Sudheer@7777";
    private String unicodeFormat = "UTF8";

    @Override
    public String encryptData(final String data) throws Exception {
        final Key key = this.generateKey();
        final Cipher c = Cipher.getInstance(algorithm);
        c.init(Cipher.ENCRYPT_MODE, key);
        final byte[] encValue = c.doFinal(data.getBytes());
        final String encryptedValue = Base64.encodeBase64String(encValue);
        return encryptedValue;
    }

    @Override
    public String deCryptData(final String data) throws Exception {
        final Key key = this.generateKey();
        final Cipher c = Cipher.getInstance(algorithm);
        c.init(Cipher.DECRYPT_MODE, key);
        final byte[] decordedValue = Base64.decodeBase64(data);
        final byte[] decValue = c.doFinal(decordedValue);
        final String decryptedValue = new String(decValue);
        return decryptedValue;
    }

    private Key generateKey() throws Exception {
        final byte[] keyAsBytes = myEncryptionKey.getBytes(unicodeFormat);
        final Key key = new SecretKeySpec(keyAsBytes, algorithm);
        return key;
    }
}
