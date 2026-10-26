/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRP;
import celestial.rRr_1;
import celestial.rYB;
import celestial.rbF_2;
import celestial.rbq_3;
import celestial.rfH_2;
import celestial.rgU_2;
import celestial.rga_3;
import celestial.rrEm_1;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class rbw_3
extends rbq_3 {
    public final /* synthetic */ rbF_2 id_class;

    @Override
    public void id_byte() {
        this.id_class.id_throw = 200;
        List<rfH_2> list = this.id_finally();
        if (!list.isEmpty()) {
            for (rfH_2 rfH_22 : list) {
                if (this.id_class.id_float.id_break(rfH_22)) continue;
                this.id_class.id_abstract = rfH_22;
                return;
            }
            this.id_class.id_float.id_finally();
            this.id_class.id_abstract = list.get(0);
        }
    }

    public rbw_3(rbF_2 rbF_22) {
        this.id_class = rbF_22;
        super(rbF_22);
    }

    private List<rfH_2> id_finally() {
        rfH_2 rfH_24 = this.id_class.Bs();
        rga_3 rga_32 = ((rrEm_1)((rYB)this.id_class.id_throws[7])).d();
        Stream<rgU_2> stream = rga_32.id_byte(rRP2 -> rRP2 == rRP.id_this || rRP2 == rRP.id_else, rfH_24, 20, rRr_1.ANY);
        return stream.map(rgU_2::id_throws).filter(rfH_22 -> this.id_class.id_extends((rfH_2)rfH_22)).sorted(Comparator.comparingDouble(rfH_23 -> rfH_23.id_private(rfH_24))).collect(Collectors.toList());
    }

    @Override
    public boolean id_catch() {
        return this.id_class.id_throw == 0 && !this.id_class.sx() && this.id_class.sF();
    }

    @Override
    public boolean id_private() {
        return false;
    }
}

