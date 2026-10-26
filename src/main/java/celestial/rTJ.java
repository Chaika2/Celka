/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rTX;
import java.util.function.Consumer;

public class rTJ
implements rTX<Msg> {
    public final /* synthetic */ String id_class;
    public final /* synthetic */ Consumer id_break;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rTJ(String string, Consumer consumer) {
        this.id_class = string;
        this.id_break = consumer;
    }

    public String toString() {
        return this.id_class;
    }

    @Override
    public void id_class(Msg Msg) {
        this.id_break.accept(Msg);
    }

    @Override
    public String j_() {
        return this.id_class;
    }
}

