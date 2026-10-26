/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ay_3;
import celestial.iB_2;
import celestial.rBk_1;
import celestial.rYB;
import celestial.rba_3;
import celestial.rbi_3;
import celestial.rfH_2;
import java.util.Objects;

public abstract class rMr_1
extends rBk_1 {
    private final ay_3 id_break;
    public final /* synthetic */ rba_3 id_class;

    public rMr_1(rba_3 rba_32) {
        this.id_class = rba_32;
        ay_3 ay_32 = new ay_3().id_class(12.0).id_byte();
        rba_3 rba_33 = this.id_class;
        Objects.requireNonNull(rba_33);
        this.id_break = ay_32.id_class(new rbi_3(rba_33));
    }

    protected boolean id_catch() {
        rfH_2 rfH_22 = new rfH_2(this.id_class.rx(), this.id_class.rN().id_throws, this.id_class.BO());
        return !((rYB)this.id_class.id_throws[7]).id_case(rfH_22) && this.id_class.id_class(rfH_22) >= 0.0f;
    }

    protected boolean id_private() {
        return !((rYB)this.id_class.id_throws[7]).id_class(iB_2.class, this.id_break, this.id_class, this.id_class.rN().id_byte(12.0, 6.0, 12.0)).isEmpty();
    }
}

