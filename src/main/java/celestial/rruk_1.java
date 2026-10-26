/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.rruG;
import celestial.rrub_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruk_1
implements rruG {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;
    private static float[] id_protected;
    private static byte[] id_throws;

    private static void id_byte() {
        short[] sArray = new short[14];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[13] = 2;
        id_byte = sArray;
    }

    @Override
    public float id_byte(float f) {
        return rfU_2.id_catch(f, ((Float)((rrub_1)this.id_class[rruk_1.id_byte[10]]).id_class[id_byte[11]]).floatValue(), ((Float)((rrub_1)this.id_class[rruk_1.id_byte[12]]).id_class[id_byte[13]]).floatValue());
    }

    public rruk_1() {
        this.id_protected();
        rrub_1 rrub_12 = new rrub_1(id_protected[0], id_protected[1], id_protected[2]);
        this.id_class[rruk_1.id_byte[0]] = rrub_12;
        rrub_1 rrub_13 = new rrub_1(id_protected[3], id_protected[4], id_protected[5]);
        this.id_class[rruk_1.id_byte[1]] = rrub_13;
    }

    static {
        rruk_1.ntfClinit();
    }

    @Override
    public float id_class(float f) {
        return rfU_2.id_catch(f, ((Float)((rrub_1)this.id_class[rruk_1.id_byte[2]]).id_class[id_byte[3]]).floatValue(), ((Float)((rrub_1)this.id_class[rruk_1.id_byte[4]]).id_class[id_byte[5]]).floatValue());
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{50, 116, 64, -127, 91, -105, -119, 15}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x70A735DB;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x865ED91CDF856CEEL;
    }

    private static void id_class() {
        id_throws = new byte[]{3, 2};
    }

    private static void id_break() {
        id_protected = new float[6];
    }

    private static void id_throws() {
        id_break = new boolean[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rruk_1.id_throws();
        rruk_1.id_break();
        rruk_1.id_byte();
        rruk_1.id_class();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rruk_1.id_throws[1]] = id_break[0];
        }
    }

    @Override
    public float id_protected(float f) {
        return rfU_2.id_catch(f, ((Float)((rrub_1)this.id_class[rruk_1.id_byte[6]]).id_class[id_byte[7]]).floatValue(), ((Float)((rrub_1)this.id_class[rruk_1.id_byte[8]]).id_class[id_byte[9]]).floatValue());
    }
}

