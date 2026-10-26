/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQX;
import celestial.rrQd_1;
import celestial.rrQt_1;
import celestial.rrQx_1;
import celestial.rrtQ_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQw_1
implements rrQt_1 {
    private static String[] id_class;
    private static short[] id_break;

    @Override
    public void id_byte() {
        String string = id_class[10];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[8]]).id_class(new rrtx_3(id_class[11], string, (int)id_break[9]));
    }

    static {
        rrQw_1.ntfClinit();
    }

    private String id_class(rrQx_1 rrQx_12) {
        return "'" + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[19]]).id_private().id_throws().id_break(rrQx_12.id_class()) + "'";
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8530D61AA39BE170L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCFCBEB03;
    }

    @Override
    public void id_class(rrQd_1 rrQd_12) {
        String string = "\u0410\u043a\u043a\u0430\u0443\u043d\u0442\u044b \u0441 \u0442\u0438\u043f\u043e\u043c '" + rrQd_12.id_class() + "' \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u044b";
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[15]]).id_class(new rrtx_3(id_class[15], string, (int)id_break[16]));
    }

    @Override
    public void id_class(rrQx_1 rrQx_12, boolean bl) {
        String string = this.id_class(rrQx_12) + (bl ? id_class[0] : id_class[1]);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[0]]).id_class(bl ? new rrtQ_2(id_class[2], string, (int)id_break[1]) : new rrtx_3(id_class[3], string, (int)id_break[2]));
    }

    @Override
    public void id_class() {
        String string = id_class[8];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[6]]).id_class(new rrtQ_2(id_class[9], string, (int)id_break[7]));
    }

    @Override
    public void id_class(String string) {
        String string2 = "'" + ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[10]]).id_private().id_throws().id_break(string) + "' \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043a\u0435 \u0430\u043a\u043a\u0430\u0443\u043d\u0442\u043e\u0432";
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[11]]).id_class(new rrtx_3(id_class[12], string2, (int)id_break[12]));
    }

    @Override
    public void id_break(rrQd_1 rrQd_12) {
        String string = "\u0412\u0441\u0435 \u0430\u043a\u043a\u0430\u0443\u043d\u0442\u044b \u0441 \u0442\u0438\u043f\u043e\u043c '" + rrQd_12.id_class() + "' \u0443\u0434\u0430\u043b\u0435\u043d\u044b";
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[17]]).id_class(new rrtQ_2(id_class[16], string, (int)id_break[18]));
    }

    @Override
    public void id_break(rrQx_1 rrQx_12, boolean bl) {
        String string = this.id_class(rrQx_12) + (bl ? id_class[4] : id_class[5]);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[3]]).id_class(bl ? new rrtQ_2(id_class[6], string, (int)id_break[4]) : new rrtx_3(id_class[7], string, (int)id_break[5]));
    }

    @Override
    public void id_break() {
        String string = id_class[13];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[13]]).id_class(new rrtx_3(id_class[14], string, (int)id_break[14]));
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-74, -116, 116, 15, 44, -77, -75, 41}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        short[] sArray = new short[20];
        sArray[1] = 2000;
        sArray[2] = 2000;
        sArray[4] = 2000;
        sArray[5] = 2000;
        sArray[7] = 2000;
        sArray[9] = 2000;
        sArray[12] = 2000;
        sArray[14] = 2000;
        sArray[16] = 2000;
        sArray[18] = 2000;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQw_1.id_protected();
        rrQw_1.id_throws();
    }

    private static void id_protected() {
        id_class = new String[]{new String(" \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043e\u043a \u0430\u043a\u043a\u0430\u0443\u043d\u0442\u043e\u0432"), new String(" \u0443\u0436\u0435 \u0435\u0441\u0442\u044c \u0432 \u0441\u043f\u0438\u0441\u043a\u0435 \u0430\u043a\u043a\u0430\u0443\u043d\u0442\u043e\u0432"), new String("Accounts"), new String("Accounts"), new String(" \u0443\u0434\u0430\u043b\u0451\u043d \u0438\u0437 \u0441\u043f\u0438\u0441\u043a\u0430 \u0430\u043a\u043a\u0430\u0443\u043d\u0442\u043e\u0432"), new String(" \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043a\u0435 \u0430\u043a\u043a\u0430\u0443\u043d\u0442\u043e\u0432"), new String("Accounts"), new String("Accounts"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u0430\u043a\u043a\u0430\u0443\u043d\u0442\u043e\u0432 \u043e\u0447\u0438\u0449\u0435\u043d"), new String("Accounts"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u0430\u043a\u043a\u0430\u0443\u043d\u0442\u043e\u0432 \u043f\u0443\u0441\u0442"), new String("Accounts"), new String("Accounts"), new String("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u0441\u043e\u0437\u0434\u0430\u0442\u044c \u0430\u043a\u043a\u0430\u0443\u043d\u0442"), new String("Accounts"), new String("Accounts"), new String("Accounts")};
    }
}

