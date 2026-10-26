/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAH {
    public static Object[] id_class;
    public Object[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static byte[] id_throws;
    private static float[] id_case;

    public float id_byte() {
        return ((Float)this.id_break[id_byte[8]]).floatValue();
    }

    public rrAH() {
        this.id_case();
    }

    static {
        rrAH.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEEB9868777F5C447L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7738A992;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-93, 31, -57, 54, 1, 95, -102, -82}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_break[rrAH.id_byte[12]] = bl2;
    }

    public void id_class(float f) {
        Float f2 = Float.valueOf(f);
        this.id_break[rrAH.id_byte[10]] = f2;
    }

    public float id_class() {
        return ((Float)this.id_break[id_byte[7]]).floatValue();
    }

    public static rrAH id_class(float f, float f2, boolean bl) {
        Float f3 = Float.valueOf(f);
        ((rrAH)rrAH.id_class[rrAH.id_byte[0]]).id_break[rrAH.id_byte[1]] = f3;
        Float f4 = Float.valueOf(f2);
        ((rrAH)rrAH.id_class[rrAH.id_byte[2]]).id_break[rrAH.id_byte[3]] = f4;
        Boolean bl2 = bl;
        ((rrAH)rrAH.id_class[rrAH.id_byte[4]]).id_break[rrAH.id_byte[5]] = bl2;
        return (rrAH)id_class[id_byte[6]];
    }

    public boolean id_break() {
        return (Boolean)this.id_break[id_byte[9]];
    }

    public void id_break(float f) {
        Float f2 = Float.valueOf(f);
        this.id_break[rrAH.id_byte[11]] = f2;
    }

    private static void id_throws() {
        id_throws = new byte[]{3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrAH.id_implements();
        rrAH.id_private();
        rrAH.id_protected();
        rrAH.id_throws();
        rrAH.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new rrAH()};
        id_class = objectArray;
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
            objectArray[rrAH.id_protected[1]] = Float.valueOf(id_case[0]);
            objectArray[rrAH.id_protected[2]] = Float.valueOf(id_case[1]);
            objectArray[rrAH.id_throws[1]] = id_protected[3];
        }
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[5];
        blArray[2] = true;
        blArray[4] = true;
        id_protected = blArray;
    }

    private static void id_protected() {
        id_case = new float[2];
    }

    private static void id_private() {
        short[] sArray = new short[13];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[11] = 1;
        sArray[12] = 2;
        id_byte = sArray;
    }
}

