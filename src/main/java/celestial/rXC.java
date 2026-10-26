/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXu_1;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rqs_3;
import java.util.List;
import java.util.function.Predicate;

public class rXC {
    public static rcd_3 id_class(rcd_3 rcd_32, rqs_3<rdn_3> rqs_32, boolean bl) {
        rcy_3 rcy_32 = new rcy_3();
        for (int i = 0; i < rqs_32.size(); ++i) {
            rdn_3 rdn_32 = rqs_32.get(i);
            if (rdn_32.id_class()) continue;
            rcd_3 rcd_33 = new rcd_3();
            rcd_33.id_class("Slot", (byte)i);
            rdn_32.id_break(rcd_33);
            rcy_32.add(rcd_33);
        }
        if (!rcy_32.isEmpty() || bl) {
            rcd_32.id_class("Items", rcy_32);
        }
        return rcd_32;
    }

    public static int id_class(rXu_1 rXu_12, Predicate<rdn_3> predicate, int n, boolean bl) {
        int n2 = 0;
        for (int i = 0; i < rXu_12.id_else(); ++i) {
            rdn_3 rdn_32 = rXu_12.id_extends(i);
            int n3 = rXC.id_class(rdn_32, predicate, n - n2, bl);
            if (n3 > 0 && !bl && rdn_32.id_class()) {
                rXu_12.id_break(i, rdn_3.id_break);
            }
            n2 += n3;
        }
        return n2;
    }

    public static int id_class(rdn_3 rdn_32, Predicate<rdn_3> predicate, int n, boolean bl) {
        if (!rdn_32.id_class() && predicate.test(rdn_32)) {
            if (bl) {
                return rdn_32.id_char();
            }
            int n2 = n < 0 ? rdn_32.id_char() : Math.min(n, rdn_32.id_char());
            rdn_32.id_catch(n2);
            return n2;
        }
        return 0;
    }

    public static rdn_3 id_class(List<rdn_3> list, int n, int n2) {
        return n >= 0 && n < list.size() && !list.get(n).id_class() && n2 > 0 ? list.get(n).id_class(n2) : rdn_3.id_break;
    }

    public static rdn_3 id_class(List<rdn_3> list, int n) {
        return n >= 0 && n < list.size() ? list.set(n, rdn_3.id_break) : rdn_3.id_break;
    }

    public static rcd_3 id_class(rcd_3 rcd_32, rqs_3<rdn_3> rqs_32) {
        return rXC.id_class(rcd_32, rqs_32, true);
    }

    public static void id_break(rcd_3 rcd_32, rqs_3<rdn_3> rqs_32) {
        rcy_3 rcy_32 = rcd_32.id_protected("Items", 10);
        for (int i = 0; i < rcy_32.size(); ++i) {
            rcd_3 rcd_33 = rcy_32.id_class(i);
            int n = rcd_33.id_case("Slot") & 0xFF;
            if (n < 0 || n >= rqs_32.size()) continue;
            rqs_32.set(n, rdn_3.id_class(rcd_33));
        }
    }
}

