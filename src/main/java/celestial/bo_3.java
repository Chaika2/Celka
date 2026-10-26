/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.D;
import celestial.V;
import celestial.bY_2;
import celestial.j_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bo_3
implements D {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    private static void id_byte() {
        id_break = new boolean[]{true};
    }

    public bo_3(bY_2 bY_22) {
        this.id_class();
        bY_2 bY_23 = bY_22;
        this.id_class[bo_3.id_byte[0]] = bY_23;
    }

    static {
        bo_3.ntfClinit();
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x30EB7433;
    }

    @Override
    public void id_class(j_1 j_12) {
        if (j_12.id_class() == (V)((Object)V.staticFields30e1cd8580ce39faa61be3646b7cc079[id_byte[1]])) {
            ((bY_2)this.id_class[id_byte[2]]).id_volatile();
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-123, 10, -52, -113, 54, -43, 115, -78}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4762C6B6893C9DC3L;
    }

    private static void id_break() {
        id_byte = new short[3];
    }

    private static /* synthetic */ void ntfClinit() {
        bo_3.id_byte();
        bo_3.id_break();
    }
}

