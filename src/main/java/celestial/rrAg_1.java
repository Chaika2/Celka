/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXa_1;
import celestial.rdn_3;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAg_1 {
    public static Object[] id_class;
    private static byte[] id_byte;
    public Object[] id_break;
    private static short[] id_protected;
    private static boolean[] id_throws;

    public rdn_3 id_byte() {
        return (rdn_3)this.id_break[id_protected[19]];
    }

    public rrAg_1() {
        this.id_catch();
    }

    static {
        rrAg_1.ntfClinit();
    }

    public int id_class() {
        return (Integer)this.id_break[id_protected[15]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD419AB;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{109, -10, 55, -82, 6, 113, 57, -56}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2418728D5D98E02L;
    }

    public static rrAg_1 id_class(int n, int n2, int n3, short s, rXa_1 rXa_12, rdn_3 rdn_32) {
        Integer n4 = n;
        ((rrAg_1)rrAg_1.id_class[rrAg_1.id_protected[0]]).id_break[rrAg_1.id_protected[1]] = n4;
        Integer n5 = n2;
        ((rrAg_1)rrAg_1.id_class[rrAg_1.id_protected[2]]).id_break[rrAg_1.id_protected[3]] = n5;
        Integer n6 = n3;
        ((rrAg_1)rrAg_1.id_class[rrAg_1.id_protected[4]]).id_break[rrAg_1.id_protected[5]] = n6;
        Short s2 = s;
        ((rrAg_1)rrAg_1.id_class[rrAg_1.id_protected[6]]).id_break[rrAg_1.id_protected[7]] = s2;
        rXa_1 rXa_13 = rXa_12;
        ((rrAg_1)rrAg_1.id_class[rrAg_1.id_protected[8]]).id_break[rrAg_1.id_protected[9]] = rXa_13;
        rdn_3 rdn_33 = rdn_32;
        ((rrAg_1)rrAg_1.id_class[rrAg_1.id_protected[10]]).id_break[rrAg_1.id_protected[11]] = rdn_33;
        return (rrAg_1)id_class[id_protected[12]];
    }

    public static void id_break(int n, int n2, int n3, short s, rXa_1 rXa_12, rdn_3 rdn_32) {
        rrAg_1 rrAg_12 = rrAg_1.id_class(n, n2, n3, s, rXa_12, rdn_32);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[13]]).id_finally().id_class(rrAg_12);
    }

    public int id_break() {
        return (Integer)this.id_break[id_protected[16]];
    }

    public short id_throws() {
        return (Short)this.id_break[id_protected[17]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrAg_1.id_extends();
        rrAg_1.id_finally();
        rrAg_1.id_implements();
        rrAg_1.id_private();
    }

    private static void id_finally() {
        short[] sArray = new short[20];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[7] = 3;
        sArray[9] = 4;
        sArray[11] = 5;
        sArray[15] = 1;
        sArray[16] = 2;
        sArray[17] = 3;
        sArray[18] = 4;
        sArray[19] = 5;
        id_protected = sArray;
    }

    private void id_catch() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
            objectArray[rrAg_1.id_throws[1]] = id_throws[2];
            objectArray[rrAg_1.id_throws[3]] = id_throws[4];
            objectArray[rrAg_1.id_byte[1]] = id_throws[5];
            objectArray[rrAg_1.id_byte[2]] = id_throws[6];
        }
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[8];
        blArray[3] = true;
        blArray[7] = true;
        id_throws = blArray;
    }

    public int id_case() {
        return (Integer)this.id_break[id_protected[14]];
    }

    private static void id_implements() {
        id_byte = new byte[]{6, 2, 3};
    }

    public rXa_1 id_protected() {
        return (rXa_1)((Object)this.id_break[id_protected[18]]);
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{new rrAg_1()};
        id_class = objectArray;
    }
}

