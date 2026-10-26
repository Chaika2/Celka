/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.rCZ;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Optional;

public class rCN
extends rCZ<Boolean> {
    private final ImmutableSet<Boolean> id_class = ImmutableSet.of((Object)true, (Object)false);

    protected rCN(String string) {
        super(string, Boolean.class);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof rCN && super.equals(object)) {
            rCN rCN2 = (rCN)object;
            return this.id_class.equals(rCN2.id_class);
        }
        return false;
    }

    @Override
    public String id_class(Boolean bl) {
        return bl.toString();
    }

    @Override
    public Collection<Boolean> id_class() {
        return this.id_class;
    }

    public static rCN id_class(String string) {
        return new rCN(string);
    }

    @Override
    public Optional<Boolean> id_break(String string) {
        return !"true".equals(string) && !"false".equals(string) ? Optional.empty() : Optional.of(Boolean.valueOf(string));
    }

    @Override
    public int id_break() {
        return 31 * super.id_break() + this.id_class.hashCode();
    }
}

