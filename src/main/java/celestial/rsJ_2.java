/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.UnmodifiableIterator
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.Jo_1;
import celestial.Ws_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.iB_2;
import celestial.iG_2;
import celestial.iM_2;
import celestial.rCR;
import celestial.rFJ;
import celestial.rMZ;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rSK;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rls_3;
import celestial.rmE_2;
import celestial.rpB_2;
import celestial.rpJ_2;
import celestial.rpr_3;
import celestial.rqI_2;
import celestial.rqR_2;
import celestial.rqT_2;
import celestial.rsN_2;
import celestial.rsW_2;
import celestial.rsc_3;
import celestial.rsd_3;
import celestial.rsk_3;
import celestial.rsm_3;
import celestial.rsu_3;
import celestial.rsv_3;
import celestial.ruS_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public abstract class rsJ_2
extends an_3 {
    private static final rut_3<Integer> id_class = rmE_2.id_class(rsJ_2.class, ruw_3.id_break);
    private static final rut_3<Integer> id_break = rmE_2.id_class(rsJ_2.class, ruw_3.id_break);
    private static final rut_3<Float> id_protected = rmE_2.id_class(rsJ_2.class, ruw_3.id_byte);
    private static final rut_3<Integer> id_catch = rmE_2.id_class(rsJ_2.class, ruw_3.id_break);
    private static final rut_3<Integer> id_private = rmE_2.id_class(rsJ_2.class, ruw_3.id_break);
    private static final rut_3<Boolean> id_implements = rmE_2.id_class(rsJ_2.class, ruw_3.id_implements);
    private static final ImmutableMap<iM_2, ImmutableList<Integer>> id_finally = ImmutableMap.of((Object)((Object)iM_2.STANDING), (Object)ImmutableList.of((Object)0, (Object)1, (Object)-1), (Object)((Object)iM_2.CROUCHING), (Object)ImmutableList.of((Object)0, (Object)1, (Object)-1), (Object)((Object)iM_2.SWIMMING), (Object)ImmutableList.of((Object)0, (Object)1));
    private boolean id_extends;
    private static final Map<rCR, Pair<rja_3, rja_3>> id_native = rqR_2.id_class(Maps.newEnumMap(rCR.class), enumMap -> {
        rja_3 rja_32 = rpr_3.WEST.id_int();
        rja_3 rja_33 = rpr_3.EAST.id_int();
        rja_3 rja_34 = rpr_3.NORTH.id_int();
        rja_3 rja_35 = rpr_3.SOUTH.id_int();
        rja_3 rja_36 = rja_32.id_catch();
        rja_3 rja_37 = rja_33.id_catch();
        rja_3 rja_38 = rja_34.id_catch();
        rja_3 rja_39 = rja_35.id_catch();
        enumMap.put(rCR.NORTH_SOUTH, Pair.of((Object)rja_34, (Object)rja_35));
        enumMap.put(rCR.EAST_WEST, Pair.of((Object)rja_32, (Object)rja_33));
        enumMap.put(rCR.ASCENDING_EAST, Pair.of((Object)rja_36, (Object)rja_33));
        enumMap.put(rCR.ASCENDING_WEST, Pair.of((Object)rja_32, (Object)rja_37));
        enumMap.put(rCR.ASCENDING_NORTH, Pair.of((Object)rja_34, (Object)rja_39));
        enumMap.put(rCR.ASCENDING_SOUTH, Pair.of((Object)rja_38, (Object)rja_35));
        enumMap.put(rCR.SOUTH_EAST, Pair.of((Object)rja_35, (Object)rja_33));
        enumMap.put(rCR.SOUTH_WEST, Pair.of((Object)rja_35, (Object)rja_32));
        enumMap.put(rCR.NORTH_WEST, Pair.of((Object)rja_34, (Object)rja_32));
        enumMap.put(rCR.NORTH_EAST, Pair.of((Object)rja_34, (Object)rja_33));
    });
    private int id_volatile;
    private double id_final;
    private double id_package;
    private double id_int;
    private double id_new;
    private double id_continue;
    private double id_super;
    private double id_this;
    private double id_else;

    @Override
    public void id_byte(an_3 an_32) {
        double d;
        double d2;
        double d3;
        if (!(((rYB)this.id_throws[7]).id_continue || ((Boolean)an_32.id_throws[38]).booleanValue() || ((Boolean)this.id_throws[38]).booleanValue() || this.id_synchronized(an_32) || !((d3 = (d2 = an_32.rx() - this.rx()) * d2 + (d = an_32.BO() - this.BO()) * d) >= (double)1.0E-4f))) {
            d3 = rfU_2.id_class(d3);
            d2 /= d3;
            d /= d3;
            double d4 = 1.0 / d3;
            if (d4 > 1.0) {
                d4 = 1.0;
            }
            d2 *= d4;
            d *= d4;
            d2 *= (double)0.1f;
            d *= (double)0.1f;
            d2 *= (double)(1.0f - ((Float)this.id_throws[39]).floatValue());
            d *= (double)(1.0f - ((Float)this.id_throws[39]).floatValue());
            d2 *= 0.5;
            d *= 0.5;
            if (an_32 instanceof rsJ_2) {
                rjU_2 rjU_22;
                double d5;
                double d6 = an_32.rx() - this.rx();
                rjU_2 rjU_23 = new rjU_2(d6, 0.0, d5 = an_32.BO() - this.BO()).id_protected();
                double d7 = Math.abs(rjU_23.id_break(rjU_22 = new rjU_2(rfU_2.id_break(((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180)), 0.0, rfU_2.id_class(((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180))).id_protected()));
                if (d7 < (double)0.8f) {
                    return;
                }
                rjU_2 rjU_24 = this.rv();
                rjU_2 rjU_25 = an_32.rv();
                if (((rsJ_2)an_32).id_final() == rsd_3.FURNACE && this.id_final() != rsd_3.FURNACE) {
                    this.id_byte(rjU_24.id_throws(0.2, 1.0, 0.2));
                    this.id_implements(rjU_25.id_break - d2, 0.0, rjU_25.id_protected - d);
                    an_32.id_byte(rjU_25.id_throws(0.95, 1.0, 0.95));
                } else if (((rsJ_2)an_32).id_final() != rsd_3.FURNACE && this.id_final() == rsd_3.FURNACE) {
                    an_32.id_byte(rjU_25.id_throws(0.2, 1.0, 0.2));
                    an_32.id_implements(rjU_24.id_break + d2, 0.0, rjU_24.id_protected + d);
                    this.id_byte(rjU_24.id_throws(0.95, 1.0, 0.95));
                } else {
                    double d8 = (rjU_25.id_break + rjU_24.id_break) / 2.0;
                    double d9 = (rjU_25.id_protected + rjU_24.id_protected) / 2.0;
                    this.id_byte(rjU_24.id_throws(0.2, 1.0, 0.2));
                    this.id_implements(d8 - d2, 0.0, d9 - d);
                    an_32.id_byte(rjU_25.id_throws(0.2, 1.0, 0.2));
                    an_32.id_implements(d8 + d2, 0.0, d9 + d);
                }
            } else {
                this.id_implements(-d2, 0.0, -d);
                an_32.id_implements(d2 / 4.0, 0.0, d / 4.0);
            }
        }
    }

    protected void id_byte(rfH_2 rfH_22, xc_3 xc_32) {
        double d;
        rjU_2 rjU_22;
        double d2;
        double d3;
        double d4;
        an_3 an_32;
        Float f = Float.valueOf(0.0f);
        this.id_throws[31] = f;
        double d5 = this.rx();
        double d6 = this.re();
        double d7 = this.BO();
        rjU_2 rjU_23 = this.id_continue(d5, d6, d7);
        d6 = rfH_22.c_();
        boolean bl = false;
        boolean bl2 = false;
        Jo_1 jo_1 = (Jo_1)xc_32.id_break();
        if (jo_1 == xu_3.o) {
            bl = xc_32.id_byte(Ws_1.id_int);
            bl2 = !bl;
        }
        double d8 = 0.0078125;
        rjU_2 rjU_24 = this.rv();
        rCR rCR2 = xc_32.id_byte(jo_1.id_implements());
        switch (rCR2) {
            case ASCENDING_EAST: {
                this.id_byte(rjU_24.id_break(-0.0078125, 0.0, 0.0));
                d6 += 1.0;
                break;
            }
            case ASCENDING_WEST: {
                this.id_byte(rjU_24.id_break(0.0078125, 0.0, 0.0));
                d6 += 1.0;
                break;
            }
            case ASCENDING_NORTH: {
                this.id_byte(rjU_24.id_break(0.0, 0.0, 0.0078125));
                d6 += 1.0;
                break;
            }
            case ASCENDING_SOUTH: {
                this.id_byte(rjU_24.id_break(0.0, 0.0, -0.0078125));
                d6 += 1.0;
            }
        }
        rjU_24 = this.rv();
        Pair<rja_3, rja_3> pair = rsJ_2.id_class(rCR2);
        rja_3 rja_32 = (rja_3)pair.getFirst();
        rja_3 rja_33 = (rja_3)pair.getSecond();
        double d9 = rja_33.b_() - rja_32.b_();
        double d10 = rja_33.d_() - rja_32.d_();
        double d11 = Math.sqrt(d9 * d9 + d10 * d10);
        double d12 = rjU_24.id_break * d9 + rjU_24.id_protected * d10;
        if (d12 < 0.0) {
            d9 = -d9;
            d10 = -d10;
        }
        double d13 = Math.min(2.0, Math.sqrt(rsJ_2.id_case(rjU_24)));
        rjU_24 = new rjU_2(d13 * d9 / d11, rjU_24.id_byte, d13 * d10 / d11);
        this.id_byte(rjU_24);
        an_3 an_33 = an_32 = this.Bh().isEmpty() ? null : this.Bh().get(0);
        if (an_32 instanceof rhd_3) {
            rjU_2 rjU_25 = an_32.rv();
            double d14 = rsJ_2.id_case(rjU_25);
            double d15 = rsJ_2.id_case(this.rv());
            if (d14 > 1.0E-4 && d15 < 0.01) {
                this.id_byte(this.rv().id_break(rjU_25.id_break * 0.1, 0.0, rjU_25.id_protected * 0.1));
                bl2 = false;
            }
        }
        if (bl2) {
            double d16 = Math.sqrt(rsJ_2.id_case(this.rv()));
            if (d16 < 0.03) {
                this.id_byte(rjU_2.id_class);
            } else {
                this.id_byte(this.rv().id_throws(0.5, 0.0, 0.5));
            }
        }
        double d17 = (double)rfH_22.b_() + 0.5 + (double)rja_32.b_() * 0.5;
        double d18 = (double)rfH_22.d_() + 0.5 + (double)rja_32.d_() * 0.5;
        double d19 = (double)rfH_22.b_() + 0.5 + (double)rja_33.b_() * 0.5;
        double d20 = (double)rfH_22.d_() + 0.5 + (double)rja_33.d_() * 0.5;
        d9 = d19 - d17;
        d10 = d20 - d18;
        if (d9 == 0.0) {
            d4 = d7 - (double)rfH_22.d_();
        } else if (d10 == 0.0) {
            d4 = d5 - (double)rfH_22.b_();
        } else {
            d3 = d5 - d17;
            d2 = d7 - d18;
            d4 = (d3 * d9 + d2 * d10) * 2.0;
        }
        d5 = d17 + d9 * d4;
        d7 = d18 + d10 * d4;
        this.id_new(d5, d6, d7);
        d3 = this.BP() ? 0.75 : 1.0;
        d2 = this.id_protected();
        rjU_24 = this.rv();
        this.id_class(iG_2.SELF, new rjU_2(rfU_2.id_class(d3 * rjU_24.id_break, -d2, d2), 0.0, rfU_2.id_class(d3 * rjU_24.id_protected, -d2, d2)));
        if (rja_32.c_() != 0 && rfU_2.id_byte(this.rx()) - rfH_22.b_() == rja_32.b_() && rfU_2.id_byte(this.BO()) - rfH_22.d_() == rja_32.d_()) {
            this.id_new(this.rx(), this.re() + (double)rja_32.c_(), this.BO());
        } else if (rja_33.c_() != 0 && rfU_2.id_byte(this.rx()) - rfH_22.b_() == rja_33.b_() && rfU_2.id_byte(this.BO()) - rfH_22.d_() == rja_33.d_()) {
            this.id_new(this.rx(), this.re() + (double)rja_33.c_(), this.BO());
        }
        this.id_case();
        rjU_2 rjU_26 = this.id_continue(this.rx(), this.re(), this.BO());
        if (rjU_26 != null && rjU_23 != null) {
            double d21 = (rjU_23.id_byte - rjU_26.id_byte) * 0.05;
            rjU_22 = this.rv();
            d = Math.sqrt(rsJ_2.id_case(rjU_22));
            if (d > 0.0) {
                this.id_byte(rjU_22.id_throws((d + d21) / d, 1.0, (d + d21) / d));
            }
            this.id_new(this.rx(), rjU_26.id_byte, this.BO());
        }
        int n = rfU_2.id_byte(this.rx());
        int n2 = rfU_2.id_byte(this.BO());
        if (n != rfH_22.b_() || n2 != rfH_22.d_()) {
            rjU_22 = this.rv();
            d = Math.sqrt(rsJ_2.id_case(rjU_22));
            this.id_catch(d * (double)(n - rfH_22.b_()), rjU_22.id_byte, d * (double)(n2 - rfH_22.d_()));
        }
        if (bl) {
            rjU_22 = this.rv();
            d = Math.sqrt(rsJ_2.id_case(rjU_22));
            if (d > 0.01) {
                double d22 = 0.06;
                this.id_byte(rjU_22.id_break(rjU_22.id_break / d * 0.06, 0.0, rjU_22.id_protected / d * 0.06));
            } else {
                rjU_2 rjU_27 = this.rv();
                double d23 = rjU_27.id_break;
                double d24 = rjU_27.id_protected;
                if (rCR2 == rCR.EAST_WEST) {
                    if (this.id_class(rfH_22.id_byte())) {
                        d23 = 0.02;
                    } else if (this.id_class(rfH_22.id_extends())) {
                        d23 = -0.02;
                    }
                } else {
                    if (rCR2 != rCR.NORTH_SOUTH) {
                        return;
                    }
                    if (this.id_class(rfH_22.id_private())) {
                        d24 = 0.02;
                    } else if (this.id_class(rfH_22.id_protected())) {
                        d24 = -0.02;
                    }
                }
                this.id_catch(d23, rjU_27.id_byte, d24);
            }
        }
    }

    public void id_byte(int n) {
        this.BQ().id_break(id_private, n);
        this.id_class(true);
    }

    public void id_byte(float f) {
        ((rmE_2)this.id_throws[49]).id_break(id_protected, Float.valueOf(f));
    }

    public xc_3 id_int() {
        return xu_3.id_class.id_continue();
    }

    protected rsJ_2(aI_2<?> aI_22, rYB rYB2, double d, double d2, double d3) {
        this(aI_22, rYB2);
        this.id_new(d, d2, d3);
        this.id_byte(rjU_2.id_class);
        Double d4 = d;
        this.id_throws[8] = d4;
        Double d5 = d2;
        this.id_throws[9] = d5;
        Double d6 = d3;
        this.id_throws[10] = d6;
    }

    protected rsJ_2(aI_2<?> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
        Boolean bl = true;
        this.id_throws[2] = bl;
    }

    @Override
    public void id_this() {
        if (this.id_private() > 0) {
            this.id_class(this.id_private() - 1);
        }
        if (this.id_catch() > 0.0f) {
            this.id_byte(this.id_catch() - 1.0f);
        }
        if (this.re() < -64.0) {
            this.PQ();
        }
        this.PB();
        if (((rYB)this.id_throws[7]).id_continue) {
            if (this.id_volatile > 0) {
                double d = this.rx() + (this.id_final - this.rx()) / (double)this.id_volatile;
                double d2 = this.re() + (this.id_package - this.re()) / (double)this.id_volatile;
                double d3 = this.BO() + (this.id_int - this.BO()) / (double)this.id_volatile;
                double d4 = rfU_2.id_case(this.id_new - (double)((Float)this.id_throws[15]).floatValue());
                Float f = Float.valueOf((float)((double)((Float)this.id_throws[15]).floatValue() + d4 / (double)this.id_volatile));
                this.id_throws[15] = f;
                Float f2 = Float.valueOf((float)((double)((Float)this.id_throws[16]).floatValue() + (this.id_continue - (double)((Float)this.id_throws[16]).floatValue()) / (double)this.id_volatile));
                this.id_throws[16] = f2;
                --this.id_volatile;
                this.id_new(d, d2, d3);
                this.id_case(((Float)this.id_throws[15]).floatValue(), ((Float)this.id_throws[16]).floatValue());
            } else {
                this.PX();
                this.id_case(((Float)this.id_throws[15]).floatValue(), ((Float)this.id_throws[16]).floatValue());
            }
        } else {
            double d;
            rfH_2 rfH_22;
            xc_3 xc_32;
            int n;
            int n2;
            int n3;
            if (!this.rw()) {
                this.id_byte(this.rv().id_break(0.0, -0.04, 0.0));
            }
            if (((rYB)this.id_throws[7]).id_byte(new rfH_2(n3 = rfU_2.id_byte(this.rx()), (n2 = rfU_2.id_byte(this.re())) - 1, n = rfU_2.id_byte(this.BO()))).id_class(rls_3.id_float)) {
                --n2;
            }
            if (Jo_1.id_catch(xc_32 = ((rYB)this.id_throws[7]).id_byte(rfH_22 = new rfH_2(n3, n2, n)))) {
                this.id_byte(rfH_22, xc_32);
                if (xc_32.id_class(xu_3.sT)) {
                    this.id_class(n3, n2, n, (boolean)xc_32.id_byte(Ws_1.id_int));
                }
            } else {
                this.id_throws();
            }
            this.Px();
            Float f = Float.valueOf(0.0f);
            this.id_throws[16] = f;
            double d5 = (Double)this.id_throws[8] - this.rx();
            double d6 = (Double)this.id_throws[10] - this.BO();
            if (d5 * d5 + d6 * d6 > 0.001) {
                Float f3 = Float.valueOf((float)(rfU_2.id_protected(d6, d5) * 180.0 / Math.PI));
                this.id_throws[15] = f3;
                if (this.id_extends) {
                    rsJ_2 rsJ_22 = this;
                    Float f4 = Float.valueOf(((Float)rsJ_22.id_throws[15]).floatValue() + 180.0f);
                    rsJ_22.id_throws[15] = f4;
                }
            }
            if ((d = (double)rfU_2.id_catch(((Float)this.id_throws[15]).floatValue() - ((Float)this.id_throws[17]).floatValue())) < -170.0 || d >= 170.0) {
                rsJ_2 rsJ_23 = this;
                Float f5 = Float.valueOf(((Float)rsJ_23.id_throws[15]).floatValue() + 180.0f);
                rsJ_23.id_throws[15] = f5;
                this.id_extends = !this.id_extends;
            }
            this.id_case(((Float)this.id_throws[15]).floatValue(), ((Float)this.id_throws[16]).floatValue());
            if (this.id_final() == rsd_3.RIDEABLE && rsJ_2.id_case(this.rv()) > 0.01) {
                List<an_3> list = ((rYB)this.id_throws[7]).id_break((an_3)this, this.rN().id_byte(0.2f, 0.0, 0.2f), rpJ_2.id_class(this));
                if (!list.isEmpty()) {
                    for (int i = 0; i < list.size(); ++i) {
                        an_3 an_32 = list.get(i);
                        if (!(an_32 instanceof rhd_3 || an_32 instanceof rMZ || an_32 instanceof rsJ_2 || this.BP() || an_32.Pm())) {
                            an_32.id_this(this);
                            continue;
                        }
                        an_32.id_byte(this);
                    }
                }
            } else {
                for (an_3 an_33 : ((rYB)this.id_throws[7]).id_class((an_3)this, this.rN().id_byte(0.2f, 0.0, 0.2f))) {
                    if (this.id_synchronized(an_33) || !an_33.rG() || !(an_33 instanceof rsJ_2)) continue;
                    an_33.id_byte(this);
                }
            }
            this.PM();
            if (this.ry()) {
                this.rb();
                rsJ_2 rsJ_24 = this;
                Float f6 = Float.valueOf(((Float)rsJ_24.id_throws[31]).floatValue() * 0.5f);
                rsJ_24.id_throws[31] = f6;
            }
            Boolean bl = false;
            this.id_throws[48] = bl;
        }
    }

    @Override
    protected rjU_2 id_class(rpB_2 rpB_22, rqT_2 rqT_22) {
        return iB_2.id_implements(super.id_class(rpB_22, rqT_22));
    }

    public void id_class(int n, int n2, int n3, boolean bl) {
    }

    @Override
    public void id_class(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        this.id_final = d;
        this.id_package = d2;
        this.id_int = d3;
        this.id_new = f;
        this.id_continue = f2;
        this.id_volatile = n + 2;
        this.id_catch(this.id_super, this.id_this, this.id_else);
    }

    public void id_class(boolean bl) {
        this.BQ().id_break(id_implements, bl);
    }

    private boolean id_class(rfH_2 rfH_22) {
        return ((rYB)this.id_throws[7]).id_byte(rfH_22).id_catch((rYB)this.id_throws[7], rfH_22);
    }

    public void id_class(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_class, n);
    }

    public rjU_2 id_class(double d, double d2, double d3, double d4) {
        xc_3 xc_32;
        int n;
        int n2;
        int n3 = rfU_2.id_byte(d);
        if (((rYB)this.id_throws[7]).id_byte(new rfH_2(n3, (n2 = rfU_2.id_byte(d2)) - 1, n = rfU_2.id_byte(d3))).id_class(rls_3.id_float)) {
            --n2;
        }
        if (Jo_1.id_catch(xc_32 = ((rYB)this.id_throws[7]).id_byte(new rfH_2(n3, n2, n)))) {
            rCR rCR2 = xc_32.id_byte(((Jo_1)xc_32.id_break()).id_implements());
            d2 = n2;
            if (rCR2.id_break()) {
                d2 = n2 + 1;
            }
            Pair<rja_3, rja_3> pair = rsJ_2.id_class(rCR2);
            rja_3 rja_32 = (rja_3)pair.getFirst();
            rja_3 rja_33 = (rja_3)pair.getSecond();
            double d5 = rja_33.b_() - rja_32.b_();
            double d6 = rja_33.d_() - rja_32.d_();
            double d7 = Math.sqrt(d5 * d5 + d6 * d6);
            if (rja_32.c_() != 0 && rfU_2.id_byte(d += (d5 /= d7) * d4) - n3 == rja_32.b_() && rfU_2.id_byte(d3 += (d6 /= d7) * d4) - n == rja_32.d_()) {
                d2 += (double)rja_32.c_();
            } else if (rja_33.c_() != 0 && rfU_2.id_byte(d) - n3 == rja_33.b_() && rfU_2.id_byte(d3) - n == rja_33.d_()) {
                d2 += (double)rja_33.c_();
            }
            return this.id_continue(d, d2, d3);
        }
        return null;
    }

    public static rsJ_2 id_class(rYB rYB2, double d, double d2, double d3, rsd_3 rsd_32) {
        if (rsd_32 == rsd_3.CHEST) {
            return new rsk_3(rYB2, d, d2, d3);
        }
        if (rsd_32 == rsd_3.FURNACE) {
            return new rsN_2(rYB2, d, d2, d3);
        }
        if (rsd_32 == rsd_3.TNT) {
            return new rsv_3(rYB2, d, d2, d3);
        }
        if (rsd_32 == rsd_3.SPAWNER) {
            return new rsm_3(rYB2, d, d2, d3);
        }
        if (rsd_32 == rsd_3.HOPPER) {
            return new rsc_3(rYB2, d, d2, d3);
        }
        return rsd_32 == rsd_3.COMMAND_BLOCK ? new rsW_2(rYB2, d, d2, d3) : new rsu_3(rYB2, d, d2, d3);
    }

    private static Pair<rja_3, rja_3> id_class(rCR rCR2) {
        return id_native.get(rCR2);
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        if (this.id_super()) {
            rcd_32.id_class("CustomDisplayTile", true);
            rcd_32.id_class("DisplayState", rco_3.id_class(this.id_package()));
            rcd_32.id_break("DisplayOffset", this.id_new());
        }
    }

    public void id_break(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_break, n);
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (!((rYB)this.id_throws[7]).id_continue && !((Boolean)this.id_throws[27]).booleanValue()) {
            boolean bl;
            if (this.id_class(rye_32)) {
                return false;
            }
            this.id_break(-this.id_implements());
            this.id_class(10);
            this.rf();
            this.id_byte(this.id_catch() + f * 10.0f);
            boolean bl2 = bl = rye_32.id_extends() instanceof rhd_3 && ((rhx_3)((rhd_3)rye_32.id_extends()).id_implements[18]).id_protected;
            if (bl || this.id_catch() > 40.0f) {
                this.Bn();
                if (bl && !this.Bk()) {
                    this.PD();
                } else {
                    this.id_break(rye_32);
                }
            }
            return true;
        }
        return true;
    }

    public void id_break(rye_3 rye_32) {
        this.PD();
        if (((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
            rdn_3 rdn_32 = new rdn_3(rdy_3.ho);
            if (this.Bk()) {
                rdn_32.id_class(this.rD());
            }
            this.a_(rdn_32);
        }
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
        if (rcd_32.id_new("CustomDisplayTile")) {
            this.id_break(rco_3.id_byte(rcd_32.id_int("DisplayState")));
            this.id_byte(rcd_32.id_private("DisplayOffset"));
        }
    }

    public void id_break(xc_3 xc_32) {
        this.BQ().id_break(id_catch, xd_3.id_finally(xc_32));
        this.id_class(true);
    }

    protected void id_throws() {
        double d = this.id_protected();
        rjU_2 rjU_22 = this.rv();
        this.id_catch(rfU_2.id_class(rjU_22.id_break, -d, d), rjU_22.id_byte, rfU_2.id_class(rjU_22.id_protected, -d, d));
        if (((Boolean)this.id_throws[20]).booleanValue()) {
            this.id_byte(this.rv().id_class(0.5));
        }
        this.id_class(iG_2.SELF, this.rv());
        if (!((Boolean)this.id_throws[20]).booleanValue()) {
            this.id_byte(this.rv().id_class(0.95));
        }
    }

    public float id_catch() {
        return ((rmE_2)this.id_throws[49]).id_class(id_protected).floatValue();
    }

    @Override
    public void id_extends(double d, double d2, double d3) {
        this.id_super = d;
        this.id_this = d2;
        this.id_else = d3;
        this.id_catch(this.id_super, this.id_this, this.id_else);
    }

    protected void id_case() {
        double d = this.BP() ? 0.997 : 0.96;
        this.id_byte(this.rv().id_throws(d, 0.0, d));
    }

    public int id_continue() {
        return 6;
    }

    public rjU_2 id_continue(double d, double d2, double d3) {
        xc_3 xc_32;
        int n;
        int n2;
        int n3 = rfU_2.id_byte(d);
        if (((rYB)this.id_throws[7]).id_byte(new rfH_2(n3, (n2 = rfU_2.id_byte(d2)) - 1, n = rfU_2.id_byte(d3))).id_class(rls_3.id_float)) {
            --n2;
        }
        if (Jo_1.id_catch(xc_32 = ((rYB)this.id_throws[7]).id_byte(new rfH_2(n3, n2, n)))) {
            double d4;
            rCR rCR2 = xc_32.id_byte(((Jo_1)xc_32.id_break()).id_implements());
            Pair<rja_3, rja_3> pair = rsJ_2.id_class(rCR2);
            rja_3 rja_32 = (rja_3)pair.getFirst();
            rja_3 rja_33 = (rja_3)pair.getSecond();
            double d5 = (double)n3 + 0.5 + (double)rja_32.b_() * 0.5;
            double d6 = (double)n2 + 0.0625 + (double)rja_32.c_() * 0.5;
            double d7 = (double)n + 0.5 + (double)rja_32.d_() * 0.5;
            double d8 = (double)n3 + 0.5 + (double)rja_33.b_() * 0.5;
            double d9 = (double)n2 + 0.0625 + (double)rja_33.c_() * 0.5;
            double d10 = (double)n + 0.5 + (double)rja_33.d_() * 0.5;
            double d11 = d8 - d5;
            double d12 = (d9 - d6) * 2.0;
            double d13 = d10 - d7;
            if (d11 == 0.0) {
                d4 = d3 - (double)n;
            } else if (d13 == 0.0) {
                d4 = d - (double)n3;
            } else {
                double d14 = d - d5;
                double d15 = d3 - d7;
                d4 = (d14 * d11 + d15 * d13) * 2.0;
            }
            d = d5 + d11 * d4;
            d2 = d6 + d12 * d4;
            d3 = d7 + d13 * d4;
            if (d12 < 0.0) {
                d2 += 1.0;
            } else if (d12 > 0.0) {
                d2 += 0.5;
            }
            return new rjU_2(d, d2, d3);
        }
        return null;
    }

    public int id_implements() {
        return ((rmE_2)this.id_throws[49]).id_class(id_break);
    }

    public int id_new() {
        return !this.id_super() ? this.id_continue() : this.BQ().id_class(id_private).intValue();
    }

    public xc_3 id_package() {
        return !this.id_super() ? this.id_int() : xd_3.id_class(this.BQ().id_class(id_catch));
    }

    public boolean id_super() {
        return this.BQ().id_class(id_implements);
    }

    @Override
    public boolean id_super(an_3 an_32) {
        return rSK.id_class(this, an_32);
    }

    protected double id_protected() {
        return 0.4;
    }

    public int id_private() {
        return ((rmE_2)this.id_throws[49]).id_class(id_class);
    }

    public abstract rsd_3 id_final();

    @Override
    protected float rq() {
        xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte(this.Bs());
        return xc_32.id_class(rls_3.id_float) ? 1.0f : super.rq();
    }

    @Override
    public boolean rG() {
        return true;
    }

    @Override
    public double PS() {
        return 0.0;
    }

    @Override
    public rfl_3 PE() {
        rfl_3 rfl_32 = this.rN();
        return this.id_super() ? rfl_32.id_class((double)Math.abs(this.id_new()) / 16.0) : rfl_32;
    }

    @Override
    public void rF() {
        this.id_break(-this.id_implements());
        this.id_class(10);
        this.id_byte(this.id_catch() + this.id_catch() * 10.0f);
    }

    @Override
    public boolean rY() {
        return (Boolean)this.id_throws[27] == false;
    }

    @Override
    public rpr_3 rS() {
        return this.id_extends ? this.Pg().id_case().id_catch() : this.Pg().id_catch();
    }

    @Override
    protected boolean PK() {
        return false;
    }

    @Override
    public rjU_2 a_(iB_2 iB_22) {
        rpr_3 rpr_32 = this.rS();
        if (rpr_32.id_final() == rpB_2.Y) {
            return super.a_(iB_22);
        }
        int[][] nArray = rqI_2.id_class(rpr_32);
        rfH_2 rfH_23 = this.Bs();
        rfw_3 rfw_32 = new rfw_3();
        ImmutableList<iM_2> immutableList = iB_22.BV();
        for (iM_2 iM_22 : immutableList) {
            ap_3 ap_32 = iB_22.a_(iM_22);
            float f = Math.min(ap_32.id_class, 1.0f) / 2.0f;
            UnmodifiableIterator unmodifiableIterator = ((ImmutableList)id_finally.get((Object)iM_22)).iterator();
            while (unmodifiableIterator.hasNext()) {
                int n = (Integer)unmodifiableIterator.next();
                for (int[] nArray2 : nArray) {
                    rjU_2 rjU_22;
                    rfl_3 rfl_32;
                    rfw_32.id_class(rfH_23.b_() + nArray2[0], rfH_23.c_() + n, rfH_23.d_() + nArray2[1]);
                    double d = ((rYB)this.id_throws[7]).id_class(rqI_2.id_class((rRq_1)((rYB)this.id_throws[7]), (rfH_2)rfw_32), () -> rqI_2.id_class((rRq_1)((rYB)this.id_throws[7]), rfw_32.id_break()));
                    if (!rqI_2.id_class(d) || !rqI_2.id_class((rYB)this.id_throws[7], iB_22, (rfl_32 = new rfl_3(-f, 0.0, -f, f, ap_32.id_break, f)).id_protected(rjU_22 = rjU_2.id_class(rfw_32, d)))) continue;
                    iB_22.id_class(iM_22);
                    return rjU_22;
                }
            }
        }
        double d = this.rN().id_throws;
        rfw_32.id_break((double)rfH_23.b_(), d, (double)rfH_23.d_());
        for (iM_2 iM_23 : immutableList) {
            double d2 = iB_22.a_((iM_2)iM_23).id_break;
            int n = rfU_2.id_throws(d - (double)rfw_32.c_() + d2);
            double d3 = rqI_2.id_class(rfw_32, n, rfH_22 -> ((rYB)this.id_throws[7]).id_byte((rfH_2)rfH_22).id_extends((rYB)this.id_throws[7], (rfH_2)rfH_22));
            if (!(d + d2 <= d3)) continue;
            iB_22.id_class(iM_23);
            break;
        }
        return super.a_(iB_22);
    }

    @Override
    protected void m_() {
        ((rmE_2)this.id_throws[49]).id_class(id_class, 0);
        ((rmE_2)this.id_throws[49]).id_class(id_break, 1);
        ((rmE_2)this.id_throws[49]).id_class(id_protected, Float.valueOf(0.0f));
        ((rmE_2)this.id_throws[49]).id_class(id_catch, xd_3.id_finally(xu_3.id_class.id_continue()));
        ((rmE_2)this.id_throws[49]).id_class(id_private, 6);
        ((rmE_2)this.id_throws[49]).id_class(id_implements, false);
    }

    @Override
    public ruS_2<?> p_() {
        return new rFJ(this);
    }
}

