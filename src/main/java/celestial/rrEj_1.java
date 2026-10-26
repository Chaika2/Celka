/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.aH_2;
import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.aq_3;
import celestial.aw_3;
import celestial.eX_2;
import celestial.iO_2;
import celestial.is_3;
import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rLT;
import celestial.rRR;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rTE;
import celestial.rVL;
import celestial.rXE;
import celestial.rYB;
import celestial.rYG;
import celestial.rYI;
import celestial.rYf_1;
import celestial.rYh_1;
import celestial.rYp_1;
import celestial.rYt_1;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rfw_3;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rlG_2;
import celestial.rls_3;
import celestial.roC_2;
import celestial.roJ_2;
import celestial.rpr_3;
import celestial.rrER;
import celestial.rrET;
import celestial.rrEY;
import celestial.rrEg_1;
import celestial.rrEm_1;
import celestial.rrEo_1;
import celestial.rrrA;
import celestial.rrrZ;
import celestial.xc_3;
import celestial.xu_3;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class rrEj_1 {
    private static final Logger id_class = LogManager.getLogger();
    public static final int id_break = (int)Math.pow(17.0, 2.0);
    private static final aH_2[] id_byte = (aH_2[])Stream.of(aH_2.values()).filter(aH_22 -> aH_22 != aH_2.MISC).toArray(aH_2[]::new);

    private static rfH_2 id_class(rRR rRR2, aI_2<?> aI_22, int n, int n2) {
        rfH_2 rfH_22;
        int n3 = rRR2.id_class(aq_3.id_break(aI_22), n, n2);
        rfw_3 rfw_32 = new rfw_3(n, n3, n2);
        if (rRR2.id_default().id_byte()) {
            do {
                rfw_32.id_class(rpr_3.DOWN);
            } while (!rRR2.id_byte(rfw_32).id_catch());
            do {
                rfw_32.id_class(rpr_3.DOWN);
            } while (rRR2.id_byte(rfw_32).id_catch() && rfw_32.c_() > 0);
        }
        if (aq_3.id_class(aI_22) == aw_3.ON_GROUND && rRR2.id_byte(rfH_22 = rfw_32.id_break()).id_class((rRq_1)rRR2, rfH_22, rLT.LAND)) {
            return rfH_22;
        }
        return rfw_32.id_int();
    }

    public static void id_class(rRf_1 rRf_12, rYG rYG2, int n, int n2, Random random) {
        rYt_1 rYt_12 = rYG2.id_break();
        List<rYf_1> list = rYt_12.id_class(aH_2.CREATURE);
        if (!list.isEmpty()) {
            int n3 = n << 4;
            int n4 = n2 << 4;
            while (random.nextFloat() < rYt_12.id_class()) {
                rYf_1 rYf_12 = rTE.id_class(random, list);
                int n5 = rYf_12.id_protected + random.nextInt(1 + rYf_12.id_throws - rYf_12.id_protected);
                aU_2 aU_22 = null;
                int n6 = n3 + random.nextInt(16);
                int n7 = n4 + random.nextInt(16);
                int n8 = n6;
                int n9 = n7;
                for (int i = 0; i < n5; ++i) {
                    boolean bl = false;
                    for (int j = 0; !bl && j < 4; ++j) {
                        rfH_2 rfH_22 = rrEj_1.id_class(rRf_12, rYf_12.id_break, n6, n7);
                        if (rYf_12.id_break.id_break() && rrEj_1.id_class(aq_3.id_class(rYf_12.id_break), rRf_12, rfH_22, rYf_12.id_break)) {
                            is_3 is_32;
                            Object obj;
                            float f = rYf_12.id_break.id_extends();
                            double d = rfU_2.id_class((double)n6, (double)n3 + (double)f, (double)n3 + 16.0 - (double)f);
                            double d2 = rfU_2.id_class((double)n7, (double)n4 + (double)f, (double)n4 + 16.0 - (double)f);
                            if (!rRf_12.id_break(rYf_12.id_break.id_class(d, rfH_22.c_(), d2)) || !aq_3.id_class(rYf_12.id_break, rRf_12, iO_2.CHUNK_GENERATION, new rfH_2(d, (double)rfH_22.c_(), d2), rRf_12.id_long())) continue;
                            try {
                                obj = rYf_12.id_break.id_class(rRf_12.id_byte());
                            }
                            catch (Exception exception) {
                                id_class.warn("Failed to create mob", (Throwable)exception);
                                continue;
                            }
                            ((an_3)obj).id_class(d, (double)rfH_22.c_(), d2, random.nextFloat() * 360.0f, 0.0f);
                            if (obj instanceof is_3 && (is_32 = (is_3)obj).id_class(rRf_12, iO_2.CHUNK_GENERATION) && is_32.id_class(rRf_12)) {
                                aU_22 = is_32.id_class(rRf_12, rRf_12.id_throws(is_32.Bs()), iO_2.CHUNK_GENERATION, aU_22, (rcd_3)null);
                                rRf_12.id_class(is_32);
                                bl = true;
                            }
                        }
                        n6 += random.nextInt(5) - random.nextInt(5);
                        n7 += random.nextInt(5) - random.nextInt(5);
                        while (n6 < n3 || n6 >= n3 + 16 || n7 < n4 || n7 >= n4 + 16) {
                            n6 = n8 + random.nextInt(5) - random.nextInt(5);
                            n7 = n9 + random.nextInt(5) - random.nextInt(5);
                        }
                    }
                }
            }
        }
    }

    public static boolean id_class(aw_3 aw_32, rRR rRR2, rfH_2 rfH_22, aI_2<?> aI_22) {
        if (aw_32 == aw_3.NO_RESTRICTIONS) {
            return true;
        }
        if (aI_22 != null && rRR2.id_instanceof().id_class(rfH_22)) {
            xc_3 xc_32 = rRR2.id_byte(rfH_22);
            rXE rXE2 = rRR2.id_break(rfH_22);
            rfH_2 rfH_23 = rfH_22.id_final();
            rfH_2 rfH_24 = rfH_22.id_break();
            switch (aw_32) {
                case IN_WATER: {
                    return rXE2.id_class(rlG_2.id_break) && rRR2.id_break(rfH_24).id_class(rlG_2.id_break) && !rRR2.id_byte(rfH_23).id_catch(rRR2, rfH_23);
                }
                case IN_LAVA: {
                    return rXE2.id_class(rlG_2.id_byte);
                }
            }
            xc_3 xc_33 = rRR2.id_byte(rfH_24);
            if (!xc_33.id_class((rRq_1)rRR2, rfH_24, aI_22)) {
                return false;
            }
            return rrEj_1.id_class(rRR2, rfH_22, xc_32, rXE2, aI_22) && rrEj_1.id_class(rRR2, rfH_23, rRR2.id_byte(rfH_23), rRR2.id_break(rfH_23), aI_22);
        }
        return false;
    }

    public static boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, rXE rXE2, aI_2<?> aI_22) {
        if (xc_32.id_new(rRq_12, rfH_22)) {
            return false;
        }
        if (xc_32.id_implements()) {
            return false;
        }
        if (!rXE2.id_byte()) {
            return false;
        }
        if (xc_32.id_class(rls_3.y)) {
            return false;
        }
        return !aI_22.id_class(xc_32);
    }

    private static rfH_2 id_class(rYB rYB2, roJ_2 roJ_22) {
        rfj_3 rfj_32 = roJ_22.id_private();
        int n = rfj_32.id_break() + rYB2.id_int.nextInt(16);
        int n2 = rfj_32.id_byte() + rYB2.id_int.nextInt(16);
        int n3 = roJ_22.id_class(rKv_1.WORLD_SURFACE, n, n2) + 1;
        int n4 = rYB2.id_int.nextInt(n3 + 1);
        return new rfH_2(n, n4, n2);
    }

    private static List<rYf_1> id_class(rrEm_1 rrEm_12, rrrA rrrA2, rKd_1 rKd_12, aH_2 aH_22, rfH_2 rfH_22, rYG rYG2) {
        return aH_22 == aH_2.MONSTER && rrEm_12.id_byte(rfH_22.id_break()).id_break() == xu_3.SP && rrrA2.id_class(rfH_22, false, rrrZ.id_final).id_throws() ? rrrZ.id_final.id_byte() : rKd_12.id_class(rYG2 != null ? rYG2 : rrEm_12.id_implements(rfH_22), rrrA2, aH_22, rfH_22);
    }

    private static boolean id_class(rrEm_1 rrEm_12, aH_2 aH_22, rrrA rrrA2, rKd_1 rKd_12, rYf_1 rYf_12, rfw_3 rfw_32, double d) {
        aI_2<?> aI_22 = rYf_12.id_break;
        if (aI_22.id_throws() == aH_2.MISC) {
            return false;
        }
        if (!aI_22.id_protected() && d > (double)(aI_22.id_throws().id_case() * aI_22.id_throws().id_case())) {
            return false;
        }
        if (aI_22.id_break() && rrEj_1.id_class(rrEm_12, rrrA2, rKd_12, aH_22, rYf_12, (rfH_2)rfw_32)) {
            aw_3 aw_32 = aq_3.id_class(aI_22);
            if (!rrEj_1.id_class(aw_32, rrEm_12, (rfH_2)rfw_32, aI_22)) {
                return false;
            }
            if (!aq_3.id_class(aI_22, rrEm_12, iO_2.NATURAL, rfw_32, rrEm_12.id_int)) {
                return false;
            }
            return rrEm_12.id_break(aI_22.id_class((double)rfw_32.b_() + 0.5, rfw_32.c_(), (double)rfw_32.d_() + 0.5));
        }
        return false;
    }

    private static boolean id_class(rrEm_1 rrEm_12, roC_2 roC_22, rfw_3 rfw_32, double d) {
        if (d <= 576.0) {
            return false;
        }
        if (rrEm_12.X().id_class((eX_2)new rjU_2((double)rfw_32.b_() + 0.5, rfw_32.c_(), (double)rfw_32.d_() + 0.5), 24.0)) {
            return false;
        }
        rfj_3 rfj_32 = new rfj_3(rfw_32);
        return Objects.equals(rfj_32, roC_22.id_private()) || rrEm_12.id_else().id_class(rfj_32);
    }

    public static void id_class(aH_2 aH_22, rrEm_1 rrEm_12, roC_2 roC_22, rfH_2 rfH_22, rrER rrER2, rrEo_1 rrEo_12) {
        rrrA rrrA2 = rrEm_12.id_protected();
        rKd_1 rKd_12 = rrEm_12.id_else().id_implements();
        int n = rfH_22.c_();
        xc_3 xc_32 = roC_22.id_byte(rfH_22);
        if (!xc_32.id_catch(roC_22, rfH_22)) {
            rfw_3 rfw_32 = new rfw_3();
            int n2 = 0;
            block0: for (int i = 0; i < 3; ++i) {
                int n3 = rfH_22.b_();
                int n4 = rfH_22.d_();
                int n5 = 6;
                rYf_1 rYf_12 = null;
                aU_2 aU_22 = null;
                int n6 = rfU_2.id_case(rrEm_12.id_int.nextFloat() * 4.0f);
                int n7 = 0;
                for (int j = 0; j < n6; ++j) {
                    double d;
                    rfw_32.id_class(n3 += rrEm_12.id_int.nextInt(6) - rrEm_12.id_int.nextInt(6), n, n4 += rrEm_12.id_int.nextInt(6) - rrEm_12.id_int.nextInt(6));
                    double d2 = (double)n3 + 0.5;
                    double d3 = (double)n4 + 0.5;
                    rhd_3 rhd_32 = rrEm_12.id_class(d2, (double)n, d3, -1.0, false);
                    if (rhd_32 == null || !rrEj_1.id_class(rrEm_12, roC_22, rfw_32, d = rhd_32.id_class(d2, (double)n, d3))) continue;
                    if (rYf_12 == null) {
                        rYf_12 = rrEj_1.id_class(rrEm_12, rrrA2, rKd_12, aH_22, rrEm_12.id_int, (rfH_2)rfw_32);
                        if (rYf_12 == null) continue block0;
                        n6 = rYf_12.id_protected + rrEm_12.id_int.nextInt(1 + rYf_12.id_throws - rYf_12.id_protected);
                    }
                    if (!rrEj_1.id_class(rrEm_12, aH_22, rrrA2, rKd_12, rYf_12, rfw_32, d) || !rrER2.test(rYf_12.id_break, rfw_32, roC_22)) continue;
                    is_3 is_32 = rrEj_1.id_class(rrEm_12, rYf_12.id_break);
                    if (is_32 == null) {
                        return;
                    }
                    is_32.id_class(d2, (double)n, d3, rrEm_12.id_int.nextFloat() * 360.0f, 0.0f);
                    if (!rrEj_1.id_class(rrEm_12, is_32, d)) continue;
                    aU_22 = is_32.id_class(rrEm_12, rrEm_12.id_throws(is_32.Bs()), iO_2.NATURAL, aU_22, (rcd_3)null);
                    ++n7;
                    rrEm_12.id_class((an_3)is_32);
                    rrEo_12.run(is_32, roC_22);
                    if (++n2 >= is_32.E()) {
                        return;
                    }
                    if (is_32.id_continue(n7)) continue block0;
                }
            }
        }
    }

    public static void id_class(aH_2 aH_22, rrEm_1 rrEm_12, roJ_2 roJ_22, rrER rrER2, rrEo_1 rrEo_12) {
        rfH_2 rfH_22 = rrEj_1.id_class((rYB)rrEm_12, roJ_22);
        if (rfH_22.c_() >= 1) {
            rrEj_1.id_class(aH_22, rrEm_12, roJ_22, rfH_22, rrER2, rrEo_12);
        }
    }

    public static void id_class(rrEm_1 rrEm_12, roJ_2 roJ_22, rrEg_1 rrEg_12, boolean bl, boolean bl2, boolean bl3) {
        for (aH_2 aH_22 : id_byte) {
            if (!bl && aH_22.id_protected() || !bl2 && !aH_22.id_protected() || !bl3 && aH_22.id_throws() || !rrEg_12.id_class(aH_22)) continue;
            rrEj_1.id_class(aH_22, rrEm_12, roJ_22, (aI_2<?> aI_22, rfH_2 rfH_22, roC_2 roC_22) -> rrEg_12.id_class(aI_22, rfH_22, roC_22), (is_3 is_32, roC_2 roC_22) -> rrEg_12.id_class(is_32, roC_22));
        }
    }

    public static rYG id_class(rfH_2 rfH_22, roC_2 roC_22) {
        return rYp_1.INSTANCE.id_class(0L, rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), roC_22.id_implements());
    }

    public static rrEg_1 id_class(int n, Iterable<an_3> iterable, rrEY rrEY2) {
        rrET rrET2 = new rrET();
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        Iterator<an_3> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            is_3 is_32;
            an_3 an_32 = iterator.next();
            if (an_32 instanceof is_3 && ((is_32 = (is_3)an_32).O() || is_32.id_strictfp())) continue;
            an_3 an_33 = an_32;
            aH_2 aH_22 = an_32.BC().id_throws();
            if (aH_22 == aH_2.MISC) continue;
            rfH_2 rfH_22 = an_32.Bs();
            long l = rfj_3.id_class(rfH_22.b_() >> 4, rfH_22.d_() >> 4);
            rrEY2.query(l, roJ_22 -> {
                rYI rYI2 = rrEj_1.id_class(rfH_22, (roC_2)roJ_22).id_break().id_class(an_33.BC());
                if (rYI2 != null) {
                    rrET2.id_class(an_33.Bs(), rYI2.id_break());
                }
                object2IntOpenHashMap.addTo((Object)aH_22, 1);
            });
        }
        return new rrEg_1(n, (Object2IntOpenHashMap<aH_2>)object2IntOpenHashMap, rrET2);
    }

    private static boolean id_class(rrEm_1 rrEm_12, rrrA rrrA2, rKd_1 rKd_12, aH_2 aH_22, rYf_1 rYf_12, rfH_2 rfH_22) {
        return rrEj_1.id_class(rrEm_12, rrrA2, rKd_12, aH_22, rfH_22, (rYG)null).contains(rYf_12);
    }

    private static rYf_1 id_class(rrEm_1 rrEm_12, rrrA rrrA2, rKd_1 rKd_12, aH_2 aH_22, Random random, rfH_2 rfH_22) {
        rYG rYG2 = rrEm_12.id_implements(rfH_22);
        if (aH_22 == aH_2.WATER_AMBIENT && rYG2.id_this() == rYh_1.RIVER && random.nextFloat() < 0.98f) {
            return null;
        }
        List<rYf_1> list = rrEj_1.id_class(rrEm_12, rrrA2, rKd_12, aH_22, rfH_22, rYG2);
        return list.isEmpty() ? null : rTE.id_class(random, list);
    }

    private static boolean id_class(rrEm_1 rrEm_12, is_3 is_32, double d) {
        if (d > (double)(is_32.BC().id_throws().id_case() * is_32.BC().id_throws().id_case()) && is_32.id_private(d)) {
            return false;
        }
        return is_32.id_class((rRg_1)rrEm_12, iO_2.NATURAL) && is_32.id_class((rRR)rrEm_12);
    }

    private static is_3 id_class(rrEm_1 rrEm_12, aI_2<?> aI_22) {
        try {
            Object obj = aI_22.id_class(rrEm_12);
            if (!(obj instanceof is_3)) {
                throw new IllegalStateException("Trying to spawn a non-mob: " + rVL.id_transient.id_break(aI_22));
            }
            return (is_3)obj;
        }
        catch (Exception exception) {
            id_class.warn("Failed to create mob", (Throwable)exception);
            return null;
        }
    }
}

