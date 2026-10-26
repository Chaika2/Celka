/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.rdn_3;
import celestial.rff_3;
import celestial.rpm_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAR
extends Om_1 {
    private static short[] id_byte;
    public static Object[] id_class;
    private static boolean[] id_protected;
    private static byte[] id_throws;
    public Object[] id_break;

    public rrAR() {
        this.id_case();
    }

    static {
        rrAR.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB9ADC1EF;
    }

    public static rrAR id_class(rdn_3 rdn_32, rff_3 rff_32, xd_3 xd_32, rpm_3 rpm_32) {
        rdn_3 rdn_33 = rdn_32;
        ((rrAR)rrAR.id_class[rrAR.id_byte[0]]).id_break[rrAR.id_byte[1]] = rdn_33;
        rff_3 rff_33 = rff_32;
        ((rrAR)rrAR.id_class[rrAR.id_byte[2]]).id_break[rrAR.id_byte[3]] = rff_33;
        xd_3 xd_33 = xd_32;
        ((rrAR)rrAR.id_class[rrAR.id_byte[4]]).id_break[rrAR.id_byte[5]] = xd_33;
        rpm_3 rpm_33 = rpm_32;
        ((rrAR)rrAR.id_class[rrAR.id_byte[6]]).id_break[rrAR.id_byte[7]] = rpm_33;
        ((rrAR)id_class[id_byte[8]]).id_class(id_protected[0]);
        return (rrAR)id_class[id_byte[9]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x827C5BB62DE9B2CFL;
    }

    public rdn_3 id_class() {
        this.id_case();
        return (rdn_3)this.id_break[id_byte[12]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-121, 60, -17, -121, -29, -26, -45, -67}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rff_3 id_break() {
        this.id_case();
        return (rff_3)this.id_break[id_byte[10]];
    }

    public rpm_3 id_throws() {
        this.id_case();
        return (rpm_3)((Object)this.id_break[id_byte[13]]);
    }

    private static /* synthetic */ void ntfClinit() {
        rrAR.id_private();
        rrAR.id_finally();
        rrAR.id_implements();
        rrAR.id_catch();
    }

    private static void id_finally() {
        short[] sArray = new short[14];
        sArray[1] = 2;
        sArray[5] = 1;
        sArray[7] = 3;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 3;
        id_byte = sArray;
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new rrAR()};
        id_class = objectArray;
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }

    private static void id_implements() {
        id_throws = new byte[]{4};
    }

    public xd_3 id_protected() {
        this.id_case();
        return (xd_3)this.id_break[id_byte[11]];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_protected = blArray;
    }
}

