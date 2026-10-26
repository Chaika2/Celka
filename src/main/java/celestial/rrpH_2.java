/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.util.GriefJoiner;
import celestial.rrfq_3;
import celestial.rrpl_3;
import celestial.rrpn_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpH_2 {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;

    private static void id_byte() {
        id_break = new boolean[]{true};
    }

    public rrpH_2(GriefJoiner griefJoiner) {
        this.id_break();
        GriefJoiner griefJoiner2 = griefJoiner;
        this.id_class[rrpH_2.id_byte[0]] = griefJoiner2;
    }

    static {
        rrpH_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x22CDD94B1CFF66DL;
    }

    public Optional<rrpl_3> id_class(rrfq_3 rrfq_32) {
        if (rrfq_32 == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_byte[1]])) {
            return Optional.of(new rrpn_3((GriefJoiner)this.id_class[id_byte[2]]));
        }
        return Optional.empty();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x758785DC;
    }

    private static void id_class() {
        id_byte = new short[3];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-60, 40, 69, -98, 75, -61, -5, -117}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrpH_2.id_byte();
        rrpH_2.id_class();
    }
}

