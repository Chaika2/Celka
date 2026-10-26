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
import celestial.rruT;
import celestial.rrua_1;
import celestial.rruq_1;
import celestial.rryd_1;
import celestial.rryk_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmP_2
implements rruT<rryk_1>,
rruq_1 {
    private static String[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_byte = blArray;
    }

    public rrmP_2(rrua_1 rrua_12) {
        this.id_protected();
        rrua_1 rrua_13 = rrua_12;
        this.id_class[rrmP_2.id_protected[0]] = rrua_13;
    }

    static {
        rrmP_2.ntfClinit();
    }

    @Override
    public rVe_1 id_class(rryk_1 rryk_12) {
        String string = rryk_12.id_break();
        String string2 = rryk_12.id_class();
        rVe_1 rVe_12 = new rVe_1(id_break[0]);
        rVe_12.id_class(new rgN_2(id_break[1]).id_class(rVe_12.id_class().id_class(rgF_2.RED)));
        rVe_1 rVe_13 = new rVe_1(id_break[2]);
        rVe_13.id_class(rVe_13.id_class().id_class(rgF_2.GRAY));
        CharSequence[] charSequenceArray = new CharSequence[id_byte[0]];
        charSequenceArray[rrmP_2.id_byte[1]] = "\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u0447\u0442\u043e\u0431\u044b \u0443\u0434\u0430\u043b\u0438\u0442\u044c '" + string + "' \u0438\u0437 \u0447\u0451\u0440\u043d\u043e\u0433\u043e \u0441\u043f\u0438\u0441\u043a\u0430";
        rVe_13.id_class(String.join((CharSequence)id_break[3], charSequenceArray));
        if (string2 != null) {
            rVe_13.id_class("\n\u0417\u0430\u043c\u0435\u0442\u043a\u0430: " + string2);
        } else {
            rVe_13.id_class(id_break[4]);
        }
        rVe_12.id_class(rVe_12.id_class().id_class(new rgy_3(rgp_3.id_class, rVe_13)));
        rVe_1 rVe_14 = rrfu_3.id_class((Object)string).id_break();
        rVe_14.id_class(rVe_14.id_class().id_class(rgF_2.GRAY));
        rVe_14.id_class(rVe_12);
        rVe_14.id_class(rVe_14.id_class().id_class(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_protected[5]] + "duel blacklist remove " + string)));
        return rVe_14;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3102BA57;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-16, -122, 77, -84, -85, -93, -12, 72}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_protected = new short[7];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE8F584B340D834C7L;
    }

    @Override
    public void id_class(C_static c_static) {
        ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_protected[1]]).id_class((rryk_1 rryk_12) -> {
            rVe_1 rVe_12 = this.id_class((rryk_1)rryk_12);
            rVi_1[] rVi_1Array = new rVi_1[id_byte[2]];
            rVi_1Array[rrmP_2.id_byte[3]] = rVe_12;
            ((rrua_1)this.id_class[id_protected[6]]).id_class(rVi_1Array);
        });
        if (!((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_protected[2]]).id_break().isEmpty()) {
            ((rrua_1)this.id_class[id_protected[3]]).id_case("\u0412\u0441\u0435\u0433\u043e \u0432 \u0447\u0451\u0440\u043d\u043e\u043c \u0441\u043f\u0438\u0441\u043a\u0435: " + ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_protected[4]]).id_class());
        }
    }

    private static void id_break() {
        id_break = new String[]{new String(" - "), new String("\u0423\u0434\u0430\u043b\u0438\u0442\u044c"), new String(""), new String("\n"), new String("\n\u0417\u0430\u043c\u0435\u0442\u043a\u0430 \u043e\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0443\u0435\u0442")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrmP_2.id_byte();
        rrmP_2.id_break();
        rrmP_2.id_class();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[4]];
        }
    }
}

