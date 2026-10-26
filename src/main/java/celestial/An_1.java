/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rmJ_2;
import celestial.rmO_2;
import celestial.rmW_2;
import celestial.rnW_2;
import celestial.rud_3;

public class An_1
implements rmO_2 {
    private final rnW_2 id_class;
    private final rud_3 id_break;

    public An_1(rnW_2 rnW_22, rud_3 rud_32) {
        this.id_class = rnW_22;
        this.id_break = rud_32;
    }

    @Override
    public rud_3 id_class() {
        return this.id_break;
    }

    @Override
    public void id_class(rgP_2 rgP_22, rgP_2 rgP_23) {
    }

    @Override
    public void id_class(rmJ_2 rmJ_22) {
        this.id_break.id_class(rmJ_22.id_break());
        this.id_break.id_class(new rmW_2(this.id_class, this.id_break));
    }
}

