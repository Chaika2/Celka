/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVJ;
import celestial.rVW;
import celestial.rVd_1;
import celestial.rVh_1;
import celestial.rVk_1;
import celestial.rVx_1;
import celestial.rVz_1;
import celestial.rpr_3;
import celestial.xd_3;
import celestial.xu_3;

public abstract sealed class rVX
extends Enum<rVX>
implements rVz_1
permits rVJ, rVx_1, rVd_1, rVk_1, rVW {
    public static final /* enum */ rVX BLACKLIST = new rVJ(xu_3.bK, xu_3.Pi, xu_3.MY, xu_3.Mo, xu_3.MK, xu_3.MD, xu_3.MU, xu_3.Me, xu_3.Ma, xu_3.Mi, xu_3.Or, xu_3.OP, xu_3.OB, xu_3.OS, xu_3.Os, xu_3.OE, xu_3.OG, xu_3.Ob, xu_3.sc, xu_3.su, xu_3.sm, xu_3.SX, xu_3.id_char, xu_3.id_throw, xu_3.id_interface, xu_3.PE, xu_3.PG, xu_3.Pb, xu_3.PM, xu_3.PO, xu_3.Ph, xu_3.Pk, xu_3.PW, xu_3.Pz, xu_3.PQ, xu_3.PN, xu_3.Pc);
    public static final /* enum */ rVX DEFAULT = new rVx_1(new xd_3[0]);
    public static final /* enum */ rVX CHEST = new rVd_1(xu_3.re, xu_3.sZ);
    public static final /* enum */ rVX LEAVES = new rVk_1(true, xu_3.z, xu_3.k, xu_3.Q, xu_3.W, xu_3.x, xu_3.d);
    public static final /* enum */ rVX STEM_BLOCK = new rVW(xu_3.BK, xu_3.Bo);
    public static final rpr_3[] field_208827_f;
    private static final /* synthetic */ rVX[] $VALUES;

    public rVX(boolean bl, xd_3 ... xd_3Array) {
        for (xd_3 xd_32 : xd_3Array) {
            rVh_1.id_case.put(xd_32, this);
        }
        if (bl) {
            rVh_1.id_catch.add(this);
        }
    }

    public rVX(xd_3 ... xd_3Array) {
        this(false, xd_3Array);
    }

    static {
        $VALUES = rVX.id_class();
        field_208827_f = rpr_3.values();
    }

    public static rVX[] values() {
        return (rVX[])$VALUES.clone();
    }

    public static rVX valueOf(String string) {
        return Enum.valueOf(rVX.class, string);
    }

    private static /* synthetic */ rVX[] id_class() {
        return new rVX[]{BLACKLIST, DEFAULT, CHEST, LEAVES, STEM_BLOCK};
    }
}

