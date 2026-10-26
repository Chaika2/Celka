/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.rRP;
import celestial.rVL;
import celestial.rdb_3;
import celestial.rdy_3;
import celestial.rqA_2;
import celestial.rqO_2;
import celestial.rqn_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableSet;

public class rsT_2 {
    public static final rsT_2 id_class = rsT_2.id_class("none", rRP.id_byte, null);
    public static final rsT_2 id_break = rsT_2.id_class("armorer", rRP.id_protected, rqn_3.kE);
    public static final rsT_2 id_byte = rsT_2.id_class("butcher", rRP.id_throws, rqn_3.kG);
    public static final rsT_2 id_protected = rsT_2.id_class("cartographer", rRP.id_case, rqn_3.kb);
    public static final rsT_2 id_throws = rsT_2.id_class("cleric", rRP.id_catch, rqn_3.kM);
    public static final rsT_2 id_case = rsT_2.id_class("farmer", rRP.id_private, (ImmutableSet<rdb_3>)ImmutableSet.of((Object)rdy_3.hB, (Object)rdy_3.hP, (Object)rdy_3.kJ, (Object)rdy_3.Xg), (ImmutableSet<xd_3>)ImmutableSet.of((Object)xu_3.PS), rqn_3.kO);
    public static final rsT_2 id_catch = rsT_2.id_class("fisherman", rRP.id_implements, rqn_3.kh);
    public static final rsT_2 id_private = rsT_2.id_class("fletcher", rRP.id_finally, rqn_3.kX);
    public static final rsT_2 id_implements = rsT_2.id_class("leatherworker", rRP.id_extends, rqn_3.kJ);
    public static final rsT_2 id_finally = rsT_2.id_class("librarian", rRP.id_native, rqn_3.kx);
    public static final rsT_2 id_extends = rsT_2.id_class("mason", rRP.id_volatile, rqn_3.kd);
    public static final rsT_2 id_native = rsT_2.id_class("nitwit", rRP.id_final, null);
    public static final rsT_2 id_volatile = rsT_2.id_class("shepherd", rRP.id_package, rqn_3.kk);
    public static final rsT_2 id_final = rsT_2.id_class("toolsmith", rRP.id_int, rqn_3.kW);
    public static final rsT_2 id_package = rsT_2.id_class("weaponsmith", rRP.id_new, rqn_3.kz);
    private final String id_int;
    private final rRP id_new;
    private final ImmutableSet<rdb_3> id_continue;
    private final ImmutableSet<xd_3> id_super;
    private final rqA_2 id_this;

    public ImmutableSet<xd_3> id_byte() {
        return this.id_super;
    }

    private rsT_2(String string, rRP rRP2, ImmutableSet<rdb_3> immutableSet, ImmutableSet<xd_3> immutableSet2, rqA_2 rqA_22) {
        this.id_int = string;
        this.id_new = rRP2;
        this.id_continue = immutableSet;
        this.id_super = immutableSet2;
        this.id_this = rqA_22;
    }

    public String toString() {
        return this.id_int;
    }

    public static rsT_2 id_class(String string, rRP rRP2, ImmutableSet<rdb_3> immutableSet, ImmutableSet<xd_3> immutableSet2, rqA_2 rqA_22) {
        return rVL.id_class(rVL.J, new rqO_2(string), new rsT_2(string, rRP2, immutableSet, immutableSet2, rqA_22));
    }

    public static rsT_2 id_class(String string, rRP rRP2, rqA_2 rqA_22) {
        return rsT_2.id_class(string, rRP2, (ImmutableSet<rdb_3>)ImmutableSet.of(), (ImmutableSet<xd_3>)ImmutableSet.of(), rqA_22);
    }

    public rRP id_class() {
        return this.id_new;
    }

    public ImmutableSet<rdb_3> id_break() {
        return this.id_continue;
    }

    public rqA_2 id_protected() {
        return this.id_this;
    }
}

