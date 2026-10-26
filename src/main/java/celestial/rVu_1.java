/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  javax.annotation.Nonnull
 */
package celestial;

import celestial.rVC;
import celestial.rVL;
import celestial.rqM_2;
import celestial.rqO_2;
import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import java.util.Random;
import javax.annotation.Nonnull;

public class rVu_1<T>
extends rVC<T> {
    private final rqO_2 rX;
    private T rJ;

    public rVu_1(String string, rqM_2<? extends rVL<T>> rqM_22, Lifecycle lifecycle) {
        super(rqM_22, lifecycle);
        this.rX = new rqO_2(string);
    }

    @Override
    @Nonnull
    public T id_class(rqO_2 rqO_22) {
        Object t = super.id_class(rqO_22);
        return t == null ? this.rJ : t;
    }

    @Override
    @Nonnull
    public T id_class(int n) {
        Object t = super.id_class(n);
        return t == null ? this.rJ : t;
    }

    @Override
    @Nonnull
    public T id_class(Random random) {
        Object t = super.id_class(random);
        return t == null ? this.rJ : t;
    }

    public rqO_2 id_class() {
        return this.rX;
    }

    @Override
    public <V extends T> V id_class(int n, rqM_2<T> rqM_22, V v, Lifecycle lifecycle) {
        if (this.rX.equals(rqM_22.id_class())) {
            this.rJ = v;
        }
        return super.id_class(n, rqM_22, v, lifecycle);
    }

    @Override
    public int id_class(T t) {
        int n = super.id_class(t);
        return n == -1 ? super.id_class(this.rJ) : n;
    }

    @Override
    @Nonnull
    public rqO_2 id_break(T t) {
        rqO_2 rqO_22 = super.id_break(t);
        return rqO_22 == null ? this.rX : rqO_22;
    }

    @Override
    public Optional<T> id_break(rqO_2 rqO_22) {
        return Optional.ofNullable(super.id_class(rqO_22));
    }
}

