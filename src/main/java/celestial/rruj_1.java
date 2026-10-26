/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.module.Module;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgl_3;
import celestial.rgp_3;
import celestial.rgy_3;
import celestial.rrfu_3;
import celestial.rruT;
import celestial.rruf_1;
import celestial.rruq_1;
import celestial.rrvw_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruj_1
implements rruT<Module>,
rruq_1 {
    private static String[] id_break;
    private static short[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_protected = blArray;
    }

    public rruj_1(rruf_1 rruf_12) {
        this.id_protected();
        rruf_1 rruf_13 = rruf_12;
        this.id_class[rruj_1.id_byte[0]] = rruf_13;
    }

    static {
        rruj_1.ntfClinit();
    }

    @Override
    public rVe_1 id_class(Module module) {
        rVe_1 rVe_12 = new rVe_1(id_break[0]);
        rVe_12.id_class(new rgN_2(id_break[1]).id_class(rVe_12.id_class().id_class(rgF_2.RED)));
        rVe_1 rVe_13 = new rVe_1(id_break[2]);
        rVe_13.id_class(rVe_13.id_class().id_class(rgF_2.GRAY));
        CharSequence[] charSequenceArray = new CharSequence[id_protected[0]];
        charSequenceArray[rruj_1.id_protected[1]] = "\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u0447\u0442\u043e\u0431\u044b \u0441\u0431\u0440\u043e\u0441\u0438\u0442\u044c \u0431\u0438\u043d\u0434 \u0443 '" + module.id_final() + "'";
        rVe_13.id_class(String.join((CharSequence)id_break[3], charSequenceArray));
        rVe_12.id_class(rVe_12.id_class().id_class(new rgy_3(rgp_3.id_class, rVe_13)));
        rVe_1 rVe_14 = rrfu_3.id_class((Object)module.id_final()).id_break().id_class(rgF_2.GRAY + " [" + module.id_package().id_break() + "]");
        rVe_14.id_class(rVe_14.id_class().id_class(rgF_2.GRAY));
        rVe_14.id_class(rVe_12);
        rVe_14.id_class(rVe_14.id_class().id_class(new rgl_3(() -> ((rrvw_1)((Object)((Object)rrvw_1.staticFieldsb5a707e7713735c98363c6b6bc5591b6[id_byte[2]]))).id_class(module))));
        return rVe_14;
    }

    @Override
    public void id_class(C_static c_static) {
        ((rrvw_1)((Object)rrvw_1.staticFieldsb5a707e7713735c98363c6b6bc5591b6[id_byte[1]])).id_class((Module module) -> {
            rVe_1 rVe_12 = this.id_class((Module)module);
            rVi_1[] rVi_1Array = new rVi_1[id_protected[2]];
            rVi_1Array[rruj_1.id_protected[3]] = rVe_12;
            ((rruf_1)this.id_class[id_byte[3]]).id_class(rVi_1Array);
        });
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAE81759D09BFB9F7L;
    }

    private static void id_class() {
        id_break = new String[]{new String(" - "), new String("\u0421\u0431\u0440\u043e\u0441\u0438\u0442\u044c"), new String(""), new String("\n")};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{54, 82, 2, -10, 94, -96, 12, -114}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x41C03797;
    }

    private static void id_break() {
        id_byte = new short[4];
    }

    private static /* synthetic */ void ntfClinit() {
        rruj_1.id_byte();
        rruj_1.id_class();
        rruj_1.id_break();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[4]];
        }
    }
}

