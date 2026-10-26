/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.cG_2;
import celestial.fZ_2;
import celestial.rrci_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruB
implements rrci_3 {
    public Object[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_break = new short[2];
    }

    public rruB() {
        this.id_break();
        Object var5_1 = null;
        this.id_class[rruB.id_break[0]] = var5_1;
    }

    static {
        rruB.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB1AA91EB;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{126, 91, -86, 48, -82, 94, 105, 2}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public boolean id_class() {
        return id_byte[0];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8266963270035398L;
    }

    @Override
    public Ok_1 id_class(Hx_1 hx_1, cG_2 cG_22) {
        return hx_1.getBuffer(HU.id_byte(cG_22.id_case()));
    }

    @Override
    public void id_class(cG_2 cG_22, int n, Iq_1 iq_1, Ml_1 ml_1, Hx_1 hx_1, int n2, int n3) {
        iq_1.id_class(ml_1, (Ok_1)this.id_class[id_break[1]], n2, fZ_2.id_class);
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rruB.id_protected();
        rruB.id_byte();
    }

    private static void id_protected() {
        id_byte = new boolean[]{true, true};
    }
}

