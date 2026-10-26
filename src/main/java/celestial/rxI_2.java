/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.LinkedHashMultiset
 *  com.google.common.collect.Multiset
 *  com.google.common.collect.Multisets
 */
package celestial;

import celestial.QS;
import celestial.VD;
import celestial.an_3;
import celestial.rKv_1;
import celestial.rXE;
import celestial.rYB;
import celestial.rYG;
import celestial.rcd_3;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rfw_3;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rls_3;
import celestial.roJ_2;
import celestial.rpr_3;
import celestial.rqM_2;
import celestial.rrEm_1;
import celestial.rrGM;
import celestial.rrGb_1;
import celestial.ruS_2;
import celestial.rxP_2;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.List;

public class rxI_2
extends rxP_2 {
    public rxI_2(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public ruS_2<?> id_class(rdn_3 rdn_32, rYB rYB2, rhd_3 rhd_32) {
        return rxI_2.id_break(rdn_32, rYB2).id_class(rdn_32, rYB2, rhd_32);
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, an_3 an_32, int n, boolean bl) {
        rrGb_1 rrGb_12;
        if (!rYB2.id_continue && (rrGb_12 = rxI_2.id_break(rdn_32, rYB2)) != null) {
            if (an_32 instanceof rhd_3) {
                rhd_3 rhd_32 = (rhd_3)an_32;
                rrGb_12.id_class(rhd_32, rdn_32);
            }
            if (!rrGb_12.id_private && (bl || an_32 instanceof rhd_3 && ((rhd_3)an_32).Sn() == rdn_32)) {
                this.id_class(rYB2, an_32, rrGb_12);
            }
        }
    }

    public static void id_class(rrEm_1 rrEm_12, rdn_3 rdn_32) {
        rrGb_1 rrGb_12 = rxI_2.id_break(rdn_32, rrEm_12);
        if (rrGb_12 != null && rrEm_12.E() == rrGb_12.id_byte) {
            int n;
            int n2;
            int n3 = 1 << rrGb_12.id_case;
            int n4 = rrGb_12.id_class;
            int n5 = rrGb_12.id_break;
            rYG[] rYGArray = new rYG[128 * n3 * 128 * n3];
            for (n2 = 0; n2 < 128 * n3; ++n2) {
                for (n = 0; n < 128 * n3; ++n) {
                    rYGArray[n2 * 128 * n3 + n] = rrEm_12.id_implements(new rfH_2((n4 / n3 - 64) * n3 + n, 0, (n5 / n3 - 64) * n3 + n2));
                }
            }
            for (n2 = 0; n2 < 128; ++n2) {
                for (n = 0; n < 128; ++n) {
                    if (n2 <= 0 || n <= 0 || n2 >= 127 || n >= 127) continue;
                    rYG rYG2 = rYGArray[n2 * n3 + n * n3 * 128 * n3];
                    int n6 = 8;
                    if (rxI_2.id_class(rYGArray, n3, n2 - 1, n - 1)) {
                        --n6;
                    }
                    if (rxI_2.id_class(rYGArray, n3, n2 - 1, n + 1)) {
                        --n6;
                    }
                    if (rxI_2.id_class(rYGArray, n3, n2 - 1, n)) {
                        --n6;
                    }
                    if (rxI_2.id_class(rYGArray, n3, n2 + 1, n - 1)) {
                        --n6;
                    }
                    if (rxI_2.id_class(rYGArray, n3, n2 + 1, n + 1)) {
                        --n6;
                    }
                    if (rxI_2.id_class(rYGArray, n3, n2 + 1, n)) {
                        --n6;
                    }
                    if (rxI_2.id_class(rYGArray, n3, n2, n - 1)) {
                        --n6;
                    }
                    if (rxI_2.id_class(rYGArray, n3, n2, n + 1)) {
                        --n6;
                    }
                    int n7 = 3;
                    QS qS = QS.id_break;
                    if (rYG2.id_private() < 0.0f) {
                        qS = QS.id_new;
                        if (n6 > 7 && n % 2 == 0) {
                            n7 = (n2 + (int)(rfU_2.id_class((float)n + 0.0f) * 7.0f)) / 8 % 5;
                            if (n7 == 3) {
                                n7 = 1;
                            } else if (n7 == 4) {
                                n7 = 0;
                            }
                        } else if (n6 > 7) {
                            qS = QS.id_break;
                        } else if (n6 > 5) {
                            n7 = 1;
                        } else if (n6 > 3) {
                            n7 = 0;
                        } else if (n6 > 1) {
                            n7 = 0;
                        }
                    } else if (n6 > 0) {
                        qS = QS.id_instanceof;
                        n7 = n6 > 3 ? 1 : 3;
                    }
                    if (qS == QS.id_break) continue;
                    rrGb_12.id_catch[n2 + n * 128] = (byte)(qS.k * 4 + n7);
                    rrGb_12.id_class(n2, n);
                }
            }
        }
    }

    private static boolean id_class(rYG[] rYGArray, int n, int n2, int n3) {
        return rYGArray[n2 * n + n3 * n * 128 * n].id_private() >= 0.0f;
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        xc_3 xc_32 = rdH_22.id_int().id_byte(rdH_22.id_class());
        if (xc_32.id_class(rls_3.id_instanceof)) {
            if (!rdH_22.id_int().id_continue) {
                rrGb_1 rrGb_12 = rxI_2.id_break(rdH_22.id_volatile(), rdH_22.id_int());
                rrGb_12.id_class(rdH_22.id_int(), rdH_22.id_class());
            }
            return ryZ_2.id_class(rdH_22.id_int().id_continue);
        }
        return super.id_class(rdH_22);
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, List<rgP_2> list, VD vD) {
        rrGb_1 rrGb_12;
        rrGb_1 rrGb_13 = rrGb_12 = rYB2 == null ? null : rxI_2.id_break(rdn_32, rYB2);
        if (rrGb_12 != null && rrGb_12.id_private) {
            list.add(new rgn_3("filled_map.locked", rxI_2.id_protected(rdn_32)).id_class(rgF_2.GRAY));
        }
        if (vD.id_class()) {
            if (rrGb_12 != null) {
                list.add(new rgn_3("filled_map.id", rxI_2.id_protected(rdn_32)).id_class(rgF_2.GRAY));
                list.add(new rgn_3("filled_map.scale", 1 << rrGb_12.id_case).id_class(rgF_2.GRAY));
                list.add(new rgn_3("filled_map.level", rrGb_12.id_case, 4).id_class(rgF_2.GRAY));
            } else {
                list.add(new rgn_3("filled_map.unknown").id_class(rgF_2.GRAY));
            }
        }
    }

    public static void id_class(rYB rYB2, rdn_3 rdn_32) {
        rrGb_1 rrGb_12 = rxI_2.id_break(rdn_32, rYB2);
        if (rrGb_12 != null) {
            rrGb_1 rrGb_13 = rxI_2.id_class(rdn_32, rYB2, 0, 0, rrGb_12.id_case, rrGb_12.id_protected, rrGb_12.id_throws, rrGb_12.id_byte);
            rrGb_13.id_class(rrGb_12);
        }
    }

    protected static void id_class(rdn_3 rdn_32, rYB rYB2, int n) {
        rrGb_1 rrGb_12 = rxI_2.id_break(rdn_32, rYB2);
        if (rrGb_12 != null) {
            rxI_2.id_class(rdn_32, rYB2, rrGb_12.id_class, rrGb_12.id_break, rfU_2.id_class(rrGb_12.id_case + n, 0, 4), rrGb_12.id_protected, rrGb_12.id_throws, rrGb_12.id_byte);
        }
    }

    public static rrGb_1 id_class(rdn_3 rdn_32, rYB rYB2) {
        return rYB2.id_class(rxI_2.id_class(rxI_2.id_protected(rdn_32)));
    }

    public static rdn_3 id_class(rYB rYB2, int n, int n2, byte by, boolean bl, boolean bl2) {
        rdn_3 rdn_32 = new rdn_3(rdy_3.JX);
        rxI_2.id_class(rdn_32, rYB2, n, n2, by, bl, bl2, rYB2.E());
        return rdn_32;
    }

    private static rrGb_1 id_class(rdn_3 rdn_32, rYB rYB2, int n, int n2, int n3, boolean bl, boolean bl2, rqM_2<rYB> rqM_22) {
        int n4 = rYB2.id_final();
        rrGb_1 rrGb_12 = new rrGb_1(rxI_2.id_class(n4));
        rrGb_12.id_class(n, n2, n3, bl, bl2, rqM_22);
        rYB2.id_class(rrGb_12);
        rdn_32.id_int().id_break("map", n4);
        return rrGb_12;
    }

    public void id_class(rYB rYB2, an_3 an_32, rrGb_1 rrGb_12) {
        if (rYB2.E() == rrGb_12.id_byte && an_32 instanceof rhd_3) {
            int n = 1 << rrGb_12.id_case;
            int n2 = rrGb_12.id_class;
            int n3 = rrGb_12.id_break;
            int n4 = rfU_2.id_byte(an_32.rx() - (double)n2) / n + 64;
            int n5 = rfU_2.id_byte(an_32.BO() - (double)n3) / n + 64;
            int n6 = 128 / n;
            if (rYB2.id_default().id_byte()) {
                n6 /= 2;
            }
            rrGM rrGM2 = rrGb_12.id_class((rhd_3)an_32);
            ++rrGM2.id_break;
            boolean bl = false;
            for (int i = n4 - n6 + 1; i < n4 + n6; ++i) {
                if ((i & 0xF) != (rrGM2.id_break & 0xF) && !bl) continue;
                bl = false;
                double d = 0.0;
                for (int j = n5 - n6 - 1; j < n5 + n6; ++j) {
                    byte by;
                    QS qS;
                    int n7;
                    int n8;
                    if (i < 0 || j < -1 || i >= 128 || j >= 128) continue;
                    int n9 = i - n4;
                    int n10 = j - n5;
                    boolean bl2 = n9 * n9 + n10 * n10 > (n6 - 2) * (n6 - 2);
                    int n11 = (n2 / n + i - 64) * n;
                    int n12 = (n3 / n + j - 64) * n;
                    LinkedHashMultiset linkedHashMultiset = LinkedHashMultiset.create();
                    roJ_2 roJ_22 = rYB2.id_this(new rfH_2(n11, 0, n12));
                    if (roJ_22.id_catch()) continue;
                    rfj_3 rfj_32 = roJ_22.id_private();
                    int n13 = n11 & 0xF;
                    int n14 = n12 & 0xF;
                    int n15 = 0;
                    double d2 = 0.0;
                    if (rYB2.id_default().id_byte()) {
                        int n16 = n11 + n12 * 231871;
                        if (((n16 = n16 * n16 * 31287121 + n16 * 11) >> 20 & 1) == 0) {
                            linkedHashMultiset.add((Object)xu_3.id_finally.id_continue().id_protected(rYB2, rfH_2.id_protected), 10);
                        } else {
                            linkedHashMultiset.add((Object)xu_3.id_break.id_continue().id_protected(rYB2, rfH_2.id_protected), 100);
                        }
                        d2 = 100.0;
                    } else {
                        rfw_3 rfw_32 = new rfw_3();
                        rfw_3 rfw_33 = new rfw_3();
                        for (n8 = 0; n8 < n; ++n8) {
                            for (int k = 0; k < n; ++k) {
                                xc_3 xc_32;
                                n7 = roJ_22.id_class(rKv_1.WORLD_SURFACE, n8 + n13, k + n14) + 1;
                                if (n7 <= 1) {
                                    xc_32 = xu_3.id_while.id_continue();
                                } else {
                                    do {
                                        rfw_32.id_class(rfj_32.id_break() + n8 + n13, --n7, rfj_32.id_byte() + k + n14);
                                    } while ((xc_32 = roJ_22.id_byte(rfw_32)).id_protected(rYB2, rfw_32) == QS.id_break && n7 > 0);
                                    if (n7 > 0 && !xc_32.id_volatile().id_byte()) {
                                        xc_3 xc_33;
                                        int n17 = n7 - 1;
                                        rfw_33.id_class(rfw_32);
                                        do {
                                            rfw_33.b_(n17--);
                                            xc_33 = roJ_22.id_byte(rfw_33);
                                            ++n15;
                                        } while (n17 > 0 && !xc_33.id_volatile().id_byte());
                                        xc_32 = this.id_class(rYB2, xc_32, rfw_32);
                                    }
                                }
                                rrGb_12.id_class(rYB2, rfj_32.id_break() + n8 + n13, rfj_32.id_byte() + k + n14);
                                d2 += (double)n7 / (double)(n * n);
                                linkedHashMultiset.add((Object)xc_32.id_protected(rYB2, rfw_32));
                            }
                        }
                    }
                    n15 /= n * n;
                    double d3 = (d2 - d) * 4.0 / (double)(n + 4) + ((double)(i + j & 1) - 0.5) * 0.4;
                    n8 = 1;
                    if (d3 > 0.6) {
                        n8 = 2;
                    }
                    if (d3 < -0.6) {
                        n8 = 0;
                    }
                    if ((qS = (QS)Iterables.getFirst((Iterable)Multisets.copyHighestCountFirst((Multiset)linkedHashMultiset), (Object)QS.id_break)) == QS.id_final) {
                        d3 = (double)n15 * 0.1 + (double)(i + j & 1) * 0.2;
                        n8 = 1;
                        if (d3 < 0.5) {
                            n8 = 2;
                        }
                        if (d3 > 0.9) {
                            n8 = 0;
                        }
                    }
                    d = d2;
                    if (j < 0 || n9 * n9 + n10 * n10 >= n6 * n6 || bl2 && (i + j & 1) == 0 || (n7 = rrGb_12.id_catch[i + j * 128]) == (by = (byte)(qS.k * 4 + n8))) continue;
                    rrGb_12.id_catch[i + j * 128] = by;
                    rrGb_12.id_class(i, j);
                    bl = true;
                }
            }
        }
    }

    private xc_3 id_class(rYB rYB2, xc_3 xc_32, rfH_2 rfH_22) {
        rXE rXE2 = xc_32.id_volatile();
        return !rXE2.id_byte() && !xc_32.id_protected(rYB2, rfH_22, rpr_3.UP) ? rXE2.id_catch() : xc_32;
    }

    public static String id_class(int n) {
        return "map_" + n;
    }

    public static rrGb_1 id_break(rdn_3 rdn_32, rYB rYB2) {
        rrGb_1 rrGb_12 = rxI_2.id_class(rdn_32, rYB2);
        if (rrGb_12 == null && rYB2 instanceof rrEm_1) {
            rrGb_12 = rxI_2.id_class(rdn_32, rYB2, rYB2.id_public().id_class(), rYB2.id_public().id_byte(), 3, false, false, rYB2.E());
        }
        return rrGb_12;
    }

    @Override
    public void id_break(rdn_3 rdn_32, rYB rYB2, rhd_3 rhd_32) {
        rcd_3 rcd_32 = rdn_32.id_package();
        if (rcd_32 != null && rcd_32.id_byte("map_scale_direction", 99)) {
            rxI_2.id_class(rdn_32, rYB2, rcd_32.id_private("map_scale_direction"));
            rcd_32.id_continue("map_scale_direction");
        } else if (rcd_32 != null && rcd_32.id_byte("map_to_lock", 1) && rcd_32.id_new("map_to_lock")) {
            rxI_2.id_class(rYB2, rdn_32);
            rcd_32.id_continue("map_to_lock");
        }
    }

    public static int id_catch(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_break("display");
        if (rcd_32 != null && rcd_32.id_byte("MapColor", 99)) {
            int n = rcd_32.id_private("MapColor");
            return 0xFF000000 | n & 0xFFFFFF;
        }
        return -12173266;
    }

    public static int id_protected(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_package();
        return rcd_32 != null && rcd_32.id_byte("map", 99) ? rcd_32.id_private("map") : 0;
    }
}

