/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rmH_2;
import celestial.rmU_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rmD_2
implements ruS_2<rmH_2> {
    private int id_protected;
    private rmU_2 id_throws;
    private int id_case;
    public static rmU_2 id_class;
    public static boolean id_break;
    public static boolean id_byte;

    public int id_byte() {
        return this.id_case;
    }

    public rmD_2(an_3 an_32, rmU_2 rmU_22, int n) {
        this.id_protected = an_32.V();
        this.id_throws = rmU_22;
        this.id_case = n;
        id_class = rmU_22;
        if (rmU_22 == rmU_2.START_SPRINTING) {
            id_break = true;
        } else if (rmU_22 == rmU_2.STOP_SPRINTING) {
            id_break = false;
        }
        if (rmU_22 == rmU_2.PRESS_SHIFT_KEY) {
            id_byte = true;
        } else if (rmU_22 == rmU_2.RELEASE_SHIFT_KEY) {
            id_byte = false;
        }
    }

    public rmD_2(an_3 an_32, rmU_2 rmU_22) {
        this(an_32, rmU_22, 0);
    }

    public rmD_2() {
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_protected = ruu_32.id_case();
        this.id_throws = ruu_32.id_class(rmU_2.class);
        this.id_case = ruu_32.id_case();
    }

    public rmU_2 id_break() {
        return this.id_throws;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_protected);
        ruu_32.id_class(this.id_throws);
        ruu_32.id_protected(this.id_case);
    }
}

