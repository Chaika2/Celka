/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rryF;
import celestial.rryk_1;
import celestial.rryv_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrym_1
extends rryv_1 {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;

    public rrym_1(rryk_1 rryk_12) {
        this.id_private();
        rryk_1 rryk_13 = rryk_12;
        this.id_class[rrym_1.id_break[2]] = rryk_13;
    }

    static {
        rrym_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB6FDDE13;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5DD1346728B8ED5AL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{105, -65, 30, -71, -64, -14, -88, -55}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public rryF id_class() {
        return (rryF)((Object)rryF.staticFieldsfd087588ab503ef5ba48903746a1e506[id_break[0]]);
    }

    public rryk_1 id_break() {
        this.id_private();
        return (rryk_1)this.id_class[id_break[1]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrym_1.id_case();
        rrym_1.id_catch();
    }

    private static void id_catch() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        id_break = sArray;
    }

    private static void id_case() {
        id_byte = new boolean[]{true};
    }

    private void id_private() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }
}

