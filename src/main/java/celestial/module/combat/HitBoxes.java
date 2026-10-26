/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.combat;

import celestial.an_3;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rrIc_1;
import celestial.rrIm_1;
import celestial.rrff_3;
import celestial.rrnJ_2;
import celestial.setting.CheckGroup;

public class HitBoxes
extends Module {
    public Object[] id_break;

    public HitBoxes() {
        super("Hitboxes", "\u0423\u0432\u0435\u043b\u0438\u0447\u0438\u0432\u0430\u0435\u0442 \u0445\u0438\u0442\u0431\u043e\u043a\u0441 \u0443 \u044d\u043d\u0442\u0438\u0442\u0438", Category.COMBAT);
        this.id_else();
        CheckGroup var5 = new CheckGroup().id_catch(true).id_case(false).id_throws(false).id_implements(false).id_byte(false).id_protected(false).id_class(true);
        this.id_break[0] = var5;
        rrIm_1 var6 = new rrIm_1("\u0420\u0430\u0437\u043c\u0435\u0440", Float.valueOf(0.2f), Float.valueOf(0.1f), Float.valueOf(2.0f), Float.valueOf(0.1f));
        this.id_break[1] = var6;
        this.id_class(new rrIc_1("\u0412\u044b\u0431\u043e\u0440 \u0446\u0435\u043b\u0435\u0439", ((CheckGroup)this.id_break[0]).id_byte()), (rrIm_1)this.id_break[1]);
    }

    private boolean id_class(an_3 var1) {
        this.id_else();
        return var1 == (cb_3)HitBoxes.id_import.id_class[57] ? false : rrff_3.id_class(var1, (CheckGroup)this.id_break[0]);
    }

    @EventTarget
    public void id_class(rrnJ_2 var1) {
        this.id_else();
        an_3 var2 = var1.id_class();
        if (this.id_class(var2)) {
            var1.id_class(((Float)((rrIm_1)this.id_break[1]).id_byte()).floatValue());
        }
    }

    private void id_else() {
        if (this.id_break == null) {
            this.id_break = new Object[2];
        }
    }
}

