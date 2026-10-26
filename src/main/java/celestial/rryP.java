/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Sz_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfl_3;
import celestial.rjU_2;
import celestial.rryB;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryP
extends rryB {
    private static byte[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;
    private static double[] id_throws;
    private static long[] id_case;

    @Override
    public rfl_3 id_byte() {
        this.id_int();
        return (rfl_3)this.id_class[id_protected[11]];
    }

    private void id_int() {
        if (this.id_class == null) {
            this.id_class = new Object[6];
            this.id_class[5] = 0L;
        }
    }

    public rryP(Sz_1 sz_1, rfl_3 rfl_32) {
        this.id_int();
        Sz_1 sz_12 = sz_1;
        this.id_class[rryP.id_protected[0]] = sz_12;
        rfl_3 rfl_33 = rfl_32;
        this.id_class[rryP.id_protected[1]] = rfl_33;
        rjU_2 rjU_22 = ((rfl_3)this.id_class[id_protected[2]]).id_case();
        this.id_class[rryP.id_protected[3]] = rjU_22;
        rdn_3 rdn_32 = new rdn_3(rdy_3.Jd);
        this.id_class[rryP.id_protected[4]] = rdn_32;
        String string = ((Sz_1)this.id_class[id_protected[5]]).id_byte() + " \u043f\u043b\u0430\u0441\u0442";
        this.id_class[rryP.id_protected[6]] = string;
        Long l = ((rfl_3)this.id_class[id_protected[7]]).id_byte() <= id_throws[0] ? ((Sz_1)this.id_class[id_protected[8]]).id_break().getAsLong() : ((Sz_1)this.id_class[id_protected[9]]).id_protected().getAsLong();
        this.id_class[rryP.id_protected[10]] = l;
    }

    static {
        rryP.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{116, -64, 12, -48, 69, -66, 60, 24}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4261C36DA2F62AA1L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8EEB9138;
    }

    @Override
    public rjU_2 id_class() {
        this.id_int();
        return (rjU_2)this.id_class[id_protected[15]];
    }

    @Override
    public rdn_3 id_break() {
        this.id_int();
        return (rdn_3)this.id_class[id_protected[16]];
    }

    @Override
    public long id_throws() {
        this.id_int();
        return (Long)this.id_class[id_protected[13]];
    }

    private static /* synthetic */ void ntfClinit() {
        rryP.id_super();
        rryP.id_package();
        rryP.id_continue();
        rryP.id_new();
    }

    @Override
    public String id_case() {
        this.id_int();
        return (String)this.id_class[id_protected[12]];
    }

    private static void id_continue() {
        id_throws = new double[]{2.0};
    }

    private static void id_new() {
        id_byte = new byte[]{6, 5};
    }

    private static void id_package() {
        short[] sArray = new short[17];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[6] = 4;
        sArray[7] = 1;
        sArray[10] = 5;
        sArray[11] = 1;
        sArray[12] = 4;
        sArray[13] = 5;
        sArray[15] = 2;
        sArray[16] = 3;
        id_protected = sArray;
    }

    private static void id_super() {
        id_case = new long[1];
    }

    public Sz_1 id_protected() {
        this.id_int();
        return (Sz_1)this.id_class[id_protected[14]];
    }
}

