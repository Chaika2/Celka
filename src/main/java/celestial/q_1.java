/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.Y;
import celestial.rrIK;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class q_1 {
    private static short[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;

    private static void id_byte() {
        id_byte = new boolean[]{true};
    }

    public q_1(Y y) {
        this.id_protected();
        Y y2 = y;
        this.id_class[q_1.id_break[6]] = y2;
    }

    static {
        q_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1C4788625B8029CCL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{120, 89, -10, 123, 55, 84, -82, -45}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4DD6EC7A;
    }

    public Y id_class() {
        return (Y)((Object)this.id_class[id_break[4]]);
    }

    public static void id_class(Y y) {
        q_1 q_12 = new q_1(y);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[0]]).id_finally().id_class(q_12);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_break[1]]).id_class(q_12);
        if (y == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[2]])) {
            ((rrIK)((Object)rrIK.staticFields1247f214054b3fe790ff7a957ceb5ae0[id_break[3]])).id_class();
        }
    }

    public void id_break(Y y) {
        Y y2 = y;
        this.id_class[q_1.id_break[5]] = y2;
    }

    private static void id_break() {
        id_break = new short[7];
    }

    private static /* synthetic */ void ntfClinit() {
        q_1.id_byte();
        q_1.id_break();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }
}

