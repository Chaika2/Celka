/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rdn_3;
import celestial.rrNw_1;
import celestial.rrcZ_2;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcv_3
extends rrfI_2<Boolean> {
    public Object[] id_class;
    private static boolean[] id_break;
    private static String[] id_byte;
    private static short[] id_protected;

    @Override
    public boolean id_byte() {
        return this.id_break();
    }

    public rrcv_3(rrcZ_2 rrcZ_22, rrNw_1 rrNw_12) {
        this.id_protected();
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrcv_3.id_protected[0]] = rrNw_13;
    }

    static {
        rrcv_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1807ADA6;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD004F4B9D4F4FDCDL;
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_break();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-40, -14, 63, -23, -6, 40, -58, -1}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Boolean id_break() {
        this.id_protected();
        rJY rJY2 = ((rrNw_1)this.id_class[id_protected[1]]).id_throws();
        rdn_3 rdn_32 = rJY2 == null ? ((rrNw_1)this.id_class[id_protected[2]]).id_protected() : rJY2.id_class();
        return rdn_32.id_continue().getString().contains(id_byte[0]);
    }

    private static void id_throws() {
        id_protected = new short[3];
    }

    private static /* synthetic */ void ntfClinit() {
        rrcv_3.id_catch();
        rrcv_3.id_case();
        rrcv_3.id_throws();
    }

    private static void id_catch() {
        id_break = new boolean[]{true};
    }

    private static void id_case() {
        id_byte = new String[]{new String("\u2605")};
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }
}

