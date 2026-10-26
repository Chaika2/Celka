/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.NK;
import celestial.NX;
import java.util.function.Consumer;

public class NJ {
    public NK id_break;
    private boolean id_byte;
    public final /* synthetic */ NX id_class;

    public NJ(NX nX, NK nK) {
        this.id_class = nX;
        this.id_break = nK;
    }

    public void id_class(Consumer<NK> consumer) {
        this.id_class.id_byte.execute(() -> {
            if (this.id_break != null) {
                consumer.accept(this.id_break);
            }
        });
    }

    public boolean id_class() {
        return this.id_byte;
    }

    public void id_break() {
        this.id_byte = true;
        this.id_class.id_break.id_class(this.id_break);
        this.id_break = null;
    }
}

