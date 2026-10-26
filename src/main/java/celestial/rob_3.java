/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.rjC_2;
import celestial.rjN_2;
import celestial.rjw_3;
import celestial.roB_2;
import celestial.roE_2;
import celestial.roG_2;
import celestial.roO_2;
import celestial.rqR_2;
import java.util.Objects;

public class rob_3
implements roG_2 {
    private final double id_break;
    private final double id_byte;
    private final long id_protected;
    private final long id_throws;
    private final double id_case;
    public final /* synthetic */ roE_2 id_class;

    @Override
    public double id_byte() {
        return Math.max(this.id_class.id_break() - this.id_throws() / 2.0, (double)(-this.id_class.id_implements));
    }

    public rob_3(roE_2 roE_22, double d, double d2, long l) {
        this.id_class = roE_22;
        this.id_break = d;
        this.id_byte = d2;
        this.id_case = l;
        this.id_throws = rqR_2.id_break();
        this.id_protected = this.id_throws + l;
    }

    @Override
    public double id_class() {
        return Math.max(this.id_class.id_class() - this.id_throws() / 2.0, (double)(-this.id_class.id_implements));
    }

    @Override
    public double id_break() {
        return Math.min(this.id_class.id_class() + this.id_throws() / 2.0, (double)this.id_class.id_implements);
    }

    @Override
    public double id_throws() {
        double d = (double)(rqR_2.id_break() - this.id_throws) / this.id_case;
        return d < 1.0 ? rfU_2.id_protected(d, this.id_break, this.id_byte) : this.id_byte;
    }

    @Override
    public void id_finally() {
    }

    @Override
    public long id_catch() {
        return this.id_protected - rqR_2.id_break();
    }

    @Override
    public void id_extends() {
    }

    @Override
    public double id_case() {
        return Math.abs(this.id_break - this.id_byte) / (double)(this.id_protected - this.id_throws);
    }

    @Override
    public roB_2 id_implements() {
        return this.id_byte < this.id_break ? roB_2.SHRINKING : roB_2.GROWING;
    }

    @Override
    public double id_protected() {
        return Math.min(this.id_class.id_break() + this.id_throws() / 2.0, (double)this.id_class.id_implements);
    }

    @Override
    public double id_private() {
        return this.id_byte;
    }

    @Override
    public rjC_2 id_volatile() {
        return rjw_3.id_class(rjw_3.id_class, rjw_3.id_class(Math.floor(this.id_class()), Double.NEGATIVE_INFINITY, Math.floor(this.id_byte()), Math.ceil(this.id_break()), Double.POSITIVE_INFINITY, Math.ceil(this.id_protected())), rjN_2.id_throws);
    }

    @Override
    public roG_2 id_native() {
        roG_2 roG_22;
        if (this.id_catch() <= 0L) {
            roE_2 roE_22 = this.id_class;
            Objects.requireNonNull(roE_22);
            roG_22 = new roO_2(roE_22, this.id_byte);
        } else {
            roG_22 = this;
        }
        return roG_22;
    }
}

