/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Fu_1;
import celestial.rdn_3;
import celestial.rrLg_1;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLV {
    private static short[] id_byte;
    private static boolean[] id_protected;
    public static Object[] id_class;
    private static byte[] id_throws;
    public Object[] id_break;

    public Fu_1<?> id_byte() {
        return (Fu_1)this.id_break[id_byte[9]];
    }

    public rrLV() {
        this.id_throws();
    }

    static {
        rrLV.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8EBC8FB9;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-61, 81, 87, 32, 7, 85, -47, 114}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrLg_1 id_class() {
        return (rrLg_1)((Object)this.id_break[id_byte[10]]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFB934F57AABAB310L;
    }

    public static void id_class(rdn_3 rdn_32, Fu_1<?> fu_1, rrLg_1 rrLg_12) {
        rrLV rrLV2 = rrLV.id_break(rdn_32, fu_1, rrLg_12);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[7]]).id_finally().id_class(rrLV2);
    }

    private static rrLV id_break(rdn_3 rdn_32, Fu_1<?> fu_1, rrLg_1 rrLg_12) {
        Fu_1<?> fu_12;
        rdn_3 rdn_33 = rdn_32;
        ((rrLV)rrLV.id_class[rrLV.id_byte[0]]).id_break[rrLV.id_byte[1]] = rdn_33;
        ((rrLV)rrLV.id_class[rrLV.id_byte[2]]).id_break[rrLV.id_byte[3]] = fu_12 = fu_1;
        rrLg_1 rrLg_13 = rrLg_12;
        ((rrLV)rrLV.id_class[rrLV.id_byte[4]]).id_break[rrLV.id_byte[5]] = rrLg_13;
        return (rrLV)id_class[id_byte[6]];
    }

    public rdn_3 id_break() {
        return (rdn_3)this.id_break[id_byte[8]];
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrLV.id_private();
        rrLV.id_case();
        rrLV.id_protected();
        rrLV.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new rrLV()};
        id_class = objectArray;
    }

    private static void id_case() {
        short[] sArray = new short[11];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[9] = 1;
        sArray[10] = 2;
        id_byte = sArray;
    }

    private static void id_protected() {
        id_throws = new byte[]{3};
    }

    private static void id_private() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }
}

