/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.HU;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.an_3;
import celestial.iB_2;
import celestial.rXQ;
import celestial.rpZ_2;
import celestial.rruP;
import celestial.tW_2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class wh_3<T extends iB_2>
extends tW_2<T>
implements rruP {
    private List<Iq_1> id_native = Lists.newArrayList();
    public final Iq_1 id_new;
    public final Iq_1 id_continue;
    public final Iq_1 id_super;
    public final Iq_1 id_this;
    public final Iq_1 id_else;
    private final Iq_1 id_volatile;
    private final Iq_1 id_goto;
    private final boolean id_while;

    public wh_3(float f, boolean bl) {
        super(HU::id_private, f, 0.0f, 64, 64);
        this.id_while = bl;
        this.id_goto = new Iq_1(this, 24, 0);
        this.id_goto.id_class(-3.0f, -6.0f, -1.0f, 6.0f, 6.0f, 1.0f, f);
        this.id_volatile = new Iq_1(this, 0, 0);
        this.id_volatile.id_break(64, 32);
        this.id_volatile.id_class(-5.0f, 0.0f, -1.0f, 10.0f, 16.0f, 1.0f, f);
        if (bl) {
            this.id_throws = new Iq_1(this, 32, 48);
            this.id_throws.id_class(-1.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, f);
            this.id_throws.id_class(5.0f, 2.5f, 0.0f);
            this.id_protected = new Iq_1(this, 40, 16);
            this.id_protected.id_class(-2.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, f);
            this.id_protected.id_class(-5.0f, 2.5f, 0.0f);
            this.id_new = new Iq_1(this, 48, 48);
            this.id_new.id_class(-1.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, f + 0.25f);
            this.id_new.id_class(5.0f, 2.5f, 0.0f);
            this.id_continue = new Iq_1(this, 40, 32);
            this.id_continue.id_class(-2.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, f + 0.25f);
            this.id_continue.id_class(-5.0f, 2.5f, 10.0f);
        } else {
            this.id_throws = new Iq_1(this, 32, 48);
            this.id_throws.id_class(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
            this.id_throws.id_class(5.0f, 2.0f, 0.0f);
            this.id_new = new Iq_1(this, 48, 48);
            this.id_new.id_class(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, f + 0.25f);
            this.id_new.id_class(5.0f, 2.0f, 0.0f);
            this.id_continue = new Iq_1(this, 40, 32);
            this.id_continue.id_class(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, f + 0.25f);
            this.id_continue.id_class(-5.0f, 2.0f, 10.0f);
        }
        this.id_catch = new Iq_1(this, 16, 48);
        this.id_catch.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, f);
        this.id_catch.id_class(1.9f, 12.0f, 0.0f);
        this.id_super = new Iq_1(this, 0, 48);
        this.id_super.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, f + 0.25f);
        this.id_super.id_class(1.9f, 12.0f, 0.0f);
        this.id_this = new Iq_1(this, 0, 32);
        this.id_this.id_class(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, f + 0.25f);
        this.id_this.id_class(-1.9f, 12.0f, 0.0f);
        this.id_else = new Iq_1(this, 16, 32);
        this.id_else.id_class(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, f + 0.25f);
        this.id_else.id_class(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        super.id_class(t, f, f2, f3, f4, f5);
        this.id_super.id_class(this.id_catch);
        this.id_this.id_class(this.id_case);
        this.id_new.id_class(this.id_throws);
        this.id_continue.id_class(this.id_protected);
        this.id_else.id_class(this.id_byte);
        if (((iB_2)t).id_class(rXQ.CHEST).id_class()) {
            if (((an_3)t).x()) {
                this.id_volatile.id_throws = 1.4f;
                this.id_volatile.id_protected = 1.85f;
            } else {
                this.id_volatile.id_throws = 0.0f;
                this.id_volatile.id_protected = 0.0f;
            }
        } else if (((an_3)t).x()) {
            this.id_volatile.id_throws = 0.3f;
            this.id_volatile.id_protected = 0.8f;
        } else {
            this.id_volatile.id_throws = -1.1f;
            this.id_volatile.id_protected = -0.85f;
        }
    }

    @Override
    public void id_class(rpZ_2 rpZ_22, Ml_1 ml_1) {
        Iq_1 iq_1 = this.id_class(rpZ_22);
        if (this.id_while) {
            float f = 0.5f * (float)(rpZ_22 == rpZ_2.RIGHT ? 1 : -1);
            iq_1.id_byte += f;
            iq_1.id_class(ml_1);
            iq_1.id_byte -= f;
        } else {
            iq_1.id_class(ml_1);
        }
    }

    public Iq_1 id_class(Random random) {
        return this.id_native.get(random.nextInt(this.id_native.size()));
    }

    public void id_class(Ml_1 ml_1, Ok_1 ok_1, int n, int n2) {
        this.id_goto.id_class(this.id_class);
        this.id_goto.id_byte = 0.0f;
        this.id_goto.id_protected = 0.0f;
        this.id_goto.id_class(ml_1, ok_1, n, n2);
    }

    @Override
    public /* synthetic */ void accept(Object object) {
        this.a_((Iq_1)object);
    }

    public void id_break(Ml_1 ml_1, Ok_1 ok_1, int n, int n2) {
        this.id_volatile.id_class(ml_1, ok_1, n, n2);
    }

    @Override
    protected Iterable<Iq_1> id_break() {
        return Iterables.concat(super.id_break(), (Iterable)ImmutableList.of((Object)this.id_super, (Object)this.id_this, (Object)this.id_new, (Object)this.id_continue, (Object)this.id_else));
    }

    @Override
    public Iq_1 id_protected() {
        return this.id_volatile;
    }

    @Override
    public void a_(Iq_1 iq_1) {
        if (this.id_native == null) {
            this.id_native = Lists.newArrayList();
        }
        this.id_native.add(iq_1);
    }

    @Override
    public void b_(boolean bl) {
        super.b_(bl);
        this.id_new.id_finally = bl;
        this.id_continue.id_finally = bl;
        this.id_super.id_finally = bl;
        this.id_this.id_finally = bl;
        this.id_else.id_finally = bl;
        this.id_volatile.id_finally = bl;
        this.id_goto.id_finally = bl;
    }
}

