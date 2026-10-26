/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.an_3;
import celestial.au_3;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iF_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.iZ_2;
import celestial.ig_3;
import celestial.il_3;
import celestial.iq_3;
import celestial.is_3;
import celestial.it_3;
import celestial.iz_3;
import celestial.rGi_1;
import celestial.rLA;
import celestial.rLD;
import celestial.rLQ;
import celestial.rLY;
import celestial.rMZ;
import celestial.rPL;
import celestial.rPm_1;
import celestial.rRO;
import celestial.rRP;
import celestial.rRR;
import celestial.rRf_1;
import celestial.rRg_1;
import celestial.rRh_1;
import celestial.rSg_1;
import celestial.rVL;
import celestial.rXA;
import celestial.rYB;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcf_3;
import celestial.rdI_2;
import celestial.rdb_3;
import celestial.rdf_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfK_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rgD_2;
import celestial.rgP_2;
import celestial.rgY_2;
import celestial.rga_3;
import celestial.rgn_3;
import celestial.rha_3;
import celestial.rhd_3;
import celestial.rhi_3;
import celestial.rlB_2;
import celestial.rmE_2;
import celestial.rnW_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rrEr_1;
import celestial.rrP_2;
import celestial.rrr_3;
import celestial.rsC_2;
import celestial.rsE_2;
import celestial.rsP_2;
import celestial.rsR_2;
import celestial.rsT_2;
import celestial.rsn_3;
import celestial.rsp_3;
import celestial.rst_3;
import celestial.rsy_3;
import celestial.ruP_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xc_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import org.apache.logging.log4j.Logger;

public class rsq_3
extends rsy_3
implements rha_3,
rsn_3 {
    private static final rut_3<rsp_3> id_synchronized = rmE_2.id_class(rsq_3.class, ruw_3.id_new);
    public static final Map<rdb_3, Integer> id_this = ImmutableMap.of((Object)rdy_3.hS, (Object)4, (Object)rdy_3.dE, (Object)1, (Object)rdy_3.ds, (Object)1, (Object)rdy_3.kX, (Object)1);
    private static final Set<rdb_3> id_return = ImmutableSet.of((Object)rdy_3.hS, (Object)rdy_3.dE, (Object)rdy_3.ds, (Object)rdy_3.hB, (Object)rdy_3.hP, (Object)rdy_3.kX, (Object[])new rdb_3[]{rdy_3.kJ});
    private int id_public;
    private boolean id_goto;
    private rhd_3 id_while;
    private byte id_try;
    private final rgY_2 id_instanceof = new rgY_2();
    private long id_throw;
    private long id_interface;
    private int id_char;
    private long id_abstract;
    private int id_long;
    private long id_float;
    private boolean id_void;
    private static final ImmutableList<il_3<?>> id_static = ImmutableList.of(il_3.id_break, il_3.id_byte, il_3.id_protected, il_3.id_throws, il_3.id_catch, il_3.id_private, il_3.id_implements, il_3.id_finally, il_3.id_extends, il_3.id_native, il_3.id_static, il_3.id_volatile, (Object[])new il_3[]{il_3.id_final, il_3.id_new, il_3.id_continue, il_3.id_this, il_3.id_synchronized, il_3.id_return, il_3.id_public, il_3.id_goto, il_3.id_try, il_3.id_case, il_3.id_instanceof, il_3.id_throw, il_3.id_interface, il_3.id_abstract, il_3.id_long, il_3.id_float, il_3.id_char});
    private static final ImmutableList<rrP_2<? extends rrr_3<? super rsq_3>>> id_import = ImmutableList.of(rrP_2.id_byte, rrP_2.id_protected, rrP_2.id_break, rrP_2.id_throws, rrP_2.id_case, rrP_2.id_catch, rrP_2.id_private, rrP_2.id_implements, rrP_2.id_finally);
    public static final Map<il_3<rfK_2>, BiPredicate<rsq_3, rRP>> id_else = ImmutableMap.of(il_3.id_break, (rsq_32, rRP2) -> rRP2 == rRP.id_continue, il_3.id_byte, (rsq_32, rRP2) -> rsq_32.su().id_break().id_class() == rRP2, il_3.id_protected, (rsq_32, rRP2) -> rRP.id_class.test((rRP)rRP2), il_3.id_throws, (rsq_32, rRP2) -> rRP2 == rRP.id_super);

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.kP;
    }

    public void id_byte(rrEm_1 rrEm_12) {
        iZ_2<rsq_3> iZ_22;
        iZ_2<rsq_3> iZ_23 = this.SF();
        iZ_23.id_break(rrEm_12, this);
        this.id_private[72] = iZ_22 = iZ_23.id_throws();
        this.id_class(this.SF());
    }

    @Override
    protected void id_double() {
        rrEr_1 rrEr_12;
        this.SF().id_class((rrEm_1)((rYB)this.id_throws[7]), this);
        if (this.id_void) {
            this.id_void = false;
        }
        if (!this.n() && this.id_public > 0) {
            --this.id_public;
            if (this.id_public <= 0) {
                if (this.id_goto) {
                    this.sw();
                    this.id_goto = false;
                }
                this.id_break(new rLY(rLD.id_finally, 200, 0));
            }
        }
        if (this.id_while != null && (rYB)this.id_throws[7] instanceof rrEm_1) {
            ((rrEm_1)((rYB)this.id_throws[7])).id_class(rsC_2.id_throws, (an_3)this.id_while, this);
            ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)14);
            this.id_while = null;
        }
        if (!this.c() && ((Random)this.id_throws[40]).nextInt(100) == 0 && (rrEr_12 = ((rrEm_1)((rYB)this.id_throws[7])).id_interface(this.Bs())) != null && rrEr_12.id_this() && !rrEr_12.id_class()) {
            ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)42);
        }
        if (this.su().id_break() == rsT_2.id_class && this.n()) {
            this.sx();
        }
        super.id_double();
    }

    public rsq_3(aI_2<? extends rsq_3> aI_22, rYB rYB2) {
        this(aI_22, rYB2, rhi_3.id_byte);
    }

    public rsq_3(aI_2<? extends rsq_3> aI_22, rYB rYB2, rhi_3 rhi_32) {
        super((aI_2<? extends rsy_3>)aI_22, rYB2);
        ((rLA)this.id_public()).id_class(true);
        this.id_public().id_byte(true);
        this.id_byte(true);
        this.id_class(this.su().id_class(rhi_32).id_class(rsT_2.id_class));
    }

    private void sp() {
        this.id_class(il_3.id_break);
        this.id_class(il_3.id_byte);
        this.id_class(il_3.id_protected);
        this.id_class(il_3.id_throws);
    }

    @Override
    public void id_this() {
        super.id_this();
        if (this.L() > 0) {
            this.id_this(this.L() - 1);
        }
        this.sf();
    }

    private boolean sl() {
        return this.id_long == 0 || this.id_long < 2 && ((rYB)this.id_throws[7]).r() > this.id_abstract + 2400L;
    }

    @Override
    public /* synthetic */ au_3 id_class(rrEm_1 rrEm_12, au_3 au_32) {
        return this.id_break(rrEm_12, au_32);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rsp_3.id_class.encodeStart((DynamicOps)rcf_3.id_class, (Object)this.su()).resultOrPartial(arg_0 -> ((Logger)((Logger)id_case[0])).error(arg_0)).ifPresent(rcZ_22 -> rcd_32.id_class("VillagerData", (rcZ_2)rcZ_22));
        rcd_32.id_class("FoodLevel", this.id_try);
        rcd_32.id_class("Gossips", (rcZ_2)this.id_instanceof.id_class(rcf_3.id_class).getValue());
        rcd_32.id_break("Xp", this.id_char);
        rcd_32.id_class("LastRestock", this.id_abstract);
        rcd_32.id_class("LastGossipDecay", this.id_interface);
        rcd_32.id_break("RestocksToday", this.id_long);
        if (this.id_void) {
            rcd_32.id_class("AssignProfessionWhenSpawned", true);
        }
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        if (iO_22 == iO_2.BREEDING) {
            this.id_class(this.su().id_class(rsT_2.id_class));
        }
        if (iO_22 == iO_2.COMMAND || iO_22 == iO_2.SPAWN_EGG || iO_22 == iO_2.SPAWNER || iO_22 == iO_2.DISPENSER) {
            this.id_class(this.su().id_class(rhi_3.id_class(rRf_12.id_protected(this.Bs()))));
        }
        if (iO_22 == iO_2.STRUCTURE) {
            this.id_void = true;
        }
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    public void id_class(rsp_3 rsp_32) {
        rsp_3 rsp_33 = this.su();
        if (rsp_33.id_break() != rsp_32.id_break()) {
            this.id_super = null;
        }
        ((rmE_2)this.id_throws[49]).id_break(id_synchronized, rsp_32);
    }

    public void id_class(rcZ_2 rcZ_22) {
        this.id_instanceof.id_class(new Dynamic((DynamicOps)rcf_3.id_class, (Object)rcZ_22));
    }

    private void id_class(an_3 an_32) {
        Optional<List<iB_2>> optional;
        if ((rYB)this.id_throws[7] instanceof rrEm_1 && (optional = ((iZ_2)this.id_private[72]).id_byte(il_3.id_private)).isPresent()) {
            rrEm_1 rrEm_12 = (rrEm_1)((rYB)this.id_throws[7]);
            optional.get().stream().filter(iB_22 -> iB_22 instanceof rsn_3).forEach(iB_22 -> rrEm_12.id_class(rsC_2.id_protected, an_32, (rsn_3)((Object)iB_22)));
        }
    }

    public void id_class(il_3<rfK_2> il_32) {
        if ((rYB)this.id_throws[7] instanceof rrEm_1) {
            rnW_2 rnW_22 = ((rrEm_1)((rYB)this.id_throws[7])).id_const();
            ((iZ_2)this.id_private[72]).id_byte(il_32).ifPresent(rfK_22 -> {
                rrEm_1 rrEm_12 = rnW_22.id_class(rfK_22.id_class());
                if (rrEm_12 != null) {
                    rga_3 rga_32 = rrEm_12.d();
                    Optional<rRP> optional = rga_32.id_byte(rfK_22.id_break());
                    BiPredicate<rsq_3, rRP> biPredicate = id_else.get(il_32);
                    if (optional.isPresent() && biPredicate.test(this, optional.get())) {
                        rga_32.id_break(rfK_22.id_break());
                        ruP_2.id_byte(rrEm_12, rfK_22.id_break());
                    }
                }
            });
        }
    }

    @Override
    protected iZ_2<?> id_class(Dynamic<?> dynamic) {
        iZ_2<rsq_3> iZ_22 = this.SV().id_class(dynamic);
        this.id_class(iZ_22);
        return iZ_22;
    }

    @Override
    public void id_class(rsC_2 rsC_22, an_3 an_32) {
        if (rsC_22 == rsC_2.id_class) {
            this.id_instanceof.id_class(an_32.ro(), rgD_2.MAJOR_POSITIVE, 20);
            this.id_instanceof.id_class(an_32.ro(), rgD_2.MINOR_POSITIVE, 25);
        } else if (rsC_22 == rsC_2.id_throws) {
            this.id_instanceof.id_class(an_32.ro(), rgD_2.TRADING, 2);
        } else if (rsC_22 == rsC_2.id_byte) {
            this.id_instanceof.id_class(an_32.ro(), rgD_2.MINOR_NEGATIVE, 25);
        } else if (rsC_22 == rsC_2.id_protected) {
            this.id_instanceof.id_class(an_32.ro(), rgD_2.MAJOR_NEGATIVE, 25);
        }
    }

    @Override
    public void id_class(byte by) {
        if (by == 12) {
            this.id_class(rLQ.id_long);
        } else if (by == 13) {
            this.id_class(rLQ.id_break);
        } else if (by == 14) {
            this.id_class(rLQ.id_char);
        } else if (by == 42) {
            this.id_class(rLQ.E);
        } else {
            super.id_class(by);
        }
    }

    public void id_class(rrEm_1 rrEm_12, long l, int n) {
        rMZ rMZ2;
        rfl_3 rfl_32;
        List<rsq_3> list;
        List list2;
        if (this.id_class(l) && (list2 = (list = rrEm_12.id_class(rsq_3.class, rfl_32 = this.rN().id_byte(10.0, 10.0, 10.0))).stream().filter(rsq_32 -> rsq_32.id_class(l)).limit(5L).collect(Collectors.toList())).size() >= n && (rMZ2 = this.id_protected(rrEm_12)) != null) {
            list.forEach(ig_3::id_break);
        }
    }

    private rfH_2 id_class(rfH_2 rfH_22, double d, double d2) {
        int n = 6;
        rfH_2 rfH_23 = rfH_22.id_byte(d, 6.0, d2);
        xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte(rfH_23);
        for (int i = 6; i >= -6; --i) {
            rfH_2 rfH_24 = rfH_23;
            xc_3 xc_33 = xc_32;
            rfH_23 = rfH_23.id_break();
            xc_32 = ((rYB)this.id_throws[7]).id_byte(rfH_23);
            if (!xc_33.id_catch() && !xc_33.id_byte().id_class() || !xc_32.id_byte().id_case()) continue;
            return rfH_24;
        }
        return null;
    }

    @Override
    public void id_class(rhd_3 rhd_32) {
        boolean bl = this.id_class() != null && rhd_32 == null;
        super.id_class(rhd_32);
        if (bl) {
            this.sx();
        }
    }

    public boolean id_class(long l) {
        if (!this.id_break(((rYB)this.id_throws[7]).r())) {
            return false;
        }
        return !((iZ_2)this.id_private[72]).id_class(il_3.id_char);
    }

    private void id_class(iZ_2<rsq_3> iZ_22) {
        rsT_2 rsT_22 = this.su().id_break();
        if (this.n_()) {
            iZ_22.id_class(it_3.id_byte);
            iZ_22.id_class(iq_3.id_protected, rPL.id_class(0.5f));
        } else {
            iZ_22.id_class(it_3.id_protected);
            iZ_22.id_class(iq_3.id_byte, (ImmutableList<Pair<Integer, rPm_1<rsq_3>>>)rPL.id_break(rsT_22, 0.5f), (Set<Pair<il_3<?>, iC_2>>)ImmutableSet.of((Object)Pair.of(il_3.id_byte, (Object)((Object)iC_2.VALUE_PRESENT))));
        }
        iZ_22.id_class(iq_3.id_class, rPL.id_class(rsT_22, 0.5f));
        iZ_22.id_class(iq_3.id_case, (ImmutableList<Pair<Integer, rPm_1<rsq_3>>>)rPL.id_protected(rsT_22, 0.5f), (Set<Pair<il_3<?>, iC_2>>)ImmutableSet.of((Object)Pair.of(il_3.id_throws, (Object)((Object)iC_2.VALUE_PRESENT))));
        iZ_22.id_class(iq_3.id_throws, rPL.id_byte(rsT_22, 0.5f));
        iZ_22.id_class(iq_3.id_break, rPL.id_throws(rsT_22, 0.5f));
        iZ_22.id_class(iq_3.id_catch, rPL.id_case(rsT_22, 0.5f));
        iZ_22.id_class(iq_3.id_implements, rPL.id_catch(rsT_22, 0.5f));
        iZ_22.id_class(iq_3.id_private, rPL.id_private(rsT_22, 0.5f));
        iZ_22.id_class(iq_3.id_finally, rPL.id_implements(rsT_22, 0.5f));
        iZ_22.id_class((Set<iq_3>)ImmutableSet.of((Object)iq_3.id_class));
        iZ_22.id_break(iq_3.id_break);
        iZ_22.id_class(iq_3.id_break);
        iZ_22.id_class(((rYB)this.id_throws[7]).P(), ((rYB)this.id_throws[7]).r());
    }

    public void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        if (!(l >= this.id_throw && l < this.id_throw + 1200L || l >= rsq_32.id_throw && l < rsq_32.id_throw + 1200L)) {
            this.id_instanceof.id_class(rsq_32.id_instanceof, (Random)this.id_throws[40], 10);
            this.id_throw = l;
            rsq_32.id_throw = l;
            this.id_class(rrEm_12, l, 5);
        }
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, rSg_1 rSg_12) {
        if (rrEm_12.id_abstract() != rRO.PEACEFUL) {
            ((Logger)id_case[0]).info("Villager {} was struck by lightning {}.", (Object)this, (Object)rSg_12);
            rGi_1 rGi_12 = aI_2.a.id_class(rrEm_12);
            rGi_12.id_class(this.rx(), this.re(), this.BO(), ((Float)this.id_throws[15]).floatValue(), ((Float)this.id_throws[16]).floatValue());
            rGi_12.id_class(rrEm_12, rrEm_12.id_throws(rGi_12.Bs()), iO_2.CONVERSION, (aU_2)null, (rcd_3)null);
            rGi_12.id_protected(this.c());
            if (this.Bk()) {
                rGi_12.id_break(this.rD());
                rGi_12.id_final(this.D());
            }
            rGi_12.b();
            rrEm_12.id_class((an_3)rGi_12);
            this.sp();
            this.PD();
        } else {
            super.id_class(rrEm_12, rSg_12);
        }
    }

    public void sm() {
        this.sT();
        this.id_synchronized(12);
    }

    public void sc() {
        rqA_2 rqA_22 = this.su().id_break().id_protected();
        if (rqA_22 != null) {
            this.id_class(rqA_22, this.Si(), this.SN());
        }
    }

    private void sj() {
        this.sH();
        this.id_long = 0;
    }

    private void sw() {
        this.id_class(this.su().id_class(this.su().id_byte() + 1));
        this.sk();
    }

    private void sf() {
        long l = ((rYB)this.id_throws[7]).r();
        if (this.id_interface == 0L) {
            this.id_interface = l;
        } else if (l >= this.id_interface + 24000L) {
            this.id_instanceof.id_class();
            this.id_interface = l;
        }
    }

    @Override
    protected void id_break(rsE_2 rsE_22) {
        rdn_3 rdn_32 = rsE_22.id_protected();
        if (this.id_implements(rdn_32)) {
            rXA rXA2 = this.sd();
            boolean bl = rXA2.id_break(rdn_32);
            if (!bl) {
                return;
            }
            this.id_class(rsE_22);
            this.id_class((an_3)rsE_22, rdn_32.id_char());
            rdn_3 rdn_33 = rXA2.id_class(rdn_32);
            if (rdn_33.id_class()) {
                rsE_22.PD();
            } else {
                rdn_32.id_throws(rdn_33.id_char());
            }
        }
    }

    public rsq_3 id_break(rrEm_1 rrEm_12, au_3 au_32) {
        double d = ((Random)this.id_throws[40]).nextDouble();
        rhi_3 rhi_32 = d < 0.5 ? rhi_3.id_class(rrEm_12.id_protected(this.Bs())) : (d < 0.75 ? this.su().id_class() : ((rsq_3)au_32).su().id_class());
        rsq_3 rsq_32 = new rsq_3(aI_2.D, rrEm_12, rhi_32);
        rsq_32.id_class(rrEm_12, rrEm_12.id_throws(rsq_32.Bs()), iO_2.BREEDING, (aU_2)null, (rcd_3)null);
        return rsq_32;
    }

    public void id_break(rdf_3 rdf_32) {
        this.id_super = rdf_32;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        Object object;
        super.id_break(rcd_32);
        if (rcd_32.id_byte("VillagerData", 10)) {
            object = rsp_3.id_class.parse(new Dynamic((DynamicOps)rcf_3.id_class, (Object)rcd_32.id_byte("VillagerData")));
            object.resultOrPartial(arg_0 -> ((Logger)((Logger)id_case[0])).error(arg_0)).ifPresent(this::id_class);
        }
        if (rcd_32.id_byte("Offers", 10)) {
            this.id_super = new rdf_3(rcd_32.id_int("Offers"));
        }
        if (rcd_32.id_byte("FoodLevel", 1)) {
            this.id_try = rcd_32.id_case("FoodLevel");
        }
        object = rcd_32.id_protected("Gossips", 10);
        this.id_instanceof.id_class(new Dynamic((DynamicOps)rcf_3.id_class, object));
        if (rcd_32.id_byte("Xp", 3)) {
            this.id_char = rcd_32.id_private("Xp");
        }
        this.id_abstract = rcd_32.id_implements("LastRestock");
        this.id_interface = rcd_32.id_implements("LastGossipDecay");
        this.id_byte(true);
        if ((rYB)this.id_throws[7] instanceof rrEm_1) {
            this.id_byte((rrEm_1)((rYB)this.id_throws[7]));
        }
        this.id_long = rcd_32.id_private("RestocksToday");
        if (rcd_32.id_throws("AssignProfessionWhenSpawned")) {
            this.id_void = rcd_32.id_new("AssignProfessionWhenSpawned");
        }
    }

    @Override
    protected void id_break(rdI_2 rdI_22) {
        int n = 3 + ((Random)this.id_throws[40]).nextInt(4);
        this.id_char += rdI_22.id_package();
        this.id_while = this.id_class();
        if (this.st()) {
            this.id_public = 40;
            this.id_goto = true;
            n += 5;
        }
        if (rdI_22.id_super()) {
            ((rYB)this.id_throws[7]).a_(new rsP_2((rYB)this.id_throws[7], this.rx(), this.re() + 0.5, this.BO(), n));
        }
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (rdn_32.id_break() != rdy_3.xI && this.BM() && !this.n() && !this.Sc()) {
            if (this.n_()) {
                this.sA();
                return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
            }
            boolean bl = this.id_break().isEmpty();
            if (rpm_32 == rpm_3.MAIN_HAND) {
                if (bl && !((rYB)this.id_throws[7]).id_continue) {
                    this.sA();
                }
                rhd_32.id_break(rlB_2.id_for);
            }
            if (bl) {
                return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
            }
            if (!((rYB)this.id_throws[7]).id_continue && !this.id_super.isEmpty()) {
                this.id_case(rhd_32);
            }
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
        }
        return super.id_break(rhd_32, rpm_32);
    }

    private boolean id_break(long l) {
        Optional<Long> optional = ((iZ_2)this.id_private[72]).id_byte(il_3.id_abstract);
        if (optional.isPresent()) {
            return l - optional.get() < 24000L;
        }
        return false;
    }

    @Override
    public void id_break(iB_2 iB_22) {
        if (iB_22 != null && (rYB)this.id_throws[7] instanceof rrEm_1) {
            ((rrEm_1)((rYB)this.id_throws[7])).id_class(rsC_2.id_byte, (an_3)iB_22, this);
            if (this.BM() && iB_22 instanceof rhd_3) {
                ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)13);
            }
        }
        super.id_break(iB_22);
    }

    @Override
    public void id_break(rye_3 rye_32) {
        ((Logger)id_case[0]).info("Villager {} died, message: '{}'", (Object)this, (Object)rye_32.id_class(this).getString());
        an_3 an_32 = rye_32.id_extends();
        if (an_32 != null) {
            this.id_class(an_32);
        }
        this.sp();
        super.id_break(rye_32);
    }

    public int id_throws(rhd_3 rhd_32) {
        return this.id_instanceof.id_class(rhd_32.ro(), (rgD_2 rgD_22) -> true);
    }

    @Override
    protected void sx() {
        super.sx();
        this.sn();
    }

    @Override
    protected void sk() {
        rsR_2[] rsR_2Array;
        rsp_3 rsp_32 = this.su();
        Int2ObjectMap<rsR_2[]> int2ObjectMap = rst_3.id_class.get(rsp_32.id_break());
        if (int2ObjectMap != null && !int2ObjectMap.isEmpty() && (rsR_2Array = (rsR_2[])int2ObjectMap.get(rsp_32.id_byte())) != null) {
            rdf_3 rdf_32 = this.id_break();
            this.id_class(rdf_32, rsR_2Array, 2);
        }
    }

    public boolean sv() {
        return this.sI() < 12;
    }

    private void id_catch(rhd_3 rhd_32) {
        int n = this.id_throws(rhd_32);
        if (n != 0) {
            for (rdI_2 rdI_22 : this.id_break()) {
                rdI_22.id_class(-rfU_2.id_protected((float)n * rdI_22.id_final()));
            }
        }
        if (rhd_32.id_break(rLD.id_abstract)) {
            rLY rLY2 = rhd_32.id_byte(rLD.id_abstract);
            int n2 = rLY2.id_byte();
            for (rdI_2 rdI_23 : this.id_break()) {
                double d = 0.3 + 0.0625 * (double)n2;
                int n3 = (int)Math.floor(d * (double)rdI_23.id_class().id_char());
                rdI_23.id_class(-Math.max(n3, 1));
            }
        }
    }

    @Override
    public void id_case(rfH_2 rfH_22) {
        super.id_case(rfH_22);
        ((iZ_2)this.id_private[72]).id_class(il_3.id_abstract, Long.valueOf(((rYB)this.id_throws[7]).r()));
        ((iZ_2)this.id_private[72]).id_break(il_3.id_volatile);
        ((iZ_2)this.id_private[72]).id_break(il_3.id_interface);
    }

    private void id_case(rhd_3 rhd_32) {
        this.id_catch(rhd_32);
        this.id_class(rhd_32);
        this.id_class(rhd_32, this.L_(), this.su().id_byte());
    }

    public void id_else(int n) {
        this.id_char = n;
    }

    @Override
    protected void id_for() {
        super.id_for();
        ruP_2.id_class(this);
    }

    @Override
    public boolean id_implements(rdn_3 rdn_32) {
        rdb_3 rdb_32 = rdn_32.id_break();
        return (id_return.contains(rdb_32) || this.su().id_break().id_break().contains((Object)rdb_32)) && this.sd().id_break(rdn_32);
    }

    @Override
    protected rqA_2 id_static() {
        if (this.Sc()) {
            return null;
        }
        return this.n() ? rqn_3.kS : rqn_3.da;
    }

    @Override
    public int id_protected() {
        return this.id_char;
    }

    private rMZ id_protected(rrEm_1 rrEm_12) {
        rfH_2 rfH_22 = this.Bs();
        for (int i = 0; i < 10; ++i) {
            rMZ rMZ2;
            double d;
            double d2 = rrEm_12.id_int.nextInt(16) - 8;
            rfH_2 rfH_23 = this.id_class(rfH_22, d2, d = (double)(rrEm_12.id_int.nextInt(16) - 8));
            if (rfH_23 == null || (rMZ2 = aI_2.id_import.id_break(rrEm_12, null, null, null, rfH_23, iO_2.MOB_SUMMONED, false, false)) == null) continue;
            if (rMZ2.id_class((rRg_1)rrEm_12, iO_2.MOB_SUMMONED) && rMZ2.id_class((rRR)rrEm_12)) {
                rrEm_12.id_class((an_3)rMZ2);
                return rMZ2;
            }
            rMZ2.PD();
        }
        return null;
    }

    @Override
    public boolean id_private(double d) {
        return false;
    }

    private void id_synchronized(int n) {
        this.id_try = (byte)(this.id_try - n);
    }

    private boolean st() {
        int n = this.su().id_byte();
        return rsp_3.id_protected(n) && this.id_char >= rsp_3.id_byte(n);
    }

    public boolean sz() {
        return this.id_void;
    }

    private void sn() {
        for (rdI_2 rdI_22 : this.id_break()) {
            rdI_22.id_native();
        }
    }

    private boolean sq() {
        return this.id_try < 12;
    }

    @Override
    protected void P_() {
        super.P_();
        if ((rYB)this.id_throws[7] instanceof rrEm_1) {
            this.id_byte((rrEm_1)((rYB)this.id_throws[7]));
        }
    }

    @Override
    public boolean N_() {
        return this.id_try + this.sI() >= 12 && this.O_() == 0;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.kr;
    }

    private void sy() {
        for (rdI_2 rdI_22 : this.id_break()) {
            rdI_22.id_throws();
        }
    }

    public boolean sN() {
        long l = this.id_abstract + 12000L;
        long l2 = ((rYB)this.id_throws[7]).r();
        boolean bl = l2 > l;
        long l3 = ((rYB)this.id_throws[7]).P();
        if (this.id_float > 0L) {
            long l4 = l3 / 24000L;
            long l5 = this.id_float / 24000L;
            bl |= l4 > l5;
        }
        this.id_float = l3;
        if (bl) {
            this.id_abstract = l2;
            this.sj();
        }
        return this.sl() && this.sC();
    }

    public rgY_2 sL() {
        return this.id_instanceof;
    }

    public iZ_2<rsq_3> SF() {
        return super.SF();
    }

    private void sH() {
        int n = 2 - this.id_long;
        if (n > 0) {
            for (rdI_2 rdI_22 : this.id_break()) {
                rdI_22.id_private();
            }
        }
        for (int i = 0; i < n; ++i) {
            this.sy();
        }
    }

    private void sT() {
        if (this.sq() && this.sI() != 0) {
            for (int i = 0; i < this.sd().id_else(); ++i) {
                int n;
                Integer n2;
                rdn_3 rdn_32 = this.sd().id_extends(i);
                if (rdn_32.id_class() || (n2 = id_this.get(rdn_32.id_break())) == null) continue;
                for (int j = n = rdn_32.id_char(); j > 0; --j) {
                    this.id_try = (byte)(this.id_try + n2);
                    this.sd().id_class(i, 1);
                    if (this.sq()) continue;
                    return;
                }
            }
        }
    }

    private int sI() {
        rXA rXA2 = this.sd();
        return id_this.entrySet().stream().mapToInt(entry -> rXA2.id_class((rdb_3)entry.getKey()) * (Integer)entry.getValue()).sum();
    }

    @Override
    public rsp_3 su() {
        return ((rmE_2)this.id_throws[49]).id_class(id_synchronized);
    }

    public static iz_3 sW() {
        return is_3.id_package().id_class(iQ_2.id_protected, 0.5).id_class(iQ_2.id_break, 48.0);
    }

    @Override
    public void SQ() {
        super.SQ();
        ((iZ_2)this.id_private[72]).id_class(il_3.id_long, Long.valueOf(((rYB)this.id_throws[7]).r()));
    }

    protected iF_2<rsq_3> SV() {
        return iZ_2.id_class(id_static, id_import);
    }

    public void sQ() {
        this.sy();
        for (rdI_2 rdI_22 : this.id_break()) {
            rdI_22.id_private();
        }
        this.id_abstract = ((rYB)this.id_throws[7]).r();
        ++this.id_long;
    }

    public boolean sZ() {
        return this.sI() >= 24;
    }

    public boolean sF() {
        return this.sd().id_class((Set<rdb_3>)ImmutableSet.of((Object)rdy_3.hP, (Object)rdy_3.dE, (Object)rdy_3.ds, (Object)rdy_3.kJ));
    }

    private void sA() {
        this.id_this(40);
        if (!((rYB)this.id_throws[7]).id_import()) {
            this.id_class(rqn_3.kB, this.Si(), this.SN());
        }
    }

    private boolean sC() {
        for (rdI_2 rdI_22 : this.id_break()) {
            if (!rdI_22.id_continue()) continue;
            return true;
        }
        return false;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_synchronized, new rsp_3(rhi_3.id_byte, rsT_2.id_class, 1));
    }

    @Override
    protected rgP_2 PT() {
        return new rgn_3(this.BC().id_private() + "." + rVL.J.id_break(this.su().id_break()).id_break());
    }

    @Override
    public boolean Q_() {
        return true;
    }
}

