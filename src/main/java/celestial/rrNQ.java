/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.LL;
import celestial.Qw_1;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rrNW;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNQ
extends LF {
    private static short[] id_class;
    private static boolean[] id_throws;
    private static String[] id_case;

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB66DE02;
    }

    public rrNQ(rrNW rrNW2, int n, int n2, int n3, int n4, rgP_2 rgP_22, LL lL) {
        super(n, n2, n3, n4, rgP_22, lL);
    }

    static {
        rrNQ.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE422C13204536D40L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{91, 29, -103, -12, -10, -111, 91, -111}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrNQ.id_implements();
        rrNQ.id_extends();
        rrNQ.id_private();
    }

    private static void id_extends() {
        id_case = new String[]{new String("autobuy.antiDelay"), new String("\u00a7aON"), new String("\u00a7cOFF")};
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_throws = blArray;
    }

    private static void id_private() {
        id_class = new short[]{20};
    }

    @Override
    public rgP_2 C_() {
        Object[] objectArray = new Object[id_throws[0]];
        objectArray[rrNQ.id_throws[1]] = ((Qw_1)MinecraftAccessor.id_import.id_class[rrNQ.id_class[0]]).rB ? id_case[1] : id_case[2];
        return new rgn_3(id_case[0], objectArray);
    }
}

