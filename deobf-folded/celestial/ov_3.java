package celestial;

import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ov_3 {
   private static final Dynamic2CommandExceptionType id_class = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("commands.forceload.toobig", var0, var1)
   );
   private static final Dynamic2CommandExceptionType id_break = new Dynamic2CommandExceptionType(
      (var0, var1) -> new rgn_3("commands.forceload.query.failure", var0, var1)
   );
   private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType(new rgn_3("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType(new rgn_3("commands.forceload.removed.failure"));

   private static int id_class(gy_3 var0, rfg_3 var1) throws CommandSyntaxException {
      rfj_3 var2 = new rfj_3(var1.id_class >> 4, var1.id_break >> 4);
      rrEm_1 var3 = var0.id_final();
      rqM_2 var4 = var3.E();
      boolean var5 = var3.x().contains(var2.id_class());
      if (var5) {
         var0.id_class(new rgn_3("commands.forceload.query.success", var2, var4.id_class()), false);
         return 1;
      } else {
         throw id_break.create(var2, var4.id_class());
      }
   }

   private static int id_class(gy_3 var0) {
      rrEm_1 var1 = var0.id_final();
      rqM_2 var2 = var1.E();
      LongSet var3 = var1.x();
      int var4 = var3.size();
      if (var4 > 0) {
         String var5 = Joiner.on(", ").join(var3.stream().sorted().map(rfj_3::new).map(rfj_3::toString).iterator());
         if (var4 == 1) {
            var0.id_class(new rgn_3("commands.forceload.list.single", var2.id_class(), var5), false);
         } else {
            var0.id_class(new rgn_3("commands.forceload.list.multiple", var4, var2.id_class(), var5), false);
         }
      } else {
         var0.id_class(new rgn_3("commands.forceload.added.none", var2.id_class()));
      }

      return var4;
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("forceload")
                     .requires(var0x -> var0x.id_class(2)))
                  .then(
                     gp_3.id_class("add")
                        .then(
                           ((RequiredArgumentBuilder)gp_3.id_class("from", Rz_1.id_class())
                                 .executes(var0x -> id_class((gy_3)var0x.getSource(), Rz_1.id_class(var0x, "from"), Rz_1.id_class(var0x, "from"), true)))
                              .then(
                                 gp_3.id_class("to", Rz_1.id_class())
                                    .executes(var0x -> id_class((gy_3)var0x.getSource(), Rz_1.id_class(var0x, "from"), Rz_1.id_class(var0x, "to"), true))
                              )
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)gp_3.id_class("remove")
                        .then(
                           ((RequiredArgumentBuilder)gp_3.id_class("from", Rz_1.id_class())
                                 .executes(var0x -> id_class((gy_3)var0x.getSource(), Rz_1.id_class(var0x, "from"), Rz_1.id_class(var0x, "from"), false)))
                              .then(
                                 gp_3.id_class("to", Rz_1.id_class())
                                    .executes(var0x -> id_class((gy_3)var0x.getSource(), Rz_1.id_class(var0x, "from"), Rz_1.id_class(var0x, "to"), false))
                              )
                        ))
                     .then(gp_3.id_class("all").executes(var0x -> id_break((gy_3)var0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)gp_3.id_class("query").executes(var0x -> id_class((gy_3)var0x.getSource())))
                  .then(gp_3.id_class("pos", Rz_1.id_class()).executes(var0x -> id_class((gy_3)var0x.getSource(), Rz_1.id_class(var0x, "pos"))))
            )
      );
   }

   private static int id_class(gy_3 var0, rfg_3 var1, rfg_3 var2, boolean var3) throws CommandSyntaxException {
      int var4 = Math.min(var1.id_class, var2.id_class);
      int var5 = Math.min(var1.id_break, var2.id_break);
      int var6 = Math.max(var1.id_class, var2.id_class);
      int var7 = Math.max(var1.id_break, var2.id_break);
      if (var4 >= -30000000 && var5 >= -30000000 && var6 < 30000000 && var7 < 30000000) {
         int var8 = var4 >> 4;
         int var9 = var5 >> 4;
         int var10 = var6 >> 4;
         int var11 = var7 >> 4;
         long var12 = ((long)(var10 - var8) + 1L) * ((long)(var11 - var9) + 1L);
         if (var12 > 256L) {
            throw id_class.create(256, var12);
         } else {
            rrEm_1 var14 = var0.id_final();
            rqM_2 var15 = var14.E();
            rfj_3 var16 = null;
            int var17 = 0;

            for (int var18 = var8; var18 <= var10; var18++) {
               for (int var19 = var9; var19 <= var11; var19++) {
                  boolean var20 = var14.id_class(var18, var19, var3);
                  if (var20) {
                     var17++;
                     if (var16 == null) {
                        var16 = new rfj_3(var18, var19);
                     }
                  }
               }
            }

            if (var17 == 0) {
               throw (var3 ? id_byte : id_protected).create();
            } else {
               if (var17 == 1) {
                  var0.id_class(new rgn_3("commands.forceload." + (var3 ? "added" : "removed") + ".single", var16, var15.id_class()), true);
               } else {
                  rfj_3 var21 = new rfj_3(var8, var9);
                  rfj_3 var22 = new rfj_3(var10, var11);
                  var0.id_class(new rgn_3("commands.forceload." + (var3 ? "added" : "removed") + ".multiple", var17, var15.id_class(), var21, var22), true);
               }

               return var17;
            }
         }
      } else {
         throw RM.id_break.create();
      }
   }

   private static int id_break(gy_3 var0) {
      rrEm_1 var1 = var0.id_final();
      rqM_2 var2 = var1.E();
      LongSet var3 = var1.x();
      var3.forEach(var1x -> var1.id_class(rfj_3.id_class(var1x), rfj_3.id_break(var1x), false));
      var0.id_class(new rgn_3("commands.forceload.removed.all", var2.id_class()), true);
      return 0;
   }
}
