/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.player;

import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rJZ;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rrAW;
import celestial.rrAk_1;
import celestial.ryO_2;
import celestial.xc_3;

public class GhostHand
extends Module {
    public GhostHand() {
        super("Ghost Hand", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0432\u0437\u0430\u0438\u043c\u043e\u0434\u0435\u0439\u0441\u0442\u0432\u043e\u0432\u0430\u0442\u044c \u0441\n\u043a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440\u0430\u043c\u0438 \u0441\u043a\u0432\u043e\u0437\u044c \u0441\u0442\u0435\u043d\u044b", Category.PLAYER);
    }

    @EventTarget(id_class=-200)
    public void id_class(rrAW var1) {
        var1.id_class(true);
    }

    @EventTarget(id_class=-200)
    public void id_class(rrAk_1 var1) {
        rff_3 var2 = var1.id_break();
        if (var2 != null) {
            xc_3 var3 = var1.id_class();
            rfH_2 var4 = var2.id_class();
            rJZ var5 = var3.id_break().id_class(var3, (gm_3)GhostHand.id_import.id_class[56], var4);
            ryO_2 var6 = ((gm_3)GhostHand.id_import.id_class[56]).id_class(var4);
            if (var5 == null && var6 == null) {
                var1.id_class((rff_3)null);
            }
        }
    }
}

