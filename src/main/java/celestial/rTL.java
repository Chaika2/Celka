/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.DataFixerBuilder
 */
package celestial;

import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DataFixerBuilder;
import java.util.concurrent.Executor;

public class rTL
extends DataFixerBuilder {
    private static final Executor id_class = runnable -> {};

    public rTL(int n) {
        super(n);
    }

    public DataFixer build(Executor executor) {
        return super.build(id_class);
    }
}

