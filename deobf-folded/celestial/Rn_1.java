package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Rn_1 {
   private final int id_class;
   private final boolean id_break;
   private final boolean id_byte;
   private final Predicate<an_3> id_protected;
   private final Xm_1 id_throws;
   private final Function<rjU_2, rjU_2> id_case;
   private final rfl_3 id_catch;
   private final BiConsumer<rjU_2, List<? extends an_3>> id_private;
   private final boolean id_implements;
   private final String id_finally;
   private final UUID id_extends;
   private final aI_2<?> id_native;
   private final boolean id_volatile;

   public boolean id_byte() {
      return this.id_implements;
   }

   public rhN_2 id_byte(gy_3 var1) throws CommandSyntaxException {
      this.id_throws(var1);
      List var2 = this.id_protected(var1);
      if (var2.size() != 1) {
         throw RZ.id_throws.create();
      } else {
         return (rhN_2)var2.get(0);
      }
   }

   public Rn_1(
      int var1,
      boolean var2,
      boolean var3,
      Predicate<an_3> var4,
      Xm_1 var5,
      Function<rjU_2, rjU_2> var6,
      rfl_3 var7,
      BiConsumer<rjU_2, List<? extends an_3>> var8,
      boolean var9,
      String var10,
      UUID var11,
      aI_2<?> var12,
      boolean var13
   ) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_private = var8;
      this.id_implements = var9;
      this.id_finally = var10;
      this.id_extends = var11;
      this.id_native = var12;
      this.id_volatile = var13;
   }

   private void id_class(List<an_3> var1, rrEm_1 var2, rjU_2 var3, Predicate<an_3> var4) {
      if (this.id_catch != null) {
         var1.addAll(var2.id_class(this.id_native, this.id_catch.id_protected(var3), var4));
      } else {
         var1.addAll(var2.id_class(this.id_native, var4));
      }
   }

   private Predicate<an_3> id_class(rjU_2 var1) {
      Predicate var2 = this.id_protected;
      if (this.id_catch != null) {
         rfl_3 var3 = this.id_catch.id_protected(var1);
         var2 = var2.and(var1x -> var3.id_byte(var1x.rN()));
      }

      if (!this.id_throws.id_byte()) {
         var2 = var2.and(var2x -> this.id_throws.id_class(var2x.id_break(var1)));
      }

      return var2;
   }

   private <T extends an_3> List<T> id_class(rjU_2 var1, List<T> var2) {
      if (var2.size() > 1) {
         this.id_private.accept(var1, var2);
      }

      return var2.subList(0, Math.min(this.id_class, var2.size()));
   }

   public static rVi_1 id_class(List<? extends an_3> var0) {
      return rgv_3.id_break(var0, an_3::L_);
   }

   public an_3 id_class(gy_3 var1) throws CommandSyntaxException {
      this.id_throws(var1);
      List var2 = this.id_break(var1);
      if (var2.isEmpty()) {
         throw RZ.id_protected.create();
      } else if (var2.size() > 1) {
         throw RZ.id_class.create();
      } else {
         return (an_3)var2.get(0);
      }
   }

   public int id_class() {
      return this.id_class;
   }

   public boolean id_break() {
      return this.id_break;
   }

   public List<? extends an_3> id_break(gy_3 var1) throws CommandSyntaxException {
      this.id_throws(var1);
      if (!this.id_break) {
         return this.id_protected(var1);
      } else if (this.id_finally != null) {
         rhN_2 var8 = var1.id_super().x().id_class(this.id_finally);
         return (List<? extends an_3>)(var8 == null ? Collections.emptyList() : Lists.newArrayList(new rhN_2[]{var8}));
      } else if (this.id_extends != null) {
         for (rrEm_1 var9 : var1.id_super().id_float()) {
            an_3 var10 = var9.id_break(this.id_extends);
            if (var10 != null) {
               return Lists.newArrayList(new an_3[]{var10});
            }
         }

         return Collections.emptyList();
      } else {
         rjU_2 var2 = this.id_case.apply(var1.id_volatile());
         Predicate var3 = this.id_class(var2);
         if (this.id_implements) {
            return (List<? extends an_3>)(var1.id_package() != null && var3.test(var1.id_package())
               ? Lists.newArrayList(new an_3[]{var1.id_package()})
               : Collections.emptyList());
         } else {
            ArrayList var4 = Lists.newArrayList();
            if (this.id_protected()) {
               this.id_class(var4, var1.id_final(), var2, var3);
            } else {
               for (rrEm_1 var6 : var1.id_super().id_float()) {
                  this.id_class(var4, var6, var2, var3);
               }
            }

            return this.id_class(var2, var4);
         }
      }
   }

   private void id_throws(gy_3 var1) throws CommandSyntaxException {
      if (this.id_volatile && !var1.id_class(2)) {
         throw RZ.id_case.create();
      }
   }

   public List<rhN_2> id_protected(gy_3 var1) throws CommandSyntaxException {
      this.id_throws(var1);
      if (this.id_finally != null) {
         rhN_2 var8 = var1.id_super().x().id_class(this.id_finally);
         return (List<rhN_2>)(var8 == null ? Collections.emptyList() : Lists.newArrayList(new rhN_2[]{var8}));
      } else if (this.id_extends != null) {
         rhN_2 var7 = var1.id_super().x().id_class(this.id_extends);
         return (List<rhN_2>)(var7 == null ? Collections.emptyList() : Lists.newArrayList(new rhN_2[]{var7}));
      } else {
         rjU_2 var2 = this.id_case.apply(var1.id_volatile());
         Predicate var3 = this.id_class(var2);
         if (this.id_implements) {
            if (var1.id_package() instanceof rhN_2) {
               rhN_2 var9 = (rhN_2)var1.id_package();
               if (var3.test(var9)) {
                  return Lists.newArrayList(new rhN_2[]{var9});
               }
            }

            return Collections.emptyList();
         } else {
            Object var4;
            if (this.id_protected()) {
               var4 = var1.id_final().id_class(var3::test);
            } else {
               var4 = Lists.newArrayList();

               for (rhN_2 var6 : var1.id_super().x().id_super()) {
                  if (var3.test(var6)) {
                     var4.add(var6);
                  }
               }
            }

            return this.id_class(var2, (List<rhN_2>)var4);
         }
      }
   }

   public boolean id_protected() {
      return this.id_byte;
   }
}
