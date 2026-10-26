/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrfu_3;
import celestial.rrqU_2;
import celestial.rrqe_3;
import celestial.rrtQ_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.u_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqa_3
implements rrqe_3 {
    private static String[] id_class;
    private static short[] id_break;

    private static void id_byte() {
        id_class = new String[]{new String(" \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043e\u043a"), new String(" \u0443\u0436\u0435 \u0435\u0441\u0442\u044c \u0432 \u0441\u043f\u0438\u0441\u043a\u0435"), new String("Block ESP"), new String("Block ESP"), new String("Block not found"), new String("Block ESP"), new String(" \u0443\u0434\u0430\u043b\u0451\u043d \u0438\u0437 \u0441\u043f\u0438\u0441\u043a\u0430"), new String(" \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043a\u0435"), new String("Block ESP"), new String("Block ESP"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u0431\u043b\u043e\u043a\u043e\u0432 \u043e\u0447\u0438\u0449\u0435\u043d"), new String("Block ESP"), new String("\u0421\u043f\u0438\u0441\u043e\u043a \u0431\u043b\u043e\u043a\u043e\u0432 \u043f\u0443\u0441\u0442"), new String("Block ESP"), new String("Block ESP")};
    }

    static {
        rrqa_3.ntfClinit();
    }

    @Override
    public void id_class(String string, Exception exception) {
        u_1 u_12;
        String string2 = "'" + string + "'";
        String string3 = "\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0438\u0438 " + string2;
        if (exception instanceof u_1 && (u_12 = (u_1)exception).getMessage().equals(id_class[4])) {
            string3 = "\u0411\u043b\u043e\u043a " + string2 + " \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0438\u043b\u0438 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0432\u043e\u0437\u0434\u0443\u0445\u043e\u043c";
        }
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[3]]).id_class(new rrtx_3(id_class[5], string3, (int)id_break[4]));
        rrfu_3.id_byte(string3);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC958591FC0F0996DL;
    }

    public String id_class(rrqU_2 rrqU_22) {
        return "'" + rrqU_22.id_break().id_native().getString() + "'";
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9084F87F;
    }

    @Override
    public void id_class(rrqU_2 rrqU_22, boolean bl) {
        String string = this.id_class(rrqU_22) + (bl ? id_class[6] : id_class[7]);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[5]]).id_class(bl ? new rrtQ_2(id_class[8], string, (int)id_break[6]) : new rrtx_3(id_class[9], string, (int)id_break[7]));
        rrfu_3.id_byte(string);
    }

    @Override
    public void id_class() {
        String string = id_class[12];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[10]]).id_class(new rrtx_3(id_class[13], string, (int)id_break[11]));
        rrfu_3.id_byte(string);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{24, -126, -99, -13, -64, 19, 6, -126}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        short[] sArray = new short[14];
        sArray[1] = 2000;
        sArray[2] = 2000;
        sArray[4] = 2000;
        sArray[6] = 2000;
        sArray[7] = 2000;
        sArray[9] = 2000;
        sArray[11] = 2000;
        sArray[13] = 2000;
        id_break = sArray;
    }

    @Override
    public void id_break(rrqU_2 rrqU_22, boolean bl) {
        String string = this.id_class(rrqU_22) + (bl ? id_class[0] : id_class[1]);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[0]]).id_class(bl ? new rrtQ_2(id_class[2], string, (int)id_break[1]) : new rrtx_3(id_class[3], string, (int)id_break[2]));
        rrfu_3.id_byte(string);
    }

    private static /* synthetic */ void ntfClinit() {
        rrqa_3.id_byte();
        rrqa_3.id_break();
    }

    @Override
    public void id_new() {
        String string = id_class[10];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[8]]).id_class(new rrtQ_2(id_class[11], string, (int)id_break[9]));
        rrfu_3.id_byte(string);
    }

    @Override
    public void e_(String string) {
        String string2 = "'" + string + "' \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0441\u043f\u0438\u0441\u043a\u0435";
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[12]]).id_class(new rrtx_3(id_class[14], string2, (int)id_break[13]));
        rrfu_3.id_byte(string2);
    }
}

