/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrfu_3;
import celestial.rrqJ_2;
import celestial.rrtQ_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqx_3
implements rrqJ_2 {
    private static String[] id_class;
    private static short[] id_break;

    private String id_byte(String string) {
        return "'" + string + "'";
    }

    @Override
    public void id_byte(String string, boolean bl) {
        String string2 = this.id_byte(string) + (bl ? id_class[0] : id_class[1]);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[0]]).id_class(bl ? new rrtQ_2(id_class[2], string2, (int)id_break[1]) : new rrtx_3(id_class[3], string2, (int)id_break[2]));
        rrfu_3.id_byte(string2);
    }

    private static void id_byte() {
        id_class = new String[]{new String(" \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043e\u043a \u043f\u0440\u0435\u0444\u0438\u043a\u0441\u043e\u0432"), new String(" \u0443\u0436\u0435 \u0435\u0441\u0442\u044c \u0432 \u0441\u043f\u0438\u0441\u043a\u0435 \u043f\u0440\u0435\u0444\u0438\u043a\u0441\u043e\u0432"), new String("Unique Prefix"), new String("Unique Prefix"), new String(" \u0443\u0434\u0430\u043b\u0451\u043d \u0438\u0437 \u0441\u043f\u0438\u0441\u043a\u0430 \u043f\u0440\u0435\u0444\u0438\u043a\u0441\u043e\u0432"), new String(" \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043a\u0435 \u043f\u0440\u0435\u0444\u0438\u043a\u0441\u043e\u0432"), new String("Unique Prefix"), new String("Unique Prefix"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u043f\u0440\u0435\u0444\u0438\u043a\u0441\u043e\u0432 \u043e\u0447\u0438\u0449\u0435\u043d"), new String("Unique Prefix"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u043f\u0440\u0435\u0444\u0438\u043a\u0441\u043e\u0432 \u043f\u0443\u0441\u0442"), new String("Unique Prefix"), new String("Unique Prefix"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u043f\u0440\u0435\u0444\u0438\u043a\u0441\u043e\u0432 \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u043f\u0435\u0440\u0435\u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d"), new String("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043f\u0435\u0440\u0435\u0437\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u043f\u0440\u0435\u0444\u0438\u043a\u0441\u043e\u0432"), new String("Unique Prefix"), new String("Unique Prefix")};
    }

    static {
        rrqx_3.ntfClinit();
    }

    @Override
    public void id_this() {
        String string = id_class[8];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[6]]).id_class(new rrtQ_2(id_class[9], string, (int)id_break[7]));
        rrfu_3.id_byte(string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1EDDB8DF;
    }

    @Override
    public void id_class() {
        String string = id_class[10];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[8]]).id_class(new rrtx_3(id_class[11], string, (int)id_break[9]));
        rrfu_3.id_byte(string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB5EB8AE4302E96A3L;
    }

    @Override
    public void id_break(String string, boolean bl) {
        String string2 = this.id_byte(string) + (bl ? id_class[4] : id_class[5]);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[3]]).id_class(bl ? new rrtQ_2(id_class[6], string2, (int)id_break[4]) : new rrtx_3(id_class[7], string2, (int)id_break[5]));
        rrfu_3.id_byte(string2);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{95, 87, -65, -102, -67, 76, 15, -61}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        short[] sArray = new short[15];
        sArray[1] = 2000;
        sArray[2] = 2000;
        sArray[4] = 2000;
        sArray[5] = 2000;
        sArray[7] = 2000;
        sArray[9] = 2000;
        sArray[11] = 2000;
        sArray[13] = 2000;
        sArray[14] = 2000;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrqx_3.id_byte();
        rrqx_3.id_break();
    }

    @Override
    public void e_(boolean bl) {
        String string = bl ? id_class[13] : id_class[14];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[12]]).id_class(bl ? new rrtQ_2(id_class[15], string, (int)id_break[13]) : new rrtx_3(id_class[16], string, (int)id_break[14]));
        rrfu_3.id_byte(string);
    }

    @Override
    public void c_(String string) {
        String string2 = this.id_byte(string) + " \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043a\u0435 \u043f\u0440\u0435\u0444\u0438\u043a\u0441\u043e\u0432";
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[10]]).id_class(new rrtx_3(id_class[12], string2, (int)id_break[11]));
        rrfu_3.id_byte(string2);
    }
}

