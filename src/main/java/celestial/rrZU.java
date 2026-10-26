/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrIX;
import celestial.rrZp_1;
import celestial.rrtQ_2;
import celestial.rrth_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZU
implements rrZp_1 {
    private static short[] id_class;
    private static String[] id_break;

    @Override
    public void id_byte(rrIX rrIX2) {
        this.id_class(rrIX2, id_break[1]);
    }

    static {
        rrZU.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{107, 39, 15, -46, -21, -88, -74, 28}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1325868B;
    }

    public void id_class(rrIX rrIX2, String string) {
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[0]]).id_class(new rrtQ_2(id_break[4], "\u041a\u043e\u043d\u0444\u0438\u0433 " + this.id_throws(rrIX2) + " " + string, (int)id_class[1]));
    }

    private static void id_class() {
        short[] sArray = new short[2];
        sArray[1] = 1500;
        id_class = sArray;
    }

    @Override
    public void id_class(rrIX rrIX2) {
        this.id_class(rrIX2, id_break[3]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA2B680C1B8CF453CL;
    }

    private static void id_break() {
        id_break = new String[]{new String("\u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d"), new String("\u0443\u0434\u0430\u043b\u0451\u043d"), new String("\u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d"), new String("\u0441\u043e\u0445\u0440\u0430\u043d\u0451\u043d"), new String("Configs")};
    }

    @Override
    public void id_break(rrIX rrIX2) {
        this.id_class(rrIX2, id_break[2]);
    }

    public String id_throws(rrIX rrIX2) {
        return "'" + rrIX2.id_class() + "'";
    }

    private static /* synthetic */ void ntfClinit() {
        rrZU.id_break();
        rrZU.id_class();
    }

    @Override
    public void id_protected(rrIX rrIX2) {
        this.id_class(rrIX2, id_break[0]);
    }
}

