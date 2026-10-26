/*
 * Decompiled with CFR 0.152.
 */
package celestial.module;

import celestial.module.Module;
import java.util.ArrayList;

public class ModuleManager
extends ArrayList<Module> {
    public Module id_class(Class<? extends Module> var1) {
        for (Module var3 : this) {
            if (var3.getClass() != var1) continue;
            return var3;
        }
        return null;
    }
}

