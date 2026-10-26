/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.Ph_1;
import celestial.an_3;
import celestial.cG_2;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rhd_3;
import celestial.rrIF;
import celestial.rrLB;
import celestial.rrZW;
import celestial.rrZk_1;
import celestial.setting.KeyBind;

public class ClickFriend
extends Module {
    public Object[] id_break;

    public ClickFriend() {
        super("Click Friend", "\u0414\u043e\u0431\u0430\u0432\u043b\u044f\u0435\u0442 \u0438\u043b\u0438 \u0443\u0434\u0430\u043b\u044f\u0435\u0442 \u0438\u0433\u0440\u043e\u043a\u0430 \u0438\u0437\n\u0434\u0440\u0443\u0437\u0435\u0439 \u043d\u0430 \u043a\u043b\u0430\u0432\u0438\u0448\u0443", Category.UTIL);
        this.id_new();
        rrIF var5 = new rrIF("\u041a\u043b\u0430\u0432\u0438\u0448\u0430", KeyBind.get(3));
        this.id_break[0] = var5;
        this.id_class((rrIF)this.id_break[0]);
    }

    @EventTarget
    public void id_class(rrLB var1) {
        an_3 an_32;
        this.id_new();
        if (var1.id_break() == ((rrIF)this.id_break[0]).id_finally().id_byte() && (an_32 = Ph_1.id_class(((cb_3)ClickFriend.id_import.id_class[57]).id_goto(), 128.0f, true, var0 -> {
            rhd_3 var1x;
            return var0 instanceof rhd_3 && !(var1x = (rhd_3)var0).sc() && var1x.Pu();
        })) instanceof cG_2) {
            cG_2 var3 = (cG_2)an_32;
            if (var3 == this.O()) {
                return;
            }
            if (((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class(var3)) {
                ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_byte(var3.id_extends());
            } else {
                ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).id_class(new rrZk_1(var3.id_extends()), true);
            }
        }
    }

    private void id_new() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
        }
    }
}

