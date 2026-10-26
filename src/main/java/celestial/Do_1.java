/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.UX;
import celestial.rVL;
import celestial.rdb_3;
import celestial.rqO_2;
import celestial.xd_3;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Do_1 {
    private final Map<UX, rqO_2> id_class = Maps.newHashMap();
    private final Set<UX> id_break = Sets.newHashSet();

    public static Do_1 id_byte(xd_3 xd_32, xd_3 xd_33) {
        return new Do_1().id_class(UX.id_byte, Do_1.id_class(xd_32, "_front")).id_class(UX.id_package, Do_1.id_throw(xd_33)).id_class(UX.id_final, Do_1.id_class(xd_32, "_top")).id_class(UX.id_finally, Do_1.id_class(xd_32, "_front")).id_class(UX.id_native, Do_1.id_class(xd_32, "_side")).id_class(UX.id_extends, Do_1.id_class(xd_32, "_side")).id_class(UX.id_volatile, Do_1.id_class(xd_32, "_front"));
    }

    public static Do_1 id_byte(UX uX, rqO_2 rqO_22) {
        return new Do_1().id_class(uX, rqO_22);
    }

    public static rqO_2 id_byte(rdb_3 rdb_32) {
        rqO_2 rqO_22 = rVL.id_for.id_break(rdb_32);
        return new rqO_2(rqO_22.id_byte(), "item/" + rqO_22.id_break());
    }

    public static Do_1 id_byte(rqO_2 rqO_22) {
        return Do_1.id_byte(UX.id_int, rqO_22);
    }

    public static Do_1 id_byte(xd_3 xd_32) {
        return Do_1.id_byte(UX.id_int, Do_1.id_throw(xd_32));
    }

    public static Do_1 id_int(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_case, Do_1.id_class(xd_32, "_top")).id_class(UX.id_throws, Do_1.id_class(xd_32, "_bottom"));
    }

    public static Do_1 id_this(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_interface, Do_1.id_throw(xd_32));
    }

    public static rqO_2 id_class(xd_3 xd_32, String string) {
        rqO_2 rqO_22 = rVL.id_strictfp.id_break(xd_32);
        return new rqO_2(rqO_22.id_byte(), "block/" + rqO_22.id_break() + string);
    }

    public static rqO_2 id_class(rdb_3 rdb_32, String string) {
        rqO_2 rqO_22 = rVL.id_for.id_break(rdb_32);
        return new rqO_2(rqO_22.id_byte(), "item/" + rqO_22.id_break() + string);
    }

    public static Do_1 id_class(xd_3 xd_32, xd_3 xd_33) {
        return new Do_1().id_class(UX.id_goto, Do_1.id_throw(xd_32)).id_class(UX.id_while, Do_1.id_throw(xd_33));
    }

    public static Do_1 id_class(rdb_3 rdb_32) {
        return new Do_1().id_class(UX.id_byte, Do_1.id_byte(rdb_32));
    }

    public static Do_1 id_class(rqO_2 rqO_22, rqO_2 rqO_23) {
        return new Do_1().id_class(UX.id_implements, rqO_22).id_class(UX.id_protected, rqO_23);
    }

    public static Do_1 id_class(rqO_2 rqO_22) {
        return new Do_1().id_class(UX.id_break, rqO_22);
    }

    public Stream<UX> id_class() {
        return this.id_break.stream();
    }

    public Do_1 id_class(UX uX, UX uX2) {
        this.id_class.put(uX2, this.id_class.get(uX));
        this.id_break.add(uX2);
        return this;
    }

    public rqO_2 id_class(UX uX) {
        for (UX uX2 = uX; uX2 != null; uX2 = uX2.id_break()) {
            rqO_2 rqO_22 = this.id_class.get(uX2);
            if (rqO_22 == null) continue;
            return rqO_22;
        }
        throw new IllegalStateException("Can't find texture for slot " + uX);
    }

    public Do_1 id_class(UX uX, rqO_2 rqO_22) {
        this.id_class.put(uX, rqO_22);
        return this;
    }

    public static Do_1 id_class(xd_3 xd_32) {
        rqO_2 rqO_22 = Do_1.id_throw(xd_32);
        return Do_1.id_break(rqO_22);
    }

    public static Do_1 id_break(rqO_2 rqO_22) {
        return new Do_1().id_class(UX.id_class, rqO_22);
    }

    public static Do_1 id_break(xd_3 xd_32, xd_3 xd_33) {
        return new Do_1().id_class(UX.id_synchronized, Do_1.id_throw(xd_32)).id_class(UX.id_return, Do_1.id_class(xd_33, "_top"));
    }

    public Do_1 id_break(UX uX, rqO_2 rqO_22) {
        Do_1 do_1 = new Do_1();
        do_1.id_class.putAll(this.id_class);
        do_1.id_break.addAll(this.id_break);
        do_1.id_class(uX, rqO_22);
        return do_1;
    }

    public static Do_1 id_break(xd_3 xd_32) {
        rqO_2 rqO_22 = Do_1.id_throw(xd_32);
        return Do_1.id_class(rqO_22);
    }

    public static Do_1 id_break(rdb_3 rdb_32) {
        return new Do_1().id_class(UX.id_float, Do_1.id_byte(rdb_32));
    }

    public static Do_1 id_throws(xd_3 xd_32) {
        return Do_1.id_byte(UX.id_super, Do_1.id_throw(xd_32));
    }

    public static Do_1 id_throws(rqO_2 rqO_22) {
        return Do_1.id_byte(UX.id_super, rqO_22);
    }

    public static Do_1 id_finally(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_implements, Do_1.id_class(xd_32, "_side")).id_class(UX.id_protected, Do_1.id_class(xd_32, "_top"));
    }

    public static Do_1 id_catch(rqO_2 rqO_22) {
        return new Do_1().id_class(UX.id_byte, rqO_22);
    }

    public static Do_1 id_catch(xd_3 xd_32) {
        return Do_1.id_byte(UX.id_goto, Do_1.id_throw(xd_32));
    }

    public static Do_1 id_extends(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_implements, Do_1.id_class(xd_32, "_side")).id_class(UX.id_case, Do_1.id_class(xd_32, "_top"));
    }

    public static Do_1 id_goto(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_implements, Do_1.id_class(xd_32, "_side")).id_class(UX.id_catch, Do_1.id_class(xd_32, "_front")).id_class(UX.id_protected, Do_1.id_class(xd_32, "_end"));
    }

    public static Do_1 id_case(rqO_2 rqO_22) {
        return Do_1.id_byte(UX.id_try, rqO_22);
    }

    public static Do_1 id_case(xd_3 xd_32) {
        return Do_1.id_byte(UX.id_this, Do_1.id_throw(xd_32));
    }

    public static Do_1 id_continue(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_throw, Do_1.id_class(xd_32, "_0"));
    }

    public static Do_1 id_else(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_long, Do_1.id_throw(xd_32));
    }

    public static Do_1 id_implements(xd_3 xd_32) {
        return Do_1.id_byte(UX.id_public, Do_1.id_throw(xd_32));
    }

    public static Do_1 id_implements(rqO_2 rqO_22) {
        return new Do_1().id_class(UX.id_float, rqO_22);
    }

    public static Do_1 id_instanceof(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_float, Do_1.id_throw(xd_32));
    }

    public static Do_1 id_new(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_byte, Do_1.id_throw(xd_32));
    }

    public static Do_1 id_package(xd_3 xd_32) {
        rqO_2 rqO_22 = Do_1.id_throw(xd_32);
        return new Do_1().id_class(UX.id_continue, rqO_22).id_class(UX.id_implements, rqO_22).id_class(UX.id_protected, Do_1.id_class(xd_32, "_top"));
    }

    public static Do_1 id_return(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_implements, Do_1.id_class(xd_32, "_side")).id_class(UX.id_catch, Do_1.id_class(xd_32, "_front")).id_class(UX.id_case, Do_1.id_class(xd_32, "_top")).id_class(UX.id_throws, Do_1.id_class(xd_32, "_bottom"));
    }

    public static Do_1 id_super(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_throw, Do_1.id_class(xd_32, "_1"));
    }

    public static rqO_2 id_throw(xd_3 xd_32) {
        rqO_2 rqO_22 = rVL.id_strictfp.id_break(xd_32);
        return new rqO_2(rqO_22.id_byte(), "block/" + rqO_22.id_break());
    }

    public static Do_1 id_try(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_void, Do_1.id_class(xd_32, "_log_lit")).id_class(UX.id_throw, Do_1.id_class(xd_32, "_fire"));
    }

    public static Do_1 id_while(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_case, Do_1.id_class(xd_32, "_top"));
    }

    public static Do_1 id_public(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_implements, Do_1.id_class(xd_32, "_side")).id_class(UX.id_catch, Do_1.id_class(xd_32, "_front")).id_class(UX.id_case, Do_1.id_class(xd_32, "_top"));
    }

    public static Do_1 id_protected(rqO_2 rqO_22) {
        return Do_1.id_byte(UX.id_new, rqO_22);
    }

    public static Do_1 id_protected(xd_3 xd_32) {
        return Do_1.id_byte(UX.id_new, Do_1.id_throw(xd_32));
    }

    public static Do_1 id_protected(xd_3 xd_32, xd_3 xd_33) {
        return new Do_1().id_class(UX.id_byte, Do_1.id_class(xd_32, "_front")).id_class(UX.id_package, Do_1.id_throw(xd_33)).id_class(UX.id_final, Do_1.id_class(xd_32, "_top")).id_class(UX.id_finally, Do_1.id_class(xd_32, "_front")).id_class(UX.id_extends, Do_1.id_class(xd_32, "_front")).id_class(UX.id_native, Do_1.id_class(xd_32, "_side")).id_class(UX.id_volatile, Do_1.id_class(xd_32, "_side"));
    }

    public static Do_1 id_private(xd_3 xd_32) {
        return Do_1.id_byte(UX.id_else, Do_1.id_throw(xd_32));
    }

    public static Do_1 id_private(rqO_2 rqO_22) {
        return new Do_1().id_class(UX.id_long, rqO_22);
    }

    public static Do_1 id_final(xd_3 xd_32) {
        rqO_2 rqO_22 = Do_1.id_throw(xd_32);
        return new Do_1().id_class(UX.id_continue, rqO_22).id_class(UX.id_implements, rqO_22).id_class(UX.id_case, Do_1.id_class(xd_32, "_top")).id_class(UX.id_throws, Do_1.id_class(xd_32, "_bottom"));
    }

    public static Do_1 id_volatile(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_implements, Do_1.id_class(xd_32, "_side")).id_class(UX.id_case, Do_1.id_class(xd_32, "_top")).id_class(UX.id_throws, Do_1.id_class(xd_32, "_bottom"));
    }

    public static Do_1 id_synchronized(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_implements, Do_1.id_class(xd_32, "_side")).id_class(UX.id_catch, Do_1.id_class(xd_32, "_front")).id_class(UX.id_private, Do_1.id_class(xd_32, "_back"));
    }

    public static Do_1 id_native(xd_3 xd_32) {
        return new Do_1().id_class(UX.id_implements, Do_1.id_throw(xd_32)).id_class(UX.id_protected, Do_1.id_class(xd_32, "_top"));
    }
}

