package com.liuhanze.iutil.security;

import com.liuhanze.iutil.lang.IByte;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class ISHA {

    private ISHA(){

    }

    /**
     * SHA1 加密
     *
     * @param data 明文字符串
     * @return 16 进制密文
     */
    public static String encryptSHA1ToString(final String data) {
        return encryptSHA1ToString(data.getBytes());
    }

    /**
     * SHA1 加密
     *
     * @param data 明文字节数组
     * @return 16 进制密文
     */
    public static String encryptSHA1ToString(final byte[] data) {
        return IByte.bytes2HexString(encryptSHA1(data));
    }

    /**
     * SHA1 加密
     *
     * @param data 明文字节数组
     * @return 密文字节数组
     */
    public static byte[] encryptSHA1(final byte[] data) {
        return hashTemplate(data, "SHA1");
    }

    /**
     * SHA224 加密
     *
     * @param data 明文字符串
     * @return 16 进制密文
     */
    public static String encryptSHA224ToString(final String data) {
        return encryptSHA224ToString(data.getBytes());
    }

    /**
     * SHA224 加密
     *
     * @param data 明文字节数组
     * @return 16 进制密文
     */
    public static String encryptSHA224ToString(final byte[] data) {
        return IByte.bytes2HexString(encryptSHA224(data));
    }

    /**
     * SHA224 加密
     *
     * @param data 明文字节数组
     * @return 密文字节数组
     */
    public static byte[] encryptSHA224(final byte[] data) {
        return hashTemplate(data, "SHA224");
    }

    /**
     * SHA256 加密
     *
     * @param data 明文字符串
     * @return 16 进制密文
     */
    public static String encryptSHA256ToString(final String data) {
        return encryptSHA256ToString(data.getBytes());
    }

    /**
     * SHA256 加密
     *
     * @param data 明文字节数组
     * @return 16 进制密文
     */
    public static String encryptSHA256ToString(final byte[] data) {
        return IByte.bytes2HexString(encryptSHA256(data));
    }

    /**
     * SHA256 加密
     *
     * @param data 明文字节数组
     * @return 密文字节数组
     */
    public static byte[] encryptSHA256(final byte[] data) {
        return hashTemplate(data, "SHA256");
    }

    /**
     * SHA384 加密
     *
     * @param data 明文字符串
     * @return 16 进制密文
     */
    public static String encryptSHA384ToString(final String data) {
        return encryptSHA384ToString(data.getBytes());
    }

    /**
     * SHA384 加密
     *
     * @param data 明文字节数组
     * @return 16 进制密文
     */
    public static String encryptSHA384ToString(final byte[] data) {
        return IByte.bytes2HexString(encryptSHA384(data));
    }

    /**
     * SHA384 加密
     *
     * @param data 明文字节数组
     * @return 密文字节数组
     */
    public static byte[] encryptSHA384(final byte[] data) {
        return hashTemplate(data, "SHA384");
    }

    /**
     * SHA512 加密
     *
     * @param data 明文字符串
     * @return 16 进制密文
     */
    public static String encryptSHA512ToString(final String data) {
        return encryptSHA512ToString(data.getBytes());
    }

    /**
     * SHA512 加密
     *
     * @param data 明文字节数组
     * @return 16 进制密文
     */
    public static String encryptSHA512ToString(final byte[] data) {
        return IByte.bytes2HexString(encryptSHA512(data));
    }

    /**
     * SHA512 加密
     *
     * @param data 明文字节数组
     * @return 密文字节数组
     */
    public static byte[] encryptSHA512(final byte[] data) {
        return hashTemplate(data, "SHA512");
    }

    /**
     * hash 加密模板
     *
     * @param data      数据
     * @param algorithm 加密算法
     * @return 密文字节数组
     */
    private static byte[] hashTemplate(final byte[] data, final String algorithm) {
        if (data == null || data.length <= 0) {
            return null;
        }
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            md.update(data);
            return md.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
