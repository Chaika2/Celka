/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_return;
import celestial.PE;
import celestial.PX;
import celestial.QY;
import celestial.Wg_1;
import celestial.an_3;
import celestial.cb_3;
import celestial.gm_3;
import celestial.rU_2;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjU_2;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface Ps_1 {
    public rjG_2 id_byte();

    default public boolean id_class(rfH_2 rfH_22) {
        return this.id_class().equals(Optional.of(rfH_22));
    }

    @Deprecated
    public static double id_class(boolean bl) {
        return bl ? 1.27 : 1.62;
    }

    default public Optional<rfH_2> id_class() {
        rjG_2 rjG_22 = this.id_byte();
        if (rjG_22 != null && rjG_22.id_byte() == rjM_2.BLOCK) {
            return Optional.of(((rff_3)rjG_22).id_class());
        }
        return Optional.empty();
    }

    default public rjU_2 id_break() {
        return new rjU_2(this.id_catch().Ps().id_break, this.id_catch().Ps().id_byte, this.id_catch().Ps().id_protected);
    }

    public QY id_throws();

    default public rjU_2 id_finally() {
        return new rjU_2(this.id_catch().Ps().id_break, this.id_catch().Ps().id_byte + (double)this.id_catch().Bx(), this.id_catch().Ps().id_protected);
    }

    public cb_3 id_catch();

    default public rfH_2 id_extends() {
        return new rfH_2(this.id_catch().Ps().id_break, this.id_catch().Ps().id_byte + (double)this.id_catch().Bx(), this.id_catch().Ps().id_protected);
    }

    public rYB id_case();

    default public Stream<an_3> id_implements() {
        return StreamSupport.stream(this.id_final().spliterator(), false);
    }

    public C_return id_package();

    default public PX id_protected() {
        return new PX(((Float)this.id_catch().id_throws[15]).floatValue(), ((Float)this.id_catch().id_throws[16]).floatValue());
    }

    default public rjU_2 id_private() {
        return new rjU_2(this.id_catch().Ps().id_break, this.id_catch().Ps().id_byte + (double)(this.id_catch().Bx() / 2.0f), this.id_catch().Ps().id_protected);
    }

    default public Iterable<an_3> id_final() {
        return ((gm_3)this.id_case()).id_byte();
    }

    default public rU_2 id_volatile() {
        rU_2 rU_22 = new rU_2(this.id_catch().Ps().id_break, this.id_catch().Ps().id_byte + 0.1251, this.id_catch().Ps().id_protected);
        try {
            if (this.id_case().id_byte(rU_22).id_break() instanceof Wg_1) {
                return rU_22.id_class();
            }
        }
        catch (NullPointerException nullPointerException) {
            // empty catch block
        }
        return rU_22;
    }

    public PE id_native();
}

