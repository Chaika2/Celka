/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.an_3;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rVi_1;
import celestial.rdn_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rhd_3;
import celestial.rrAp_1;
import celestial.rrfu_3;
import celestial.rrjZ_2;

public class TotemTracker
extends Module {
    public TotemTracker() {
        super("Totem Tracker", "\u041e\u0442\u0441\u043b\u0435\u0436\u0438\u0432\u0430\u0435\u0442 \u0441\u043d\u043e\u0441 \u0442\u043e\u0442\u0435\u043c\u043e\u0432", Category.UTIL);
    }

    @EventTarget
    public void id_class(rrAp_1 var1) {
        rhd_3 var2 = var1.id_break();
        rdn_3 var3 = var1.id_class();
        rVi_1 var4 = new rgN_2("").id_class(rgF_2.GRAY);
        if (var2 == (cb_3)TotemTracker.id_import.id_class[57]) {
            var4.id_break("\u0412\u044b \u043f\u043e\u0442\u0435\u0440\u044f\u043b\u0438 ");
        } else {
            var4.id_class(rrjZ_2.id_byte((an_3)var2)).id_break(" \u043f\u043e\u0442\u0435\u0440\u044f\u043b ");
        }
        var4.id_class(var3.id_continue()).id_break(", \u0437\u0430\u0447\u0430\u0440\u043e\u0432\u0430\u043d: ").id_break(var3.id_public() ? String.valueOf((Object)rgF_2.GREEN) + "\u2714" : String.valueOf((Object)rgF_2.RED) + "\u2716");
        rrfu_3.id_class(var4);
    }
}

