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
import celestial.rrmF_2;
import celestial.rrqM_2;
import celestial.rruT;
import celestial.rruq_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmn_3
implements rruT<String>,
rruq_1 {
    private static short[] id_break;
    private static boolean[] id_byte;
    private static String[] id_protected;
    public Object[] id_class;

    private static void id_byte() {
        id_break = new short[7];
    }

    public rrmn_3(rrmF_2 rrmF_22) {
        this.id_protected();
        rrmF_2 rrmF_23 = rrmF_22;
        this.id_class[rrmn_3.id_break[0]] = rrmF_23;
    }

    static {
        rrmn_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB84F5C880D6B79C6L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB7404E9F;
    }

    @Override
    public void id_class(C_static c_static) {
        ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[id_break[1]]).id_class((String string) -> {
            rVe_1 rVe_12 = this.id_class((String)string);
            rVi_1[] rVi_1Array = new rVi_1[id_byte[2]];
            rVi_1Array[rrmn_3.id_byte[3]] = rVe_12;
            ((rrmF_2)this.id_class[id_break[6]]).id_class(rVi_1Array);
        });
        if (!((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[id_break[2]]).id_byte().isEmpty()) {
            ((rrmF_2)this.id_class[id_break[3]]).id_case("\u0412\u0441\u0435\u0433\u043e \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430: " + ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[id_break[4]]).id_class());
        }
    }

    @Override
    public rVe_1 id_class(String string) {
        rVe_1 rVe_12 = new rVe_1(id_protected[0]);
        rVe_12.id_class(new rgN_2(id_protected[1]).id_class(rVe_12.id_class().id_class(rgF_2.RED)));
        rVe_1 rVe_13 = new rVe_1(id_protected[2]);
        rVe_13.id_class(rVe_13.id_class().id_class(rgF_2.GRAY));
        CharSequence[] charSequenceArray = new CharSequence[id_byte[0]];
        charSequenceArray[rrmn_3.id_byte[1]] = "\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u0447\u0442\u043e\u0431\u044b \u0443\u0434\u0430\u043b\u0438\u0442\u044c '" + string + "' \u0438\u0437 \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430";
        rVe_13.id_class(String.join((CharSequence)id_protected[3], charSequenceArray));
        rVe_12.id_class(rVe_12.id_class().id_class(new rgy_3(rgp_3.id_class, rVe_13)));
        rVe_1 rVe_14 = rrfu_3.id_class((Object)string).id_break();
        rVe_14.id_class(rVe_14.id_class().id_class(rgF_2.GRAY));
        rVe_14.id_class(rVe_12);
        rVe_14.id_class(rVe_14.id_class().id_class(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_break[5]] + "staff remove " + string)));
        return rVe_14;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_byte = blArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{104, -100, -121, 48, 14, 110, 11, -113}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_protected = new String[]{new String(" - "), new String("\u0423\u0434\u0430\u043b\u0438\u0442\u044c"), new String(""), new String("\n")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrmn_3.id_class();
        rrmn_3.id_break();
        rrmn_3.id_byte();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[4]];
        }
    }
}

