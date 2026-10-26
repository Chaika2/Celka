/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rAB;
import celestial.rAP;
import celestial.rAS;
import celestial.rLi_1;
import celestial.rVL;
import celestial.rdU_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rkg_3;
import celestial.rpL_2;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;

public class rAr_1 {
    private static final List<rAP<rLi_1>> id_class = Lists.newArrayList();
    private static final List<rAP<rdb_3>> id_break = Lists.newArrayList();
    private static final List<rkg_3> id_byte = Lists.newArrayList();
    private static final Predicate<rdn_3> id_protected = rdn_32 -> {
        for (rkg_3 rkg_32 : id_byte) {
            if (!rkg_32.id_class((rdn_3)rdn_32)) continue;
            return true;
        }
        return false;
    };

    protected static boolean id_byte(rdn_3 rdn_32, rdn_3 rdn_33) {
        rLi_1 rLi_12 = rAB.id_protected(rdn_32);
        int n = id_class.size();
        for (int i = 0; i < n; ++i) {
            rAP<rLi_1> rAP2 = id_class.get(i);
            if (rAP2.id_class != rLi_12 || !rAP2.id_break.id_class(rdn_33)) continue;
            return true;
        }
        return false;
    }

    protected static boolean id_byte(rdn_3 rdn_32) {
        int n = id_class.size();
        for (int i = 0; i < n; ++i) {
            if (!rAr_1.id_class.get((int)i).id_break.id_class(rdn_32)) continue;
            return true;
        }
        return false;
    }

    public static void id_class() {
        rAr_1.id_class(rdy_3.JA);
        rAr_1.id_class(rdy_3.kk);
        rAr_1.id_class(rdy_3.kQ);
        rAr_1.id_class(rdy_3.JA, rdy_3.hr, rdy_3.kk);
        rAr_1.id_class(rdy_3.kk, rdy_3.kd, rdy_3.kQ);
        rAr_1.id_class(rAS.id_break, rdy_3.Jt, rAS.id_byte);
        rAr_1.id_class(rAS.id_break, rdy_3.Jv, rAS.id_byte);
        rAr_1.id_class(rAS.id_break, rdy_3.dy, rAS.id_byte);
        rAr_1.id_class(rAS.id_break, rdy_3.JH, rAS.id_byte);
        rAr_1.id_class(rAS.id_break, rdy_3.JC, rAS.id_byte);
        rAr_1.id_class(rAS.id_break, rdy_3.XY, rAS.id_byte);
        rAr_1.id_class(rAS.id_break, rdy_3.Jy, rAS.id_byte);
        rAr_1.id_class(rAS.id_break, rdy_3.XW, rAS.id_protected);
        rAr_1.id_class(rAS.id_break, rdy_3.hD, rAS.id_byte);
        rAr_1.id_class(rAS.id_break, rdy_3.JL, rAS.id_throws);
        rAr_1.id_class(rAS.id_throws, rdy_3.dO, rAS.id_case);
        rAr_1.id_class(rAS.id_case, rdy_3.hD, rAS.id_catch);
        rAr_1.id_class(rAS.id_case, rdy_3.Jl, rAS.id_private);
        rAr_1.id_class(rAS.id_catch, rdy_3.Jl, rAS.id_implements);
        rAr_1.id_class(rAS.id_private, rdy_3.hD, rAS.id_implements);
        rAr_1.id_class(rAS.id_throws, rdy_3.Jy, rAS.id_volatile);
        rAr_1.id_class(rAS.id_volatile, rdy_3.hD, rAS.id_final);
        rAr_1.id_class(rAS.id_throws, rdy_3.dy, rAS.id_finally);
        rAr_1.id_class(rAS.id_finally, rdy_3.hD, rAS.id_extends);
        rAr_1.id_class(rAS.id_finally, rdy_3.XW, rAS.id_native);
        rAr_1.id_class(rAS.id_finally, rdy_3.Jl, rAS.id_continue);
        rAr_1.id_class(rAS.id_extends, rdy_3.Jl, rAS.id_super);
        rAr_1.id_class(rAS.id_continue, rdy_3.hD, rAS.id_super);
        rAr_1.id_class(rAS.id_continue, rdy_3.XW, rAS.id_this);
        rAr_1.id_class(rAS.id_throws, rdy_3.Os, rAS.id_else);
        rAr_1.id_class(rAS.id_else, rdy_3.hD, rAS.id_synchronized);
        rAr_1.id_class(rAS.id_else, rdy_3.XW, rAS.id_return);
        rAr_1.id_class(rAS.id_package, rdy_3.Jl, rAS.id_continue);
        rAr_1.id_class(rAS.id_int, rdy_3.Jl, rAS.id_super);
        rAr_1.id_class(rAS.id_throws, rdy_3.XY, rAS.id_package);
        rAr_1.id_class(rAS.id_package, rdy_3.hD, rAS.id_int);
        rAr_1.id_class(rAS.id_package, rdy_3.XW, rAS.id_new);
        rAr_1.id_class(rAS.id_throws, rdy_3.Xc, rAS.id_public);
        rAr_1.id_class(rAS.id_public, rdy_3.hD, rAS.id_goto);
        rAr_1.id_class(rAS.id_throws, rdy_3.Jt, rAS.id_while);
        rAr_1.id_class(rAS.id_while, rdy_3.XW, rAS.id_try);
        rAr_1.id_class(rAS.id_while, rdy_3.Jl, rAS.id_instanceof);
        rAr_1.id_class(rAS.id_try, rdy_3.Jl, rAS.id_throw);
        rAr_1.id_class(rAS.id_instanceof, rdy_3.XW, rAS.id_throw);
        rAr_1.id_class(rAS.id_interface, rdy_3.Jl, rAS.id_instanceof);
        rAr_1.id_class(rAS.id_char, rdy_3.Jl, rAS.id_instanceof);
        rAr_1.id_class(rAS.id_abstract, rdy_3.Jl, rAS.id_throw);
        rAr_1.id_class(rAS.id_throws, rdy_3.JC, rAS.id_interface);
        rAr_1.id_class(rAS.id_interface, rdy_3.hD, rAS.id_char);
        rAr_1.id_class(rAS.id_interface, rdy_3.XW, rAS.id_abstract);
        rAr_1.id_class(rAS.id_throws, rdy_3.Jv, rAS.id_long);
        rAr_1.id_class(rAS.id_long, rdy_3.hD, rAS.id_float);
        rAr_1.id_class(rAS.id_long, rdy_3.XW, rAS.id_void);
        rAr_1.id_class(rAS.id_throws, rdy_3.JH, rAS.id_static);
        rAr_1.id_class(rAS.id_static, rdy_3.hD, rAS.id_import);
        rAr_1.id_class(rAS.id_static, rdy_3.XW, rAS.id_short);
        rAr_1.id_class(rAS.id_break, rdy_3.Jl, rAS.id_default);
        rAr_1.id_class(rAS.id_default, rdy_3.hD, rAS.id_const);
        rAr_1.id_class(rAS.id_throws, rdy_3.ko, rAS.id_boolean);
        rAr_1.id_class(rAS.id_boolean, rdy_3.hD, rAS.id_transient);
    }

    private static void id_class(rdb_3 rdb_32, rdb_3 rdb_33, rdb_3 rdb_34) {
        if (!(rdb_32 instanceof rdU_2)) {
            throw new IllegalArgumentException("Expected a potion, got: " + rVL.id_for.id_break(rdb_32));
        }
        if (!(rdb_34 instanceof rdU_2)) {
            throw new IllegalArgumentException("Expected a potion, got: " + rVL.id_for.id_break(rdb_34));
        }
        id_break.add(new rAP<rdb_3>(rdb_32, rkg_3.id_class(rdb_33), rdb_34));
    }

    private static void id_class(rdb_3 rdb_32) {
        if (!(rdb_32 instanceof rdU_2)) {
            throw new IllegalArgumentException("Expected a potion, got: " + rVL.id_for.id_break(rdb_32));
        }
        id_byte.add(rkg_3.id_class(rdb_32));
    }

    private static void id_class(rLi_1 rLi_12, rdb_3 rdb_32, rLi_1 rLi_13) {
        id_class.add(new rAP<rLi_1>(rLi_12, rkg_3.id_class(rdb_32), rLi_13));
    }

    public static boolean id_class(rLi_1 rLi_12) {
        int n = id_class.size();
        for (int i = 0; i < n; ++i) {
            if (rAr_1.id_class.get((int)i).id_byte != rLi_12) continue;
            return true;
        }
        return false;
    }

    public static boolean id_class(rdn_3 rdn_32) {
        return rAr_1.id_break(rdn_32) || rAr_1.id_byte(rdn_32);
    }

    public static boolean id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        if (!id_protected.test(rdn_32)) {
            return false;
        }
        return rAr_1.id_break(rdn_32, rdn_33) || rAr_1.id_byte(rdn_32, rdn_33);
    }

    protected static boolean id_break(rdn_3 rdn_32) {
        int n = id_break.size();
        for (int i = 0; i < n; ++i) {
            if (!rAr_1.id_break.get((int)i).id_break.id_class(rdn_32)) continue;
            return true;
        }
        return false;
    }

    protected static boolean id_break(rdn_3 rdn_32, rdn_3 rdn_33) {
        rdb_3 rdb_32 = rdn_32.id_break();
        int n = id_break.size();
        for (int i = 0; i < n; ++i) {
            rAP<rdb_3> rAP2 = id_break.get(i);
            if (rAP2.id_class != rdb_32 || !rAP2.id_break.id_class(rdn_33)) continue;
            return true;
        }
        return false;
    }

    public static rdn_3 id_protected(rdn_3 rdn_32, rdn_3 rdn_33) {
        if (!rdn_33.id_class()) {
            rAP<Object> rAP2;
            int n;
            rLi_1 rLi_12 = rAB.id_protected(rdn_33);
            rdb_3 rdb_32 = rdn_33.id_break();
            int n2 = id_break.size();
            for (n = 0; n < n2; ++n) {
                rAP2 = id_break.get(n);
                if (rAP2.id_class != rdb_32 || !rAP2.id_break.id_class(rdn_32)) continue;
                return rAB.id_class(new rdn_3((rpL_2)rAP2.id_byte), rLi_12);
            }
            n2 = id_class.size();
            for (n = 0; n < n2; ++n) {
                rAP2 = id_class.get(n);
                if (rAP2.id_class != rLi_12 || !rAP2.id_break.id_class(rdn_32)) continue;
                return rAB.id_class(new rdn_3(rdb_32), (rLi_1)rAP2.id_byte);
            }
        }
        return rdn_33;
    }
}

