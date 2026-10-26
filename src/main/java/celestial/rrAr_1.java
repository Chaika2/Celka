/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrLi_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class rrAr_1
extends rrLi_1 {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_break = new short[2];
    }

    public rrAr_1(int n) {
        this.id_throws();
        Integer n2 = n;
        this.id_class[rrAr_1.id_break[0]] = n2;
    }

    static {
        rrAr_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB99786ADB196AA62L;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x430C9FCD;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{122, -75, 48, 125, 80, 82, -28, 58}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public int id_break() {
        this.id_throws();
        return (Integer)this.id_class[id_break[1]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrAr_1.id_byte[1]] = id_byte[2];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrAr_1.id_protected();
        rrAr_1.id_byte();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        id_byte = blArray;
    }
}

