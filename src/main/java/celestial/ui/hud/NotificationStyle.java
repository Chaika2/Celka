/*
 * Decompiled with CFR 0.152.
 */
package celestial.ui.hud;

import celestial.rVa_1;
import celestial.rVe_1;
import celestial.rrfu_3;
import celestial.util.ColorHelper;

public class NotificationStyle {
    public Object[] id_class;

    public NotificationStyle id_byte() {
        rrfu_3 var10000 = (rrfu_3)this.id_class[0];
        rVa_1 var5 = rVa_1.id_class(ColorHelper.id_class(0.0f));
        var10000.id_break[2] = var5;
        var10000 = (rrfu_3)this.id_class[0];
        rVa_1 var6 = rVa_1.id_class(ColorHelper.id_class(270.0f));
        var10000.id_break[3] = var6;
        return this;
    }

    NotificationStyle() {
        this.id_protected();
        rrfu_3 var5 = new rrfu_3();
        this.id_class[0] = var5;
    }

    public NotificationStyle id_class(rVa_1 var1, rVa_1 var2) {
        ((rrfu_3)this.id_class[0]).id_break[2] = var1;
        ((rrfu_3)this.id_class[0]).id_break[3] = var2;
        return this;
    }

    public NotificationStyle id_class(rVa_1 var1) {
        ((rrfu_3)this.id_class[0]).id_break[4] = var1;
        ((rrfu_3)this.id_class[0]).id_break[5] = var1;
        return this;
    }

    public NotificationStyle id_class() {
        rrfu_3 var10000 = (rrfu_3)this.id_class[0];
        rVa_1 var5 = rVa_1.id_class(ColorHelper.id_class(0.0f));
        var10000.id_break[4] = var5;
        var10000 = (rrfu_3)this.id_class[0];
        rVa_1 var6 = rVa_1.id_class(ColorHelper.id_class(270.0f));
        var10000.id_break[5] = var6;
        return this;
    }

    public NotificationStyle id_class(String var1) {
        ((rrfu_3)this.id_class[0]).id_break[1] = var1;
        return this;
    }

    public rVe_1 id_break() {
        return ((rrfu_3)this.id_class[0]).id_catch();
    }

    public NotificationStyle id_break(rVa_1 var1, rVa_1 var2) {
        ((rrfu_3)this.id_class[0]).id_break[4] = var1;
        ((rrfu_3)this.id_class[0]).id_break[5] = var2;
        return this;
    }

    public NotificationStyle id_break(String var1) {
        ((rrfu_3)this.id_class[0]).id_break[0] = var1;
        return this;
    }

    private void id_protected() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }
}

