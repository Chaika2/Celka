/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrfu_3;
import celestial.rrqO_2;
import celestial.rrtQ_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqh_3
implements rrqO_2 {
    private static String[] id_class;
    private static short[] id_break;

    private String id_byte(String string) {
        return "'" + string + "'";
    }

    static {
        rrqh_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x39A1B289D8A638ABL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAB914726;
    }

    @Override
    public void id_class(String string, boolean bl) {
        String string2 = this.id_byte(string) + (bl ? id_class[4] : id_class[5]);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[3]]).id_class(bl ? new rrtQ_2(id_class[6], string2, (int)id_break[4]) : new rrtx_3(id_class[7], string2, (int)id_break[5]));
        rrfu_3.id_byte(string2);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{68, 80, -37, 89, 114, 97, -23, 59}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break() {
        String string = id_class[10];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[8]]).id_class(new rrtx_3(id_class[11], string, (int)id_break[9]));
        rrfu_3.id_byte(string);
    }

    private static void id_throws() {
        id_class = new String[]{new String(" \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043e\u043a \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430"), new String(" \u0443\u0436\u0435 \u0435\u0441\u0442\u044c \u0432 \u0441\u043f\u0438\u0441\u043a\u0435 \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430"), new String("Unique Staff"), new String("Unique Staff"), new String(" \u0443\u0434\u0430\u043b\u0451\u043d \u0438\u0437 \u0441\u043f\u0438\u0441\u043a\u0430 \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430"), new String(" \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043a\u0435 \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430"), new String("Unique Staff"), new String("Unique Staff"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430 \u043e\u0447\u0438\u0449\u0435\u043d"), new String("Unique Staff"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430 \u043f\u0443\u0441\u0442"), new String("Unique Staff"), new String("Unique Staff"), new String("\u041d\u0438\u043a \u0441\u043b\u0438\u0448\u043a\u043e\u043c \u043a\u043e\u0440\u043e\u0442\u043a\u0438\u0439 \u0438\u043b\u0438 \u0441\u043b\u0438\u0448\u043a\u043e\u043c \u0431\u043e\u043b\u044c\u0448\u043e\u0439"), new String("Unique Staff"), new String("\u0412\u044b \u043d\u0435 \u043c\u043e\u0436\u0435\u0442\u0435 \u0434\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u0441\u0435\u0431\u044f \u0432 \u0441\u043f\u0438\u0441\u043e\u043a \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430"), new String("Unique Staff"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430 \u043e\u0431\u043d\u043e\u0432\u043b\u0451\u043d"), new String("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043e\u0431\u043d\u043e\u0432\u0438\u0442\u044c \u0441\u043f\u0438\u0441\u043e\u043a \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430"), new String("Unique Staff"), new String("Unique Staff")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrqh_3.id_throws();
        rrqh_3.id_protected();
    }

    @Override
    public void id_continue() {
        String string = id_class[8];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[6]]).id_class(new rrtQ_2(id_class[9], string, (int)id_break[7]));
        rrfu_3.id_byte(string);
    }

    private static void id_protected() {
        short[] sArray = new short[19];
        sArray[1] = 2000;
        sArray[2] = 2000;
        sArray[4] = 2000;
        sArray[5] = 2000;
        sArray[7] = 2000;
        sArray[9] = 2000;
        sArray[11] = 2000;
        sArray[13] = 2000;
        sArray[15] = 2000;
        sArray[17] = 2000;
        sArray[18] = 2000;
        id_break = sArray;
    }

    @Override
    public void d_(String string) {
        String string2 = "'" + string + "' \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043a\u0435 \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430";
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[10]]).id_class(new rrtx_3(id_class[12], string2, (int)id_break[11]));
        rrfu_3.id_byte(string2);
    }

    @Override
    public void d_(String string, boolean bl) {
        String string2 = this.id_byte(string) + (bl ? id_class[0] : id_class[1]);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[0]]).id_class(bl ? new rrtQ_2(id_class[2], string2, (int)id_break[1]) : new rrtx_3(id_class[3], string2, (int)id_break[2]));
        rrfu_3.id_byte(string2);
    }

    @Override
    public void f_(boolean bl) {
        String string = bl ? id_class[17] : id_class[18];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[16]]).id_class(bl ? new rrtQ_2(id_class[19], string, (int)id_break[17]) : new rrtx_3(id_class[20], string, (int)id_break[18]));
        rrfu_3.id_byte(string);
    }

    @Override
    public void aN_() {
        String string = id_class[15];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[14]]).id_class(new rrtx_3(id_class[16], string, (int)id_break[15]));
        rrfu_3.id_byte(string);
    }

    @Override
    public void aM_() {
        String string = id_class[13];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[12]]).id_class(new rrtx_3(id_class[14], string, (int)id_break[13]));
        rrfu_3.id_byte(string);
    }
}

