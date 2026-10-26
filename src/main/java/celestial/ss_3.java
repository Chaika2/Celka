/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_for;
import celestial.C_static;
import celestial.F;
import celestial.sS_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ss_3
implements C_for {
    private static boolean[] id_break;
    public Object[] id_class;
    private static short[] id_byte;

    public sS_2 id_byte() {
        return (sS_2)this.id_class[id_byte[3]];
    }

    public ss_3(sS_2 sS_22) {
        this.id_protected();
        sS_2 sS_23 = sS_22;
        this.id_class[ss_3.id_byte[0]] = sS_23;
    }

    static {
        ss_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-69, 30, 125, 26, -87, -75, 8, -105}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x919A9B590CA6FEC6L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1C805ACA;
    }

    @Override
    public /* synthetic */ C_static id_class() {
        return this.id_byte();
    }

    @Override
    public C_case id_break() {
        return ((F)((sS_2)this.id_class[ss_3.id_byte[1]]).id_class[id_byte[2]]).id_break();
    }

    private static void id_throws() {
        id_byte = new short[4];
    }

    private static /* synthetic */ void ntfClinit() {
        ss_3.id_case();
        ss_3.id_throws();
    }

    private static void id_case() {
        id_break = new boolean[]{true};
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }
}

