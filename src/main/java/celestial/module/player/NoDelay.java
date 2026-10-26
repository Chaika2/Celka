/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.player;

import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rrAS;
import celestial.rrAu_1;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrwg_3;
import celestial.setting.Setting;
import org.apache.commons.lang3.tuple.Pair;

public class NoDelay
extends Module {
    public Object[] id_break;

    public NoDelay() {
        super("No Delay", "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u0437\u0430\u0434\u0435\u0440\u0436\u043a\u0443 \u043d\u0430 \u0447\u0442\u043e-\u043b\u0438\u0431\u043e", Category.PLAYER);
        Pair var6;
        Pair var5;
        this.id_public();
        this.id_break[0] = var5 = rrwg_3.id_class(new rrIk_1("\u041f\u0440\u044b\u0436\u043e\u043a", true), new rrIm_1("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u0434\u043b\u044f \u043f\u0440\u044b\u0436\u043a\u0430", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(10.0f), Float.valueOf(1.0f)));
        this.id_break[1] = var6 = rrwg_3.id_class(new rrIk_1("\u041f\u041a\u041c", false), new rrIm_1("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430 \u0434\u043b\u044f \u041f\u041a\u041c", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(4.0f), Float.valueOf(1.0f)));
        this.id_class(new rrIc_1("\u0423\u0431\u0438\u0440\u0430\u0442\u044c \u043d\u0430", (rrIk_1)((Pair)this.id_break[0]).getLeft(), (rrIk_1)((Pair)this.id_break[1]).getLeft()), (Setting)((Pair)this.id_break[0]).getRight(), (Setting)((Pair)this.id_break[1]).getRight());
    }

    @EventTarget
    public void id_class(rrAu_1 var1) {
        if (this.id_return()) {
            var1.id_class(this.id_super().intValue());
        }
    }

    @EventTarget
    public void id_class(rrAS var1) {
        if (this.id_new()) {
            var1.id_class(this.id_goto().intValue());
        }
    }

    private Float id_goto() {
        this.id_public();
        return (Float)((rrIm_1)((Pair)this.id_break[0]).getRight()).id_byte();
    }

    private boolean id_new() {
        this.id_public();
        return ((rrIk_1)((Pair)this.id_break[0]).getLeft()).id_class();
    }

    private boolean id_return() {
        this.id_public();
        return ((rrIk_1)((Pair)this.id_break[1]).getLeft()).id_class();
    }

    private Float id_super() {
        this.id_public();
        return (Float)((rrIm_1)((Pair)this.id_break[1]).getRight()).id_byte();
    }

    private void id_public() {
        if (this.id_break == null) {
            this.id_break = new Object[2];
        }
    }
}

