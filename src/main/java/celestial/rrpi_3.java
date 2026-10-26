/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.Module;
import celestial.module.util.HwHelper;
import celestial.rrHv_1;
import celestial.rrTF;

public abstract class rrpi_3
extends rrTF<HwHelper>
implements rrHv_1 {
    public rrpi_3(HwHelper hwHelper) {
        super(hwHelper);
    }

    @Override
    public Module id_class() {
        return (Module)this.id_continue();
    }
}

