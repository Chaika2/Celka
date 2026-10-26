/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBW;
import celestial.rBk_1;
import celestial.rEB;
import celestial.rrEr_1;
import java.util.EnumSet;

public class rES
extends rBk_1 {
    private final rEB id_break;
    public final /* synthetic */ rEB id_class;

    @Override
    public void id_byte() {
        this.id_break.id_else(true);
        super.id_byte();
    }

    public rES(rEB rEB2, rEB rEB3) {
        this.id_class = rEB2;
        this.id_break = rEB3;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        rrEr_1 rrEr_12 = this.id_break.sx();
        return this.id_break.BM() && this.id_break.I_() == null && rrEr_12 != null && rrEr_12.id_case();
    }

    @Override
    public void id_throws() {
        if (!this.id_break.BF() && rEB.id_class(this.id_break).nextInt(100) == 0) {
            this.id_class.id_class(this.id_class.sQ(), rEB.id_break(this.id_class), rEB.id_byte(this.id_class));
        }
        if (!this.id_break.Pm() && rEB.id_protected(this.id_break).nextInt(50) == 0) {
            this.id_break.id_else().id_class();
        }
        super.id_throws();
    }

    @Override
    public void id_protected() {
        this.id_break.id_else(false);
        super.id_protected();
    }
}

