/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rJY;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAD {
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static byte[] id_throws;
    public Object[] id_class;
    public static Object[] id_break;

    public int id_byte() {
        return (Integer)this.id_class[id_byte[15]];
    }

    public rrAD() {
        this.id_private();
    }

    static {
        rrAD.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-117, -36, 104, 85, -103, 75, -30, -33}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8EE0BE719D346A4FL;
    }

    public int id_class() {
        return (Integer)this.id_class[id_byte[18]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x63C8FC09;
    }

    public static rrAD id_class(Ml_1 ml_1, rJY rJY2, int n, int n2, int n3, int n4) {
        Ml_1 ml_12 = ml_1;
        ((rrAD)rrAD.id_break[rrAD.id_byte[0]]).id_class[rrAD.id_byte[1]] = ml_12;
        rJY rJY3 = rJY2;
        ((rrAD)rrAD.id_break[rrAD.id_byte[2]]).id_class[rrAD.id_byte[3]] = rJY3;
        Integer n5 = n;
        ((rrAD)rrAD.id_break[rrAD.id_byte[4]]).id_class[rrAD.id_byte[5]] = n5;
        Integer n6 = n2;
        ((rrAD)rrAD.id_break[rrAD.id_byte[6]]).id_class[rrAD.id_byte[7]] = n6;
        Integer n7 = n3;
        ((rrAD)rrAD.id_break[rrAD.id_byte[8]]).id_class[rrAD.id_byte[9]] = n7;
        Integer n8 = n4;
        ((rrAD)rrAD.id_break[rrAD.id_byte[10]]).id_class[rrAD.id_byte[11]] = n8;
        return (rrAD)id_break[id_byte[12]];
    }

    public Ml_1 id_break() {
        return (Ml_1)this.id_class[id_byte[13]];
    }

    public int id_throws() {
        return (Integer)this.id_class[id_byte[16]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrAD.id_catch();
        rrAD.id_implements();
        rrAD.id_extends();
        rrAD.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray = new Object[]{new rrAD()};
        id_break = objectArray;
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[6];
        blArray[5] = true;
        id_protected = blArray;
    }

    private static void id_extends() {
        id_throws = new byte[]{6, 2, 3, 4, 5};
    }

    public rJY id_case() {
        return (rJY)this.id_class[id_byte[14]];
    }

    private static void id_implements() {
        short[] sArray = new short[19];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[7] = 3;
        sArray[9] = 4;
        sArray[11] = 5;
        sArray[14] = 1;
        sArray[15] = 2;
        sArray[16] = 3;
        sArray[17] = 4;
        sArray[18] = 5;
        id_byte = sArray;
    }

    public int id_protected() {
        return (Integer)this.id_class[id_byte[17]];
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rrAD.id_throws[1]] = id_protected[1];
            objectArray[rrAD.id_throws[2]] = id_protected[2];
            objectArray[rrAD.id_throws[3]] = id_protected[3];
            objectArray[rrAD.id_throws[4]] = id_protected[4];
        }
    }
}

