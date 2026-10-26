/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.combat;

import celestial.Aq_1;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rZM;
import celestial.rZb_1;
import celestial.rZh_1;
import celestial.rmD_2;
import celestial.rmU_2;
import celestial.rrIm_1;
import celestial.rrLZ;
import celestial.ruS_2;

public class SuperBow
extends Module {
    public Object[] id_break;

    public SuperBow() {
        super("Super Bow", "\u0423\u0432\u0435\u043b\u0438\u0447\u0438\u0432\u0430\u0435\u0442 \u0443\u0440\u043e\u043d \u0441 \u043b\u0443\u043a\u0430", Category.COMBAT);
        this.id_continue();
        rrIm_1 var5 = new rrIm_1("\u0421\u0438\u043b\u0430 \u0432\u044b\u0441\u0442\u0440\u0435\u043b\u0430", Float.valueOf(50.0f), Float.valueOf(10.0f), Float.valueOf(100.0f), Float.valueOf(10.0f));
        this.id_break[0] = var5;
        this.id_class((rrIm_1)this.id_break[0]);
    }

    @EventTarget
    public void id_class(rrLZ var1) {
        this.id_continue();
        ruS_2<?> ruS_22 = var1.id_class();
        if (ruS_22 instanceof rZb_1) {
            rZb_1 var2 = (rZb_1)ruS_22;
            if (var2.id_protected() != rZM.RELEASE_USE_ITEM || !((cb_3)SuperBow.id_import.id_class[57]).sR()) {
                return;
            }
            ((Aq_1)((cb_3)SuperBow.id_import.id_class[57]).id_break[0]).id_class(new rmD_2((cb_3)SuperBow.id_import.id_class[57], rmU_2.START_SPRINTING));
            for (int var4 = 0; var4 < ((Float)((rrIm_1)this.id_break[0]).id_byte()).intValue(); ++var4) {
                this.id_class(((cb_3)SuperBow.id_import.id_class[57]).re() + 1.0E-10, false);
                this.id_class(((cb_3)SuperBow.id_import.id_class[57]).re() - 1.0E-10, true);
            }
        }
    }

    private void id_class(double var1, boolean var3) {
        ((Aq_1)((cb_3)SuperBow.id_import.id_class[57]).id_break[0]).id_class(new rZh_1(((cb_3)SuperBow.id_import.id_class[57]).rx(), var1, ((cb_3)SuperBow.id_import.id_class[57]).BO(), var3));
    }

    private void id_continue() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
        }
    }
}

