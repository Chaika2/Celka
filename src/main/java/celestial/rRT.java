/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjt_3;
import celestial.rjw_3;
import celestial.roE_2;
import celestial.xc_3;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface rRT
extends rRq_1 {
    default public Stream<rjC_2> id_byte(an_3 an_32, rfl_3 rfl_32, Predicate<an_3> predicate) {
        return Stream.concat(this.id_byte(an_32, rfl_32), this.id_class(an_32, rfl_32, predicate));
    }

    public rRq_1 id_byte(int var1, int var2);

    default public Stream<rjC_2> id_byte(an_3 an_32, rfl_3 rfl_32) {
        return StreamSupport.stream(new rjt_3(this, an_32, rfl_32), false);
    }

    default public boolean id_class(an_3 an_32, rfl_3 rfl_32, BiPredicate<xc_3, rfH_2> biPredicate) {
        return this.id_break(an_32, rfl_32, biPredicate).allMatch(rjC_2::id_break);
    }

    public Stream<rjC_2> id_class(an_3 var1, rfl_3 var2, Predicate<an_3> var3);

    default public boolean id_class(an_3 an_32, rjC_2 rjC_22) {
        return true;
    }

    default public boolean id_class(xc_3 xc_32, rfH_2 rfH_22, rjm_3 rjm_32) {
        rjC_2 rjC_22 = xc_32.id_break((rRq_1)this, rfH_22, rjm_32);
        return rjC_22.id_break() || this.id_class((an_3)null, rjC_22.id_class(rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_()));
    }

    default public Stream<rjC_2> id_break(an_3 an_32, rfl_3 rfl_32, BiPredicate<xc_3, rfH_2> biPredicate) {
        return StreamSupport.stream(new rjt_3(this, an_32, rfl_32, biPredicate), false);
    }

    default public boolean id_break(rfl_3 rfl_32) {
        return this.a_(null, rfl_32, an_32 -> true);
    }

    default public boolean id_break(an_3 an_33, rfl_3 rfl_32) {
        return this.id_byte(an_33, rfl_32, an_32 -> true).allMatch(rjC_2::id_break);
    }

    default public boolean id_throws(an_3 an_33) {
        return this.a_(an_33, an_33.rN(), an_32 -> true);
    }

    public roE_2 id_instanceof();

    default public boolean id_protected(an_3 an_32) {
        return this.id_class(an_32, rjw_3.id_class(an_32.rN()));
    }

    default public boolean a_(an_3 an_32, rfl_3 rfl_32, Predicate<an_3> predicate) {
        return this.id_byte(an_32, rfl_32, predicate).allMatch(rjC_2::id_break);
    }

    default public boolean a_(an_3 an_33, rfl_3 rfl_32) {
        return this.a_(an_33, rfl_32, an_32 -> true);
    }
}

