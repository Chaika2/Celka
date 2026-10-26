/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.ryO_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnO_2 {
    private static short[] id_byte;
    public static Object[] id_class;
    private static byte[] id_protected;
    private static boolean[] id_throws;
    public Object[] id_break;

    private static void id_byte() {
        id_protected = new byte[]{2};
    }

    public rrnO_2() {
        this.id_protected();
    }

    static {
        rrnO_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x722D6027;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-105, -116, -62, 31, -14, -84, 6, -127}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1EFC78CF5906CBA0L;
    }

    public ryO_2 id_class() {
        return (ryO_2)this.id_break[id_byte[5]];
    }

    public static rrnO_2 id_class(ryO_2 ryO_22, rfH_2 rfH_22) {
        ryO_2 ryO_23 = ryO_22;
        ((rrnO_2)rrnO_2.id_class[rrnO_2.id_byte[0]]).id_break[rrnO_2.id_byte[1]] = ryO_23;
        rfH_2 rfH_23 = rfH_22;
        ((rrnO_2)rrnO_2.id_class[rrnO_2.id_byte[2]]).id_break[rrnO_2.id_byte[3]] = rfH_23;
        return (rrnO_2)id_class[id_byte[4]];
    }

    public rfH_2 id_break() {
        return (rfH_2)this.id_break[id_byte[6]];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrnO_2()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrnO_2.id_case();
        rrnO_2.id_catch();
        rrnO_2.id_byte();
        rrnO_2.id_throws();
    }

    private static void id_catch() {
        short[] sArray = new short[7];
        sArray[3] = 1;
        sArray[6] = 1;
        id_byte = sArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_throws = blArray;
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[0]];
        }
    }
}

