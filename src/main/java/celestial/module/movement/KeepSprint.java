/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.movement;

import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rrFt_1;
import celestial.rrIQ;

public class KeepSprint
extends Module {
    private static short[] id_throws = new short[4];
    public Object[] id_break;

    public KeepSprint() {
        super("Keep Sprint", "\u041d\u0435 \u0434\u0430\u0435\u0442 \u0441\u0431\u0440\u043e\u0441\u0438\u0442\u044c \u0441\u043f\u0440\u0438\u043d\u0442 \u043f\u0440\u0438\n\u0443\u0434\u0430\u0440\u0435", Category.MOVEMENT);
        this.id_this();
        rrIQ var5 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "Vanilla", "Vanilla", "SpookyTime");
        this.id_break[0] = var5;
        this.id_class((rrIQ)this.id_break[0]);
    }

    private void id_this() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
        }
    }

    @EventTarget
    public void id_class(rrFt_1 var1) {
        this.id_this();
        String var2 = (String)((rrIQ)this.id_break[id_throws[3]]).id_byte();
        if (var2.equals("Vanilla")) {
            var1.id_class(true);
        } else if (var2.equals("SpookyTime")) {
            var1.id_break(true);
        }
    }

    private static void id_super() {
        id_throws = new short[4];
    }
}

