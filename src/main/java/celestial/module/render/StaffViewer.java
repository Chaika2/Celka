/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 *  com.mojang.authlib.GameProfile
 */
package celestial.module.render;

import celestial.Aw_1;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.module.Category;
import celestial.module.Module;
import celestial.rVa_1;
import celestial.rVi_1;
import celestial.rgN_2;
import celestial.rnB_2;
import celestial.rrFK;
import celestial.rrFV;
import celestial.rrIk_1;
import celestial.rrLL;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrfu_3;
import celestial.rrqB_2;
import celestial.rrqG_2;
import celestial.rrqJ_2;
import celestial.rrqM_2;
import celestial.rrqO_2;
import celestial.rrqP_2;
import celestial.rrqS_2;
import celestial.rrqX_2;
import celestial.rrqb_3;
import celestial.rrqr_3;
import celestial.rrtd_3;
import celestial.rrth_3;
import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StaffViewer
extends Module
implements rrqJ_2,
rrqO_2 {
    public Object[] id_break;
    public static Object[] id_byte;

    public StaffViewer() {
        super("Staff Viewer", "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u0442 \u0430\u043a\u0442\u0438\u0432\u043d\u044b\u0439 \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\n\u043d\u0430 \u0441\u0435\u0440\u0432\u0435\u0440\u0435", Category.RENDER);
        HashSet var5;
        this.id_public();
        this.id_break[0] = var5 = new HashSet();
        Ordering var6 = Ordering.from((Comparator)new rrqb_3());
        this.id_break[1] = var6;
        rrIk_1 var7 = new rrIk_1("\u0421\u043e\u043e\u0431\u0449\u0430\u0442\u044c \u043e\u0431 \u0438\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u0438\n\u0441\u0442\u0430\u0442\u0443\u0441\u0430 \u043f\u0435\u0440\u0441\u043e\u043d\u0430\u043b\u0430", true);
        this.id_break[2] = var7;
        ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).id_class(this);
        ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).id_class(this);
        this.id_class((rrIk_1)this.id_break[2]);
    }

    @Override
    public void id_this() {
        this.id_case(false);
    }

    @Override
    public void id_class(String var1, boolean var2) {
        this.id_public();
        if (var2) {
            for (rrqr_3 var4 : (Set)this.id_break[0]) {
                rrqP_2 var5;
                if (!(var4 instanceof rrqP_2) || !(var5 = (rrqP_2)var4).id_case().equals((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[10]) || !var5.id_class().id_class().getName().equalsIgnoreCase(var1)) continue;
                var4.id_class(false);
                break;
            }
        }
    }

    private void id_class(Aw_1 var1) {
        this.id_public();
        if ((rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) && var1 != null) {
            if (var1.id_class().getName().equalsIgnoreCase(id_import.id_while().id_byte().toLowerCase())) {
                return;
            }
            rnB_2 var2 = var1.id_implements();
            if (var2 == null) {
                return;
            }
            String var3 = var2.id_class();
            if (!var3.contains("-") && var3.startsWith("6") && var3.endsWith("A")) {
                rrqP_2 var4 = new rrqP_2((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[3], var1, var2.id_protected().id_byte());
                ((Set)this.id_break[0]).add(var4);
            }
        }
    }

    @EventTarget
    public void id_class(rrLL var1) {
        this.id_public();
        if ((gm_3)StaffViewer.id_import.id_class[56] != null) {
            Aw_1 var2 = var1.id_break();
            String var3 = var2.id_class().getName();
            String var4 = var1.id_class().id_byte();
            rrqB_2 var5 = rrqB_2.id_class(var2, var3, var4);
            this.id_class(var5, var2);
            this.id_class(var2);
            if (var5 != null) {
                rrqP_2 var6 = new rrqP_2(var5, var2, var4);
                ((Set)this.id_break[0]).add(var6);
            }
        }
    }

    @EventTarget
    public void id_class(rrFV var1) {
        this.id_public();
        if (((rrIk_1)this.id_break[2]).id_class().booleanValue()) {
            this.id_break(var1);
        }
    }

    @EventTarget
    public void id_class(rrFK var1) {
        this.id_public();
        ((Set)this.id_break[0]).removeIf(var0 -> !var0.id_throws());
    }

    private void id_class(rrqB_2 var1, Aw_1 var2) {
        this.id_public();
        if ((rrfq_3)((Object)rrfp_3.id_class[1]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]) && var1 == null) {
            rnB_2 var3 = var2.id_implements();
            if (var3 == null) {
                return;
            }
            GameProfile var4 = var2.id_class();
            if (var4.getName().equalsIgnoreCase(id_import.id_while().id_byte().toLowerCase())) {
                return;
            }
            String var5 = var3.id_class();
            if (!var5.contains("-") && var5.startsWith("V") && var5.endsWith("A")) {
                rrqP_2 var6 = new rrqP_2((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[3], var2, var3.id_protected().id_byte());
                ((Set)this.id_break[0]).add(var6);
            }
        }
    }

    @Override
    public void id_break(String var1, boolean var2) {
        this.id_public();
        if (var2) {
            for (rrqr_3 var4 : (Set)this.id_break[0]) {
                rrqP_2 var5;
                if (!(var4 instanceof rrqP_2) || !(var5 = (rrqP_2)var4).id_case().equals((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[10]) || !var5.id_extends().toLowerCase().contains(var1.toLowerCase())) continue;
                var5.id_class(false);
            }
        }
    }

    private void id_break(rrFV var1) {
        String var5;
        rrqP_2 var2 = var1.id_byte();
        rrqS_2 var3 = var1.id_class();
        rrqS_2 var4 = var1.id_break();
        block0 : switch (((int[])rrqG_2.id_class[0])[var3.ordinal()]) {
            case 1: {
                String string = "\u0437\u0430\u0448\u0451\u043b \u0432 \u0441\u043f\u0435\u043a";
                break;
            }
            case 2: {
                String string = "\u0437\u0430\u0448\u0451\u043b \u0432 GM3";
                break;
            }
            case 3: {
                String string = "\u0440\u044f\u0434\u043e\u043c \u0441 \u0432\u0430\u043c\u0438";
                break;
            }
            case 4: {
                String string;
                switch (((int[])rrqG_2.id_class[0])[var4.ordinal()]) {
                    case 1: {
                        string = "\u0432\u044b\u0448\u0435\u043b \u0438\u0437 \u0441\u043f\u0435\u043a\u0430";
                        break block0;
                    }
                    case 2: {
                        string = "\u0432\u044b\u0448\u0435\u043b \u0438\u0437 GM3";
                        break block0;
                    }
                    case 3: {
                        string = "\u0443\u0448\u0451\u043b \u043e\u0442 \u0432\u0430\u0441";
                        break block0;
                    }
                }
                string = "\u0432 \u0430\u043a\u0442\u0438\u0432\u043d\u043e\u043c \u0441\u0442\u0430\u0442\u0443\u0441\u0435";
                break;
            }
            case 5: {
                String string = "\u0432\u044b\u0448\u0435\u043b \u0441 \u0441\u0435\u0440\u0432\u0435\u0440\u0430";
                break;
            }
            default: {
                String string = var5 = null;
            }
        }
        if (var5 != null) {
            rgN_2 var6 = new rgN_2(this.id_final());
            rVi_1 var7 = var2.id_implements().id_break(" " + var5);
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtd_3(var6, var7, 5000));
        }
    }

    @Override
    public void id_throws(boolean var1) {
        this.id_public();
        super.id_throws(var1);
        for (rrqr_3 var3 : (Set)this.id_break[0]) {
            if (var3.id_throws()) continue;
            var3.id_class(false);
        }
    }

    private void id_case(boolean var1) {
        this.id_public();
        for (rrqr_3 var3 : (Set)this.id_break[0]) {
            rrqP_2 var4;
            if (!(var3 instanceof rrqP_2) || !(var4 = (rrqP_2)var3).id_case().equals((rrqB_2)rrqB_2.staticFieldsf6ef226fb34a300d9c0c9540d4f17aea[10])) continue;
            var4.id_class(var1);
        }
    }

    @Override
    public void id_continue() {
        this.id_case(false);
    }

    public Set<rrqr_3> id_new() {
        this.id_public();
        return (Set)this.id_break[0];
    }

    public List<rrqr_3> id_super() {
        this.id_public();
        return ((Ordering)this.id_break[1]).sortedCopy((Iterable)((Set)this.id_break[0]));
    }

    private void id_public() {
        if (this.id_break == null) {
            this.id_break = new Object[3];
        }
    }

    static {
        Object[] var0 = new Object[]{rrfu_3.id_class().id_break(rVa_1.id_class("#ff0000"), rVa_1.id_class("#ff7f7f")).id_class("\u041f\u0435\u0440\u0441\u043e\u043d\u0430\u043b ").id_break()};
        id_byte = var0;
    }
}

