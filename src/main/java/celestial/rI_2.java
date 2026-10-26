/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rl_3;
import celestial.rq_3;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rI_2
extends rl_3 {
    public Object[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;

    public rI_2(rq_3 rq_32) {
        super(rq_32.id_break(), rq_32.id_class(), rq_32.id_byte());
        this.id_case();
        rq_3 rq_33 = rq_32;
        this.id_break[rI_2.id_byte[0]] = rq_33;
    }

    static {
        rI_2.ntfClinit();
    }

    @Override
    public xc_3 id_class(int n, int n2, int n3, xc_3 xc_32, List<xc_3> list) {
        this.id_case();
        return ((rq_3)this.id_break[id_byte[2]]).id_class(n, n2, n3, xc_32, list);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x65C3A5BD;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCDB50868F4D301CFL;
    }

    @Override
    public boolean id_class(int n, int n2, int n3, xc_3 xc_32) {
        this.id_case();
        return ((rq_3)this.id_break[id_byte[1]]).id_class(n, n2, n3, xc_32) && this.id_break(n, n2, n3, xc_32) ? id_protected[0] : id_protected[1];
    }

    public abstract boolean id_break(int var1, int var2, int var3, xc_3 var4);

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-62, 100, -1, -52, -118, -98, 40, 47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_byte = new short[3];
    }

    private static /* synthetic */ void ntfClinit() {
        rI_2.id_catch();
        rI_2.id_throws();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_protected = blArray;
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[2]];
        }
    }
}

