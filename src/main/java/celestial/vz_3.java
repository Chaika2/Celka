/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 */
package celestial;

import celestial.LF;
import celestial.Ln_1;
import celestial.Ml_1;
import celestial.cN_2;
import celestial.cm_3;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rfU_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgS_2;
import celestial.rgc_3;
import celestial.rgl_3;
import celestial.rgn_3;
import celestial.rpl_3;
import celestial.rqO_2;
import celestial.vN_2;
import celestial.vQ_2;
import celestial.vm_3;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collections;
import java.util.List;

public class vz_3
extends vm_3 {
    public static final vN_2 id_class = new vQ_2();
    public static final rqO_2 id_throws = new rqO_2("textures/gui/book.png");
    private vN_2 id_case;
    private int id_catch;
    private List<rpl_3> id_private = Collections.emptyList();
    private int id_implements = -1;
    private rgP_2 id_finally = rgN_2.id_byte;
    private Ln_1 id_else;
    private Ln_1 id_synchronized;
    private final boolean id_return;

    public boolean id_byte(int n) {
        int n2 = rfU_2.id_class(n, 0, this.id_case.id_class() - 1);
        if (n2 != this.id_catch) {
            this.id_catch = n2;
            this.id_interface();
            this.id_implements = -1;
            return true;
        }
        return false;
    }

    protected void id_int() {
        int n = (this.id_package - 192) / 2;
        int n2 = 2;
        this.id_else = this.id_class(new Ln_1(n + 116, 159, true, lF -> this.id_package(), this.id_return));
        this.id_synchronized = this.id_class(new Ln_1(n + 43, 159, false, lF -> this.id_final(), this.id_return));
        this.id_interface();
    }

    public vz_3(vN_2 vN_22) {
        this(vN_22, true);
    }

    public vz_3() {
        this(id_class, false);
    }

    private vz_3(vN_2 vN_22, boolean bl) {
        super(rgN_2.id_byte);
        this.id_case = vN_22;
        this.id_return = bl;
    }

    private void id_interface() {
        this.id_else.id_new = this.id_catch < this.id_finally() - 1;
        this.id_synchronized.id_new = this.id_catch > 0;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(id_throws);
        int n3 = (this.id_package - 192) / 2;
        int n4 = 2;
        this.id_break(ml_1, n3, 2, 0, 0, 192, 192);
        if (this.id_implements != this.id_catch) {
            rgS_2 rgS_22 = this.id_case.id_break(this.id_catch);
            this.id_private = this.id_super.id_break(rgS_22, 114);
            this.id_finally = new rgn_3("book.pageIndicator", this.id_catch + 1, Math.max(this.id_finally(), 1));
        }
        this.id_implements = this.id_catch;
        int n5 = this.id_super.id_class(this.id_finally);
        this.id_super.id_byte(ml_1, this.id_finally, n3 - n5 + 192 - 44, 18.0f, 0);
        int n6 = Math.min(14, this.id_private.size());
        for (int i = 0; i < n6; ++i) {
            rpl_3 rpl_32 = this.id_private.get(i);
            this.id_super.id_break(ml_1, rpl_32, (float)(n3 + 36), (float)(32 + i * 9), 0);
        }
        rgc_3 rgc_32 = this.id_protected(n, n2);
        if (rgc_32 != null) {
            this.id_class(ml_1, rgc_32, n, n2);
        }
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (super.id_class(n, n2, n3)) {
            return true;
        }
        switch (n) {
            case 266: {
                this.id_synchronized.id_catch();
                return true;
            }
            case 267: {
                this.id_else.id_catch();
                return true;
            }
        }
        return false;
    }

    public static List<String> id_class(rcd_3 rcd_32) {
        rcy_3 rcy_32 = rcd_32.id_protected("pages", 8).id_protected();
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < rcy_32.size(); ++i) {
            builder.add((Object)rcy_32.id_implements(i));
        }
        return builder.build();
    }

    @Override
    public boolean id_class(rgc_3 rgc_32) {
        rgl_3 rgl_32 = rgc_32.id_private();
        if (rgl_32 == null) {
            return false;
        }
        if (rgl_32.id_class() == rgH_2.CHANGE_PAGE) {
            String string = rgl_32.id_break();
            try {
                int n = Integer.parseInt(string) - 1;
                return this.id_break(n);
            }
            catch (Exception exception) {
                return false;
            }
        }
        boolean bl = super.id_class(rgc_32);
        if (bl && rgl_32.id_class() == rgH_2.RUN_COMMAND) {
            this.id_volatile.id_break((vm_3)null);
        }
        return bl;
    }

    public void id_class(vN_2 vN_22) {
        this.id_case = vN_22;
        this.id_catch = rfU_2.id_class(this.id_catch, 0, vN_22.id_class());
        this.id_interface();
        this.id_implements = -1;
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        rgc_3 rgc_32;
        if (n == 0 && (rgc_32 = this.id_protected(d, d2)) != null && this.id_class(rgc_32)) {
            return true;
        }
        return super.id_break(d, d2, n);
    }

    protected boolean id_break(int n) {
        return this.id_byte(n);
    }

    private int id_finally() {
        return this.id_case.id_class();
    }

    protected void id_package() {
        if (this.id_catch < this.id_finally() - 1) {
            ++this.id_catch;
        }
        this.id_interface();
    }

    public rgc_3 id_protected(double d, double d2) {
        if (this.id_private.isEmpty()) {
            return null;
        }
        int n = rfU_2.id_byte(d - (double)((this.id_package - 192) / 2) - 36.0);
        int n2 = rfU_2.id_byte(d2 - 2.0 - 30.0);
        if (n >= 0 && n2 >= 0) {
            int n3 = Math.min(14, this.id_private.size());
            if (n <= 114 && n2 < 9 * n3 + n3) {
                int n4 = n2 / 9;
                if (n4 >= 0 && n4 < this.id_private.size()) {
                    rpl_3 rpl_32 = this.id_private.get(n4);
                    return ((cm_3)this.id_volatile.id_class[15]).id_break().id_class(rpl_32, n);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    protected void id_final() {
        if (this.id_catch > 0) {
            --this.id_catch;
        }
        this.id_interface();
    }

    protected void id_native() {
        this.id_class(new LF(this.id_package / 2 - 100, 196, 200, 20, cN_2.id_byte, lF -> this.id_volatile.id_break((vm_3)null)));
    }

    @Override
    protected void v_() {
        this.id_native();
        this.id_int();
    }
}

