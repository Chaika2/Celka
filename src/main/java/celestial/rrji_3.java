/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrfu_3;
import celestial.rrjD_2;
import celestial.rrja_3;
import celestial.rrtQ_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrji_3
implements rrja_3 {
    private static short[] id_class;
    private static String[] id_break;

    private static void id_byte() {
        short[] sArray = new short[14];
        sArray[1] = 2000;
        sArray[2] = 2000;
        sArray[4] = 2000;
        sArray[5] = 2000;
        sArray[7] = 2000;
        sArray[9] = 2000;
        sArray[11] = 2000;
        sArray[13] = 2000;
        id_class = sArray;
    }

    static {
        rrji_3.ntfClinit();
    }

    @Override
    public void id_class(rrjD_2 rrjD_22, boolean bl) {
        String string = "\u0412\u0435\u0439\u043f\u043e\u0438\u043d\u0442 " + this.id_break(rrjD_22) + (bl ? id_break[4] : id_break[5]);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[3]]).id_class(bl ? new rrtQ_2(id_break[6], string, (int)id_class[4]) : new rrtx_3(id_break[7], string, (int)id_class[5]));
        rrfu_3.id_byte(string);
    }

    @Override
    public void id_class() {
        String string = id_break[10];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[8]]).id_class(new rrtx_3(id_break[11], string, (int)id_class[9]));
        rrfu_3.id_byte(string);
    }

    @Override
    public void id_class(rrjD_2 rrjD_22) {
        String string = "\u0412\u0435\u0439\u043f\u043e\u0438\u043d\u0442 " + this.id_break(rrjD_22) + " \u043f\u0435\u0440\u0435\u0437\u0430\u043f\u0438\u0441\u0430\u043d";
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[12]]).id_class(new rrtQ_2(id_break[13], string, (int)id_class[13]));
        rrfu_3.id_byte(string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF5068D736DBA5CE7L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBAA6A031;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-111, -10, 28, 59, -107, -33, -92, -28}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(rrjD_2 rrjD_22, boolean bl) {
        String string = "\u0412\u0435\u0439\u043f\u043e\u0438\u043d\u0442 " + this.id_break(rrjD_22) + (bl ? id_break[0] : id_break[1]);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[0]]).id_class(bl ? new rrtQ_2(id_break[2], string, (int)id_class[1]) : new rrtx_3(id_break[3], string, (int)id_class[2]));
        rrfu_3.id_byte(string);
    }

    private String id_break(rrjD_2 rrjD_22) {
        return "'" + rrjD_22.id_byte() + "'";
    }

    private static void id_break() {
        id_break = new String[]{new String(" \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043e\u043a"), new String(" \u0443\u0436\u0435 \u0435\u0441\u0442\u044c \u0432 \u0441\u043f\u0438\u0441\u043a\u0435"), new String("Waypoints"), new String("Waypoints"), new String(" \u0443\u0434\u0430\u043b\u0451\u043d \u0438\u0437 \u0441\u043f\u0438\u0441\u043a\u0430"), new String(" \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043a\u0435"), new String("Waypoints"), new String("Waypoints"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u0432\u0435\u0439\u043f\u043e\u0438\u043d\u0442\u043e\u0432 \u043e\u0447\u0438\u0449\u0435\u043d"), new String("Waypoints"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u0432\u0435\u0439\u043f\u043e\u0438\u043d\u0442\u043e\u0432 \u043f\u0443\u0441\u0442"), new String("Waypoints"), new String("Waypoints"), new String("Waypoints")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrji_3.id_break();
        rrji_3.id_byte();
    }

    @Override
    public void id_super() {
        String string = id_break[8];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[6]]).id_class(new rrtQ_2(id_break[9], string, (int)id_class[7]));
        rrfu_3.id_byte(string);
    }

    @Override
    public void b_(String string) {
        String string2 = "'" + string + "' \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043a\u0435 \u0432\u0435\u0439\u043f\u043e\u0438\u043d\u0442\u043e\u0432";
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[10]]).id_class(new rrtx_3(id_break[12], string2, (int)id_class[11]));
        rrfu_3.id_byte(string2);
    }
}

