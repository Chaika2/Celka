/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Ps_1;
import celestial.Pv_1;
import celestial.rrFK;
import celestial.rrfp_3;
import celestial.rrfq_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrwk_3
extends Pv_1 {
    public Object[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;

    public abstract rrfq_3 id_byte();

    public rrwk_3(C_class c_class) {
        super(c_class);
        this.id_protected();
    }

    static {
        rrwk_3.ntfClinit();
    }

    public void id_class(boolean bl) {
        this.id_protected();
        Boolean bl2 = bl;
        this.id_break[rrwk_3.id_byte[4]] = bl2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x960DFF8B8CD40DEFL;
    }

    @Override
    public void id_class(rrFK rrFK2) {
        this.id_class(id_protected[2]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD7BAEACF;
    }

    public boolean id_class() {
        this.id_protected();
        return (Boolean)this.id_break[id_byte[3]];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-101, -48, 21, 47, -5, 59, -71, 94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_break() {
        this.id_protected();
        return (Boolean)this.id_break[id_byte[0]] == false && !((Ps_1)this.id_class[id_byte[1]]).id_throws().id_finally() && (rrfq_3)((Object)rrfp_3.id_class[id_byte[2]]) == this.id_byte() ? id_protected[0] : id_protected[1];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrwk_3.id_throws();
        rrwk_3.id_case();
    }

    private static void id_case() {
        short[] sArray = new short[5];
        sArray[1] = 1;
        sArray[2] = 1;
        id_byte = sArray;
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[3]];
            objectArray[rrwk_3.id_protected[4]] = id_protected[5];
        }
    }
}

