/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNj_1;
import celestial.rrfu_3;
import celestial.rrtQ_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNf_1
implements rrNj_1 {
    private static short[] id_class;
    private static String[] id_break;

    static {
        rrNf_1.ntfClinit();
    }

    @Override
    public void id_class(boolean bl) {
        rrNj_1.super.id_class(bl);
        String string = bl ? id_break[0] : id_break[1];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[0]]).id_class(bl ? new rrtQ_2(id_break[2], string, (int)id_class[1]) : new rrtx_3(id_break[3], string, (int)id_class[2]));
        rrfu_3.id_byte(string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-67, 117, 100, -20, 33, -103, -100, 62}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x63C54E9B3AC58081L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1FF90244;
    }

    private static void id_class() {
        id_break = new String[]{new String("\u0421\u043f\u0438\u0441\u043e\u043a \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432 \u0441\u043e\u0445\u0440\u0430\u043d\u0451\u043d"), new String("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0441\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432"), new String("Auto Buy"), new String("Auto Buy"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432 \u043e\u0431\u043d\u043e\u0432\u043b\u0451\u043d"), new String("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043e\u0431\u043d\u043e\u0432\u0438\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432"), new String("Auto Buy"), new String("Auto Buy")};
    }

    @Override
    public void id_break(boolean bl) {
        rrNj_1.super.id_break(bl);
        String string = bl ? id_break[4] : id_break[5];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[3]]).id_class(bl ? new rrtQ_2(id_break[6], string, (int)id_class[4]) : new rrtx_3(id_break[7], string, (int)id_class[5]));
        rrfu_3.id_byte(string);
    }

    private static void id_break() {
        short[] sArray = new short[6];
        sArray[1] = 2000;
        sArray[2] = 2000;
        sArray[4] = 2000;
        sArray[5] = 2000;
        id_class = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrNf_1.id_class();
        rrNf_1.id_break();
    }
}

