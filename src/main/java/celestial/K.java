/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class K<T> {
    private static String[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static byte[] id_protected;
    private static short[] id_throws;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[1]];
            objectArray[K.id_byte[3]] = id_byte[4];
        }
    }

    public K(T t) {
        this.id_byte();
        T t2 = t;
        this.id_class[K.id_throws[0]] = t2;
    }

    static {
        K.ntfClinit();
    }

    public String toString() {
        Object[] objectArray = new Object[id_protected[0]];
        objectArray[K.id_byte[1]] = (boolean)((Boolean)this.id_class[id_throws[5]]);
        objectArray[K.id_byte[2]] = this.id_class[id_throws[6]].toString();
        return String.format(id_break[0], objectArray);
    }

    public boolean id_class() {
        return (Boolean)this.id_class[id_throws[4]];
    }

    public void id_class(T t) {
        T t2 = t;
        this.id_class[K.id_throws[2]] = t2;
        Boolean bl = id_byte[0];
        this.id_class[K.id_throws[3]] = bl;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBBE9A60E;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2895DDA63B6734BEL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{99, 48, -22, 0, 14, -120, 98, 102}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public T id_break() {
        return (T)this.id_class[id_throws[1]];
    }

    private static void id_throws() {
        short[] sArray = new short[7];
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        id_throws = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        K.id_protected();
        K.id_catch();
        K.id_throws();
        K.id_case();
    }

    private static void id_catch() {
        id_break = new String[]{new String("Overrideable{modified=%b,value=%s}")};
    }

    private static void id_case() {
        id_protected = new byte[]{2, 2};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        id_byte = blArray;
    }
}

