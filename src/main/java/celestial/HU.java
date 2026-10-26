/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.HC;
import celestial.HH;
import celestial.HI;
import celestial.HR;
import celestial.Ha_1;
import celestial.He_1;
import celestial.Hj_1;
import celestial.Hn_1;
import celestial.Ho_1;
import celestial.Hw_1;
import celestial.Hz_1;
import celestial.jE_2;
import celestial.jZ_2;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rqO_2;
import celestial.rrME;
import celestial.rrMh_1;
import celestial.rrWx_1;
import celestial.rrbY_2;
import celestial.rrbb_3;
import celestial.rrdL;
import celestial.rrdZ;
import celestial.rrxn_3;
import celestial.yk_3;
import celestial.yr_3;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;

public abstract class HU
extends Hn_1 {
    private static final HU E = HU.id_class("solid", ju_3.id_private, 7, 0x200000, true, false, Ha_1.id_class().id_class(id_final).id_class(id_synchronized).id_class(id_package).id_class(true));
    private static final HU G = HU.id_class("cutout_mipped", ju_3.id_private, 7, 131072, true, false, Ha_1.id_class().id_class(id_final).id_class(id_synchronized).id_class(id_package).id_class(id_native).id_class(true));
    private static final HU b = HU.id_class("cutout", ju_3.id_private, 7, 131072, true, false, Ha_1.id_class().id_class(id_final).id_class(id_synchronized).id_class(id_int).id_class(id_native).id_class(true));
    private static final HU M = HU.id_class("translucent", ju_3.id_private, 7, 262144, true, true, HU.id_import());
    private static final HU O = HU.id_class("translucent_moving_block", ju_3.id_private, 7, 262144, false, true, HU.id_short());
    private static final HU h = HU.id_class("translucent_no_crumbling", ju_3.id_private, 7, 262144, false, true, HU.id_import());
    private static final HU X = HU.id_class("leash", ju_3.id_else, 7, 256, Ha_1.id_class().id_class(id_new).id_class(id_throw).id_class(id_synchronized).id_class(false));
    private static final HU J = HU.id_class("water_mask", ju_3.id_super, 7, 256, Ha_1.id_class().id_class(id_new).id_class(id_void).id_class(false));
    private static final HU x = HU.id_class("armor_glint", ju_3.id_synchronized, 7, 256, Ha_1.id_class().id_class(new HR(Hz_1.id_class, true, false)).id_class(id_float).id_class(id_throw).id_class(id_char).id_class(id_case).id_class(id_this).id_class(id_short).id_class(false));
    private static final HU d = HU.id_class("armor_entity_glint", ju_3.id_synchronized, 7, 256, Ha_1.id_class().id_class(new HR(Hz_1.id_class, true, false)).id_class(id_float).id_class(id_throw).id_class(id_char).id_class(id_case).id_class(id_else).id_class(id_short).id_class(false));
    private static final HU k = HU.id_class("glint_translucent", ju_3.id_synchronized, 7, 256, Ha_1.id_class().id_class(new HR(Hz_1.id_class, true, false)).id_class(id_float).id_class(id_throw).id_class(id_char).id_class(id_case).id_class(id_this).id_class(P).id_class(false));
    private static final HU W = HU.id_class("glint", ju_3.id_synchronized, 7, 256, Ha_1.id_class().id_class(new HR(Hz_1.id_class, true, false)).id_class(id_float).id_class(id_throw).id_class(id_char).id_class(id_case).id_class(id_this).id_class(false));
    private static final HU z = HU.id_class("glint_direct", ju_3.id_synchronized, 7, 256, Ha_1.id_class().id_class(new HR(Hz_1.id_class, true, false)).id_class(id_float).id_class(id_throw).id_class(id_char).id_class(id_case).id_class(id_this).id_class(false));
    private static final HU Q = HU.id_class("entity_glint", ju_3.id_synchronized, 7, 256, Ha_1.id_class().id_class(new HR(Hz_1.id_class, true, false)).id_class(id_float).id_class(id_throw).id_class(id_char).id_class(id_case).id_class(P).id_class(id_else).id_class(false));
    private static final HU N = HU.id_class("entity_glint_direct", ju_3.id_synchronized, 7, 256, Ha_1.id_class().id_class(new HR(Hz_1.id_class, true, false)).id_class(id_float).id_class(id_throw).id_class(id_char).id_class(id_case).id_class(id_else).id_class(false));
    private static final HU c = HU.id_class("lightning", ju_3.id_this, 7, 256, false, true, Ha_1.id_class().id_class(id_long).id_class(id_throws).id_class(id_switch).id_class(id_final).id_class(false));
    private static final HU u = HU.id_class("tripwire", ju_3.id_private, 7, 262144, true, true, HU.id_default());
    public static final yr_3 S = HU.id_class("lines", ju_3.id_this, 1, 256, Ha_1.id_class().id_class(new Hw_1(OptionalDouble.empty())).id_class(id_short).id_class(id_private).id_class(P).id_class(id_long).id_class(false));
    private final jZ_2 m;
    private final int Z;
    private final int v;
    private final boolean F;
    private final boolean L;
    private final Optional<HU> A;
    private int n = -1;
    public static final HU[] s = HU.id_static();
    private static Map<rrWx_1, HU> C;

    public Optional<HU> id_char() {
        return this.A;
    }

    public static HU id_byte(rqO_2 rqO_22, boolean bl) {
        rqO_2 rqO_23 = rqO_22 = HU.id_continue(rqO_22);
        return HU.id_class("entity_translucent", rqO_22, bl, () -> {
            Ha_1 ha_1 = Ha_1.id_class().id_class(new HR(rqO_23, false, false)).id_class(id_private).id_class(id_while).id_class(id_finally).id_class(id_throw).id_class(id_synchronized).id_class(id_public).id_class(bl);
            return HU.id_class("entity_translucent", ju_3.id_implements, 7, 256, true, true, ha_1);
        });
    }

    public static HU id_byte(rqO_2 rqO_22) {
        rqO_2 rqO_23 = rqO_22 = HU.id_continue(rqO_22);
        return HU.id_class("entity_cutout", rqO_22, () -> {
            Ha_1 ha_1 = Ha_1.id_class().id_class(new HR(rqO_23, false, false)).id_class(id_byte).id_class(id_while).id_class(id_finally).id_class(id_synchronized).id_class(id_public).id_class(true);
            return HU.id_class("entity_cutout", ju_3.id_implements, 7, 256, true, false, ha_1);
        });
    }

    public static HU id_int(rqO_2 rqO_22) {
        return HU.id_class("text", rqO_22, () -> HU.id_class("text", ju_3.id_goto, 7, 256, false, false, Ha_1.id_class().id_class(new HR(rqO_22, false, false)).id_class(id_finally).id_class(id_private).id_class(id_synchronized).id_class(false)));
    }

    public static HU id_int() {
        return k;
    }

    public static int id_long() {
        return HU.S.G.id_new.size();
    }

    public rqO_2 id_float() {
        return null;
    }

    public HU(String string, jZ_2 jZ_22, int n, int n2, boolean bl, boolean bl2, Runnable runnable, Runnable runnable2) {
        super(string, runnable, runnable2);
        this.m = jZ_22;
        this.Z = n;
        this.v = n2;
        this.F = bl;
        this.L = bl2;
        this.A = Optional.of(this);
    }

    @Override
    public String toString() {
        return this.id_class;
    }

    public static HU id_this() {
        return N;
    }

    public boolean id_interface() {
        return this.F;
    }

    private static HU id_class(rrWx_1 rrWx_12, Supplier<HU> supplier) {
        HU hU;
        if (C == null) {
            C = new HashMap<rrWx_1, HU>();
        }
        if ((hU = C.get(rrWx_12)) != null) {
            return hU;
        }
        hU = supplier.get();
        C.put(rrWx_12, hU);
        return hU;
    }

    private static HU id_class(String string, int n, Supplier<HU> supplier) {
        rrWx_1 rrWx_12 = new rrWx_1(string, n);
        return HU.id_class(rrWx_12, supplier);
    }

    public static HU id_class(int n) {
        return HU.id_class("end_portal", n, () -> {
            HR hR;
            Ho_1 ho_1;
            if (n <= 1) {
                ho_1 = id_private;
                hR = new HR(jE_2.id_class, false, false);
            } else {
                ho_1 = id_protected;
                hR = new HR(jE_2.id_break, false, false);
            }
            return HU.id_class("end_portal", ju_3.id_this, 7, 256, false, true, Ha_1.id_class().id_class(ho_1).id_class(hR).id_class(new Hj_1(n)).id_class(id_strictfp).id_class(false));
        });
    }

    public static HU id_class(rqO_2 rqO_22, float f) {
        rqO_2 rqO_23 = rqO_22 = HU.id_continue(rqO_22);
        return HU.id_class("entity_alpha", rqO_22, f, () -> {
            Ha_1 ha_1 = Ha_1.id_class().id_class(new HR(rqO_23, false, false)).id_class(new HC(f)).id_class(id_throw).id_class(true);
            return HU.id_class("entity_alpha", ju_3.id_implements, 7, 256, ha_1);
        });
    }

    public static HU id_class(rqO_2 rqO_22, HH hH) {
        return HU.id_class("outline", rqO_22, hH == id_instanceof, () -> HU.id_class("outline", ju_3.id_return, 7, 256, Ha_1.id_class().id_class(new HR(rqO_22, false, false)).id_class(hH).id_class(id_interface).id_class(id_finally).id_class(id_super).id_class(id_default).id_class(id_transient).id_class(He_1.IS_OUTLINE)));
    }

    public static HU id_class(rqO_2 rqO_22, float f, float f2) {
        rqO_2 rqO_23 = rqO_22 = HU.id_continue(rqO_22);
        return HU.id_class("energy_swirl", rqO_22, f, f2, () -> HU.id_class("energy_swirl", ju_3.id_implements, 7, 256, false, true, Ha_1.id_class().id_class(new HR(rqO_23, false, false)).id_class(new HI(f, f2)).id_class(id_strictfp).id_class(id_protected).id_class(id_while).id_class(id_finally).id_class(id_throw).id_class(id_synchronized).id_class(id_public).id_class(false)));
    }

    public static yr_3 id_class(String string, jZ_2 jZ_22, int n, int n2, boolean bl, boolean bl2, Ha_1 ha_1) {
        return yr_3.id_break(string, jZ_22, n, n2, bl, bl2, ha_1);
    }

    public void id_class(lD_2 lD_22, int n, int n2, int n3) {
        if (lD_22.id_final()) {
            if (this.L) {
                lD_22.id_protected(n, n2, n3);
            }
            if (lD_22.id_finally != null) {
                rrMh_1.id_class(lD_22.id_finally);
            }
            lD_22.id_finally();
            this.id_class();
            if (rrbb_3.rs()) {
                rrxn_3.id_class(false);
                rrdZ.u();
                rrdL.id_class(this, lD_22);
            }
            yk_3.id_class(lD_22);
            if (rrbb_3.rs()) {
                rrdL.id_break(this, lD_22);
                rrdZ.m();
                rrxn_3.id_class(true);
            }
            this.id_break();
        }
    }

    private static HU id_class(String string, rqO_2 rqO_22, boolean bl, Supplier<HU> supplier) {
        rrWx_1 rrWx_12 = new rrWx_1(string, rqO_22, bl);
        return HU.id_class(rrWx_12, supplier);
    }

    private static HU id_class(String string, rqO_2 rqO_22, Supplier<HU> supplier) {
        rrWx_1 rrWx_12 = new rrWx_1(string, rqO_22);
        return HU.id_class(rrWx_12, supplier);
    }

    public static yr_3 id_class(String string, jZ_2 jZ_22, int n, int n2, Ha_1 ha_1) {
        return HU.id_class(string, jZ_22, n, n2, false, false, ha_1);
    }

    private static HU id_class(String string, rqO_2 rqO_22, float f, Supplier<HU> supplier) {
        rrWx_1 rrWx_12 = new rrWx_1(string, rqO_22, Float.valueOf(f));
        return HU.id_class(rrWx_12, supplier);
    }

    private static HU id_class(String string, rqO_2 rqO_22, float f, float f2, Supplier<HU> supplier) {
        rrWx_1 rrWx_12 = new rrWx_1(string, rqO_22, Float.valueOf(f), Float.valueOf(f2));
        return HU.id_class(rrWx_12, supplier);
    }

    public static HU id_class(rqO_2 rqO_22) {
        rqO_2 rqO_23 = rqO_22 = HU.id_continue(rqO_22);
        return HU.id_class("armor_cutout_no_cull", rqO_22, () -> {
            Ha_1 ha_1 = Ha_1.id_class().id_class(new HR(rqO_23, false, false)).id_class(id_byte).id_class(id_while).id_class(id_finally).id_class(id_throw).id_class(id_synchronized).id_class(id_public).id_class(id_short).id_class(true);
            return HU.id_class("armor_cutout_no_cull", ju_3.id_implements, 7, 256, true, false, ha_1);
        });
    }

    public static HU id_class(rqO_2 rqO_22, boolean bl) {
        rqO_2 rqO_23 = rqO_22 = HU.id_continue(rqO_22);
        return HU.id_class("entity_cutout_no_cull", rqO_22, bl, () -> {
            Ha_1 ha_1 = Ha_1.id_class().id_class(new HR(rqO_23, false, false)).id_class(id_byte).id_class(id_while).id_class(id_finally).id_class(id_throw).id_class(id_synchronized).id_class(id_public).id_class(bl);
            return HU.id_class("entity_cutout_no_cull", ju_3.id_implements, 7, 256, true, false, ha_1);
        });
    }

    private static Ha_1 id_default() {
        return Ha_1.id_class().id_class(id_final).id_class(id_synchronized).id_class(id_package).id_class(id_private).id_class(id_switch).id_class(true);
    }

    private static Ha_1 id_short() {
        return Ha_1.id_class().id_class(id_final).id_class(id_synchronized).id_class(id_package).id_class(id_private).id_class(P).id_class(true);
    }

    public boolean id_void() {
        return this.id_float() == Hz_1.id_class;
    }

    public static HU id_break(rqO_2 rqO_22, boolean bl) {
        rqO_2 rqO_23 = rqO_22 = HU.id_continue(rqO_22);
        return HU.id_class("entity_cutout_no_cull_z_offset", rqO_22, bl, () -> {
            Ha_1 ha_1 = Ha_1.id_class().id_class(new HR(rqO_23, false, false)).id_class(id_byte).id_class(id_while).id_class(id_finally).id_class(id_throw).id_class(id_synchronized).id_class(id_public).id_class(id_short).id_class(bl);
            return HU.id_class("entity_cutout_no_cull_z_offset", ju_3.id_implements, 7, 256, true, false, ha_1);
        });
    }

    public static HU id_break(rqO_2 rqO_22) {
        rqO_2 rqO_23 = rqO_22 = HU.id_continue(rqO_22);
        return HU.id_class("entity_solid", rqO_22, () -> {
            Ha_1 ha_1 = Ha_1.id_class().id_class(new HR(rqO_23, false, false)).id_class(id_byte).id_class(id_while).id_class(id_synchronized).id_class(id_public).id_class(true);
            return HU.id_class("entity_solid", ju_3.id_implements, 7, 256, true, false, ha_1);
        });
    }

    public boolean id_throws() {
        return this.L;
    }

    public static HU id_throws(rqO_2 rqO_22) {
        return HU.id_break(rqO_22, true);
    }

    public static HU id_finally() {
        return O;
    }

    public static HU id_finally(rqO_2 rqO_22) {
        rqO_2 rqO_23 = rqO_22 = HU.id_continue(rqO_22);
        return HU.id_class("entity_decal", rqO_22, () -> {
            Ha_1 ha_1 = Ha_1.id_class().id_class(new HR(rqO_23, false, false)).id_class(id_while).id_class(id_finally).id_class(id_char).id_class(id_throw).id_class(id_synchronized).id_class(id_public).id_class(false);
            return HU.id_class("entity_decal", ju_3.id_implements, 7, 256, ha_1);
        });
    }

    public static HU id_catch(rqO_2 rqO_22) {
        rqO_2 rqO_23 = rqO_22 = HU.id_continue(rqO_22);
        return HU.id_class("entity_translucent_cull", rqO_22, () -> {
            Ha_1 ha_1 = Ha_1.id_class().id_class(new HR(rqO_23, false, false)).id_class(id_private).id_class(id_while).id_class(id_finally).id_class(id_synchronized).id_class(id_public).id_class(true);
            return HU.id_class("entity_translucent_cull", ju_3.id_implements, 7, 256, true, true, ha_1);
        });
    }

    public static HU id_catch() {
        return G;
    }

    public static HU id_extends() {
        return h;
    }

    public static HU id_extends(rqO_2 rqO_22) {
        rqO_2 rqO_23 = rqO_22 = HU.id_continue(rqO_22);
        return HU.id_class("entity_no_outline", rqO_22, () -> {
            Ha_1 ha_1 = Ha_1.id_class().id_class(new HR(rqO_23, false, false)).id_class(id_private).id_class(id_while).id_class(id_finally).id_class(id_throw).id_class(id_synchronized).id_class(id_public).id_class(id_float).id_class(false);
            return HU.id_class("entity_no_outline", ju_3.id_implements, 7, 256, false, true, ha_1);
        });
    }

    public int id_goto() {
        return this.v;
    }

    public static HU id_case() {
        return E;
    }

    public static HU id_case(rqO_2 rqO_22) {
        rqO_2 rqO_23 = rqO_22 = HU.id_continue(rqO_22);
        return HU.id_class("item_entity_translucent_cull", rqO_22, () -> {
            Ha_1 ha_1 = Ha_1.id_class().id_class(new HR(rqO_23, false, false)).id_class(id_private).id_class(P).id_class(id_while).id_class(id_finally).id_class(id_synchronized).id_class(id_public).id_class(Hn_1.id_long).id_class(true);
            return HU.id_class("item_entity_translucent_cull", ju_3.id_implements, 7, 256, true, true, ha_1);
        });
    }

    public static HU id_continue() {
        return z;
    }

    public static rqO_2 id_continue(rqO_2 rqO_22) {
        if (rrbb_3.R()) {
            rqO_22 = rrME.id_class(rqO_22);
        }
        if (rrbY_2.id_class()) {
            rqO_22 = rrbY_2.id_class(rqO_22);
        }
        return rqO_22;
    }

    public static HU id_else() {
        return c;
    }

    public static HU id_implements() {
        return M;
    }

    public static HU id_implements(rqO_2 rqO_22) {
        rqO_2 rqO_23 = rqO_22 = HU.id_continue(rqO_22);
        return HU.id_class("entity_smooth_cutout", rqO_22, () -> {
            Ha_1 ha_1 = Ha_1.id_class().id_class(new HR(rqO_23, false, false)).id_class(id_extends).id_class(id_while).id_class(id_final).id_class(id_throw).id_class(id_synchronized).id_class(true);
            return HU.id_class("entity_smooth_cutout", ju_3.id_implements, 7, 256, ha_1);
        });
    }

    private static Ha_1 id_import() {
        return Ha_1.id_class().id_class(id_final).id_class(id_synchronized).id_class(id_package).id_class(id_private).id_class(id_for).id_class(true);
    }

    public Optional<HU> id_instanceof() {
        return Optional.empty();
    }

    public static HU id_new() {
        return W;
    }

    public static HU id_new(rqO_2 rqO_22) {
        return HU.id_class("text_see_through", rqO_22, () -> HU.id_class("text_see_through", ju_3.id_goto, 7, 256, false, false, Ha_1.id_class().id_class(new HR(rqO_22, false, false)).id_class(id_finally).id_class(id_private).id_class(id_synchronized).id_class(id_interface).id_class(id_float).id_class(false)));
    }

    public static HU id_package(rqO_2 rqO_22) {
        return HU.id_class("crumbling", rqO_22, () -> {
            HR hR = new HR(rqO_22, false, false);
            return HU.id_class("crumbling", ju_3.id_private, 7, 256, false, true, Ha_1.id_class().id_class(hR).id_class(id_finally).id_class(id_catch).id_class(id_float).id_class(id_import).id_class(false));
        });
    }

    public static HU id_package() {
        return d;
    }

    public static HU id_return() {
        return S;
    }

    public static HU id_super() {
        return Q;
    }

    public boolean id_throw() {
        return false;
    }

    public int id_try() {
        return this.Z;
    }

    public jZ_2 id_while() {
        return this.m;
    }

    private static HU[] id_static() {
        HU[] hUArray = HU.id_public().toArray(new HU[0]);
        int n = 0;
        while (n < hUArray.length) {
            HU hU = hUArray[n];
            hU.n = n++;
        }
        return hUArray;
    }

    public static List<HU> id_public() {
        return ImmutableList.of((Object)HU.id_case(), (Object)HU.id_catch(), (Object)HU.id_private(), (Object)HU.id_implements(), (Object)HU.id_synchronized());
    }

    public int id_protected() {
        return this.n;
    }

    public static HU id_protected(rqO_2 rqO_22) {
        return HU.id_class(rqO_22, true);
    }

    public static HU id_protected(rqO_2 rqO_22, boolean bl) {
        rqO_2 rqO_23 = rqO_22 = HU.id_continue(rqO_22);
        return HU.id_class("beacon_beam", rqO_22, bl, () -> {
            Ha_1 ha_1 = Ha_1.id_class().id_class(new HR(rqO_23, false, false)).id_class(bl ? id_private : id_byte).id_class(bl ? id_float : id_long).id_class(id_default).id_class(false);
            return HU.id_class("beacon_beam", ju_3.id_private, 7, 256, false, true, ha_1);
        });
    }

    public static HU id_private(rqO_2 rqO_22) {
        return HU.id_byte(rqO_22, true);
    }

    public static HU id_private() {
        return b;
    }

    public boolean id_abstract() {
        return this.id_byte().equals("entity_solid");
    }

    public static HU id_final() {
        return x;
    }

    public static HU id_final(rqO_2 rqO_22) {
        return HU.id_class(rqO_22, id_throw);
    }

    public static HU id_volatile() {
        return J;
    }

    public static HU id_volatile(rqO_2 rqO_22) {
        rqO_2 rqO_23 = rqO_22 = HU.id_continue(rqO_22);
        return HU.id_class("eyes", rqO_22, () -> {
            HR hR = new HR(rqO_23, false, false);
            return HU.id_class("eyes", ju_3.id_implements, 7, 256, false, true, Ha_1.id_class().id_class(hR).id_class(id_protected).id_class(id_float).id_class(id_strictfp).id_class(false));
        });
    }

    public static HU id_synchronized() {
        return u;
    }

    public static HU id_native(rqO_2 rqO_22) {
        rqO_2 rqO_23 = rqO_22 = HU.id_continue(rqO_22);
        return HU.id_class("entity_shadow", rqO_22, () -> {
            Ha_1 ha_1 = Ha_1.id_class().id_class(new HR(rqO_23, false, false)).id_class(id_private).id_class(id_while).id_class(id_finally).id_class(id_instanceof).id_class(id_synchronized).id_class(id_public).id_class(id_float).id_class(id_abstract).id_class(id_short).id_class(false);
            return HU.id_class("entity_shadow", ju_3.id_implements, 7, 256, false, false, ha_1);
        });
    }

    public static HU id_native() {
        return X;
    }
}

