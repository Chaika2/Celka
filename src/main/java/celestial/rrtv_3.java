/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQK;
import celestial.rrtF_2;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtv_3 {
    private static byte[] id_break;
    public Object[] id_class;
    private static float[] id_byte;
    private static short[] id_protected;

    private static void id_byte() {
        short[] sArray = new short[6];
        sArray[2] = 1;
        sArray[4] = 1;
        id_protected = sArray;
    }

    public rrtv_3(rrQK rrQK2, float f, boolean bl) {
        this.id_throws();
        AnimValue animValue = new AnimValue(rrQK2, f, bl);
        this.id_class[rrtv_3.id_protected[2]] = animValue;
        rrtF_2 rrtF_22 = new rrtF_2();
        this.id_class[rrtv_3.id_protected[3]] = rrtF_22;
    }

    public rrtv_3(float f, boolean bl) {
        this((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_protected[1]]), f, bl);
    }

    public rrtv_3(boolean bl) {
        this((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_protected[0]]), id_byte[0], bl);
    }

    static {
        rrtv_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8CE9BC6D;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC8B064F2DBB7B630L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-52, 33, 71, -63, -48, 7, -9, -42}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public AnimValue id_class() {
        return (AnimValue)this.id_class[id_protected[4]];
    }

    public rrtF_2 id_break() {
        return (rrtF_2)this.id_class[id_protected[5]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrtv_3.id_byte();
        rrtv_3.id_protected();
        rrtv_3.id_case();
    }

    private static void id_case() {
        id_break = new byte[]{2};
    }

    private static void id_protected() {
        id_byte = new float[]{0.5f};
    }
}

