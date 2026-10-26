/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.player;

import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rrAl_1;

public class NoServerRots
extends Module {
    public NoServerRots() {
        super("No Server Rots", "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u0440\u043e\u0442\u0430\u0446\u0438\u044e \u0441\u043e \u0441\u0442\u043e\u0440\u043e\u043d\u044b\n\u0441\u0435\u0440\u0432\u0435\u0440\u0430", Category.UTIL);
    }

    @EventTarget
    public void id_class(rrAl_1 var1) {
        String var2;
        if (!((cb_3)NoServerRots.id_import.id_class[57] == null || (var2 = ((cb_3)NoServerRots.id_import.id_class[57]).id_short()) != null && var2.contains("BotFilter (https://vk.cc/"))) {
            var1.id_byte(true);
        }
    }
}

