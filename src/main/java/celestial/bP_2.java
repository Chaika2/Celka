/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.bM_2;
import celestial.bb_3;
import celestial.br_3;
import celestial.rVi_1;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bP_2
extends bM_2 {
    private static boolean[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;

    public bP_2(br_3 br_32, C_class c_class) {
        super(c_class);
        this.id_implements();
        br_3 br_33 = br_32;
        this.id_class[bP_2.id_protected[0]] = br_33;
    }

    static {
        bP_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x406DA31DBCB8F042L;
    }

    @Override
    public void id_class(bb_3 bb_32, rVi_1 rVi_12) {
        this.id_implements();
        super.id_class(bb_32, rVi_12);
        ((br_3)this.id_class[id_protected[1]]).id_protected();
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[2]]).id_private().id_static().id_class(rVi_12);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-65, -31, -36, 44, -107, 69, 2, -50}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x23D6E1CE;
    }

    private static /* synthetic */ void ntfClinit() {
        bP_2.id_finally();
        bP_2.id_private();
    }

    private static void id_finally() {
        id_byte = new boolean[]{true};
    }

    private void id_implements() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static void id_private() {
        id_protected = new short[3];
    }
}

