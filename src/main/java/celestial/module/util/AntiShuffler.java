/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.cb_3;
import celestial.cq_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rhz_3;
import celestial.rrLu_1;
import celestial.rrfo_3;
import celestial.ruS_2;
import celestial.rvm_3;
import celestial.uR_2;

public class AntiShuffler
extends Module {
    public AntiShuffler() {
        super("Anti Shuffler", "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u043f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435 \u0441\u043b\u043e\u0442\u043e\u0432\n\u0430\u043d\u0442\u0438\u0447\u0438\u0442\u043e\u043c", Category.UTIL);
    }

    @EventTarget
    public void id_class(rrLu_1 var1) {
        ruS_2<?> ruS_22 = var1.id_class();
        if (ruS_22 instanceof rvm_3) {
            rvm_3 var2 = (rvm_3)ruS_22;
            if ((cb_3)AntiShuffler.id_import.id_class[57] == null) {
                return;
            }
            uR_2 var4 = ((cq_3)AntiShuffler.id_import.id_class[19]).id_implements();
            if (var4.id_protected() == null && var4.id_class() == null) {
                return;
            }
            rrfo_3.id_class(var2.id_break());
            rrfo_3.id_class(((rhz_3)((cb_3)AntiShuffler.id_import.id_class[57]).id_implements[1]).id_protected);
            var1.id_class(true);
        }
    }
}

