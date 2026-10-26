/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rS_2;
import celestial.rfH_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bx_3
extends rS_2 {
    public Object[] id_break;
    private static boolean[] id_byte;
    private static float[] id_protected;
    private static byte[] id_throws;
    private static short[] id_case;

    public boolean id_byte() {
        this.id_throws();
        return (Boolean)this.id_break[id_case[2]];
    }

    public bx_3(rfH_2 rfH_22, float f, boolean bl) {
        super(rfH_22);
        this.id_throws();
        Float f2 = Float.valueOf(f);
        this.id_break[bx_3.id_case[0]] = f2;
        Boolean bl2 = bl;
        this.id_break[bx_3.id_case[1]] = bl2;
    }

    static {
        bx_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB0930210;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7315025C28F89EE2L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-108, -90, 6, 72, -42, 7, -38, 75}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
            objectArray[bx_3.id_byte[0]] = Float.valueOf(id_protected[0]);
            objectArray[bx_3.id_byte[1]] = id_byte[2];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        bx_3.id_catch();
        bx_3.id_case();
        bx_3.id_implements();
        bx_3.id_private();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static void id_case() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[2] = 1;
        id_case = sArray;
    }

    private static void id_implements() {
        id_protected = new float[1];
    }

    public float id_protected() {
        this.id_throws();
        return ((Float)this.id_break[id_case[3]]).floatValue();
    }

    private static void id_private() {
        id_throws = new byte[]{2};
    }
}

