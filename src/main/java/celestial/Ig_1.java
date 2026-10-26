/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Hz_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.fj_3;
import celestial.rqO_2;
import celestial.rrbY_2;
import celestial.rrxn_3;
import java.util.Objects;
import java.util.function.Function;

public class Ig_1 {
    private final rqO_2 id_class;
    private final rqO_2 id_break;
    private HU id_byte;

    public fj_3 id_byte() {
        fj_3 fj_32 = QY.id_instanceof().id_class(this.id_class()).apply(this.id_break());
        if (rrbY_2.id_class()) {
            fj_32 = rrbY_2.id_class(fj_32);
        }
        return fj_32;
    }

    public Ig_1(rqO_2 rqO_22, rqO_2 rqO_23) {
        this.id_class = rqO_22;
        this.id_break = rqO_23;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Ig_1 ig_1 = (Ig_1)object;
            return this.id_class.equals(ig_1.id_class) && this.id_break.equals(ig_1.id_break);
        }
        return false;
    }

    public String toString() {
        return "Material{atlasLocation=" + this.id_class + ", texture=" + this.id_break + "}";
    }

    public int hashCode() {
        return Objects.hash(this.id_class, this.id_break);
    }

    public Ok_1 id_class(Hx_1 hx_1, Function<rqO_2, HU> function) {
        fj_3 fj_32 = this.id_byte();
        HU hU = this.id_class(function);
        if (fj_32.id_package && hU.id_abstract()) {
            rrxn_3.id_break();
            hU = HU.id_byte(this.id_class);
        }
        return fj_32.id_class(hx_1.getBuffer(hU));
    }

    public rqO_2 id_class() {
        return this.id_class;
    }

    public Ok_1 id_class(Hx_1 hx_1, Function<rqO_2, HU> function, boolean bl) {
        return this.id_byte().id_class(Hz_1.id_byte(hx_1, this.id_class(function), true, bl));
    }

    public HU id_class(Function<rqO_2, HU> function) {
        if (this.id_byte == null) {
            this.id_byte = function.apply(this.id_class);
        }
        return this.id_byte;
    }

    public rqO_2 id_break() {
        return this.id_break;
    }
}

