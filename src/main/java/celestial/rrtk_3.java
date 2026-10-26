/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVi_1;
import celestial.rgN_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrtW_2;
import celestial.rrtd_3;
import celestial.rrtz_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtk_3
extends rrtd_3 {
    private static short[] id_throws;
    private static boolean[] id_case;
    public Object[] id_protected;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{26, 57, 41, -102, 106, -112, -126, -47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrtk_3(String string, String string2, int n, rrtz_3 rrtz_32) {
        this(new rgN_2(string), (rVi_1)new rgN_2(string2), n, rrtz_32);
    }

    public rrtk_3(rVi_1 rVi_12, rVi_1 rVi_13, int n, rrtz_3 rrtz_32) {
        super(rVi_12, rVi_13, n);
        this.id_synchronized();
        rrtz_3 rrtz_33 = rrtz_32;
        this.id_protected[rrtk_3.id_throws[0]] = rrtz_33;
    }

    static {
        rrtk_3.ntfClinit();
    }

    private static void id_this() {
        id_case = new boolean[]{true};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAF2873A7;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x90758D46C8E202A9L;
    }

    @Override
    public rqA_2 id_throws() {
        this.id_synchronized();
        return switch (((int[])rrtW_2.id_class[id_throws[1]])[((rrtz_3)((Object)this.id_protected[id_throws[2]])).ordinal()]) {
            default -> throw new IncompatibleClassChangeError();
            case 1, 2 -> rqn_3.zh;
            case 3 -> rqn_3.zX;
        };
    }

    private static /* synthetic */ void ntfClinit() {
        rrtk_3.id_this();
        rrtk_3.id_else();
    }

    private static void id_else() {
        id_throws = new short[3];
    }

    private void id_synchronized() {
        if (this.id_protected == null) {
            Object[] objectArray = this.id_protected = new Object[id_case[0]];
        }
    }
}

