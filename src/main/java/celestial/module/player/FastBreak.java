/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.player;

import celestial.Aq_1;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rZM;
import celestial.rZb_1;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrLT;
import celestial.rrLZ;
import celestial.rrLp_1;
import celestial.ruS_2;

public class FastBreak
extends Module {
    public Object[] id_break;

    public FastBreak() {
        super("Fast Break", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u043b\u043e\u043c\u0430\u0442\u044c \u0431\u043b\u043e\u043a\u0438 \u0431\u044b\u0441\u0442\u0440\u0435\u0435", Category.PLAYER);
        this.id_else();
        rrIm_1 var5 = new rrIm_1("\u0421\u0438\u043b\u0430", Float.valueOf(0.4f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(0.1f));
        this.id_break[0] = var5;
        rrIm_1 var6 = new rrIm_1("\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(5.0f), Float.valueOf(1.0f));
        this.id_break[1] = var6;
        rrIk_1 var7 = new rrIk_1("\u041e\u0431\u0445\u043e\u0434 Grim", false);
        this.id_break[2] = var7;
        this.id_class((rrIm_1)this.id_break[0], (rrIm_1)this.id_break[1], (rrIk_1)this.id_break[2]);
    }

    @EventTarget
    public void id_class(rrLZ var1) {
        rZb_1 var2;
        this.id_else();
        ruS_2<?> ruS_22 = var1.id_class();
        if (ruS_22 instanceof rZb_1 && (var2 = (rZb_1)ruS_22).id_protected() == rZM.STOP_DESTROY_BLOCK && ((rrIk_1)this.id_break[2]).id_class().booleanValue()) {
            ((Aq_1)((cb_3)FastBreak.id_import.id_class[57]).id_break[0]).id_break(new rZb_1(rZM.ABORT_DESTROY_BLOCK, rfH_2.id_protected, rpr_3.UP));
        }
    }

    @EventTarget
    public void id_class(rrLT var1) {
        this.id_else();
        var1.id_break(1.0f - ((Float)((rrIm_1)this.id_break[0]).id_byte()).floatValue());
    }

    @EventTarget
    public void id_class(rrLp_1 var1) {
        this.id_else();
        var1.id_class(((Float)((rrIm_1)this.id_break[1]).id_byte()).intValue());
    }

    private void id_else() {
        if (this.id_break == null) {
            this.id_break = new Object[3];
        }
    }
}

