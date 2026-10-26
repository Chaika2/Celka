/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.raF_2;
import celestial.raQ_2;
import celestial.rac_3;
import celestial.rad_3;
import celestial.ras_3;
import celestial.rcd_3;
import celestial.rfi_3;
import celestial.rpr_3;
import celestial.rrrn_1;
import java.util.List;
import java.util.Random;

public abstract class raz_3
extends rrrn_1 {
    protected rrrn_1 id_byte(rac_3 rac_32, List<rrrn_1> list, Random random, int n, int n2, boolean bl) {
        rpr_3 rpr_32 = this.id_implements();
        if (rpr_32 != null) {
            switch (rpr_32) {
                case NORTH: {
                    return this.id_class(rac_32, list, random, this.id_final.id_protected + 1, this.id_final.id_break + n, this.id_final.id_byte + n2, rpr_3.EAST, this.id_private(), bl);
                }
                case SOUTH: {
                    return this.id_class(rac_32, list, random, this.id_final.id_protected + 1, this.id_final.id_break + n, this.id_final.id_byte + n2, rpr_3.EAST, this.id_private(), bl);
                }
                case WEST: {
                    return this.id_class(rac_32, list, random, this.id_final.id_class + n2, this.id_final.id_break + n, this.id_final.id_case + 1, rpr_3.SOUTH, this.id_private(), bl);
                }
                case EAST: {
                    return this.id_class(rac_32, list, random, this.id_final.id_class + n2, this.id_final.id_break + n, this.id_final.id_case + 1, rpr_3.SOUTH, this.id_private(), bl);
                }
            }
        }
        return null;
    }

    protected raz_3(raF_2 raF_22, int n) {
        super(raF_22, n);
    }

    public raz_3(raF_2 raF_22, rcd_3 rcd_32) {
        super(raF_22, rcd_32);
    }

    private rrrn_1 id_class(rac_3 rac_32, List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4, boolean bl) {
        if (Math.abs(n - rac_32.id_catch().id_class) <= 112 && Math.abs(n3 - rac_32.id_catch().id_byte) <= 112) {
            raz_3 raz_32;
            List<raQ_2> list2 = rac_32.id_break;
            if (bl) {
                list2 = rac_32.id_byte;
            }
            if ((raz_32 = this.id_class(rac_32, list2, list, random, n, n2, n3, rpr_32, n4 + 1)) != null) {
                list.add(raz_32);
                rac_32.id_protected.add(raz_32);
            }
            return raz_32;
        }
        return rad_3.id_class(list, random, n, n2, n3, rpr_32, n4);
    }

    protected rrrn_1 id_class(rac_3 rac_32, List<rrrn_1> list, Random random, int n, int n2, boolean bl) {
        rpr_3 rpr_32 = this.id_implements();
        if (rpr_32 != null) {
            switch (rpr_32) {
                case NORTH: {
                    return this.id_class(rac_32, list, random, this.id_final.id_class + n, this.id_final.id_break + n2, this.id_final.id_byte - 1, rpr_32, this.id_private(), bl);
                }
                case SOUTH: {
                    return this.id_class(rac_32, list, random, this.id_final.id_class + n, this.id_final.id_break + n2, this.id_final.id_case + 1, rpr_32, this.id_private(), bl);
                }
                case WEST: {
                    return this.id_class(rac_32, list, random, this.id_final.id_class - 1, this.id_final.id_break + n2, this.id_final.id_byte + n, rpr_32, this.id_private(), bl);
                }
                case EAST: {
                    return this.id_class(rac_32, list, random, this.id_final.id_protected + 1, this.id_final.id_break + n2, this.id_final.id_byte + n, rpr_32, this.id_private(), bl);
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
    }

    private int id_class(List<raQ_2> list) {
        boolean bl = false;
        int n = 0;
        for (raQ_2 raQ_22 : list) {
            if (raQ_22.id_protected > 0 && raQ_22.id_byte < raQ_22.id_protected) {
                bl = true;
            }
            n += raQ_22.id_break;
        }
        return bl ? n : -1;
    }

    private raz_3 id_class(rac_3 rac_32, List<raQ_2> list, List<rrrn_1> list2, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        int n5 = this.id_class(list);
        boolean bl = n5 > 0 && n4 <= 30;
        int n6 = 0;
        block0: while (n6 < 5 && bl) {
            ++n6;
            int n7 = random.nextInt(n5);
            for (raQ_2 raQ_22 : list) {
                if ((n7 -= raQ_22.id_break) >= 0) continue;
                if (!raQ_22.id_class(n4) || raQ_22 == rac_32.id_class && !raQ_22.id_throws) continue block0;
                raz_3 raz_32 = ras_3.id_class(raQ_22, list2, random, n, n2, n3, rpr_32, n4);
                if (raz_32 == null) continue;
                ++raQ_22.id_byte;
                rac_32.id_class = raQ_22;
                if (!raQ_22.id_class()) {
                    list.remove(raQ_22);
                }
                return raz_32;
            }
        }
        return rad_3.id_class(list2, random, n, n2, n3, rpr_32, n4);
    }

    protected rrrn_1 id_break(rac_3 rac_32, List<rrrn_1> list, Random random, int n, int n2, boolean bl) {
        rpr_3 rpr_32 = this.id_implements();
        if (rpr_32 != null) {
            switch (rpr_32) {
                case NORTH: {
                    return this.id_class(rac_32, list, random, this.id_final.id_class - 1, this.id_final.id_break + n, this.id_final.id_byte + n2, rpr_3.WEST, this.id_private(), bl);
                }
                case SOUTH: {
                    return this.id_class(rac_32, list, random, this.id_final.id_class - 1, this.id_final.id_break + n, this.id_final.id_byte + n2, rpr_3.WEST, this.id_private(), bl);
                }
                case WEST: {
                    return this.id_class(rac_32, list, random, this.id_final.id_class + n2, this.id_final.id_break + n, this.id_final.id_byte - 1, rpr_3.NORTH, this.id_private(), bl);
                }
                case EAST: {
                    return this.id_class(rac_32, list, random, this.id_final.id_class + n2, this.id_final.id_break + n, this.id_final.id_byte - 1, rpr_3.NORTH, this.id_private(), bl);
                }
            }
        }
        return null;
    }
}

