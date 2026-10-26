/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Wh_1;
import celestial.aI_2;
import celestial.dp_3;
import celestial.rCR;
import celestial.rHU;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rRq_1;
import celestial.raF_2;
import celestial.raR_2;
import celestial.raU_2;
import celestial.raf_3;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrn_1;
import celestial.rsk_3;
import celestial.ryO_2;
import celestial.rzl_3;
import celestial.xc_3;
import celestial.xu_3;
import celestial.zg_3;
import java.util.List;
import java.util.Random;

public class raV_2
extends raR_2 {
    private final boolean id_break;
    private final boolean id_byte;
    private boolean id_protected;
    private final int id_throws;

    public raV_2(int n, Random random, rfi_3 rfi_32, rpr_3 rpr_32, raU_2 raU_22) {
        super(raF_2.id_class, n, raU_22);
        this.id_class(rpr_32);
        this.id_final = rfi_32;
        this.id_break = random.nextInt(3) == 0;
        this.id_byte = !this.id_break && random.nextInt(23) == 0;
        this.id_throws = this.id_implements().id_final() == rpB_2.Z ? rfi_32.id_case() / 5 : rfi_32.id_protected() / 5;
    }

    public raV_2(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_class, rcd_32);
        this.id_break = rcd_32.id_new("hr");
        this.id_byte = rcd_32.id_new("sc");
        this.id_protected = rcd_32.id_new("hps");
        this.id_throws = rcd_32.id_private("Num");
    }

    @Override
    protected boolean id_class(rRI rRI2, rfi_3 rfi_32, Random random, int n, int n2, int n3, rqO_2 rqO_22) {
        rfH_2 rfH_22 = new rfH_2(this.id_class(n, n3), this.id_class(n2), this.id_break(n, n3));
        if (rfi_32.id_break(rfH_22) && rRI2.id_byte(rfH_22).id_catch() && !rRI2.id_byte(rfH_22.id_break()).id_catch()) {
            xc_3 xc_32 = (xc_3)xu_3.Px.id_continue().id_class(Wh_1.id_package, random.nextBoolean() ? rCR.NORTH_SOUTH : rCR.EAST_WEST);
            this.id_class(rRI2, xc_32, n, n2, n3, rfi_32);
            rsk_3 rsk_32 = new rsk_3(rRI2.id_byte(), (double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5);
            rsk_32.id_class(rqO_22, random.nextLong());
            rRI2.a_(rsk_32);
            return true;
        }
        return false;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        int n;
        int n2;
        int n3;
        int n4;
        if (this.id_class(rRI2, rfi_32)) {
            return false;
        }
        boolean bl = false;
        int n5 = 2;
        boolean bl2 = false;
        int n6 = 2;
        int n7 = this.id_throws * 5 - 1;
        xc_3 xc_32 = this.id_break();
        this.id_class(rRI2, rfi_32, 0, 0, 0, 2, 1, n7, id_volatile, id_volatile, false);
        this.id_class(rRI2, rfi_32, random, 0.8f, 0, 2, 0, 2, 2, n7, id_volatile, id_volatile, false, false);
        if (this.id_byte) {
            this.id_class(rRI2, rfi_32, random, 0.6f, 0, 0, 0, 2, 1, n7, xu_3.U.id_continue(), id_volatile, false, true);
        }
        for (n4 = 0; n4 < this.id_throws; ++n4) {
            int n8;
            n3 = 2 + n4 * 5;
            this.id_class(rRI2, rfi_32, 0, 0, n3, 2, 2, random);
            this.id_class(rRI2, rfi_32, random, 0.1f, 0, 2, n3 - 1);
            this.id_class(rRI2, rfi_32, random, 0.1f, 2, 2, n3 - 1);
            this.id_class(rRI2, rfi_32, random, 0.1f, 0, 2, n3 + 1);
            this.id_class(rRI2, rfi_32, random, 0.1f, 2, 2, n3 + 1);
            this.id_class(rRI2, rfi_32, random, 0.05f, 0, 2, n3 - 2);
            this.id_class(rRI2, rfi_32, random, 0.05f, 2, 2, n3 - 2);
            this.id_class(rRI2, rfi_32, random, 0.05f, 0, 2, n3 + 2);
            this.id_class(rRI2, rfi_32, random, 0.05f, 2, 2, n3 + 2);
            if (random.nextInt(100) == 0) {
                this.id_class(rRI2, rfi_32, random, 2, 0, n3 - 1, rzl_3.id_else);
            }
            if (random.nextInt(100) == 0) {
                this.id_class(rRI2, rfi_32, random, 0, 0, n3 + 1, rzl_3.id_else);
            }
            if (!this.id_byte || this.id_protected) continue;
            n2 = this.id_class(0);
            int n9 = n3 - 1 + random.nextInt(3);
            n = this.id_class(1, n9);
            rfH_2 rfH_23 = new rfH_2(n, n2, n8 = this.id_break(1, n9));
            if (!rfi_32.id_break(rfH_23) || !this.id_class(rRI2, 1, 0, n9, rfi_32)) continue;
            this.id_protected = true;
            rRI2.id_class(rfH_23, xu_3.rD.id_continue(), 2);
            ryO_2 ryO_22 = rRI2.id_class(rfH_23);
            if (!(ryO_22 instanceof rHU)) continue;
            ((rHU)ryO_22).id_catch().id_class(aI_2.id_implements);
        }
        for (n4 = 0; n4 <= 2; ++n4) {
            for (n3 = 0; n3 <= n7; ++n3) {
                n2 = -1;
                xc_3 xc_33 = this.id_class((rRq_1)rRI2, n4, -1, n3, rfi_32);
                if (!xc_33.id_catch() || !this.id_class(rRI2, n4, -1, n3, rfi_32)) continue;
                n = -1;
                this.id_class(rRI2, xc_32, n4, -1, n3, rfi_32);
            }
        }
        if (this.id_break) {
            xc_3 xc_34 = (xc_3)xu_3.Px.id_continue().id_class(Wh_1.id_package, rCR.NORTH_SOUTH);
            for (n3 = 0; n3 <= n7; ++n3) {
                xc_3 xc_35 = this.id_class((rRq_1)rRI2, 1, -1, n3, rfi_32);
                if (xc_35.id_catch() || !xc_35.id_implements(rRI2, new rfH_2(this.id_class(1, n3), this.id_class(-1), this.id_break(1, n3)))) continue;
                float f = this.id_class(rRI2, 1, 0, n3, rfi_32) ? 0.7f : 0.9f;
                this.id_class(rRI2, rfi_32, random, f, 1, 0, n3, xc_34);
            }
        }
        return true;
    }

    private void id_class(rRI rRI2, rfi_3 rfi_32, int n, int n2, int n3, int n4, int n5, Random random) {
        if (this.id_class((rRq_1)rRI2, rfi_32, n, n5, n4, n3)) {
            xc_3 xc_32 = this.id_break();
            xc_3 xc_33 = this.id_byte();
            this.id_class(rRI2, rfi_32, n, n2, n3, n, n4 - 1, n3, (xc_3)xc_33.id_class(dp_3.id_int, true), id_volatile, false);
            this.id_class(rRI2, rfi_32, n5, n2, n3, n5, n4 - 1, n3, (xc_3)xc_33.id_class(dp_3.id_final, true), id_volatile, false);
            if (random.nextInt(4) == 0) {
                this.id_class(rRI2, rfi_32, n, n4, n3, n, n4, n3, xc_32, id_volatile, false);
                this.id_class(rRI2, rfi_32, n5, n4, n3, n5, n4, n3, xc_32, id_volatile, false);
            } else {
                this.id_class(rRI2, rfi_32, n, n4, n3, n5, n4, n3, xc_32, id_volatile, false);
                this.id_class(rRI2, rfi_32, random, 0.05f, n + 1, n4, n3 - 1, (xc_3)xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.NORTH));
                this.id_class(rRI2, rfi_32, random, 0.05f, n + 1, n4, n3 + 1, (xc_3)xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.SOUTH));
            }
        }
    }

    private void id_class(rRI rRI2, rfi_3 rfi_32, Random random, float f, int n, int n2, int n3) {
        if (this.id_class(rRI2, n, n2, n3, rfi_32)) {
            this.id_class(rRI2, rfi_32, random, f, n, n2, n3, xu_3.U.id_continue());
        }
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        block24: {
            int n = this.id_private();
            int n2 = random.nextInt(4);
            rpr_3 rpr_32 = this.id_implements();
            if (rpr_32 != null) {
                switch (rpr_32) {
                    default: {
                        if (n2 <= 1) {
                            raf_3.id_class(rrrn_12, list, random, this.id_final.id_class, this.id_final.id_break - 1 + random.nextInt(3), this.id_final.id_byte - 1, rpr_32, n);
                            break;
                        }
                        if (n2 == 2) {
                            raf_3.id_class(rrrn_12, list, random, this.id_final.id_class - 1, this.id_final.id_break - 1 + random.nextInt(3), this.id_final.id_byte, rpr_3.WEST, n);
                            break;
                        }
                        raf_3.id_class(rrrn_12, list, random, this.id_final.id_protected + 1, this.id_final.id_break - 1 + random.nextInt(3), this.id_final.id_byte, rpr_3.EAST, n);
                        break;
                    }
                    case SOUTH: {
                        if (n2 <= 1) {
                            raf_3.id_class(rrrn_12, list, random, this.id_final.id_class, this.id_final.id_break - 1 + random.nextInt(3), this.id_final.id_case + 1, rpr_32, n);
                            break;
                        }
                        if (n2 == 2) {
                            raf_3.id_class(rrrn_12, list, random, this.id_final.id_class - 1, this.id_final.id_break - 1 + random.nextInt(3), this.id_final.id_case - 3, rpr_3.WEST, n);
                            break;
                        }
                        raf_3.id_class(rrrn_12, list, random, this.id_final.id_protected + 1, this.id_final.id_break - 1 + random.nextInt(3), this.id_final.id_case - 3, rpr_3.EAST, n);
                        break;
                    }
                    case WEST: {
                        if (n2 <= 1) {
                            raf_3.id_class(rrrn_12, list, random, this.id_final.id_class - 1, this.id_final.id_break - 1 + random.nextInt(3), this.id_final.id_byte, rpr_32, n);
                            break;
                        }
                        if (n2 == 2) {
                            raf_3.id_class(rrrn_12, list, random, this.id_final.id_class, this.id_final.id_break - 1 + random.nextInt(3), this.id_final.id_byte - 1, rpr_3.NORTH, n);
                            break;
                        }
                        raf_3.id_class(rrrn_12, list, random, this.id_final.id_class, this.id_final.id_break - 1 + random.nextInt(3), this.id_final.id_case + 1, rpr_3.SOUTH, n);
                        break;
                    }
                    case EAST: {
                        if (n2 <= 1) {
                            raf_3.id_class(rrrn_12, list, random, this.id_final.id_protected + 1, this.id_final.id_break - 1 + random.nextInt(3), this.id_final.id_byte, rpr_32, n);
                            break;
                        }
                        if (n2 == 2) {
                            raf_3.id_class(rrrn_12, list, random, this.id_final.id_protected - 3, this.id_final.id_break - 1 + random.nextInt(3), this.id_final.id_byte - 1, rpr_3.NORTH, n);
                            break;
                        }
                        raf_3.id_class(rrrn_12, list, random, this.id_final.id_protected - 3, this.id_final.id_break - 1 + random.nextInt(3), this.id_final.id_case + 1, rpr_3.SOUTH, n);
                    }
                }
            }
            if (n >= 8) break block24;
            if (rpr_32 != rpr_3.NORTH && rpr_32 != rpr_3.SOUTH) {
                int n3 = this.id_final.id_class + 3;
                while (n3 + 3 <= this.id_final.id_protected) {
                    int n4 = random.nextInt(5);
                    if (n4 == 0) {
                        raf_3.id_class(rrrn_12, list, random, n3, this.id_final.id_break, this.id_final.id_byte - 1, rpr_3.NORTH, n + 1);
                    } else if (n4 == 1) {
                        raf_3.id_class(rrrn_12, list, random, n3, this.id_final.id_break, this.id_final.id_case + 1, rpr_3.SOUTH, n + 1);
                    }
                    n3 += 5;
                }
            } else {
                int n5 = this.id_final.id_byte + 3;
                while (n5 + 3 <= this.id_final.id_case) {
                    int n6 = random.nextInt(5);
                    if (n6 == 0) {
                        raf_3.id_class(rrrn_12, list, random, this.id_final.id_class - 1, this.id_final.id_break, n5, rpr_3.WEST, n + 1);
                    } else if (n6 == 1) {
                        raf_3.id_class(rrrn_12, list, random, this.id_final.id_protected + 1, this.id_final.id_break, n5, rpr_3.EAST, n + 1);
                    }
                    n5 += 5;
                }
            }
        }
    }

    public static rfi_3 id_class(List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32) {
        int n4;
        rfi_3 rfi_32 = new rfi_3(n, n2, n3, n, n2 + 3 - 1, n3);
        for (n4 = random.nextInt(3) + 2; n4 > 0; --n4) {
            int n5 = n4 * 5;
            switch (rpr_32) {
                default: {
                    rfi_32.id_protected = n + 3 - 1;
                    rfi_32.id_byte = n3 - (n5 - 1);
                    break;
                }
                case SOUTH: {
                    rfi_32.id_protected = n + 3 - 1;
                    rfi_32.id_case = n3 + n5 - 1;
                    break;
                }
                case WEST: {
                    rfi_32.id_class = n - (n5 - 1);
                    rfi_32.id_case = n3 + 3 - 1;
                    break;
                }
                case EAST: {
                    rfi_32.id_protected = n + n5 - 1;
                    rfi_32.id_case = n3 + 3 - 1;
                }
            }
            if (rrrn_1.id_class(list, rfi_32) == null) break;
        }
        return n4 > 0 ? rfi_32 : null;
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("hr", this.id_break);
        rcd_32.id_class("sc", this.id_byte);
        rcd_32.id_class("hps", this.id_protected);
        rcd_32.id_break("Num", this.id_throws);
    }
}

