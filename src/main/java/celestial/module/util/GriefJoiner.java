/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.module.Category;
import celestial.module.Module;
import celestial.rrIv_1;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrfu_3;
import celestial.rrpH_2;
import celestial.rrpl_3;
import celestial.rrtR_2;
import celestial.rrte_3;
import celestial.rrth_3;
import celestial.rrtx_3;
import java.util.regex.Pattern;

public class GriefJoiner
extends Module {
    public Object[] id_break;

    public GriefJoiner() {
        super("Grief Joiner", "\u041f\u043e\u043c\u043e\u0433\u0430\u0435\u0442 \u0437\u0430\u0439\u0442\u0438 \u043d\u0430 \u0433\u0440\u0438\u0444 \u0441\u0435\u0440\u0432\u0435\u0440\u0430\nReallyWorld", Category.UTIL);
        this.id_goto();
        rrIv_1 var5 = new rrIv_1("\u0420\u0435\u0436\u0438\u043c", rrte_3.id_class((Pattern)rrtR_2.id_class[2]));
        this.id_break[0] = var5;
        this.id_class((rrIv_1)this.id_break[0]);
        rrpH_2 var6 = new rrpH_2(this);
        this.id_break[1] = var6;
    }

    @Override
    public void id_class(boolean var1) {
        this.id_goto();
        if (this.id_continue() && ((rrpl_3)this.id_break[2] == null || ((rrpl_3)this.id_break[2]).aI_())) {
            super.id_class(var1);
        }
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_goto();
        if ((rrpl_3)this.id_break[2] == null || ((rrpl_3)this.id_break[2]).aK_()) {
            super.id_throws(var1);
            Object var6 = null;
            this.id_break[2] = var6;
        }
    }

    private void id_goto() {
        if (this.id_break == null) {
            this.id_break = new Object[3];
        }
    }

    private boolean id_continue() {
        this.id_goto();
        ((rrpH_2)this.id_break[1]).id_class((rrfq_3)((Object)rrfp_3.id_class[1])).ifPresentOrElse(var1 -> {
            this.id_goto();
            this.id_break[2] = var1;
            ((rrpl_3)this.id_break[2]).id_class();
        }, () -> {
            this.id_byte(false);
            String var1 = "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0438\u0442\u044c \u0441\u0435\u0440\u0432\u0435\u0440";
            rrfu_3.id_byte(rrfu_3.id_class(this) + var1);
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(this.id_final(), var1, 2000));
        });
        return (rrpl_3)this.id_break[2] != null;
    }

    public String id_new() {
        this.id_goto();
        return ((rrIv_1)this.id_break[0]).id_extends();
    }
}

