/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.rCZ;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

public class rCm_1
extends rCZ<Integer> {
    private final ImmutableSet<Integer> id_class;

    protected rCm_1(String string, int n, int n2) {
        super(string, Integer.class);
        if (n < 0) {
            throw new IllegalArgumentException("Min value of " + string + " must be 0 or greater");
        }
        if (n2 <= n) {
            throw new IllegalArgumentException("Max value of " + string + " must be greater than min (" + n + ")");
        }
        HashSet hashSet = Sets.newHashSet();
        for (int i = n; i <= n2; ++i) {
            hashSet.add(i);
        }
        this.id_class = ImmutableSet.copyOf((Collection)hashSet);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof rCm_1 && super.equals(object)) {
            rCm_1 rCm_12 = (rCm_1)object;
            return this.id_class.equals(rCm_12.id_class);
        }
        return false;
    }

    @Override
    public String id_class(Integer n) {
        return n.toString();
    }

    public static rCm_1 id_class(String string, int n, int n2) {
        return new rCm_1(string, n, n2);
    }

    @Override
    public Collection<Integer> id_class() {
        return this.id_class;
    }

    @Override
    public int id_break() {
        return 31 * super.id_break() + this.id_class.hashCode();
    }

    @Override
    public Optional<Integer> id_break(String string) {
        try {
            Integer n = Integer.valueOf(string);
            return this.id_class.contains((Object)n) ? Optional.of(n) : Optional.empty();
        }
        catch (NumberFormatException numberFormatException) {
            return Optional.empty();
        }
    }
}

