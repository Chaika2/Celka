/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Y;
import celestial.ruS_2;
import celestial.rud_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class y_1 {
    private static byte[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    public Y id_byte() {
        return (Y)((Object)this.id_class[id_byte[4]]);
    }

    public y_1(rud_3 rud_32, Y y, ruS_2<?> ruS_22) {
        ruS_2<?> ruS_23;
        this.id_throws();
        rud_3 rud_33 = rud_32;
        this.id_class[y_1.id_byte[0]] = rud_33;
        Y y2 = y;
        this.id_class[y_1.id_byte[1]] = y2;
        this.id_class[y_1.id_byte[2]] = ruS_23 = ruS_22;
    }

    static {
        y_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBBF4451C;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE287EE6F9F89EAB7L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-94, 6, 14, -15, -61, -68, -23, -75}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rud_3 id_class() {
        return (rud_3)((Object)this.id_class[id_byte[3]]);
    }

    public <T extends ruS_2<?>> T id_break() {
        return (T)((ruS_2)this.id_class[id_byte[6]]);
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        y_1.id_case();
        y_1.id_catch();
    }

    private static void id_catch() {
        id_break = new byte[]{3};
    }

    private static void id_case() {
        short[] sArray = new short[7];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 2;
        id_byte = sArray;
    }

    public ruS_2<?> id_protected() {
        return (ruS_2)this.id_class[id_byte[5]];
    }
}

