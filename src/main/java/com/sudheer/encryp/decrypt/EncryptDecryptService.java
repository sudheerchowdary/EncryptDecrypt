package com.sudheer.encryp.decrypt;

/**
 * Created with IntelliJ IDEA.
 * User: Sudheer Chowdary
 * Date: 3/17/16
 * Time: 6:51 PM
 * To change this template use File | Settings | File Templates.
 */
public interface EncryptDecryptService {

    /**
     * encryptData() provide the specification for encryption of the
     * supplied data into specified algorithms
     *
     * @param data accept the instance of the java.lang.String containing
     *             the actual data which need to be encrypted
     * @return the instance of the java.lang.String containing the encrypted
     *         data using specified algorithms.
     * @throws Exception if any abnormal condition is encountered during the
     *                   execution of the application.
     */
    public String encryptData(String data) throws Exception;

    /**
     * deCryptData() provide the specification for decryption of the
     * supplied encrypted data using specified algorithms
     *
     * @param data accept the instance of the java.lang.String containing
     *             the actual data which need to be decrypt.
     * @return the instance of the java.lang.String containing the decrypted
     *         data using specified algorithms.
     * @throws Exception if any abnormal condition is encountered during the
     *                   execution of the application.
     */
    public String deCryptData(String data) throws Exception;
}
