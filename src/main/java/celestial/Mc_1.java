/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ML;
import celestial.rfH_2;
import celestial.rw_3;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mc_1
implements rw_3 {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    @Override
    public int id_byte() {
        return ((ML)this.id_class[id_byte[4]]).id_class().id_byte();
    }

    public Mc_1(ML mL) {
        this.id_throws();
        ML mL2 = mL;
        this.id_class[Mc_1.id_byte[0]] = mL2;
    }

    static {
        Mc_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{74, 91, -18, -44, 83, 99, 26, 116}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x672115B6;
    }

    @Override
    public int id_class() {
        return ((ML)this.id_class[id_byte[3]]).id_class().id_break();
    }

    @Override
    public xc_3 id_class(int n, int n2, int n3) {
        return ((ML)this.id_class[id_byte[1]]).id_class().id_class(new rfH_2(n, n2, n3));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB2D2712D6EB40E67L;
    }

    @Override
    public xc_3 id_class(int n, int n2, int n3, xc_3 xc_32, List<xc_3> list) {
        return this.id_class(n, n2, n3);
    }

    @Override
    public int id_break() {
        return ((ML)this.id_class[id_byte[2]]).id_class().id_class();
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Mc_1.id_case();
        Mc_1.id_catch();
    }

    private static void id_catch() {
        id_byte = new short[5];
    }

    private static void id_case() {
        id_break = new boolean[]{true};
    }
}

