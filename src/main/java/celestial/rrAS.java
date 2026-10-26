/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.Om_1;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAS
extends Om_1 {
    private static float[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;
    public static Object[] id_break;
    private static boolean[] id_throws;
    private static byte[] id_case;

    public rrAS() {
        this.id_finally();
    }

    static {
        rrAS.ntfClinit();
    }

    public void id_class(float f) {
        this.id_finally();
        Float f2 = Float.valueOf(f);
        this.id_class[rrAS.id_protected[15]] = f2;
    }

    public static rrAS id_class(float f, int n, float f2) {
        rrAS rrAS2 = rrAS.id_break(f, n, f2);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[8]]).id_finally().id_class(rrAS2);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[9]]).id_class(rrAS2);
        return rrAS2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x39AFE64166F9CF94L;
    }

    public float id_class() {
        this.id_finally();
        return ((Float)this.id_class[id_protected[12]]).floatValue();
    }

    public void id_class(int n) {
        this.id_finally();
        Integer n2 = n;
        this.id_class[rrAS.id_protected[14]] = n2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{8, -88, -23, 84, 88, -84, 3, -18}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrAS id_break(float f, int n, float f2) {
        Float f3 = Float.valueOf(f);
        ((rrAS)rrAS.id_break[rrAS.id_protected[0]]).id_class[rrAS.id_protected[1]] = f3;
        Integer n2 = n;
        ((rrAS)rrAS.id_break[rrAS.id_protected[2]]).id_class[rrAS.id_protected[3]] = n2;
        Float f4 = Float.valueOf(f2);
        ((rrAS)rrAS.id_break[rrAS.id_protected[4]]).id_class[rrAS.id_protected[5]] = f4;
        ((rrAS)id_break[id_protected[6]]).id_class(id_throws[0]);
        return (rrAS)id_break[id_protected[7]];
    }

    public int id_break() {
        this.id_finally();
        return (Integer)this.id_class[id_protected[11]];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE263A0C;
    }

    public void id_break(float f) {
        this.id_finally();
        Float f2 = Float.valueOf(f);
        this.id_class[rrAS.id_protected[13]] = f2;
    }

    private static void id_throws() {
        id_byte = new float[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrAS.id_private();
        rrAS.id_case();
        rrAS.id_throws();
        rrAS.id_catch();
        rrAS.id_implements();
    }

    private void id_finally() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_case[0]];
            objectArray[rrAS.id_throws[2]] = Float.valueOf(id_byte[0]);
            objectArray[rrAS.id_throws[3]] = id_throws[4];
            objectArray[rrAS.id_case[1]] = Float.valueOf(id_byte[1]);
        }
    }

    private static void id_catch() {
        id_case = new byte[]{3, 2};
    }

    private static void id_case() {
        short[] sArray = new short[16];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[14] = 1;
        sArray[15] = 2;
        id_protected = sArray;
    }

    private static void id_implements() {
        Object[] objectArray = new Object[]{new rrAS()};
        id_break = objectArray;
    }

    public float id_protected() {
        this.id_finally();
        return ((Float)this.id_class[id_protected[10]]).floatValue();
    }

    private static void id_private() {
        boolean[] blArray = new boolean[6];
        blArray[3] = true;
        blArray[5] = true;
        id_throws = blArray;
    }
}

