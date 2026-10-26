/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rfi_3;
import celestial.rpr_3;
import celestial.rrrE;
import celestial.rrrG;
import celestial.rrrJ;
import celestial.rrrM;
import celestial.rrrO;
import celestial.rrrP;
import celestial.rrrQ;
import celestial.rrrS;
import celestial.rrrW;
import celestial.rrrX;
import celestial.rrrb_1;
import celestial.rrrd_1;
import celestial.rrrh_1;
import celestial.rrrk_1;
import celestial.rrrn_1;
import celestial.rrrr_1;
import celestial.rrrs_1;
import celestial.rrrx_1;
import celestial.rrrz_1;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class rii_3 {
    private static final rrrM[] id_class = new rrrM[]{new rrrM(rrrz_1.class, 40, 0), new rrrM(rrrh_1.class, 5, 5), new rrrM(rrrG.class, 20, 0), new rrrM(rrrX.class, 20, 0), new rrrM(rrrJ.class, 10, 6), new rrrM(rrrk_1.class, 5, 5), new rrrM(rrrx_1.class, 5, 5), new rrrM(rrrE.class, 5, 4), new rrrM(rrrS.class, 5, 4), new rrrr_1(rrrb_1.class, 10, 2), new rrrP(rrrO.class, 20, 1)};
    private static List<rrrM> id_break;
    public static Class<? extends rrrQ> id_byte;
    private static int id_protected;
    public static final rrrW id_throws;

    static {
        id_throws = new rrrW();
    }

    private static rrrQ id_class(Class<? extends rrrQ> clazz, List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        rrrQ rrrQ2 = null;
        if (clazz == rrrz_1.class) {
            rrrQ2 = rrrz_1.id_class(list, random, n, n2, n3, rpr_32, n4);
        } else if (clazz == rrrh_1.class) {
            rrrQ2 = rrrh_1.id_class(list, random, n, n2, n3, rpr_32, n4);
        } else if (clazz == rrrG.class) {
            rrrQ2 = rrrG.id_class(list, random, n, n2, n3, rpr_32, n4);
        } else if (clazz == rrrX.class) {
            rrrQ2 = rrrX.id_class(list, random, n, n2, n3, rpr_32, n4);
        } else if (clazz == rrrJ.class) {
            rrrQ2 = rrrJ.id_class(list, random, n, n2, n3, rpr_32, n4);
        } else if (clazz == rrrk_1.class) {
            rrrQ2 = rrrk_1.id_class(list, random, n, n2, n3, rpr_32, n4);
        } else if (clazz == rrrx_1.class) {
            rrrQ2 = rrrx_1.id_class(list, random, n, n2, n3, rpr_32, n4);
        } else if (clazz == rrrE.class) {
            rrrQ2 = rrrE.id_class(list, random, n, n2, n3, rpr_32, n4);
        } else if (clazz == rrrS.class) {
            rrrQ2 = rrrS.id_class(list, random, n, n2, n3, rpr_32, n4);
        } else if (clazz == rrrb_1.class) {
            rrrQ2 = rrrb_1.id_class(list, random, n, n2, n3, rpr_32, n4);
        } else if (clazz == rrrO.class) {
            rrrQ2 = rrrO.id_class(list, n, n2, n3, rpr_32, n4);
        }
        return rrrQ2;
    }

    public static void id_class() {
        id_break = Lists.newArrayList();
        for (rrrM rrrM2 : id_class) {
            rrrM2.id_byte = 0;
            id_break.add(rrrM2);
        }
        id_byte = null;
    }

    private static rrrQ id_class(rrrd_1 rrrd_12, List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        if (!rii_3.id_break()) {
            return null;
        }
        if (id_byte != null) {
            rrrQ rrrQ2 = rii_3.id_class(id_byte, list, random, n, n2, n3, rpr_32, n4);
            id_byte = null;
            if (rrrQ2 != null) {
                return rrrQ2;
            }
        }
        int n5 = 0;
        block0: while (n5 < 5) {
            ++n5;
            int n6 = random.nextInt(id_protected);
            for (rrrM rrrM2 : id_break) {
                if ((n6 -= rrrM2.id_break) >= 0) continue;
                if (!rrrM2.id_class(n4) || rrrM2 == rrrd_12.id_class) continue block0;
                rrrQ rrrQ3 = rii_3.id_class(rrrM2.id_class, list, random, n, n2, n3, rpr_32, n4);
                if (rrrQ3 == null) continue;
                ++rrrM2.id_byte;
                rrrd_12.id_class = rrrM2;
                if (!rrrM2.id_class()) {
                    id_break.remove(rrrM2);
                }
                return rrrQ3;
            }
        }
        rfi_3 rfi_32 = rrrs_1.id_class(list, random, n, n2, n3, rpr_32);
        return rfi_32 != null && rfi_32.id_break > 1 ? new rrrs_1(n4, rfi_32, rpr_32) : null;
    }

    public static rrrn_1 id_break(rrrd_1 rrrd_12, List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        if (n4 > 50) {
            return null;
        }
        if (Math.abs(n - rrrd_12.id_catch().id_class) <= 112 && Math.abs(n3 - rrrd_12.id_catch().id_byte) <= 112) {
            rrrQ rrrQ2 = rii_3.id_class(rrrd_12, list, random, n, n2, n3, rpr_32, n4 + 1);
            if (rrrQ2 != null) {
                list.add(rrrQ2);
                rrrd_12.id_byte.add(rrrQ2);
            }
            return rrrQ2;
        }
        return null;
    }

    private static boolean id_break() {
        boolean bl = false;
        id_protected = 0;
        for (rrrM rrrM2 : id_break) {
            if (rrrM2.id_protected > 0 && rrrM2.id_byte < rrrM2.id_protected) {
                bl = true;
            }
            id_protected += rrrM2.id_break;
        }
        return bl;
    }
}

