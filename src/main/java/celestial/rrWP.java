/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap
 */
package celestial;

import celestial.module.player.FreeCamera;
import celestial.rCF;
import celestial.rCZ;
import celestial.rRq_1;
import celestial.rVL;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjN_2;
import celestial.rjw_3;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rrQX;
import celestial.rrWB;
import celestial.rrWS;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrxF_2;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.Collection;
import java.util.List;

public class rrWP {
    private static final ThreadLocal<rrWS> id_class = ThreadLocal.withInitial(() -> new rrWS(null, null, null));
    private static final ThreadLocal<Object2ByteLinkedOpenHashMap<rrWS>> id_break = ThreadLocal.withInitial(() -> {
        rrWB rrWB2 = new rrWB(200);
        rrWB2.defaultReturnValue((byte)127);
        return rrWB2;
    });

    public static List<xc_3> id_byte(xd_3 xd_32) {
        rCF<xd_3, xc_3> rCF2 = xd_32.id_new();
        ImmutableList<xc_3> immutableList = rCF2.id_class();
        return immutableList;
    }

    public static boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32, rrxF_2 rrxF_22, xc_3 xc_33, rfH_2 rfH_23) {
        long l = (long)xc_32.id_else() << 36 | (long)xc_33.id_else() << 4 | (long)rpr_32.ordinal();
        Long2ByteLinkedOpenHashMap long2ByteLinkedOpenHashMap = rrxF_22.id_new();
        byte by = long2ByteLinkedOpenHashMap.getAndMoveToFirst(l);
        if (by != 0) {
            return by > 0;
        }
        rjC_2 rjC_22 = xc_32.id_class(rRq_12, rfH_22, rpr_32);
        rjC_2 rjC_23 = xc_33.id_class(rRq_12, rfH_23, rpr_32.id_case());
        boolean bl = rjw_3.id_byte(rjC_22, rjC_23, rjN_2.id_throws);
        if (long2ByteLinkedOpenHashMap.size() > 400) {
            long2ByteLinkedOpenHashMap.removeLastByte();
        }
        long2ByteLinkedOpenHashMap.putAndMoveToFirst(l, (byte)(bl ? 1 : -1));
        return bl;
    }

    public static boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32, rrxF_2 rrxF_22) {
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
        xc_3 xc_33 = rRq_12.id_byte(rfH_23);
        if (xc_33.id_synchronized()) {
            return false;
        }
        if (xc_32.id_class(xc_33, rpr_32)) {
            return false;
        }
        if (xc_33.id_native()) {
            return rrWP.id_class(xc_32, rRq_12, rfH_22, rpr_32, rrxF_22, xc_33, rfH_23);
        }
        FreeCamera freeCamera = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().K();
        if (freeCamera.aJ_() && (rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2])) {
            boolean bl;
            boolean bl2 = bl = xc_33.id_catch() || xc_33.id_volatile().id_class(rlG_2.id_byte);
            if (bl) {
                boolean bl3 = true;
                for (rpr_3 rpr_33 : rpr_3.VALUES) {
                    rfH_2 rfH_24 = rfH_23.id_break(rpr_33);
                    xc_3 xc_34 = rRq_12.id_byte(rfH_24);
                    if (!xc_34.id_catch()) continue;
                    bl3 = false;
                    break;
                }
                if (bl3) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_return();
    }

    public static xc_3 id_class(xd_3 xd_32, int n) {
        rCF<xd_3, xc_3> rCF2 = xd_32.id_new();
        ImmutableList<xc_3> immutableList = rCF2.id_class();
        return n >= 0 && n < immutableList.size() ? (xc_3)immutableList.get(n) : null;
    }

    public static int id_class(xd_3 xd_32) {
        return rVL.id_strictfp.id_class(xd_32);
    }

    public static int id_class(xc_3 xc_32) {
        xd_3 xd_32 = xc_32.id_break();
        rCF<xd_3, xc_3> rCF2 = xd_32.id_new();
        ImmutableList<xc_3> immutableList = rCF2.id_class();
        return immutableList.indexOf(xc_32);
    }

    public static xd_3 id_class(rqO_2 rqO_22) {
        return !rVL.id_strictfp.id_byte(rqO_22) ? null : rVL.id_strictfp.id_class(rqO_22);
    }

    public static int id_break(xd_3 xd_32) {
        rCF<xd_3, xc_3> rCF2 = xd_32.id_new();
        ImmutableList<xc_3> immutableList = rCF2.id_class();
        return immutableList.size();
    }

    public static Collection<rCZ> id_break(xc_3 xc_32) {
        return xc_32.id_public();
    }
}

