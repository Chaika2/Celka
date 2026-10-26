/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.util;

import celestial.module.Category;
import celestial.module.Module;
import celestial.rrTF;
import celestial.rrpU_2;
import celestial.rrpf_3;
import celestial.rrpg_3;
import celestial.rrpo_3;
import celestial.rrpp_3;
import celestial.rrpt_3;
import java.util.ArrayList;
import java.util.List;

public class HwHelper
extends Module {
    public Object[] id_break;

    public HwHelper() {
        super("HW Helper", "\u0423\u0442\u0438\u043b\u0438\u0442\u0430\u0440\u043d\u044b\u0439 \u043c\u043e\u0434\u0443\u043b\u044c \u0434\u043b\u044f\nHolyWorld", Category.UTIL);
        ArrayList var5;
        this.id_else();
        this.id_break[0] = var5 = new ArrayList();
        rrpt_3 var6 = this.id_class(new rrpt_3(this));
        this.id_break[1] = var6;
        rrpg_3 var7 = this.id_class(new rrpg_3(this));
        this.id_break[2] = var7;
        rrpp_3 var8 = this.id_class(new rrpp_3(this));
        this.id_break[3] = var8;
        rrpf_3 var9 = this.id_class(new rrpf_3(this));
        this.id_break[4] = var9;
        rrpU_2 var10 = this.id_class(new rrpU_2(this));
        this.id_break[5] = var10;
        rrpo_3 var11 = this.id_class(new rrpo_3(this));
        this.id_break[6] = var11;
    }

    @Override
    public void id_class(boolean var1) {
        this.id_else();
        super.id_class(var1);
        for (rrTF var3 : (List)this.id_break[0]) {
            var3.aI_();
        }
    }

    @Override
    public <T extends rrTF<?>> T id_class(T var1) {
        this.id_else();
        ((List)this.id_break[0]).add(var1);
        return var1;
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_else();
        super.id_throws(var1);
        for (rrTF var3 : (List)this.id_break[0]) {
            var3.aK_();
        }
    }

    private void id_else() {
        if (this.id_break == null) {
            this.id_break = new Object[7];
        }
    }

    public List<rrTF<?>> id_new() {
        this.id_else();
        return (List)this.id_break[0];
    }
}

