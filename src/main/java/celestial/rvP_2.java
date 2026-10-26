/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Queues
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.tree.ArgumentCommandNode
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  com.mojang.brigadier.tree.RootCommandNode
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
package celestial;

import celestial.At_1;
import celestial.RG;
import celestial.Yl_1;
import celestial.gR_2;
import celestial.ruS_2;
import celestial.ruu_3;
import celestial.rvB_2;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;

public class rvP_2
implements ruS_2<At_1> {
    private RootCommandNode<gR_2> id_class;

    private static rvB_2 id_byte(ruu_3 ruu_32) {
        byte by = ruu_32.readByte();
        int[] nArray = ruu_32.id_break();
        int n = (by & 8) != 0 ? ruu_32.id_case() : 0;
        ArgumentBuilder<gR_2, ?> argumentBuilder = rvP_2.id_class(ruu_32, by);
        return new rvB_2(argumentBuilder, by, n, nArray);
    }

    public rvP_2() {
    }

    public rvP_2(RootCommandNode<gR_2> rootCommandNode) {
        this.id_class = rootCommandNode;
    }

    private static void id_class(ruu_3 ruu_32, CommandNode<gR_2> commandNode, Map<CommandNode<gR_2>, Integer> map) {
        int n = 0;
        if (commandNode.getRedirect() != null) {
            n = (byte)(n | 8);
        }
        if (commandNode.getCommand() != null) {
            n = (byte)(n | 4);
        }
        if (commandNode instanceof RootCommandNode) {
            n = (byte)(n | 0);
        } else if (commandNode instanceof ArgumentCommandNode) {
            n = (byte)(n | 2);
            if (((ArgumentCommandNode)commandNode).getCustomSuggestions() != null) {
                n = (byte)(n | 0x10);
            }
        } else {
            if (!(commandNode instanceof LiteralCommandNode)) {
                throw new UnsupportedOperationException("Unknown node type " + commandNode);
            }
            n = (byte)(n | 1);
        }
        ruu_32.writeByte(n);
        ruu_32.id_protected(commandNode.getChildren().size());
        for (CommandNode commandNode2 : commandNode.getChildren()) {
            ruu_32.id_protected(map.get(commandNode2));
        }
        if (commandNode.getRedirect() != null) {
            ruu_32.id_protected(map.get(commandNode.getRedirect()));
        }
        if (commandNode instanceof ArgumentCommandNode) {
            ArgumentCommandNode argumentCommandNode = (ArgumentCommandNode)commandNode;
            ruu_32.id_class(argumentCommandNode.getName());
            RG.id_class(ruu_32, argumentCommandNode.getType());
            if (argumentCommandNode.getCustomSuggestions() != null) {
                ruu_32.id_class(Yl_1.id_class((SuggestionProvider<gR_2>)argumentCommandNode.getCustomSuggestions()));
            }
        } else if (commandNode instanceof LiteralCommandNode) {
            ruu_32.id_class(((LiteralCommandNode)commandNode).getLiteral());
        }
    }

    private static ArgumentBuilder<gR_2, ?> id_class(ruu_3 ruu_32, byte by) {
        int n = by & 3;
        if (n == 2) {
            String string = ruu_32.id_throws(Short.MAX_VALUE);
            ArgumentType<?> argumentType = RG.id_class(ruu_32);
            if (argumentType == null) {
                return null;
            }
            RequiredArgumentBuilder requiredArgumentBuilder = RequiredArgumentBuilder.argument((String)string, argumentType);
            if ((by & 0x10) != 0) {
                requiredArgumentBuilder.suggests(Yl_1.id_class(ruu_32.id_volatile()));
            }
            return requiredArgumentBuilder;
        }
        return n == 1 ? LiteralArgumentBuilder.literal((String)ruu_32.id_throws(Short.MAX_VALUE)) : null;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        rvB_2[] rvB_2Array = new rvB_2[ruu_32.id_case()];
        for (int i = 0; i < rvB_2Array.length; ++i) {
            rvB_2Array[i] = rvP_2.id_byte(ruu_32);
        }
        rvP_2.id_class(rvB_2Array);
        this.id_class = (RootCommandNode)rvB_2Array[ruu_32.id_case()].id_throws;
    }

    private static void id_class(rvB_2[] rvB_2Array) {
        ArrayList arrayList = Lists.newArrayList((Object[])rvB_2Array);
        while (!arrayList.isEmpty()) {
            boolean bl = arrayList.removeIf(rvB_22 -> rvB_22.id_class(rvB_2Array));
            if (bl) continue;
            throw new IllegalStateException("Server sent an impossible command tree");
        }
    }

    private static Object2IntMap<CommandNode<gR_2>> id_class(RootCommandNode<gR_2> rootCommandNode) {
        CommandNode commandNode;
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        ArrayDeque arrayDeque = Queues.newArrayDeque();
        arrayDeque.add(rootCommandNode);
        while ((commandNode = (CommandNode)arrayDeque.poll()) != null) {
            if (object2IntOpenHashMap.containsKey((Object)commandNode)) continue;
            int n = object2IntOpenHashMap.size();
            object2IntOpenHashMap.put((Object)commandNode, n);
            arrayDeque.addAll(commandNode.getChildren());
            if (commandNode.getRedirect() == null) continue;
            arrayDeque.add(commandNode.getRedirect());
        }
        return object2IntOpenHashMap;
    }

    private static CommandNode<gR_2>[] id_class(Object2IntMap<CommandNode<gR_2>> object2IntMap) {
        CommandNode[] commandNodeArray = new CommandNode[object2IntMap.size()];
        for (Object2IntMap.Entry entry : Object2IntMaps.fastIterable(object2IntMap)) {
            commandNodeArray[entry.getIntValue()] = (CommandNode)entry.getKey();
        }
        return commandNodeArray;
    }

    public RootCommandNode<gR_2> id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        Object2IntMap<CommandNode<gR_2>> object2IntMap = rvP_2.id_class(this.id_class);
        CommandNode<gR_2>[] commandNodeArray = rvP_2.id_class(object2IntMap);
        ruu_32.id_protected(commandNodeArray.length);
        for (CommandNode<gR_2> commandNode : commandNodeArray) {
            rvP_2.id_class(ruu_32, commandNode, object2IntMap);
        }
        ruu_32.id_protected(object2IntMap.get(this.id_class));
    }
}

