/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LA;
import celestial.LF;
import celestial.LL;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rrNW;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNz_1
extends LF {
    private static short[] id_throws;
    public Object[] id_class;
    private static boolean[] id_case;
    private static String[] id_catch;

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x53C1D0C5;
    }

    public rrNz_1(rrNW rrNW2, int n, int n2, int n3, int n4, rgP_2 rgP_22, LL lL, LA lA) {
        super(n, n2, n3, n4, rgP_22, lL, lA);
        this.id_implements();
        rrNW rrNW3 = rrNW2;
        this.id_class[rrNz_1.id_throws[0]] = rrNW3;
    }

    static {
        rrNz_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9E56C9FC27BB86F0L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{17, 28, 37, 4, -79, -90, -115, 29}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrNz_1.id_extends();
        rrNz_1.id_private();
        rrNz_1.id_native();
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_case = blArray;
    }

    private void id_implements() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_case[2]];
        }
    }

    private static void id_private() {
        id_catch = new String[]{new String("autobuy.autoBuy"), new String("\u00a7aON"), new String("\u00a7cOFF")};
    }

    private static void id_native() {
        id_throws = new short[2];
    }

    @Override
    public rgP_2 C_() {
        this.id_implements();
        Object[] objectArray = new Object[id_case[0]];
        objectArray[rrNz_1.id_case[1]] = ((rrNW)this.id_class[id_throws[1]]).id_case() ? id_catch[1] : id_catch[2];
        return new rgn_3(id_catch[0], objectArray);
    }
}

