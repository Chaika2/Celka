/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
package celestial;

import celestial.Jj_1;
import celestial.Jq_1;
import celestial.Wt_1;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCm_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpr_3;
import celestial.rqR_2;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zQ_2;
import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class dt_3
extends Jj_1 {
    public static final rCm_1 id_final = rCT.k;
    public static final rCN id_package = Wt_1.id_volatile;
    public static final rCN id_int = Wt_1.id_final;
    public static final rCN id_new = Wt_1.id_package;
    public static final rCN id_continue = Wt_1.id_int;
    public static final rCN id_super = Wt_1.id_new;
    private static final Map<rpr_3, rCN> id_this = Wt_1.id_super.entrySet().stream().filter(entry -> entry.getKey() != rpr_3.DOWN).collect(rqR_2.id_class());
    private static final rjC_2 id_else = xd_3.id_class(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
    private static final rjC_2 id_synchronized = xd_3.id_class(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
    private static final rjC_2 id_return = xd_3.id_class(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    private static final rjC_2 id_public = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
    private static final rjC_2 id_goto = xd_3.id_class(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
    private final Map<xc_3, rjC_2> id_while;
    private final Object2IntMap<xd_3> id_try = new Object2IntOpenHashMap();
    private final Object2IntMap<xd_3> id_instanceof = new Object2IntOpenHashMap();

    public dt_3(Jq_1 jq_1) {
        super(jq_1, 1.0f);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_final, 0)).id_class(id_package, false)).id_class(id_int, false)).id_class(id_new, false)).id_class(id_continue, false)).id_class(id_super, false));
        this.id_while = ImmutableMap.copyOf(this.id_abstract.id_class().stream().filter(xc_32 -> xc_32.id_byte(id_final) == 0).collect(Collectors.toMap(Function.identity(), dt_3::id_private)));
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        super.id_class(xc_32, rYB2, rfH_22, xc_33, bl);
        rYB2.id_finally().id_class(rfH_22, this, dt_3.id_class(rYB2.id_int));
    }

    private int id_class(rRR rRR2, rfH_2 rfH_22) {
        if (!rRR2.id_finally(rfH_22)) {
            return 0;
        }
        int n = 0;
        for (rpr_3 rpr_32 : rpr_3.values()) {
            xc_3 xc_32 = rRR2.id_byte(rfH_22.id_break(rpr_32));
            n = Math.max(this.id_volatile(xc_32), n);
        }
        return n;
    }

    private xc_3 id_class(rRg_1 rRg_12, rfH_2 rfH_22, int n) {
        xc_3 xc_32 = dt_3.id_class(rRg_12, rfH_22);
        return xc_32.id_class(xu_3.ro) ? (xc_3)xc_32.id_class(id_final, n) : xc_32;
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, int n, Random random, int n2) {
        int n3 = this.id_implements(rYB2.id_byte(rfH_22));
        if (random.nextInt(n) < n3) {
            xc_3 xc_32 = rYB2.id_byte(rfH_22);
            if (random.nextInt(n2 + 10) < 5 && !rYB2.id_while(rfH_22)) {
                int n4 = Math.min(n2 + random.nextInt(5) / 4, 15);
                rYB2.id_class(rfH_22, this.id_class((rRg_1)rYB2, rfH_22, n4), 3);
            } else {
                rYB2.id_class(rfH_22, false);
            }
            xd_3 xd_32 = xc_32.id_break();
            if (xd_32 instanceof zQ_2) {
                zQ_2 zQ_22 = (zQ_2)xd_32;
                zQ_2.id_class(rYB2, rfH_22);
            }
        }
    }

    private void id_class(xd_3 xd_32, int n, int n2) {
        this.id_try.put((Object)xd_32, n);
        this.id_instanceof.put((Object)xd_32, n2);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_final, id_package, id_int, id_new, id_continue, id_super);
    }

    private static int id_class(Random random) {
        return 30 + random.nextInt(10);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_break();
        return rRR2.id_byte(rfH_23).id_protected(rRR2, rfH_23, rpr_3.UP) || this.id_protected(rRR2, rfH_22);
    }

    protected boolean id_class(rYB rYB2, rfH_2 rfH_22) {
        return rYB2.id_while(rfH_22) || rYB2.id_while(rfH_22.id_byte()) || rYB2.id_while(rfH_22.id_extends()) || rYB2.id_while(rfH_22.id_private()) || rYB2.id_while(rfH_22.id_protected());
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return this.id_class(xc_32, rRg_12, rfH_22) ? this.id_class(rRg_12, rfH_22, (int)xc_32.id_byte(id_final)) : xu_3.id_class.id_continue();
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return this.id_break(rxx_32.id_int(), rxx_32.id_class());
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_while.get(xc_32.id_class(id_final, 0));
    }

    public static void id_break() {
        dt_3 dt_32 = (dt_3)xu_3.ro;
        dt_32.id_class(xu_3.id_final, 5, 20);
        dt_32.id_class(xu_3.id_package, 5, 20);
        dt_32.id_class(xu_3.id_int, 5, 20);
        dt_32.id_class(xu_3.id_new, 5, 20);
        dt_32.id_class(xu_3.id_continue, 5, 20);
        dt_32.id_class(xu_3.id_super, 5, 20);
        dt_32.id_class(xu_3.Gg, 5, 20);
        dt_32.id_class(xu_3.GR, 5, 20);
        dt_32.id_class(xu_3.GY, 5, 20);
        dt_32.id_class(xu_3.Go, 5, 20);
        dt_32.id_class(xu_3.GK, 5, 20);
        dt_32.id_class(xu_3.GD, 5, 20);
        dt_32.id_class(xu_3.BU, 5, 20);
        dt_32.id_class(xu_3.bx, 5, 20);
        dt_32.id_class(xu_3.bd, 5, 20);
        dt_32.id_class(xu_3.bk, 5, 20);
        dt_32.id_class(xu_3.bz, 5, 20);
        dt_32.id_class(xu_3.bW, 5, 20);
        dt_32.id_class(xu_3.PV, 5, 20);
        dt_32.id_class(xu_3.bQ, 5, 20);
        dt_32.id_class(xu_3.bN, 5, 20);
        dt_32.id_class(xu_3.bc, 5, 20);
        dt_32.id_class(xu_3.bm, 5, 20);
        dt_32.id_class(xu_3.bu, 5, 20);
        dt_32.id_class(xu_3.rU, 5, 20);
        dt_32.id_class(xu_3.Su, 5, 20);
        dt_32.id_class(xu_3.Sc, 5, 20);
        dt_32.id_class(xu_3.Sm, 5, 20);
        dt_32.id_class(xu_3.Ez, 5, 20);
        dt_32.id_class(xu_3.EQ, 5, 20);
        dt_32.id_class(xu_3.id_static, 5, 5);
        dt_32.id_class(xu_3.id_import, 5, 5);
        dt_32.id_class(xu_3.id_short, 5, 5);
        dt_32.id_class(xu_3.id_default, 5, 5);
        dt_32.id_class(xu_3.id_const, 5, 5);
        dt_32.id_class(xu_3.id_strictfp, 5, 5);
        dt_32.id_class(xu_3.r, 5, 5);
        dt_32.id_class(xu_3.id_boolean, 5, 5);
        dt_32.id_class(xu_3.id_transient, 5, 5);
        dt_32.id_class(xu_3.id_for, 5, 5);
        dt_32.id_class(xu_3.id_double, 5, 5);
        dt_32.id_class(xu_3.id_switch, 5, 5);
        dt_32.id_class(xu_3.b, 5, 5);
        dt_32.id_class(xu_3.M, 5, 5);
        dt_32.id_class(xu_3.O, 5, 5);
        dt_32.id_class(xu_3.h, 5, 5);
        dt_32.id_class(xu_3.X, 5, 5);
        dt_32.id_class(xu_3.J, 5, 5);
        dt_32.id_class(xu_3.P, 5, 5);
        dt_32.id_class(xu_3.B, 5, 5);
        dt_32.id_class(xu_3.S, 5, 5);
        dt_32.id_class(xu_3.s, 5, 5);
        dt_32.id_class(xu_3.E, 5, 5);
        dt_32.id_class(xu_3.G, 5, 5);
        dt_32.id_class(xu_3.x, 30, 60);
        dt_32.id_class(xu_3.d, 30, 60);
        dt_32.id_class(xu_3.k, 30, 60);
        dt_32.id_class(xu_3.W, 30, 60);
        dt_32.id_class(xu_3.z, 30, 60);
        dt_32.id_class(xu_3.Q, 30, 60);
        dt_32.id_class(xu_3.rj, 30, 20);
        dt_32.id_class(xu_3.rf, 15, 100);
        dt_32.id_class(xu_3.e, 60, 100);
        dt_32.id_class(xu_3.a, 60, 100);
        dt_32.id_class(xu_3.i, 60, 100);
        dt_32.id_class(xu_3.Gr, 60, 100);
        dt_32.id_class(xu_3.GP, 60, 100);
        dt_32.id_class(xu_3.GB, 60, 100);
        dt_32.id_class(xu_3.GS, 60, 100);
        dt_32.id_class(xu_3.Gs, 60, 100);
        dt_32.id_class(xu_3.GE, 60, 100);
        dt_32.id_class(xu_3.ru, 60, 100);
        dt_32.id_class(xu_3.rm, 60, 100);
        dt_32.id_class(xu_3.rZ, 60, 100);
        dt_32.id_class(xu_3.rv, 60, 100);
        dt_32.id_class(xu_3.rF, 60, 100);
        dt_32.id_class(xu_3.rL, 60, 100);
        dt_32.id_class(xu_3.rA, 60, 100);
        dt_32.id_class(xu_3.rn, 60, 100);
        dt_32.id_class(xu_3.rC, 60, 100);
        dt_32.id_class(xu_3.rl, 60, 100);
        dt_32.id_class(xu_3.rH, 60, 100);
        dt_32.id_class(xu_3.rp, 60, 100);
        dt_32.id_class(xu_3.ry, 60, 100);
        dt_32.id_class(xu_3.rs, 30, 60);
        dt_32.id_class(xu_3.rE, 30, 60);
        dt_32.id_class(xu_3.rG, 30, 60);
        dt_32.id_class(xu_3.rb, 30, 60);
        dt_32.id_class(xu_3.rM, 30, 60);
        dt_32.id_class(xu_3.rO, 30, 60);
        dt_32.id_class(xu_3.rh, 30, 60);
        dt_32.id_class(xu_3.rX, 30, 60);
        dt_32.id_class(xu_3.rJ, 30, 60);
        dt_32.id_class(xu_3.rx, 30, 60);
        dt_32.id_class(xu_3.rd, 30, 60);
        dt_32.id_class(xu_3.rk, 30, 60);
        dt_32.id_class(xu_3.rW, 30, 60);
        dt_32.id_class(xu_3.rz, 30, 60);
        dt_32.id_class(xu_3.rQ, 30, 60);
        dt_32.id_class(xu_3.rN, 30, 60);
        dt_32.id_class(xu_3.BD, 15, 100);
        dt_32.id_class(xu_3.Ea, 5, 5);
        dt_32.id_class(xu_3.Ey, 60, 20);
        dt_32.id_class(xu_3.Jb, 15, 20);
        dt_32.id_class(xu_3.Ep, 60, 20);
        dt_32.id_class(xu_3.Eq, 60, 20);
        dt_32.id_class(xu_3.ET, 60, 20);
        dt_32.id_class(xu_3.Et, 60, 20);
        dt_32.id_class(xu_3.Ew, 60, 20);
        dt_32.id_class(xu_3.EI, 60, 20);
        dt_32.id_class(xu_3.Ef, 60, 20);
        dt_32.id_class(xu_3.Ej, 60, 20);
        dt_32.id_class(xu_3.EV, 60, 20);
        dt_32.id_class(xu_3.Eg, 60, 20);
        dt_32.id_class(xu_3.ER, 60, 20);
        dt_32.id_class(xu_3.EY, 60, 20);
        dt_32.id_class(xu_3.Eo, 60, 20);
        dt_32.id_class(xu_3.EK, 60, 20);
        dt_32.id_class(xu_3.ED, 60, 20);
        dt_32.id_class(xu_3.EU, 60, 20);
        dt_32.id_class(xu_3.Oh, 30, 60);
        dt_32.id_class(xu_3.hs, 60, 60);
        dt_32.id_class(xu_3.hU, 60, 60);
        dt_32.id_class(xu_3.Xs, 30, 20);
        dt_32.id_class(xu_3.JG, 5, 20);
        dt_32.id_class(xu_3.XJ, 60, 100);
        dt_32.id_class(xu_3.JO, 5, 20);
        dt_32.id_class(xu_3.JM, 30, 20);
    }

    protected xc_3 id_break(rRq_1 rRq_12, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_break();
        xc_3 xc_32 = rRq_12.id_byte(rfH_23);
        if (!this.id_catch(xc_32) && !xc_32.id_protected(rRq_12, rfH_23, rpr_3.UP)) {
            xc_3 xc_33 = this.id_continue();
            for (rpr_3 rpr_32 : rpr_3.values()) {
                rCN rCN2 = id_this.get(rpr_32);
                if (rCN2 == null) continue;
                xc_33 = (xc_3)xc_33.id_class(rCN2, this.id_catch(rRq_12.id_byte(rfH_22.id_break(rpr_32))));
            }
            return xc_33;
        }
        return this.id_continue();
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        rrEm_12.id_synchronized().id_class(rfH_22, this, dt_3.id_class(rrEm_12.id_int));
        if (rrEm_12.B().id_break(rRu_1.id_class)) {
            if (!xc_32.id_class((rRR)rrEm_12, rfH_22)) {
                rrEm_12.id_class(rfH_22, false);
            }
            xc_3 xc_33 = rrEm_12.id_byte(rfH_22.id_break());
            boolean bl = xc_33.id_class(rrEm_12.id_default().id_package());
            int n = xc_32.id_byte(id_final);
            if (!bl && rrEm_12.s() && this.id_class(rrEm_12, rfH_22) && random.nextFloat() < 0.2f + (float)n * 0.03f) {
                rrEm_12.id_class(rfH_22, false);
            } else {
                boolean bl2;
                int n2 = Math.min(15, n + random.nextInt(3) / 2);
                if (n != n2) {
                    xc_32 = (xc_3)xc_32.id_class(id_final, n2);
                    rrEm_12.id_class(rfH_22, xc_32, 4);
                }
                if (!bl) {
                    if (!this.id_protected(rrEm_12, rfH_22)) {
                        rfH_2 rfH_23 = rfH_22.id_break();
                        if (!rrEm_12.id_byte(rfH_23).id_protected(rrEm_12, rfH_23, rpr_3.UP) || n > 3) {
                            rrEm_12.id_class(rfH_22, false);
                        }
                        return;
                    }
                    if (n == 15 && random.nextInt(4) == 0 && !this.id_catch(rrEm_12.id_byte(rfH_22.id_break()))) {
                        rrEm_12.id_class(rfH_22, false);
                        return;
                    }
                }
                int n3 = (bl2 = rrEm_12.id_try(rfH_22)) ? -50 : 0;
                this.id_class((rYB)rrEm_12, rfH_22.id_extends(), 300 + n3, random, n);
                this.id_class((rYB)rrEm_12, rfH_22.id_byte(), 300 + n3, random, n);
                this.id_class((rYB)rrEm_12, rfH_22.id_break(), 250 + n3, random, n);
                this.id_class((rYB)rrEm_12, rfH_22.id_final(), 250 + n3, random, n);
                this.id_class((rYB)rrEm_12, rfH_22.id_private(), 300 + n3, random, n);
                this.id_class((rYB)rrEm_12, rfH_22.id_protected(), 300 + n3, random, n);
                rfw_3 rfw_32 = new rfw_3();
                for (int i = -1; i <= 1; ++i) {
                    for (int j = -1; j <= 1; ++j) {
                        for (int k = -1; k <= 4; ++k) {
                            if (i == 0 && k == 0 && j == 0) continue;
                            int n4 = 100;
                            if (k > 1) {
                                n4 += (k - 1) * 100;
                            }
                            rfw_32.id_class(rfH_22, i, k, j);
                            int n5 = this.id_class((rRR)rrEm_12, (rfH_2)rfw_32);
                            if (n5 <= 0) continue;
                            int n6 = (n5 + 40 + rrEm_12.id_abstract().id_class() * 7) / (n + 30);
                            if (bl2) {
                                n6 /= 2;
                            }
                            if (n6 <= 0 || random.nextInt(n4) > n6 || rrEm_12.s() && this.id_class(rrEm_12, (rfH_2)rfw_32)) continue;
                            int n7 = Math.min(15, n + random.nextInt(5) / 4);
                            rrEm_12.id_class((rfH_2)rfw_32, this.id_class((rRg_1)rrEm_12, (rfH_2)rfw_32, n7), 3);
                        }
                    }
                }
            }
        }
    }

    @Override
    protected boolean id_catch(xc_3 xc_32) {
        return this.id_volatile(xc_32) > 0;
    }

    private int id_implements(xc_3 xc_32) {
        return xc_32.id_break(rCT.id_throw) && xc_32.id_byte(rCT.id_throw) != false ? 0 : this.id_instanceof.getInt((Object)xc_32.id_break());
    }

    private boolean id_protected(rRq_1 rRq_12, rfH_2 rfH_22) {
        for (rpr_3 rpr_32 : rpr_3.values()) {
            if (!this.id_catch(rRq_12.id_byte(rfH_22.id_break(rpr_32)))) continue;
            return true;
        }
        return false;
    }

    private static rjC_2 id_private(xc_3 xc_32) {
        rjC_2 rjC_22 = rjw_3.id_class();
        if (xc_32.id_byte(id_super).booleanValue()) {
            rjC_22 = id_else;
        }
        if (xc_32.id_byte(id_package).booleanValue()) {
            rjC_22 = rjw_3.id_class(rjC_22, id_public);
        }
        if (xc_32.id_byte(id_new).booleanValue()) {
            rjC_22 = rjw_3.id_class(rjC_22, id_goto);
        }
        if (xc_32.id_byte(id_int).booleanValue()) {
            rjC_22 = rjw_3.id_class(rjC_22, id_return);
        }
        if (xc_32.id_byte(id_continue).booleanValue()) {
            rjC_22 = rjw_3.id_class(rjC_22, id_synchronized);
        }
        return rjC_22.id_break() ? id_volatile : rjC_22;
    }

    private int id_volatile(xc_3 xc_32) {
        return xc_32.id_break(rCT.id_throw) && xc_32.id_byte(rCT.id_throw) != false ? 0 : this.id_try.getInt((Object)xc_32.id_break());
    }
}

