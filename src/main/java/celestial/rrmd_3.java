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
import celestial.rrmX_2;
import celestial.rruT;
import celestial.rruq_1;
import celestial.rrvZ;
import celestial.rrvm_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmd_3
implements rruT<rrvm_1>,
rruq_1 {
    public Object[] id_class;
    private static String[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        id_break = new String[]{new String(""), new String("\n"), new String(""), new String(""), new String("\n"), new String("\n\u041d\u0430\u0437\u0432\u0430\u043d\u0438\u0435: "), new String("\n\u041a\u043b\u0430\u0432\u0438\u0448\u0430: "), new String("\n\u041a\u043e\u043c\u0430\u043d\u0434\u0430: ")};
    }

    public rrmd_3(rrmX_2 rrmX_22) {
        this.id_class();
        rrmX_2 rrmX_23 = rrmX_22;
        this.id_class[rrmd_3.id_byte[0]] = rrmX_23;
    }

    static {
        rrmd_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{97, 53, -59, -27, -43, -49, 47, 48}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD1CF93EF0801B00L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE3C67732;
    }

    @Override
    public void id_class(C_static c_static) {
        ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_byte[1]]).id_class((rrvm_1 rrvm_12) -> {
            rVe_1 rVe_12 = this.id_class((rrvm_1)rrvm_12);
            rVi_1[] rVi_1Array = new rVi_1[id_protected[3]];
            rVi_1Array[rrmd_3.id_protected[4]] = rVe_12;
            ((rrmX_2)this.id_class[id_byte[4]]).id_class(rVi_1Array);
        });
    }

    @Override
    public rVe_1 id_class(rrvm_1 rrvm_12) {
        Set<rrvm_1> set = ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_byte[2]]).id_byte();
        int n = set.stream().toList().indexOf(rrvm_12) + id_protected[0];
        String string = "\u041c\u0430\u043a\u0440\u043e\u0441 #" + n;
        String string2 = "\n\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u0447\u0442\u043e\u0431\u044b \u0443\u0434\u0430\u043b\u0438\u0442\u044c" + (n == set.size() ? id_break[0] : id_break[1]);
        rVe_1 rVe_12 = new rVe_1(id_break[2]);
        rVe_12.id_class(new rgN_2(string2).id_class(rVe_12.id_class().id_class(rgF_2.RED)));
        rVe_1 rVe_13 = new rVe_1(id_break[3]);
        rVe_13.id_class(rVe_13.id_class().id_class(rgF_2.GRAY));
        CharSequence[] charSequenceArray = new CharSequence[id_protected[1]];
        charSequenceArray[rrmd_3.id_protected[2]] = "\u041d\u0430\u0436\u043c\u0438\u0442\u0435 \u0447\u0442\u043e\u0431\u044b \u0443\u0434\u0430\u043b\u0438\u0442\u044c '" + rrvm_12.id_byte() + "' \u0438\u0437 \u043c\u0430\u043a\u0440\u043e\u0441\u043e\u0432";
        rVe_13.id_class(String.join((CharSequence)id_break[4], charSequenceArray));
        rVe_12.id_class(rVe_12.id_class().id_class(new rgy_3(rgp_3.id_class, rVe_13)));
        rVe_1 rVe_14 = new rVe_1(string);
        rVe_14.id_class(id_break[5]);
        rVe_14.id_class(rrfu_3.id_class((Object)rrvm_12.id_byte()).id_break());
        rVe_14.id_class(id_break[6]);
        rVe_14.id_class(rrfu_3.id_class((Object)rrvm_12.id_class().id_break()).id_break());
        rVe_14.id_class(id_break[7]);
        rVe_14.id_class(rrfu_3.id_class((Object)rrvm_12.id_break()).id_break());
        rVe_14.id_class(rVe_14.id_class().id_class(rgF_2.GRAY));
        rVe_14.id_class(rVe_12);
        rVe_14.id_class(rVe_14.id_class().id_class(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_byte[3]] + "macro remove " + rrvm_12.id_byte())));
        return rVe_14;
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[5]];
        }
    }

    private static void id_break() {
        id_byte = new short[5];
    }

    private static /* synthetic */ void ntfClinit() {
        rrmd_3.id_protected();
        rrmd_3.id_byte();
        rrmd_3.id_break();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        id_protected = blArray;
    }
}

