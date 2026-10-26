/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.GW;
import celestial.rE_2;
import celestial.rfH_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GN
extends rE_2 {
    private static boolean[] id_break;
    private static short[] id_byte;

    private static void id_byte() {
        id_break = new boolean[1];
    }

    public GN(GW gW, rfH_2 rfH_22) {
        super(rfH_22);
    }

    static {
        GN.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5BD8B324;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9F53E5FD163C2BBBL;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{8, 62, -127, -65, 76, -86, 96, 2}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        if (n2 > (Integer)this.id_class[id_byte[0]] || n == (Integer)this.id_class[id_byte[1]] && n2 == (Integer)this.id_class[id_byte[2]] && n3 == (Integer)this.id_class[id_byte[3]]) {
            return id_break[0];
        }
        return super.id_break(n, n2, n3);
    }

    private static /* synthetic */ void ntfClinit() {
        GN.id_byte();
        GN.id_protected();
    }

    private static void id_protected() {
        short[] sArray = new short[4];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 2;
        id_byte = sArray;
    }
}

