/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rmT_2
implements ruS_2<rmH_2> {
    private String id_class;

    public rmT_2() {
    }

    public rmT_2(String string) {
        if (string.length() > 256) {
            string = string.substring(0, 256);
        }
        this.id_class = string;
    }

    @Override
    public void id_class(String string) {
        this.id_class = string;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_throws(256);
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
    }

    public String id_break() {
        return this.id_class;
    }
}

