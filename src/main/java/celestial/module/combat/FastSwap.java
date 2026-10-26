/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.combat;

import celestial.module.Category;
import celestial.module.Module;
import celestial.rrCL;
import celestial.rrCQ;
import celestial.rrCc_1;
import celestial.rrCl_1;
import celestial.rrCm_1;
import celestial.rrCn_1;
import celestial.rrTF;
import java.util.ArrayList;
import java.util.List;

public class FastSwap
extends Module {
    public Object[] id_break;

    public FastSwap() {
        super("Fast Swap", "\u041c\u0435\u043d\u044f\u0435\u0442 \u043f\u0440\u0435\u0434\u043c\u0435\u0442 \u0432 \u043e\u0441\u043d\u043e\u0432\u043d\u043e\u0439 \u0440\u0443\u043a\u0435", Category.COMBAT);
        ArrayList var5;
        this.id_super();
        this.id_break[0] = var5 = new ArrayList();
        rrCQ var6 = this.id_class(new rrCQ(this));
        this.id_break[1] = var6;
        rrCl_1 var7 = this.id_class(new rrCl_1(this));
        this.id_break[2] = var7;
        rrCc_1 var8 = this.id_class(new rrCc_1(this));
        this.id_break[3] = var8;
        rrCm_1 var9 = this.id_class(new rrCm_1(this));
        this.id_break[4] = var9;
        rrCL var10 = this.id_class(new rrCL(this));
        this.id_break[5] = var10;
        rrCn_1 var11 = this.id_class(new rrCn_1(this));
        this.id_break[6] = var11;
    }

    @Override
    public void id_class(boolean var1) {
        this.id_super();
        super.id_class(var1);
        for (rrTF var3 : (List)this.id_break[0]) {
            var3.aI_();
        }
    }

    @Override
    public <T extends rrTF<?>> T id_class(T var1) {
        this.id_super();
        ((List)this.id_break[0]).add(var1);
        return var1;
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_super();
        super.id_throws(var1);
        for (rrTF var3 : (List)this.id_break[0]) {
            var3.aK_();
        }
    }

    private void id_super() {
        if (this.id_break == null) {
            this.id_break = new Object[7];
        }
    }
}

