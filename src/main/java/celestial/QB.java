/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QP;
import celestial.QS;
import celestial.Qs_1;

public class QB {
    private Qs_1 id_class = Qs_1.NORMAL;
    private boolean id_break = true;
    private boolean id_byte;
    private boolean id_protected;
    private boolean id_throws;
    private boolean id_case = true;
    private final QS id_catch;
    private boolean id_private = true;

    public QB id_byte() {
        this.id_break = false;
        return this;
    }

    public QB(QS qS) {
        this.id_catch = qS;
    }

    public QB id_class() {
        this.id_protected = true;
        return this;
    }

    public QB id_break() {
        this.id_case = false;
        return this;
    }

    public QB id_throws() {
        this.id_throws = true;
        return this;
    }

    protected QB id_catch() {
        this.id_class = Qs_1.BLOCK;
        return this;
    }

    protected QB id_case() {
        this.id_class = Qs_1.DESTROY;
        return this;
    }

    public QB id_implements() {
        this.id_private = false;
        return this;
    }

    protected QB id_protected() {
        this.id_byte = true;
        return this;
    }

    public QP id_private() {
        return new QP(this.id_catch, this.id_protected, this.id_case, this.id_break, this.id_private, this.id_byte, this.id_throws, this.id_class);
    }
}

