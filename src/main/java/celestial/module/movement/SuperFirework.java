/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.movement;

import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.iB_2;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rrIm_1;
import celestial.rrLJ;

public class SuperFirework
extends Module {
    public Object[] id_break;

    public SuperFirework() {
        super("Super Firework", "\u0423\u0432\u0435\u043b\u0438\u0447\u0438\u0432\u0430\u0435\u0442 \u0441\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u0440\u0438\n\u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0438 \u0444\u0435\u0439\u0435\u0440\u0432\u0435\u0440\u043a\u0430", Category.MOVEMENT);
        this.id_super();
        rrIm_1 var5 = new rrIm_1("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u043e XZ", Float.valueOf(1.6f), Float.valueOf(1.5f), Float.valueOf(2.0f), Float.valueOf(0.01f)).id_finally();
        this.id_break[0] = var5;
        rrIm_1 var6 = new rrIm_1("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c \u043f\u043e Y", Float.valueOf(1.6f), Float.valueOf(1.5f), Float.valueOf(2.0f), Float.valueOf(0.01f)).id_finally();
        this.id_break[1] = var6;
        this.id_class((rrIm_1)this.id_break[0], (rrIm_1)this.id_break[1]);
    }

    @EventTarget
    public void id_class(rrLJ var1) {
        this.id_super();
        iB_2 var2 = var1.id_class();
        if (var2 == (cb_3)SuperFirework.id_import.id_class[57]) {
            float var3 = ((Float)((rrIm_1)this.id_break[0]).id_byte()).floatValue();
            float var4 = ((Float)((rrIm_1)this.id_break[1]).id_byte()).floatValue();
            var1.id_break(var3);
            var1.id_class(var4);
            var1.id_byte(var3);
        }
    }

    private void id_super() {
        if (this.id_break == null) {
            this.id_break = new Object[2];
        }
    }
}

