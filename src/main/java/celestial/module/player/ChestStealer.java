/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.player;

import celestial.module.Category;
import celestial.module.Module;
import celestial.rrTF;
import celestial.rrlY_2;

public class ChestStealer
extends Module {
    public Object[] id_break;

    public ChestStealer() {
        super("Chest Stealer", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0437\u0430\u0431\u0438\u0440\u0430\u0435\u0442 \u0440\u0435\u0441\u0443\u0440\u0441\u044b\n\u0438\u0437 \u0441\u0443\u043d\u0434\u0443\u043a\u0430", Category.PLAYER);
        this.id_else();
        rrlY_2 var5 = new rrlY_2(this);
        this.id_break[1] = var5;
        rrlY_2 var6 = (rrlY_2)this.id_break[1];
        this.id_break[0] = var6;
    }

    @Override
    public void id_class(boolean var1) {
        if (this.id_new().aI_()) {
            super.id_class(var1);
        }
    }

    @Override
    public void id_throws(boolean var1) {
        if (this.id_new().aK_()) {
            super.id_throws(var1);
        }
    }

    private void id_else() {
        if (this.id_break == null) {
            this.id_break = new Object[2];
        }
    }

    public rrTF<ChestStealer> id_new() {
        this.id_else();
        return (rrTF)this.id_break[0];
    }
}

