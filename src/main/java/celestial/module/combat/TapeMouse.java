/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.combat;

import celestial.Y;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rrAm_1;
import celestial.rrIQ;
import celestial.rrIm_1;
import celestial.rrfw_3;

public class TapeMouse
extends Module {
    public Object[] id_break;

    public TapeMouse() {
        super("Tape Mouse", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043d\u0430\u0436\u0438\u043c\u0430\u0435\u0442 \u043b\u0435\u0432\u0443\u044e\n\u0438\u043b\u0438 \u043f\u0440\u0430\u0432\u0443\u044e \u043a\u043d\u043e\u043f\u043a\u0443 \u043c\u044b\u0448\u0438", Category.COMBAT);
        this.id_return();
        rrIQ var5 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "\u041b\u041a\u041c", "\u041b\u041a\u041c", "\u041f\u041a\u041c");
        this.id_break[0] = var5;
        rrIm_1 var6 = new rrIm_1("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u0432 \u0441\u0435\u043a\u0443\u043d\u0434\u0430\u0445", Float.valueOf(0.5f), Float.valueOf(0.0f), Float.valueOf(60.0f), Float.valueOf(0.5f));
        this.id_break[1] = var6;
        rrfw_3 var7 = new rrfw_3();
        this.id_break[2] = var7;
        this.id_class((rrIQ)this.id_break[0], (rrIm_1)this.id_break[1]);
    }

    @EventTarget
    public void id_class(rrAm_1 var1) {
        var1.id_class(true);
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_return();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) && ((rrfw_3)this.id_break[2]).id_class(((Float)((rrIm_1)this.id_break[1]).id_byte()).floatValue() * 1000.0f)) {
            if (((String)((rrIQ)this.id_break[0]).id_byte()).equals("\u041b\u041a\u041c")) {
                id_import.z();
            } else {
                id_import.id_for();
            }
            ((rrfw_3)this.id_break[2]).id_class();
        }
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_return();
        super.id_throws(var1);
        ((rrfw_3)this.id_break[2]).id_class();
    }

    private void id_return() {
        if (this.id_break == null) {
            this.id_break = new Object[3];
        }
    }
}

