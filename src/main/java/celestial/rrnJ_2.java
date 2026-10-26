/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnJ_2 {
    public Object[] id_class;
    private static boolean[] id_byte;
    private static byte[] id_protected;
    public static Object[] id_break;
    private static short[] id_throws;
    private static float[] id_case;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[rrnJ_2.id_byte[1]] = Float.valueOf(id_case[0]);
        }
    }

    public rrnJ_2() {
        this.id_byte();
    }

    static {
        rrnJ_2.ntfClinit();
    }

    public static rrnJ_2 id_class(an_3 an_32, float f) {
        an_3 an_33 = an_32;
        ((rrnJ_2)rrnJ_2.id_break[rrnJ_2.id_throws[0]]).id_class[rrnJ_2.id_throws[1]] = an_33;
        Float f2 = Float.valueOf(f);
        ((rrnJ_2)rrnJ_2.id_break[rrnJ_2.id_throws[2]]).id_class[rrnJ_2.id_throws[3]] = f2;
        return (rrnJ_2)id_break[id_throws[4]];
    }

    public an_3 id_class() {
        return (an_3)this.id_class[id_throws[5]];
    }

    public void id_class(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rrnJ_2.id_throws[7]] = f2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-119, -55, 79, 66, 46, -1, -44, 11}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF913C0B7;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC9D3BC73A36B1C3AL;
    }

    public float id_break() {
        return ((Float)this.id_class[id_throws[6]]).floatValue();
    }

    private static void id_throws() {
        id_protected = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrnJ_2.id_catch();
        rrnJ_2.id_private();
        rrnJ_2.id_case();
        rrnJ_2.id_throws();
        rrnJ_2.id_protected();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    private static void id_case() {
        id_case = new float[1];
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrnJ_2()};
        id_break = objectArray;
    }

    private static void id_private() {
        short[] sArray = new short[8];
        sArray[3] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        id_throws = sArray;
    }
}

