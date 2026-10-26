/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 */
package celestial;

import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqR_2;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class rpb_3
extends Enum<rpb_3>
implements Iterable<rpr_3>,
Predicate<rpr_3> {
    public static final /* enum */ rpb_3 HORIZONTAL = new rpb_3(new rpr_3[]{rpr_3.NORTH, rpr_3.EAST, rpr_3.SOUTH, rpr_3.WEST}, new rpB_2[]{rpB_2.X, rpB_2.Z});
    public static final /* enum */ rpb_3 VERTICAL = new rpb_3(new rpr_3[]{rpr_3.UP, rpr_3.DOWN}, new rpB_2[]{rpB_2.Y});
    private final rpr_3[] facingValues;
    private final rpB_2[] axisValues;
    private static final /* synthetic */ rpb_3[] $VALUES;

    private rpb_3(rpr_3[] rpr_3Array, rpB_2[] rpB_2Array) {
        this.facingValues = rpr_3Array;
        this.axisValues = rpB_2Array;
    }

    static {
        $VALUES = rpb_3.id_break();
    }

    public static rpb_3[] values() {
        return (rpb_3[])$VALUES.clone();
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rpr_3)object);
    }

    public static rpb_3 valueOf(String string) {
        return Enum.valueOf(rpb_3.class, string);
    }

    @Override
    public Iterator<rpr_3> iterator() {
        return Iterators.forArray((Object[])this.facingValues);
    }

    public Stream<rpr_3> id_class() {
        return Arrays.stream(this.facingValues);
    }

    public boolean id_class(rpr_3 rpr_32) {
        return rpr_32 != null && rpr_32.id_final().id_throws() == this;
    }

    public rpr_3 id_class(Random random) {
        return rqR_2.id_class(this.facingValues, random);
    }

    private static /* synthetic */ rpb_3[] id_break() {
        return new rpb_3[]{HORIZONTAL, VERTICAL};
    }

    public rpB_2 id_break(Random random) {
        return rqR_2.id_class(this.axisValues, random);
    }
}

