/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rRT;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rfl_3;
import celestial.rjC_2;
import celestial.roC_2;
import celestial.roE_2;
import celestial.roX_2;
import celestial.ron_3;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xu_3;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class rRU
implements rRT,
rRq_1 {
    protected final int id_class;
    protected final int id_break;
    protected final roC_2[][] id_byte;
    protected boolean id_protected;
    protected final rYB id_throws;

    @Override
    public rRq_1 id_byte(int n, int n2) {
        return this.id_class(n, n2);
    }

    @Override
    public Stream<rjC_2> id_byte(an_3 an_32, rfl_3 rfl_32, Predicate<an_3> predicate) {
        return this.id_byte(an_32, rfl_32);
    }

    @Override
    public xc_3 id_byte(rfH_2 rfH_22) {
        if (rYB.id_super(rfH_22)) {
            return xu_3.id_class.id_continue();
        }
        roC_2 roC_22 = this.id_protected(rfH_22);
        return roC_22.id_byte(rfH_22);
    }

    public rRU(rYB rYB2, rfH_2 rfH_22, rfH_2 rfH_23) {
        int n;
        int n2;
        this.id_throws = rYB2;
        this.id_class = rfH_22.b_() >> 4;
        this.id_break = rfH_22.d_() >> 4;
        int n3 = rfH_23.b_() >> 4;
        int n4 = rfH_23.d_() >> 4;
        this.id_byte = new roC_2[n3 - this.id_class + 1][n4 - this.id_break + 1];
        roX_2 roX_22 = rYB2.id_goto();
        this.id_protected = true;
        for (n2 = this.id_class; n2 <= n3; ++n2) {
            for (n = this.id_break; n <= n4; ++n) {
                this.id_byte[n2 - this.id_class][n - this.id_break] = roX_22.id_protected(n2, n);
            }
        }
        for (n2 = rfH_22.b_() >> 4; n2 <= rfH_23.b_() >> 4; ++n2) {
            for (n = rfH_22.d_() >> 4; n <= rfH_23.d_() >> 4; ++n) {
                roC_2 roC_22 = this.id_byte[n2 - this.id_class][n - this.id_break];
                if (roC_22 == null || roC_22.id_class(rfH_22.c_(), rfH_23.c_())) continue;
                this.id_protected = false;
                return;
            }
        }
    }

    @Override
    public Stream<rjC_2> id_class(an_3 an_32, rfl_3 rfl_32, Predicate<an_3> predicate) {
        return Stream.empty();
    }

    @Override
    public ryO_2 id_class(rfH_2 rfH_22) {
        roC_2 roC_22 = this.id_protected(rfH_22);
        return roC_22.id_class(rfH_22);
    }

    private roC_2 id_class(int n, int n2) {
        int n3 = n - this.id_class;
        int n4 = n2 - this.id_break;
        if (n3 >= 0 && n3 < this.id_byte.length && n4 >= 0 && n4 < this.id_byte[n3].length) {
            roC_2 roC_22 = this.id_byte[n3][n4];
            return roC_22 != null ? roC_22 : new ron_3(this.id_throws, new rfj_3(n, n2));
        }
        return new ron_3(this.id_throws, new rfj_3(n, n2));
    }

    @Override
    public rXE id_break(rfH_2 rfH_22) {
        if (rYB.id_super(rfH_22)) {
            return rXG.id_class.id_private();
        }
        roC_2 roC_22 = this.id_protected(rfH_22);
        return roC_22.id_break(rfH_22);
    }

    @Override
    public roE_2 id_instanceof() {
        return this.id_throws.id_instanceof();
    }

    private roC_2 id_protected(rfH_2 rfH_22) {
        return this.id_class(rfH_22.b_() >> 4, rfH_22.d_() >> 4);
    }
}

