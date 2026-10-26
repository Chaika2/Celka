/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.DA;
import celestial.Ux_1;
import celestial.rVL;
import celestial.rXG;
import celestial.rXs_1;
import celestial.rlG_2;
import celestial.rqO_2;
import java.nio.file.Path;

public class Dq_1
extends Ux_1<rXs_1> {
    public Dq_1(DA dA) {
        super(dA, rVL.id_default);
    }

    @Override
    public String id_class() {
        return "Fluid Tags";
    }

    @Override
    protected Path id_class(rqO_2 rqO_22) {
        return this.id_break.id_break().resolve("data/" + rqO_22.id_byte() + "/tags/fluids/" + rqO_22.id_break() + ".json");
    }

    @Override
    protected void id_break() {
        this.id_class(rlG_2.id_break).id_class((rXs_1)new rXs_1[]{rXG.id_byte, rXG.id_break});
        this.id_class(rlG_2.id_byte).id_class((rXs_1)new rXs_1[]{rXG.id_throws, rXG.id_protected});
    }
}

