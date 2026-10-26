/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.RootCommandNode
 */
package celestial;

import celestial.gR_2;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;

public class rvB_2 {
    private final ArgumentBuilder<gR_2, ?> id_class;
    private final byte id_break;
    private final int id_byte;
    private final int[] id_protected;
    public CommandNode<gR_2> id_throws;

    public rvB_2(ArgumentBuilder<gR_2, ?> argumentBuilder, byte by, int n, int[] nArray) {
        this.id_class = argumentBuilder;
        this.id_break = by;
        this.id_byte = n;
        this.id_protected = nArray;
    }

    public boolean id_class(rvB_2[] rvB_2Array) {
        if (this.id_throws == null) {
            if (this.id_class == null) {
                this.id_throws = new RootCommandNode();
            } else {
                if ((this.id_break & 8) != 0) {
                    if (rvB_2Array[this.id_byte].id_throws == null) {
                        return false;
                    }
                    this.id_class.redirect(rvB_2Array[this.id_byte].id_throws);
                }
                if ((this.id_break & 4) != 0) {
                    this.id_class.executes(commandContext -> 0);
                }
                this.id_throws = this.id_class.build();
            }
        }
        for (int n : this.id_protected) {
            if (rvB_2Array[n].id_throws != null) continue;
            return false;
        }
        for (int n : this.id_protected) {
            CommandNode<gR_2> commandNode = rvB_2Array[n].id_throws;
            if (commandNode instanceof RootCommandNode) continue;
            this.id_throws.addChild(commandNode);
        }
        return true;
    }
}

