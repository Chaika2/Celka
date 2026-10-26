/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.Om_1;
import celestial.rXa_1;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAK
extends Om_1 {
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static byte[] id_throws;
    public Object[] id_class;
    public static Object[] id_break;

    public rrAK() {
        this.id_private();
    }

    static {
        rrAK.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB4C4E91465864B75L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFBBDC704;
    }

    public static rrAK id_class(int n, int n2, int n3, rXa_1 rXa_12) {
        ((rrAK)id_break[id_byte[0]]).id_class(id_protected[0]);
        Integer n4 = n;
        ((rrAK)rrAK.id_break[rrAK.id_byte[1]]).id_class[rrAK.id_byte[2]] = n4;
        Integer n5 = n2;
        ((rrAK)rrAK.id_break[rrAK.id_byte[3]]).id_class[rrAK.id_byte[4]] = n5;
        Integer n6 = n3;
        ((rrAK)rrAK.id_break[rrAK.id_byte[5]]).id_class[rrAK.id_byte[6]] = n6;
        rXa_1 rXa_13 = rXa_12;
        ((rrAK)rrAK.id_break[rrAK.id_byte[7]]).id_class[rrAK.id_byte[8]] = rXa_13;
        return (rrAK)id_break[id_byte[9]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{65, 21, -124, -9, -106, 124, 58, 94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rXa_1 id_class() {
        this.id_private();
        return (rXa_1)((Object)this.id_class[id_byte[15]]);
    }

    public static rrAK id_break(int n, int n2, int n3, rXa_1 rXa_12) {
        rrAK rrAK2 = rrAK.id_class(n, n2, n3, rXa_12);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[10]]).id_finally().id_class(rrAK2);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[11]]).id_class(rrAK2);
        return rrAK2;
    }

    public int id_break() {
        this.id_private();
        return (Integer)this.id_class[id_byte[14]];
    }

    public int id_throws() {
        this.id_private();
        return (Integer)this.id_class[id_byte[13]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrAK.id_finally();
        rrAK.id_implements();
        rrAK.id_case();
        rrAK.id_catch();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[8];
        blArray[4] = true;
        blArray[7] = true;
        id_protected = blArray;
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new rrAK()};
        id_break = objectArray;
    }

    private static void id_case() {
        id_throws = new byte[]{4, 2};
    }

    private static void id_implements() {
        short[] sArray = new short[16];
        sArray[4] = 1;
        sArray[6] = 2;
        sArray[8] = 3;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[15] = 3;
        id_byte = sArray;
    }

    public int id_protected() {
        this.id_private();
        return (Integer)this.id_class[id_byte[12]];
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rrAK.id_protected[2]] = id_protected[3];
            objectArray[rrAK.id_protected[4]] = id_protected[5];
            objectArray[rrAK.id_throws[1]] = id_protected[6];
        }
    }
}

