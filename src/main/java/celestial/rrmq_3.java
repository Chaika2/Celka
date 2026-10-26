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
import celestial.rrmH_2;
import celestial.rrqX_2;
import celestial.rruT;
import celestial.rruq_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmq_3
implements rruT<String>,
rruq_1 {
    private static boolean[] id_break;
    private static short[] id_byte;
    private static String[] id_protected;
    public Object[] id_class;

    private static void id_byte() {
        id_byte = new short[7];
    }

    public rrmq_3(rrmH_2 rrmH_22) {
        this.id_break();
        rrmH_2 rrmH_23 = rrmH_22;
        this.id_class[rrmq_3.id_byte[0]] = rrmH_23;
    }

    static {
        rrmq_3.ntfClinit();
    }

    @Override
    public rVe_1 id_class(String string) {
        rVe_1 rVe_12 = new rVe_1(id_protected[0]);
        rVe_12.id_class(new rgN_2(id_protected[1]).id_class(rVe_12.id_class().id_class(rgF_2.RED)));
        rVe_1 rVe_13 = new rVe_1(id_protected[2]);
        rVe_13.id_class(rVe_13.id_class().id_class(rgF_2.GRAY));
        CharSequence[] charSequenceArray = new CharSequence[id_break[0]];
        charSequenceArray[rrmq_3.id_break[1]] = "\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u0447\u0442\u043e\u0431\u044b \u0443\u0434\u0430\u043b\u0438\u0442\u044c '" + string + "' \u0438\u0437 \u0441\u043f\u0438\u0441\u043a\u0430 \u043f\u0440\u0435\u0444\u0438\u043a\u0441\u043e\u0432";
        rVe_13.id_class(String.join((CharSequence)id_protected[3], charSequenceArray));
        rVe_12.id_class(rVe_12.id_class().id_class(new rgy_3(rgp_3.id_class, rVe_13)));
        rVe_1 rVe_14 = rrfu_3.id_class((Object)string).id_break();
        rVe_14.id_class(rVe_14.id_class().id_class(rgF_2.GRAY));
        rVe_14.id_class(rVe_12);
        rVe_14.id_class(rVe_14.id_class().id_class(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_byte[5]] + "staffprefix remove " + string)));
        return rVe_14;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA857B935;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_break = blArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x133FFB204820CE6EL;
    }

    @Override
    public void id_class(C_static c_static) {
        ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[id_byte[1]]).id_class((String string) -> {
            rVe_1 rVe_12 = this.id_class((String)string);
            rVi_1[] rVi_1Array = new rVi_1[id_break[2]];
            rVi_1Array[rrmq_3.id_break[3]] = rVe_12;
            ((rrmH_2)this.id_class[id_byte[6]]).id_class(rVi_1Array);
        });
        if (!((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[id_byte[2]]).id_byte().isEmpty()) {
            ((rrmH_2)this.id_class[id_byte[3]]).id_case("\u0412\u0441\u0435\u0433\u043e \u043f\u0440\u0435\u0444\u0438\u043a\u0441\u043e\u0432: " + ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[id_byte[4]]).id_throws());
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-97, -30, 110, -99, -104, -88, 123, -89}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[4]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrmq_3.id_class();
        rrmq_3.id_protected();
        rrmq_3.id_byte();
    }

    private static void id_protected() {
        id_protected = new String[]{new String(" - "), new String("\u0423\u0434\u0430\u043b\u0438\u0442\u044c"), new String(""), new String("\n")};
    }
}

