/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRA;
import celestial.rRC;
import celestial.rRF;
import celestial.rRn_1;
import celestial.rgX_2;
import java.util.Set;

public class rVc_1
implements rRF {
    public final /* synthetic */ rgX_2 id_class;
    public final /* synthetic */ Set id_break;

    @Override
    public <T extends rRC<T>> void id_byte(rRA<T> rRA2, rRn_1<T> rRn_12) {
        if (!this.id_class.id_break(rRA2.id_break())) {
            this.id_break.add(rRA2.id_class());
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rVc_1(rgX_2 rgX_22, Set set) {
        this.id_class = rgX_22;
        this.id_break = set;
    }
}

