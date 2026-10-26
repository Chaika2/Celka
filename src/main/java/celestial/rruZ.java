/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrum_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruZ
implements rrum_1 {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;
    private static float[] id_protected;
    private static byte[] id_throws;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rruZ.id_break[0]] = Float.valueOf(id_protected[1]);
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rruZ(String string, float f) {
        this.id_byte();
        String string2 = string;
        this.id_class[rruZ.id_byte[0]] = string2;
        Float f2 = Float.valueOf(f);
        this.id_class[rruZ.id_byte[1]] = f2;
    }

    static {
        rruZ.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4CC6F737;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{67, 2, 24, 55, -15, -1, -30, -93}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public float id_class() {
        return ((Float)this.id_class[id_byte[3]]).floatValue() * id_protected[0];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC1B960CF4AE4ADB7L;
    }

    @Override
    public String id_break() {
        return (String)this.id_class[id_byte[2]];
    }

    private static void id_throws() {
        float[] fArray = new float[2];
        fArray[0] = 1000.0f;
        id_protected = fArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rruZ.id_protected();
        rruZ.id_catch();
        rruZ.id_throws();
        rruZ.id_case();
    }

    private static void id_catch() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_byte = sArray;
    }

    private static void id_case() {
        id_throws = new byte[]{2};
    }

    private static void id_protected() {
        id_break = new boolean[]{true};
    }
}

