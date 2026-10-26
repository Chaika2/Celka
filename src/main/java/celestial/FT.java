/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.FG;
import celestial.Ml_1;
import celestial.rJo_1;
import celestial.rgP_2;
import celestial.rhz_3;
import celestial.rqO_2;
import com.mojang.blaze3d.systems.RenderSystem;

public class FT
extends FG<rJo_1> {
    private static final rqO_2 id_class = new rqO_2("textures/gui/container/smithing.png");

    public FT(rJo_1 rJo_12, rhz_3 rhz_32, rgP_2 rgP_22) {
        super(rJo_12, rhz_32, rgP_22, id_class);
        this.id_public = 60;
        this.id_goto = 18;
    }

    @Override
    protected void id_class(Ml_1 ml_1, int n, int n2) {
        RenderSystem.disableBlend();
        super.id_class(ml_1, n, n2);
    }
}

