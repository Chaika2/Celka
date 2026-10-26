/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 */
package celestial;

import celestial.Ar_1;
import celestial.LF;
import celestial.LZ;
import celestial.Li_1;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.Qj_1;
import celestial.rAM;
import celestial.rAw_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.vd_3;
import celestial.vh_3;
import celestial.vk_3;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nonnull;

public final class rAO
extends vk_3 {
    private static final rgP_2 id_implements = new rgN_2("A-Z");
    private static final rgP_2 id_finally = new rgN_2("Z-A");
    private static final rgP_2 id_else = new rgn_3("refresh");
    private final rAw_1 id_synchronized = new rAw_1(this::id_native);
    private Comparator<Ar_1> id_return;
    private Li_1 id_public;
    private rAM id_goto;
    private Lu_1 id_while;

    public rAO(vk_3 vk_32) {
        super(vk_32.id_throws, vk_32.id_class.id_class, vk_32.id_class.id_byte, vk_32.id_private, vk_32.id_new());
        vh_3 vh_32 = vk_32.id_class;
        Runnable runnable = vh_32.id_break;
        vh_32.id_break = () -> {
            runnable.run();
            this.id_native();
        };
    }

    @Override
    public void id_class(@Nonnull Li_1 li_1, @Nonnull Stream<vd_3> stream) {
        super.id_class(li_1, stream);
        if (this.id_public != null) {
            this.id_native();
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_protected(0);
        this.id_catch.id_class(ml_1, n, n2, f);
        this.id_goto.id_class(ml_1, n, n2, f);
        this.id_while.id_class(ml_1, n, n2, f);
        for (LZ lZ : this.id_new) {
            lZ.id_class(ml_1, n, n2, f);
        }
        rAO.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 16, 0xFFFFFF);
    }

    private Optional<LZ> id_break(rgP_2 rgP_22) {
        return this.id_new.stream().filter(lZ -> rgP_22.equals(lZ.C_())).findFirst();
    }

    @Override
    public void id_private() {
        super.id_private();
        this.id_while.id_catch();
    }

    private void id_native() {
        this.id_synchronized.id_class(this.id_public.x_(), this.id_goto.x_());
        this.id_goto.id_class(this.id_goto.id_package());
    }

    @Override
    protected void v_() {
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        super.v_();
        rgn_3 rgn_32 = new rgn_3("gui.done");
        rgn_3 rgn_33 = new rgn_3("pack.openFolder");
        this.id_break(rgn_33).ifPresent(lZ -> {
            lZ.id_volatile = this.id_package / 2 + 25;
            lZ.id_final = this.id_int - 48;
        });
        this.id_break(rgn_32).ifPresent(lZ -> {
            lZ.id_volatile = this.id_package / 2 + 25;
            lZ.id_final = this.id_int - 26;
        });
        this.id_class(new LF(this.id_package / 2 - 204, this.id_int - 26, 30, 20, id_implements, lF -> {
            this.id_return = rAw_1.id_class;
            this.id_synchronized.id_class(this.id_return);
        }));
        this.id_class(new LF(this.id_package / 2 - 204 + 34, this.id_int - 26, 30, 20, id_finally, lF -> {
            this.id_return = rAw_1.id_break;
            this.id_synchronized.id_class(this.id_return);
        }));
        this.id_class(new LF(this.id_package / 2 - 63, this.id_int - 26, 60, 20, id_else, lF -> {
            this.id_volatile();
            this.id_volatile.id_break(this);
            this.id_finally();
            this.id_goto.id_class(this.id_public);
            this.id_native();
            this.id_goto.id_class(0.0);
        }));
        this.id_while = new Lu_1(this.id_super, this.id_package / 2 - 203, this.id_int - 46, 198, 16, this.id_while, rgN_2.id_byte, true);
        this.id_while.id_class(new rgn_3("options.resourcepack.search")).id_catch(true);
        this.id_while.id_class(this.id_synchronized::id_class);
        this.id_native.add(this.id_while);
        this.id_public = this.id_case;
        this.id_native.remove(this.id_public);
        this.id_goto = new rAM(this.id_public);
        this.id_native.add(this.id_goto);
        this.id_synchronized.id_class();
        this.id_synchronized.id_class(this.id_return == null ? (this.id_return = rAw_1.id_class) : this.id_return);
        this.id_synchronized.id_class(this.id_while.id_private());
        this.id_synchronized.id_break();
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
    }
}

