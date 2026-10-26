/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rlK_2;
import java.util.Objects;

public class rlq_3
extends rlK_2 {
    private final rfH_2 id_class = null;
    private final rfH_2 id_break = null;
    private final long id_byte;

    private rlq_3() {
        super("Synthetic constructor added by MCP, do not call");
        this.id_byte = 0L;
        throw new RuntimeException("Synthetic constructor added by MCP, do not call");
    }

    public String id_class() {
        return super.getMessage() + " here";
    }

    @Override
    public String getMessage() {
        String string = this.id_class.b_() + "," + this.id_class.c_() + "," + this.id_class.d_() + " (relative: " + this.id_break.b_() + "," + this.id_break.c_() + "," + this.id_break.d_() + ")";
        String string2 = super.getMessage();
        Objects.requireNonNull(this);
        return string2 + " at " + string + " (t=" + 0L + ")";
    }

    public rfH_2 id_break() {
        return this.id_class;
    }
}

