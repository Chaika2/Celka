/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.rgP_2;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class gH_2
extends RuntimeException {
    private final rgP_2 id_class;

    public gH_2(rgP_2 rgP_22) {
        super(rgP_22.getString(), null, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES);
        this.id_class = rgP_22;
    }

    public rgP_2 id_class() {
        return this.id_class;
    }
}

