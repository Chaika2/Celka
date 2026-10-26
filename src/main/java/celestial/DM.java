/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.DD;
import celestial.DG;
import celestial.Do_1;
import celestial.Uh_1;
import celestial.rqO_2;
import celestial.xd_3;
import java.util.function.Function;

public class DM {
    private final Do_1 id_break;
    private rqO_2 id_byte;
    public final /* synthetic */ DG id_class;

    public DM id_byte(xd_3 xd_32) {
        rqO_2 rqO_22 = Uh_1.id_super.id_class(xd_32, this.id_break, this.id_class.id_break);
        rqO_2 rqO_23 = Uh_1.id_this.id_class(xd_32, this.id_break, this.id_class.id_break);
        this.id_class.id_class.accept(DG.id_byte(xd_32, rqO_22, rqO_23));
        rqO_2 rqO_24 = Uh_1.id_else.id_class(xd_32, this.id_break, this.id_class.id_break);
        this.id_class.id_class(xd_32, rqO_24);
        return this;
    }

    public DM(DG dG, Do_1 do_1) {
        this.id_class = dG;
        this.id_break = do_1;
    }

    public DM id_class(xd_3 xd_32, xd_3 xd_33) {
        rqO_2 rqO_22 = Uh_1.id_abstract.id_class(xd_32, this.id_break, this.id_class.id_break);
        this.id_class.id_class.accept(DG.id_byte(xd_32, rqO_22));
        this.id_class.id_class.accept(DG.id_byte(xd_33, rqO_22));
        this.id_class.id_class(xd_32.id_case());
        this.id_class.id_class(xd_33);
        return this;
    }

    public DM id_class(xd_3 xd_32, DD dD) {
        this.id_byte = dD.id_class(xd_32, this.id_break, this.id_class.id_break);
        this.id_class.id_class.accept(DG.id_byte(xd_32, this.id_byte));
        return this;
    }

    public DM id_class(Function<Do_1, rqO_2> function) {
        this.id_byte = function.apply(this.id_break);
        return this;
    }

    public DM id_class(xd_3 xd_32) {
        rqO_2 rqO_22 = Uh_1.id_native.id_class(xd_32, this.id_break, this.id_class.id_break);
        rqO_2 rqO_23 = Uh_1.id_volatile.id_class(xd_32, this.id_break, this.id_class.id_break);
        this.id_class.id_class.accept(DG.id_break(xd_32, rqO_22, rqO_23));
        rqO_2 rqO_24 = Uh_1.id_final.id_class(xd_32, this.id_break, this.id_class.id_break);
        this.id_class.id_class(xd_32, rqO_24);
        return this;
    }

    public DM id_break(xd_3 xd_32) {
        rqO_2 rqO_22 = Uh_1.id_synchronized.id_class(xd_32, this.id_break, this.id_class.id_break);
        rqO_2 rqO_23 = Uh_1.id_return.id_class(xd_32, this.id_break, this.id_class.id_break);
        rqO_2 rqO_24 = Uh_1.id_public.id_class(xd_32, this.id_break, this.id_class.id_break);
        this.id_class.id_class.accept(DG.id_class(xd_32, rqO_22, rqO_23, rqO_24));
        rqO_2 rqO_25 = Uh_1.id_goto.id_class(xd_32, this.id_break, this.id_class.id_break);
        this.id_class.id_class(xd_32, rqO_25);
        return this;
    }

    public DM id_throws(xd_3 xd_32) {
        rqO_2 rqO_22 = Uh_1.id_interface.id_class(xd_32, this.id_break, this.id_class.id_break);
        rqO_2 rqO_23 = Uh_1.id_char.id_class(xd_32, this.id_break, this.id_class.id_break);
        this.id_class.id_class.accept(DG.id_throws(xd_32, rqO_22, rqO_23));
        return this;
    }

    public DM id_catch(xd_3 xd_32) {
        rqO_2 rqO_22 = Uh_1.id_import.id_class(xd_32, this.id_break, this.id_class.id_break);
        rqO_2 rqO_23 = Uh_1.id_static.id_class(xd_32, this.id_break, this.id_class.id_break);
        rqO_2 rqO_24 = Uh_1.id_short.id_class(xd_32, this.id_break, this.id_class.id_break);
        this.id_class.id_class.accept(DG.id_break(xd_32, rqO_22, rqO_23, rqO_24));
        return this;
    }

    public DM id_case(xd_3 xd_32) {
        if (this.id_byte == null) {
            throw new IllegalStateException("Full block not generated yet");
        }
        rqO_2 rqO_22 = Uh_1.id_long.id_class(xd_32, this.id_break, this.id_class.id_break);
        rqO_2 rqO_23 = Uh_1.id_float.id_class(xd_32, this.id_break, this.id_class.id_break);
        this.id_class.id_class.accept(DG.id_throws(xd_32, rqO_22, rqO_23, this.id_byte));
        return this;
    }

    public DM id_protected(xd_3 xd_32) {
        rqO_2 rqO_22 = Uh_1.id_try.id_class(xd_32, this.id_break, this.id_class.id_break);
        rqO_2 rqO_23 = Uh_1.id_while.id_class(xd_32, this.id_break, this.id_class.id_break);
        rqO_2 rqO_24 = Uh_1.id_throw.id_class(xd_32, this.id_break, this.id_class.id_break);
        rqO_2 rqO_25 = Uh_1.id_instanceof.id_class(xd_32, this.id_break, this.id_class.id_break);
        this.id_class.id_class.accept(DG.id_break(xd_32, rqO_22, rqO_23, rqO_24, rqO_25));
        return this;
    }
}

