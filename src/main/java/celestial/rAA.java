/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.rAC;
import celestial.rAF;
import celestial.rAL;
import celestial.rqO_2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class rAA
extends Enum<rAA>
implements rAL {
    public static final /* enum */ rAA INSTANCE = new rAA();
    private static final /* synthetic */ rAA[] $VALUES;

    private static /* synthetic */ rAA[] id_byte() {
        return new rAA[]{INSTANCE};
    }

    @Override
    public List<rAF> id_byte(rqO_2 rqO_22) {
        return ImmutableList.of();
    }

    static {
        $VALUES = rAA.id_byte();
    }

    public static rAA[] values() {
        return (rAA[])$VALUES.clone();
    }

    public static rAA valueOf(String string) {
        return Enum.valueOf(rAA.class, string);
    }

    @Override
    public rAF id_class(rqO_2 rqO_22) throws IOException {
        throw new FileNotFoundException(rqO_22.toString());
    }

    @Override
    public Collection<rqO_2> id_class(String string, Predicate<String> predicate) {
        return ImmutableSet.of();
    }

    @Override
    public Set<String> id_class() {
        return ImmutableSet.of();
    }

    @Override
    public boolean id_break(rqO_2 rqO_22) {
        return false;
    }

    @Override
    public Stream<rAC> id_break() {
        return Stream.of(new rAC[0]);
    }
}

