/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import celestial.an_3;
import celestial.rfU_2;
import celestial.wN_2;
import com.google.common.collect.ImmutableList;

public class wJ_2<T extends an_3>
extends wN_2<T> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;
    private final Iq_1 id_case;
    private final Iq_1 id_catch;
    private final Iq_1 id_private;
    private final Iq_1 id_implements;
    private final Iq_1 id_finally;
    private final Iq_1 id_extends;
    private final Iq_1 id_native;
    private final Iq_1 id_volatile;

    public wJ_2() {
        this.id_return = 32;
        this.id_public = 32;
        int n = 22;
        this.id_class = new Iq_1(this, 0, 0);
        this.id_class.id_class(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f);
        this.id_class.id_class(0.0f, 22.0f, 0.0f);
        this.id_break = new Iq_1(this, 24, 0);
        this.id_break.id_class(-2.0f, 0.0f, -1.0f, 2.0f, 1.0f, 2.0f);
        this.id_break.id_class(-4.0f, 15.0f, -2.0f);
        this.id_byte = new Iq_1(this, 24, 3);
        this.id_byte.id_class(0.0f, 0.0f, -1.0f, 2.0f, 1.0f, 2.0f);
        this.id_byte.id_class(4.0f, 15.0f, -2.0f);
        this.id_protected = new Iq_1(this, 15, 17);
        this.id_protected.id_class(-4.0f, -1.0f, 0.0f, 8.0f, 1.0f, 0.0f);
        this.id_protected.id_class(0.0f, 14.0f, -4.0f);
        this.id_protected.id_case = 0.7853982f;
        this.id_throws = new Iq_1(this, 14, 16);
        this.id_throws.id_class(-4.0f, -1.0f, 0.0f, 8.0f, 1.0f, 1.0f);
        this.id_throws.id_class(0.0f, 14.0f, 0.0f);
        this.id_case = new Iq_1(this, 23, 18);
        this.id_case.id_class(-4.0f, -1.0f, 0.0f, 8.0f, 1.0f, 0.0f);
        this.id_case.id_class(0.0f, 14.0f, 4.0f);
        this.id_case.id_case = -0.7853982f;
        this.id_catch = new Iq_1(this, 5, 17);
        this.id_catch.id_class(-1.0f, -8.0f, 0.0f, 1.0f, 8.0f, 0.0f);
        this.id_catch.id_class(-4.0f, 22.0f, -4.0f);
        this.id_catch.id_catch = -0.7853982f;
        this.id_private = new Iq_1(this, 1, 17);
        this.id_private.id_class(0.0f, -8.0f, 0.0f, 1.0f, 8.0f, 0.0f);
        this.id_private.id_class(4.0f, 22.0f, -4.0f);
        this.id_private.id_catch = 0.7853982f;
        this.id_implements = new Iq_1(this, 15, 20);
        this.id_implements.id_class(-4.0f, 0.0f, 0.0f, 8.0f, 1.0f, 0.0f);
        this.id_implements.id_class(0.0f, 22.0f, -4.0f);
        this.id_implements.id_case = -0.7853982f;
        this.id_extends = new Iq_1(this, 15, 20);
        this.id_extends.id_class(-4.0f, 0.0f, 0.0f, 8.0f, 1.0f, 0.0f);
        this.id_extends.id_class(0.0f, 22.0f, 0.0f);
        this.id_finally = new Iq_1(this, 15, 20);
        this.id_finally.id_class(-4.0f, 0.0f, 0.0f, 8.0f, 1.0f, 0.0f);
        this.id_finally.id_class(0.0f, 22.0f, 4.0f);
        this.id_finally.id_case = 0.7853982f;
        this.id_native = new Iq_1(this, 9, 17);
        this.id_native.id_class(-1.0f, -8.0f, 0.0f, 1.0f, 8.0f, 0.0f);
        this.id_native.id_class(-4.0f, 22.0f, 4.0f);
        this.id_native.id_catch = 0.7853982f;
        this.id_volatile = new Iq_1(this, 9, 17);
        this.id_volatile.id_class(0.0f, -8.0f, 0.0f, 1.0f, 8.0f, 0.0f);
        this.id_volatile.id_class(4.0f, 22.0f, 4.0f);
        this.id_volatile.id_catch = -0.7853982f;
    }

    @Override
    public Iterable<Iq_1> id_class() {
        return ImmutableList.of((Object)this.id_class, (Object)this.id_break, (Object)this.id_byte, (Object)this.id_protected, (Object)this.id_throws, (Object)this.id_case, (Object)this.id_catch, (Object)this.id_private, (Object)this.id_implements, (Object)this.id_extends, (Object)this.id_finally, (Object)this.id_native, (Object[])new Iq_1[]{this.id_volatile});
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        this.id_break.id_private = -0.2f + 0.4f * rfU_2.id_class(f3 * 0.2f);
        this.id_byte.id_private = 0.2f - 0.4f * rfU_2.id_class(f3 * 0.2f);
    }
}

