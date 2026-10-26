/*
 * Decompiled with CFR 0.152.
 */
package celestial.ui.hud;

import celestial.FP;
import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.module.render.StaffViewer;
import celestial.rrFZ;
import celestial.rrQX;
import celestial.rrfD_2;
import celestial.rrfi_3;
import celestial.rrqr_3;
import celestial.rrtu_3;
import celestial.rrvR_1;
import celestial.rrvg_1;
import celestial.util.AnimValue;
import celestial.vm_3;

public class HudWidget
extends rrvR_1 {
    public Object[] id_protected;

    public HudWidget() {
        super("Staff Viewer", new AnimValue(0.5f, true), new AnimValue(0.5f, true));
        this.B();
        rrFZ var5 = new rrFZ(this);
        this.id_protected[0] = var5;
        Float var6 = Float.valueOf(this.S());
        this.id_protected[1] = var6;
        this.id_try().id_class(((Float)this.id_protected[1]).floatValue());
    }

    private void B() {
        if (this.id_protected == null) {
            Object[] var1 = this.id_protected = new Object[2];
            var1[1] = Float.valueOf(0.0f);
        }
    }

    private float S() {
        this.B();
        boolean var1 = false;
        int var2 = 0;
        for (rrqr_3 var4 : ((rrFZ)this.id_protected[0]).id_byte()) {
            int var5 = (int)((rrFZ)this.id_protected[0]).id_class(var4);
            if (var1 && var5 <= var2) continue;
            var1 = true;
            var2 = var5;
        }
        float var6 = var1 ? (float)var2 : 0.0f;
        return Math.max(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_class().id_break(this.id_byte()) + 47.0f, var6);
    }

    @Override
    public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
        super.id_class(var1, var2, var3, var4, var5);
        float var6 = this.id_default();
        float var7 = this.id_abstract();
        float var8 = this.id_implements();
        float var9 = this.ao_();
        rrvg_1.id_class(this, var1, () -> {
            this.B();
            rrfi_3.id_break();
            rrfD_2.id_protected(var1, var6, var7 + 12.5f, var8, var9, -1);
            rrfi_3.id_class(1);
            ((rrFZ)this.id_protected[0]).id_class(var1, var6, var7);
            rrfi_3.id_class();
        });
    }

    @Override
    public float id_goto() {
        this.B();
        return ((Float)this.id_protected[1]).floatValue();
    }

    @Override
    public void id_instanceof() {
        this.B();
        super.id_instanceof();
        this.id_break(!((rrFZ)this.id_protected[0]).id_class() && (vm_3)HudWidget.id_import.id_class[73] instanceof FP);
        Float var5 = Float.valueOf(this.S());
        this.id_protected[1] = var5;
        ((rrFZ)this.id_protected[0]).id_throws();
    }

    @Override
    public boolean id_package() {
        this.B();
        StaffViewer var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().o();
        if (!var1.aJ_()) {
            return false;
        }
        return this.id_super() || ((rrFZ)this.id_protected[0]).id_class();
    }

    @Override
    public float id_while() {
        this.B();
        return ((rrFZ)this.id_protected[0]).id_finally() - 2.0f;
    }

    @Override
    public boolean id_protected() {
        return false;
    }

    @Override
    public float ao_() {
        return this.id_while();
    }
}

