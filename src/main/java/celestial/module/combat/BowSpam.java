/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.combat;

import celestial.Ax_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rrIm_1;

public class BowSpam
extends Module {
    public Object[] id_break;

    public BowSpam() {
        super("Bow Spam", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0431\u044b\u0441\u0442\u0440\u043e \u0441\u0442\u0440\u0435\u043b\u044f\u0442\u044c \u0438\u0437 \u043b\u0443\u043a\u0430", Category.COMBAT);
        this.id_else();
        rrIm_1 var5 = new rrIm_1("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430", Float.valueOf(2.0f), Float.valueOf(2.0f), Float.valueOf(5.0f), Float.valueOf(1.0f));
        this.id_break[0] = var5;
        this.id_class((rrIm_1)this.id_break[0]);
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_else();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            if (!this.id_continue()) {
                return;
            }
            if ((float)((cb_3)BowSpam.id_import.id_class[57]).Sw() > ((Float)((rrIm_1)this.id_break[0]).id_byte()).floatValue()) {
                ((Ax_1)BowSpam.id_import.id_class[55]).id_break((cb_3)BowSpam.id_import.id_class[57]);
            }
        }
    }

    private boolean id_continue() {
        return ((cb_3)BowSpam.id_import.id_class[57]).sR();
    }

    private void id_else() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
        }
    }
}

