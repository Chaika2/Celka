/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.D;
import celestial.T;
import celestial.bj_3;
import celestial.rY_2;
import celestial.rm_3;
import celestial.rrQX;
import celestial.sA_2;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sn_3
implements D {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public sn_3(sA_2 sA_22, C_case c_case) {
        this.id_byte();
        C_case c_case2 = c_case;
        this.id_class[sn_3.id_byte[0]] = c_case2;
    }

    static {
        sn_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-37, -30, -7, -123, 5, 82, 39, -117}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x23B980F5B2035301L;
    }

    @Override
    public void id_class(T t) {
        rY_2 rY_22 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[1]]).id_private().id_finally().id_new();
        rm_3 rm_32 = ((C_case)this.id_class[id_byte[2]]).id_long();
        if (rY_22 == null || !rm_32.id_byte()) {
            return;
        }
        if (!((Boolean)C_class.id_instanceof().Pw.id_class[id_byte[3]]).booleanValue()) {
            return;
        }
        Color color = (Color)C_class.id_instanceof().id_try.id_class[id_byte[4]];
        float f = ((Float)C_class.id_instanceof().id_super.id_class[id_byte[5]]).floatValue();
        float f2 = ((Float)C_class.id_instanceof().PT.id_class[id_byte[6]]).floatValue();
        boolean bl = (Boolean)C_class.id_instanceof().id_package.id_class[id_byte[7]];
        bj_3.id_class(color, f, f2, bl);
        bj_3.id_class(t.id_byte(), rY_22.id_break());
        bj_3.id_class(bl);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5BCC4DE5;
    }

    private static void id_class() {
        id_byte = new short[8];
    }

    private static void id_break() {
        id_break = new boolean[]{true};
    }

    private static /* synthetic */ void ntfClinit() {
        sn_3.id_break();
        sn_3.id_class();
    }
}

