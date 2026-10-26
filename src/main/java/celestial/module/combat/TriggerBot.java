/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.module.combat;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.C_throws;
import celestial.Y;
import celestial.an_3;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rLD;
import celestial.rSY;
import celestial.rfo_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjG_2;
import celestial.rmD_2;
import celestial.rmU_2;
import celestial.rqr_3;
import celestial.rrAF;
import celestial.rrAS;
import celestial.rrIQ;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrQX;
import celestial.rrff_3;
import celestial.rrfo_3;
import celestial.rrnL_2;
import celestial.rrvy_1;
import celestial.setting.CheckGroup;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import celestial.vm_3;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public class TriggerBot
extends Module
implements rrnL_2 {
    public static Object[] id_break;
    public Object[] id_byte;

    private void id_char() {
        if (this.id_byte == null) {
            this.id_byte = new Object[18];
            this.id_byte[9] = 0L;
            this.id_byte[10] = false;
            this.id_byte[11] = 0L;
            this.id_byte[12] = 0;
            this.id_byte[13] = 0;
            this.id_byte[14] = 0;
            this.id_byte[15] = 0;
            this.id_byte[16] = false;
            this.id_byte[17] = Float.valueOf(0.0f);
        }
    }

    private void id_byte(iB_2 var1) {
        this.id_char();
        if (var1 != null) {
            this.id_byte[8] = var1;
            Long var7 = System.currentTimeMillis();
            this.id_byte[9] = var7;
        }
        this.id_byte[7] = var1;
    }

    public TriggerBot() {
        super("Trigger Bot", "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0431\u044c\u0435\u0442 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u043e\n\u0435\u0441\u043b\u0438 \u043e\u043d\u043e \u043d\u0430 \u043f\u0440\u0438\u0446\u0435\u043b\u0435", Category.COMBAT);
        this.id_char();
        CheckGroup var5 = new CheckGroup().id_catch(true).id_case(true).id_throws(false).id_implements(false).id_byte(false).id_protected(false).id_class(true);
        this.id_byte[0] = var5;
        rrIQ var6 = (rrIQ)new rrIQ("\u041e\u0431\u0445\u043e\u0434 \u0441\u043f\u0440\u0438\u043d\u0442\u0430", "Funtime", "Funtime", "Legit").id_class("change_mode", (Setting<T> var1, Pair<T, Boolean> var2) -> {
            this.id_char();
            Integer var7x = 0;
            this.id_byte[12] = var7x;
            Integer var8x = 0;
            this.id_byte[14] = var8x;
            Integer var9x = 0;
            this.id_byte[15] = var9x;
            Boolean var10x = false;
            this.id_byte[16] = var10x;
            Float var11x = Float.valueOf(-1.0f);
            this.id_byte[17] = var11x;
        });
        this.id_byte[1] = var6;
        rrIk_1 var7 = new rrIk_1("\u0422\u043e\u043b\u044c\u043a\u043e \u043a\u0440\u0438\u0442\u044b", true);
        this.id_byte[2] = var7;
        rrIk_1 var8 = new rrIk_1("\u041e\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0442\u044c \u043f\u0440\u0438\n\u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0438 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430", false);
        this.id_byte[3] = var8;
        rrIk_1 var9 = new rrIk_1("\u041e\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0442\u044c \u043f\u0440\u0438\n\u043e\u0442\u043a\u0440\u044b\u0442\u043e\u043c \u043a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440\u0435", false);
        this.id_byte[4] = var9;
        rrIk_1 var10 = (rrIk_1)new rrIk_1("\u0422\u043e\u043b\u044c\u043a\u043e \u0441 \u043f\u0440\u043e\u0431\u0435\u043b\u043e\u043c", false).id_class(() -> {
            this.id_char();
            return ((rrIk_1)this.id_byte[2]).id_class();
        });
        this.id_byte[5] = var10;
        rrIk_1 var11 = new rrIk_1("\u0422\u0430\u0440\u0433\u0435\u0442-HUD", true);
        this.id_byte[6] = var11;
        Float var12 = Float.valueOf(-1.0f);
        this.id_byte[17] = var12;
        this.id_class(new GroupSetting("\u0426\u0435\u043b\u0438", new Setting[]{new rrIc_1("\u0412\u044b\u0431\u043e\u0440", ((CheckGroup)this.id_byte[0]).id_byte())}), new GroupSetting("\u041e\u0431\u0445\u043e\u0434\u044b", new Setting[]{(rrIQ)this.id_byte[1]}), new GroupSetting("\u0412\u0438\u0437\u0443\u0430\u043b\u044b", new Setting[]{new rrIc_1("\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0442\u044c", (rrIk_1)this.id_byte[6])}), new GroupSetting("\u0423\u0434\u0430\u0440\u044b", (rrIk_1)this.id_byte[2], (rrIk_1)this.id_byte[3], (rrIk_1)this.id_byte[4]), new GroupSetting("\u041a\u0440\u0438\u0442\u044b", new Setting[]{(rrIk_1)this.id_byte[5]}));
    }

    public Y id_this() {
        return (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]);
    }

    public boolean id_class(an_3 var1) {
        this.id_char();
        if (var1 == ((cb_3)TriggerBot.id_import.id_class[57]).ra()) {
            return false;
        }
        if (var1 == (cb_3)TriggerBot.id_import.id_class[57]) {
            return false;
        }
        if (var1 instanceof rSY) {
            return false;
        }
        return !var1.Pu() ? false : rrff_3.id_class(var1, (CheckGroup)this.id_byte[0]);
    }

    public boolean id_class(float var1, int var2, boolean var3, boolean var4, int var5) {
        this.id_char();
        if (this.id_new() == null) {
            return false;
        }
        if (((rrIk_1)this.id_byte[3]).id_class().booleanValue() && ((cb_3)TriggerBot.id_import.id_class[57]).sL()) {
            return false;
        }
        if (!((rrIk_1)this.id_byte[4]).id_class().booleanValue() || (vm_3)TriggerBot.id_import.id_class[73] == null && !C_throws.id_byte().id_return().id_class()) {
            if (!this.id_class(var1, var2)) {
                return false;
            }
            return ((rrIk_1)this.id_byte[2]).id_class() != false ? this.id_class(var3, var4, var5) : true;
        }
        return false;
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_char();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            rfo_3 var2;
            an_3 var11;
            if ((Integer)this.id_byte[13] > 0 && ((cb_3)TriggerBot.id_import.id_class[57]).BL()) {
                Integer var9 = (Integer)this.id_byte[13] - 1;
                this.id_byte[13] = var9;
            }
            if ((Integer)this.id_byte[12] > 0) {
                Integer var10 = (Integer)this.id_byte[12] - 1;
                this.id_byte[12] = var10;
            }
            this.id_byte(null);
            if (((Ax_1)TriggerBot.id_import.id_class[55]).id_finally()) {
                return;
            }
            rjG_2 var3 = (rjG_2)TriggerBot.id_import.id_class[64];
            if (var3 instanceof rfo_3 && (var11 = (var2 = (rfo_3)var3).id_class()) instanceof iB_2) {
                iB_2 var4 = (iB_2)var11;
                if (this.id_class(var11)) {
                    this.id_byte(var4);
                    this.id_class((iB_2)this.id_byte[7]);
                    if (this.id_goto()) {
                        this.id_break(var4);
                    }
                }
            }
        }
        this.id_break(var1);
    }

    public void id_class(iB_2 var1) {
        this.id_char();
        if (var1 != null && rmD_2.id_break && ((String)((rrIQ)this.id_byte[1]).id_byte()).equals("Legit") && this.id_throw() && this.id_class(2.0f, 50, false, false, 1)) {
            ((cb_3)TriggerBot.id_import.id_class[57]).c_(false);
            Integer var6 = 1;
            this.id_byte[12] = var6;
        }
    }

    @EventTarget
    public void id_class(rrAS var1) {
        this.id_char();
        if ((Integer)this.id_byte[13] > 0) {
            var1.id_class(true);
        }
    }

    @EventTarget
    public void id_class(rrAF var1) {
        this.id_char();
        if ((Integer)this.id_byte[12] > 0) {
            var1.id_class(false);
        }
    }

    public boolean id_class(boolean var1, boolean var2, int var3) {
        rrvy_1 var15;
        List<Float> var7;
        float var5;
        boolean var14;
        this.id_char();
        if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().t().id_new()) {
            return true;
        }
        if (var1 && !this.id_throw()) {
            return true;
        }
        if (var2) {
            double var4 = Math.abs((double)((int)((cb_3)TriggerBot.id_import.id_class[57]).re()) - ((cb_3)TriggerBot.id_import.id_class[57]).re());
            if (var4 == 0.43152384527073195) {
                Integer var12 = 2;
                this.id_byte[13] = var12;
            } else if (var4 == 0.0548933470320776) {
                Integer var13 = 3;
                this.id_byte[13] = var13;
            }
        }
        if (var3 > 0) {
            rrvy_1 var6 = new rrvy_1((cb_3)TriggerBot.id_import.id_class[57]);
            var6.id_class(var3);
            var14 = !var6.BL() && ((Float)var6.id_throws[31]).floatValue() > 0.0f;
            var5 = ((Float)var6.id_throws[31]).floatValue();
        } else {
            var14 = !((cb_3)TriggerBot.id_import.id_class[57]).BL() && ((Float)((cb_3)TriggerBot.id_import.id_class[57]).id_throws[31]).floatValue() > 0.0f;
            var5 = ((Float)((cb_3)TriggerBot.id_import.id_class[57]).id_throws[31]).floatValue();
        }
        if (((String)((rrIQ)this.id_byte[1]).id_byte()).equals("Legit") && ((Boolean)this.id_byte[16]).booleanValue() && ((Float)this.id_byte[17]).floatValue() == var5 && (var7 = (var15 = new rrvy_1((cb_3)TriggerBot.id_import.id_class[57])).id_else()).size() > 1) {
            return false;
        }
        return var14;
    }

    public boolean id_class(float var1, int var2) {
        this.id_char();
        if (!rrfo_3.id_class(var1)) {
            return false;
        }
        return (float)(System.currentTimeMillis() - (Long)this.id_byte[11]) >= 500.0f - (float)var2;
    }

    public boolean id_break(iB_2 var1) {
        this.id_char();
        boolean var2 = ((String)((rrIQ)this.id_byte[1]).id_byte()).equals("Legit");
        if (this.id_throw() && rmD_2.id_break) {
            if (var2) {
                ((cb_3)TriggerBot.id_import.id_class[57]).c_(false);
                if ((Integer)this.id_byte[12] == 0) {
                    Integer var7 = 1;
                    this.id_byte[12] = var7;
                }
                return false;
            }
            ((cb_3)TriggerBot.id_import.id_class[57]).c_(false);
            ((Aq_1)((cb_3)TriggerBot.id_import.id_class[57]).id_break[0]).id_class(new rmD_2((cb_3)TriggerBot.id_import.id_class[57], rmU_2.STOP_SPRINTING));
            Boolean var8 = true;
            this.id_byte[10] = var8;
        }
        ((Ax_1)TriggerBot.id_import.id_class[55]).id_class((rhd_3)((cb_3)TriggerBot.id_import.id_class[57]), (an_3)var1, true);
        if (var2) {
            int var10002 = (Integer)this.id_byte[14] + 1;
            Integer var9 = var10002;
            this.id_byte[14] = var9;
            if (var10002 >= 2) {
                Integer var10 = 0;
                this.id_byte[14] = var10;
                Integer var11 = 1;
                this.id_byte[12] = var11;
            }
            var10002 = (Integer)this.id_byte[15] + 1;
            Integer var12 = var10002;
            this.id_byte[15] = var12;
            if (var10002 >= 14) {
                Boolean var13 = true;
                this.id_byte[16] = var13;
                Float var14 = (Float)((cb_3)TriggerBot.id_import.id_class[57]).id_throws[31];
                this.id_byte[17] = var14;
            }
            if ((Integer)this.id_byte[15] >= 15) {
                Integer var15 = 0;
                this.id_byte[15] = var15;
                Boolean var16 = false;
                this.id_byte[16] = var16;
                Float var17 = Float.valueOf(-1.0f);
                this.id_byte[17] = var17;
            }
        }
        Long var18 = System.currentTimeMillis();
        this.id_byte[11] = var18;
        return true;
    }

    public void id_break(q_1 var1) {
        this.id_char();
        if (var1.id_class() == this.id_this() && ((Boolean)this.id_byte[10]).booleanValue()) {
            ((Aq_1)((cb_3)TriggerBot.id_import.id_class[57]).id_break[0]).id_class(new rmD_2((cb_3)TriggerBot.id_import.id_class[57], rmU_2.START_SPRINTING));
            ((cb_3)TriggerBot.id_import.id_class[57]).c_(true);
            Boolean var6 = false;
            this.id_byte[10] = var6;
        }
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_char();
        super.id_throws(var1);
        this.id_byte(null);
        Integer var6 = 0;
        this.id_byte[13] = var6;
        Integer var7 = 0;
        this.id_byte[12] = var7;
        Float var8 = Float.valueOf(-1.0f);
        this.id_byte[17] = var8;
    }

    public boolean id_goto() {
        return this.id_class(0.5f, 0, true, true, 0);
    }

    public rrIk_1 id_continue() {
        this.id_char();
        return (rrIk_1)this.id_byte[4];
    }

    public boolean id_else() {
        if (this.id_while().id_class().booleanValue()) {
            return true;
        }
        return ((cb_3)TriggerBot.id_import.id_class[57]).id_break(rLD.id_private);
    }

    public iB_2 id_new() {
        this.id_char();
        return (iB_2)this.id_byte[7];
    }

    public rrIk_1 id_return() {
        this.id_char();
        return (rrIk_1)this.id_byte[3];
    }

    public rrIk_1 id_super() {
        this.id_char();
        return (rrIk_1)this.id_byte[2];
    }

    private boolean id_throw() {
        boolean var1 = ((cb_3)TriggerBot.id_import.id_class[57]).BL();
        if (this.id_else() && !((rqr_3)((cb_3)TriggerBot.id_import.id_class[57]).id_break[17]).id_private && var1) {
            return false;
        }
        float var2 = 0.8f;
        boolean var3 = ((cb_3)TriggerBot.id_import.id_class[57]).PZ() && !((cb_3)TriggerBot.id_import.id_class[57]).id_catch(var2);
        boolean var4 = ((gm_3)TriggerBot.id_import.id_class[56]).id_break(((cb_3)TriggerBot.id_import.id_class[57]).rN().id_protected(0.0, 0.1, 0.0));
        double var5 = Math.abs((double)((int)((cb_3)TriggerBot.id_import.id_class[57]).re()) - ((cb_3)TriggerBot.id_import.id_class[57]).re());
        boolean var7 = (var5 == 0.125 || var5 == 0.1875) && !var4;
        boolean var8 = ((cb_3)TriggerBot.id_import.id_class[57]).id_throws(iM_2.STANDING) && var1;
        boolean var9 = !var4 && var1;
        return !((cb_3)TriggerBot.id_import.id_class[57]).Sy() && !((rhx_3)((cb_3)TriggerBot.id_import.id_class[57]).id_implements[18]).id_break && !((cb_3)TriggerBot.id_import.id_class[57]).id_break(rLD.id_goto) && !((cb_3)TriggerBot.id_import.id_class[57]).id_break(rLD.id_package) && !((cb_3)TriggerBot.id_import.id_class[57]).id_break(rLD.id_instanceof) && !((cb_3)TriggerBot.id_import.id_class[57]).id_break(rLD.id_protected) && !((cb_3)TriggerBot.id_import.id_class[57]).Pm() && !((cb_3)TriggerBot.id_import.id_class[57]).o_() && !((cb_3)TriggerBot.id_import.id_class[57]).Y() && !((cb_3)TriggerBot.id_import.id_class[57]).Pe() && !((cb_3)TriggerBot.id_import.id_class[57]).Py() && !var3 && !var7 && !var8 && !var9;
    }

    public rrIQ id_try() {
        this.id_char();
        return (rrIQ)this.id_byte[1];
    }

    public rrIk_1 id_while() {
        this.id_char();
        return (rrIk_1)this.id_byte[5];
    }

    public rrIk_1 id_public() {
        this.id_char();
        return (rrIk_1)this.id_byte[6];
    }

    @Override
    public iB_2 id_native() {
        this.id_char();
        if (!((rrIk_1)this.id_byte[6]).id_class().booleanValue()) {
            return null;
        }
        iB_2 var1 = this.id_new();
        return var1 == null && (iB_2)this.id_byte[8] != null && System.currentTimeMillis() - (Long)this.id_byte[9] < 1000L ? (iB_2)this.id_byte[8] : var1;
    }

    static {
        Object[] var0 = new Object[]{2, 14, 15};
        id_break = var0;
    }
}

