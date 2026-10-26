/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rRT;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rfR_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rjC_2;
import celestial.rjN_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.roE_2;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Objects;
import java.util.Spliterators;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class rjt_3
extends Spliterators.AbstractSpliterator<rjC_2> {
    private final an_3 id_class;
    private final rfl_3 id_break;
    private final rjm_3 id_byte;
    private final rfR_2 id_protected;
    private final rfw_3 id_throws;
    private final rjC_2 id_case;
    private final rRT id_catch;
    private boolean id_private;
    private final BiPredicate<xc_3, rfH_2> id_implements;

    public rjt_3(rRT rRT2, an_3 an_32, rfl_3 rfl_32) {
        this(rRT2, an_32, rfl_32, (xc_32, rfH_22) -> true);
    }

    public rjt_3(rRT rRT2, an_3 an_32, rfl_3 rfl_32, BiPredicate<xc_3, rfH_2> biPredicate) {
        super(Long.MAX_VALUE, 1280);
        this.id_byte = an_32 == null ? rjm_3.id_break() : rjm_3.id_class(an_32);
        this.id_throws = new rfw_3();
        this.id_case = rjw_3.id_class(rfl_32);
        this.id_catch = rRT2;
        this.id_private = an_32 != null;
        this.id_class = an_32;
        this.id_break = rfl_32;
        this.id_implements = biPredicate;
        int n = rfU_2.id_byte(rfl_32.id_class - 1.0E-7) - 1;
        int n2 = rfU_2.id_byte(rfl_32.id_protected + 1.0E-7) + 1;
        int n3 = rfU_2.id_byte(rfl_32.id_break - 1.0E-7) - 1;
        int n4 = rfU_2.id_byte(rfl_32.id_throws + 1.0E-7) + 1;
        int n5 = rfU_2.id_byte(rfl_32.id_byte - 1.0E-7) - 1;
        int n6 = rfU_2.id_byte(rfl_32.id_case + 1.0E-7) + 1;
        this.id_protected = new rfR_2(n, n3, n5, n2, n4, n6);
    }

    private static boolean id_class(rjC_2 rjC_22, rfl_3 rfl_32) {
        return rjw_3.id_byte(rjC_22, rjw_3.id_class(rfl_32.id_class(1.0E-7)), rjN_2.id_implements);
    }

    public static boolean id_class(roE_2 roE_22, rfl_3 rfl_32) {
        double d = rfU_2.id_byte(roE_22.id_throws());
        double d2 = rfU_2.id_byte(roE_22.id_case());
        double d3 = rfU_2.id_throws(roE_22.id_catch());
        double d4 = rfU_2.id_throws(roE_22.id_private());
        return rfl_32.id_class > d && rfl_32.id_class < d3 && rfl_32.id_byte > d2 && rfl_32.id_byte < d4 && rfl_32.id_protected > d && rfl_32.id_protected < d3 && rfl_32.id_case > d2 && rfl_32.id_case < d4;
    }

    private rRq_1 id_class(int n, int n2) {
        int n3 = n >> 4;
        int n4 = n2 >> 4;
        return this.id_catch.id_byte(n3, n4);
    }

    public boolean id_class(Consumer<? super rjC_2> consumer) {
        while (this.id_protected.id_class()) {
            rRq_1 rRq_12;
            int n = this.id_protected.id_break();
            int n2 = this.id_protected.id_byte();
            int n3 = this.id_protected.id_protected();
            int n4 = this.id_protected.id_throws();
            if (n4 == 3 || (rRq_12 = this.id_class(n, n3)) == null) continue;
            this.id_throws.id_class(n, n2, n3);
            xc_3 xc_32 = rRq_12.id_byte(this.id_throws);
            if (!this.id_implements.test(xc_32, this.id_throws) || n4 == 1 && !xc_32.id_protected() || n4 == 2 && !xc_32.id_class(xu_3.rc)) continue;
            rjC_2 rjC_22 = xc_32.id_break((rRq_1)this.id_catch, (rfH_2)this.id_throws, this.id_byte);
            if (rjC_22 == rjw_3.id_break()) {
                if (!this.id_break.id_class(n, n2, n3, (double)n + 1.0, (double)n2 + 1.0, (double)n3 + 1.0)) continue;
                consumer.accept(rjC_22.id_class(n, (double)n2, (double)n3));
                return true;
            }
            rjC_2 rjC_23 = rjC_22.id_class(n, (double)n2, (double)n3);
            if (!rjw_3.id_byte(rjC_23, this.id_case, rjN_2.id_implements)) continue;
            consumer.accept(rjC_23);
            return true;
        }
        return false;
    }

    public boolean id_break(Consumer<? super rjC_2> consumer) {
        rjC_2 rjC_22;
        Objects.requireNonNull(this.id_class);
        this.id_private = false;
        roE_2 roE_22 = this.id_catch.id_instanceof();
        rfl_3 rfl_32 = this.id_class.rN();
        if (!rjt_3.id_class(roE_22, rfl_32) && !rjt_3.id_break(rjC_22 = roE_22.id_byte(), rfl_32) && rjt_3.id_class(rjC_22, rfl_32)) {
            consumer.accept(rjC_22);
            return true;
        }
        return false;
    }

    private static boolean id_break(rjC_2 rjC_22, rfl_3 rfl_32) {
        return rjw_3.id_byte(rjC_22, rjw_3.id_class(rfl_32.id_break(1.0E-7)), rjN_2.id_implements);
    }

    @Override
    public boolean tryAdvance(Consumer<? super rjC_2> consumer) {
        return this.id_private && this.id_break(consumer) || this.id_class(consumer);
    }
}

