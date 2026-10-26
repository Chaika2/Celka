/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.re_3;
import celestial.rl_3;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rp_3
extends rl_3 {
    private static short[] id_byte;
    public Object[] id_break;
    private static boolean[] id_protected;

    public rp_3(int n, int n2, int n3, re_3 re_32) {
        super(n, n2, n3);
        this.id_private();
        re_3 re_33 = re_32;
        this.id_break[rp_3.id_byte[0]] = re_33;
    }

    public rp_3(int n, int n2, int n3, xc_3 xc_32) {
        this(n, n2, n3, new re_3(xc_32.id_break()));
    }

    static {
        rp_3.ntfClinit();
    }

    @Override
    public xc_3 id_class(int n, int n2, int n3, xc_3 xc_32, List<xc_3> list) {
        this.id_private();
        if (((re_3)this.id_break[id_byte[2]]).id_class(xc_32)) {
            return xc_32;
        }
        for (xc_3 xc_33 : list) {
            if (!((re_3)this.id_break[id_byte[3]]).id_class(xc_33)) continue;
            return xc_33;
        }
        return ((re_3)this.id_break[id_byte[4]]).id_protected();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3EE210F593BBDC5AL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x539D91E;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{38, 94, 41, -114, -61, 21, 106, -110}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public re_3 id_throws() {
        this.id_private();
        return (re_3)this.id_break[id_byte[1]];
    }

    private static /* synthetic */ void ntfClinit() {
        rp_3.id_case();
        rp_3.id_catch();
    }

    private static void id_catch() {
        id_byte = new short[5];
    }

    private static void id_case() {
        id_protected = new boolean[]{true};
    }

    private void id_private() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[0]];
        }
    }
}

