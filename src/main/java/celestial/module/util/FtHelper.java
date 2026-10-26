/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.RandomStringUtils
 */
package celestial.module.util;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.C_throws;
import celestial.FP;
import celestial.Fc_1;
import celestial.Lu_1;
import celestial.Pj_1;
import celestial.Wp_1;
import celestial.Y;
import celestial.cW_2;
import celestial.cb_3;
import celestial.cz_3;
import celestial.event.EventTarget;
import celestial.iB_2;
import celestial.module.Category;
import celestial.module.Module;
import celestial.q_1;
import celestial.rJV;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rLR;
import celestial.rLY;
import celestial.rVi_1;
import celestial.rXa_1;
import celestial.rXe_1;
import celestial.rZx_1;
import celestial.rca_3;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rhz_3;
import celestial.rkX_2;
import celestial.rkx_3;
import celestial.rmt_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqR_2;
import celestial.rql_3;
import celestial.rqs_3;
import celestial.rqy_3;
import celestial.rrAR;
import celestial.rrAZ;
import celestial.rrAq_1;
import celestial.rrAv_1;
import celestial.rrHv_1;
import celestial.rrIk_1;
import celestial.rrLD;
import celestial.rrLE;
import celestial.rrLO;
import celestial.rrLZ;
import celestial.rrLh_1;
import celestial.rrLu_1;
import celestial.rrNW;
import celestial.rrNa_1;
import celestial.rrNh_1;
import celestial.rrNt_1;
import celestial.rrTF;
import celestial.rrTm_1;
import celestial.rrZk_1;
import celestial.rrfO_2;
import celestial.rrfP_2;
import celestial.rrfY_2;
import celestial.rrfo_3;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrfu_3;
import celestial.rrfw_3;
import celestial.rrjS_2;
import celestial.rrjb_3;
import celestial.rrpB_2;
import celestial.rrpF_2;
import celestial.rrpG_2;
import celestial.rrpL_2;
import celestial.rrpM_2;
import celestial.rrpN_2;
import celestial.rrpc_3;
import celestial.rrph_3;
import celestial.rrpk_3;
import celestial.rrpm_3;
import celestial.rrpr_3;
import celestial.rrps_3;
import celestial.rrpx_3;
import celestial.rrpz_3;
import celestial.rrtd_3;
import celestial.rrth_3;
import celestial.rryR;
import celestial.rryT;
import celestial.rryU;
import celestial.rryV;
import celestial.rrya_1;
import celestial.rryf_1;
import celestial.rryo_1;
import celestial.rryt_1;
import celestial.rryw_1;
import celestial.rxJ_2;
import celestial.setting.GroupSetting;
import celestial.setting.Setting;
import celestial.vm_3;
import celestial.xd_3;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.RandomStringUtils;

public class FtHelper
extends Module {
    public static Object[] id_break;
    public Object[] id_byte;

    public FtHelper() {
        super("FT Helper", "\u0423\u0442\u0438\u043b\u0438\u0442\u0430\u0440\u043d\u044b\u0439 \u043c\u043e\u0434\u0443\u043b\u044c \u0434\u043b\u044f Funtime", Category.UTIL);
        ArrayList var9;
        this.id_this();
        this.id_byte[0] = var9 = new ArrayList();
        rrIk_1 var10 = new rrIk_1("\u0423\u043b\u0443\u0447\u0448\u0430\u0442\u044c \u043a\u043e\u043c\u0430\u043d\u0434\u044b", true);
        this.id_byte[22] = var10;
        rrIk_1 var11 = new rrIk_1("\u0423\u043b\u0443\u0447\u0448\u0430\u0442\u044c \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044e \u043e\n\u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430\u0445 \u043d\u0430 \u0430\u0443\u043a\u0446\u0438\u043e\u043d\u0435", true);
        this.id_byte[23] = var11;
        rrIk_1 var12 = new rrIk_1("\u0423\u0432\u0435\u0434\u043e\u043c\u043b\u044f\u0442\u044c \u043a\u043e\u0433\u0434\u0430 \u043d\u0430 \u0432\u0430\u0441\n\u043d\u0430\u043b\u043e\u0436\u0438\u043b\u0438 \u043f\u043b\u043e\u0445\u0438\u0435 \u044d\u0444\u0444\u0435\u043a\u0442\u044b", true);
        this.id_byte[24] = var12;
        rrIk_1 var13 = new rrIk_1("\u0410\u0432\u0442\u043e. \u043f\u0435\u0440\u0435\u0432\u044b\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u0438\u0435\n\u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432 \u0432 \u0445\u0440\u0430\u043d\u0438\u043b\u0438\u0449\u0435", true);
        this.id_byte[25] = var13;
        rrIk_1 var14 = new rrIk_1("\u0410\u0432\u0442\u043e. \u0438\u043d\u0432\u0435\u0441\u0442\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435 \u0432\n\u043a\u043b\u0430\u043d", false);
        this.id_byte[26] = var14;
        rrIk_1 var15 = new rrIk_1("\u0410\u0432\u0442\u043e. \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u0434\u0440\u0443\u0437\u0435\u0439 \u0432\n\u0440\u0435\u0433\u0438\u043e\u043d", false);
        this.id_byte[27] = var15;
        rrIk_1 var16 = new rrIk_1("\u041f\u043e\u0437\u0432\u043e\u043b\u044f\u0442\u044c \u043e\u0442\u043a\u0440\u044b\u0432\u0430\u0442\u044c\n\u0448\u0430\u043b\u043a\u0435\u0440 \u0432\u043d\u0443\u0442\u0440\u0438 \u0448\u0430\u043b\u043a\u0435\u0440\u0430", true);
        this.id_byte[28] = var16;
        rrIk_1 var17 = new rrIk_1("\u041d\u0435 \u0441\u0442\u0430\u0432\u0438\u0442\u044c \u0441\u0444\u0435\u0440\u044b", false);
        this.id_byte[29] = var17;
        rrfP_2 var18 = new rrfP_2();
        this.id_byte[30] = var18;
        Integer var19 = -1;
        this.id_byte[33] = var19;
        rrfw_3 var20 = new rrfw_3();
        this.id_byte[36] = var20;
        GroupSetting var1 = new GroupSetting("\u0427\u0430\u0442", new Setting[]{(rrIk_1)this.id_byte[22]});
        GroupSetting var2 = new GroupSetting("\u0410\u0443\u043a\u0446\u0438\u043e\u043d", new Setting[0]);
        GroupSetting var3 = new GroupSetting("\u0414\u0440\u0443\u0433\u043e\u0435", new Setting[0]);
        GroupSetting var4 = new GroupSetting("\u0410\u0432\u0442\u043e-\u0448\u0430\u0445\u0442\u0430", new Setting[0]);
        rryR var21 = this.id_class(new rryR(this));
        this.id_byte[2] = var21;
        rryf_1 var22 = this.id_class(new rryf_1(this));
        this.id_byte[1] = var22;
        rrpk_3 var23 = this.id_class(new rrpk_3(this));
        this.id_byte[3] = var23;
        rryo_1 var24 = this.id_class(new rryo_1(this));
        this.id_byte[4] = var24;
        rrpx_3 var25 = this.id_class(new rrpx_3(this));
        this.id_byte[5] = var25;
        rrph_3 var26 = this.id_class(new rrph_3(this));
        this.id_byte[6] = var26;
        rryU var27 = this.id_class(new rryU(this));
        this.id_byte[7] = var27;
        rrpB_2 var28 = this.id_class(new rrpB_2(this));
        this.id_byte[8] = var28;
        rrps_3 var29 = this.id_class(new rrps_3(this));
        this.id_byte[12] = var29;
        rryw_1 var30 = this.id_class(new rryw_1(this));
        this.id_byte[11] = var30;
        rrpG_2 var31 = this.id_class(new rrpG_2(this));
        this.id_byte[9] = var31;
        rrpr_3 var32 = this.id_class(new rrpr_3(this));
        this.id_byte[15] = var32;
        rrya_1 var33 = this.id_class(new rrya_1(this));
        this.id_byte[14] = var33;
        rrpM_2 var34 = this.id_class(new rrpM_2(this));
        this.id_byte[13] = var34;
        rryV var35 = this.id_class(new rryV(this));
        this.id_byte[10] = var35;
        rrpz_3 var36 = this.id_class(new rrpz_3(this, var2));
        this.id_byte[16] = var36;
        rrpF_2 var37 = this.id_class(new rrpF_2(this));
        this.id_byte[17] = var37;
        rrpc_3 var38 = this.id_class(new rrpc_3(this, var3));
        this.id_byte[18] = var38;
        rrpN_2 var39 = this.id_class(new rrpN_2(this));
        this.id_byte[19] = var39;
        rrpL_2 var40 = this.id_class(new rrpL_2(this));
        this.id_byte[20] = var40;
        rrpm_3 var41 = this.id_class(new rrpm_3(this, var4));
        this.id_byte[21] = var41;
        var3.id_class((rrIk_1)this.id_byte[26], (rrIk_1)this.id_byte[27], (rrIk_1)this.id_byte[24], (rrIk_1)this.id_byte[28], (rrIk_1)this.id_byte[29]);
        var2.id_class((rrIk_1)this.id_byte[23], (rrIk_1)this.id_byte[25]);
        this.id_class((rrTF)new Setting[]{var2, var4, var1, var3});
    }

    private void id_this() {
        if (this.id_byte == null) {
            this.id_byte = new Object[37];
            this.id_byte[32] = false;
            this.id_byte[33] = 0;
            this.id_byte[34] = 0L;
            this.id_byte[35] = 0L;
        }
    }

    @EventTarget
    public void id_class(rrLu_1 var1) {
        this.id_this();
        ((rrfP_2)this.id_byte[30]).id_class(var1);
    }

    @EventTarget
    public void id_class(rrLE var1) {
        if (this.id_new()) {
            cW_2 var2 = var1.id_class();
            Lu_1 var3 = var2.id_byte();
            vm_3 var5 = (vm_3)FtHelper.id_import.id_class[73];
            if (var5 instanceof FP) {
                FP var4 = (FP)var5;
                if (var4.id_class == var3) {
                    String var12 = var3.id_private();
                    Matcher var6 = ((Pattern)rrjb_3.id_class[9]).matcher(var12);
                    Matcher var7 = ((Pattern)rrjb_3.id_class[12]).matcher(var12);
                    Matcher var8 = ((Pattern)rrjb_3.id_class[13]).matcher(var12);
                    Matcher var9 = ((Pattern)rrjb_3.id_class[15]).matcher(var12);
                    String var10 = null;
                    String var11 = null;
                    if (var6.find()) {
                        var10 = this.id_class((rryT)((Object)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[2]), var6.group(2));
                        var11 = "\u0426\u0435\u043d\u0430";
                    } else if (var7.find()) {
                        var10 = this.id_class(this.id_break(var7.group(1)), var7.group(2));
                        var11 = "\u0421\u0443\u043c\u043c\u0430";
                    } else if (var8.find()) {
                        var10 = this.id_class((rryT)((Object)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[0]), var8.group(3));
                        var11 = "\u0421\u0443\u043c\u043c\u0430";
                    } else if (var9.find()) {
                        var10 = this.id_class((rryT)((Object)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[1]), var9.group(1));
                        var11 = "\u0421\u0443\u043c\u043c\u0430";
                    }
                    if (var10 != null && var11 != null) {
                        this.id_class(var11, var10, var2);
                        var1.id_class(true);
                    }
                }
            }
        }
    }

    private String id_class(rryT var1, String var2) {
        this.id_this();
        try {
            String var3;
            if ((var1 == (rryT)((Object)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[4]) || var1 == (rryT)((Object)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[0])) && (var3 = this.id_protected(var2)) != null) {
                var2 = String.valueOf(C_throws.id_byte().id_native().id_byte());
            }
            return ((rrpF_2)this.id_byte[17]).id_class(var2);
        }
        catch (Exception var4) {
            return null;
        }
    }

    private void id_class(String var1, String var2, cW_2 var3) {
        if (var2 != null && !var2.isEmpty()) {
            try {
                List<cz_3> var4 = var3.id_throws();
                cz_3 var5 = new cz_3(new rgN_2(var1 + ": " + String.valueOf((Object)rgF_2.YELLOW) + rql_3.id_class(var2, ' ')).id_catch());
                var4.add(0, var5);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
    }

    @EventTarget
    public void id_class(rrAv_1 var1) {
        this.id_this();
        String var2 = var1.id_class();
        boolean var3 = this.id_new();
        boolean var4 = ((rrIk_1)this.id_byte[26]).id_class();
        if (var3 || var4) {
            String var18;
            rryT var20;
            String var5 = id_import.id_while().id_byte();
            rryt_1 var6 = null;
            Matcher var7 = ((Pattern)rrjb_3.id_class[12]).matcher(var2);
            if (var3) {
                Matcher var8 = ((Pattern)rrjb_3.id_class[10]).matcher(var2);
                Matcher var9 = ((Pattern)rrjb_3.id_class[13]).matcher(var2);
                Matcher var10 = ((Pattern)rrjb_3.id_class[14]).matcher(var2);
                Matcher var11 = ((Pattern)rrjb_3.id_class[11]).matcher(var2);
                if (var8.find() && this.id_catch(var8.group(1)) != null) {
                    var1.id_byte("/ah " + var5);
                } else if (var11.find() && this.id_catch(var11.group(1)) != null) {
                    var1.id_byte("/duel stats " + var5);
                } else if (var9.find() && this.id_protected(var9.group(3)) != null) {
                    var6 = new rryt_1("/pay " + var9.group(2), (rryT)((Object)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[0]));
                } else if (var10.find() && rql_3.id_break(var10.group(1))) {
                    var1.id_byte(this.id_goto());
                    Boolean var16 = true;
                    this.id_byte[32] = var16;
                }
            }
            if (var7.find() && this.id_protected(var7.group(2)) != null && (var20 = this.id_break(var18 = var7.group(1))) != null) {
                var6 = new rryt_1("/clan " + var18, var20);
            }
            if (var6 != null) {
                this.id_byte[31] = var6;
                rryT var19 = var6.id_break();
                var1.id_byte(var19 == (rryT)((Object)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[3]) ? "/clan money" : "/money");
            }
        }
    }

    @EventTarget
    public void id_class(rrLD var1) {
        this.id_this();
        List<rLY> var2 = var1.id_protected();
        iB_2 var3 = var1.id_break();
        if (((rrIk_1)this.id_byte[24]).id_class().booleanValue() && var3 == (cb_3)FtHelper.id_import.id_class[57]) {
            ArrayList<rLR> var4 = new ArrayList<rLR>();
            for (rLY var6 : var2) {
                var4.add(var6.id_class());
            }
            rrfO_2 var9 = rrfO_2.id_class(var4);
            rVi_1 var10 = null;
            if (var9 == (rrfO_2)((Object)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[5])) {
                var10 = new rgN_2("\u0417\u0435\u043b\u044c\u0435 \u0420\u0430\u0434\u0438\u0430\u0446\u0438\u0438").id_class(rgF_2.GREEN);
            } else if (var9 == (rrfO_2)((Object)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[6])) {
                var10 = new rgN_2("\u0421\u043d\u043e\u0442\u0432\u043e\u0440\u043d\u043e\u0435").id_class(rgF_2.BLUE);
            }
            if (var10 != null) {
                int var7 = ((rryU)this.id_byte[7]).id_break();
                int var8 = rrfY_2.id_class(rdy_3.hi, false, true);
                if (var7 != -1) {
                    this.id_class(new rgN_2("\u041d\u0430 \u0432\u0430\u0441 \u043d\u0430\u043b\u043e\u0436\u0438\u043b\u0438 ").id_class(var10).id_break(", \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0439\u0442\u0435 \u0431\u043e\u0436\u044c\u044e \u0430\u0443\u0440\u0443"));
                } else if (var8 != -1) {
                    this.id_class(new rgN_2("\u041d\u0430 \u0432\u0430\u0441 \u043d\u0430\u043b\u043e\u0436\u0438\u043b\u0438 ").id_class(var10).id_break(", \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0439\u0442\u0435 \u043c\u043e\u043b\u043e\u043a\u043e"));
                } else {
                    this.id_class(new rgN_2("\u041d\u0430 \u0432\u0430\u0441 \u043d\u0430\u043b\u043e\u0436\u0438\u043b\u0438 ").id_class(var10));
                }
            }
        }
    }

    @EventTarget
    public void id_class(rrAZ var1) {
        vm_3 vm_32;
        this.id_this();
        if (((rrIk_1)this.id_byte[25]).id_class().booleanValue() && (vm_32 = var1.id_class()) instanceof Fc_1) {
            Fc_1 var2 = (Fc_1)vm_32;
            String var11 = var2.id_new().id_byte();
            int var4 = ((rJr_1)((cb_3)FtHelper.id_import.id_class[57]).id_implements[4]).id_case;
            if (!var11.startsWith("\u2603 \u0425\u0440\u0430\u043d\u0438\u043b\u0438\u0449\u0435")) {
                return;
            }
            rrNW var5 = ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0])).id_throws();
            Pj_1 var6 = C_throws.id_byte().id_package();
            int var7 = var2.id_throw();
            if (var6.id_byte()) {
                rdn_3 var9;
                rqs_3<rdn_3> var8;
                int var10;
                if (var5.id_int().isEmpty()) {
                    var5.id_break(61000L);
                    var5.id_protected(true);
                } else if (var7 > 0 && var7 % 5 == 0 && (var10 = (var8 = ((rXe_1)var2.G_()).id_extends()).indexOf(var9 = var6.id_break(var8))) != -1) {
                    ((Ax_1)FtHelper.id_import.id_class[55]).id_class(var4, var10, 2, rXa_1.CLONE);
                }
            }
        }
    }

    private void id_class(rVi_1 var1) {
        rrfu_3.id_class(rrfu_3.id_break(this).id_class(rgF_2.GRAY).id_class(var1));
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtd_3(this.id_case(), var1, 3000));
    }

    @EventTarget
    public void id_class(rrLO var1) {
        this.id_this();
        if (((rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) || (rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4])) && var1.id_break() == null) {
            Matcher var3;
            String var2 = var1.id_protected();
            if (((rrIk_1)this.id_byte[27]).id_class().booleanValue() && (var3 = ((Pattern)rrjb_3.id_class[4]).matcher(var2)).find()) {
                List<rrZk_1> var4 = rrfp_3.id_case();
                if (var4.isEmpty()) {
                    return;
                }
                String var5 = rrfu_3.id_class(this);
                String var6 = var3.group(1);
                for (rrZk_1 var8 : var4) {
                    String var9 = var8.id_class();
                    ((cb_3)FtHelper.id_import.id_class[57]).id_case("/ps add " + var9 + " " + var6);
                    rrfu_3.id_byte(var5 + "\u0414\u043e\u0431\u0430\u0432\u043b\u044f\u0435\u043c '" + var9 + "' \u0432 \u0440\u0435\u0433\u0438\u043e\u043d #" + var6);
                }
            }
        }
    }

    @EventTarget
    public void id_class(rrLZ var1) {
        this.id_this();
        Object object = var1.id_class();
        if (object instanceof rmt_3) {
            rxJ_2 var5;
            rmt_3 var2 = (rmt_3)object;
            if (((rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) || (rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4])) && ((rrIk_1)this.id_byte[28]).id_class().booleanValue() && (cb_3)FtHelper.id_import.id_class[57] != null && (rJr_1)((cb_3)FtHelper.id_import.id_class[57]).id_implements[4] instanceof rJV && var2.id_protected() == 1 && (object = var2.id_case().id_break()) instanceof rxJ_2 && (var5 = (rxJ_2)object).id_catch() instanceof Wp_1) {
                var2.id_break(var2.id_byte() - 18);
                var2.id_class(0);
                ((cb_3)FtHelper.id_import.id_class[57]).id_strictfp();
            }
        }
    }

    @EventTarget
    public void id_class(rrLh_1 var1) {
        this.id_this();
        boolean var2 = this.id_new();
        boolean var3 = ((rrIk_1)this.id_byte[26]).id_class();
        if (var2 || var3) {
            rgP_2 var4 = var1.id_throws();
            String var5 = var1.id_class();
            if (((rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) || (rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4])) && var1.id_protected() == null) {
                if (var2) {
                    if (var4 instanceof rgN_2) {
                        rgN_2 var6 = (rgN_2)var4;
                        if (!var5.contains("|| \u0421\u0442\u0430\u0442\u0443\u0441: \u00bb") && !var5.contains("\u0414\u043e \u0441\u043b\u0435\u0434\u0443\u044e\u0449\u0435\u0433\u043e \u0438\u0432\u0435\u043d\u0442\u0430")) {
                            Matcher var17 = ((Pattern)rrjb_3.id_class[6]).matcher(var5);
                            if (var17.find()) {
                                String var19 = var17.group(1);
                                var1.id_class(var6.id_class(var19, rql_3.id_class(var19, ','), true));
                            }
                        } else {
                            Matcher var7 = ((Pattern)rrjb_3.id_class[16]).matcher(var5);
                            if (var7.find()) {
                                String var8 = var7.group(1);
                                Duration var9 = Duration.ofSeconds(Long.parseLong(var8.replaceAll("[^0-9]", "")));
                                var1.id_class(var6.id_class(var8, rql_3.id_class(var9, new rqy_3[0]), true));
                            }
                        }
                    }
                    if (((Boolean)this.id_byte[32]).booleanValue() && var5.contains("[\u2694] \u041e\u0448\u0438\u0431\u043a\u0430, \u043a\u043b\u0430\u043d \u0441 \u0442\u0430\u043a\u0438\u043c \u043d\u0430\u0437\u0432\u0430\u043d\u0438\u0435\u043c \u0443\u0436\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442!")) {
                        ((cb_3)FtHelper.id_import.id_class[57]).id_case(this.id_goto());
                    } else if (var5.contains("[\u2694] \u0421\u0443\u043f\u0435\u0440! \u0412\u044b \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u0441\u043e\u0437\u0434\u0430\u043b\u0438 \u043a\u043b\u0430\u043d:") || var5.contains("[\u2694] \u041e\u0448\u0438\u0431\u043a\u0430: \u0422\u044b \u0443\u0436\u0435 \u0441\u043e\u0441\u0442\u043e\u0438\u0448\u044c \u0432 \u043a\u043b\u0430\u043d\u0435!")) {
                        Boolean var14 = false;
                        this.id_byte[32] = var14;
                    }
                }
                if ((rryt_1)this.id_byte[31] != null) {
                    Matcher var16 = null;
                    if (((rryt_1)this.id_byte[31]).id_break() == (rryT)((Object)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[3])) {
                        if (var2) {
                            var16 = ((Pattern)rrjb_3.id_class[6]).matcher(var5);
                        }
                    } else {
                        var16 = ((Pattern)rrjb_3.id_class[5]).matcher(var5);
                    }
                    if (var16 != null && var16.find()) {
                        long var18 = Long.parseLong(var16.group(1).replaceAll("[^0-9]", ""));
                        ((cb_3)FtHelper.id_import.id_class[57]).id_case(((rryt_1)this.id_byte[31]).id_class() + " " + var18);
                        Object var15 = null;
                        this.id_byte[31] = var15;
                    }
                }
            }
        }
    }

    @Override
    public <T extends rrTF<?>> T id_class(T var1) {
        this.id_this();
        ((List)this.id_byte[0]).add(var1);
        if (var1 instanceof rrHv_1) {
            rrHv_1 var2 = (rrHv_1)((Object)var1);
            ((rrTm_1)((Object)rrTm_1.staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4[0])).id_class(var2);
        }
        return var1;
    }

    @EventTarget
    public void id_class(rrAq_1 var1) {
        this.id_this();
        rJY var2 = var1.id_class();
        rJr_1 var3 = var1.id_break();
        if (var3 instanceof rXe_1 && ((rrIk_1)this.id_byte[23]).id_class().booleanValue()) {
            rcd_3 var10;
            if ((rrfq_3)((Object)rrfp_3.id_class[1]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) && (rrfq_3)((Object)rrfp_3.id_class[1]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4])) {
                return;
            }
            rdn_3 var4 = var2.id_class();
            int var5 = var4.id_char();
            if (var2.id_protected > 44 || var5 < 2) {
                return;
            }
            rrNt_1 var6 = ((rrNa_1)rrNa_1.staticFields477bc35efba33c1cba244cd88c6fd655[0]).id_break(var2);
            if (var6 == null) {
                return;
            }
            List<rrNt_1> var7 = ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0])).id_throws().id_synchronized();
            var6.id_class(var7);
            rcd_3 var8 = var4.id_package();
            int var9 = var6.id_case();
            if (var8 != null && var8.id_byte("display", 10) && (var10 = var8.id_int("display")).id_protected("Lore") == 9) {
                try {
                    rcy_3 var11 = var10.id_protected("Lore", 8);
                    int var12 = -1;
                    for (int var13 = 0; var13 < var11.size(); ++var13) {
                        String var14 = var11.id_implements(var13);
                        if (!var14.contains("\u0426\u0435\u043da") && !var14.contains("\u0426\u0435\u043d\u0430")) continue;
                        var12 = var13;
                        break;
                    }
                    if (var12 != -1) {
                        String var16 = String.valueOf((Object)rgF_2.GREEN) + "$ " + String.valueOf((Object)rgF_2.WHITE) + "\u0426\u0435\u043d\u0430 \u0437\u0430 \u0448\u0442\u0443\u043a\u0443: " + String.valueOf((Object)rgF_2.GREEN) + rql_3.id_class((Number)(var9 / var5), ',');
                        var11.id_byte(var12 + 1, rca_3.id_class("{\"text\":\"" + var16 + "\"}"));
                    }
                }
                catch (Exception var15) {
                    var15.printStackTrace();
                }
            }
        }
    }

    @EventTarget
    public void id_class(rrAR var1) {
        this.id_this();
        rdn_3 var2 = var1.id_class();
        rpm_3 var3 = var1.id_throws();
        xd_3 var4 = var1.id_protected();
        rff_3 var5 = var1.id_break();
        rfH_2 var6 = var5.id_class();
        rpr_3 var7 = var5.id_break();
        if (var3 == rpm_3.MAIN_HAND && ((rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) || (rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4])) && var2.id_break() instanceof rkx_3 && rrjS_2.id_class(var2, var4, var6, var7)) {
            int var8 = ((rhz_3)((cb_3)FtHelper.id_import.id_class[57]).id_implements[1]).id_throws();
            if (var8 != -1) {
                if (var8 >= 9) {
                    ((rrfP_2)this.id_byte[30]).id_class(((rhz_3)((cb_3)FtHelper.id_import.id_class[57]).id_implements[1]).id_protected);
                    Integer var14 = var8;
                    this.id_byte[33] = var14;
                    ((Ax_1)FtHelper.id_import.id_class[55]).id_class(var8);
                    Long var15 = rqR_2.id_break();
                    this.id_byte[34] = var15;
                } else {
                    Integer var16 = ((rhz_3)((cb_3)FtHelper.id_import.id_class[57]).id_implements[1]).id_protected;
                    this.id_byte[33] = var16;
                    rrfo_3.id_class(var8);
                }
                ((Aq_1)((cb_3)FtHelper.id_import.id_class[57]).id_break[0]).id_break(new rZx_1(var3, var5));
                var1.id_class(true);
            } else {
                rrfu_3.id_byte(rrfu_3.id_class(this) + "\u041d\u0435\u0442 \u0441\u0432\u043e\u0431\u043e\u0434\u043d\u043e\u0433\u043e \u0441\u043b\u043e\u0442\u0430 \u0432 \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0435 \u0447\u0442\u043e\u0431\u044b \u0441\u0435\u0441\u0442\u044c");
            }
        }
        if (((rrIk_1)this.id_byte[29]).id_class().booleanValue() && var3 == rpm_3.OFF_HAND) {
            boolean var9;
            rdn_3 var17 = ((cb_3)FtHelper.id_import.id_class[57]).ss();
            boolean bl = var9 = var17.id_break() == rdy_3.xe || var17.id_break() instanceof rkX_2;
            if (var9 && rrjS_2.id_break(var2)) {
                var1.id_class(true);
            }
        }
    }

    @Override
    public void id_class(boolean var1) {
        this.id_this();
        super.id_class(var1);
        for (rrTF var3 : (List)this.id_byte[0]) {
            var3.aI_();
        }
    }

    @EventTarget
    public void id_class(q_1 var1) {
        this.id_this();
        if (var1.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0])) {
            long var2;
            ((rrfP_2)this.id_byte[30]).id_class(rqR_2.id_break() - (Long)this.id_byte[34] > 300L);
            this.id_instanceof();
            if (((rrIk_1)this.id_byte[26]).id_class().booleanValue() && (var2 = C_throws.id_byte().id_native().id_byte()) > 0L && (Long)this.id_byte[35] != var2 && ((rrfw_3)this.id_byte[36]).id_class(10000.0)) {
                ((cb_3)FtHelper.id_import.id_class[57]).id_protected("/clan invest max");
                Long var8 = var2;
                this.id_byte[35] = var8;
                ((rrfw_3)this.id_byte[36]).id_class();
            }
        }
    }

    public rryT id_break(String var1) {
        if (var1.equalsIgnoreCase("withdraw")) {
            return (rryT)((Object)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[3]);
        }
        return var1.equalsIgnoreCase("invest") ? (rryT)((Object)rryT.staticFields37876a19520c3c81842a5cb803ef3c99[4]) : null;
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_this();
        super.id_throws(var1);
        for (rrTF var3 : (List)this.id_byte[0]) {
            var3.aK_();
        }
        this.id_instanceof();
        Object var8 = null;
        this.id_byte[31] = var8;
        Boolean var9 = false;
        this.id_byte[32] = var9;
        Long var10 = 0L;
        this.id_byte[35] = var10;
        ((rrfw_3)this.id_byte[36]).id_class();
    }

    private String id_catch(String var1) {
        for (String var5 : (String[])id_break[0]) {
            if (!var5.equalsIgnoreCase(var1)) continue;
            return var5;
        }
        return null;
    }

    private String id_goto() {
        return "/clan create " + RandomStringUtils.randomAlphabetic((int)5);
    }

    public boolean id_continue() {
        this.id_this();
        return ((rrIk_1)this.id_byte[25]).id_class();
    }

    private void id_instanceof() {
        this.id_this();
        if ((Integer)this.id_byte[33] != -1) {
            if ((Integer)this.id_byte[33] >= 9) {
                ((Ax_1)FtHelper.id_import.id_class[55]).id_class((Integer)this.id_byte[33]);
            } else {
                rrfo_3.id_class((Integer)this.id_byte[33]);
            }
            Integer var5 = -1;
            this.id_byte[33] = var5;
        }
    }

    public boolean id_new() {
        this.id_this();
        return ((rrIk_1)this.id_byte[22]).id_class();
    }

    private String id_protected(String var1) {
        for (String var5 : (String[])id_break[1]) {
            if (!var5.equalsIgnoreCase(var1)) continue;
            return var5;
        }
        return null;
    }

    static {
        String[] var2 = new String[]{"my", "me", "i", "\u044f", "\u043c\u043e\u0439"};
        String[] var3 = new String[]{"full", "all", "max", "\u0432\u0441\u0435", "\u0432\u0441\u0451", "\u043c\u0430\u043a\u0441"};
        Object[] var0 = new Object[]{var2, var3};
        id_break = var0;
    }
}

