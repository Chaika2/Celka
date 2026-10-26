/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.rVL;
import celestial.rYG;
import celestial.rYl_1;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rqR_2;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;

public final class rhi_3 {
    public static final rhi_3 id_class = rhi_3.id_class("desert");
    public static final rhi_3 id_break = rhi_3.id_class("jungle");
    public static final rhi_3 id_byte = rhi_3.id_class("plains");
    public static final rhi_3 id_protected = rhi_3.id_class("savanna");
    public static final rhi_3 id_throws = rhi_3.id_class("snow");
    public static final rhi_3 id_case = rhi_3.id_class("swamp");
    public static final rhi_3 id_catch = rhi_3.id_class("taiga");
    private final String id_private;
    private static final Map<rqM_2<rYG>, rhi_3> id_implements = rqR_2.id_class(Maps.newHashMap(), hashMap -> {
        hashMap.put(rYl_1.id_short, id_class);
        hashMap.put(rYl_1.id_const, id_class);
        hashMap.put(rYl_1.id_byte, id_class);
        hashMap.put(rYl_1.id_continue, id_class);
        hashMap.put(rYl_1.b, id_class);
        hashMap.put(rYl_1.v, id_class);
        hashMap.put(rYl_1.L, id_class);
        hashMap.put(rYl_1.F, id_class);
        hashMap.put(rYl_1.id_default, id_class);
        hashMap.put(rYl_1.A, id_break);
        hashMap.put(rYl_1.n, id_break);
        hashMap.put(rYl_1.id_synchronized, id_break);
        hashMap.put(rYl_1.id_public, id_break);
        hashMap.put(rYl_1.id_return, id_break);
        hashMap.put(rYl_1.x, id_break);
        hashMap.put(rYl_1.d, id_break);
        hashMap.put(rYl_1.id_import, id_protected);
        hashMap.put(rYl_1.id_static, id_protected);
        hashMap.put(rYl_1.m, id_protected);
        hashMap.put(rYl_1.Z, id_protected);
        hashMap.put(rYl_1.s, id_throws);
        hashMap.put(rYl_1.id_extends, id_throws);
        hashMap.put(rYl_1.id_native, id_throws);
        hashMap.put(rYl_1.J, id_throws);
        hashMap.put(rYl_1.id_try, id_throws);
        hashMap.put(rYl_1.id_final, id_throws);
        hashMap.put(rYl_1.id_char, id_throws);
        hashMap.put(rYl_1.id_abstract, id_throws);
        hashMap.put(rYl_1.Q, id_throws);
        hashMap.put(rYl_1.id_volatile, id_throws);
        hashMap.put(rYl_1.id_catch, id_case);
        hashMap.put(rYl_1.X, id_case);
        hashMap.put(rYl_1.N, id_catch);
        hashMap.put(rYl_1.c, id_catch);
        hashMap.put(rYl_1.id_long, id_catch);
        hashMap.put(rYl_1.id_float, id_catch);
        hashMap.put(rYl_1.M, id_catch);
        hashMap.put(rYl_1.u, id_catch);
        hashMap.put(rYl_1.id_else, id_catch);
        hashMap.put(rYl_1.id_protected, id_catch);
        hashMap.put(rYl_1.id_case, id_catch);
        hashMap.put(rYl_1.id_this, id_catch);
        hashMap.put(rYl_1.h, id_catch);
        hashMap.put(rYl_1.id_void, id_catch);
    });

    private rhi_3(String string) {
        this.id_private = string;
    }

    public String toString() {
        return this.id_private;
    }

    public static rhi_3 id_class(Optional<rqM_2<rYG>> optional) {
        return optional.flatMap(rqM_22 -> Optional.ofNullable(id_implements.get(rqM_22))).orElse(id_byte);
    }

    private static rhi_3 id_class(String string) {
        return rVL.id_class(rVL.X, new rqO_2(string), new rhi_3(string));
    }
}

