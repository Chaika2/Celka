/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.QY;
import celestial.rdn_3;
import celestial.rrLi_1;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLa_1 {
    private static byte[] id_byte;
    public static Object[] id_class;
    private static boolean[] id_protected;
    private static short[] id_throws;
    public Object[] id_break;

    private void id_byte() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
        }
    }

    public rrLa_1() {
        this.id_byte();
    }

    static {
        rrLa_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3F45BE08FC45D932L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{38, -47, 65, -47, 117, -42, 70, -21}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF17787DB;
    }

    public static rrLa_1 id_class(rdn_3 rdn_32, rrLi_1 rrLi_12) {
        rdn_3 rdn_33 = rdn_32;
        ((rrLa_1)rrLa_1.id_class[rrLa_1.id_throws[0]]).id_break[rrLa_1.id_throws[1]] = rdn_33;
        rrLi_1 rrLi_13 = rrLi_12;
        ((rrLa_1)rrLa_1.id_class[rrLa_1.id_throws[2]]).id_break[rrLa_1.id_throws[3]] = rrLi_13;
        return (rrLa_1)id_class[id_throws[4]];
    }

    public rdn_3 id_class() {
        return (rdn_3)this.id_break[id_throws[5]];
    }

    public static void id_break(rdn_3 rdn_32, rrLi_1 rrLi_12) {
        QY.id_instanceof().id_class(() -> {
            rrLa_1 rrLa_12 = rrLa_1.id_class(rdn_32, rrLi_12);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[7]]).id_finally().id_class(rrLa_12);
            ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_throws[8]]).id_class(rrLa_12);
        });
    }

    public rrLi_1 id_break() {
        return (rrLi_1)this.id_break[id_throws[6]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLa_1.id_throws();
        rrLa_1.id_case();
        rrLa_1.id_protected();
        rrLa_1.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new rrLa_1()};
        id_class = objectArray;
    }

    private static void id_case() {
        short[] sArray = new short[9];
        sArray[3] = 1;
        sArray[6] = 1;
        id_throws = sArray;
    }

    private static void id_protected() {
        id_byte = new byte[]{2};
    }
}

