/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.Module;
import celestial.module.util.FtHelper;
import celestial.rrHv_1;
import celestial.rrTF;

public abstract class rrpu_3
extends rrTF<FtHelper>
implements rrHv_1 {
    public rrpu_3(FtHelper ftHelper) {
        super(ftHelper);
    }

    @Override
    public Module id_class() {
        return (Module)this.id_continue();
    }
}

