/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jt_1;
import celestial.dN_2;
import celestial.kK_2;
import celestial.rCf_1;
import celestial.rRI;
import celestial.raF_2;
import celestial.rcd_3;
import celestial.rfi_3;
import celestial.rii_3;
import celestial.rpr_3;
import celestial.rrrN;
import celestial.rrrd_1;
import celestial.rrrn_1;
import celestial.xc_3;
import celestial.xu_3;
import java.util.List;
import java.util.Random;

public abstract class rrrQ
extends rrrn_1 {
    protected rrrN id_protected = rrrN.OPENING;

    protected rrrn_1 id_byte(rrrd_1 rrrd_12, List<rrrn_1> list, Random random, int n, int n2) {
        rpr_3 rpr_32 = this.id_implements();
        if (rpr_32 != null) {
            switch (rpr_32) {
                case NORTH: {
                    return rii_3.id_break(rrrd_12, list, random, this.id_final.id_protected + 1, this.id_final.id_break + n, this.id_final.id_byte + n2, rpr_3.EAST, this.id_private());
                }
                case SOUTH: {
                    return rii_3.id_break(rrrd_12, list, random, this.id_final.id_protected + 1, this.id_final.id_break + n, this.id_final.id_byte + n2, rpr_3.EAST, this.id_private());
                }
                case WEST: {
                    return rii_3.id_break(rrrd_12, list, random, this.id_final.id_class + n2, this.id_final.id_break + n, this.id_final.id_case + 1, rpr_3.SOUTH, this.id_private());
                }
                case EAST: {
                    return rii_3.id_break(rrrd_12, list, random, this.id_final.id_class + n2, this.id_final.id_break + n, this.id_final.id_case + 1, rpr_3.SOUTH, this.id_private());
                }
            }
        }
        return null;
    }

    protected rrrQ(raF_2 raF_22, int n) {
        super(raF_22, n);
    }

    public rrrQ(raF_2 raF_22, rcd_3 rcd_32) {
        super(raF_22, rcd_32);
        this.id_protected = rrrN.valueOf(rcd_32.id_native("EntryDoor"));
    }

    protected rrrn_1 id_class(rrrd_1 rrrd_12, List<rrrn_1> list, Random random, int n, int n2) {
        rpr_3 rpr_32 = this.id_implements();
        if (rpr_32 != null) {
            switch (rpr_32) {
                case NORTH: {
                    return rii_3.id_break(rrrd_12, list, random, this.id_final.id_class + n, this.id_final.id_break + n2, this.id_final.id_byte - 1, rpr_32, this.id_private());
                }
                case SOUTH: {
                    return rii_3.id_break(rrrd_12, list, random, this.id_final.id_class + n, this.id_final.id_break + n2, this.id_final.id_case + 1, rpr_32, this.id_private());
                }
                case WEST: {
                    return rii_3.id_break(rrrd_12, list, random, this.id_final.id_class - 1, this.id_final.id_break + n2, this.id_final.id_byte + n, rpr_32, this.id_private());
                }
                case EAST: {
                    return rii_3.id_break(rrrd_12, list, random, this.id_final.id_protected + 1, this.id_final.id_break + n2, this.id_final.id_byte + n, rpr_32, this.id_private());
                }
            }
        }
        return null;
    }

    protected static boolean id_class(rfi_3 rfi_32) {
        return rfi_32 != null && rfi_32.id_break > 10;
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        rcd_32.id_class("EntryDoor", this.id_protected.name());
    }

    protected void id_class(rRI rRI2, Random random, rfi_3 rfi_32, rrrN rrrN2, int n, int n2, int n3) {
        switch (rrrN2) {
            case OPENING: {
                this.id_class(rRI2, rfi_32, n, n2, n3, n + 3 - 1, n2 + 3 - 1, n3, id_volatile, id_volatile, false);
                break;
            }
            case WOOD_DOOR: {
                this.id_class(rRI2, xu_3.BL.id_continue(), n, n2, n3, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), n, n2 + 1, n3, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), n, n2 + 2, n3, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), n + 1, n2 + 2, n3, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), n + 2, n2 + 2, n3, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), n + 2, n2 + 1, n3, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), n + 2, n2, n3, rfi_32);
                this.id_class(rRI2, xu_3.PX.id_continue(), n + 1, n2, n3, rfi_32);
                this.id_class(rRI2, (xc_3)xu_3.PX.id_continue().id_class(dN_2.id_new, rCf_1.UPPER), n + 1, n2 + 1, n3, rfi_32);
                break;
            }
            case GRATES: {
                this.id_class(rRI2, xu_3.hb.id_continue(), n + 1, n2, n3, rfi_32);
                this.id_class(rRI2, xu_3.hb.id_continue(), n + 1, n2 + 1, n3, rfi_32);
                this.id_class(rRI2, (xc_3)xu_3.Bf.id_continue().id_class(kK_2.id_int, true), n, n2, n3, rfi_32);
                this.id_class(rRI2, (xc_3)xu_3.Bf.id_continue().id_class(kK_2.id_int, true), n, n2 + 1, n3, rfi_32);
                this.id_class(rRI2, (xc_3)((xc_3)xu_3.Bf.id_continue().id_class(kK_2.id_final, true)).id_class(kK_2.id_int, true), n, n2 + 2, n3, rfi_32);
                this.id_class(rRI2, (xc_3)((xc_3)xu_3.Bf.id_continue().id_class(kK_2.id_final, true)).id_class(kK_2.id_int, true), n + 1, n2 + 2, n3, rfi_32);
                this.id_class(rRI2, (xc_3)((xc_3)xu_3.Bf.id_continue().id_class(kK_2.id_final, true)).id_class(kK_2.id_int, true), n + 2, n2 + 2, n3, rfi_32);
                this.id_class(rRI2, (xc_3)xu_3.Bf.id_continue().id_class(kK_2.id_final, true), n + 2, n2 + 1, n3, rfi_32);
                this.id_class(rRI2, (xc_3)xu_3.Bf.id_continue().id_class(kK_2.id_final, true), n + 2, n2, n3, rfi_32);
                break;
            }
            case IRON_DOOR: {
                this.id_class(rRI2, xu_3.BL.id_continue(), n, n2, n3, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), n, n2 + 1, n3, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), n, n2 + 2, n3, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), n + 1, n2 + 2, n3, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), n + 2, n2 + 2, n3, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), n + 2, n2 + 1, n3, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), n + 2, n2, n3, rfi_32);
                this.id_class(rRI2, xu_3.PZ.id_continue(), n + 1, n2, n3, rfi_32);
                this.id_class(rRI2, (xc_3)xu_3.PZ.id_continue().id_class(dN_2.id_new, rCf_1.UPPER), n + 1, n2 + 1, n3, rfi_32);
                this.id_class(rRI2, (xc_3)xu_3.Pp.id_continue().id_class(Jt_1.p, rpr_3.NORTH), n + 2, n2 + 1, n3 + 1, rfi_32);
                this.id_class(rRI2, (xc_3)xu_3.Pp.id_continue().id_class(Jt_1.p, rpr_3.SOUTH), n + 2, n2 + 1, n3 - 1, rfi_32);
            }
        }
    }

    protected rrrN id_class(Random random) {
        int n = random.nextInt(5);
        switch (n) {
            default: {
                return rrrN.OPENING;
            }
            case 2: {
                return rrrN.WOOD_DOOR;
            }
            case 3: {
                return rrrN.GRATES;
            }
            case 4: 
        }
        return rrrN.IRON_DOOR;
    }

    protected rrrn_1 id_break(rrrd_1 rrrd_12, List<rrrn_1> list, Random random, int n, int n2) {
        rpr_3 rpr_32 = this.id_implements();
        if (rpr_32 != null) {
            switch (rpr_32) {
                case NORTH: {
                    return rii_3.id_break(rrrd_12, list, random, this.id_final.id_class - 1, this.id_final.id_break + n, this.id_final.id_byte + n2, rpr_3.WEST, this.id_private());
                }
                case SOUTH: {
                    return rii_3.id_break(rrrd_12, list, random, this.id_final.id_class - 1, this.id_final.id_break + n, this.id_final.id_byte + n2, rpr_3.WEST, this.id_private());
                }
                case WEST: {
                    return rii_3.id_break(rrrd_12, list, random, this.id_final.id_class + n2, this.id_final.id_break + n, this.id_final.id_byte - 1, rpr_3.NORTH, this.id_private());
                }
                case EAST: {
                    return rii_3.id_break(rrrd_12, list, random, this.id_final.id_class + n2, this.id_final.id_break + n, this.id_final.id_byte - 1, rpr_3.NORTH, this.id_private());
                }
            }
        }
        return null;
    }
}

