/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFs_1
implements ruS_2<At_1> {
    private String id_class;
    private String id_break;

    public String id_byte() {
        return this.id_break;
    }

    public rFs_1() {
    }

    public rFs_1(String string, String string2) {
        this.id_class = string;
        this.id_break = string2;
        if (string2.length() > 40) {
            throw new IllegalArgumentException("Hash is too long (max 40, was " + string2.length() + ")");
        }
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_throws(Short.MAX_VALUE);
        this.id_break = ruu_32.id_throws(40);
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.id_class(this.id_break);
    }

    public String id_break() {
        return this.id_class;
    }
}

