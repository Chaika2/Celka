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
   private final int class_;
   private final boolean break_;
   private final boolean byte_;
   private final Predicate<an_3> protected_;
   private final Xm_1 throws_;
   private final Function<rjU_2, rjU_2> case_;
   private final rfl_3 catch_;
   private final BiConsumer<rjU_2, List<? extends an_3>> private_;
   private final boolean implements_;
   private final String finally_;
   private final UUID extends_;
   private final aI_2<?> native_;
   private final boolean volatile_;

   public boolean byte_() {
      return this.implements_;
   }

   public rhN_2 byte_(gy_3 var1) throws CommandSyntaxException {
      this.throws_(var1);
      List var2 = this.protected_(var1);
      if (var2.size() != 1) {
         throw RZ.throws_.create();
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
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
      this.private_ = var8;
      this.implements_ = var9;
      this.finally_ = var10;
      this.extends_ = var11;
      this.native_ = var12;
      this.volatile_ = var13;
   }

   private void class_(List<an_3> var1, rrEm_1 var2, rjU_2 var3, Predicate<an_3> var4) {
      if (this.catch_ != null) {
         var1.addAll(var2.class_(this.native_, this.catch_.protected_(var3), var4));
      } else {
         var1.addAll(var2.class_(this.native_, var4));
      }
   }

   private Predicate<an_3> class_(rjU_2 var1) {
      Predicate var2 = this.protected_;
      if (this.catch_ != null) {
         rfl_3 var3 = this.catch_.protected_(var1);
         var2 = var2.and(var1x -> var3.byte_(var1x.rN()));
      }

      if (!this.throws_.byte_()) {
         var2 = var2.and(var2x -> this.throws_.class_(var2x.break_(var1)));
      }

      return var2;
   }

   private <T extends an_3> List<T> class_(rjU_2 var1, List<T> var2) {
      if (var2.size() > 1) {
         this.private_.accept(var1, var2);
      }

      return var2.subList(0, Math.min(this.class_, var2.size()));
   }

   public static rVi_1 class_(List<? extends an_3> var0) {
      return rgv_3.break_(var0, an_3::L_);
   }

   public an_3 class_(gy_3 var1) throws CommandSyntaxException {
      this.throws_(var1);
      List var2 = this.break_(var1);
      if (var2.isEmpty()) {
         throw RZ.protected_.create();
      } else if (var2.size() > 1) {
         throw RZ.class_.create();
      } else {
         return (an_3)var2.get(0);
      }
   }

   public int class_() {
      return this.class_;
   }

   public boolean break_() {
      return this.break_;
   }

   public List<? extends an_3> break_(gy_3 var1) throws CommandSyntaxException {
      this.throws_(var1);
      if (!this.break_) {
         return this.protected_(var1);
      } else if (this.finally_ != null) {
         rhN_2 var8 = var1.super_().x().class_(this.finally_);
         return (List<? extends an_3>)(var8 == null ? Collections.emptyList() : Lists.newArrayList(new rhN_2[]{var8}));
      } else if (this.extends_ != null) {
         for (rrEm_1 var9 : var1.super_().float_()) {
            an_3 var10 = var9.break_(this.extends_);
            if (var10 != null) {
               return Lists.newArrayList(new an_3[]{var10});
            }
         }

         return Collections.emptyList();
      } else {
         rjU_2 var2 = this.case_.apply(var1.volatile_());
         Predicate var3 = this.class_(var2);
         if (this.implements_) {
            return (List<? extends an_3>)(var1.package_() != null && var3.test(var1.package_())
               ? Lists.newArrayList(new an_3[]{var1.package_()})
               : Collections.emptyList());
         } else {
            ArrayList var4 = Lists.newArrayList();
            if (this.protected_()) {
               this.class_(var4, var1.final_(), var2, var3);
            } else {
               for (rrEm_1 var6 : var1.super_().float_()) {
                  this.class_(var4, var6, var2, var3);
               }
            }

            return this.class_(var2, var4);
         }
      }
   }

   private void throws_(gy_3 var1) throws CommandSyntaxException {
      if (this.volatile_ && !var1.class_(2)) {
         throw RZ.case_.create();
      }
   }

   public List<rhN_2> protected_(gy_3 var1) throws CommandSyntaxException {
      this.throws_(var1);
      if (this.finally_ != null) {
         rhN_2 var8 = var1.super_().x().class_(this.finally_);
         return (List<rhN_2>)(var8 == null ? Collections.emptyList() : Lists.newArrayList(new rhN_2[]{var8}));
      } else if (this.extends_ != null) {
         rhN_2 var7 = var1.super_().x().class_(this.extends_);
         return (List<rhN_2>)(var7 == null ? Collections.emptyList() : Lists.newArrayList(new rhN_2[]{var7}));
      } else {
         rjU_2 var2 = this.case_.apply(var1.volatile_());
         Predicate var3 = this.class_(var2);
         if (this.implements_) {
            if (var1.package_() instanceof rhN_2) {
               rhN_2 var9 = (rhN_2)var1.package_();
               if (var3.test(var9)) {
                  return Lists.newArrayList(new rhN_2[]{var9});
               }
            }

            return Collections.emptyList();
         } else {
            Object var4;
            if (this.protected_()) {
               var4 = var1.final_().class_(var3::test);
            } else {
               var4 = Lists.newArrayList();

               for (rhN_2 var6 : var1.super_().x().super_()) {
                  if (var3.test(var6)) {
                     var4.add(var6);
                  }
               }
            }

            return this.class_(var2, (List<rhN_2>)var4);
         }
      }
   }

   public boolean protected_() {
      return this.byte_;
   }
}
