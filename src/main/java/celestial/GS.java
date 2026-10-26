/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.C_case;
import celestial.EA;
import celestial.EF;
import celestial.EZ;
import celestial.Ev_1;
import celestial.Ps_1;
import celestial.rU_2;
import celestial.rfH_2;
import celestial.rk_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GS
extends Ev_1 {
    private static double[] id_super;
    private static short[] id_this;
    private static byte[] id_else;
    private static boolean[] id_synchronized;
    public Object[] id_continue;

    @Override
    public EA id_byte(EA eA) {
        this.id_super();
        super.id_byte(eA);
        if (eA.id_byte() != (rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[11]])) {
            return eA;
        }
        if (((Ps_1)this.id_new[id_this[12]]).id_volatile().equals((rU_2)this.id_new[id_this[13]])) {
            return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[14]]));
        }
        if (!this.id_extends()) {
            return eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[id_this[15]]));
        }
        double d = ((Ps_1)this.id_new[GS.id_this[16]]).id_catch().Ps().id_break - ((double)((rU_2)this.id_new[id_this[17]]).b_() + id_super[3]);
        double d2 = ((Ps_1)this.id_new[GS.id_this[18]]).id_catch().Ps().id_protected - ((double)((rU_2)this.id_new[id_this[19]]).d_() + id_super[4]);
        double d3 = Math.sqrt(d * d + d2 * d2);
        GS gS = this;
        int n = (Integer)gS.id_continue[id_this[20]];
        Integer n2 = n + id_synchronized[8];
        gS.id_continue[GS.id_this[21]] = n2;
        if (n < id_else[1] && d3 < id_super[5]) {
            return eA;
        }
        EF.id_class((Ps_1)this.id_new[id_this[22]], eA, (rfH_2)((rU_2[])this.id_new[id_this[23]])[id_synchronized[9]]);
        return eA;
    }

    private static void id_int() {
        boolean[] blArray = new boolean[13];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[10] = true;
        id_synchronized = blArray;
    }

    public GS(C_case c_case, rU_2 rU_22, rU_2 rU_23) {
        rU_2[] rU_2Array = new rU_2[id_synchronized[0]];
        rU_2Array[GS.id_synchronized[1]] = rU_23;
        super(c_case, rU_22, rU_23, rU_2Array);
        this.id_super();
        Integer n = id_synchronized[2];
        this.id_continue[GS.id_this[0]] = n;
    }

    static {
        GS.ntfClinit();
    }

    @Override
    public void id_class() {
        this.id_super();
        super.id_class();
        Integer n = id_synchronized[3];
        this.id_continue[GS.id_this[1]] = n;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x597615CFC2F98D71L;
    }

    @Override
    public double id_class(EZ eZ) {
        return GS.id_protected(eZ, (Integer)((rU_2)this.id_new[GS.id_this[2]]).id_break[id_this[3]], (Integer)((rU_2)this.id_new[GS.id_this[4]]).id_break[id_this[5]], (Integer)((rU_2)this.id_new[GS.id_this[6]]).id_break[id_this[7]]);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA8EC8AA7;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-94, 3, 32, -117, 38, 101, 23, -116}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        GS.id_int();
        GS.id_package();
        GS.id_continue();
        GS.id_new();
    }

    private static void id_continue() {
        id_super = new double[]{1000000.0, 1000000.0, 6.666666666666667, 0.5, 0.5, 0.2};
    }

    private static void id_new() {
        id_else = new byte[]{2, 10};
    }

    private static void id_package() {
        short[] sArray = new short[24];
        sArray[2] = 3;
        sArray[4] = 3;
        sArray[5] = 1;
        sArray[6] = 3;
        sArray[7] = 2;
        sArray[8] = 3;
        sArray[9] = 4;
        sArray[10] = 20;
        sArray[11] = 2;
        sArray[12] = 1;
        sArray[13] = 4;
        sArray[14] = 3;
        sArray[15] = 4;
        sArray[16] = 1;
        sArray[17] = 4;
        sArray[18] = 1;
        sArray[19] = 4;
        sArray[22] = 1;
        sArray[23] = 5;
        id_this = sArray;
    }

    private void id_super() {
        if (this.id_continue == null) {
            Object[] objectArray = this.id_continue = new Object[id_synchronized[10]];
            objectArray[GS.id_synchronized[11]] = id_synchronized[12];
        }
    }

    public static double id_protected(EZ eZ, int n, int n2, int n3) {
        if (!((Boolean)eZ.id_break[id_this[10]]).booleanValue()) {
            return id_super[0];
        }
        if (!EF.id_class(eZ, n, n2 - id_else[0], n3)) {
            return id_super[1];
        }
        xc_3 xc_32 = eZ.id_class(n, n2 - id_synchronized[4], n3);
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 == xu_3.PJ || xd_32 == xu_3.BD) {
            return id_super[2];
        }
        return id_package[id_synchronized[5]] + EF.id_class(eZ, n, n2 - id_synchronized[6], n3, xc_32, id_synchronized[7]);
    }

    @Override
    public Set<rU_2> id_native() {
        return ImmutableSet.of((Object)((rU_2)this.id_new[id_this[8]]), (Object)((rU_2)this.id_new[id_this[9]]));
    }
}

