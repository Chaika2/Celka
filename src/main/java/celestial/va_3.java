/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Fr_1;
import celestial.LV;
import celestial.Lw_1;
import celestial.QA;
import celestial.QY;
import celestial.ZC;
import celestial.mo_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqO_2;
import celestial.rrGd_1;
import celestial.rrGm_1;
import celestial.vi_3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class va_3
extends LV<vi_3> {
    public static final Logger id_throws = LogManager.getLogger();
    public static final DateFormat id_case = new SimpleDateFormat();
    public static final rqO_2 id_catch = new rqO_2("textures/misc/unknown_server.png");
    public static final rqO_2 id_class = new rqO_2("textures/gui/world_selection.png");
    public static final rgP_2 id_private = new rgn_3("selectWorld.tooltip.fromNewerVersion1").id_class(rgF_2.RED);
    public static final rgP_2 id_implements = new rgn_3("selectWorld.tooltip.fromNewerVersion2").id_class(rgF_2.RED);
    public static final rgP_2 id_finally = new rgn_3("selectWorld.tooltip.snapshot1").id_class(rgF_2.GOLD);
    public static final rgP_2 id_extends = new rgn_3("selectWorld.tooltip.snapshot2").id_class(rgF_2.GOLD);
    public static final rgP_2 id_return = new rgn_3("selectWorld.locked").id_class(rgF_2.RED);
    private final Fr_1 id_public;
    private List<rrGm_1> id_goto;

    public va_3(Fr_1 fr_1, QY qY, int n, int n2, int n3, int n4, int n5, Supplier<String> supplier, va_3 va_32) {
        super(qY, n, n2, n3, n4, n5);
        this.id_public = fr_1;
        if (va_32 != null) {
            this.id_goto = va_32.id_goto;
        }
        this.id_class(supplier, false);
    }

    public void id_class(Supplier<String> supplier, boolean bl) {
        this.id_native();
        rrGd_1 rrGd_12 = this.id_native.M();
        if (this.id_goto == null || bl) {
            try {
                this.id_goto = rrGd_12.id_class();
            }
            catch (QA qA) {
                id_throws.error("Couldn't load level list", (Throwable)qA);
                this.id_native.id_break(new ZC(new rgn_3("selectWorld.unable_to_load"), new rgN_2(qA.getMessage())));
                return;
            }
            Collections.sort(this.id_goto);
        }
        if (this.id_goto.isEmpty()) {
            this.id_native.id_break(mo_3.id_class(null));
        } else {
            String string = supplier.get().toLowerCase(Locale.ROOT);
            for (rrGm_1 rrGm_12 : this.id_goto) {
                if (!rrGm_12.id_break().toLowerCase(Locale.ROOT).contains(string) && !rrGm_12.id_class().toLowerCase(Locale.ROOT).contains(string)) continue;
                this.id_break(new vi_3(this, this, rrGm_12));
            }
        }
    }

    @Override
    public void id_class(vi_3 vi_32) {
        super.id_class(vi_32);
        this.id_public.id_byte(vi_32 != null && !vi_32.id_protected.id_final());
    }

    @Override
    protected void id_class(Lw_1 lw_1) {
        this.id_class(lw_1, vi_32 -> !vi_32.id_protected.id_final());
    }

    @Override
    protected boolean id_class() {
        return this.id_public.id_catch() == this;
    }

    public Fr_1 id_implements() {
        return this.id_public;
    }

    @Override
    protected int id_protected() {
        return super.id_protected() + 20;
    }

    public Optional<vi_3> id_private() {
        return Optional.ofNullable((vi_3)this.id_finally());
    }

    @Override
    public int F_() {
        return super.F_() + 50;
    }
}

