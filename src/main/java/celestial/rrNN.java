/*
 * Decompiled with CFR 0.152.
 */
package celestial;

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

public class rrNN
extends LF {
    private static boolean[] id_throws;
    private static short[] id_case;
    public Object[] id_class;
    private static String[] id_catch;

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x424AAB4E;
    }

    public rrNN(rrNW rrNW2, int n, int n2, int n3, int n4, rgP_2 rgP_22, LL lL) {
        super(n, n2, n3, n4, rgP_22, lL);
        this.id_private();
        rrNW rrNW3 = rrNW2;
        this.id_class[rrNN.id_case[0]] = rrNW3;
    }

    static {
        rrNN.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-102, 28, -109, -61, -31, 62, -85, -6}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x791CC998B545E158L;
    }

    private static /* synthetic */ void ntfClinit() {
        rrNN.id_native();
        rrNN.id_implements();
        rrNN.id_extends();
    }

    private static void id_extends() {
        id_case = new short[2];
    }

    private static void id_implements() {
        id_catch = new String[]{new String("autobuy.autoParsePrices"), new String("\u00a7aON"), new String("\u00a7cOFF")};
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[2]];
        }
    }

    private static void id_native() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[2] = true;
        id_throws = blArray;
    }

    @Override
    public rgP_2 C_() {
        this.id_private();
        Object[] objectArray = new Object[id_throws[0]];
        objectArray[rrNN.id_throws[1]] = ((rrNW)this.id_class[id_case[1]]).id_private() ? id_catch[1] : id_catch[2];
        return new rgn_3(id_catch[0], objectArray);
    }
}

