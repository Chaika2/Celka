/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.rruG;
import celestial.rrux_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruX
implements rruG {
    private static boolean[] id_break;
    public Object[] id_class;
    private static byte[] id_byte;
    private static float[] id_protected;
    private static short[] id_throws;

    @Override
    public float id_byte(float f) {
        return id_protected[4];
    }

    private static void id_byte() {
        id_protected = new float[5];
    }

    public rruX() {
        this.id_class();
        rrux_1 rrux_12 = new rrux_1(id_protected[0], id_protected[1]);
        this.id_class[rruX.id_throws[0]] = rrux_12;
        rrux_1 rrux_13 = new rrux_1(id_protected[2], id_protected[3]);
        this.id_class[rruX.id_throws[1]] = rrux_13;
    }

    static {
        rruX.ntfClinit();
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rruX.id_byte[1]] = id_break[0];
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{20, -100, -106, 17, -85, -100, -11, 109}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1988807D;
    }

    @Override
    public float id_class(float f) {
        return rfU_2.id_catch(f, ((Float)((rrux_1)this.id_class[rruX.id_throws[2]]).id_class[id_throws[3]]).floatValue(), ((Float)((rrux_1)this.id_class[rruX.id_throws[4]]).id_class[id_throws[5]]).floatValue());
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x89E8F4574FA3ADE9L;
    }

    private static void id_break() {
        short[] sArray = new short[10];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[9] = 1;
        id_throws = sArray;
    }

    private static void id_throws() {
        id_byte = new byte[]{3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rruX.id_protected();
        rruX.id_byte();
        rruX.id_break();
        rruX.id_throws();
    }

    private static void id_protected() {
        id_break = new boolean[1];
    }

    @Override
    public float id_protected(float f) {
        return rfU_2.id_catch(f, ((Float)((rrux_1)this.id_class[rruX.id_throws[6]]).id_class[id_throws[7]]).floatValue(), ((Float)((rrux_1)this.id_class[rruX.id_throws[8]]).id_class[id_throws[9]]).floatValue());
    }
}

