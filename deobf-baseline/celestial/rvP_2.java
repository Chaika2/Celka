package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;

public class rvP_2 implements ruS_2<At_1> {
   private RootCommandNode<gR_2> id_class;

   private static rvB_2 id_byte(ruu_3 var0) {
      byte var1 = var0.readByte();
      int[] var2 = var0.id_break();
      int var3 = (var1 & 8) != 0 ? var0.id_case() : 0;
      ArgumentBuilder var4 = id_class(var0, var1);
      return new rvB_2(var4, var1, var3, var2);
   }

   public rvP_2() {
   }

   public rvP_2(RootCommandNode<gR_2> var1) {
      this.id_class = var1;
   }

   private static void id_class(ruu_3 var0, CommandNode<gR_2> var1, Map<CommandNode<gR_2>, Integer> var2) {
      byte var3 = 0;
      if (var1.getRedirect() != null) {
         var3 = (byte)(var3 | 8);
      }

      if (var1.getCommand() != null) {
         var3 = (byte)(var3 | 4);
      }

      if (var1 instanceof RootCommandNode) {
         var3 = (byte)(var3 | 0);
      } else if (var1 instanceof ArgumentCommandNode) {
         var3 = (byte)(var3 | 2);
         if (((ArgumentCommandNode)var1).getCustomSuggestions() != null) {
            var3 = (byte)(var3 | 16);
         }
      } else {
         if (!(var1 instanceof LiteralCommandNode)) {
            throw new UnsupportedOperationException("Unknown node type " + var1);
         }

         var3 = (byte)(var3 | 1);
      }

      var0.writeByte(var3);
      var0.id_protected(var1.getChildren().size());

      for (CommandNode var5 : var1.getChildren()) {
         var0.id_protected((Integer)var2.get(var5));
      }

      if (var1.getRedirect() != null) {
         var0.id_protected((Integer)var2.get(var1.getRedirect()));
      }

      if (var1 instanceof ArgumentCommandNode var7) {
         var0.id_class(var7.getName());
         RG.id_class(var0, var7.getType());
         if (var7.getCustomSuggestions() != null) {
            var0.id_class(Yl_1.id_class(var7.getCustomSuggestions()));
         }
      } else if (var1 instanceof LiteralCommandNode) {
         var0.id_class(((LiteralCommandNode)var1).getLiteral());
      }
   }

   private static ArgumentBuilder<gR_2, ?> id_class(ruu_3 var0, byte var1) {
      int var2 = var1 & 3;
      if (var2 == 2) {
         String var3 = var0.id_throws(32767);
         ArgumentType var4 = RG.id_class(var0);
         if (var4 == null) {
            return null;
         } else {
            RequiredArgumentBuilder var5 = RequiredArgumentBuilder.argument(var3, var4);
            if ((var1 & 16) != 0) {
               var5.suggests(Yl_1.id_class(var0.id_volatile()));
            }

            return var5;
         }
      } else {
         return var2 == 1 ? LiteralArgumentBuilder.literal(var0.id_throws(32767)) : null;
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      rvB_2[] var2 = new rvB_2[var1.id_case()];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = id_byte(var1);
      }

      id_class(var2);
      this.id_class = (RootCommandNode<gR_2>)var2[var1.id_case()].id_throws;
   }

   private static void id_class(rvB_2[] var0) {
      ArrayList var1 = Lists.newArrayList(var0);

      while (!var1.isEmpty()) {
         boolean var2 = var1.removeIf(var1x -> var1x.id_class(var0));
         if (!var2) {
            throw new IllegalStateException("Server sent an impossible command tree");
         }
      }
   }

   private static Object2IntMap<CommandNode<gR_2>> id_class(RootCommandNode<gR_2> var0) {
      Object2IntOpenHashMap var1 = new Object2IntOpenHashMap();
      ArrayDeque var2 = Queues.newArrayDeque();
      var2.add(var0);

      CommandNode var3;
      while ((var3 = (CommandNode)var2.poll()) != null) {
         if (!var1.containsKey(var3)) {
            int var4 = var1.size();
            var1.put(var3, var4);
            var2.addAll(var3.getChildren());
            if (var3.getRedirect() != null) {
               var2.add(var3.getRedirect());
            }
         }
      }

      return var1;
   }

   private static CommandNode<gR_2>[] id_class(Object2IntMap<CommandNode<gR_2>> var0) {
      CommandNode[] var1 = new CommandNode[var0.size()];
      ObjectIterator var2 = Object2IntMaps.fastIterable(var0).iterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1[var3.getIntValue()] = (CommandNode)var3.getKey();
      }

      return var1;
   }

   public RootCommandNode<gR_2> id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      Object2IntMap var2 = id_class(this.id_class);
      CommandNode[] var3 = id_class(var2);
      var1.id_protected(var3.length);

      for (CommandNode var7 : var3) {
         id_class(var1, var7, var2);
      }

      var1.id_protected(var2.get(this.id_class));
   }
}
