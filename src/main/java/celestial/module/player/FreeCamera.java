/*
 * Decompiled with CFR 0.152.
 */
package celestial.module.player;

import celestial.Hh_1;
import celestial.Ml_1;
import celestial.PX;
import celestial.Qw_1;
import celestial.VZ;
import celestial.Y;
import celestial.an_3;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.ly_3;
import celestial.manager.FontManager;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rYB;
import celestial.rgF_2;
import celestial.rjG_2;
import celestial.rjU_2;
import celestial.rrAM;
import celestial.rrAO;
import celestial.rrAX;
import celestial.rrAh_1;
import celestial.rrAz_1;
import celestial.rrFK;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrLt_1;
import celestial.rrLw_1;
import celestial.rrQX;
import celestial.rrTF;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrfZ_2;
import celestial.rrlU_2;
import celestial.rrle_3;
import celestial.rrnB_2;
import celestial.yX_2;
import com.mojang.blaze3d.systems.RenderSystem;

public class FreeCamera
extends Module {
    public Object[] id_break;

    public FreeCamera() {
        super("Free Camera", "\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u043b\u0435\u0442\u0430\u0442\u044c \u0432 \u0440\u0435\u0436\u0438\u043c\u0435\n\u043d\u0430\u0431\u043b\u044e\u0434\u0430\u0442\u0435\u043b\u044f", Category.PLAYER);
        this.id_return();
        rrIm_1 var5 = new rrIm_1("\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", Float.valueOf(1.5f), Float.valueOf(0.5f), Float.valueOf(5.0f), Float.valueOf(0.1f));
        this.id_break[1] = var5;
        rrIk_1 var6 = new rrIk_1("\u0412\u044b\u043a\u043b\u044e\u0447\u0430\u0442\u044c \u043f\u0440\u0438 \u0434\u0430\u043c\u0430\u0433\u0435", false);
        this.id_break[2] = var6;
        rjU_2 var7 = rjU_2.id_class;
        this.id_break[3] = var7;
        rjU_2 var8 = rjU_2.id_class;
        this.id_break[4] = var8;
        rrlU_2 var9 = (rrlU_2)rrlU_2.id_break[0];
        this.id_break[5] = var9;
        this.id_class((rrIk_1)this.id_break[2], (rrIm_1)this.id_break[1]);
        rrle_3 var10 = new rrle_3(this);
        this.id_break[0] = var10;
    }

    public boolean id_this() {
        return !this.aJ_() || ((gm_3)FreeCamera.id_import.id_class[56]).E() != rYB.id_protected;
    }

    @EventTarget
    public void id_class(rrAX var1) {
        this.id_return();
        if (this.id_continue()) {
            var1.id_class(new PX(((rrlU_2)this.id_break[5]).id_throws(), ((rrlU_2)this.id_break[5]).id_case()));
        }
    }

    @EventTarget
    public void id_class(rrAO var1) {
        if (this.id_continue()) {
            var1.id_class(true);
        }
    }

    @EventTarget
    public void id_class(rrAz_1 var1) {
        an_3 var2 = id_import.id_catch();
        float var3 = var1.id_case();
        double var4 = var1.id_protected();
        ly_3 var6 = ((Hh_1)FreeCamera.id_import.id_class[16]).id_finally();
        rjU_2 var7 = var6.id_break();
        rjG_2 var8 = var2.id_class(var7, var2.id_class(var6.id_throws(), var6.id_protected(), var3), var4, false);
        var1.id_class(var8);
        var1.id_class(new PX(var6.id_throws(), var6.id_protected()));
        var1.id_class(var7);
        var1.id_class(var2.rN().id_throws(var2.Ps()).id_protected(var7));
    }

    @EventTarget
    public void id_class(rrFK var1) {
        this.id_byte(false);
    }

    @EventTarget
    public void id_class(rrLw_1 var1) {
        this.id_return();
        if ((VZ)((Object)this.id_break[6]) != null && var1.id_break() != (VZ)((Object)this.id_break[6])) {
            var1.id_class(true);
        }
    }

    @EventTarget
    public void id_class(rrLt_1 var1) {
        this.id_return();
        var1.id_class((rjU_2)this.id_break[3]);
        var1.id_break((rjU_2)this.id_break[4]);
        var1.id_class(true);
    }

    @EventTarget
    public void id_class(rrAM var1) {
        this.id_byte(false);
    }

    private rjU_2 id_class(rjU_2 var1, int var2) {
        var1.id_byte(new rjU_2(0.0, 1.0, 0.0)).id_protected();
        return rjU_2.id_class(var2);
    }

    @EventTarget
    public void id_class(rrAh_1 var1) {
        if (this.id_continue()) {
            var1.id_class(true);
        }
    }

    @Override
    public void id_class(boolean var1) {
        this.id_return();
        super.id_class(var1);
        if ((cb_3)FreeCamera.id_import.id_class[57] != null) {
            rrlU_2 var7 = new rrlU_2(((cb_3)FreeCamera.id_import.id_class[57]).rx(), ((cb_3)FreeCamera.id_import.id_class[57]).re(), ((cb_3)FreeCamera.id_import.id_class[57]).BO(), ((Float)((cb_3)FreeCamera.id_import.id_class[57]).id_throws[15]).floatValue(), ((Float)((cb_3)FreeCamera.id_import.id_class[57]).id_throws[16]).floatValue(), ((cb_3)FreeCamera.id_import.id_class[57]).BL());
            this.id_break[5] = var7;
            rjU_2 var8 = ((cb_3)FreeCamera.id_import.id_class[57]).Ps();
            this.id_break[3] = var8;
            rjU_2 var9 = (rjU_2)this.id_break[3];
            this.id_break[4] = var9;
            VZ var2 = ((Qw_1)FreeCamera.id_import.id_class[20]).id_volatile();
            ((Qw_1)FreeCamera.id_import.id_class[20]).id_class(VZ.THIRD_PERSON_BACK);
            this.id_break[6] = var2;
            RenderSystem.recordRenderCall(() -> ((yX_2)FreeCamera.id_import.id_class[8]).id_throws());
        }
        this.id_super().aI_();
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_return();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            if ((Integer)((cb_3)FreeCamera.id_import.id_class[57]).id_private[10] > 0 && ((rrIk_1)this.id_break[2]).id_class().booleanValue()) {
                this.id_byte(true);
            }
            rjU_2 var9 = (rjU_2)this.id_break[4];
            this.id_break[3] = var9;
            float var2 = ((Float)((rrIm_1)this.id_break[1]).id_byte()).floatValue();
            rjU_2 var3 = ((cb_3)FreeCamera.id_import.id_class[57]).id_byte(0.0f, ((Float)((cb_3)FreeCamera.id_import.id_class[57]).id_throws[15]).floatValue()).id_class(var2);
            rjU_2 var4 = new rjU_2(0.0, 1.0, 0.0).id_class(var2);
            if (((Qw_1)FreeCamera.id_import.id_class[20]).h.id_protected()) {
                rjU_2 var10 = ((rjU_2)this.id_break[4]).id_throws(var3);
                this.id_break[4] = var10;
            }
            if (((Qw_1)FreeCamera.id_import.id_class[20]).J.id_protected()) {
                rjU_2 var11 = ((rjU_2)this.id_break[4]).id_protected(var3);
                this.id_break[4] = var11;
            }
            if (((Qw_1)FreeCamera.id_import.id_class[20]).X.id_protected()) {
                rjU_2 var12 = ((rjU_2)this.id_break[4]).id_throws(this.id_class(var3, -1).id_class(var2));
                this.id_break[4] = var12;
            }
            if (((Qw_1)FreeCamera.id_import.id_class[20]).x.id_protected()) {
                rjU_2 var13 = ((rjU_2)this.id_break[4]).id_throws(this.id_class(var3, 1).id_class(var2));
                this.id_break[4] = var13;
            }
            if (((Qw_1)FreeCamera.id_import.id_class[20]).d.id_protected()) {
                rjU_2 var14 = ((rjU_2)this.id_break[4]).id_throws(new rjU_2(0.0, 1.0, 0.0).id_class(var2));
                this.id_break[4] = var14;
            } else if (((Qw_1)FreeCamera.id_import.id_class[20]).k.id_protected()) {
                rjU_2 var15 = ((rjU_2)this.id_break[4]).id_protected(var4);
                this.id_break[4] = var15;
            }
        }
    }

    @EventTarget
    public void id_class(rrnB_2 var1) {
        this.id_return();
        Ml_1 var2 = var1.id_class();
        rrZO var3 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_class();
        ly_3 var4 = ((Hh_1)FreeCamera.id_import.id_class[16]).id_finally();
        rjU_2 var5 = var4.id_break();
        float var6 = (float)id_const.id_new() / 4.0f;
        float var7 = (float)id_const.id_continue() / 4.0f + 13.0f;
        if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_new()) {
            var3.id_class(var2, "Camera Pos: " + String.valueOf((Object)rgF_2.GRAY) + (int)var5.id_class() + " " + (int)var5.id_break() + " " + (int)var5.id_byte(), var6, var7, rrZF.d_, false);
            var7 += (float)(var3.id_class() + 5);
        }
        var3.id_class(var2, "vclip: " + String.valueOf((Object)rgF_2.GRAY) + (int)((double)var4.id_byte().c_() - ((rrlU_2)this.id_break[5]).id_byte()), var6, var7, rrZF.d_, false);
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_return();
        super.id_throws(var1);
        rjU_2 var6 = rjU_2.id_class;
        this.id_break[3] = var6;
        rjU_2 var7 = rjU_2.id_class;
        this.id_break[4] = var7;
        rrlU_2 var8 = (rrlU_2)rrlU_2.id_break[0];
        this.id_break[5] = var8;
        if ((VZ)((Object)this.id_break[6]) != null) {
            ((Qw_1)FreeCamera.id_import.id_class[20]).id_class((VZ)((Object)this.id_break[6]));
            Object var9 = null;
            this.id_break[6] = var9;
        }
        RenderSystem.recordRenderCall(() -> ((yX_2)FreeCamera.id_import.id_class[8]).id_throws());
        this.id_super().aK_();
    }

    public boolean id_continue() {
        return !rrfZ_2.id_protected();
    }

    public boolean id_else() {
        return this.aJ_() && ((gm_3)FreeCamera.id_import.id_class[56]).E() == rYB.id_protected;
    }

    public rrlU_2 id_new() {
        this.id_return();
        return (rrlU_2)this.id_break[5];
    }

    private void id_return() {
        if (this.id_break == null) {
            this.id_break = new Object[7];
        }
    }

    public rrTF<FreeCamera> id_super() {
        this.id_return();
        return (rrTF)this.id_break[0];
    }
}

