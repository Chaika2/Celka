package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class roN_2 {
   private static final EnumSet<rKv_1> id_final = EnumSet.of(rKv_1.OCEAN_FLOOR_WG, rKv_1.WORLD_SURFACE_WG);
   private static final EnumSet<rKv_1> id_package = EnumSet.of(rKv_1.OCEAN_FLOOR, rKv_1.WORLD_SURFACE, rKv_1.MOTION_BLOCKING, rKv_1.MOTION_BLOCKING_NO_LEAVES);
   private static final rou_3 id_int = (var0, var1, var2, var3, var4, var5) -> {
      if (var5 instanceof rok_3 && !var5.id_goto().id_break(var0)) {
         ((rok_3)var5).id_class(var0);
      }

      return CompletableFuture.completedFuture(Either.left(var5));
   };
   public static final roN_2 id_class = id_class("empty", (roN_2)null, -1, id_final, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> {
   });
   public static final roN_2 id_break = id_class(
      "structure_starts", id_class, 0, id_final, roZ_2.PROTOCHUNK, (var0, var1, var2, var3, var4, var5, var6, var7) -> {
         if (!var7.id_goto().id_break(var0)) {
            if (var1.id_const().rB().id_long().id_break()) {
               var2.id_class(var1.id_new(), var1.id_protected(), var7, var3, var1.id_break());
            }

            if (var7 instanceof rok_3) {
               ((rok_3)var7).id_class(var0);
            }
         }

         return CompletableFuture.completedFuture(Either.left(var7));
      }
   );
   public static final roN_2 id_byte = id_class("structure_references", id_break, 8, id_final, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> {
      rKf_1 var4 = new rKf_1(var0, var2);
      var1.id_class((rRI)var4, var0.id_protected().id_class(var4), var3);
   });
   public static final roN_2 id_protected = id_class(
      "biomes", id_byte, 0, id_final, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> var1.id_class(var0.id_new().id_break(rVL.n), var3)
   );
   public static final roN_2 id_throws = id_class("noise", id_protected, 8, id_final, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> {
      rKf_1 var4 = new rKf_1(var0, var2);
      var1.id_class((rRg_1)var4, var0.id_protected().id_class(var4), var3);
   });
   public static final roN_2 id_case = id_class(
      "surface", id_throws, 0, id_final, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> var1.id_class(new rKf_1(var0, var2), var3)
   );
   public static final roN_2 id_catch = id_class(
      "carvers", id_case, 0, id_final, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> var1.id_class(var0.id_break(), var0.id_static(), var3, rKu_1.AIR)
   );
   public static final roN_2 id_private = id_class(
      "liquid_carvers",
      id_catch,
      0,
      id_package,
      roZ_2.PROTOCHUNK,
      (var0, var1, var2, var3) -> var1.id_class(var0.id_break(), var0.id_static(), var3, rKu_1.LIQUID)
   );
   public static final roN_2 id_implements = id_class(
      "features", id_private, 8, id_package, roZ_2.PROTOCHUNK, (var0, var1, var2, var3, var4, var5, var6, var7) -> {
         rok_3 var8 = (rok_3)var7;
         var8.id_class(var4);
         if (!var7.id_goto().id_break(var0)) {
            rKZ.id_class(var7, EnumSet.of(rKv_1.MOTION_BLOCKING, rKv_1.MOTION_BLOCKING_NO_LEAVES, rKv_1.OCEAN_FLOOR, rKv_1.WORLD_SURFACE));
            rKf_1 var9 = new rKf_1(var1, var6);
            var2.id_class(var9, var1.id_protected().id_class(var9));
            var8.id_class(var0);
         }

         return CompletableFuture.completedFuture(Either.left(var7));
      }
   );
   public static final roN_2 id_finally = id_class(
      "light",
      id_implements,
      1,
      id_package,
      roZ_2.PROTOCHUNK,
      (var0, var1, var2, var3, var4, var5, var6, var7) -> id_class(var0, var4, var7),
      (var0, var1, var2, var3, var4, var5) -> id_class(var0, var3, var5)
   );
   public static final roN_2 id_extends = id_class(
      "spawn", id_finally, 0, id_package, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> var1.id_class(new rKf_1(var0, var2))
   );
   public static final roN_2 id_native = id_class("heightmaps", id_extends, 0, id_package, roZ_2.PROTOCHUNK, (var0, var1, var2, var3) -> {
   });
   public static final roN_2 id_volatile = id_class(
      "full",
      id_native,
      0,
      id_package,
      roZ_2.LEVELCHUNK,
      (var0, var1, var2, var3, var4, var5, var6, var7) -> var5.apply(var7),
      (var0, var1, var2, var3, var4, var5) -> var4.apply(var5)
   );
   private static final List<roN_2> id_new = ImmutableList.of(
      id_volatile, id_implements, id_private, id_break, id_break, id_break, id_break, id_break, id_break, id_break, id_break
   );
   private static final IntList id_continue = rqR_2.id_class(new IntArrayList(id_class().size()), var0 -> {
      int var1 = 0;

      for (int var2 = id_class().size() - 1; var2 >= 0; var2--) {
         while (var1 + 1 < id_new.size() && var2 <= id_new.get(var1 + 1).id_byte()) {
            var1++;
         }

         var0.add(0, var1);
      }
   });
   private final String id_super;
   private final int id_this;
   private final roN_2 id_else;
   private final roc_3 id_synchronized;
   private final rou_3 id_return;
   private final int id_public;
   private final roZ_2 id_goto;
   private final EnumSet<rKv_1> id_while;

   public int id_byte() {
      return this.id_this;
   }

   roN_2(String var1, roN_2 var2, int var3, EnumSet<rKv_1> var4, roZ_2 var5, roc_3 var6, rou_3 var7) {
      this.id_super = var1;
      this.id_else = var2 == null ? this : var2;
      this.id_synchronized = var6;
      this.id_return = var7;
      this.id_public = var3;
      this.id_goto = var5;
      this.id_while = var4;
      this.id_this = var2 == null ? 0 : var2.id_byte() + 1;
   }

   @Override
   public String toString() {
      return rVL.S.id_break(this).toString();
   }

   public static roN_2 id_class(String var0) {
      return rVL.S.id_class(rqO_2.id_break(var0));
   }

   private static CompletableFuture<Either<roC_2, rrEM>> id_class(roN_2 var0, rrEZ var1, roC_2 var2) {
      boolean var3 = id_class(var0, var2);
      if (!var2.id_goto().id_break(var0)) {
         ((rok_3)var2).id_class(var0);
      }

      return var1.id_class(var2, var3).thenApply(Either::left);
   }

   public CompletableFuture<Either<roC_2, rrEM>> id_class(
      rrEm_1 var1, rrPt_1 var2, rrEZ var3, Function<roC_2, CompletableFuture<Either<roC_2, rrEM>>> var4, roC_2 var5
   ) {
      return this.id_return.doWork(this, var1, var2, var3, var4, var5);
   }

   private static roN_2 id_class(String var0, roN_2 var1, int var2, EnumSet<rKv_1> var3, roZ_2 var4, roc_3 var5, rou_3 var6) {
      return rVL.id_class(rVL.S, var0, new roN_2(var0, var1, var2, var3, var4, var5, var6));
   }

   public static int id_class(roN_2 var0) {
      return id_continue.getInt(var0.id_byte());
   }

   public static roN_2 id_class(int var0) {
      if (var0 >= id_new.size()) {
         return id_class;
      } else {
         return var0 < 0 ? id_volatile : id_new.get(var0);
      }
   }

   private static boolean id_class(roN_2 var0, roC_2 var1) {
      return var1.id_goto().id_break(var0) && var1.id_throw();
   }

   public static List<roN_2> id_class() {
      ArrayList var0 = Lists.newArrayList();

      roN_2 var1;
      for (var1 = id_volatile; var1.id_throws() != var1; var1 = var1.id_throws()) {
         var0.add(var1);
      }

      var0.add(var1);
      Collections.reverse(var0);
      return var0;
   }

   public CompletableFuture<Either<roC_2, rrEM>> id_class(
      rrEm_1 var1, rKd_1 var2, rrPt_1 var3, rrEZ var4, Function<roC_2, CompletableFuture<Either<roC_2, rrEM>>> var5, List<roC_2> var6
   ) {
      return this.id_synchronized.doWork(this, var1, var2, var3, var4, var5, var6, (roC_2)var6.get(var6.size() / 2));
   }

   private static roN_2 id_class(String var0, roN_2 var1, int var2, EnumSet<rKv_1> var3, roZ_2 var4, roc_3 var5) {
      return id_class(var0, var1, var2, var3, var4, var5, id_int);
   }

   private static roN_2 id_class(String var0, roN_2 var1, int var2, EnumSet<rKv_1> var3, roZ_2 var4, rom_3 var5) {
      return id_class(var0, var1, var2, var3, var4, (roc_3)var5);
   }

   public boolean id_break(roN_2 var1) {
      return this.id_byte() >= var1.id_byte();
   }

   public static int id_break() {
      return id_new.size();
   }

   public roN_2 id_throws() {
      return this.id_else;
   }

   public roZ_2 id_catch() {
      return this.id_goto;
   }

   public int id_case() {
      return this.id_public;
   }

   public String id_protected() {
      return this.id_super;
   }

   public EnumSet<rKv_1> id_private() {
      return this.id_while;
   }
}
