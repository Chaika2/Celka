/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 */
package celestial;

import celestial.AO;
import celestial.Aq_1;
import celestial.Ax_1;
import celestial.CB;
import celestial.Cy_1;
import celestial.Hh_1;
import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.NQ;
import celestial.Nd_1;
import celestial.Np_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.an_3;
import celestial.cG_2;
import celestial.cb_3;
import celestial.event.PacketEvent;
import celestial.gF_2;
import celestial.gv_3;
import celestial.rKv_1;
import celestial.rLQ;
import celestial.rLx_1;
import celestial.rRJ;
import celestial.rRV;
import celestial.rRd_1;
import celestial.rRl_1;
import celestial.rRu_1;
import celestial.rVL;
import celestial.rVm_1;
import celestial.rWB;
import celestial.rXE;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rYG;
import celestial.rYl_1;
import celestial.rYm_1;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfR_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rlQ_2;
import celestial.rls_3;
import celestial.rnW_2;
import celestial.rns_3;
import celestial.roJ_2;
import celestial.roN_2;
import celestial.roX_2;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqM_2;
import celestial.rqR_2;
import celestial.rrAQ;
import celestial.rrFD;
import celestial.rrFK;
import celestial.rrGb_1;
import celestial.rrGs_1;
import celestial.rrJf_1;
import celestial.rrME;
import celestial.rrQX;
import celestial.rrbb_3;
import celestial.rrbg_3;
import celestial.rrbl_3;
import celestial.rrdZ;
import celestial.rrnM_2;
import celestial.rrnb_3;
import celestial.rrsC_2;
import celestial.rrxr_3;
import celestial.ruS_2;
import celestial.rud_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.yX_2;
import celestial.yl_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BooleanSupplier;

public class gm_3
extends rYB {
    private final Int2ObjectMap<an_3> id_this = new Int2ObjectOpenHashMap();
    private final Aq_1 id_else;
    private final yX_2 id_synchronized;
    private final gv_3 id_return;
    private final gF_2 id_public;
    private final QY id_goto = QY.id_instanceof();
    private final List<cG_2> id_while = Lists.newArrayList();
    private rns_3 id_try = new rns_3();
    private final Map<String, rrGb_1> id_instanceof = Maps.newHashMap();
    private int id_throw;
    private final Object2ObjectArrayMap<rrsC_2, yl_3> id_interface = rqR_2.id_class(new Object2ObjectArrayMap(3), (T object2ObjectArrayMap) -> {
        object2ObjectArrayMap.put((Object)rYm_1.id_class, (Object)new yl_3());
        object2ObjectArrayMap.put((Object)rYm_1.id_break, (Object)new yl_3());
        object2ObjectArrayMap.put((Object)rYm_1.id_byte, (Object)new yl_3());
    });
    private final AO id_char;
    private boolean id_abstract = false;

    @Override
    public rYG id_byte(int n, int n2, int n3) {
        return this.id_new().id_break(rVL.n).id_byte(rYl_1.id_break);
    }

    public float id_byte(float f) {
        float f2 = this.id_protected(f);
        float f3 = 1.0f - (rfU_2.id_break(f2 * ((float)Math.PI * 2)) * 2.0f + 0.25f);
        f3 = rfU_2.id_class(f3, 0.0f, 1.0f);
        return f3 * f3 * 0.5f;
    }

    public Iterable<an_3> id_byte() {
        return this.id_this.values();
    }

    @Override
    public void id_byte(int n) {
        this.id_throw = n;
    }

    public void id_byte(an_3 an_32) {
        rrME.id_break(an_32, this);
        if (rrbb_3.rL()) {
            rrbg_3.id_break(an_32, rrbb_3.z());
        }
    }

    @Override
    public rlQ_2 id_int() {
        return this.id_else.id_extends();
    }

    public gm_3(Aq_1 aq_1, gv_3 gv_32, rqM_2<rYB> rqM_22, rRJ rRJ2, int n, yX_2 yX_22, boolean bl, long l) {
        super(gv_32, rqM_22, rRJ2, true, bl, l);
        this.id_else = aq_1;
        this.id_char = new AO(this, n);
        this.id_return = gv_32;
        this.id_synchronized = yX_22;
        this.id_public = gF_2.id_class(rRJ2);
        this.id_break(new rfH_2(8, 64, 8), 0.0f);
        this.id_double();
        this.id_switch();
        if ((Ax_1)this.id_goto.id_class[55] != null && ((Ax_1)this.id_goto.id_class[55]).getClass() == Ax_1.class) {
            rrJf_1 rrJf_12 = new rrJf_1(this.id_goto, this.id_else);
            this.id_goto.id_class[55] = rrJf_12;
            rrbl_3.id_class((rrJf_1)((Ax_1)this.id_goto.id_class[55]));
        }
    }

    public String toString() {
        return "ClientLevel";
    }

    public rfH_2 id_this() {
        rfH_2 rfH_22 = new rfH_2(this.id_new.id_class(), this.id_new.id_break(), this.id_new.id_byte());
        if (!this.id_instanceof().id_class(rfH_22)) {
            rfH_22 = this.id_class(rKv_1.MOTION_BLOCKING, new rfH_2(this.id_instanceof().id_class(), 0.0, this.id_instanceof().id_break()));
        }
        return rfH_22;
    }

    public void id_class(rfH_2 rfH_22, rqA_2 rqA_22, rqL_2 rqL_22, float f, float f2, boolean bl) {
        this.id_class((double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, rqA_22, rqL_22, f, f2, bl);
    }

    @Override
    public rrGb_1 id_class(String string) {
        return this.id_instanceof.get(string);
    }

    @Override
    public void id_class(rrGb_1 rrGb_12) {
        this.id_instanceof.put(rrGb_12.id_throws(), rrGb_12);
    }

    @Override
    public void id_class(rfH_2 rfH_22, xc_3 xc_32, xc_3 xc_33, int n) {
        this.id_synchronized.id_class(this, rfH_22, xc_32, xc_33, n);
    }

    @Override
    public void id_class(rhd_3 rhd_32, an_3 an_32, rqA_2 rqA_22, rqL_2 rqL_22, float f, float f2) {
        if (rhd_32 == (cb_3)this.id_goto.id_class[57]) {
            this.id_goto.c().id_class((NQ)new Nd_1(rqA_22, rqL_22, an_32));
        }
    }

    @Override
    public void id_class(double d, double d2, double d3, double d4, double d5, double d6, rcd_3 rcd_32) {
        ((Cy_1)this.id_goto.id_class[12]).id_class(new CB(this, d, d2, d3, d4, d5, d6, (Cy_1)this.id_goto.id_class[12], rcd_32));
    }

    @Override
    public void id_class(ruS_2<?> ruS_22) {
        this.id_else.id_class(ruS_22);
    }

    public void id_class(rns_3 rns_32) {
        this.id_try = rns_32;
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, xc_3 xc_32, int n) {
        this.id_abstract = this.O();
        boolean bl = super.id_class(rfH_22, xc_32, n);
        PacketEvent.id_break(rfH_22, xc_32, bl);
        this.id_abstract = false;
        return bl;
    }

    @Override
    public void id_class(double d, double d2, double d3, rqA_2 rqA_22, rqL_2 rqL_22, float f, float f2, boolean bl) {
        double d4 = ((Hh_1)this.id_goto.id_class[16]).id_finally().id_break().id_protected(d, d2, d3);
        Np_1 np_1 = new Np_1(rqA_22, rqL_22, f, f2, d, d2, d3);
        if (bl && d4 > 100.0) {
            double d5 = Math.sqrt(d4) / 40.0;
            this.id_goto.c().id_class(np_1, (int)(d5 * 20.0));
        } else {
            this.id_goto.c().id_class(np_1);
        }
    }

    public rjU_2 id_class(rfH_2 rfH_22, float f) {
        float f2;
        float f3;
        float f4 = this.id_protected(f);
        float f5 = rfU_2.id_break(f4 * ((float)Math.PI * 2)) * 2.0f + 0.5f;
        f5 = rfU_2.id_class(f5, 0.0f, 1.0f);
        rYG rYG2 = this.id_implements(rfH_22);
        int n = rYG2.id_class();
        float f6 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n & 0xFF) / 255.0f;
        f6 *= f5;
        f7 *= f5;
        f8 *= f5;
        float f9 = this.id_private(f);
        if (f9 > 0.0f) {
            f3 = (f6 * 0.3f + f7 * 0.59f + f8 * 0.11f) * 0.6f;
            f2 = 1.0f - f9 * 0.75f;
            f6 = f6 * f2 + f3 * (1.0f - f2);
            f7 = f7 * f2 + f3 * (1.0f - f2);
            f8 = f8 * f2 + f3 * (1.0f - f2);
        }
        if ((f3 = this.id_case(f)) > 0.0f) {
            f2 = (f6 * 0.3f + f7 * 0.59f + f8 * 0.11f) * 0.2f;
            float f10 = 1.0f - f3 * 0.75f;
            f6 = f6 * f10 + f2 * (1.0f - f10);
            f7 = f7 * f10 + f2 * (1.0f - f10);
            f8 = f8 * f10 + f2 * (1.0f - f10);
        }
        if (this.id_throw > 0) {
            f2 = (float)this.id_throw - f;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            f6 = f6 * (1.0f - (f2 *= 0.45f)) + 0.8f * f2;
            f7 = f7 * (1.0f - f2) + 0.8f * f2;
            f8 = f8 * (1.0f - f2) + 1.0f * f2;
        }
        return new rjU_2(f6, f7, f8);
    }

    @Override
    public float id_class(rpr_3 rpr_32, boolean bl) {
        boolean bl2 = this.id_break().id_throws();
        boolean bl3 = rrbb_3.rs();
        if (!bl) {
            return bl2 ? 0.9f : 1.0f;
        }
        switch (rpr_32) {
            case DOWN: {
                return bl2 ? 0.9f : (bl3 ? rrdZ.sp : 0.5f);
            }
            case UP: {
                return bl2 ? 0.9f : 1.0f;
            }
            case NORTH: 
            case SOUTH: {
                if (rrbb_3.rs()) {
                    return rrdZ.sT;
                }
                return 0.8f;
            }
            case WEST: 
            case EAST: {
                if (rrbb_3.rs()) {
                    return rrdZ.sq;
                }
                return 0.6f;
            }
        }
        return 1.0f;
    }

    @Override
    public int id_class(rfH_2 rfH_22, rrsC_2 rrsC_22) {
        yl_3 yl_32 = (yl_3)this.id_interface.get((Object)rrsC_22);
        return yl_32.id_class(rfH_22, () -> this.id_break(rfH_22, rrsC_22));
    }

    @Override
    public void id_class(rfH_2 rfH_22, xc_3 xc_32, xc_3 xc_33) {
        this.id_synchronized.id_class(rfH_22, xc_32, xc_33);
    }

    @Override
    public void id_class(int n, rfH_2 rfH_22, int n2) {
        this.id_synchronized.id_break(n, rfH_22, n2);
    }

    @Override
    public void id_class(rhd_3 rhd_32, int n, rfH_2 rfH_22, int n2) {
        try {
            this.id_synchronized.id_class(rhd_32, n, rfH_22, n2);
        }
        catch (Throwable throwable) {
            KY kY = KY.id_class(throwable, "Playing level event");
            Ko_1 ko_1 = kY.id_class("Level event being played");
            ko_1.id_class("Block coordinates", Ko_1.id_class(rfH_22));
            ko_1.id_class("Event source", rhd_32);
            ko_1.id_class("Event type", n);
            ko_1.id_class("Event data", n2);
            throw new KU(kY);
        }
    }

    @Override
    public void id_class(rLx_1 rLx_12, double d, double d2, double d3, double d4, double d5, double d6) {
        this.id_synchronized.id_class(rLx_12, rLx_12.id_protected().id_throws(), d, d2, d3, d4, d5, d6);
    }

    @Override
    public void id_class(rLx_1 rLx_12, boolean bl, double d, double d2, double d3, double d4, double d5, double d6) {
        this.id_synchronized.id_class(rLx_12, rLx_12.id_protected().id_throws() || bl, d, d2, d3, d4, d5, d6);
    }

    public float id_class(float f) {
        float f2 = this.id_protected(f);
        float f3 = 1.0f - (rfU_2.id_break(f2 * ((float)Math.PI * 2)) * 2.0f + 0.2f);
        f3 = rfU_2.id_class(f3, 0.0f, 1.0f);
        f3 = 1.0f - f3;
        f3 = (float)((double)f3 * (1.0 - (double)(this.id_private(f) * 5.0f) / 16.0));
        f3 = (float)((double)f3 * (1.0 - (double)(this.id_case(f) * 5.0f) / 16.0));
        return f3 * 0.8f + 0.2f;
    }

    public void id_class(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rfH_22, xc_32, 19);
    }

    public void id_class(an_3 an_32, an_3 an_33) {
        if (!((Boolean)an_33.id_throws[27]).booleanValue() && an_33.ra() == an_32) {
            if (an_33 instanceof rhd_3 || this.id_native().id_class(an_33)) {
                an_33.id_native(an_33.rx(), an_33.re(), an_33.BO());
                Float f = Float.valueOf(((Float)an_33.id_throws[15]).floatValue());
                an_33.id_throws[17] = f;
                Float f2 = Float.valueOf(((Float)an_33.id_throws[16]).floatValue());
                an_33.id_throws[18] = f2;
                if (((Boolean)an_33.id_throws[50]).booleanValue()) {
                    an_3 an_34 = an_33;
                    Integer n = (Integer)an_34.id_throws[41] + 1;
                    an_34.id_throws[41] = n;
                    an_33.A();
                }
                this.id_case(an_33);
                if (((Boolean)an_33.id_throws[50]).booleanValue()) {
                    for (an_3 an_35 : an_33.Bh()) {
                        this.id_class(an_33, an_35);
                    }
                }
            }
        } else {
            an_33.BH();
        }
    }

    public void id_class(int n, int n2, int n3) {
        Random random = new Random();
        boolean bl = false;
        if (((Ax_1)this.id_goto.id_class[55]).id_native() == rRl_1.CREATIVE) {
            for (rdn_3 rdn_32 : ((cb_3)this.id_goto.id_class[57]).rs()) {
                if (rdn_32.id_break() != xu_3.Ec.id_case()) continue;
                bl = true;
                break;
            }
        }
        rfw_3 rfw_32 = new rfw_3();
        for (int i = 0; i < 667; ++i) {
            this.id_class(n, n2, n3, 16, random, bl, rfw_32);
            this.id_class(n, n2, n3, 32, random, bl, rfw_32);
        }
    }

    public void id_class(int n, int n2, int n3, int n4, Random random, boolean bl, rfw_3 rfw_32) {
        int n5 = n + this.id_int.nextInt(n4) - this.id_int.nextInt(n4);
        int n6 = n2 + this.id_int.nextInt(n4) - this.id_int.nextInt(n4);
        int n7 = n3 + this.id_int.nextInt(n4) - this.id_int.nextInt(n4);
        rfw_32.id_class(n5, n6, n7);
        xc_3 xc_32 = this.id_byte(rfw_32);
        xc_32.id_break().id_class(xc_32, (rYB)this, (rfH_2)rfw_32, random);
        rXE rXE2 = this.id_break(rfw_32);
        if (!rXE2.id_byte()) {
            rXE2.id_class(this, rfw_32, random);
            rLx_1 rLx_12 = rXE2.id_private();
            if (rLx_12 != null && this.id_int.nextInt(10) == 0) {
                boolean bl2 = xc_32.id_protected(this, rfw_32, rpr_3.DOWN);
                rfH_2 rfH_22 = rfw_32.id_break();
                this.id_class(rfH_22, this.id_byte(rfH_22), rLx_12, bl2);
            }
        }
        if (bl && xc_32.id_class(xu_3.Ec)) {
            this.id_class(rLQ.id_byte, (double)n5 + 0.5, (double)n6 + 0.5, (double)n7 + 0.5, 0.0, 0.0, 0.0);
        }
        if (!xc_32.id_new(this, rfw_32)) {
            this.id_implements(rfw_32).id_package().ifPresent(rYV2 -> {
                if (rYV2.id_class(this.id_int)) {
                    this.id_class(rYV2.id_class(), (double)rfw_32.b_() + this.id_int.nextDouble(), (double)rfw_32.c_() + this.id_int.nextDouble(), (double)rfw_32.d_() + this.id_int.nextDouble(), 0.0, 0.0, 0.0);
                }
            });
        }
    }

    public void id_class(an_3 an_32) {
        if (!(an_32 instanceof rhd_3) && !this.id_native().id_class(an_32)) {
            this.id_case(an_32);
        } else {
            an_32.id_native(an_32.rx(), an_32.re(), an_32.BO());
            Float f = Float.valueOf(((Float)an_32.id_throws[15]).floatValue());
            an_32.id_throws[17] = f;
            Float f2 = Float.valueOf(((Float)an_32.id_throws[16]).floatValue());
            an_32.id_throws[18] = f2;
            if (((Boolean)an_32.id_throws[50]).booleanValue() || an_32.id_native()) {
                an_3 an_33 = an_32;
                Integer n = (Integer)an_33.id_throws[41] + 1;
                an_33.id_throws[41] = n;
                an_32.id_this();
            }
            this.id_case(an_32);
            if (((Boolean)an_32.id_throws[50]).booleanValue()) {
                for (an_3 an_34 : an_32.Bh()) {
                    this.id_class(an_32, an_34);
                }
            }
        }
    }

    public void id_class(int n, an_3 an_32) {
        if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrnb_3.id_class(an_32)).id_byte()) {
            return;
        }
        this.id_break(n, an_32);
    }

    public void id_class(int n) {
        an_3 an_32 = (an_3)this.id_this.remove(n);
        if (an_32 != null) {
            an_32.PD();
            this.id_catch(an_32);
            rrAQ.id_class(an_32);
        }
    }

    public void id_class(int n, cG_2 cG_22) {
        this.id_break(n, cG_22);
        this.id_while.add(cG_22);
        rrnM_2.id_break(cG_22);
    }

    public void id_class(int n, int n2) {
        this.id_interface.forEach((rrsC_22, yl_32) -> yl_32.id_class(n, n2));
    }

    public void id_class(roJ_2 roJ_22) {
        Collection collection = rrxr_3.PR.id_protected() ? (Collection)rrxr_3.id_class(this, rrxr_3.PR) : this.id_implements;
        collection.addAll(roJ_22.id_volatile().values());
        this.id_char.id_class().id_class(roJ_22.id_private(), false);
    }

    public void id_class(long l) {
        this.id_return.id_class(l);
    }

    private void id_class(rfH_2 rfH_22, rLx_1 rLx_12, rjC_2 rjC_22, double d) {
        this.id_class((double)rfH_22.b_() + rjC_22.id_break(rpB_2.X), (double)rfH_22.b_() + rjC_22.id_byte(rpB_2.X), (double)rfH_22.d_() + rjC_22.id_break(rpB_2.Z), (double)rfH_22.d_() + rjC_22.id_byte(rpB_2.Z), d, rLx_12);
    }

    public void id_class(BooleanSupplier booleanSupplier) {
        this.id_instanceof().id_super();
        this.M();
        this.id_char.id_class(booleanSupplier);
    }

    private void id_class(double d, double d2, double d3, double d4, double d5, rLx_1 rLx_12) {
        this.id_class(rLx_12, rfU_2.id_protected(this.id_int.nextDouble(), d, d2), d5, rfU_2.id_protected(this.id_int.nextDouble(), d3, d4), 0.0, 0.0, 0.0);
    }

    private void id_class(rfH_2 rfH_22, xc_3 xc_32, rLx_1 rLx_12, boolean bl) {
        if (xc_32.id_volatile().id_byte()) {
            rjC_2 rjC_22 = xc_32.id_extends(this, rfH_22);
            double d = rjC_22.id_byte(rpB_2.Y);
            if (d < 1.0) {
                if (bl) {
                    this.id_class((double)rfH_22.b_(), (double)(rfH_22.b_() + 1), (double)rfH_22.d_(), (double)(rfH_22.d_() + 1), (double)(rfH_22.c_() + 1) - 0.05, rLx_12);
                }
            } else if (!xc_32.id_class(rls_3.B)) {
                double d2 = rjC_22.id_break(rpB_2.Y);
                if (d2 > 0.0) {
                    this.id_class(rfH_22, rLx_12, rjC_22, (double)rfH_22.c_() + d2 - 0.05);
                } else {
                    rfH_2 rfH_23 = rfH_22.id_break();
                    xc_3 xc_33 = this.id_byte(rfH_23);
                    rjC_2 rjC_23 = xc_33.id_extends(this, rfH_23);
                    double d3 = rjC_23.id_byte(rpB_2.Y);
                    if (d3 < 1.0 && xc_33.id_volatile().id_byte()) {
                        this.id_class(rfH_22, rLx_12, rjC_22, (double)rfH_22.c_() - 0.05);
                    }
                }
            }
        }
    }

    @Override
    public void id_class(rhd_3 rhd_32, double d, double d2, double d3, rqA_2 rqA_22, rqL_2 rqL_22, float f, float f2) {
        if (rhd_32 == (cb_3)this.id_goto.id_class[57]) {
            this.id_class(d, d2, d3, rqA_22, rqL_22, f, f2, false);
        }
    }

    @Override
    public Ko_1 id_class(KY kY) {
        Ko_1 ko_1 = super.id_class(kY);
        ko_1.id_class("Server brand", () -> ((cb_3)this.id_goto.id_class[57]).id_short());
        ko_1.id_class("Server type", () -> this.id_goto.id_this() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
        return ko_1;
    }

    @Override
    public void id_break(rLx_1 rLx_12, boolean bl, double d, double d2, double d3, double d4, double d5, double d6) {
        this.id_synchronized.id_class(rLx_12, rLx_12.id_protected().id_throws() || bl, true, d, d2, d3, d4, d5, d6);
    }

    @Override
    public void id_break(rLx_1 rLx_12, double d, double d2, double d3, double d4, double d5, double d6) {
        this.id_synchronized.id_class(rLx_12, false, true, d, d2, d3, d4, d5, d6);
    }

    public gF_2 id_break() {
        return this.id_public;
    }

    private void id_break(int n, an_3 an_32) {
        this.id_class(n);
        this.id_this.put(n, (Object)an_32);
        this.id_native().id_class(rfU_2.id_byte(an_32.rx() / 16.0), rfU_2.id_byte(an_32.BO() / 16.0), roN_2.id_volatile, true).id_class(an_32);
        this.id_break(an_32);
    }

    public void id_break(rfH_2 rfH_22, float f) {
        this.id_new.id_class(rfH_22, f);
    }

    public int id_break(rfH_2 rfH_22, rrsC_2 rrsC_22) {
        int n = ((Qw_1)QY.id_instanceof().id_class[20]).id_abstract;
        if (n == 0) {
            return rrsC_22.getColor(this.id_implements(rfH_22), rfH_22.b_(), rfH_22.d_());
        }
        int n2 = (n * 2 + 1) * (n * 2 + 1);
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        rfR_2 rfR_22 = new rfR_2(rfH_22.b_() - n, rfH_22.c_(), rfH_22.d_() - n, rfH_22.b_() + n, rfH_22.c_(), rfH_22.d_() + n);
        rfw_3 rfw_32 = new rfw_3();
        while (rfR_22.id_class()) {
            rfw_32.id_class(rfR_22.id_break(), rfR_22.id_byte(), rfR_22.id_protected());
            int n6 = rrsC_22.getColor(this.id_implements(rfw_32), rfw_32.b_(), rfw_32.d_());
            n3 += (n6 & 0xFF0000) >> 16;
            n4 += (n6 & 0xFF00) >> 8;
            n5 += n6 & 0xFF;
        }
        return (n3 / n2 & 0xFF) << 16 | (n4 / n2 & 0xFF) << 8 | n5 / n2 & 0xFF;
    }

    public void id_break(long l) {
        if (l < 0L) {
            l = -l;
            this.B().id_class(rRu_1.id_finally).id_class(false, (rnW_2)null);
        } else {
            this.B().id_class(rRu_1.id_finally).id_class(true, (rnW_2)null);
        }
        this.id_return.id_break(l);
    }

    public rjU_2 id_break(float f) {
        float f2;
        float f3;
        float f4 = this.id_protected(f);
        float f5 = rfU_2.id_break(f4 * ((float)Math.PI * 2)) * 2.0f + 0.5f;
        f5 = rfU_2.id_class(f5, 0.0f, 1.0f);
        float f6 = 1.0f;
        float f7 = 1.0f;
        float f8 = 1.0f;
        float f9 = this.id_private(f);
        if (f9 > 0.0f) {
            f3 = (f6 * 0.3f + f7 * 0.59f + f8 * 0.11f) * 0.6f;
            f2 = 1.0f - f9 * 0.95f;
            f6 = f6 * f2 + f3 * (1.0f - f2);
            f7 = f7 * f2 + f3 * (1.0f - f2);
            f8 = f8 * f2 + f3 * (1.0f - f2);
        }
        f6 *= f5 * 0.9f + 0.1f;
        f7 *= f5 * 0.9f + 0.1f;
        f8 *= f5 * 0.85f + 0.15f;
        f3 = this.id_case(f);
        if (f3 > 0.0f) {
            f2 = (f6 * 0.3f + f7 * 0.59f + f8 * 0.11f) * 0.2f;
            float f10 = 1.0f - f3 * 0.95f;
            f6 = f6 * f10 + f2 * (1.0f - f10);
            f7 = f7 * f10 + f2 * (1.0f - f10);
            f8 = f8 * f10 + f2 * (1.0f - f10);
        }
        return new rjU_2(f6, f7, f8);
    }

    @Override
    public boolean id_break(int n, int n2) {
        return true;
    }

    @Override
    public an_3 id_break(int n) {
        return (an_3)this.id_this.get(n);
    }

    public void id_break(roJ_2 roJ_22) {
        for (Int2ObjectMap.Entry entry : this.id_this.int2ObjectEntrySet()) {
            an_3 an_32 = (an_3)entry.getValue();
            int n = rfU_2.id_byte(an_32.rx() / 16.0);
            int n2 = rfU_2.id_byte(an_32.BO() / 16.0);
            if (n != roJ_22.id_private().id_break || n2 != roJ_22.id_private().id_byte) continue;
            roJ_22.id_class(an_32);
        }
    }

    public void id_break(an_3 an_32) {
        rrME.id_class(an_32, (rYB)this);
        if (rrbb_3.rL()) {
            rrbg_3.id_class(an_32, rrbb_3.z());
        }
    }

    @Override
    public void id_break(int n, rfH_2 rfH_22, int n2) {
        this.id_synchronized.id_class(n, rfH_22, n2);
    }

    public void id_break(int n, int n2, int n3) {
        this.id_synchronized.id_class(n, n2, n3);
    }

    public void id_throws() {
        this.id_interface.forEach((rrsC_22, yl_32) -> yl_32.id_class());
    }

    private void M() {
        this.id_class(this.id_new.id_throws() + 1L);
        if (this.id_new.id_finally().id_break(rRu_1.id_finally)) {
            this.id_break(this.id_new.id_case() + 1L);
        }
    }

    @Override
    public rRV<xd_3> id_finally() {
        return rRd_1.id_class();
    }

    @Override
    public void id_catch() {
        rud_3 rud_32 = this.id_else.id_class();
        rud_32.id_class(new rgn_3("multiplayer.status.quitting"));
        rrFK.id_class((rrFD)((Object)rrFD.staticFields1658baa549203f63991cdcef51acf497[1]), rgP_2.id_byte(""), rud_32);
    }

    private void id_catch(an_3 an_32) {
        an_32.K();
        if (((Boolean)an_32.id_throws[50]).booleanValue()) {
            this.id_throws((Integer)an_32.id_throws[51], (Integer)an_32.id_throws[53]).id_break(an_32);
        }
        this.id_while.remove(an_32);
        this.id_byte(an_32);
    }

    private boolean O() {
        if ((Ax_1)this.id_goto.id_class[55] instanceof rrJf_1) {
            rrJf_1 rrJf_12 = (rrJf_1)((Ax_1)this.id_goto.id_class[55]);
            return rrJf_12.id_new();
        }
        return false;
    }

    @Override
    public rRV<rXs_1> id_extends() {
        return rRd_1.id_class();
    }

    @Override
    public /* synthetic */ roX_2 id_goto() {
        return this.id_native();
    }

    private void id_case(an_3 an_32) {
        if (an_32.BE()) {
            int n = rfU_2.id_byte(an_32.rx() / 16.0);
            int n2 = rfU_2.id_byte(an_32.re() / 16.0);
            int n3 = rfU_2.id_byte(an_32.BO() / 16.0);
            if (!((Boolean)an_32.id_throws[50]).booleanValue() || (Integer)an_32.id_throws[51] != n || (Integer)an_32.id_throws[52] != n2 || (Integer)an_32.id_throws[53] != n3) {
                if (((Boolean)an_32.id_throws[50]).booleanValue() && this.id_break((int)((Integer)an_32.id_throws[51]), (int)((Integer)an_32.id_throws[53]))) {
                    this.id_throws((Integer)an_32.id_throws[51], (Integer)an_32.id_throws[53]).id_class(an_32, (int)((Integer)an_32.id_throws[52]));
                }
                if (!an_32.rn() && !this.id_break(n, n3)) {
                    if (((Boolean)an_32.id_throws[50]).booleanValue()) {
                        id_class.warn("Entity {} left loaded chunk area", (Object)an_32);
                    }
                    Boolean bl = false;
                    an_32.id_throws[50] = bl;
                } else {
                    this.id_throws(n, n3).id_class(an_32);
                }
            }
        }
    }

    public int id_case() {
        return this.id_this.size();
    }

    public List<cG_2> id_continue() {
        return this.id_while;
    }

    public float id_else() {
        return this.id_new.id_protected();
    }

    @Override
    public rWB id_implements() {
        return this.id_else.id_protected();
    }

    @Override
    public rVm_1 id_new() {
        return this.id_else.id_package();
    }

    @Override
    public rns_3 id_package() {
        return this.id_try;
    }

    public Int2ObjectMap<an_3> id_return() {
        return this.id_this;
    }

    public int id_super() {
        return this.id_throw;
    }

    @Override
    public /* synthetic */ rrGs_1 id_public() {
        return this.id_synchronized();
    }

    public void id_protected() {
        ObjectIterator objectIterator = this.id_this.int2ObjectEntrySet().iterator();
        cb_3 cb_32 = (cb_3)this.id_goto.id_class[57];
        while (objectIterator.hasNext()) {
            Int2ObjectMap.Entry entry = (Int2ObjectMap.Entry)objectIterator.next();
            an_3 an_32 = (an_3)entry.getValue();
            if (an_32 == cb_32 || an_32.Pm()) continue;
            if (!((Boolean)an_32.id_throws[27]).booleanValue()) {
                this.id_class(this::id_class, an_32);
            }
            if (!((Boolean)an_32.id_throws[27]).booleanValue()) continue;
            objectIterator.remove();
            this.id_catch(an_32);
        }
        if (cb_32 != null && !cb_32.Pm()) {
            if (!((Boolean)cb_32.id_throws[27]).booleanValue()) {
                this.id_class(this::id_class, (an_3)cb_32);
            }
            if (((Boolean)cb_32.id_throws[27]).booleanValue()) {
                this.id_this.remove(cb_32.V());
                this.id_catch(cb_32);
            }
        }
        this.id_transient();
    }

    public void id_private() {
        ObjectIterator objectIterator = this.id_this.int2ObjectEntrySet().iterator();
        while (objectIterator.hasNext()) {
            Int2ObjectMap.Entry entry = (Int2ObjectMap.Entry)objectIterator.next();
            an_3 an_32 = (an_3)entry.getValue();
            if (!((Boolean)an_32.id_throws[27]).booleanValue()) continue;
            objectIterator.remove();
            this.id_catch(an_32);
        }
    }

    @Override
    public int id_final() {
        return 0;
    }

    public boolean id_volatile() {
        return this.id_abstract;
    }

    public gv_3 id_synchronized() {
        return this.id_return;
    }

    public AO id_native() {
        return this.id_char;
    }
}

