/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.raF_2;
import celestial.raR_2;
import celestial.raU_2;
import celestial.raf_3;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrn_1;
import java.util.List;
import java.util.Random;

public class rao_3
extends raR_2 {
    public rao_3(int n, rfi_3 rfi_32, rpr_3 rpr_32, raU_2 raU_22) {
        super(raF_2.id_protected, n, raU_22);
        this.id_class(rpr_32);
        this.id_final = rfi_32;
    }

    public rao_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_protected, rcd_32);
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        int n = this.id_private();
        rpr_3 rpr_32 = this.id_implements();
        if (rpr_32 != null) {
            switch (rpr_32) {
                default: {
                    raf_3.id_class(rrrn_12, list, random, this.id_final.id_class, this.id_final.id_break, this.id_final.id_byte - 1, rpr_3.NORTH, n);
                    break;
                }
                case SOUTH: {
                    raf_3.id_class(rrrn_12, list, random, this.id_final.id_class, this.id_final.id_break, this.id_final.id_case + 1, rpr_3.SOUTH, n);
                    break;
                }
                case WEST: {
                    raf_3.id_class(rrrn_12, list, random, this.id_final.id_class - 1, this.id_final.id_break, this.id_final.id_byte, rpr_3.WEST, n);
                    break;
                }
                case EAST: {
                    raf_3.id_class(rrrn_12, list, random, this.id_final.id_protected + 1, this.id_final.id_break, this.id_final.id_byte, rpr_3.EAST, n);
                }
            }
        }
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        if (this.id_class(rRI2, rfi_32)) {
            return false;
        }
        this.id_class(rRI2, rfi_32, 0, 5, 0, 2, 7, 1, id_volatile, id_volatile, false);
        this.id_class(rRI2, rfi_32, 0, 0, 7, 2, 2, 8, id_volatile, id_volatile, false);
        for (int i = 0; i < 5; ++i) {
            this.id_class(rRI2, rfi_32, 0, 5 - i - (i < 4 ? 1 : 0), 2 + i, 2, 7 - i, 2 + i, id_volatile, id_volatile, false);
        }
        return true;
    }

    public static rfi_3 id_class(List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32) {
        rfi_3 rfi_32 = new rfi_3(n, n2 - 5, n3, n, n2 + 3 - 1, n3);
        switch (rpr_32) {
            default: {
                rfi_32.id_protected = n + 3 - 1;
                rfi_32.id_byte = n3 - 8;
                break;
            }
            case SOUTH: {
                rfi_32.id_protected = n + 3 - 1;
                rfi_32.id_case = n3 + 8;
                break;
            }
            case WEST: {
                rfi_32.id_class = n - 8;
                rfi_32.id_case = n3 + 3 - 1;
                break;
            }
            case EAST: {
                rfi_32.id_protected = n + 8;
                rfi_32.id_case = n3 + 3 - 1;
            }
        }
        return rrrn_1.id_class(list, rfi_32) != null ? null : rfi_32;
    }
}

