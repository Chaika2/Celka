/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.Module;
import celestial.rrfu_3;
import celestial.rrtQ_2;
import celestial.rrth_3;
import celestial.rrtx_3;
import celestial.rrvI;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvf_1
implements rrvI {
    private static short[] id_class;
    private static String[] id_break;

    private static void id_byte() {
        id_break = new String[]{new String("\u0412\u0441\u0435 \u0431\u0438\u043d\u0434\u044b \u0431\u044b\u043b\u0438 \u0441\u0431\u0440\u043e\u0448\u0435\u043d\u044b"), new String("Binds"), new String("Binds"), new String("\u041d\u0435\u0442 \u0437\u0430\u0431\u0438\u043d\u0436\u0435\u043d\u043d\u044b\u0445 \u043c\u043e\u0434\u0443\u043b\u0435\u0439"), new String("Binds")};
    }

    static {
        rrvf_1.ntfClinit();
    }

    @Override
    public void id_class(Module module) {
        String string = "\u0411\u0438\u043d\u0434 \u043c\u043e\u0434\u0443\u043b\u044f " + this.id_break(module) + " \u0441\u0431\u0440\u043e\u0448\u0435\u043d";
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[2]]).id_class(new rrtQ_2(id_break[2], string, (int)id_class[3]));
        rrfu_3.id_byte(string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x632566C2A490E681L;
    }

    @Override
    public void id_class() {
        String string = id_break[0];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[0]]).id_class(new rrtQ_2(id_break[1], string, (int)id_class[1]));
        rrfu_3.id_byte(string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8E4B65B4;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-48, 47, -93, -91, 114, -116, -91, -57}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private String id_break(Module module) {
        return "'" + module.id_final() + "'";
    }

    @Override
    public void id_break() {
        String string = id_break[3];
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_class[4]]).id_class(new rrtx_3(id_break[4], string, (int)id_class[5]));
        rrfu_3.id_byte(string);
    }

    private static /* synthetic */ void ntfClinit() {
        rrvf_1.id_byte();
        rrvf_1.id_protected();
    }

    private static void id_protected() {
        short[] sArray = new short[6];
        sArray[1] = 2000;
        sArray[3] = 2000;
        sArray[5] = 2000;
        id_class = sArray;
    }
}

