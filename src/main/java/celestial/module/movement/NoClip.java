/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.movement;

import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rjU_2;
import celestial.rrLz_1;
import celestial.rrnZ_2;

public class NoClip
extends Module
implements rrnZ_2 {
    public NoClip() {
        super("No Clip", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u043f\u0440\u043e\u0445\u043e\u0434\u0438\u0442\u044c \u0441\u043a\u0432\u043e\u0437\u044c\n\u0431\u043b\u043e\u043a\u0438", Category.PLAYER);
    }

    @EventTarget
    public void id_class(rrLz_1 var1) {
        if (((cb_3)NoClip.id_import.id_class[57]).BW()) {
            rjU_2 var2 = var1.id_catch();
            if (var1.id_private()) {
                var1.id_protected(true);
            }
            if (var1.id_catch().id_byte > 0.0 || ((cb_3)NoClip.id_import.id_class[57]).h()) {
                var1.id_break(true);
            }
            var2.id_byte = Math.min(var2.id_byte, 99999.0);
        }
    }

    @Override
    public void id_class() {
        this.id_byte(false);
    }
}

