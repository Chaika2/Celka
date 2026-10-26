/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.C_static;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgl_3;
import celestial.rgp_3;
import celestial.rgy_3;
import celestial.rrZW;
import celestial.rrZk_1;
import celestial.rrfu_3;
import celestial.rrms_3;
import celestial.rruT;
import celestial.rruq_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmb_3
implements rruT<rrZk_1>,
rruq_1 {
    private static short[] id_break;
    private static String[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[4]];
        }
    }

    public rrmb_3(rrms_3 rrms_32) {
        this.id_byte();
        rrms_3 rrms_33 = rrms_32;
        this.id_class[rrmb_3.id_break[0]] = rrms_33;
    }

    static {
        rrmb_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBA8F0B389FCEB44L;
    }

    private static void id_class() {
        id_byte = new String[]{new String(" - "), new String("\u0423\u0434\u0430\u043b\u0438\u0442\u044c"), new String(""), new String("\n")};
    }

    @Override
    public rVe_1 id_class(rrZk_1 rrZk_12) {
        rgN_2 rgN_22 = new rgN_2(id_byte[0]);
        rgN_22.id_class(new rgN_2(id_byte[1]).id_class(rgN_22.id_class().id_class(rgF_2.RED)));
        rgN_2 rgN_23 = new rgN_2(id_byte[2]);
        rgN_23.id_class(rgN_23.id_class().id_class(rgF_2.GRAY));
        CharSequence[] charSequenceArray = new CharSequence[id_protected[0]];
        charSequenceArray[rrmb_3.id_protected[1]] = "\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u0447\u0442\u043e\u0431\u044b \u0443\u0434\u0430\u043b\u0438\u0442\u044c '" + rrZk_12.id_class() + "' \u0438\u0437 \u0434\u0440\u0443\u0437\u0435\u0439";
        rgN_23.id_break(String.join((CharSequence)id_byte[3], charSequenceArray));
        rgN_22.id_class(rgN_22.id_class().id_class(new rgy_3(rgp_3.id_class, rgN_23)));
        rVe_1 rVe_12 = rrfu_3.id_class((Object)rrZk_12.id_class()).id_break();
        rVe_12.id_class(rVe_12.id_class().id_class(rgF_2.GRAY));
        rVe_12.id_class(rgN_22);
        rVe_12.id_class(rVe_12.id_class().id_class(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_break[5]] + "friend remove " + rrZk_12.id_class())));
        return rVe_12;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC1F3A727;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{75, -97, 90, 56, 95, -20, 91, 79}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(C_static c_static) {
        ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_break[1]]).id_class((rrZk_1 rrZk_12) -> {
            rVe_1 rVe_12 = this.id_class((rrZk_1)rrZk_12);
            rVi_1[] rVi_1Array = new rVi_1[id_protected[2]];
            rVi_1Array[rrmb_3.id_protected[3]] = rVe_12;
            ((rrms_3)this.id_class[id_break[6]]).id_class(rVi_1Array);
        });
        if (!((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_break[2]]).id_class().isEmpty()) {
            ((rrms_3)this.id_class[id_break[3]]).id_case("\u0412\u0441\u0435\u0433\u043e \u0434\u0440\u0443\u0437\u0435\u0439: " + ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_break[4]]).id_break());
        }
    }

    private static void id_break() {
        id_break = new short[7];
    }

    private static /* synthetic */ void ntfClinit() {
        rrmb_3.id_protected();
        rrmb_3.id_class();
        rrmb_3.id_break();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_protected = blArray;
    }
}

