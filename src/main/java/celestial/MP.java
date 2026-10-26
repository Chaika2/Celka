/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.C_throws;
import celestial.GO;
import celestial.a_1;
import celestial.bw_3;
import celestial.rP_2;
import celestial.rfH_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class MP
implements a_1 {
    private static short[] id_class;
    private static boolean[] id_break;

    static {
        MP.ntfClinit();
    }

    @Override
    public /* synthetic */ a_1 id_class(Object object) {
        return this.id_break(object);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x46806E78CAAA2D44L;
    }

    @Override
    public /* synthetic */ a_1 id_class(rP_2 rP_22) {
        return this.id_break(rP_22);
    }

    public MP id_break(Object object) {
        if (!((Boolean)C_class.id_instanceof().id_return.id_class[id_class[0]]).booleanValue()) {
            return this;
        }
        bw_3 bw_32 = (bw_3)object;
        for (int i = id_break[0]; i < this.id_break().size(); ++i) {
            rfH_2 rfH_22 = this.id_break().get(i);
            if (bw_32.id_class(rfH_22.b_(), rfH_22.d_())) continue;
            return new GO(this, i);
        }
        return this;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-75, -15, -33, -59, 109, 33, -114, -114}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x21211EF7;
    }

    public MP id_break(rP_2 rP_22) {
        int n = (Integer)C_throws.id_break().ra.id_class[id_class[1]];
        if (this.id_class() < n) {
            return this;
        }
        if (rP_22 == null || rP_22.id_break(this.id_protected())) {
            return this;
        }
        double d = (Double)C_throws.id_break().id_final.id_class[id_class[2]];
        int n2 = (int)((double)(this.id_class() - n) * d) + n - id_break[1];
        return new GO(this, n2);
    }

    private static /* synthetic */ void ntfClinit() {
        MP.id_extends();
        MP.id_finally();
    }

    private static void id_finally() {
        id_class = new short[3];
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_break = blArray;
    }
}

