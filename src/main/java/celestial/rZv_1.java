/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rmH_2;
import celestial.rrEm_1;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;
import java.util.UUID;

public class rZv_1
implements ruS_2<rmH_2> {
    private UUID id_class;

    public rZv_1() {
    }

    public rZv_1(UUID uUID) {
        this.id_class = uUID;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    public an_3 id_class(rrEm_1 rrEm_12) {
        return rrEm_12.id_break(this.id_class);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_private();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
    }
}

