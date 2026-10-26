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
import celestial.rrfu_3;
import celestial.rrqU_2;
import celestial.rrqY_2;
import celestial.rruT;
import celestial.rrug_1;
import celestial.rruq_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruU
implements rruT<rrqU_2>,
rruq_1 {
    private static String[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[4]];
        }
    }

    public rruU(rrug_1 rrug_12) {
        this.id_byte();
        rrug_1 rrug_13 = rrug_12;
        this.id_class[rruU.id_protected[0]] = rrug_13;
    }

    static {
        rruU.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-28, -126, 83, -117, 15, 59, 24, -46}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public rVe_1 id_class(rrqU_2 rrqU_22) {
        String string = rrqU_22.id_byte();
        rVe_1 rVe_12 = new rVe_1(id_break[0]);
        rVe_12.id_class(new rgN_2(id_break[1]).id_class(rVe_12.id_class().id_class(rgF_2.RED)));
        rVe_1 rVe_13 = new rVe_1(id_break[2]);
        rVe_13.id_class(rVe_13.id_class().id_class(rgF_2.GRAY));
        CharSequence[] charSequenceArray = new CharSequence[id_byte[0]];
        charSequenceArray[rruU.id_byte[1]] = "\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u0447\u0442\u043e\u0431\u044b \u0443\u0434\u0430\u043b\u0438\u0442\u044c '" + string + "' \u0438\u0437 \u0441\u043f\u0438\u0441\u043a\u0430 \u0431\u043b\u043e\u043a\u043e\u0432";
        rVe_13.id_class(String.join((CharSequence)id_break[3], charSequenceArray));
        rVe_12.id_class(rVe_12.id_class().id_class(new rgy_3(rgp_3.id_class, rVe_13)));
        rVe_1 rVe_14 = rrfu_3.id_class((Object)string).id_break();
        rVe_14.id_class(rVe_14.id_class().id_class(rgF_2.GRAY));
        rVe_14.id_class(rVe_12);
        rVe_14.id_class(rVe_14.id_class().id_class(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_protected[2]] + "blockesp remove " + string)));
        return rVe_14;
    }

    @Override
    public void id_class(C_static c_static) {
        ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[id_protected[1]]).id_class((rrqU_2 rrqU_22) -> {
            rVe_1 rVe_12 = this.id_class((rrqU_2)rrqU_22);
            rVi_1[] rVi_1Array = new rVi_1[id_byte[2]];
            rVi_1Array[rruU.id_byte[3]] = rVe_12;
            ((rrug_1)this.id_class[id_protected[3]]).id_class(rVi_1Array);
        });
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEF90BFD7;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_byte = blArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDAB709EA8198066DL;
    }

    private static void id_break() {
        id_protected = new short[4];
    }

    private static /* synthetic */ void ntfClinit() {
        rruU.id_class();
        rruU.id_protected();
        rruU.id_break();
    }

    private static void id_protected() {
        id_break = new String[]{new String(" - "), new String("\u0423\u0434\u0430\u043b\u0438\u0442\u044c"), new String(""), new String("\n")};
    }
}

