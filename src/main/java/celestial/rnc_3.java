/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVm_1;
import celestial.rnp_3;
import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class rnc_3 {
    private final Path id_class;
    private rnp_3 id_break;

    public rnc_3(rVm_1 rVm_12, Path path) {
        this.id_class = path;
        this.id_break = rnp_3.id_class(rVm_12, path);
    }

    public rnc_3 id_class(UnaryOperator<rnp_3> unaryOperator) {
        this.id_break = (rnp_3)unaryOperator.apply(this.id_break);
        this.id_break.id_break(this.id_class);
        return this;
    }

    public rnp_3 id_class() {
        return this.id_break;
    }

    public void id_break() {
        this.id_break.id_break(this.id_class);
    }
}

