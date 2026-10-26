/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BT;
import celestial.Bq_1;
import celestial.Bt_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bp_1 {
    private static boolean[] id_byte;
    private static byte[] id_protected;
    private static short[] id_throws;
    public static Object[] id_class;
    public Object[] id_break;

    public Bq_1 id_byte() {
        return (Bq_1)((Object)this.id_break[id_throws[7]]);
    }

    public Bp_1() {
        this.id_private();
    }

    static {
        Bp_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{112, -82, 4, -113, -9, 44, 64, -105}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA2F1191;
    }

    public BT id_class() {
        return (BT)((Object)this.id_break[id_throws[9]]);
    }

    public static Bp_1 id_class(Bq_1 bq_1, Bt_1 bt_1, BT bT) {
        Bq_1 bq_12 = bq_1;
        ((Bp_1)Bp_1.id_class[Bp_1.id_throws[0]]).id_break[Bp_1.id_throws[1]] = bq_12;
        Bt_1 bt_12 = bt_1;
        ((Bp_1)Bp_1.id_class[Bp_1.id_throws[2]]).id_break[Bp_1.id_throws[3]] = bt_12;
        BT bT2 = bT;
        ((Bp_1)Bp_1.id_class[Bp_1.id_throws[4]]).id_break[Bp_1.id_throws[5]] = bT2;
        return (Bp_1)id_class[id_throws[6]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE57F60FE1612B014L;
    }

    public Bt_1 id_break() {
        return (Bt_1)this.id_break[id_throws[8]];
    }

    private static void id_throws() {
        id_protected = new byte[]{3};
    }

    private static /* synthetic */ void ntfClinit() {
        Bp_1.id_case();
        Bp_1.id_protected();
        Bp_1.id_throws();
        Bp_1.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new Bp_1()};
        id_class = objectArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[10];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        id_throws = sArray;
    }

    private void id_private() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[0]];
        }
    }
}

