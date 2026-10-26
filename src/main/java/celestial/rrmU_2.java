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
import celestial.rrmY_2;
import celestial.rrqQ_2;
import celestial.rrqz_3;
import celestial.rruT;
import celestial.rruq_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmU_2
implements rruT<rrqz_3>,
rruq_1 {
    private static boolean[] id_break;
    private static String[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    private static void id_byte() {
        id_byte = new String[]{new String(" - "), new String("\u0423\u0434\u0430\u043b\u0438\u0442\u044c"), new String(""), new String("\n")};
    }

    public rrmU_2(rrmY_2 rrmY_22) {
        this.id_class();
        rrmY_2 rrmY_23 = rrmY_22;
        this.id_class[rrmU_2.id_protected[0]] = rrmY_23;
    }

    static {
        rrmU_2.ntfClinit();
    }

    @Override
    public void id_class(C_static c_static) {
        ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_protected[1]]).id_class((rrqz_3 rrqz_32) -> {
            rVe_1 rVe_12 = this.id_class((rrqz_3)rrqz_32);
            rVi_1[] rVi_1Array = new rVi_1[id_break[2]];
            rVi_1Array[rrmU_2.id_break[3]] = rVe_12;
            ((rrmY_2)this.id_class[id_protected[3]]).id_class(rVi_1Array);
        });
    }

    @Override
    public rVe_1 id_class(rrqz_3 rrqz_32) {
        String string = rrqz_32.id_break();
        rVe_1 rVe_12 = new rVe_1(id_byte[0]);
        rVe_12.id_class(new rgN_2(id_byte[1]).id_class(rVe_12.id_class().id_class(rgF_2.RED)));
        rVe_1 rVe_13 = new rVe_1(id_byte[2]);
        rVe_13.id_class(rVe_13.id_class().id_class(rgF_2.GRAY));
        CharSequence[] charSequenceArray = new CharSequence[id_break[0]];
        charSequenceArray[rrmU_2.id_break[1]] = "\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u0447\u0442\u043e\u0431\u044b \u0443\u0434\u0430\u043b\u0438\u0442\u044c '" + string + "' \u0438\u0437 \u0441\u043f\u0438\u0441\u043a\u0430 \u0431\u043b\u043e\u043a\u043e\u0432";
        rVe_13.id_class(String.join((CharSequence)id_byte[3], charSequenceArray));
        rVe_12.id_class(rVe_12.id_class().id_class(new rgy_3(rgp_3.id_class, rVe_13)));
        rVe_1 rVe_14 = rrfu_3.id_class((Object)string).id_break();
        rVe_14.id_class(rVe_14.id_class().id_class(rgF_2.GRAY));
        rVe_14.id_class(rVe_12);
        rVe_14.id_class(rVe_14.id_class().id_class(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_protected[2]] + "xray remove " + string)));
        return rVe_14;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC9EE6C1E;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1533E3B0EA70984L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-24, -96, 7, 85, 23, 102, 127, 111}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[4]];
        }
    }

    private static void id_break() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrmU_2.id_break();
        rrmU_2.id_byte();
        rrmU_2.id_protected();
    }

    private static void id_protected() {
        id_protected = new short[4];
    }
}

