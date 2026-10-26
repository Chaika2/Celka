/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.combat;

import celestial.Ax_1;
import celestial.C_throws;
import celestial.Ml_1;
import celestial.OH;
import celestial.PX;
import celestial.Y;
import celestial.an_3;
import celestial.cG_2;
import celestial.cM_2;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.event.RenderEvent;
import celestial.gm_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.ju_3;
import celestial.lD_2;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfl_3;
import celestial.rjU_2;
import celestial.rjV_2;
import celestial.rjY_2;
import celestial.rqO_2;
import celestial.rrAF;
import celestial.rrAM;
import celestial.rrAR;
import celestial.rrAS;
import celestial.rrCP;
import celestial.rrCr_1;
import celestial.rrCs_1;
import celestial.rrIQ;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrLe_1;
import celestial.rrLu_1;
import celestial.rrQK;
import celestial.rrQX;
import celestial.rrTA;
import celestial.rrTH;
import celestial.rrTf_1;
import celestial.rrTj_1;
import celestial.rrTp_1;
import celestial.rrTq_1;
import celestial.rrfH_2;
import celestial.rrfP_2;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrjZ_2;
import celestial.rrnD_2;
import celestial.rrnF_2;
import celestial.rrnK_2;
import celestial.rrnL_2;
import celestial.rrna_3;
import celestial.rrne_3;
import celestial.setting.CheckGroup;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import celestial.xc_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public class AttackAura
extends Module
implements rrnF_2,
rrnL_2 {
    public Object[] id_break;
    private rrIk_1 celestialSilentRotation;

    public rrIk_1 id_boolean() {
        this.u();
        return (rrIk_1)this.id_break[29];
    }

    public boolean id_char() {
        return false;
    }

    public rrnD_2 id_long() {
        this.u();
        return (rrnD_2)this.id_break[8];
    }

    public boolean id_float() {
        this.u();
        return ((String)this.S().id_byte()).equals("Legit") || (rrnK_2)this.id_break[5] == (rrCs_1)this.id_break[3];
    }

    public rrIk_1 id_double() {
        this.u();
        return (rrIk_1)this.id_break[22];
    }

    public AttackAura() {
        super("Attack Aura", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0431\u044c\u0435\u0442 \u043e\u043a\u0440\u0443\u0436\u0430\u044e\u0449\u0438\u0445\n\u0432\u0430\u0441 \u0441\u0443\u0449\u0435\u0441\u0442\u0432", Category.COMBAT);
        this.u();
        rqO_2 var5 = new rqO_2("celestial/images/glow.png");
        this.id_break[4] = var5;
        rrfP_2 var6 = new rrfP_2();
        this.id_break[6] = var6;
        CheckGroup var7 = new CheckGroup().id_catch(true).id_case(true).id_throws(false).id_implements(false).id_byte(false).id_protected(false).id_class(true);
        this.id_break[7] = var7;
        rrnD_2 var8 = new rrnD_2(this);
        this.id_break[8] = var8;
        rrIQ var9 = new rrIQ("\u0421\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u043a\u0430", "\u0423\u043c\u043d\u0430\u044f", "\u0423\u043c\u043d\u0430\u044f", "\u041f\u043e\u043b\u0435 \u0437\u0440\u0435\u043d\u0438\u044f", "\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f", "\u0417\u0434\u043e\u0440\u043e\u0432\u044c\u0435");
        this.id_break[9] = var9;
        rrIQ var10 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "Funtime", "Funtime", "Matrix", "Snap", "SpookyTime");
        this.id_break[10] = var10;
        rrIQ var11 = (rrIQ)new rrIQ("\u041e\u0431\u0445\u043e\u0434 \u0441\u043f\u0440\u0438\u043d\u0442\u0430", "Funtime", "Funtime", "Legit").id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.u();
            rrnD_2 var10000 = (rrnD_2)this.id_break[8];
            Integer var7x = 0;
            var10000.id_break[6] = var7x;
            var10000 = (rrnD_2)this.id_break[8];
            Integer var8x = 0;
            var10000.id_break[7] = var8x;
        });
        this.id_break[11] = var11;
        rrIQ var12 = new rrIQ("\u0420\u0435\u0436\u0438\u043c", "\u041d\u0435\u0437\u0430\u043c\u0435\u0442\u043d\u044b\u0439", "\u041d\u0435\u0437\u0430\u043c\u0435\u0442\u043d\u044b\u0439", "\u0421\u0442\u0440\u043e\u0433\u0438\u0439", "\u0422\u0430\u0440\u0433\u0435\u0442", "\u0421\u0432\u043e\u0431\u043e\u0434\u043d\u044b\u0439");
        this.id_break[12] = var12;
        rrIk_1 var13 = (rrIk_1)new rrIk_1("\u0422\u0430\u0440\u0433\u0435\u0442\u0438\u0442\u044c \u0435\u0441\u043b\u0438 \u0443 \u0446\u0435\u043b\u0438\n\u043b\u0443\u043a, \u0430\u0440\u0431\u0430\u043b\u0435\u0442 \u0438\u043b\u0438 \u0442\u0440\u0435\u0437\u0443\u0431\u0435\u0446", false).id_class(() -> {
            this.u();
            return !((String)((rrIQ)this.id_break[12]).id_byte()).equals("\u0422\u0430\u0440\u0433\u0435\u0442");
        });
        this.id_break[13] = var13;
        rrIk_1 var14 = (rrIk_1)new rrIk_1("\u0417\u0430\u0445\u043e\u0434\u0438\u0442\u044c \u0437\u0430 \u0441\u043f\u0438\u043d\u0443 \u0446\u0435\u043b\u0438", true).id_class(() -> {
            this.u();
            return ((String)((rrIQ)this.id_break[12]).id_byte()).equals("\u0422\u0430\u0440\u0433\u0435\u0442") || ((rrIk_1)this.id_break[13]).id_class() != false;
        });
        this.id_break[14] = var14;
        rrIm_1 var15 = (rrIm_1)new rrIm_1("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0437\u0430 \u0441\u043f\u0438\u043d\u043e\u0439", Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(2.5f), Float.valueOf(0.1f)).id_class(() -> ((rrIk_1)this.id_break[14]).id_class());
        this.id_break[15] = var15;
        rrIm_1 var16 = new rrIm_1("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u0443\u0434\u0430\u0440\u0430", Float.valueOf(3.0f), Float.valueOf(1.0f), Float.valueOf(6.0f), Float.valueOf(0.1f));
        this.id_break[16] = var16;
        rrIm_1 var17 = new rrIm_1("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u043d\u0430\u0432\u043e\u0434\u043a\u0438", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(32.0f), Float.valueOf(0.5f));
        this.id_break[17] = var17;
        rrIk_1 var18 = new rrIk_1("\u0422\u043e\u043b\u044c\u043a\u043e \u043a\u0440\u0438\u0442\u044b", true);
        this.id_break[18] = var18;
        rrIk_1 var19 = (rrIk_1)new rrIk_1("\u0422\u043e\u043b\u044c\u043a\u043e \u0441 \u043f\u0440\u043e\u0431\u0435\u043b\u043e\u043c", false).id_class(() -> ((rrIk_1)this.id_break[18]).id_class());
        this.id_break[19] = var19;
        rrIk_1 var20 = new rrIk_1("\u041e\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0442\u044c \u043f\u0440\u0438\n\u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0438 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430", false);
        this.id_break[20] = var20;
        rrIk_1 var21 = (rrIk_1)new rrIk_1("\u041e\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0442\u044c \u043f\u0440\u0438\n\u043e\u0442\u043a\u0440\u044b\u0442\u043e\u043c \u043a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440\u0435", false).id_class(() -> ((rrIk_1)this.id_break[18]).id_class());
        this.id_break[21] = var21;
        rrIk_1 var22 = new rrIk_1("\u0411\u0438\u0442\u044c \u0447\u0435\u0440\u0435\u0437 \u0449\u0438\u0442", true);
        this.id_break[22] = var22;
        rrIk_1 var23 = new rrIk_1("\u0411\u0438\u0442\u044c \u0447\u0435\u0440\u0435\u0437 \u0441\u0442\u0435\u043d\u044b", true);
        this.id_break[23] = var23;
        rrIk_1 var24 = (rrIk_1)new rrIk_1("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f \u043f\u043e\u0434 Grim", false).id_class(() -> (rrfq_3)((Object)((Object)rrfp_3.id_class[1])) != (rrfq_3)((Object)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2])) && (rrfq_3)((Object)((Object)rrfp_3.id_class[1])) != (rrfq_3)((Object)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4])));
        this.id_break[24] = var24;
        rrIk_1 var25 = (rrIk_1)new rrIk_1("\u0423\u0431\u0438\u0440\u0430\u0442\u044c \u0438\u043d\u0442\u0435\u0440\u043f\u043e\u043b\u044f\u0446\u0438\u044e \u0443\n\u044d\u043d\u0442\u0438\u0442\u0438", false).id_class(() -> (rrfq_3)((Object)((Object)rrfp_3.id_class[1])) != (rrfq_3)((Object)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2])));
        this.id_break[25] = var25;
        rrIk_1 var26 = new rrIk_1("\u0423\u0431\u0438\u0440\u0430\u0442\u044c \u0432\u0437\u0430\u0438\u043c\u043e\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0435 \u0441\n\u0431\u043b\u043e\u043a\u0430\u043c\u0438 \u0438 \u044d\u043d\u0442\u0438\u0442\u0438", true);
        this.id_break[26] = var26;
        rrIk_1 var27 = new rrIk_1("\u041b\u043e\u043c\u0430\u0442\u044c \u0449\u0438\u0442", true);
        this.id_break[27] = var27;
        rrIk_1 var28 = new rrIk_1("\u0422\u0430\u0440\u0433\u0435\u0442-HUD", true);
        this.id_break[28] = var28;
        rrIk_1 var29 = new rrIk_1("ESP", true);
        this.id_break[29] = var29;
        lD_2 var30 = new lD_2(256);
        this.id_break[30] = var30;
        AnimValue var31 = new AnimValue((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[3]), 0.5f, false);
        this.id_break[33] = var31;
        rrne_3 var32 = new rrne_3();
        this.id_break[35] = var32;
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_break((rrne_3)this.id_break[35]);
        this.id_break[34] = new GroupSetting("\u041e\u0431\u0445\u043e\u0434\u044b", (rrIQ)this.id_break[10], (rrIQ)this.id_break[11]);
        this.id_class(new GroupSetting("\u0426\u0435\u043b\u0438", new rrIc_1("\u0412\u044b\u0431\u043e\u0440", ((CheckGroup)this.id_break[7]).id_byte()), (rrIQ)this.id_break[9]), new GroupSetting("\u041e\u0431\u0445\u043e\u0434\u044b", (rrIQ)this.id_break[10], (rrIQ)this.id_break[11]), new GroupSetting("\u041a\u043e\u0440\u0440\u0435\u043a\u0446\u0438\u044f \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f", (rrIQ)this.id_break[12], (rrIk_1)this.id_break[13], (rrIk_1)this.id_break[14], (rrIm_1)this.id_break[15]), new GroupSetting("\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u0438", (rrIm_1)this.id_break[16], (rrIm_1)this.id_break[17]), new GroupSetting("\u0423\u0434\u0430\u0440\u044b", (rrIk_1)this.id_break[18], (rrIk_1)this.id_break[23], (rrIk_1)this.id_break[27], (rrIk_1)this.id_break[22], (rrIk_1)this.id_break[20], (rrIk_1)this.id_break[21]), new GroupSetting("\u041a\u0440\u0438\u0442\u044b", new Setting[]{(rrIk_1)this.id_break[19]}), new GroupSetting("\u0412\u0438\u0437\u0443\u0430\u043b\u044b", new Setting[]{new rrIc_1("\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c", (rrIk_1)this.id_break[28], (rrIk_1)this.id_break[29])}), new GroupSetting("\u0414\u0440\u0443\u0433\u0438\u0435", (rrIk_1)this.id_break[24], (rrIk_1)this.id_break[25], (rrIk_1)this.id_break[26]));
        rrCr_1 var34 = new rrCr_1(this);
        this.id_break[0] = var34;
        rrCP var35 = new rrCP(this);
        this.id_break[1] = var35;
        rrna_3 var36 = new rrna_3(this);
        this.id_break[2] = var36;
        rrCs_1 var37 = new rrCs_1(this);
        this.id_break[3] = var37;
        rrna_3 var38 = (rrna_3)this.id_break[2];
        this.id_break[5] = var38;
        ((rrIQ)this.id_break[10]).id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.u();
            if ((rrnK_2)this.id_break[5] != null && this.aJ_()) {
                ((rrnK_2)this.id_break[5]).aK_();
            }
            rrCr_1 var9x = switch ((String)var2.getLeft()) {
                case "Matrix" -> (rrCr_1)this.id_break[0];
                case "Snap" -> (rrCP)this.id_break[1];
                case "Funtime" -> (rrna_3)this.id_break[2];
                case "SpookyTime" -> (rrCs_1)this.id_break[3];
                default -> null;
            };
            this.id_break[5] = var9x;
            if ((rrnK_2)this.id_break[5] != null && this.aJ_()) {
                ((rrnK_2)this.id_break[5]).aI_();
            }
        });
        ((rrIm_1)this.id_break[17]).id_class(() -> {
            this.u();
            return !this.M() && (rrnK_2)this.id_break[5] != (rrna_3)this.id_break[2];
        });
        ((rrIQ)this.id_break[11]).id_class(() -> {
            this.u();
            return (rrnK_2)this.id_break[5] != (rrCs_1)this.id_break[3];
        });
        ((rrIk_1)this.id_break[23]).id_class(() -> {
            this.u();
            return (rrfq_3)((Object)((Object)rrfp_3.id_class[1])) != (rrfq_3)((Object)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4])) || (rrnK_2)this.id_break[5] != (rrCs_1)this.id_break[3];
        });
        ((rrIk_1)this.id_break[20]).id_class(() -> {
            this.u();
            return (rrfq_3)((Object)((Object)rrfp_3.id_class[1])) != (rrfq_3)((Object)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4])) || (rrnK_2)this.id_break[5] != (rrCs_1)this.id_break[3];
        });
        ((rrIk_1)this.id_break[21]).id_class(() -> {
            this.u();
            return (rrfq_3)((Object)((Object)rrfp_3.id_class[1])) != (rrfq_3)((Object)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4])) || (rrnK_2)this.id_break[5] != (rrCs_1)this.id_break[3];
        });
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(new OH<Object>(RenderEvent.class, var1 -> {
            this.u();
            ((AnimValue)this.id_break[33]).id_class((iB_2)this.id_break[31] != null && ((rrIk_1)this.id_break[29]).id_class() != false);
            if ((iB_2)this.id_break[32] != null && ((AnimValue)this.id_break[33]).id_case()) {
                this.id_class((RenderEvent)var1, (iB_2)this.id_break[32], ((AnimValue)this.id_break[33]).id_byte());
            }
        }));
        this.celestialSilentRotation = new rrIk_1("Silent", true);
        this.id_class(new Setting[]{this.celestialSilentRotation});
    }

    public boolean B() {
        return this.id_else().id_class() == false || !C_throws.id_byte().id_return().id_class();
    }

    public rrIQ S() {
        this.u();
        return (rrIQ)this.id_break[11];
    }

    public rrIk_1 id_this() {
        this.u();
        return (rrIk_1)this.id_break[27];
    }

    public boolean s() {
        return (rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) && this.id_void();
    }

    private void h() {
        this.u();
        if (((rrIk_1)this.id_break[25]).id_class().booleanValue()) {
            for (cG_2 var2 : ((gm_3)AttackAura.id_import.id_class[56]).id_continue()) {
                if (!(var2 instanceof cM_2)) continue;
                cM_2 var3 = (cM_2)var2;
                var3.id_else();
            }
        }
    }

    private void l() {
        this.u();
        this.id_break(this.id_long().id_class((CheckGroup)this.id_break[7]));
    }

    private void d() {
        this.u();
        if (((rrIk_1)this.id_break[25]).id_class().booleanValue()) {
            for (cG_2 var2 : ((gm_3)AttackAura.id_import.id_class[56]).id_continue()) {
                if (!(var2 instanceof cM_2)) continue;
                cM_2 var3 = (cM_2)var2;
                var3.id_public();
            }
        }
    }

    public rrIQ id_interface() {
        this.u();
        return (rrIQ)this.id_break[9];
    }

    public void id_class(iB_2 var1) {
        this.u();
        this.id_break[32] = var1;
    }

    @Override
    public float id_class(rjU_2 var1, rjU_2 var2) {
        return this.P().id_class(var1, var2);
    }

    @EventTarget
    public void id_class(rrAS var1) {
        this.u();
        if ((Integer)((rrnD_2)this.id_break[8]).id_break[5] > 0) {
            var1.id_class(true);
        }
    }

    @Override
    public List<rrTA> id_class(an_3 var1, rfl_3 var2) {
        return this.P().id_class(var1, var2);
    }

    private void id_class(Pair<iM_2, iM_2> var1) {
        this.u();
        if (var1 != null && (iB_2)this.id_break[31] != null) {
            ((cb_3)AttackAura.id_import.id_class[57]).id_class((iM_2)((Object)var1.getLeft()));
            ((iB_2)this.id_break[31]).id_class((iM_2)((Object)var1.getRight()));
        }
    }

    @Override
    public Pair<rrTA, rrTA> id_class(an_3 var1, PX var2) {
        return this.P().id_class(var1, var2);
    }

    @EventTarget
    public void id_class(rrAF var1) {
        this.u();
        if ((Integer)((rrnD_2)this.id_break[8]).id_break[6] > 0) {
            var1.id_class(false);
        }
    }

    @Override
    public boolean id_class(PX var1) {
        return this.P().id_class(var1);
    }

    @EventTarget
    public void id_class(rrAM var1) {
        this.id_break((iB_2)null);
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.u();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            if ((Integer)((rrnD_2)this.id_break[8]).id_break[5] > 0 && ((cb_3)AttackAura.id_import.id_class[57]).BL()) {
                rrnD_2 var10000 = (rrnD_2)this.id_break[8];
                Integer var7 = (Integer)((rrnD_2)this.id_break[8]).id_break[5] - 1;
                var10000.id_break[5] = var7;
            }
            if ((Integer)((rrnD_2)this.id_break[8]).id_break[6] > 0) {
                rrnD_2 var9 = (rrnD_2)this.id_break[8];
                Integer var8 = (Integer)((rrnD_2)this.id_break[8]).id_break[6] - 1;
                var9.id_break[6] = var8;
            }
            if (((Ax_1)AttackAura.id_import.id_class[55]).id_finally()) {
                this.id_break((iB_2)null);
                return;
            }
            this.h();
            this.l();
            Pair<iM_2, iM_2> var2 = this.m();
            this.P().id_class(var1);
            this.celestialApplyClientRotation();
            this.id_class(var2);
            this.d();
            ((rrfP_2)this.id_break[6]).id_class(System.currentTimeMillis() - ((rrnD_2)this.id_break[8]).id_protected() > 200L);
        } else {
            this.P().id_class(var1);
            this.celestialApplyClientRotation();
        }
    }

    private void id_class(RenderEvent var1, iB_2 var2, float var3) {
        this.u();
        Ml_1 var4 = var1.id_class();
        float var5 = var1.id_byte();
        double var6 = rrjZ_2.id_protected(var2, var5);
        double var8 = rrjZ_2.id_break(var2, var5);
        double var10 = rrjZ_2.id_byte(var2, var5);
        float var12 = var2.Bm() / 2.0f + 0.2f;
        float var13 = var2.PN();
        int var14 = (int)(255.0f * var3);
        int var15 = 14;
        double var16 = (double)System.currentTimeMillis() / 1000.0;
        double var18 = var16 * 3.0 % Math.PI * 2.0;
        double var20 = Math.toRadians(0.0);
        double var22 = Math.toRadians(60.0);
        double var24 = (var22 - var20) / (double)var15;
        RenderSystem.disableCull();
        RenderSystem.disableAlphaTest();
        RenderSystem.disableDepthTest();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(770, 1);
        id_static.id_class((rqO_2)this.id_break[4]);
        id_strictfp.id_class(7, ju_3.id_public);
        rjY_2 var26 = id_void.id_byte();
        double var27 = id_void.id_case();
        double var29 = id_void.id_catch();
        double var31 = id_void.id_private();
        for (int var33 = 0; var33 < 4; ++var33) {
            double var34 = var16 + (double)(var33 * 15);
            double var36 = (double)var33 * Math.PI / 2.0;
            for (int var38 = 0; var38 <= var15; ++var38) {
                double var39 = var20 + (double)var38 * var24;
                var4.id_class();
                double var41 = var39 + var18 + var36;
                double var43 = var6 + (double)var13 * Math.cos(var41);
                double var45 = var8 + Math.sin(var34 + var39 + (double)var33) * 0.7 + (double)var12;
                double var47 = var10 + (double)var13 * Math.sin(var41);
                float var49 = 0.4f * (0.5f + (float)var38 / (float)var15);
                int var50 = ColorHelper.id_class((float)(var38 * var15), var14);
                var4.id_class(var43 - var27, var45 - var29, var47 - var31);
                var4.id_class(var26);
                var4.id_class(var49, var49, var49);
                rjV_2 var51 = var4.id_byte().id_class();
                id_strictfp.id_class(var51, -0.5f, -0.5f, 0.0f).id_class(0.0f, 0.0f).id_class(var50).id_class();
                id_strictfp.id_class(var51, 0.5f, -0.5f, 0.0f).id_class(1.0f, 0.0f).id_class(var50).id_class();
                id_strictfp.id_class(var51, 0.5f, 0.5f, 0.0f).id_class(1.0f, 1.0f).id_class(var50).id_class();
                id_strictfp.id_class(var51, -0.5f, 0.5f, 0.0f).id_class(0.0f, 1.0f).id_class(var50).id_class();
                var4.id_break();
            }
        }
        id_default.id_break();
        RenderSystem.blendFunc(770, 771);
        RenderSystem.enableDepthTest();
        RenderSystem.enableTexture();
        RenderSystem.enableAlphaTest();
        RenderSystem.enableCull();
    }

    @EventTarget
    public void id_class(rrAR var1) {
        this.u();
        if (((rrIk_1)this.id_break[26]).id_class().booleanValue() && (iB_2)this.id_break[31] != null) {
            var1.id_class(true);
        }
    }

    @Override
    public boolean id_class(xc_3 var1) {
        this.u();
        return ((rrnK_2)this.id_break[5]).id_class(var1);
    }

    @Override
    public void id_class(boolean var1) {
        if (this.P().aI_()) {
            super.id_class(var1);
        }
    }

    @EventTarget
    public void id_class(rrLu_1 var1) {
        this.u();
        ((rrfP_2)this.id_break[6]).id_class(var1);
    }

    @EventTarget
    public void id_class(rrLe_1 var1) {
        this.u();
        if (((rrIk_1)this.id_break[26]).id_class().booleanValue() && (iB_2)this.id_break[31] != null) {
            var1.id_class(true);
        }
    }

    private Pair<iM_2, iM_2> m() {
        this.u();
        if (!((rrIk_1)this.id_break[24]).id_class().booleanValue()) {
            return null;
        }
        iM_2 var1 = null;
        iM_2 var2 = null;
        if ((iB_2)this.id_break[31] != null) {
            var1 = ((cb_3)AttackAura.id_import.id_class[57]).Pb();
            var2 = ((iB_2)this.id_break[31]).Pb();
            if (((cb_3)AttackAura.id_import.id_class[57]).id_class((iB_2)this.id_break[31], iM_2.STANDING, ((iB_2)this.id_break[31]).Pb()) > ((cb_3)AttackAura.id_import.id_class[57]).id_class((iB_2)this.id_break[31], iM_2.FALL_FLYING, iM_2.STANDING)) {
                ((cb_3)AttackAura.id_import.id_class[57]).id_class(iM_2.FALL_FLYING);
                ((iB_2)this.id_break[31]).id_class(iM_2.STANDING);
            } else {
                ((cb_3)AttackAura.id_import.id_class[57]).id_class(iM_2.STANDING);
                ((iB_2)this.id_break[31]).id_class(var2);
            }
        }
        return Pair.of(var1, var2);
    }

    public Y id_default() {
        return (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]);
    }

    public boolean id_short() {
        return false;
    }

    public boolean id_void() {
        this.u();
        return this.P() == (rrCs_1)this.id_break[3];
    }

    private void u() {
        if (this.id_break == null) {
            this.id_break = new Object[36];
        }
    }

    public rrIm_1 r() {
        this.u();
        return (rrIm_1)this.id_break[16];
    }

    @Override
    public float id_break() {
        return this.P().id_byte();
    }

    @Override
    public float id_break(rjU_2 var1, rjU_2 var2) {
        return this.P().id_break(var1, var2);
    }

    public void id_break(iB_2 var1) {
        this.u();
        if (var1 == null && (iB_2)this.id_break[31] != null) {
            this.P().id_volatile();
        }
        this.id_break[31] = var1;
        if ((iB_2)this.id_break[31] != null) {
            iB_2 var7 = (iB_2)this.id_break[31];
            this.id_break[32] = var7;
        }
    }

    @Override
    public boolean id_break(PX var1) {
        return this.P().id_break(var1);
    }

    @Override
    public void id_throws(boolean var1) {
        this.u();
        rrnK_2 var2 = this.P();
        if (var2.aK_()) {
            super.id_throws(var1);
            this.id_break((iB_2)null);
        }
        var2.id_throws();
        ((rrnD_2)this.id_break[8]).id_byte();
    }

    private boolean M() {
        return this.P().id_break();
    }

    public rrnK_2 P() {
        this.u();
        return (rrnK_2)this.id_break[5];
    }

    @Override
    public rrTp_1 id_catch() {
        this.u();
        if (((rrIk_1)this.id_break[13]).id_class().booleanValue() && (iB_2)this.id_break[31] != null) {
            for (rdn_3 var4 : rrfH_2.id_class((iB_2)this.id_break[31])) {
                if (var4.id_break() != rdy_3.OM && var4.id_break() != rdy_3.kU && var4.id_break() != rdy_3.kY) continue;
                return (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[2]);
            }
        }
        return switch ((String)((rrIQ)this.id_break[12]).id_byte()) {
            case "\u041d\u0435\u0437\u0430\u043c\u0435\u0442\u043d\u044b\u0439" -> (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[0]);
            case "\u0421\u0442\u0440\u043e\u0433\u0438\u0439" -> (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[1]);
            case "\u0422\u0430\u0440\u0433\u0435\u0442" -> (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[2]);
            default -> (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3]);
        };
    }

    public float G() {
        this.u();
        if (this.id_short()) {
            return Float.MAX_VALUE;
        }
        return !this.M() && (rrnK_2)this.id_break[5] != (rrna_3)this.id_break[2] ? this.id_try() + ((Float)((rrIm_1)this.id_break[17]).id_byte()).floatValue() : this.id_try();
    }

    public rrIQ id_goto() {
        this.u();
        return (rrIQ)this.id_break[10];
    }

    public rrfP_2 id_const() {
        this.u();
        return (rrfP_2)this.id_break[6];
    }

    public iB_2 id_continue() {
        this.u();
        return (iB_2)this.id_break[31];
    }

    public rrIk_1 id_else() {
        this.u();
        return (rrIk_1)this.id_break[21];
    }

    public rrne_3 id_for() {
        this.u();
        return (rrne_3)this.id_break[35];
    }

    public rrIk_1 id_import() {
        this.u();
        return (rrIk_1)this.id_break[19];
    }

    public rrIk_1 id_instanceof() {
        this.u();
        return (rrIk_1)this.id_break[20];
    }

    public lD_2 id_new() {
        this.u();
        return (lD_2)this.id_break[30];
    }

    public rrIQ id_return() {
        this.u();
        return (rrIQ)this.id_break[12];
    }

    public rrIk_1 id_super() {
        this.u();
        return (rrIk_1)this.id_break[26];
    }

    public rrIk_1 id_switch() {
        this.u();
        return (rrIk_1)this.id_break[23];
    }

    public boolean id_throw() {
        this.u();
        return ((rrIk_1)this.id_break[24]).id_class();
    }

    public float id_try() {
        this.u();
        return ((Float)((rrIm_1)this.id_break[16]).id_byte()).floatValue();
    }

    public rrIm_1 id_while() {
        this.u();
        return (rrIm_1)this.id_break[17];
    }

    public GroupSetting id_static() {
        this.u();
        return (GroupSetting)this.id_break[34];
    }

    public rrIk_1 id_public() {
        this.u();
        return (rrIk_1)this.id_break[18];
    }

    @Override
    public float id_private() {
        return this.P().id_int();
    }

    public rrIk_1 id_abstract() {
        this.u();
        return (rrIk_1)this.id_break[28];
    }

    public rrIk_1 id_transient() {
        this.u();
        return (rrIk_1)this.id_break[25];
    }

    @Override
    public iB_2 id_native() {
        this.u();
        return ((rrIk_1)this.id_break[28]).id_class() == false ? null : this.id_continue();
    }

    public rrIk_1 id_strictfp() {
        this.u();
        return (rrIk_1)this.id_break[24];
    }

    public iB_2 E() {
        this.u();
        return (iB_2)this.id_break[32];
    }

    @Override
    public boolean az_() {
        this.u();
        return ((rrIk_1)this.id_break[14]).id_class();
    }

    @Override
    public rrTH aE_() {
        return this.P().id_package();
    }

    @Override
    public rrTf_1 aL_() {
        return this.P().id_protected();
    }

    @Override
    public boolean aC_() {
        this.u();
        return ((rrIk_1)this.id_break[23]).id_class() == false;
    }

    @Override
    public float aD_() {
        this.u();
        return ((Float)((rrIm_1)this.id_break[15]).id_byte()).floatValue();
    }

    @Override
    public rrTq_1 aB_() {
        return this.P().id_case();
    }

    @Override
    public rrTj_1 aF_() {
        return this.P().id_final();
    }

    @Override
    public rrTH aA_() {
        return this.P().id_finally();
    }

    public boolean celestialSilentRotation() {
        return this.celestialSilentRotation.id_class();
    }

    private void celestialApplyClientRotation() {
        PX var1;
        if (!this.celestialSilentRotation() && this.id_continue() != null && (var1 = this.P().id_private()) != null) {
            ((cb_3)AttackAura.id_import.id_class[57]).id_case(var1.id_throws(), var1.id_protected());
        }
    }
}

