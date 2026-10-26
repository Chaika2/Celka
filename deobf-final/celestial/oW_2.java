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
   private static final DynamicCommandExceptionType class_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.enchant.failed.entity", var0));
   private static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.enchant.failed.itemless", var0));
   private static final DynamicCommandExceptionType byte_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.enchant.failed.incompatible", var0));
   private static final Dynamic2CommandExceptionType protected_ = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("commands.enchant.failed.level", var0, var1)
   );
   private static final SimpleCommandExceptionType throws_ = new SimpleCommandExceptionType(new rgn_3("commands.enchant.failed"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("enchant").requires(var0x -> var0x.class_(2)))
            .then(
               gp_3.class_("targets", RZ.break_())
                  .then(
                     ((RequiredArgumentBuilder)gp_3.class_("enchantment", Rc_1.class_())
                           .executes(var0x -> class_((gy_3)var0x.getSource(), RZ.break_(var0x, "targets"), Rc_1.class_(var0x, "enchantment"), 1)))
                        .then(
                           gp_3.class_("level", IntegerArgumentType.integer(0))
                              .executes(
                                 var0x -> class_(
                                       (gy_3)var0x.getSource(),
                                       RZ.break_(var0x, "targets"),
                                       Rc_1.class_(var0x, "enchantment"),
                                       IntegerArgumentType.getInteger(var0x, "level")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int class_(gy_3 var0, Collection<? extends an_3> var1, ev_3 var2, int var3) throws CommandSyntaxException {
      if (var3 > var2.class_()) {
         throw protected_.create(var3, var2.class_());
      } else {
         int var4 = 0;

         for (an_3 var6 : var1) {
            if (var6 instanceof iB_2) {
               iB_2 var7 = (iB_2)var6;
               rdn_3 var8 = var7.ss();
               if (!var8.class_()) {
                  if (var2.class_(var8) && eA_2.class_(eA_2.class_(var8).keySet(), var2)) {
                     var8.class_(var2, var3);
                     var4++;
                  } else if (var1.size() == 1) {
                     throw byte_.create(var8.break_().implements_(var8).getString());
                  }
               } else if (var1.size() == 1) {
                  throw break_.create(var7.g().getString());
               }
            } else if (var1.size() == 1) {
               throw class_.create(var6.g().getString());
            }
         }

         if (var4 == 0) {
            throw throws_.create();
         } else {
            if (var1.size() == 1) {
               var0.class_(new rgn_3("commands.enchant.success.single", var2.protected_(var3), ((an_3)var1.iterator().next()).L_()), true);
            } else {
               var0.class_(new rgn_3("commands.enchant.success.multiple", var2.protected_(var3), var1.size()), true);
            }

            return var4;
         }
      }
   }
}
