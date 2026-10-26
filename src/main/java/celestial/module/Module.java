/*
 * Decompiled with CFR 0.152.
 */
package celestial.module;

import celestial.module.Category;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rrQX;
import celestial.rrTL;
import celestial.rrTv_1;
import celestial.rrnv_3;
import celestial.rrwI_2;
import celestial.setting.KeyBind;
import celestial.util.MinecraftAccessor;
import java.util.ArrayList;
import java.util.List;

public class Module
extends rrwI_2
implements MinecraftAccessor {
    public Object[] id_class;

    public void id_byte(boolean var1) {
        this.id_goto();
        if (((Boolean)this.id_class[6]).booleanValue()) {
            this.id_throws(var1);
            this.id_volatile();
        }
    }

    public void id_byte() {
    }

    public Category id_int() {
        this.id_goto();
        return (Category)((Object)this.id_class[3]);
    }

    public Module(String var1, KeyBind var2) {
        ArrayList var7;
        this.id_goto();
        this.id_class[8] = var7 = new ArrayList();
        this.id_class[0] = var1;
        this.id_class[4] = var2;
    }

    public Module(String var1, String var2, Category var3, KeyBind var4) {
        ArrayList var9;
        this.id_goto();
        this.id_class[8] = var9 = new ArrayList();
        this.id_class[0] = var1;
        this.id_class[1] = var1.toLowerCase();
        this.id_class[4] = var4;
        this.id_class[5] = var4;
        this.id_class[2] = var2;
        this.id_class[3] = var3;
        ((List)this.id_class[8]).add(new rrTL());
        if (this instanceof rrnv_3) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_break(this);
        }
    }

    public Module(String var1, String var2, Category var3) {
        this(var1, var2, var3, KeyBind.NONE);
    }

    public void id_class(KeyBind var1, boolean var2) {
        this.id_goto();
        this.id_class[4] = var1;
        if (var2) {
            ((List)this.id_class[8]).forEach(var2x -> var2x.id_class(this, var1));
        }
    }

    public void id_class(boolean var1, boolean var2) {
        this.id_goto();
        this.id_class[7] = var1;
        if (var2) {
            ((List)this.id_class[8]).forEach(var2x -> var2x.id_class(this, var1));
        }
    }

    public void id_class(boolean var1) {
        this.id_goto();
        if (var1) {
            ((List)this.id_class[8]).forEach(var1x -> var1x.id_class(this));
        }
    }

    public void id_break(boolean var1) {
        this.id_goto();
        if (this instanceof rrnv_3) {
            this.id_byte(false);
        } else if (!((Boolean)this.id_class[6]).booleanValue()) {
            this.av_();
            this.id_class(var1);
        }
    }

    public List<rrTv_1> id_throws() {
        this.id_goto();
        return (List)this.id_class[8];
    }

    public void id_throws(boolean var1) {
        this.id_goto();
        if (var1) {
            ((List)this.id_class[8]).forEach(var1x -> var1x.id_break(this));
        }
    }

    public void id_finally() {
    }

    public String id_extends() {
        this.id_goto();
        return (String)this.id_class[0];
    }

    private void id_goto() {
        if (this.id_class == null) {
            this.id_class = new Object[9];
            this.id_class[6] = false;
            this.id_class[7] = false;
        }
    }

    public rVi_1 id_case() {
        return new rVe_1(this.id_final());
    }

    public boolean id_implements() {
        this.id_goto();
        return (Boolean)this.id_class[7];
    }

    public KeyBind id_package() {
        this.id_goto();
        return (KeyBind)this.id_class[4];
    }

    public void id_protected(boolean var1) {
        this.id_goto();
        this.id_class[6] = var1;
    }

    public String id_final() {
        this.id_goto();
        return (String)this.id_class[0];
    }

    public void id_volatile() {
        this.id_goto();
        if (((Boolean)this.id_class[6]).booleanValue()) {
            this.id_class[6] = false;
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_byte(this);
        }
    }

    @Override
    public String id_synchronized() {
        return this.id_final();
    }

    public boolean aJ_() {
        this.id_goto();
        return (Boolean)this.id_class[6];
    }

    public void aw_() {
        this.id_goto();
        if (!(this instanceof rrnv_3)) {
            if (((Boolean)this.id_class[6]).booleanValue()) {
                this.id_byte(true);
            } else {
                this.id_break(true);
            }
        }
    }

    public void av_() {
        this.id_goto();
        if (!((Boolean)this.id_class[6]).booleanValue()) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_break(this);
            this.id_class[6] = true;
        }
    }

    public KeyBind ax_() {
        this.id_goto();
        return (KeyBind)this.id_class[5];
    }

    public String ay_() {
        this.id_goto();
        return (String)this.id_class[2];
    }

    public String aH_() {
        this.id_goto();
        return (String)this.id_class[1];
    }
}

