/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcZ_2;
import java.util.AbstractList;

public abstract class rcx_3<T extends rcZ_2>
extends AbstractList<T>
implements rcZ_2 {
    public abstract T id_byte(int var1);

    public abstract void id_byte(int var1, T var2);

    @Override
    public /* synthetic */ Object remove(int n) {
        return this.id_byte(n);
    }

    @Override
    public /* synthetic */ void add(int n, Object object) {
        this.id_byte(n, (rcZ_2)object);
    }

    public abstract boolean id_class(int var1, rcZ_2 var2);

    @Override
    public /* synthetic */ Object set(int n, Object object) {
        return this.id_protected(n, (rcZ_2)object);
    }

    public abstract boolean id_break(int var1, rcZ_2 var2);

    public abstract byte id_throws();

    public abstract T id_protected(int var1, T var2);
}

