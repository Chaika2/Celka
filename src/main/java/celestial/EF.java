/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_throws;
import celestial.EA;
import celestial.EL;
import celestial.EZ;
import celestial.En_1;
import celestial.Ev_1;
import celestial.GJ;
import celestial.Gx_1;
import celestial.JU;
import celestial.Ja_1;
import celestial.Jj_1;
import celestial.PJ;
import celestial.PP;
import celestial.PX;
import celestial.Ph_1;
import celestial.Pm_1;
import celestial.Ps_1;
import celestial.Pu_1;
import celestial.Px_1;
import celestial.QP;
import celestial.WD;
import celestial.WT;
import celestial.Wg_1;
import celestial.Wl_1;
import celestial.Wp_1;
import celestial.Ww_1;
import celestial.bO_2;
import celestial.bU_2;
import celestial.bW_2;
import celestial.ba_3;
import celestial.bw_3;
import celestial.dH_2;
import celestial.dL_2;
import celestial.dN_2;
import celestial.dj_3;
import celestial.dq_3;
import celestial.eA_2;
import celestial.kE_2;
import celestial.kn_3;
import celestial.ky_3;
import celestial.rCK;
import celestial.rCN;
import celestial.rCj_1;
import celestial.rCo_1;
import celestial.rLT;
import celestial.rRq_1;
import celestial.rU_2;
import celestial.rXB;
import celestial.rXE;
import celestial.rXG;
import celestial.rXh_1;
import celestial.rXs_1;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rfw_3;
import celestial.rhz_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rk_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rx_3;
import celestial.rz_3;
import celestial.xC_2;
import celestial.xP_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xp_3;
import celestial.xu_3;
import celestial.zG_2;
import celestial.zs_3;
import celestial.zv_3;
import java.util.List;
import java.util.Optional;

public interface EF
extends PP,
rx_3 {
    public static boolean id_byte(bw_3 bw_32, int n, int n2, int n3, xc_3 xc_32) {
        Gx_1 gx_1 = EF.id_implements(xc_32);
        if (gx_1 == (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0])) {
            return true;
        }
        if (gx_1 == (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2])) {
            return false;
        }
        return EF.id_catch(bw_32, n, n2, n3, xc_32);
    }

    public static boolean id_byte(EZ eZ, int n, int n2, int n3, xc_3 xc_32) {
        return ((GJ)eZ.id_break[29]).id_class((bw_3)eZ.id_break[4], n, n2, n3, xc_32);
    }

    public static boolean id_byte(Ps_1 ps_1, rfH_2 rfH_22) {
        return EF.id_class(new bw_3(ps_1), rfH_22);
    }

    public static boolean id_byte(xc_3 xc_32) {
        rXs_1 rXs_12 = xc_32.id_volatile().id_class();
        return rXs_12 == rXG.id_byte || rXs_12 == rXG.id_break;
    }

    public static boolean id_byte(bw_3 bw_32, int n, int n2, int n3) {
        return EF.id_byte(bw_32, n, n2, n3, bw_32.id_class(n, n2, n3));
    }

    public static boolean id_byte(int n, int n2, int n3, xc_3 xc_32, bw_3 bw_32) {
        rXE rXE2 = xc_32.id_volatile();
        if (!(rXE2.id_class() instanceof rXB)) {
            return false;
        }
        if (rXE2.id_class().id_protected(rXE2) != 8) {
            return true;
        }
        return EF.id_protected(bw_32.id_class(n + 1, n2, n3)) || EF.id_protected(bw_32.id_class(n - 1, n2, n3)) || EF.id_protected(bw_32.id_class(n, n2, n3 + 1)) || EF.id_protected(bw_32.id_class(n, n2, n3 - 1));
    }

    public static boolean id_byte(EZ eZ, int n, int n2, int n3) {
        return ((GJ)eZ.id_break[29]).id_byte((bw_3)eZ.id_break[4], n, n2, n3, eZ.id_class(n, n2, n3));
    }

    public static boolean id_class(Ps_1 ps_1, rU_2 rU_22, xc_3 xc_32) {
        return EF.id_byte(new bw_3(ps_1), (int)((Integer)rU_22.id_break[0]), (int)((Integer)rU_22.id_break[1]), (int)((Integer)rU_22.id_break[2]), xc_32);
    }

    public static boolean id_class(EZ eZ, xc_3 xc_32) {
        return (Integer)eZ.id_break[17] != 0 && xc_32.id_byte() == QP.id_finally && xc_32.id_byte(dj_3.id_volatile) == 0;
    }

    public static void id_class(Ps_1 ps_1, xc_3 xc_32) {
        EF.id_class(ps_1, xc_32, new bU_2(ps_1.id_catch()), (Boolean)C_throws.id_break().G.id_class[0]);
    }

    public static boolean id_class(EZ eZ, int n, int n2, int n3) {
        return EF.id_class(eZ, n, n2, n3, eZ.id_class(n, n2, n3));
    }

    public static EL id_class(EA eA, C_case c_case, rfH_2 rfH_22, boolean bl, boolean bl2) {
        return EF.id_class(eA, c_case, rfH_22, bl, bl2, true);
    }

    public static boolean id_class(bw_3 bw_32, int n, int n2, int n3, boolean bl) {
        xc_3 xc_32 = bw_32.id_class(n, n2, n3);
        xd_3 xd_32 = xc_32.id_break();
        if (!bl && xd_32 instanceof dH_2 && ((Boolean)C_class.id_instanceof().id_continue.id_class[0]).booleanValue() && dH_2.id_implements(bw_32.id_class(n, n2 - 1, n3))) {
            return true;
        }
        if (xd_32 instanceof dj_3) {
            if (bl || ((Boolean)C_class.id_instanceof().rY.id_class[0]).booleanValue()) {
                return true;
            }
            int n4 = xc_32.id_byte(dj_3.id_volatile);
            if (n4 == 0) {
                return true;
            }
            return !(bw_32.id_class(n, n2 - 1, n3).id_break() instanceof dj_3);
        }
        return !xc_32.id_volatile().id_byte();
    }

    public static EL id_class(EA eA, C_case c_case, rfH_2 rfH_22, boolean bl, boolean bl2, boolean bl3) {
        Object object;
        Ps_1 ps_1 = c_case.id_throw();
        Optional<Px_1> optional = PJ.id_class(ps_1, rfH_22, bl2);
        boolean bl4 = false;
        if (optional.isPresent()) {
            eA.id_class(new En_1(optional.get().id_class(), true));
            bl4 = true;
        }
        for (int i = 0; i < 5; ++i) {
            rfH_2 rfH_23;
            object = rfH_22.id_break(((rpr_3[])Ev_1.id_class[0])[i]);
            if (!EF.id_byte(ps_1, (rfH_2)object)) continue;
            if (!((C_class)c_case).id_static().id_class(false, rfH_22.b_(), rfH_22.c_(), rfH_22.d_())) {
                PP.a_.id_byte("bb pls get me some blocks. dirt, netherrack, cobble");
                eA.id_class((rk_3)((Object)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]));
                return (EL)((Object)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[2]);
            }
            double d = ((double)(rfH_22.b_() + ((rja_3)object).b_()) + 1.0) * 0.5;
            double d2 = ((double)(rfH_22.c_() + ((rja_3)object).c_()) + 0.5) * 0.5;
            double d3 = ((double)(rfH_22.d_() + ((rja_3)object).d_()) + 1.0) * 0.5;
            PX pX = PJ.id_class(bl2 ? Ph_1.id_class(ps_1.id_catch()) : ps_1.id_finally(), new rjU_2(d, d2, d3), ps_1.id_protected());
            PX pX2 = c_case.id_catch().id_class().id_class(pX);
            rjG_2 rjG_22 = Ph_1.id_class(ps_1.id_catch(), pX2, ps_1.id_native().id_case(), bl2);
            if (rjG_22 == null || rjG_22.id_byte() != rjM_2.BLOCK || !(rfH_23 = ((rff_3)rjG_22).id_class()).equals(object) || !rfH_23.id_break(((rff_3)rjG_22).id_break()).equals(rfH_22)) continue;
            eA.id_class(new En_1(pX, true));
            bl4 = true;
            if (!bl) break;
        }
        if (ps_1.id_class().isPresent()) {
            rfH_2 rfH_24 = ps_1.id_class().get();
            object = ((rff_3)ps_1.id_byte()).id_break();
            if (rfH_24.equals(rfH_22) || EF.id_byte(ps_1, rfH_24) && rfH_24.id_break((rpr_3)object).equals(rfH_22)) {
                if (bl2) {
                    eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7]), true);
                }
                if (bl3) {
                    ((C_class)c_case).id_static().id_class(true, rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
                }
                return (EL)((Object)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[0]);
            }
        }
        if (bl4) {
            if (bl2) {
                eA.id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7]), true);
            }
            if (bl3) {
                ((C_class)c_case).id_static().id_class(true, rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
            }
            return (EL)((Object)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[1]);
        }
        return (EL)((Object)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[2]);
    }

    public static void id_class(Ps_1 ps_1, xc_3 xc_32, bU_2 bU_22, boolean bl) {
        if (C_class.id_instanceof().id_protected() && !((Boolean)C_class.id_instanceof().rr.id_class[0]).booleanValue()) {
            ((rhz_3)ps_1.id_catch().id_implements[1]).id_protected = bU_22.id_class(xc_32.id_break(), bl);
        }
    }

    public static double id_class(EZ eZ, int n, int n2, int n3, xc_3 xc_32, boolean bl) {
        if (!EF.id_break(eZ, n, n2, n3, xc_32)) {
            xc_3 xc_33;
            if (!xc_32.id_volatile().id_byte()) {
                return 1000000.0;
            }
            double d = eZ.id_break(n, n2, n3, xc_32);
            if (d >= 1000000.0) {
                return 1000000.0;
            }
            if (EF.id_class((bw_3)eZ.id_break[4], n, n2, n3, xc_32)) {
                return 1000000.0;
            }
            double d2 = ((bU_2)eZ.id_break[5]).id_class(xc_32);
            if (d2 <= 0.0) {
                return 1000000.0;
            }
            double d3 = 1.0 / d2;
            d3 += ((Double)eZ.id_break[24]).doubleValue();
            d3 *= d;
            if (bl && (xc_33 = eZ.id_class(n, n2 + 1, n3)).id_break() instanceof dH_2) {
                d3 += EF.id_class(eZ, n, n2 + 1, n3, xc_33, true);
            }
            return d3;
        }
        return 0.0;
    }

    public static double id_class(EZ eZ, int n, int n2, int n3, boolean bl) {
        return EF.id_class(eZ, n, n2, n3, eZ.id_class(n, n2, n3), bl);
    }

    public static void id_class(Ps_1 ps_1, EA eA, rfH_2 rfH_22) {
        eA.id_class(new En_1(new PX(PJ.id_class(ps_1.id_finally(), Pu_1.id_class(rfH_22), ps_1.id_protected()).id_throws(), ((Float)ps_1.id_catch().id_throws[16]).floatValue()), false)).id_class((Pm_1)((Object)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[0]), true);
        rz_3 rz_32 = C_throws.id_byte().id_void().id_throws();
        if (rz_32 != null) {
            rz_32.id_class(eA);
        }
    }

    public static boolean id_class(xd_3 xd_32) {
        return xd_32 instanceof Ja_1 || xd_32 == xu_3.id_instanceof || xd_32 == xu_3.id_try;
    }

    @Deprecated
    public static boolean id_class(int n, int n2, int n3, xc_3 xc_32, bw_3 bw_32) {
        return EF.id_break(n, n2, n3, xc_32, bw_32);
    }

    public static boolean id_class(bw_3 bw_32, rfH_2 rfH_22) {
        return EF.id_class(bw_32, rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    public static boolean id_class(Ps_1 ps_1, rfH_2 rfH_22) {
        return EF.id_byte(new bw_3(ps_1), rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    public static boolean id_class(rfH_2 rfH_22, xc_3 xc_32, rfH_2 rfH_23, rCN rCN2) {
        rpB_2 rpB_22;
        if (rfH_23.equals(rfH_22)) {
            return false;
        }
        rpB_2 rpB_23 = xc_32.id_byte(kE_2.p).id_final();
        boolean bl = xc_32.id_byte(rCN2);
        if (rfH_23.id_private().equals(rfH_22) || rfH_23.id_protected().equals(rfH_22)) {
            rpB_22 = rpB_2.Z;
        } else if (rfH_23.id_extends().equals(rfH_22) || rfH_23.id_byte().equals(rfH_22)) {
            rpB_22 = rpB_2.X;
        } else {
            return true;
        }
        return rpB_23 == rpB_22 == bl;
    }

    public static boolean id_class(Ps_1 ps_1, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (rfH_23.equals(rfH_22)) {
            return false;
        }
        xc_3 xc_32 = bw_3.id_class(ps_1, rfH_22);
        if (!(xc_32.id_break() instanceof dN_2)) {
            return true;
        }
        return EF.id_class(rfH_22, xc_32, rfH_23, dN_2.id_final);
    }

    public static boolean id_class(EZ eZ, int n, int n2, int n3, xc_3 xc_32) {
        return ((GJ)eZ.id_break[29]).id_break((bw_3)eZ.id_break[4], n, n2, n3, xc_32);
    }

    public static boolean id_class(bw_3 bw_32, int n, int n2, int n3) {
        return EF.id_case(bw_32, n, n2, n3, bw_32.id_class(n, n2, n3));
    }

    public static boolean id_class(Ps_1 ps_1, rU_2 rU_22) {
        return EF.id_break(new bw_3(ps_1), (int)((Integer)rU_22.id_break[0]), (int)((Integer)rU_22.id_break[1]), (int)((Integer)rU_22.id_break[2]));
    }

    public static Gx_1 id_class(xc_3 xc_32) {
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 instanceof Ja_1) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);
        }
        if (xd_32 instanceof Jj_1 || xd_32 == xu_3.SQ || xd_32 == xu_3.U || xd_32 == xu_3.BD || xd_32 == xu_3.PJ || xd_32 == xu_3.Sx || xd_32 instanceof dN_2 || xd_32 instanceof dq_3 || xd_32 instanceof WD || !xc_32.id_volatile().id_byte() || xd_32 instanceof zv_3 || xd_32 instanceof dL_2 || xd_32 instanceof Ww_1 || xd_32 instanceof Wp_1) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]);
        }
        try {
            if (xc_32.id_class(null, null, rLT.LAND)) {
                return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);
            }
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]);
        }
        catch (Throwable throwable) {
            System.out.println("The block " + xc_32.id_break().id_native().getString() + " requires a special case due to the exception " + throwable.getMessage());
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1]);
        }
    }

    public static boolean id_class(bw_3 bw_32, int n, int n2, int n3, xc_3 xc_32) {
        if (!((ba_3)bw_32.id_class[5]).id_class(n, n3)) {
            return true;
        }
        xd_3 xd_32 = xc_32.id_break();
        return ((List)C_class.id_instanceof().Pl.id_class[0]).contains(xd_32) || xd_32 == xu_3.PT || xd_32 instanceof WT || EF.id_class(bw_32, n, n2 + 1, n3, true) || EF.id_class(bw_32, n + 1, n2, n3, false) || EF.id_class(bw_32, n - 1, n2, n3, false) || EF.id_class(bw_32, n, n2, n3 + 1, false) || EF.id_class(bw_32, n, n2, n3 - 1, false);
    }

    public static boolean id_break(EZ eZ, int n, int n2, int n3, xc_3 xc_32) {
        return ((GJ)eZ.id_break[29]).id_byte((bw_3)eZ.id_break[4], n, n2, n3, xc_32);
    }

    public static boolean id_break(bw_3 bw_32, int n, int n2, int n3, xc_3 xc_32) {
        Gx_1 gx_1 = EF.id_private(xc_32);
        if (gx_1 == (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0])) {
            return true;
        }
        if (gx_1 == (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2])) {
            return false;
        }
        return EF.id_throws(bw_32, n, n2, n3, xc_32);
    }

    public static boolean id_break(int n, int n2, int n3, xc_3 xc_32, bw_3 bw_32) {
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 instanceof Ja_1) {
            return true;
        }
        if (xd_32 instanceof WD) {
            if (!bw_32.id_class(n, n3)) {
                return true;
            }
            return xc_32.id_byte(WD.id_volatile) == 1;
        }
        if (xd_32 == xu_3.GE || xd_32 == xu_3.Gs) {
            return true;
        }
        return xc_32.id_byte().id_throws();
    }

    public static boolean id_break(xc_3 xc_32) {
        return xc_32.id_break() instanceof Wg_1 && xc_32.id_byte(Wg_1.id_volatile) == rCo_1.BOTTOM;
    }

    public static boolean id_break(Ps_1 ps_1, rfH_2 rfH_22) {
        xc_3 xc_32 = bw_3.id_class(ps_1, rfH_22);
        return eA_2.id_implements(ps_1.id_catch()) && xc_32.id_byte() == QP.id_finally && xc_32.id_byte(dj_3.id_volatile) == 0;
    }

    public static boolean id_break(EZ eZ, int n, int n2, int n3) {
        return EF.id_byte(eZ, n, n2, n3, eZ.id_class(n, n2, n3));
    }

    public static boolean id_break(bw_3 bw_32, int n, int n2, int n3) {
        return EF.id_break(bw_32, n, n2, n3, bw_32.id_class(n, n2, n3));
    }

    public static boolean id_break(Ps_1 ps_1, rU_2 rU_22) {
        return EF.id_byte(new bw_3(ps_1), (int)((Integer)rU_22.id_break[0]), (int)((Integer)rU_22.id_break[1]), (int)((Integer)rU_22.id_break[2]));
    }

    public static boolean id_break(Ps_1 ps_1, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (rfH_23.equals(rfH_22)) {
            return false;
        }
        xc_3 xc_32 = bw_3.id_class(ps_1, rfH_22);
        if (!(xc_32.id_break() instanceof dq_3)) {
            return true;
        }
        return xc_32.id_byte(dq_3.id_volatile);
    }

    public static boolean id_throws(Ps_1 ps_1, rfH_2 rfH_22) {
        return EF.id_byte(bw_3.id_class(ps_1, rfH_22));
    }

    public static boolean id_throws(bw_3 bw_32, int n, int n2, int n3, xc_3 xc_32) {
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 instanceof xC_2) {
            return EF.id_byte(bw_32, n, n2 - 1, n3);
        }
        if (xd_32 instanceof WD) {
            if (!bw_32.id_class(n, n3)) {
                return true;
            }
            if (xc_32.id_byte(WD.id_volatile) >= 3) {
                return false;
            }
            return EF.id_byte(bw_32, n, n2 - 1, n3);
        }
        rXE rXE2 = xc_32.id_volatile();
        if (!rXE2.id_byte()) {
            if (EF.id_byte(n, n2, n3, xc_32, bw_32)) {
                return false;
            }
            if (((Boolean)C_class.id_instanceof().rZ.id_class[0]).booleanValue()) {
                return false;
            }
            xc_3 xc_33 = bw_32.id_class(n, n2 + 1, n3);
            if (!xc_33.id_volatile().id_byte() || xc_33.id_break() instanceof kn_3) {
                return false;
            }
            return rXE2.id_class() instanceof rXh_1;
        }
        return xc_32.id_class((rRq_1)bw_32.id_class[4], rfH_2.id_protected, rLT.LAND);
    }

    public static boolean id_throws(xc_3 xc_32) {
        xd_3 xd_32 = xc_32.id_break();
        return !xc_32.id_volatile().id_byte() || xd_32 == xu_3.bV || xd_32 == xu_3.Pw || xd_32 == xu_3.XJ || xd_32 instanceof Jj_1 || xd_32 == xu_3.SM || xd_32 == xu_3.U || xd_32 == xu_3.hM;
    }

    public static boolean id_finally(xc_3 xc_32) {
        return !xc_32.id_volatile().id_byte();
    }

    public static boolean id_catch(bw_3 bw_32, int n, int n2, int n3, xc_3 xc_32) {
        if (EF.id_byte(xc_32)) {
            xc_3 xc_33 = bw_32.id_class(n, n2 + 1, n3);
            xd_3 xd_32 = xc_33.id_break();
            if (xd_32 == xu_3.Sr || xd_32 instanceof xC_2) {
                return true;
            }
            if (EF.id_byte(n, n2, n3, xc_32, bw_32) || xc_33.id_volatile().id_class() == rXG.id_break) {
                return EF.id_byte(xc_33) && (Boolean)C_class.id_instanceof().rZ.id_class[0] == false;
            }
            return EF.id_byte(xc_33) ^ (Boolean)C_class.id_instanceof().rZ.id_class[0];
        }
        return EF.id_case(xc_32) && !EF.id_byte(n, n2, n3, xc_32, bw_32) && (Boolean)C_class.id_instanceof().rj.id_class[0] != false;
    }

    public static boolean id_catch(xc_3 xc_32) {
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 instanceof xP_2 || xd_32 instanceof ky_3 || xd_32 instanceof Wl_1 || xd_32 instanceof Wp_1) {
            return false;
        }
        try {
            return xd_3.id_class(xc_32.id_extends(null, null));
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static boolean id_case(Ps_1 ps_1, rfH_2 rfH_22) {
        xc_3 xc_32 = ps_1.id_case().id_byte(rfH_22);
        Gx_1 gx_1 = EF.id_class(xc_32);
        if (gx_1 == (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0])) {
            return true;
        }
        if (gx_1 == (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2])) {
            return false;
        }
        return EF.id_protected(new bw_3(ps_1), rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), xc_32);
    }

    public static boolean id_case(bw_3 bw_32, int n, int n2, int n3, xc_3 xc_32) {
        if (!((ba_3)bw_32.id_class[5]).id_class(n, n3)) {
            return false;
        }
        return EF.id_catch(xc_32) || xc_32.id_break() == xu_3.u || xc_32.id_break() instanceof zs_3;
    }

    public static boolean id_case(xc_3 xc_32) {
        rXs_1 rXs_12 = xc_32.id_volatile().id_class();
        return rXs_12 == rXG.id_throws || rXs_12 == rXG.id_protected;
    }

    public static Gx_1 id_implements(xc_3 xc_32) {
        xd_3 xd_32 = xc_32.id_break();
        if (EF.id_catch(xc_32) && xd_32 != xu_3.bV && xd_32 != xu_3.hM && xd_32 != xu_3.Jh) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);
        }
        if (xd_32 == xu_3.PJ || xd_32 == xu_3.BD && ((Boolean)C_class.id_instanceof().id_public.id_class[0]).booleanValue()) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);
        }
        if (xd_32 == xu_3.PS || xd_32 == xu_3.bt || xd_32 == xu_3.PY) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);
        }
        if (xd_32 == xu_3.SW || xd_32 == xu_3.re || xd_32 == xu_3.sZ) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);
        }
        if (xd_32 == xu_3.u || xd_32 instanceof zs_3) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);
        }
        if (xd_32 instanceof zG_2) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);
        }
        if (EF.id_byte(xc_32)) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1]);
        }
        if (EF.id_case(xc_32) && ((Boolean)C_class.id_instanceof().rj.id_class[0]).booleanValue()) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1]);
        }
        if (xd_32 instanceof zv_3 && EF.id_final()) {
            return xc_32.id_byte(zv_3.id_volatile) != false && xc_32.id_byte(zv_3.id_final) == rCj_1.TOP ? (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]) : (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);
        }
        if (xd_32 instanceof Wg_1) {
            if (!C_class.id_instanceof().id_break()) {
                if (xc_32.id_byte(Wg_1.id_volatile) != rCo_1.BOTTOM) {
                    return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);
                }
                return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]);
            }
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);
        }
        return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]);
    }

    public static boolean id_protected(Ps_1 ps_1, rfH_2 rfH_22) {
        return EF.id_finally(bw_3.id_class(ps_1, rfH_22));
    }

    public static boolean id_protected(EZ eZ, int n, int n2, int n3, xc_3 xc_32) {
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 == xu_3.PJ || xd_32 == xu_3.BD) {
            return false;
        }
        if (!xc_32.id_volatile().id_byte()) {
            Object object;
            if (xd_32 instanceof Wg_1) {
                if (xc_32.id_byte(Wg_1.id_volatile) != rCo_1.BOTTOM) {
                    return true;
                }
            } else if (xd_32 instanceof zG_2) {
                if (xc_32.id_byte(zG_2.id_final) == rCj_1.TOP) {
                    return true;
                }
                object = xc_32.id_byte(zG_2.id_package);
                if (object == rCK.INNER_LEFT || object == rCK.INNER_RIGHT) {
                    return true;
                }
            } else if (xd_32 instanceof zv_3 ? xc_32.id_byte(zv_3.id_volatile) == false && xc_32.id_byte(zv_3.id_final) == rCj_1.TOP : xd_32 == xu_3.hU) {
                return true;
            }
            if (((Boolean)eZ.id_break[16]).booleanValue()) {
                return false;
            }
            object = eZ.id_break(n, n2 + 1, n3);
            if (object instanceof dj_3) {
                return false;
            }
        }
        return true;
    }

    public static boolean id_protected(bw_3 bw_32, int n, int n2, int n3, xc_3 xc_32) {
        return xc_32.id_class((rRq_1)bw_32.id_class[4], (rfH_2)((rfw_3)bw_32.id_class[3]).id_class(n, n2, n3), rLT.LAND);
    }

    public static boolean id_protected(xc_3 xc_32) {
        rXE rXE2 = xc_32.id_volatile();
        return rXE2.id_class() instanceof rXB && rXE2.id_class().id_protected(rXE2) != 8;
    }

    public static Gx_1 id_private(xc_3 xc_32) {
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 instanceof Ja_1) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);
        }
        if (EF.id_final()) {
            if (xd_32 instanceof zv_3) {
                return xc_32.id_byte(zv_3.id_volatile) != false && xc_32.id_byte(zv_3.id_final) == rCj_1.TOP ? (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]) : (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);
            }
        } else if (xd_32 instanceof zv_3) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]);
        }
        if (xd_32 instanceof Jj_1 || xd_32 == xu_3.SQ || xd_32 == xu_3.U || xd_32 == xu_3.SM || xd_32 == xu_3.Sx || xd_32 instanceof JU || xd_32 == xu_3.hM || xd_32 instanceof Wp_1 || xd_32 instanceof Wg_1 || xd_32 == xu_3.Jh || xd_32 == xu_3.bn || xd_32 == xu_3.XJ) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]);
        }
        if (((List)C_class.id_instanceof().PD.id_class[0]).contains(xd_32)) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]);
        }
        if (xd_32 instanceof dN_2 || xd_32 instanceof dq_3) {
            if (xd_32 == xu_3.PZ) {
                return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]);
            }
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);
        }
        if (xd_32 instanceof xC_2) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1]);
        }
        if (xd_32 instanceof WD) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1]);
        }
        rXE rXE2 = xc_32.id_volatile();
        if (!rXE2.id_byte()) {
            if (rXE2.id_class().id_protected(rXE2) != 8) {
                return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]);
            }
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1]);
        }
        if (xd_32 instanceof xp_3) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]);
        }
        bO_2 bO_22 = C_throws.id_byte().id_break();
        if (bO_22.id_class(xc_32)) {
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);
        }
        try {
            if (xc_32.id_class(null, null, rLT.LAND)) {
                return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]);
            }
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[2]);
        }
        catch (Throwable throwable) {
            System.out.println("The block " + xc_32.id_break().id_native().getString() + " requires a special case due to the exception " + throwable.getMessage());
            return (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[1]);
        }
    }

    public static boolean id_final() {
        C_class c_class = C_throws.id_byte();
        bO_2 bO_22 = c_class.id_break();
        bW_2 bW_22 = c_class.id_abstract();
        return bO_22.id_byte() || bW_22.id_byte();
    }
}

