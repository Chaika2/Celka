/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
package celestial;

import celestial.JV;
import celestial.rHD;
import celestial.rHf_1;
import celestial.rHs_1;
import celestial.rWr_1;
import celestial.rXC;
import celestial.rXF;
import celestial.rXZ;
import celestial.rXv_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rkj_3;
import celestial.rkv_3;
import celestial.rkw_3;
import celestial.rlb_3;
import celestial.rlc_3;
import celestial.rpF_2;
import celestial.rpL_2;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqs_3;
import celestial.rqu_3;
import celestial.rsP_2;
import celestial.ryW_2;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class rHS
extends rHD
implements rHf_1,
rXF,
rXZ,
rXv_1 {
    private static final int[] id_protected = new int[]{0};
    private static final int[] id_throws = new int[]{2, 1};
    private static final int[] id_case = new int[]{1};
    protected rqs_3<rdn_3> id_class = rqs_3.id_class(3, rdn_3.id_break);
    public int id_catch;
    public int id_private;
    public int id_implements;
    public int id_finally;
    protected final rpF_2 id_break = new rHs_1(this);
    private final Object2IntOpenHashMap<rqO_2> id_final = new Object2IntOpenHashMap();
    protected final rkj_3<? extends rkv_3> id_byte;

    private void id_byte(rkw_3<?> rkw_32) {
        if (rkw_32 != null && this.id_break(rkw_32)) {
            rdn_3 rdn_32 = this.id_class.get(0);
            rdn_3 rdn_33 = rkw_32.id_byte();
            rdn_3 rdn_34 = this.id_class.get(2);
            if (rdn_34.id_class()) {
                this.id_class.set(2, rdn_33.id_implements());
            } else if (rdn_34.id_break() == rdn_33.id_break()) {
                rdn_34.id_case(1);
            }
            if (!this.id_extends.id_continue) {
                this.id_class(rkw_32);
            }
            if (rdn_32.id_break() == xu_3.c.id_case() && !this.id_class.get(1).id_class() && this.id_class.get(1).id_break() == rdy_3.hg) {
                this.id_class.set(1, new rdn_3(rdy_3.hR));
            }
            rdn_32.id_catch(1);
        }
    }

    @Override
    public rkw_3<?> id_byte() {
        return null;
    }

    @Override
    public boolean id_byte(rhd_3 rhd_32) {
        if (this.id_extends.id_class(this.id_native) != this) {
            return false;
        }
        return rhd_32.id_class((double)this.id_native.b_() + 0.5, (double)this.id_native.c_() + 0.5, (double)this.id_native.d_() + 0.5) <= 64.0;
    }

    protected rHS(ryW_2<?> ryW_22, rkj_3<? extends rkv_3> rkj_32) {
        super(ryW_22);
        this.id_byte = rkj_32;
    }

    @Override
    public void id_class(rWr_1 rWr_12) {
        for (rdn_3 rdn_32 : this.id_class) {
            rWr_12.id_break(rdn_32);
        }
    }

    private static void id_class(Map<rdb_3, Integer> map, rlb_3<rdb_3> rlb_32, int n) {
        for (rdb_3 rdb_32 : rlb_32.id_class()) {
            if (rHS.id_break(rdb_32)) continue;
            map.put(rdb_32, n);
        }
    }

    @Override
    public boolean id_class(int n, rdn_3 rdn_32, rpr_3 rpr_32) {
        return this.a_(n, rdn_32);
    }

    @Override
    public int[] id_class(rpr_3 rpr_32) {
        if (rpr_32 == rpr_3.DOWN) {
            return id_throws;
        }
        return rpr_32 == rpr_3.UP ? id_protected : id_case;
    }

    @Override
    public void id_class(rkw_3<?> rkw_32) {
        if (rkw_32 != null) {
            rqO_2 rqO_22 = rkw_32.id_case();
            this.id_final.addTo((Object)rqO_22, 1);
        }
    }

    @Override
    public void id_class(rhd_3 rhd_32) {
    }

    public List<rkw_3<?>> id_class(rYB rYB2, rjU_2 rjU_22) {
        ArrayList arrayList = Lists.newArrayList();
        for (Object2IntMap.Entry entry : this.id_final.object2IntEntrySet()) {
            rYB2.id_implements().id_class((rqO_2)entry.getKey()).ifPresent(rkw_32 -> {
                arrayList.add(rkw_32);
                rHS.id_class(rYB2, rjU_22, entry.getIntValue(), ((rkv_3)rkw_32).id_break());
            });
        }
        return arrayList;
    }

    private static void id_class(rYB rYB2, rjU_2 rjU_22, int n, float f) {
        int n2 = rfU_2.id_protected((float)n * f);
        float f2 = rfU_2.id_private((float)n * f);
        if (f2 != 0.0f && Math.random() < (double)f2) {
            ++n2;
        }
        while (n2 > 0) {
            int n3 = rsP_2.id_class(n2);
            n2 -= n3;
            rYB2.a_(new rsP_2(rYB2, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, n3));
        }
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("BurnTime", (short)this.id_catch);
        rcd_32.id_class("CookTime", (short)this.id_implements);
        rcd_32.id_class("CookTimeTotal", (short)this.id_finally);
        rXC.id_class(rcd_32, this.id_class);
        rcd_3 rcd_33 = new rcd_3();
        this.id_final.forEach((rqO_22, n) -> rcd_33.id_break(rqO_22.toString(), (int)n));
        rcd_32.id_class("RecipesUsed", rcd_33);
        return rcd_32;
    }

    private static void id_class(Map<rdb_3, Integer> map, rpL_2 rpL_22, int n) {
        rdb_3 rdb_32 = rpL_22.id_case();
        if (rHS.id_break(rdb_32)) {
            if (rqu_3.id_byte) {
                throw rqR_2.id_byte(new IllegalStateException("A developer tried to explicitly make fire resistant item " + rdb_32.id_implements(null).getString() + " a furnace fuel. That will not work!"));
            }
        } else {
            map.put(rdb_32, n);
        }
    }

    protected int id_class(rdn_3 rdn_32) {
        if (rdn_32.id_class()) {
            return 0;
        }
        rdb_3 rdb_32 = rdn_32.id_break();
        return rHS.id_protected().getOrDefault(rdb_32, 0);
    }

    @Override
    public rdn_3 id_class(int n, int n2) {
        return rXC.id_class(this.id_class, n, n2);
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_class = rqs_3.id_class(this.id_else(), rdn_3.id_break);
        rXC.id_break(rcd_32, this.id_class);
        this.id_catch = rcd_32.id_catch("BurnTime");
        this.id_implements = rcd_32.id_catch("CookTime");
        this.id_finally = rcd_32.id_catch("CookTimeTotal");
        this.id_private = this.id_class(this.id_class.get(1));
        rcd_3 rcd_33 = rcd_32.id_int("RecipesUsed");
        for (String string : rcd_33.id_protected()) {
            this.id_final.put((Object)new rqO_2(string), rcd_33.id_private(string));
        }
    }

    @Override
    public void id_break(int n, rdn_3 rdn_32) {
        rdn_3 rdn_33 = this.id_class.get(n);
        boolean bl = !rdn_32.id_class() && rdn_32.id_class(rdn_33) && rdn_3.id_class(rdn_32, rdn_33);
        this.id_class.set(n, rdn_32);
        if (rdn_32.id_char() > this.ab_()) {
            rdn_32.id_throws(this.ab_());
        }
        if (n == 0 && !bl) {
            this.id_finally = this.id_case();
            this.id_implements = 0;
            this.id_break();
        }
    }

    private static boolean id_break(rdb_3 rdb_32) {
        return rlc_3.id_transient.id_class(rdb_32);
    }

    @Override
    public boolean id_break(int n, rdn_3 rdn_32, rpr_3 rpr_32) {
        rdb_3 rdb_32;
        return rpr_32 != rpr_3.DOWN || n != 1 || (rdb_32 = rdn_32.id_break()) == rdy_3.hR || rdb_32 == rdy_3.hg;
    }

    protected boolean id_break(rkw_3<?> rkw_32) {
        if (!this.id_class.get(0).id_class() && rkw_32 != null) {
            rdn_3 rdn_32 = rkw_32.id_byte();
            if (rdn_32.id_class()) {
                return false;
            }
            rdn_3 rdn_33 = this.id_class.get(2);
            if (rdn_33.id_class()) {
                return true;
            }
            if (!rdn_33.id_class(rdn_32)) {
                return false;
            }
            if (rdn_33.id_char() < this.ab_() && rdn_33.id_char() < rdn_33.id_byte()) {
                return true;
            }
            return rdn_33.id_char() < rdn_32.id_byte();
        }
        return false;
    }

    public static boolean id_break(rdn_3 rdn_32) {
        return rHS.id_protected().containsKey(rdn_32.id_break());
    }

    @Override
    public void id_throws() {
        boolean bl = this.id_catch();
        boolean bl2 = false;
        if (this.id_catch()) {
            --this.id_catch;
        }
        if (!this.id_extends.id_continue) {
            rdn_3 rdn_32 = this.id_class.get(1);
            if (this.id_catch() || !rdn_32.id_class() && !this.id_class.get(0).id_class()) {
                rkw_3 rkw_32 = this.id_extends.id_implements().id_class(this.id_byte, this, this.id_extends).orElse(null);
                if (!this.id_catch() && this.id_break(rkw_32)) {
                    this.id_private = this.id_catch = this.id_class(rdn_32);
                    if (this.id_catch()) {
                        bl2 = true;
                        if (!rdn_32.id_class()) {
                            rdb_3 rdb_32 = rdn_32.id_break();
                            rdn_32.id_catch(1);
                            if (rdn_32.id_class()) {
                                rdb_3 rdb_33 = rdb_32.id_package();
                                this.id_class.set(1, rdb_33 == null ? rdn_3.id_break : new rdn_3(rdb_33));
                            }
                        }
                    }
                }
                if (this.id_catch() && this.id_break(rkw_32)) {
                    ++this.id_implements;
                    if (this.id_implements == this.id_finally) {
                        this.id_implements = 0;
                        this.id_finally = this.id_case();
                        this.id_byte(rkw_32);
                        bl2 = true;
                    }
                } else {
                    this.id_implements = 0;
                }
            } else if (!this.id_catch() && this.id_implements > 0) {
                this.id_implements = rfU_2.id_class(this.id_implements - 2, 0, this.id_finally);
            }
            if (bl != this.id_catch()) {
                bl2 = true;
                this.id_extends.id_class(this.id_native, (xc_3)this.id_extends.id_byte(this.id_native).id_class(JV.id_final, this.id_catch()), 3);
            }
        }
        if (bl2) {
            this.id_break();
        }
    }

    private boolean id_catch() {
        return this.id_catch > 0;
    }

    @Override
    public rdn_3 id_extends(int n) {
        return this.id_class.get(n);
    }

    protected int id_case() {
        return this.id_extends.id_implements().id_class(this.id_byte, this, this.id_extends).map(rkv_3::id_throws).orElse(200);
    }

    @Override
    public int id_else() {
        return this.id_class.size();
    }

    @Override
    public boolean id_return() {
        for (rdn_3 rdn_32 : this.id_class) {
            if (rdn_32.id_class()) continue;
            return false;
        }
        return true;
    }

    @Override
    public void id_public() {
        this.id_class.clear();
    }

    public void id_protected(rhd_3 rhd_32) {
        List<rkw_3<?>> list = this.id_class((rYB)rhd_32.id_throws[7], rhd_32.Ps());
        rhd_32.id_break(list);
        this.id_final.clear();
    }

    public static Map<rdb_3, Integer> id_protected() {
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rdy_3.hY, 20000);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.Ea, 16000);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rdy_3.JZ, 2400);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rdy_3.Oh, 1600);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rdy_3.OX, 1600);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rlc_3.id_new, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rlc_3.id_byte, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rlc_3.id_implements, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rlc_3.id_finally, 150);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rlc_3.id_volatile, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rlc_3.id_native, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.PV, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.bN, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.bQ, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.bc, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.bm, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.bu, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.BU, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.bd, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.bx, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.bk, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.bz, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.bW, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.n, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.rj, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.Xs, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.Pj, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.re, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.sZ, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.PP, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.sA, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rlc_3.id_while, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rdy_3.OM, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rdy_3.Xd, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.PJ, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rlc_3.r, 200);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rdy_3.OQ, 200);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rdy_3.Oz, 200);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rdy_3.Ou, 200);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rdy_3.Oc, 200);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rdy_3.ON, 200);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rlc_3.id_private, 200);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rlc_3.id_double, 1200);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rlc_3.id_break, 100);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rlc_3.id_throws, 100);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rdy_3.OD, 100);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rlc_3.id_package, 100);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rdy_3.OU, 100);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rlc_3.id_catch, 67);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.Oh, 4001);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, rdy_3.kU, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.hs, 50);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.i, 100);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.hU, 400);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.he, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.ha, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.XP, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.XB, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.XE, 300);
        rHS.id_class((Map<rdb_3, Integer>)linkedHashMap, xu_3.JG, 300);
        return linkedHashMap;
    }

    @Override
    public rdn_3 id_native(int n) {
        return rXC.id_class(this.id_class, n);
    }

    @Override
    public boolean a_(int n, rdn_3 rdn_32) {
        if (n == 2) {
            return false;
        }
        if (n != 1) {
            return true;
        }
        rdn_3 rdn_33 = this.id_class.get(1);
        return rHS.id_break(rdn_32) || rdn_32.id_break() == rdy_3.hg && rdn_33.id_break() != rdy_3.hg;
    }
}

