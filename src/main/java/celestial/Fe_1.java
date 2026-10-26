/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Ak_1;
import celestial.Aq_1;
import celestial.Aw_1;
import celestial.FU;
import celestial.FY;
import celestial.Fa_1;
import celestial.LF;
import celestial.Lr_1;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qj_1;
import celestial.Qw_1;
import celestial.cb_3;
import celestial.cm_3;
import celestial.mq_3;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.vm_3;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Locale;
import java.util.UUID;
import java.util.stream.Collectors;

public class Fe_1
extends vm_3 {
    protected static final rqO_2 id_class = new rqO_2("textures/gui/social_interactions.png");
    private static final rgP_2 id_throws = new rgn_3("gui.socialInteractions.tab_all");
    private static final rgP_2 id_case = new rgn_3("gui.socialInteractions.tab_hidden");
    private static final rgP_2 id_catch = new rgn_3("gui.socialInteractions.tab_blocked");
    private static final rgP_2 id_private = id_throws.id_throws().id_class(rgF_2.UNDERLINE);
    private static final rgP_2 id_implements = id_case.id_throws().id_class(rgF_2.UNDERLINE);
    private static final rgP_2 id_finally = id_catch.id_throws().id_class(rgF_2.UNDERLINE);
    private static final rgP_2 id_else = new rgn_3("gui.socialInteractions.search_hint").id_class(rgF_2.ITALIC).id_class(rgF_2.GRAY);
    public static final rgP_2 id_synchronized = new rgn_3("gui.socialInteractions.search_empty").id_class(rgF_2.GRAY);
    private static final rgP_2 id_return = new rgn_3("gui.socialInteractions.empty_hidden").id_class(rgF_2.GRAY);
    private static final rgP_2 id_public = new rgn_3("gui.socialInteractions.empty_blocked").id_class(rgF_2.GRAY);
    private static final rgP_2 id_goto = new rgn_3("gui.socialInteractions.blocking_hint");
    public FY id_while;
    public Lu_1 id_try;
    private String id_instanceof = "";
    private Lr_1 id_throw = Lr_1.ALL;
    private LF id_interface;
    private LF id_char;
    private LF id_abstract;
    private LF id_long;
    private rgP_2 id_float;
    private int id_boolean;
    private boolean id_transient;
    private Runnable id_for;

    public Fe_1() {
        super(new rgn_3("gui.socialInteractions.title"));
        this.id_class(QY.id_instanceof());
    }

    public void id_class(Aw_1 aw_1) {
        this.id_while.id_class(aw_1, this.id_throw);
    }

    private void id_class(QY qY) {
        int n = qY.id_void().id_throws().size();
        if (this.id_boolean != n) {
            String string = "";
            Ak_1 ak_1 = qY.S();
            if (qY.id_switch()) {
                string = qY.id_this().h();
            } else if (ak_1 != null) {
                string = ak_1.id_class;
            }
            this.id_float = n > 1 ? new rgn_3("gui.socialInteractions.server_label.multiple", string, n) : new rgn_3("gui.socialInteractions.server_label.single", string, n);
            this.id_boolean = n;
        }
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (!this.id_try.aO_() && ((Qw_1)this.id_volatile.id_class[20]).A.id_class(n, n2)) {
            this.id_volatile.id_break((vm_3)null);
            return true;
        }
        return super.id_class(n, n2, n3);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(this.id_volatile);
        this.id_class(ml_1);
        if (this.id_float != null) {
            Fe_1.id_break(ml_1, (cm_3)this.id_volatile.id_class[15], this.id_float, this.id_package() + 8, 35, -1);
        }
        if (!this.id_while.id_private()) {
            this.id_while.id_class(ml_1, n, n2, f);
        } else if (!this.id_try.id_private().isEmpty()) {
            Fe_1.id_class(ml_1, (cm_3)this.id_volatile.id_class[15], id_synchronized, this.id_package / 2, (78 + this.id_final()) / 2, -1);
        } else {
            switch (this.id_throw) {
                case HIDDEN: {
                    Fe_1.id_class(ml_1, (cm_3)this.id_volatile.id_class[15], id_return, this.id_package / 2, (78 + this.id_final()) / 2, -1);
                    break;
                }
                case BLOCKED: {
                    Fe_1.id_class(ml_1, (cm_3)this.id_volatile.id_class[15], id_public, this.id_package / 2, (78 + this.id_final()) / 2, -1);
                }
            }
        }
        if (!this.id_try.aO_() && this.id_try.id_private().isEmpty()) {
            Fe_1.id_break(ml_1, (cm_3)this.id_volatile.id_class[15], id_else, this.id_try.id_volatile, this.id_try.id_final, -1);
        } else {
            this.id_try.id_class(ml_1, n, n2, f);
        }
        this.id_long.id_new = this.id_throw == Lr_1.BLOCKED;
        super.id_class(ml_1, n, n2, f);
        if (this.id_for != null) {
            this.id_for.run();
        }
    }

    public void id_class(UUID uUID) {
        this.id_while.id_class(uUID);
    }

    public void id_class(Runnable runnable) {
        this.id_for = runnable;
    }

    private void id_class(String string) {
        if (!(string = string.toLowerCase(Locale.ROOT)).equals(this.id_instanceof)) {
            this.id_while.id_class(string);
            this.id_instanceof = string;
            this.id_class(this.id_throw);
        }
    }

    private void id_class(Lr_1 lr_1) {
        this.id_throw = lr_1;
        this.id_interface.id_break(id_throws);
        this.id_char.id_break(id_case);
        this.id_abstract.id_break(id_catch);
        Object object = switch (lr_1) {
            case Lr_1.ALL -> {
                this.id_interface.id_break(id_private);
                yield ((Aq_1)((cb_3)this.id_volatile.id_class[57]).id_break[0]).id_case();
            }
            case Lr_1.HIDDEN -> {
                this.id_char.id_break(id_implements);
                yield this.id_volatile.id_volatile().id_class();
            }
            case Lr_1.BLOCKED -> {
                this.id_abstract.id_break(id_finally);
                FU var3_3 = this.id_volatile.id_volatile();
                yield ((Aq_1)((cb_3)this.id_volatile.id_class[57]).id_break[0]).id_case().stream().filter(var3_3::id_throws).collect(Collectors.toSet());
            }
            default -> ImmutableList.of();
        };
        this.id_throw = lr_1;
        this.id_while.id_class((Collection<UUID>)object, this.id_while.id_package());
    }

    @Override
    public void id_class(Ml_1 ml_1) {
        int n = this.id_package() + 3;
        super.id_class(ml_1);
        this.id_volatile.A().id_class(id_class);
        this.id_break(ml_1, n, 64, 1, 1, 236, 8);
        int n2 = this.id_native();
        for (int i = 0; i < n2; ++i) {
            this.id_break(ml_1, n, 72 + 16 * i, 1, 10, 236, 16);
        }
        this.id_break(ml_1, n, 72 + 16 * n2, 1, 27, 236, 8);
        this.id_break(ml_1, n + 10, 76, 243, 1, 12, 12);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (this.id_try.aO_()) {
            this.id_try.id_break(d, d2, n);
        }
        return super.id_break(d, d2, n) || this.id_while.id_break(d, d2, n);
    }

    private int id_finally() {
        return Math.max(52, this.id_int - 128 - 16);
    }

    private int id_package() {
        return (this.id_package - 238) / 2;
    }

    @Override
    public void id_private() {
        super.id_private();
        this.id_try.id_catch();
    }

    private int id_final() {
        return 80 + this.id_native() * 16 - 8;
    }

    private int id_native() {
        return this.id_finally() / 16;
    }

    @Override
    public String D_() {
        return super.D_() + ". " + this.id_float.getString();
    }

    @Override
    protected void v_() {
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        if (this.id_transient) {
            this.id_while.id_break(this.id_package, this.id_int, 88, this.id_final());
        } else {
            this.id_while = new FY(this, this.id_volatile, this.id_package, this.id_int, 88, this.id_final(), 36);
        }
        int n = this.id_while.F_() / 3;
        int n2 = this.id_while.id_continue();
        int n3 = this.id_while.id_super();
        int n4 = this.id_super.id_class(id_goto) + 40;
        int n5 = 64 + 16 * this.id_native();
        int n6 = (this.id_package - n4) / 2;
        this.id_interface = this.id_class(new LF(n2, 45, n, 20, id_throws, lF -> this.id_class(Lr_1.ALL)));
        this.id_char = this.id_class(new LF((n2 + n3 - n) / 2 + 1, 45, n, 20, id_case, lF -> this.id_class(Lr_1.HIDDEN)));
        this.id_abstract = this.id_class(new LF(n3 - n + 1, 45, n, 20, id_catch, lF -> this.id_class(Lr_1.BLOCKED)));
        this.id_long = this.id_class(new LF(n6, n5, n4, 20, id_goto, lF -> this.id_volatile.id_break(new mq_3(bl -> {
            if (bl) {
                rqR_2.id_implements().id_class("https://aka.ms/javablocking");
            }
            this.id_volatile.id_break(this);
        }, "https://aka.ms/javablocking", true))));
        String string = this.id_try != null ? this.id_try.id_private() : "";
        this.id_try = new Fa_1(this, this.id_super, this.id_package() + 28, 78, 196, 16, id_else);
        this.id_try.id_implements(16);
        this.id_try.id_protected(false);
        this.id_try.id_private(true);
        this.id_try.id_finally(0xFFFFFF);
        this.id_try.id_class(string);
        this.id_try.id_class(this::id_class);
        this.id_native.add(this.id_try);
        this.id_native.add(this.id_while);
        this.id_transient = true;
        this.id_class(this.id_throw);
    }

    @Override
    public boolean z_() {
        return false;
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
    }
}

