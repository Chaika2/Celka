/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.rrfC_2;
import celestial.rruq_1;
import celestial.rrvZ;
import celestial.rrvm_1;
import celestial.setting.KeyBind;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmJ_2
implements rruq_1 {
    private static String[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;

    private static void id_byte() {
        id_break = new String[]{new String(" ")};
    }

    public rrmJ_2() {
        this.id_class();
    }

    static {
        rrmJ_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{100, 50, -7, -127, -97, 39, -60, 102}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x580B28C639C38F5BL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x15EA4019;
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[2]];
        }
    }

    @Override
    public void id_class(C_static c_static) throws x_1 {
        String string = c_static.id_implements();
        if (((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_protected[0]]).id_class(string)) {
            ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_protected[1]]).id_byte(string);
            return;
        }
        String string2 = c_static.id_class(id_break[0], id_byte[0]);
        rrvm_1 rrvm_12 = new rrvm_1(string, string2, (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_protected[2]]);
        this.id_class[rrmJ_2.id_protected[3]] = rrvm_12;
        ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_protected[4]]).id_break();
        ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_protected[5]]).id_break(n -> {
            if ((rrvm_1)this.id_class[id_protected[6]] != null) {
                ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_protected[7]]).id_class(((rrvm_1)this.id_class[id_protected[8]]).id_class(rrfC_2.id_class(n)), id_byte[1]);
                Object var6_2 = null;
                this.id_class[rrmJ_2.id_protected[9]] = var6_2;
            }
        });
    }

    private static void id_break() {
        id_byte = new boolean[]{true, true, true};
    }

    private static /* synthetic */ void ntfClinit() {
        rrmJ_2.id_break();
        rrmJ_2.id_byte();
        rrmJ_2.id_protected();
    }

    private static void id_protected() {
        id_protected = new short[10];
    }
}

