/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzH_2 {
    private static short[] id_break;
    public static Object[] id_class;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    private static long[] id_throws;
    private static int[] id_case;

    public static int id_byte(byte[] byArray, int n) {
        return rrzH_2.id_while(byArray, n + id_byte[58]);
    }

    public static int id_byte(byte[] byArray) {
        return rrzH_2.id_while(byArray, id_byte[21]);
    }

    private static void id_byte() {
        long[] lArray = new long[13];
        lArray[0] = 0xFFFFFFFFL;
        lArray[1] = 67324752L;
        lArray[2] = 134695760L;
        lArray[3] = 33639248L;
        lArray[4] = 101010256L;
        lArray[9] = 101075792L;
        lArray[10] = 117853008L;
        lArray[11] = 0xFFFFFFFFL;
        lArray[12] = 65557L;
        id_throws = lArray;
    }

    public static long id_int(byte[] byArray, int n) {
        return rrzH_2.id_try(byArray, n + id_byte[51]);
    }

    public static long id_int(byte[] byArray) {
        return rrzH_2.id_catch(byArray, id_byte[41]);
    }

    static {
        rrzH_2.ntfClinit();
    }

    public static int id_this(byte[] byArray) {
        return rrzH_2.id_while(byArray, id_byte[33]);
    }

    public static boolean id_this(byte[] byArray, int n) {
        return rrzH_2.id_class(byArray, n, id_byte[14], id_byte[15]);
    }

    public static int id_interface(byte[] byArray, int n) {
        return rrzH_2.id_while(byArray, n + id_byte[45]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x794FE0F0;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{123, -46, 23, 67, -124, -80, 72, 32}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC0BE21F51435A1ADL;
    }

    private static boolean id_class(byte[] byArray, int n, int n2, int n3) {
        return (byArray[n] == id_byte[5] ? id_protected[1] : id_protected[2]) & (byArray[n + id_protected[3]] == id_byte[6] ? id_protected[4] : id_protected[5]) & (byArray[n + id_byte[7]] == n2 ? id_protected[6] : id_protected[7]) & (byArray[n + id_byte[8]] == n3 ? id_protected[8] : id_protected[9]);
    }

    public static int id_class(byte[] byArray) {
        return rrzH_2.id_while(byArray, id_byte[32]);
    }

    private static void id_class() {
        id_break = new short[]{2048, 768, 21589, 128};
    }

    public static int id_class(byte[] byArray, int n) {
        return rrzH_2.id_while(byArray, n + id_byte[37]);
    }

    public static int id_break(byte[] byArray) {
        return rrzH_2.id_while(byArray, id_byte[36]);
    }

    public static boolean id_break(byte[] byArray, int n) {
        return rrzH_2.id_class(byArray, n, id_protected[10], id_byte[9]);
    }

    private static void id_break() {
        id_case = new int[]{65535};
    }

    public static int id_throws(byte[] byArray, int n) {
        return rrzH_2.id_while(byArray, n + id_byte[43]);
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{0, 8, 9, 12, 14, 19, 99, 1, 8, 2048, 67324752L, 134695760L, 33639248L, 101010256L, 30, 16, 46, 22, 3, 768, 4, 6, 8, 10, 14, 18, 22, 26, 28, 4, 8, 12, 4, 6, 8, 10, 12, 16, 20, 24, 28, 30, 32, 34, 36, 38, 42, 8, 10, 12, 16, 20, 101075792L, 117853008L, 56, 20, 24, 1, 65535, 0xFFFFFFFFL, 4, 12, 14, 16, 20, 24, 32, 40, 48, 56, 4, 8, 16, 4, 8, 16, 1, 10, 13, 23, 21589, 65557L, 128};
        id_class = objectArray;
    }

    public static long id_throws(byte[] byArray) {
        return rrzH_2.id_catch(byArray, id_byte[40]);
    }

    private static /* synthetic */ void ntfClinit() {
        rrzH_2.id_case();
        rrzH_2.id_byte();
        rrzH_2.id_class();
        rrzH_2.id_protected();
        rrzH_2.id_break();
        rrzH_2.id_throws();
    }

    public static long id_finally(byte[] byArray, int n) {
        return rrzH_2.id_try(byArray, n + id_byte[50]);
    }

    public static long id_finally(byte[] byArray) {
        return rrzH_2.id_try(byArray, id_byte[34]);
    }

    public static long id_catch(byte[] byArray) {
        return rrzH_2.id_try(byArray, id_protected[11]);
    }

    public static long id_catch(byte[] byArray, int n) {
        return rrzH_2.id_try(byArray, n) | rrzH_2.id_try(byArray, n + id_byte[3]) << id_byte[4];
    }

    public static int id_extends(byte[] byArray) {
        return rrzH_2.id_while(byArray, id_byte[27]);
    }

    public static int id_extends(byte[] byArray, int n) {
        return rrzH_2.id_while(byArray, n + id_byte[55]);
    }

    public static long id_goto(byte[] byArray, int n) {
        return rrzH_2.id_try(byArray, n + id_protected[12]);
    }

    public static long id_case(byte[] byArray, int n) {
        return rrzH_2.id_try(byArray, n);
    }

    private static void id_case() {
        boolean[] blArray = new boolean[19];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[18] = true;
        id_protected = blArray;
    }

    public static int id_case(byte[] byArray) {
        return rrzH_2.id_while(byArray, id_byte[20]);
    }

    public static long id_continue(byte[] byArray) {
        return rrzH_2.id_try(byArray, id_byte[30]);
    }

    public static int id_continue(byte[] byArray, int n) {
        return rrzH_2.id_while(byArray, n + id_byte[56]);
    }

    public static int id_else(byte[] byArray, int n) {
        return rrzH_2.id_while(byArray, n + id_byte[46]);
    }

    public static long id_else(byte[] byArray) {
        return rrzH_2.id_try(byArray, id_byte[24]);
    }

    public static long id_implements(byte[] byArray) {
        return rrzH_2.id_try(byArray, id_byte[31]);
    }

    public static int id_implements(byte[] byArray, int n) {
        return rrzH_2.id_while(byArray, n + id_byte[54]);
    }

    public static int id_instanceof(byte[] byArray, int n) {
        return rrzH_2.id_while(byArray, n + id_byte[53]);
    }

    public static boolean id_new(byte[] byArray, int n) {
        return rrzH_2.id_class(byArray, n, id_byte[10], id_byte[11]);
    }

    public static long id_new(byte[] byArray) {
        return rrzH_2.id_try(byArray, id_byte[26]);
    }

    public static boolean id_package(byte[] byArray, int n) {
        return rrzH_2.id_class(byArray, n, id_byte[18], id_byte[19]);
    }

    public static long id_package(byte[] byArray) {
        return rrzH_2.id_catch(byArray, id_byte[39]);
    }

    public static long id_return(byte[] byArray) {
        return rrzH_2.id_try(byArray, id_byte[23]);
    }

    public static boolean id_return(byte[] byArray, int n) {
        return rrzH_2.id_class(byArray, n, id_byte[12], id_byte[13]);
    }

    public static int id_super(byte[] byArray, int n) {
        return rrzH_2.id_while(byArray, n + id_byte[52]);
    }

    public static long id_super(byte[] byArray) {
        return rrzH_2.id_try(byArray, id_byte[35]);
    }

    public static long id_throw(byte[] byArray, int n) {
        return rrzH_2.id_try(byArray, n + id_byte[59]);
    }

    public static long id_try(byte[] byArray, int n) {
        return (long)(rrzH_2.id_while(byArray, n) | rrzH_2.id_while(byArray, n + id_byte[1]) << id_byte[2]) & id_throws[0];
    }

    public static int id_while(byte[] byArray, int n) {
        return Byte.toUnsignedInt(byArray[n]) | Byte.toUnsignedInt(byArray[n + id_protected[0]]) << id_byte[0];
    }

    public static long id_public(byte[] byArray, int n) {
        return rrzH_2.id_try(byArray, n + id_byte[57]);
    }

    public static long id_protected(byte[] byArray, int n) {
        return rrzH_2.id_try(byArray, n + id_byte[49]);
    }

    public static long id_protected(byte[] byArray) {
        return rrzH_2.id_try(byArray, id_byte[25]);
    }

    private static void id_protected() {
        id_byte = new byte[]{8, 2, 16, 4, 32, 80, 75, 2, 3, 2, 3, 4, 5, 6, 7, 8, 6, 6, 6, 7, 4, 6, 8, 10, 14, 18, 22, 26, 28, 4, 8, 12, 8, 10, 12, 16, 20, 20, 24, 32, 40, 48, 8, 4, 5, 6, 8, 10, 12, 16, 20, 24, 28, 30, 32, 34, 36, 38, 40, 42, 10, 11, 12, 13, 83, 8, 2, 9, 3, 12, 4, 14, 5, 19, 6, 99, 7, 8, 8, 9, 10, 11, 12, 13, 14, 30, 15, 16, 16, 46, 17, 22, 18, 3, 19, 20, 4, 21, 6, 22, 8, 23, 10, 24, 14, 25, 18, 26, 22, 27, 26, 28, 28, 29, 4, 30, 8, 31, 12, 32, 4, 33, 6, 34, 8, 35, 10, 36, 12, 37, 16, 38, 20, 39, 24, 40, 28, 41, 30, 42, 32, 43, 34, 44, 36, 45, 38, 46, 42, 47, 8, 48, 10, 49, 12, 50, 16, 51, 20, 52, 53, 54, 56, 55, 20, 56, 24, 57, 58, 59, 60, 4, 61, 12, 62, 14, 63, 16, 64, 20, 65, 24, 66, 32, 67, 40, 68, 48, 69, 56, 70, 4, 71, 8, 72, 16, 73, 4, 74, 8, 75, 16, 76, 77, 10, 78, 13, 79, 23, 80, 81, 82};
    }

    public static long id_private(byte[] byArray) {
        return rrzH_2.id_catch(byArray, id_byte[42]);
    }

    public static int id_private(byte[] byArray, int n) {
        return rrzH_2.id_final(byArray, n + id_byte[44]);
    }

    public static int id_final(byte[] byArray, int n) {
        return Byte.toUnsignedInt(byArray[n]);
    }

    public static int id_final(byte[] byArray) {
        return rrzH_2.id_while(byArray, id_byte[22]);
    }

    public static long id_volatile(byte[] byArray, int n) {
        return rrzH_2.id_try(byArray, n + id_byte[48]);
    }

    public static int id_volatile(byte[] byArray) {
        return rrzH_2.id_while(byArray, id_byte[28]);
    }

    public static long id_synchronized(byte[] byArray) {
        return rrzH_2.id_catch(byArray, id_byte[38]);
    }

    public static int id_synchronized(byte[] byArray, int n) {
        return rrzH_2.id_while(byArray, n + id_byte[47]);
    }

    public static long id_native(byte[] byArray) {
        return rrzH_2.id_try(byArray, id_byte[29]);
    }

    public static boolean id_native(byte[] byArray, int n) {
        return rrzH_2.id_class(byArray, n, id_byte[16], id_byte[17]);
    }
}

