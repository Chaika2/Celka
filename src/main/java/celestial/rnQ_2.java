/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRA;
import celestial.rRC;
import celestial.rRF;
import celestial.rRn_1;
import celestial.rRu_1;
import celestial.rnW_2;
import java.util.List;

public class rnQ_2
implements rRF {
    public final /* synthetic */ List id_class;
    public final /* synthetic */ rRu_1 id_break;

    @Override
    public <T extends rRC<T>> void id_byte(rRA<T> rRA2, rRn_1<T> rRn_12) {
        this.id_class.add(String.format("%s=%s\n", rRA2.id_class(), ((rRC)this.id_break.id_class(rRA2)).toString()));
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rnQ_2(rnW_2 rnW_22, List list, rRu_1 rRu_12) {
        this.id_class = list;
        this.id_break = rRu_12;
    }
}

