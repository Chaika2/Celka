/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.RF;
import celestial.RG;
import celestial.UT;
import celestial.aI_2;
import celestial.dt_3;
import celestial.ev_3;
import celestial.gp_3;
import celestial.iJ_2;
import celestial.iN_2;
import celestial.rAr_1;
import celestial.rLR;
import celestial.rRu_1;
import celestial.rVL;
import celestial.rVc_1;
import celestial.rdb_3;
import celestial.rgX_2;
import celestial.rlA_2;
import celestial.rnk_3;
import celestial.rpK_2;
import celestial.rqu_3;
import celestial.xU_2;
import celestial.xd_3;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rVN {
    public static final PrintStream id_class = System.out;
    private static boolean id_break;
    private static final Logger id_byte;

    public static void id_byte() {
        if (!id_break) {
            throw new IllegalArgumentException("Not bootstrapped");
        }
        if (rqu_3.id_byte) {
            rVN.id_break().forEach(string -> id_byte.error("Missing translations: " + string));
            gp_3.id_break();
        }
        iN_2.id_class();
    }

    static {
        id_byte = LogManager.getLogger();
    }

    public static void id_class() {
        if (!id_break) {
            id_break = true;
            if (rVL.id_protected.id_protected().isEmpty()) {
                throw new IllegalStateException("Unable to load registries");
            }
            dt_3.id_break();
            xU_2.id_break();
            if (aI_2.id_class(aI_2.rM) == null) {
                throw new IllegalStateException("Failed loading EntityTypes");
            }
            rAr_1.id_class();
            RF.id_class();
            UT.id_class();
            RG.id_class();
            rlA_2.id_break();
            rVN.id_protected();
        }
    }

    public static void id_class(String string) {
        id_class.println(string);
    }

    private static <T> void id_class(Iterable<T> iterable, Function<T, String> function, Set<String> set) {
        rgX_2 rgX_22 = rgX_2.id_byte();
        iterable.forEach(object -> {
            String string = (String)function.apply(object);
            if (!rgX_22.id_break(string)) {
                set.add(string);
            }
        });
    }

    private static void id_class(Set<String> set) {
        rgX_2 rgX_22 = rgX_2.id_byte();
        rRu_1.id_class(new rVc_1(rgX_22, set));
    }

    public static Set<String> id_break() {
        TreeSet<String> treeSet = new TreeSet<String>();
        rVN.id_class(rVL.O, iJ_2::id_byte, treeSet);
        rVN.id_class(rVL.id_transient, aI_2::id_private, treeSet);
        rVN.id_class(rVL.id_const, rLR::id_byte, treeSet);
        rVN.id_class(rVL.id_for, rdb_3::id_break, treeSet);
        rVN.id_class(rVL.id_boolean, ev_3::id_catch, treeSet);
        rVN.id_class(rVL.id_strictfp, xd_3::id_volatile, treeSet);
        rVN.id_class(rVL.B, rqO_22 -> "stat." + rqO_22.toString().replace(':', '.'), treeSet);
        rVN.id_class(treeSet);
        return treeSet;
    }

    private static void id_protected() {
        if (id_byte.isDebugEnabled()) {
            System.setErr(new rnk_3("STDERR", System.err));
            System.setOut(new rnk_3("STDOUT", id_class));
        } else {
            System.setErr(new rpK_2("STDERR", System.err));
            System.setOut(new rpK_2("STDOUT", id_class));
        }
    }
}

