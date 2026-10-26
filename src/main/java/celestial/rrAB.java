/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rpm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAB
extends Om_1 {
    private static boolean[] id_byte;
    private static byte[] id_protected;
    private static short[] id_throws;
    public Object[] id_class;
    public static Object[] id_break;
    private static float[] id_case;

    public void id_byte(float f) {
        this.id_extends();
        Float f2 = Float.valueOf(f);
        this.id_class[rrAB.id_throws[27]] = f2;
    }

    public rrAB() {
        this.id_extends();
    }

    static {
        rrAB.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2778B3FD71E7AD80L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{37, -37, -103, 72, -27, -113, 6, 59}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public int id_class() {
        this.id_extends();
        return (Integer)this.id_class[id_throws[23]];
    }

    public void id_class(rdn_3 rdn_32) {
        this.id_extends();
        rdn_3 rdn_33 = rdn_32;
        this.id_class[rrAB.id_throws[24]] = rdn_33;
    }

    public void id_class(float f) {
        this.id_extends();
        Float f2 = Float.valueOf(f);
        this.id_class[rrAB.id_throws[28]] = f2;
    }

    public boolean id_class(rdb_3 rdb_32) {
        this.id_extends();
        return ((rdn_3)this.id_class[id_throws[16]]).id_break() == rdb_32 || ((rdn_3)this.id_class[id_throws[17]]).id_break() == rdb_32 ? id_byte[1] : id_byte[2];
    }

    public void id_class(int n) {
        this.id_extends();
        Integer n2 = n;
        this.id_class[rrAB.id_throws[29]] = n2;
    }

    public static rrAB id_class(rdn_3 rdn_32, rdn_3 rdn_33, rpm_3 rpm_32, int n, float f, float f2) {
        rdn_3 rdn_34 = rdn_32;
        ((rrAB)rrAB.id_break[rrAB.id_throws[0]]).id_class[rrAB.id_throws[1]] = rdn_34;
        rdn_3 rdn_35 = rdn_33;
        ((rrAB)rrAB.id_break[rrAB.id_throws[2]]).id_class[rrAB.id_throws[3]] = rdn_35;
        rpm_3 rpm_33 = rpm_32;
        ((rrAB)rrAB.id_break[rrAB.id_throws[4]]).id_class[rrAB.id_throws[5]] = rpm_33;
        Integer n2 = n;
        ((rrAB)rrAB.id_break[rrAB.id_throws[6]]).id_class[rrAB.id_throws[7]] = n2;
        Float f3 = Float.valueOf(f);
        ((rrAB)rrAB.id_break[rrAB.id_throws[8]]).id_class[rrAB.id_throws[9]] = f3;
        Float f4 = Float.valueOf(f2);
        ((rrAB)rrAB.id_break[rrAB.id_throws[10]]).id_class[rrAB.id_throws[11]] = f4;
        ((rrAB)id_break[id_throws[12]]).id_class(id_byte[0]);
        return (rrAB)id_break[id_throws[13]];
    }

    public void id_class(rpm_3 rpm_32) {
        this.id_extends();
        rpm_3 rpm_33 = rpm_32;
        this.id_class[rrAB.id_throws[26]] = rpm_33;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE8CA6C9C;
    }

    public void id_break(rdn_3 rdn_32) {
        this.id_extends();
        rdn_3 rdn_33 = rdn_32;
        this.id_class[rrAB.id_throws[25]] = rdn_33;
    }

    public void id_break(float f) {
        this.id_extends();
        Float f2 = Float.valueOf(f);
        this.id_class[rrAB.id_throws[14]] = f2;
        Float f3 = Float.valueOf(f);
        this.id_class[rrAB.id_throws[15]] = f3;
    }

    public float id_break() {
        this.id_extends();
        return ((Float)this.id_class[id_throws[22]]).floatValue();
    }

    public rpm_3 id_throws() {
        this.id_extends();
        return (rpm_3)((Object)this.id_class[id_throws[20]]);
    }

    private static /* synthetic */ void ntfClinit() {
        rrAB.id_private();
        rrAB.id_volatile();
        rrAB.id_native();
        rrAB.id_implements();
        rrAB.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray = new Object[]{new rrAB()};
        id_break = objectArray;
    }

    public rdn_3 id_catch() {
        this.id_extends();
        return (rdn_3)this.id_class[id_throws[19]];
    }

    private void id_extends() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[rrAB.id_protected[1]] = Float.valueOf(id_case[0]);
            objectArray[rrAB.id_protected[2]] = Float.valueOf(id_case[1]);
            objectArray[rrAB.id_protected[3]] = id_byte[4];
        }
    }

    public float id_case() {
        this.id_extends();
        return ((Float)this.id_class[id_throws[21]]).floatValue();
    }

    private static void id_implements() {
        id_protected = new byte[]{6, 3, 4, 5};
    }

    public rdn_3 id_protected() {
        this.id_extends();
        return (rdn_3)this.id_class[id_throws[18]];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[5] = true;
        id_byte = blArray;
    }

    private static void id_volatile() {
        short[] sArray = new short[30];
        sArray[1] = 1;
        sArray[5] = 2;
        sArray[7] = 5;
        sArray[9] = 3;
        sArray[11] = 4;
        sArray[14] = 3;
        sArray[15] = 4;
        sArray[16] = 1;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[21] = 3;
        sArray[22] = 4;
        sArray[23] = 5;
        sArray[25] = 1;
        sArray[26] = 2;
        sArray[27] = 3;
        sArray[28] = 4;
        sArray[29] = 5;
        id_throws = sArray;
    }

    private static void id_native() {
        id_case = new float[2];
    }
}

