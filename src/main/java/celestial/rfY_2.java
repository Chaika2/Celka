/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.il_3;
import celestial.rfD_2;
import celestial.rfH_2;
import celestial.rjU_2;
import java.util.List;
import java.util.Optional;

public class rfY_2
implements rfD_2 {
    private final an_3 id_class;
    private final boolean id_break;

    public rfY_2(an_3 an_32, boolean bl) {
        this.id_class = an_32;
        this.id_break = bl;
    }

    public String toString() {
        return "EntityTracker for " + this.id_class;
    }

    @Override
    public rjU_2 id_class() {
        return this.id_break ? this.id_class.Ps().id_break(0.0, this.id_class.Bx(), 0.0) : this.id_class.Ps();
    }

    @Override
    public boolean id_class(iB_2 iB_22) {
        if (!(this.id_class instanceof iB_2)) {
            return true;
        }
        Optional<List<iB_2>> optional = iB_22.SF().id_byte(il_3.id_private);
        return this.id_class.BM() && optional.isPresent() && optional.get().contains(this.id_class);
    }

    @Override
    public rfH_2 id_break() {
        return this.id_class.Bs();
    }
}

