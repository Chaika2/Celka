package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class oW_2 {
   private static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.enchant.failed.entity", var0));
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.enchant.failed.itemless", var0));
   private static final DynamicCommandExceptionType id_byte = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.enchant.failed.incompatible", var0));
   private static final Dynamic2CommandExceptionType id_protected = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("commands.enchant.failed.level", var0, var1)
   );
   private static final SimpleCommandExceptionType id_throws = new SimpleCommandExceptionType(new rgn_3("commands.enchant.failed"));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("enchant").requires(var0x -> var0x.id_class(2)))
            .then(
               gp_3.id_class("targets", RZ.id_break())
                  .then(
                     ((RequiredArgumentBuilder)gp_3.id_class("enchantment", Rc_1.id_class())
                           .executes(var0x -> id_class((gy_3)var0x.getSource(), RZ.id_break(var0x, "targets"), Rc_1.id_class(var0x, "enchantment"), 1)))
                        .then(
                           gp_3.id_class("level", IntegerArgumentType.integer(0))
                              .executes(
                                 var0x -> id_class(
                                       (gy_3)var0x.getSource(),
                                       RZ.id_break(var0x, "targets"),
                                       Rc_1.id_class(var0x, "enchantment"),
                                       IntegerArgumentType.getInteger(var0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int id_class(gy_3 var0, Collection<? extends an_3> var1, ev_3 var2, int var3) throws CommandSyntaxException {
      if (var3 > var2.id_class()) {
         throw id_protected.create(var3, var2.id_class());
      } else {
         int var4 = 0;

         for (an_3 var6 : var1) {
            if (var6 instanceof iB_2) {
               iB_2 var7 = (iB_2)var6;
               rdn_3 var8 = var7.ss();
               if (!var8.id_class()) {
                  if (var2.id_class(var8) && eA_2.id_class(eA_2.id_class(var8).keySet(), var2)) {
                     var8.id_class(var2, var3);
                     var4++;
                  } else if (var1.size() == 1) {
                     throw id_byte.create(var8.id_break().id_implements(var8).getString());
                  }
               } else if (var1.size() == 1) {
                  throw id_break.create(var7.g().getString());
               }
            } else if (var1.size() == 1) {
               throw id_class.create(var6.g().getString());
            }
         }

         if (var4 == 0) {
            throw id_throws.create();
         } else {
            if (var1.size() == 1) {
               var0.id_class(new rgn_3("commands.enchant.success.single", var2.id_protected(var3), ((an_3)var1.iterator().next()).L_()), true);
            } else {
               var0.id_class(new rgn_3("commands.enchant.success.multiple", var2.id_protected(var3), var1.size()), true);
            }

            return var4;
         }
      }
   }
}
