/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rU_2;
import celestial.rfH_2;
import celestial.rja_3;
import celestial.rpr_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bL_2
extends rU_2 {
    private static short[] id_catch;

    public bL_2 id_byte(rpr_3 rpr_32) {
        return new bL_2((Integer)this.id_break[id_catch[0]] + rpr_32.id_implements(), (Integer)this.id_break[id_catch[1]] + rpr_32.id_finally(), (Integer)this.id_break[id_catch[2]] + rpr_32.id_extends());
    }

    public bL_2(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    static {
        bL_2.id_continue();
    }

    public bL_2 id_class(rja_3 rja_32) {
        return new bL_2((Integer)this.id_break[id_catch[6]] + rja_32.b_(), (Integer)this.id_break[id_catch[7]] + rja_32.c_(), (Integer)this.id_break[id_catch[8]] + rja_32.d_());
    }

    @Override
    public /* synthetic */ rU_2 id_class(int n, int n2, int n3) {
        return this.id_protected(n, n2, n3);
    }

    @Override
    public /* synthetic */ rU_2 id_class(rpr_3 rpr_32) {
        return this.id_byte(rpr_32);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{69, 35, 61, 89, 99, -104, -9, -78}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public /* synthetic */ rfH_2 id_break(int n, int n2, int n3) {
        return this.id_protected(n, n2, n3);
    }

    @Override
    public /* synthetic */ rfH_2 id_break(rja_3 rja_32) {
        return this.id_class(rja_32);
    }

    @Override
    public /* synthetic */ rfH_2 id_break(rpr_3 rpr_32) {
        return this.id_byte(rpr_32);
    }

    private static long id_case(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF8496C3F97012D44L;
    }

    private static void id_continue() {
        short[] sArray = new short[9];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        id_catch = sArray;
    }

    private static int id_package(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8A6D3E7;
    }

    public bL_2 id_protected(int n, int n2, int n3) {
        return new bL_2((Integer)this.id_break[id_catch[3]] + n, (Integer)this.id_break[id_catch[4]] + n2, (Integer)this.id_break[id_catch[5]] + n3);
    }
}

