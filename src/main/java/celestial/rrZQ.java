/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrZk_1;
import celestial.rrZz_1;
import celestial.rrfu_3;
import celestial.rrtQ_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZQ
implements rrZz_1 {
    private static short[] id_class;
    private static String[] id_break;

    @Override
    public void id_byte() {
        String string = id_break[10];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[8]]).id_class(new rrtx_3(id_break[11], string, (int)id_class[9]));
        rrfu_3.id_byte(string);
    }

    static {
        rrZQ.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x87A3E074;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF9D8C8A40B5B3DEL;
    }

    @Override
    public void id_class() {
        String string = id_break[13];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[12]]).id_class(new rrtx_3(id_break[14], string, (int)id_class[13]));
        rrfu_3.id_byte(string);
    }

    private String id_class(rrZk_1 rrZk_12) {
        return "'" + rrZk_12.id_class() + "'";
    }

    @Override
    public void id_class(String string) {
        String string2 = "'" + string + "' \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0434\u0440\u0443\u0437\u044c\u044f\u0445";
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[10]]).id_class(new rrtx_3(id_break[12], string2, (int)id_class[11]));
        rrfu_3.id_byte(string2);
    }

    @Override
    public void id_class(rrZk_1 rrZk_12, boolean bl) {
        String string = this.id_class(rrZk_12) + (bl ? id_break[0] : id_break[1]);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[0]]).id_class(bl ? new rrtQ_2(id_break[2], string, (int)id_class[1]) : new rrtx_3(id_break[3], string, (int)id_class[2]));
        rrfu_3.id_byte(string);
    }

    @Override
    public void id_break() {
        String string = id_break[8];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[6]]).id_class(new rrtQ_2(id_break[9], string, (int)id_class[7]));
        rrfu_3.id_byte(string);
    }

    @Override
    public void id_break(rrZk_1 rrZk_12, boolean bl) {
        String string = this.id_class(rrZk_12) + (bl ? id_break[4] : id_break[5]);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[3]]).id_class(bl ? new rrtQ_2(id_break[6], string, (int)id_class[4]) : new rrtx_3(id_break[7], string, (int)id_class[5]));
        rrfu_3.id_byte(string);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{33, -82, -47, -55, -21, 36, 77, -2}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_break = new String[]{new String(" \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d \u0432 \u0434\u0440\u0443\u0437\u044c\u044f"), new String(" \u0443\u0436\u0435 \u0435\u0441\u0442\u044c \u0432 \u0434\u0440\u0443\u0437\u044c\u044f\u0445"), new String("Friends"), new String("Friends"), new String(" \u0443\u0434\u0430\u043b\u0451\u043d \u0438\u0437 \u0434\u0440\u0443\u0437\u0435\u0439"), new String(" \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0434\u0440\u0443\u0437\u044c\u044f\u0445"), new String("Friends"), new String("Friends"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u0434\u0440\u0443\u0437\u0435\u0439 \u043e\u0447\u0438\u0449\u0435\u043d"), new String("Friends"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u0434\u0440\u0443\u0437\u0435\u0439 \u043f\u0443\u0441\u0442"), new String("Friends"), new String("Friends"), new String("\u041d\u0438\u043a \u0441\u043b\u0438\u0448\u043a\u043e\u043c \u043a\u043e\u0440\u043e\u0442\u043a\u0438\u0439 \u0438\u043b\u0438 \u0441\u043b\u0438\u0448\u043a\u043e\u043c \u0431\u043e\u043b\u044c\u0448\u043e\u0439"), new String("Friends"), new String("\u0412\u044b \u043d\u0435 \u043c\u043e\u0436\u0435\u0442\u0435 \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u0441\u0435\u0431\u044f \u0432 \u0434\u0440\u0443\u0437\u044c\u044f"), new String("Friends")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrZQ.id_throws();
        rrZQ.id_case();
    }

    private static void id_case() {
        short[] sArray = new short[16];
        sArray[1] = 2000;
        sArray[2] = 2000;
        sArray[4] = 2000;
        sArray[5] = 2000;
        sArray[7] = 2000;
        sArray[9] = 2000;
        sArray[11] = 2000;
        sArray[13] = 2000;
        sArray[15] = 2000;
        id_class = sArray;
    }

    @Override
    public void id_protected() {
        String string = id_break[15];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[14]]).id_class(new rrtx_3(id_break[16], string, (int)id_class[15]));
        rrfu_3.id_byte(string);
    }
}

