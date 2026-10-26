/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.util.CreeperFarm;
import celestial.rrQX;
import celestial.rrfu_3;
import celestial.rrtQ_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.rrwK_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwo_3
implements rrwK_2 {
    private static String[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;

    @Override
    public void id_byte(String string) {
        this.id_class(string, id_class[0], id_break[0]);
    }

    private static void id_byte() {
        short[] sArray = new short[4];
        sArray[2] = 1500;
        sArray[3] = 1500;
        id_byte = sArray;
    }

    static {
        rrwo_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3A043015D75F3526L;
    }

    public void id_class(String string, String string2, boolean bl) {
        CreeperFarm creeperFarm = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[0]]).id_private().i();
        String string3 = "\u041a\u043e\u043d\u0444\u0438\u0433 " + this.id_case(string) + " " + string2;
        rrfu_3.id_byte(string3);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_byte[1]]).id_class(bl ? new rrtx_3(creeperFarm.id_final(), string3, (int)id_byte[2]) : new rrtQ_2(creeperFarm.id_final(), string3, (int)id_byte[3]));
    }

    @Override
    public void id_class(String string) {
        this.id_class(string, id_class[2], id_break[2]);
    }

    private static void id_class() {
        id_class = new String[]{new String("\u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d"), new String("\u0443\u0434\u0430\u043b\u0451\u043d"), new String("\u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d"), new String("\u0441\u043e\u0445\u0440\u0430\u043d\u0451\u043d"), new String("\u043d\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442")};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB78154A0;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[5];
        blArray[4] = true;
        id_break = blArray;
    }

    @Override
    public void id_break(String string) {
        this.id_class(string, id_class[4], id_break[4]);
    }

    @Override
    public void id_throws(String string) {
        this.id_class(string, id_class[1], id_break[1]);
    }

    private static /* synthetic */ void ntfClinit() {
        rrwo_3.id_break();
        rrwo_3.id_class();
        rrwo_3.id_byte();
    }

    public static String id_catch(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-76, -116, -33, 93, 55, 67, 123, -90}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_case(String string) {
        return "'" + string + "'";
    }

    @Override
    public void id_protected(String string) {
        this.id_class(string, id_class[3], id_break[3]);
    }
}

