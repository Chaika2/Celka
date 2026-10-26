/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrfu_3;
import celestial.rrtQ_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.rrvm_1;
import celestial.rrvv_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvF
implements rrvv_1 {
    private static String[] id_class;
    private static short[] id_break;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-33, -77, -35, -27, 121, -101, -6, 32}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_byte() {
        String string = id_class[5];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[7]]).id_class(new rrtx_3(id_class[6], string, (int)id_break[8]));
        rrfu_3.id_byte(string);
    }

    static {
        rrvF.ntfClinit();
    }

    @Override
    public void id_class(rrvm_1 rrvm_12) {
        String string = this.id_protected(rrvm_12.id_byte());
        String string2 = "\u041c\u0430\u043a\u0440\u043e\u0441 " + string + " \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043e\u043a";
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[0]]).id_class(new rrtQ_2(id_class[0], string2, (int)id_break[1]));
        rrfu_3.id_byte(string2);
    }

    @Override
    public void id_class(String string) {
        String string2 = "\u041c\u0430\u043a\u0440\u043e\u0441 " + this.id_protected(string) + " \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d";
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[11]]).id_class(new rrtx_3(id_class[9], string2, (int)id_break[12]));
        rrfu_3.id_byte(string2);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x592B01BF;
    }

    @Override
    public void id_class() {
        String string = id_class[7];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[9]]).id_class(new rrtQ_2(id_class[8], string, (int)id_break[10]));
        rrfu_3.id_byte(string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x91A78E513197ED2AL;
    }

    @Override
    public void id_class(rrvm_1 rrvm_12, boolean bl) {
        String string = this.id_protected(rrvm_12.id_byte());
        String string2 = bl ? "\u041c\u0430\u043a\u0440\u043e\u0441 " + string + " \u0443\u0434\u0430\u043b\u0451\u043d \u0438\u0437 \u0441\u043f\u0438\u0441\u043a\u0430" : "\u041c\u0430\u043a\u0440\u043e\u0441 " + string + " \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043a\u0435";
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[2]]).id_class(bl ? new rrtQ_2(id_class[1], string2, (int)id_break[3]) : new rrtx_3(id_class[2], string2, (int)id_break[4]));
        rrfu_3.id_byte(string2);
    }

    @Override
    public void id_break(String string) {
        String string2 = "\u041c\u0430\u043a\u0440\u043e\u0441 " + this.id_protected(string) + " \u0443\u0436\u0435 \u0435\u0441\u0442\u044c \u0432 \u0441\u043f\u0438\u0441\u043a\u0435";
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[13]]).id_class(new rrtx_3(id_class[10], string2, (int)id_break[14]));
        rrfu_3.id_byte(string2);
    }

    @Override
    public void id_break() {
        String string = id_class[3];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[5]]).id_class(new rrtQ_2(id_class[4], string, (int)id_break[6]));
        rrfu_3.id_byte(string);
    }

    private static void id_throws() {
        id_class = new String[]{new String("Macro"), new String("Macro"), new String("Macro"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u043c\u0430\u043a\u0440\u043e\u0441\u043e\u0432 \u043e\u0447\u0438\u0449\u0435\u043d"), new String("Macro"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u043c\u0430\u043a\u0440\u043e\u0441\u043e\u0432 \u043f\u0443\u0441\u0442"), new String("Macro"), new String("\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u043a\u043b\u0430\u0432\u0438\u0448\u0443, \u043d\u0430 \u043a\u043e\u0442\u043e\u0440\u0443\u044e \u0445\u043e\u0442\u0438\u0442\u0435 \u043f\u0440\u0438\u0432\u044f\u0437\u0430\u0442\u044c \u043c\u0430\u043a\u0440\u043e\u0441"), new String("Macro"), new String("Macro"), new String("Macro")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrvF.id_throws();
        rrvF.id_protected();
    }

    private static void id_protected() {
        short[] sArray = new short[15];
        sArray[1] = 2000;
        sArray[3] = 2000;
        sArray[4] = 2000;
        sArray[6] = 2000;
        sArray[8] = 2000;
        sArray[10] = 2000;
        sArray[12] = 2000;
        sArray[14] = 2000;
        id_break = sArray;
    }

    private String id_protected(String string) {
        return "'" + string + "'";
    }
}

