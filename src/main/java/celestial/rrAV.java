/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.an_3;
import celestial.tp_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAV {
    private static byte[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;
    public static Object[] id_break;
    private static boolean[] id_throws;
    private static float[] id_case;

    public float id_byte() {
        return ((Float)this.id_class[id_protected[12]]).floatValue();
    }

    public rrAV() {
        this.id_case();
    }

    static {
        rrAV.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8B6D6FC6F49C9332L;
    }

    public static rrAV id_class(an_3 an_32, tp_3<?> tp_32, Ml_1 ml_1, float f) {
        tp_3<?> tp_33;
        an_3 an_33 = an_32;
        ((rrAV)rrAV.id_break[rrAV.id_protected[0]]).id_class[rrAV.id_protected[1]] = an_33;
        ((rrAV)rrAV.id_break[rrAV.id_protected[2]]).id_class[rrAV.id_protected[3]] = tp_33 = tp_32;
        Ml_1 ml_12 = ml_1;
        ((rrAV)rrAV.id_break[rrAV.id_protected[4]]).id_class[rrAV.id_protected[5]] = ml_12;
        Float f2 = Float.valueOf(f);
        ((rrAV)rrAV.id_break[rrAV.id_protected[6]]).id_class[rrAV.id_protected[7]] = f2;
        return (rrAV)id_break[id_protected[8]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBC25B41F;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-4, 104, 107, -39, -52, -72, -69, -94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public tp_3<?> id_class() {
        return (tp_3)this.id_class[id_protected[10]];
    }

    public Ml_1 id_break() {
        return (Ml_1)this.id_class[id_protected[11]];
    }

    private static void id_throws() {
        short[] sArray = new short[13];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[7] = 3;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[12] = 3;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAV.id_implements();
        rrAV.id_throws();
        rrAV.id_private();
        rrAV.id_finally();
        rrAV.id_catch();
    }

    private static void id_finally() {
        id_byte = new byte[]{4, 3};
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new rrAV()};
        id_break = objectArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrAV.id_byte[1]] = Float.valueOf(id_case[0]);
        }
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_throws = blArray;
    }

    public an_3 id_protected() {
        return (an_3)this.id_class[id_protected[9]];
    }

    private static void id_private() {
        id_case = new float[1];
    }
}

