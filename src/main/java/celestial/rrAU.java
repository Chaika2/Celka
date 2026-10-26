/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rjV_2;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAU {
    private static boolean[] id_byte;
    private static float[] id_protected;
    private static byte[] id_throws;
    public static Object[] id_class;
    public Object[] id_break;
    private static short[] id_case;

    public float id_byte() {
        return ((Float)this.id_break[id_case[10]]).floatValue();
    }

    public rrAU() {
        this.id_protected();
    }

    static {
        rrAU.ntfClinit();
    }

    public static void id_class(Ml_1 ml_1, rjV_2 rjV_22, float f) {
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[7]]).id_finally().id_class(rrAU.id_break(ml_1, rjV_22, f));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7C7BED46;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-87, -25, -73, 64, 86, -121, -10, -91}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCD4576F45FAF845L;
    }

    public rjV_2 id_class() {
        return (rjV_2)this.id_break[id_case[9]];
    }

    public static rrAU id_break(Ml_1 ml_1, rjV_2 rjV_22, float f) {
        Ml_1 ml_12 = ml_1;
        ((rrAU)rrAU.id_class[rrAU.id_case[0]]).id_break[rrAU.id_case[1]] = ml_12;
        rjV_2 rjV_23 = rjV_22;
        ((rrAU)rrAU.id_class[rrAU.id_case[2]]).id_break[rrAU.id_case[3]] = rjV_23;
        Float f2 = Float.valueOf(f);
        ((rrAU)rrAU.id_class[rrAU.id_case[4]]).id_break[rrAU.id_case[5]] = f2;
        return (rrAU)id_class[id_case[6]];
    }

    public Ml_1 id_break() {
        return (Ml_1)this.id_break[id_case[8]];
    }

    private static void id_throws() {
        short[] sArray = new short[11];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[9] = 1;
        sArray[10] = 2;
        id_case = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAU.id_private();
        rrAU.id_throws();
        rrAU.id_case();
        rrAU.id_catch();
        rrAU.id_implements();
    }

    private static void id_catch() {
        id_throws = new byte[]{3, 2};
    }

    private static void id_case() {
        id_protected = new float[1];
    }

    private static void id_implements() {
        Object[] objectArray = new Object[]{new rrAU()};
        id_class = objectArray;
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
            objectArray[rrAU.id_throws[1]] = Float.valueOf(id_protected[0]);
        }
    }

    private static void id_private() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }
}

