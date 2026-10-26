/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 */
package celestial;

import celestial.LF;
import celestial.Ml_1;
import celestial.Qj_1;
import celestial.cN_2;
import celestial.mT_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class mq_3
extends mT_2 {
    private final rgP_2 id_catch;
    private final rgP_2 id_private;
    private final String id_implements;
    private final boolean id_finally;

    public mq_3(BooleanConsumer booleanConsumer, String string, boolean bl) {
        super(booleanConsumer, new rgn_3(bl ? "chat.link.confirmTrusted" : "chat.link.confirm"), new rgN_2(string));
        this.id_class = bl ? new rgn_3("chat.link.open") : cN_2.id_throws;
        this.id_throws = bl ? cN_2.id_protected : cN_2.id_case;
        this.id_private = new rgn_3("chat.copy");
        this.id_catch = new rgn_3("chat.link.warning");
        this.id_finally = !bl;
        this.id_implements = string;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        super.id_class(ml_1, n, n2, f);
        if (this.id_finally) {
            mq_3.id_class(ml_1, this.id_super, this.id_catch, this.id_package / 2, 110, 0xFFCCCC);
        }
    }

    public void id_finally() {
        ((Qj_1)this.id_volatile.id_class[23]).id_class(this.id_implements);
    }

    @Override
    protected void v_() {
        super.v_();
        this.id_new.clear();
        this.id_native.clear();
        this.id_class(new LF(this.id_package / 2 - 50 - 105, this.id_int / 6 + 96, 100, 20, this.id_class, lF -> this.id_case.accept(true)));
        this.id_class(new LF(this.id_package / 2 - 50, this.id_int / 6 + 96, 100, 20, this.id_private, lF -> {
            this.id_finally();
            this.id_case.accept(false);
        }));
        this.id_class(new LF(this.id_package / 2 - 50 + 105, this.id_int / 6 + 96, 100, 20, this.id_throws, lF -> this.id_case.accept(false)));
    }
}

