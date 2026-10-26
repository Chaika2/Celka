/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.rpm_3;
import celestial.ryZ_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAf_1 {
    private static short[] id_byte;
    public static Object[] id_class;
    private static boolean[] id_protected;
    private static byte[] id_throws;
    public Object[] id_break;

    public ryZ_2 id_byte() {
        return (ryZ_2)((Object)this.id_break[id_byte[7]]);
    }

    public rrAf_1() {
        this.id_private();
    }

    static {
        rrAf_1.ntfClinit();
    }

    public static rrAf_1 id_class(ryZ_2 ryZ_22, rdn_3 rdn_32, rpm_3 rpm_32) {
        ryZ_2 ryZ_23 = ryZ_22;
        ((rrAf_1)rrAf_1.id_class[rrAf_1.id_byte[0]]).id_break[rrAf_1.id_byte[1]] = ryZ_23;
        rdn_3 rdn_33 = rdn_32;
        ((rrAf_1)rrAf_1.id_class[rrAf_1.id_byte[2]]).id_break[rrAf_1.id_byte[3]] = rdn_33;
        rpm_3 rpm_33 = rpm_32;
        ((rrAf_1)rrAf_1.id_class[rrAf_1.id_byte[4]]).id_break[rrAf_1.id_byte[5]] = rpm_33;
        return (rrAf_1)id_class[id_byte[6]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x13568620;
    }

    public rpm_3 id_class() {
        return (rpm_3)((Object)this.id_break[id_byte[9]]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF5631607FE334C5CL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{102, 7, 97, 103, 4, 16, 3, 0}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rdn_3 id_break() {
        return (rdn_3)this.id_break[id_byte[8]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAf_1.id_throws();
        rrAf_1.id_protected();
        rrAf_1.id_catch();
        rrAf_1.id_case();
    }

    private static void id_catch() {
        id_throws = new byte[]{3};
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rrAf_1()};
        id_class = objectArray;
    }

    private static void id_protected() {
        short[] sArray = new short[10];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        id_byte = sArray;
    }

    private void id_private() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }
}

