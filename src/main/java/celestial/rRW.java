/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 */
package celestial;

import celestial.Jj_1;
import celestial.aM_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.rLQ;
import celestial.rRQ;
import celestial.rRk_1;
import celestial.rRq_1;
import celestial.rRz_1;
import celestial.rXE;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rhf_3;
import celestial.rhx_3;
import celestial.rjB_2;
import celestial.rjM_2;
import celestial.rjS_2;
import celestial.rjU_2;
import celestial.rjs_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rsE_2;
import celestial.rsX_2;
import celestial.ryO_2;
import celestial.rye_3;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

public class rRW {
    private static final rRQ id_class = new rRQ();
    private final boolean id_break;
    private final rRz_1 id_byte;
    private final Random id_protected = new Random();
    private final rYB id_throws;
    private final double id_case;
    private final double id_catch;
    private final double id_private;
    private final an_3 id_implements;
    private final float id_finally;
    private final rye_3 id_extends;
    private final rRQ id_native;
    private final List<rfH_2> id_volatile = Lists.newArrayList();
    private final Map<rhd_3, rjU_2> id_final = Maps.newHashMap();

    public Map<rhd_3, rjU_2> id_byte() {
        return this.id_final;
    }

    public rRW(rYB rYB2, an_3 an_32, rye_3 rye_32, rRQ rRQ2, double d, double d2, double d3, float f, boolean bl, rRz_1 rRz_12) {
        this.id_throws = rYB2;
        this.id_implements = an_32;
        this.id_finally = f;
        this.id_case = d;
        this.id_catch = d2;
        this.id_private = d3;
        this.id_break = bl;
        this.id_byte = rRz_12;
        this.id_extends = rye_32 == null ? rye_3.id_class(this) : rye_32;
        this.id_native = rRQ2 == null ? this.id_class(an_32) : rRQ2;
    }

    public rRW(rYB rYB2, an_3 an_32, double d, double d2, double d3, float f, boolean bl, rRz_1 rRz_12) {
        this(rYB2, an_32, null, null, d, d2, d3, f, bl, rRz_12);
    }

    public rRW(rYB rYB2, an_3 an_32, double d, double d2, double d3, float f, boolean bl, rRz_1 rRz_12, List<rfH_2> list) {
        this(rYB2, an_32, d, d2, d3, f, bl, rRz_12);
        this.id_volatile.addAll(list);
    }

    public rRW(rYB rYB2, an_3 an_32, double d, double d2, double d3, float f, List<rfH_2> list) {
        this(rYB2, an_32, d, d2, d3, f, false, rRz_1.DESTROY, list);
    }

    private static void id_class(ObjectArrayList<Pair<rdn_3, rfH_2>> objectArrayList, rdn_3 rdn_32, rfH_2 rfH_22) {
        int n = objectArrayList.size();
        for (int i = 0; i < n; ++i) {
            Pair pair = (Pair)objectArrayList.get(i);
            rdn_3 rdn_33 = (rdn_3)pair.getFirst();
            if (!rsE_2.id_class(rdn_33, rdn_32)) continue;
            rdn_3 rdn_34 = rsE_2.id_class(rdn_33, rdn_32, 16);
            objectArrayList.set(i, (Object)Pair.of((Object)rdn_34, (Object)((rfH_2)pair.getSecond())));
            if (!rdn_32.id_class()) continue;
            return;
        }
        objectArrayList.add((Object)Pair.of((Object)rdn_32, (Object)rfH_22));
    }

    private rRQ id_class(an_3 an_32) {
        return an_32 == null ? id_class : new rRk_1(an_32);
    }

    public void id_class() {
        int n;
        int n2;
        HashSet hashSet = Sets.newHashSet();
        int n3 = 16;
        for (int i = 0; i < 16; ++i) {
            for (n2 = 0; n2 < 16; ++n2) {
                for (n = 0; n < 16; ++n) {
                    if (i != 0 && i != 15 && n2 != 0 && n2 != 15 && n != 0 && n != 15) continue;
                    double d = (float)i / 15.0f * 2.0f - 1.0f;
                    double d2 = (float)n2 / 15.0f * 2.0f - 1.0f;
                    double d3 = (float)n / 15.0f * 2.0f - 1.0f;
                    double d4 = Math.sqrt(d * d + d2 * d2 + d3 * d3);
                    d /= d4;
                    d2 /= d4;
                    d3 /= d4;
                    double d5 = this.id_case;
                    double d6 = this.id_catch;
                    double d7 = this.id_private;
                    float f = 0.3f;
                    for (float f2 = this.id_finally * (0.7f + this.id_throws.id_int.nextFloat() * 0.6f); f2 > 0.0f; f2 -= 0.22500001f) {
                        rXE rXE2;
                        rfH_2 rfH_22 = new rfH_2(d5, d6, d7);
                        xc_3 xc_32 = this.id_throws.id_byte(rfH_22);
                        Optional<Float> optional = this.id_native.id_class(this, (rRq_1)this.id_throws, rfH_22, xc_32, rXE2 = this.id_throws.id_break(rfH_22));
                        if (optional.isPresent()) {
                            f2 -= (optional.get().floatValue() + 0.3f) * 0.3f;
                        }
                        if (f2 > 0.0f && this.id_native.id_class(this, (rRq_1)this.id_throws, rfH_22, xc_32, f2)) {
                            hashSet.add(rfH_22);
                        }
                        d5 += d * (double)0.3f;
                        d6 += d2 * (double)0.3f;
                        d7 += d3 * (double)0.3f;
                    }
                }
            }
        }
        this.id_volatile.addAll(hashSet);
        float f = this.id_finally * 2.0f;
        n2 = rfU_2.id_byte(this.id_case - (double)f - 1.0);
        n = rfU_2.id_byte(this.id_case + (double)f + 1.0);
        int n4 = rfU_2.id_byte(this.id_catch - (double)f - 1.0);
        int n5 = rfU_2.id_byte(this.id_catch + (double)f + 1.0);
        int n6 = rfU_2.id_byte(this.id_private - (double)f - 1.0);
        int n7 = rfU_2.id_byte(this.id_private + (double)f + 1.0);
        List<an_3> list = this.id_throws.id_class(this.id_implements, new rfl_3(n2, n4, n6, n, n5, n7));
        rjU_2 rjU_22 = new rjU_2(this.id_case, this.id_catch, this.id_private);
        for (int i = 0; i < list.size(); ++i) {
            rhd_3 rhd_32;
            double d;
            double d8;
            double d9;
            double d10;
            double d11;
            an_3 an_32 = list.get(i);
            if (an_32.Bl() || !((d11 = (double)(rfU_2.id_class(an_32.id_break(rjU_22)) / f)) <= 1.0) || (d10 = (double)rfU_2.id_class((d9 = an_32.rx() - this.id_case) * d9 + (d8 = (an_32 instanceof rsX_2 ? an_32.re() : an_32.rH()) - this.id_catch) * d8 + (d = an_32.BO() - this.id_private) * d)) == 0.0) continue;
            d9 /= d10;
            d8 /= d10;
            d /= d10;
            double d12 = rRW.id_class(rjU_22, an_32);
            double d13 = (1.0 - d11) * d12;
            an_32.id_break(this.id_break(), (int)((d13 * d13 + d13) / 2.0 * 7.0 * (double)f + 1.0));
            double d14 = d13;
            if (an_32 instanceof iB_2) {
                d14 = aM_2.id_class((iB_2)an_32, d13);
            }
            an_32.id_byte(an_32.rv().id_break(d9 * d14, d8 * d14, d * d14));
            if (!(an_32 instanceof rhd_3) || (rhd_32 = (rhd_3)an_32).id_native() || rhd_32.id_implements() && ((rhx_3)rhd_32.id_implements[18]).id_break) continue;
            this.id_final.put(rhd_32, new rjU_2(d9 * d13, d8 * d13, d * d13));
        }
    }

    public static float id_class(rjU_2 rjU_22, an_3 an_32) {
        rfl_3 rfl_32 = an_32.rN();
        double d = 1.0 / ((rfl_32.id_protected - rfl_32.id_class) * 2.0 + 1.0);
        double d2 = 1.0 / ((rfl_32.id_throws - rfl_32.id_break) * 2.0 + 1.0);
        double d3 = 1.0 / ((rfl_32.id_case - rfl_32.id_byte) * 2.0 + 1.0);
        double d4 = (1.0 - Math.floor(1.0 / d) * d) / 2.0;
        double d5 = (1.0 - Math.floor(1.0 / d3) * d3) / 2.0;
        if (!(d < 0.0 || d2 < 0.0 || d3 < 0.0)) {
            int n = 0;
            int n2 = 0;
            float f = 0.0f;
            while (f <= 1.0f) {
                float f2 = 0.0f;
                while (f2 <= 1.0f) {
                    float f3 = 0.0f;
                    while (f3 <= 1.0f) {
                        double d6;
                        double d7;
                        double d8 = rfU_2.id_protected((double)f, rfl_32.id_class, rfl_32.id_protected);
                        rjU_2 rjU_23 = new rjU_2(d8 + d4, d7 = rfU_2.id_protected((double)f2, rfl_32.id_break, rfl_32.id_throws), (d6 = rfU_2.id_protected((double)f3, rfl_32.id_byte, rfl_32.id_case)) + d5);
                        if (((rYB)an_32.id_throws[7]).id_class(new rjB_2(rjU_23, rjU_22, rjS_2.COLLIDER, rjs_3.NONE, an_32)).id_byte() == rjM_2.MISS) {
                            ++n;
                        }
                        ++n2;
                        f3 = (float)((double)f3 + d3);
                    }
                    f2 = (float)((double)f2 + d2);
                }
                f = (float)((double)f + d);
            }
            return (float)n / (float)n2;
        }
        return 0.0f;
    }

    public void id_class(boolean bl) {
        boolean bl2;
        if (this.id_throws.id_continue) {
            this.id_throws.id_class(this.id_case, this.id_catch, this.id_private, rqn_3.SR, rqL_2.BLOCKS, 4.0f, (1.0f + (this.id_throws.id_int.nextFloat() - this.id_throws.id_int.nextFloat()) * 0.2f) * 0.7f, false);
        }
        boolean bl3 = bl2 = this.id_byte != rRz_1.NONE;
        if (bl) {
            if (!(this.id_finally < 2.0f) && bl2) {
                this.id_throws.id_class(rLQ.id_synchronized, this.id_case, this.id_catch, this.id_private, 1.0, 0.0, 0.0);
            } else {
                this.id_throws.id_class(rLQ.id_return, this.id_case, this.id_catch, this.id_private, 1.0, 0.0, 0.0);
            }
        }
        if (bl2) {
            ObjectArrayList objectArrayList = new ObjectArrayList();
            Collections.shuffle(this.id_volatile, this.id_throws.id_int);
            for (rfH_2 rfH_22 : this.id_volatile) {
                xc_3 xc_32 = this.id_throws.id_byte(rfH_22);
                xd_3 xd_32 = xc_32.id_break();
                if (xc_32.id_catch()) continue;
                rfH_2 rfH_23 = rfH_22.id_int();
                if (xd_32.id_class(this) && this.id_throws instanceof rrEm_1) {
                    ryO_2 ryO_22 = xd_32.id_protected() ? this.id_throws.id_class(rfH_22) : null;
                    rzP_2 rzP_22 = new rzP_2((rrEm_1)this.id_throws).id_class(this.id_throws.id_int).id_class(rzQ_2.id_case, rjU_2.id_class(rfH_22)).id_class(rzQ_2.id_implements, rdn_3.id_break).id_break(rzQ_2.id_private, ryO_22).id_break(rzQ_2.id_class, this.id_implements);
                    if (this.id_byte == rRz_1.DESTROY) {
                        rzP_22.id_class(rzQ_2.id_finally, Float.valueOf(this.id_finally));
                    }
                    xc_32.id_class(rzP_22).forEach(rdn_32 -> rRW.id_class((ObjectArrayList<Pair<rdn_3, rfH_2>>)objectArrayList, rdn_32, rfH_23));
                }
                this.id_throws.id_class(rfH_22, xu_3.id_class.id_continue(), 3);
                xd_32.id_class(this.id_throws, rfH_22, this);
            }
            ObjectListIterator objectListIterator = objectArrayList.iterator();
            while (objectListIterator.hasNext()) {
                rfH_2 rfH_22;
                rfH_22 = (Pair)objectListIterator.next();
                xd_3.id_class(this.id_throws, (rfH_2)rfH_22.getSecond(), (rdn_3)rfH_22.getFirst());
            }
        }
        if (this.id_break) {
            for (rfH_2 rfH_24 : this.id_volatile) {
                if (this.id_protected.nextInt(3) != 0 || !this.id_throws.id_byte(rfH_24).id_catch() || !this.id_throws.id_byte(rfH_24.id_break()).id_implements(this.id_throws, rfH_24.id_break())) continue;
                this.id_throws.id_break(rfH_24, Jj_1.id_class(this.id_throws, rfH_24));
            }
        }
    }

    public rye_3 id_break() {
        return this.id_extends;
    }

    public void id_throws() {
        this.id_volatile.clear();
    }

    public List<rfH_2> id_case() {
        return this.id_volatile;
    }

    public iB_2 id_protected() {
        an_3 an_32;
        if (this.id_implements == null) {
            return null;
        }
        if (this.id_implements instanceof rsX_2) {
            return ((rsX_2)this.id_implements).id_protected();
        }
        if (this.id_implements instanceof iB_2) {
            return (iB_2)this.id_implements;
        }
        if (this.id_implements instanceof rhf_3 && (an_32 = ((rhf_3)this.id_implements).id_else()) instanceof iB_2) {
            return (iB_2)an_32;
        }
        return null;
    }
}

