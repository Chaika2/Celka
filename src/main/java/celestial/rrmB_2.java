/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.k_1;
import celestial.rgF_2;
import celestial.rrua_1;
import celestial.rruq_1;
import celestial.rryd_1;
import celestial.rryk_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmB_2
implements rruq_1 {
    private static String[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static short[] id_protected;

    private static void id_byte() {
        id_byte = new boolean[]{true};
    }

    public rrmB_2(rrua_1 rrua_12) {
        this.id_protected();
        rrua_1 rrua_13 = rrua_12;
        this.id_class[rrmB_2.id_protected[0]] = rrua_13;
    }

    static {
        rrmB_2.ntfClinit();
    }

    @Override
    public void id_class(C_static c_static) throws x_1 {
        String string = c_static.id_extends().replaceAll(id_break[0], id_break[1]);
        rryk_1 rryk_12 = ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_protected[1]]).id_protected(string);
        if (rryk_12 == null) {
            throw new k_1("\u0418\u0433\u0440\u043e\u043a '" + string + "' \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0447\u0451\u0440\u043d\u043e\u043c \u0441\u043f\u0438\u0441\u043a\u0435");
        }
        String string2 = rryk_12.id_class();
        if (string2 == null || string2.isEmpty()) {
            ((rrua_1)this.id_class[id_protected[2]]).id_case("\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u043e \u0437\u0430\u043c\u0435\u0442\u043a\u0438 \u0434\u043b\u044f \u0438\u0433\u0440\u043e\u043a\u0430 '" + string + "'");
            return;
        }
        ((rrua_1)this.id_class[id_protected[3]]).id_case("\u0417\u0430\u043c\u0435\u0442\u043a\u0430 \u0434\u043b\u044f \u0438\u0433\u0440\u043e\u043a\u0430 '" + string + "': " + rgF_2.RED + string2);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF9FD7202B172F552L;
    }

    private static void id_class() {
        id_break = new String[]{new String(","), new String("")};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2B9551;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-96, 14, -78, -86, 41, 27, -103, 74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_protected = new short[4];
    }

    private static /* synthetic */ void ntfClinit() {
        rrmB_2.id_byte();
        rrmB_2.id_class();
        rrmB_2.id_break();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }
}

