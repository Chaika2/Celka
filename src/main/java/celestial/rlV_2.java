/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rlD_2;
import celestial.rlK_2;
import celestial.rle_3;
import java.util.Iterator;
import java.util.List;

public class rlV_2 {
    private final rle_3 id_class = null;
    private final List<rlD_2> id_break = null;
    private long id_byte;

    private void id_byte(long l) {
        Iterator<rlD_2> iterator = this.id_break.iterator();
        while (iterator.hasNext()) {
            rlD_2 rlD_22 = iterator.next();
            rlD_22.id_break.run();
            iterator.remove();
            long l2 = l - this.id_byte;
            long l3 = this.id_byte;
            this.id_byte = l;
            if (rlD_22.id_class == null || rlD_22.id_class == l2) continue;
            this.id_class.id_class(new rlK_2("Succeeded in invalid tick: expected " + (l3 + rlD_22.id_class) + ", but current tick is " + l));
            break;
        }
    }

    private rlV_2() {
        throw new RuntimeException("Synthetic constructor added by MCP, do not call");
    }

    public void id_class(long l) {
        try {
            this.id_byte(l);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void id_break(long l) {
        try {
            this.id_byte(l);
        }
        catch (Exception exception) {
            this.id_class.id_class(exception);
        }
    }
}

