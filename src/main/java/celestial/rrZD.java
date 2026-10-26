/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrIX;
import celestial.rrZa_1;
import celestial.rrZp_1;
import celestial.rrZw_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZD
implements rrZp_1 {
    private static short[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    private static float[] id_throws;

    private static void id_byte() {
        short[] sArray = new short[12];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 4;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 3;
        sArray[9] = 4;
        id_break = sArray;
    }

    @Override
    public void id_byte(rrIX rrIX2) {
        ((rrZw_1)this.id_class[id_break[11]]).id_break(rrIX2.id_class());
    }

    public rrZD(rrZw_1 rrZw_12, Supplier<Float> supplier, Supplier<Float> supplier2, float f, float f2) {
        Supplier<Float> supplier3;
        Supplier<Float> supplier4;
        this.id_throws();
        rrZw_1 rrZw_13 = rrZw_12;
        this.id_class[rrZD.id_break[0]] = rrZw_13;
        this.id_class[rrZD.id_break[1]] = supplier4 = supplier;
        this.id_class[rrZD.id_break[2]] = supplier3 = supplier2;
        Float f3 = Float.valueOf(f);
        this.id_class[rrZD.id_break[3]] = f3;
        Float f4 = Float.valueOf(f2);
        this.id_class[rrZD.id_break[4]] = f4;
    }

    static {
        rrZD.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE73623D5;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2E5EECE7DCF02415L;
    }

    private static void id_class() {
        id_protected = new boolean[1];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{31, -116, -127, 95, -103, 122, -51, 14}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_throws = new float[2];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrZD.id_byte[1]] = Float.valueOf(id_throws[0]);
            objectArray[rrZD.id_byte[2]] = Float.valueOf(id_throws[1]);
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrZD.id_class();
        rrZD.id_byte();
        rrZD.id_break();
        rrZD.id_protected();
    }

    @Override
    public void id_protected(rrIX rrIX2) {
        rrZa_1 rrZa_12 = new rrZa_1((rrZw_1)this.id_class[id_break[5]], rrIX2, (Supplier)this.id_class[id_break[6]], (Supplier)this.id_class[id_break[7]], ((Float)this.id_class[id_break[8]]).floatValue(), ((Float)this.id_class[id_break[9]]).floatValue());
        ((rrZw_1)this.id_class[id_break[10]]).id_class(id_protected[0], rrZa_12);
    }

    private static void id_protected() {
        id_byte = new byte[]{5, 3, 4};
    }
}

