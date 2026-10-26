/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Oo_1;
import celestial.VD;
import celestial.aY_2;
import celestial.eA_2;
import celestial.eY_2;
import celestial.ee_3;
import celestial.iB_2;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdO_2;
import celestial.rdS_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhN_2;
import celestial.rhZ_2;
import celestial.rhd_3;
import celestial.rhf_3;
import celestial.rhm_3;
import celestial.rhx_3;
import celestial.rhy_3;
import celestial.rhz_3;
import celestial.rjU_2;
import celestial.rjY_2;
import celestial.rje_3;
import celestial.rkB_2;
import celestial.rkc_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rxb_3;
import celestial.rym_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class rxm_3
extends rkB_2
implements ee_3,
rdS_2 {
    public static final rdn_3 id_class = new rdn_3(rdy_3.kW);
    private boolean id_protected = false;
    private boolean id_finally = false;

    @Override
    public Predicate<rdn_3> id_byte() {
        return id_break;
    }

    @Override
    public rkc_3 id_byte(rdn_3 rdn_32) {
        return rkc_3.CROSSBOW;
    }

    public rxm_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    private rqA_2 id_class(int n) {
        switch (n) {
            case 1: {
                return rqn_3.Pn;
            }
            case 2: {
                return rqn_3.PC;
            }
            case 3: {
                return rqn_3.Pl;
            }
        }
        return rqn_3.PA;
    }

    @Override
    public void id_class(rYB rYB2, iB_2 iB_22, rdn_3 rdn_32, int n) {
        if (!rYB2.id_continue) {
            int n2 = eA_2.id_class(eY_2.id_void, rdn_32);
            rqA_2 rqA_22 = this.id_class(n2);
            rqA_2 rqA_23 = n2 == 0 ? rqn_3.PL : null;
            float f = (float)(rdn_32.id_extends() - n) / (float)rxm_3.id_private(rdn_32);
            if (f < 0.2f) {
                this.id_protected = false;
                this.id_finally = false;
            }
            if (f >= 0.2f && !this.id_protected) {
                this.id_protected = true;
                rYB2.id_class((rhd_3)null, iB_22.rx(), iB_22.re(), iB_22.BO(), rqA_22, rqL_2.PLAYERS, 0.5f, 1.0f);
            }
            if (f >= 0.5f && rqA_23 != null && !this.id_finally) {
                this.id_finally = true;
                rYB2.id_class((rhd_3)null, iB_22.rx(), iB_22.re(), iB_22.BO(), rqA_23, rqL_2.PLAYERS, 0.5f, 1.0f);
            }
        }
    }

    private static void id_class(rYB rYB2, iB_2 iB_22, rdn_3 rdn_32) {
        if (iB_22 instanceof rhN_2) {
            rhN_2 rhN_22 = (rhN_2)iB_22;
            if (!rYB2.id_continue) {
                Oo_1.id_abstract.id_class(rhN_22, rdn_32);
            }
            rhN_22.id_class(rlB_2.id_byte.id_break(rdn_32.id_break()));
        }
        rxm_3.id_volatile(rdn_32);
    }

    private static float id_class(boolean bl) {
        float f = bl ? 0.63f : 0.43f;
        return 1.0f / (id_private.nextFloat() * 0.5f + 1.8f) + f;
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (rxm_3.id_protected(rdn_32)) {
            rxm_3.id_class(rYB2, rhd_32, rpm_32, rdn_32, rxm_3.id_final(rdn_32), 1.0f);
            rxm_3.id_class(rdn_32, false);
            return rym_3.id_break(rdn_32);
        }
        if (!rhd_32.id_case(rdn_32).id_class()) {
            if (!rxm_3.id_protected(rdn_32)) {
                this.id_protected = false;
                this.id_finally = false;
                rhd_32.id_break(rpm_32);
            }
            return rym_3.id_break(rdn_32);
        }
        return rym_3.id_protected(rdn_32);
    }

    public static void id_class(rYB rYB2, iB_2 iB_22, rpm_3 rpm_32, rdn_3 rdn_32, float f, float f2) {
        List<rdn_3> list = rxm_3.id_catch(rdn_32);
        float[] fArray = rxm_3.id_class(iB_22.Sa());
        for (int i = 0; i < list.size(); ++i) {
            boolean bl;
            rdn_3 rdn_33 = list.get(i);
            boolean bl2 = bl = iB_22 instanceof rhd_3 && ((rhx_3)((rhd_3)iB_22).id_implements[18]).id_protected;
            if (rdn_33.id_class()) continue;
            if (i == 0) {
                rxm_3.id_class(rYB2, iB_22, rpm_32, rdn_32, rdn_33, fArray[i], bl, f, f2, 0.0f);
                continue;
            }
            if (i == 1) {
                rxm_3.id_class(rYB2, iB_22, rpm_32, rdn_32, rdn_33, fArray[i], bl, f, f2, -10.0f);
                continue;
            }
            if (i != 2) continue;
            rxm_3.id_class(rYB2, iB_22, rpm_32, rdn_32, rdn_33, fArray[i], bl, f, f2, 10.0f);
        }
        rxm_3.id_class(rYB2, iB_22, rdn_32);
    }

    private static float[] id_class(Random random) {
        boolean bl = random.nextBoolean();
        return new float[]{1.0f, rxm_3.id_class(bl), rxm_3.id_class(!bl)};
    }

    @Override
    public String id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        if (rhd_32.id_implements()) {
            return "Inf";
        }
        int n = rxm_3.id_native(rdn_32);
        for (int i = 0; i < 45; ++i) {
            rdn_3 rdn_33 = ((rhz_3)rhd_32.id_implements[1]).id_extends(i);
            if (!(rdn_33.id_break() instanceof rxb_3)) continue;
            n += rdn_33.id_char();
        }
        return "" + n;
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
        List<rdn_3> list2 = rxm_3.id_catch(rdn_32);
        if (rxm_3.id_protected(rdn_32) && !list2.isEmpty()) {
            rdn_3 rdn_33 = list2.get(0);
            list.add(new rgn_3("item.minecraft.crossbow.projectile").id_break(" ").id_class(rdn_33.id_throw()));
            if (vD.id_class() && rdn_33.id_break() == rdy_3.dc) {
                ArrayList arrayList = Lists.newArrayList();
                rdy_3.dc.id_class(rdn_33, rYB2, arrayList, vD);
                if (!arrayList.isEmpty()) {
                    for (int i = 0; i < arrayList.size(); ++i) {
                        arrayList.set(i, new rgN_2("  ").id_class((rgP_2)arrayList.get(i)).id_class(rgF_2.GRAY));
                    }
                    list.addAll(arrayList);
                }
            }
        }
    }

    public static float id_class(int n, rdn_3 rdn_32) {
        float f = (float)n / (float)rxm_3.id_private(rdn_32);
        if (f > 1.0f) {
            f = 1.0f;
        }
        return f;
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, iB_2 iB_22, int n) {
        int n2 = this.id_break(rdn_32) - n;
        float f = rxm_3.id_class(n2, rdn_32);
        if (f >= 1.0f && !rxm_3.id_protected(rdn_32) && rxm_3.id_class(iB_22, rdn_32)) {
            rxm_3.id_class(rdn_32, true);
            rqL_2 rqL_22 = iB_22 instanceof rhd_3 ? rqL_2.PLAYERS : rqL_2.HOSTILE;
            rYB2.id_class((rhd_3)null, iB_22.rx(), iB_22.re(), iB_22.BO(), rqn_3.PF, rqL_22, 1.0f, 1.0f / (id_private.nextFloat() * 0.5f + 1.0f) + 0.2f);
        }
    }

    public static void id_class(rdn_3 rdn_32, boolean bl) {
        rcd_3 rcd_32 = rdn_32.id_int();
        rcd_32.id_class("Charged", bl);
    }

    private static boolean id_class(iB_2 iB_22, rdn_3 rdn_32, rdn_3 rdn_33, boolean bl, boolean bl2) {
        rdn_3 rdn_34;
        boolean bl3;
        if (rdn_33.id_class()) {
            return false;
        }
        boolean bl4 = bl3 = bl2 && rdn_33.id_break() instanceof rxb_3;
        if (!(bl3 || bl2 || bl)) {
            rdn_34 = rdn_33.id_class(1);
            if (rdn_33.id_class() && iB_22 instanceof rhd_3) {
                ((rhz_3)((rhd_3)iB_22).id_implements[1]).id_catch(rdn_33);
            }
        } else {
            rdn_34 = rdn_33.id_implements();
        }
        rxm_3.id_break(rdn_32, rdn_34);
        return true;
    }

    private static boolean id_class(iB_2 iB_22, rdn_3 rdn_32) {
        int n = eA_2.id_class(eY_2.id_float, rdn_32);
        int n2 = n == 0 ? 1 : 3;
        boolean bl = iB_22 instanceof rhd_3 && ((rhx_3)((rhd_3)iB_22).id_implements[18]).id_protected;
        rdn_3 rdn_33 = iB_22.id_case(rdn_32);
        rdn_3 rdn_34 = rdn_33.id_implements();
        for (int i = 0; i < n2; ++i) {
            if (i > 0) {
                rdn_33 = rdn_34.id_implements();
            }
            if (rdn_33.id_class() && bl) {
                rdn_33 = new rdn_3(rdy_3.OO);
                rdn_34 = rdn_33.id_implements();
            }
            if (rxm_3.id_class(iB_22, rdn_32, rdn_33, i > 0, bl)) continue;
            return false;
        }
        return true;
    }

    public static boolean id_class(rdn_3 rdn_33, rdb_3 rdb_32) {
        return rxm_3.id_catch(rdn_33).stream().anyMatch(rdn_32 -> rdn_32.id_break() == rdb_32);
    }

    private static void id_class(rYB rYB2, iB_2 iB_23, rpm_3 rpm_32, rdn_3 rdn_32, rdn_3 rdn_33, float f, boolean bl, float f2, float f3, float f4) {
        if (!rYB2.id_continue) {
            rhf_3 rhf_32;
            boolean bl2;
            boolean bl3 = bl2 = rdn_33.id_break() == rdy_3.dc;
            if (bl2) {
                rhf_32 = new rhy_3(rYB2, rdn_33, iB_23, iB_23.rx(), iB_23.rH() - (double)0.15f, iB_23.BO(), true);
            } else {
                rhf_32 = rxm_3.id_class(rYB2, iB_23, rdn_32, rdn_33);
                if (bl || f4 != 0.0f) {
                    ((rhm_3)rhf_32).id_protected = rhZ_2.CREATIVE_ONLY;
                }
            }
            if (iB_23 instanceof aY_2) {
                aY_2 aY_22 = (aY_2)((Object)iB_23);
                aY_22.id_class(aY_22.I_(), rdn_32, rhf_32, f4);
            } else {
                rjU_2 rjU_22 = iB_23.id_continue(1.0f);
                rjY_2 rjY_22 = new rjY_2(new rje_3(rjU_22), f4, true);
                rjU_2 rjU_23 = iB_23.id_break(1.0f);
                rje_3 rje_32 = new rje_3(rjU_23);
                rje_32.id_class(rjY_22);
                rhf_32.id_byte(rje_32.id_class(), rje_32.id_break(), rje_32.id_byte(), f2, f3);
            }
            rdn_32.id_class(bl2 ? 3 : 1, iB_23, (T iB_22) -> iB_22.id_byte(rpm_32));
            rYB2.a_(rhf_32);
            rYB2.id_class((rhd_3)null, iB_23.rx(), iB_23.re(), iB_23.BO(), rqn_3.PH, rqL_2.PLAYERS, 1.0f, f);
        }
    }

    private static rhm_3 id_class(rYB rYB2, iB_2 iB_22, rdn_3 rdn_32, rdn_3 rdn_33) {
        rxb_3 rxb_32 = (rxb_3)(rdn_33.id_break() instanceof rxb_3 ? rdn_33.id_break() : rdy_3.OO);
        rhm_3 rhm_32 = rxb_32.id_class(rYB2, rdn_33, iB_22);
        if (iB_22 instanceof rhd_3) {
            rhm_32.id_class(true);
        }
        rhm_32.id_class(rqn_3.Pv);
        rhm_32.id_protected(true);
        int n = eA_2.id_class(eY_2.id_static, rdn_32);
        if (n > 0) {
            rhm_32.id_break((byte)n);
        }
        return rhm_32;
    }

    private static void id_break(rdn_3 rdn_32, rdn_3 rdn_33) {
        rcd_3 rcd_32 = rdn_32.id_int();
        rcy_3 rcy_32 = rcd_32.id_byte("ChargedProjectiles", 9) ? rcd_32.id_protected("ChargedProjectiles", 10) : new rcy_3();
        rcd_3 rcd_33 = new rcd_3();
        rdn_33.id_break(rcd_33);
        rcy_32.add(rcd_33);
        rcd_32.id_class("ChargedProjectiles", rcy_32);
    }

    @Override
    public int id_break(rdn_3 rdn_32) {
        return rxm_3.id_private(rdn_32) + 3;
    }

    @Override
    public int id_throws() {
        return 8;
    }

    @Override
    public rdn_3 id_catch() {
        return id_class;
    }

    public static List<rdn_3> id_catch(rdn_3 rdn_32) {
        rcy_3 rcy_32;
        ArrayList arrayList = Lists.newArrayList();
        rcd_3 rcd_32 = rdn_32.id_package();
        if (rcd_32 != null && rcd_32.id_byte("ChargedProjectiles", 9) && (rcy_32 = rcd_32.id_protected("ChargedProjectiles", 10)) != null) {
            for (int i = 0; i < rcy_32.size(); ++i) {
                rcd_3 rcd_33 = rcy_32.id_class(i);
                arrayList.add(rdn_3.id_class(rcd_33));
            }
        }
        return arrayList;
    }

    public static boolean id_protected(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_package();
        return rcd_32 != null && rcd_32.id_new("Charged");
    }

    public static int id_private(rdn_3 rdn_32) {
        int n = eA_2.id_class(eY_2.id_void, rdn_32);
        return n == 0 ? 25 : 25 - 5 * n;
    }

    @Override
    public Predicate<rdn_3> id_private() {
        return id_byte;
    }

    private static float id_final(rdn_3 rdn_32) {
        return rdn_32.id_break() == rdy_3.kU && rxm_3.id_class(rdn_32, rdy_3.dc) ? 1.6f : 3.15f;
    }

    private static void id_volatile(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_package();
        if (rcd_32 != null) {
            rcy_3 rcy_32 = rcd_32.id_protected("ChargedProjectiles", 9);
            rcy_32.clear();
            rcd_32.id_class("ChargedProjectiles", rcy_32);
        }
    }

    private static int id_native(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_package();
        return rcd_32 != null && rcd_32.id_byte("ChargedProjectiles", 9) ? rcd_32.id_protected("ChargedProjectiles", 10).size() : 0;
    }
}

