/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 */
package celestial;

import celestial.rCp_1;
import celestial.rVL;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rsT_2;
import celestial.xb_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class rRP {
    private static final Supplier<Set<rRP>> id_goto = Suppliers.memoize(() -> rVL.J.id_case().map(rsT_2::id_class).collect(Collectors.toSet()));
    public static final Predicate<rRP> id_class = rRP2 -> id_goto.get().contains(rRP2);
    public static final Predicate<rRP> id_break = rRP2 -> true;
    private static final Set<xc_3> id_while = (Set)ImmutableList.of((Object)xu_3.R, (Object)xu_3.Y, (Object)xu_3.j, (Object)xu_3.V, (Object)xu_3.I, (Object)xu_3.t, (Object)xu_3.g, (Object)xu_3.y, (Object)xu_3.w, (Object)xu_3.q, (Object)xu_3.H, (Object)xu_3.l, (Object[])new xd_3[]{xu_3.T, xu_3.f, xu_3.C, xu_3.p}).stream().flatMap(xd_32 -> xd_32.id_new().id_class().stream()).filter(xc_32 -> xc_32.id_byte(xb_3.id_volatile) == rCp_1.HEAD).collect(ImmutableSet.toImmutableSet());
    private static final Map<xc_3, rRP> id_try = Maps.newHashMap();
    public static final rRP id_byte = rRP.id_class("unemployed", (Set<xc_3>)ImmutableSet.of(), 1, id_class, 1);
    public static final rRP id_protected = rRP.id_class("armorer", rRP.id_class(xu_3.Xr), 1, 1);
    public static final rRP id_throws = rRP.id_class("butcher", rRP.id_class(xu_3.hi), 1, 1);
    public static final rRP id_case = rRP.id_class("cartographer", rRP.id_class(xu_3.XP), 1, 1);
    public static final rRP id_catch = rRP.id_class("cleric", rRP.id_class(xu_3.SG), 1, 1);
    public static final rRP id_private = rRP.id_class("farmer", rRP.id_class(xu_3.JG), 1, 1);
    public static final rRP id_implements = rRP.id_class("fisherman", rRP.id_class(xu_3.ha), 1, 1);
    public static final rRP id_finally = rRP.id_class("fletcher", rRP.id_class(xu_3.XB), 1, 1);
    public static final rRP id_extends = rRP.id_class("leatherworker", rRP.id_class(xu_3.Sb), 1, 1);
    public static final rRP id_native = rRP.id_class("librarian", rRP.id_class(xu_3.Xs), 1, 1);
    public static final rRP id_volatile = rRP.id_class("mason", rRP.id_class(xu_3.XG), 1, 1);
    public static final rRP id_final = rRP.id_class("nitwit", (Set<xc_3>)ImmutableSet.of(), 1, 1);
    public static final rRP id_package = rRP.id_class("shepherd", rRP.id_class(xu_3.he), 1, 1);
    public static final rRP id_int = rRP.id_class("toolsmith", rRP.id_class(xu_3.XE), 1, 1);
    public static final rRP id_new = rRP.id_class("weaponsmith", rRP.id_class(xu_3.XS), 1, 1);
    public static final rRP id_continue = rRP.id_class("home", id_while, 1, 1);
    public static final rRP id_super = rRP.id_class("meeting", rRP.id_class(xu_3.Xb), 32, 6);
    public static final rRP id_this = rRP.id_class("beehive", rRP.id_class(xu_3.JO), 0, 1);
    public static final rRP id_else = rRP.id_class("bee_nest", rRP.id_class(xu_3.JM), 0, 1);
    public static final rRP id_synchronized = rRP.id_class("nether_portal", rRP.id_class(xu_3.Pi), 0, 1);
    public static final rRP id_return = rRP.id_class("lodestone", rRP.id_class(xu_3.Jc), 0, 1);
    protected static final Set<xc_3> id_public = new ObjectOpenHashSet(id_try.keySet());
    private final String id_instanceof;
    private final Set<xc_3> id_throw;
    private final int id_interface;
    private final Predicate<rRP> id_char;
    private final int id_abstract;

    public int id_byte() {
        return this.id_abstract;
    }

    private rRP(String string, Set<xc_3> set, int n, int n2) {
        this.id_instanceof = string;
        this.id_throw = ImmutableSet.copyOf(set);
        this.id_interface = n;
        this.id_char = rRP2 -> rRP2 == this;
        this.id_abstract = n2;
    }

    private rRP(String string, Set<xc_3> set, int n, Predicate<rRP> predicate, int n2) {
        this.id_instanceof = string;
        this.id_throw = ImmutableSet.copyOf(set);
        this.id_interface = n;
        this.id_char = predicate;
        this.id_abstract = n2;
    }

    public String toString() {
        return this.id_instanceof;
    }

    private static rRP id_class(rRP rRP2) {
        rRP2.id_throw.forEach(xc_32 -> {
            rRP rRP3 = id_try.put((xc_3)xc_32, rRP2);
            if (rRP3 != null) {
                throw rqR_2.id_byte(new IllegalStateException(String.format("%s is defined in too many tags", xc_32)));
            }
        });
        return rRP2;
    }

    public static Optional<rRP> id_class(xc_3 xc_32) {
        return Optional.ofNullable(id_try.get(xc_32));
    }

    private static Set<xc_3> id_class(xd_3 xd_32) {
        return ImmutableSet.copyOf(xd_32.id_new().id_class());
    }

    public int id_class() {
        return this.id_interface;
    }

    private static rRP id_class(String string, Set<xc_3> set, int n, int n2) {
        return rRP.id_class(rVL.id_class(rVL.x, new rqO_2(string), new rRP(string, set, n, n2)));
    }

    private static rRP id_class(String string, Set<xc_3> set, int n, Predicate<rRP> predicate, int n2) {
        return rRP.id_class(rVL.id_class(rVL.x, new rqO_2(string), new rRP(string, set, n, predicate, n2)));
    }

    public Predicate<rRP> id_break() {
        return this.id_char;
    }
}

