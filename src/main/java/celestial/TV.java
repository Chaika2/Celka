/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.Tf_1;
import celestial.fZ_2;
import celestial.qE_2;
import celestial.rhP_2;
import celestial.rqO_2;
import celestial.rxL_2;
import celestial.te_3;

public class TV
extends Tf_1<rhP_2, te_3<rhP_2>> {
    private static final rqO_2[] id_class = new rqO_2[]{new rqO_2("textures/entity/llama/decor/white.png"), new rqO_2("textures/entity/llama/decor/orange.png"), new rqO_2("textures/entity/llama/decor/magenta.png"), new rqO_2("textures/entity/llama/decor/light_blue.png"), new rqO_2("textures/entity/llama/decor/yellow.png"), new rqO_2("textures/entity/llama/decor/lime.png"), new rqO_2("textures/entity/llama/decor/pink.png"), new rqO_2("textures/entity/llama/decor/gray.png"), new rqO_2("textures/entity/llama/decor/light_gray.png"), new rqO_2("textures/entity/llama/decor/cyan.png"), new rqO_2("textures/entity/llama/decor/purple.png"), new rqO_2("textures/entity/llama/decor/blue.png"), new rqO_2("textures/entity/llama/decor/brown.png"), new rqO_2("textures/entity/llama/decor/green.png"), new rqO_2("textures/entity/llama/decor/red.png"), new rqO_2("textures/entity/llama/decor/black.png")};
    private static final rqO_2 id_break = new rqO_2("textures/entity/llama/decor/trader_llama.png");
    private final te_3<rhP_2> id_byte = new te_3(0.5f);

    public TV(qE_2<rhP_2, te_3<rhP_2>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, rhP_2 rhP_22, float f, float f2, float f3, float f4, float f5, float f6) {
        rqO_2 rqO_22;
        rxL_2 rxL_22 = rhP_22.sa();
        if (rxL_22 != null) {
            rqO_22 = id_class[rxL_22.id_break()];
        } else {
            if (!rhP_22.sK()) {
                return;
            }
            rqO_22 = id_break;
        }
        ((te_3)this.id_byte()).id_class(this.id_byte);
        this.id_byte.id_class(rhP_22, f, f2, f4, f5, f6);
        Ok_1 ok_1 = hx_1.getBuffer(HU.id_protected(rqO_22));
        this.id_byte.id_class(ml_1, ok_1, n, fZ_2.id_class, 1.0f, 1.0f, 1.0f, 1.0f);
    }
}

