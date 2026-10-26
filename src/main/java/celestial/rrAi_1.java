/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.Om_1;
import celestial.Y;
import celestial.rdn_3;
import celestial.rpZ_2;
import celestial.rpm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAi_1
extends Om_1 {
    private static byte[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;
    private static boolean[] id_throws;
    public static Object[] id_break;
    private static float[] id_case;

    public rrAi_1() {
        this.id_private();
    }

    static {
        rrAi_1.ntfClinit();
    }

    public static rrAi_1 id_class(Y y, Ml_1 ml_1, rpm_3 rpm_32, rpZ_2 rpZ_22, rdn_3 rdn_32, float f) {
        Y y2 = y;
        ((rrAi_1)rrAi_1.id_break[rrAi_1.id_protected[0]]).id_class[rrAi_1.id_protected[1]] = y2;
        Ml_1 ml_12 = ml_1;
        ((rrAi_1)rrAi_1.id_break[rrAi_1.id_protected[2]]).id_class[rrAi_1.id_protected[3]] = ml_12;
        rpm_3 rpm_33 = rpm_32;
        ((rrAi_1)rrAi_1.id_break[rrAi_1.id_protected[4]]).id_class[rrAi_1.id_protected[5]] = rpm_33;
        rpZ_2 rpZ_23 = rpZ_22;
        ((rrAi_1)rrAi_1.id_break[rrAi_1.id_protected[6]]).id_class[rrAi_1.id_protected[7]] = rpZ_23;
        rdn_3 rdn_33 = rdn_32;
        ((rrAi_1)rrAi_1.id_break[rrAi_1.id_protected[8]]).id_class[rrAi_1.id_protected[9]] = rdn_33;
        Float f2 = Float.valueOf(f);
        ((rrAi_1)rrAi_1.id_break[rrAi_1.id_protected[10]]).id_class[rrAi_1.id_protected[11]] = f2;
        ((rrAi_1)id_break[id_protected[12]]).id_class(id_throws[0]);
        return (rrAi_1)id_break[id_protected[13]];
    }

    public void id_class(rdn_3 rdn_32) {
        this.id_private();
        rdn_3 rdn_33 = rdn_32;
        this.id_class[rrAi_1.id_protected[23]] = rdn_33;
    }

    public void id_class(rpZ_2 rpZ_22) {
        this.id_private();
        rpZ_2 rpZ_23 = rpZ_22;
        this.id_class[rrAi_1.id_protected[22]] = rpZ_23;
    }

    public void id_class(rpm_3 rpm_32) {
        this.id_private();
        rpm_3 rpm_33 = rpm_32;
        this.id_class[rrAi_1.id_protected[21]] = rpm_33;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{110, -65, 56, -111, 12, 18, 63, 104}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(Ml_1 ml_1) {
        this.id_private();
        Ml_1 ml_12 = ml_1;
        this.id_class[rrAi_1.id_protected[20]] = ml_12;
    }

    public void id_class(float f) {
        this.id_private();
        Float f2 = Float.valueOf(f);
        this.id_class[rrAi_1.id_protected[24]] = f2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFCAB5BC277B31041L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF5BAD8CF;
    }

    public void id_class(Y y) {
        this.id_private();
        Y y2 = y;
        this.id_class[rrAi_1.id_protected[25]] = y2;
    }

    public rpZ_2 id_class() {
        this.id_private();
        return (rpZ_2)((Object)this.id_class[id_protected[16]]);
    }

    public Ml_1 id_break() {
        this.id_private();
        return (Ml_1)this.id_class[id_protected[14]];
    }

    public Y id_throws() {
        this.id_private();
        return (Y)((Object)this.id_class[id_protected[19]]);
    }

    private static /* synthetic */ void ntfClinit() {
        rrAi_1.id_native();
        rrAi_1.id_volatile();
        rrAi_1.id_finally();
        rrAi_1.id_extends();
        rrAi_1.id_implements();
    }

    private static void id_finally() {
        id_case = new float[1];
    }

    public float id_catch() {
        this.id_private();
        return ((Float)this.id_class[id_protected[18]]).floatValue();
    }

    private static void id_extends() {
        id_byte = new byte[]{6, 4};
    }

    public rpm_3 id_case() {
        this.id_private();
        return (rpm_3)((Object)this.id_class[id_protected[15]]);
    }

    private static void id_implements() {
        Object[] objectArray = new Object[]{new rrAi_1()};
        id_break = objectArray;
    }

    public rdn_3 id_protected() {
        this.id_private();
        return (rdn_3)this.id_class[id_protected[17]];
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrAi_1.id_byte[1]] = Float.valueOf(id_case[0]);
        }
    }

    private static void id_volatile() {
        short[] sArray = new short[26];
        sArray[1] = 5;
        sArray[5] = 1;
        sArray[7] = 2;
        sArray[9] = 3;
        sArray[11] = 4;
        sArray[15] = 1;
        sArray[16] = 2;
        sArray[17] = 3;
        sArray[18] = 4;
        sArray[19] = 5;
        sArray[21] = 1;
        sArray[22] = 2;
        sArray[23] = 3;
        sArray[24] = 4;
        sArray[25] = 5;
        id_protected = sArray;
    }

    private static void id_native() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_throws = blArray;
    }
}

