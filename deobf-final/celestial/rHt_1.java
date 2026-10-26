package celestial;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class rHt_1 extends rHK implements rHI, rHf_1 {
   private rqs_3<rdn_3> case_ = rqs_3.class_(5, rdn_3.break_);
   private int catch_ = -1;
   private long private_;

   public static List<rsE_2> byte_(rHI var0) {
      return var0.byte_()
         .protected_()
         .stream()
         .flatMap(
            var1 -> var0.while_().class_(rsE_2.class, var1.protected_(var0.try_() - 0.5, var0.instanceof_() - 0.5, var0.throw_() - 0.5), rpJ_2.class_).stream()
         )
         .collect(Collectors.toList());
   }

   private static boolean byte_(rXu_1 var0, rpr_3 var1) {
      return class_(var0, var1).allMatch(var1x -> var0.extends_(var1x).class_());
   }

   public rHt_1() {
      super(ryW_2.new_);
   }

   public static rdn_3 class_(rXu_1 var0, rXu_1 var1, rdn_3 var2, rpr_3 var3) {
      if (var1 instanceof rXF && var3 != null) {
         rXF var7 = (rXF)var1;
         int[] var8 = var7.class_(var3);

         for (int var6 = 0; var6 < var8.length && !var2.class_(); var6++) {
            var2 = class_(var0, var1, var2, var8[var6], var3);
         }
      } else {
         int var4 = var1.else_();

         for (int var5 = 0; var5 < var4 && !var2.class_(); var5++) {
            var2 = class_(var0, var1, var2, var5, var3);
         }
      }

      return var2;
   }

   private static rdn_3 class_(rXu_1 var0, rXu_1 var1, rdn_3 var2, int var3, rpr_3 var4) {
      rdn_3 var5 = var1.extends_(var3);
      if (class_(var1, var2, var3, var4)) {
         boolean var6 = false;
         boolean var7 = var1.return_();
         if (var5.class_()) {
            var1.break_(var3, var2);
            var2 = rdn_3.break_;
            var6 = true;
         } else if (class_(var5, var2)) {
            int var8 = var2.byte_() - var5.char_();
            int var9 = Math.min(var2.char_(), var8);
            var2.catch_(var9);
            var5.case_(var9);
            var6 = var9 > 0;
         }

         if (var6) {
            if (var7 && var1 instanceof rHt_1 var11 && !var11.native_()) {
               byte var12 = 0;
               if (var0 instanceof rHt_1 var10 && var11.private_ >= var10.private_) {
                  var12 = 1;
               }

               var11.class_(8 - var12);
            }

            var1.break_();
         }
      }

      return var2;
   }

   private static boolean class_(rXu_1 var0, rdn_3 var1, int var2, rpr_3 var3) {
      return !var0.a_(var2, var1) ? false : !(var0 instanceof rXF) || ((rXF)var0).class_(var2, var1, var3);
   }

   private static boolean class_(rHI var0, rXu_1 var1, int var2, rpr_3 var3) {
      rdn_3 var4 = var1.extends_(var2);
      if (!var4.class_() && break_(var1, var4, var2, var3)) {
         rdn_3 var5 = var4.implements_();
         rdn_3 var6 = class_(var1, var0, var1.class_(var2, 1), (rpr_3)null);
         if (var6.class_()) {
            var1.break_();
            return true;
         }

         var1.break_(var2, var5);
      }

      return false;
   }

   public static boolean class_(rXu_1 var0, rsE_2 var1) {
      boolean var2 = false;
      rdn_3 var3 = var1.protected_().implements_();
      rdn_3 var4 = class_((rXu_1)null, var0, var3, (rpr_3)null);
      if (var4.class_()) {
         var2 = true;
         var1.PD();
      } else {
         var1.break_(var4);
      }

      return var2;
   }

   @Override
   protected rJr_1 class_(int var1, rhz_3 var2) {
      return new rJz_1(var1, var2, this);
   }

   public void class_(an_3 var1) {
      if (var1 instanceof rsE_2) {
         rfH_2 var2 = this.char_();
         if (rjw_3.byte_(rjw_3.class_(var1.rN().protected_((double)(-var2.b_()), (double)(-var2.c_()), (double)(-var2.d_()))), this.byte_(), rjN_2.implements_)
            )
          {
            this.class_(() -> class_(this, (rsE_2)var1));
         }
      }
   }

   @Override
   protected void class_(rqs_3<rdn_3> var1) {
      this.case_ = var1;
   }

   private void class_(int var1) {
      this.catch_ = var1;
   }

   private static boolean class_(rdn_3 var0, rdn_3 var1) {
      if (var0.break_() != var1.break_()) {
         return false;
      } else if (var0.catch_() != var1.catch_()) {
         return false;
      } else {
         return var0.char_() > var0.byte_() ? false : rdn_3.class_(var0, var1);
      }
   }

   public static rXu_1 class_(rYB var0, double var1, double var3, double var5) {
      Object var7 = null;
      rfH_2 var8 = new rfH_2(var1, var3, var5);
      xc_3 var9 = var0.byte_(var8);
      xd_3 var10 = var9.break_();
      if (var10 instanceof rXL) {
         var7 = ((rXL)var10).class_(var9, var0, var8);
      } else if (var10.protected_()) {
         ryO_2 var11 = var0.class_(var8);
         if (var11 instanceof rXu_1) {
            var7 = (rXu_1)var11;
            if (var7 instanceof rHu_1 && var10 instanceof xt_3) {
               var7 = xt_3.class_((xt_3)var10, var9, var0, var8, true);
            }
         }
      }

      if (var7 == null) {
         List var12 = var0.break_((an_3)null, new rfl_3(var1 - 0.5, var3 - 0.5, var5 - 0.5, var1 + 0.5, var3 + 0.5, var5 + 0.5), rpJ_2.protected_);
         if (!var12.isEmpty()) {
            var7 = (rXu_1)var12.get(var0.int_.nextInt(var12.size()));
         }
      }

      return (rXu_1)var7;
   }

   public static rXu_1 class_(rYB var0, rfH_2 var1) {
      return class_(var0, (double)var1.b_() + 0.5, (double)var1.c_() + 0.5, (double)var1.d_() + 0.5);
   }

   private boolean class_(Supplier<Boolean> var1) {
      if (this.extends_ != null && !this.extends_.continue_) {
         if (!this.extends_() && this.abstract_().byte_(kS_2.final_)) {
            boolean var2 = false;
            if (!this.return_()) {
               var2 = this.private_();
            }

            if (!this.catch_()) {
               var2 |= var1.get();
            }

            if (var2) {
               this.class_(8);
               this.break_();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public rdn_3 class_(int var1, int var2) {
      this.protected_((rhd_3)null);
      return rXC.class_(this.ad_(), var1, var2);
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      if (!this.byte_(var1)) {
         rXC.class_(var1, this.case_);
      }

      var1.break_("TransferCooldown", this.catch_);
      return var1;
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      this.case_ = rqs_3.class_(this.else_(), rdn_3.break_);
      if (!this.break_(var2)) {
         rXC.break_(var2, this.case_);
      }

      this.catch_ = var2.private_("TransferCooldown");
   }

   private static IntStream class_(rXu_1 var0, rpr_3 var1) {
      return var0 instanceof rXF ? IntStream.of(((rXF)var0).class_(var1)) : IntStream.range(0, var0.else_());
   }

   public static boolean class_(rHI var0) {
      rXu_1 var1 = break_(var0);
      if (var1 != null) {
         rpr_3 var4 = rpr_3.DOWN;
         return byte_(var1, var4) ? false : class_(var1, var4).anyMatch(var3x -> class_(var0, var1, var3x, var4));
      } else {
         for (rsE_2 var3 : byte_(var0)) {
            if (class_(var0, var3)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean break_(rXu_1 var1, rpr_3 var2) {
      return class_(var1, var2).allMatch(var1x -> {
         rdn_3 var2x = var1.extends_(var1x);
         return var2x.char_() >= var2x.byte_();
      });
   }

   public static rXu_1 break_(rHI var0) {
      return class_(var0.while_(), var0.try_(), var0.instanceof_() + 1.0, var0.throw_());
   }

   private static boolean break_(rXu_1 var0, rdn_3 var1, int var2, rpr_3 var3) {
      return !(var0 instanceof rXF) || ((rXF)var0).break_(var2, var1, var3);
   }

   @Override
   public void break_(int var1, rdn_3 var2) {
      this.protected_((rhd_3)null);
      this.ad_().set(var1, var2);
      if (var2.char_() > this.ab_()) {
         var2.throws_(this.ab_());
      }
   }

   @Override
   public void throws_() {
      if (this.extends_ != null && !this.extends_.continue_) {
         this.catch_--;
         this.private_ = this.extends_.r();
         if (!this.extends_()) {
            this.class_(0);
            this.class_(() -> class_(this));
         }
      }
   }

   private rXu_1 finally_() {
      rpr_3 var1 = this.abstract_().byte_(kS_2.volatile_);
      return class_(this.while_(), this.native_.break_(var1));
   }

   private boolean catch_() {
      for (rdn_3 var2 : this.case_) {
         if (var2.class_() || var2.char_() != var2.byte_()) {
            return false;
         }
      }

      return true;
   }

   private boolean extends_() {
      return this.catch_ > 0;
   }

   @Override
   public int else_() {
      return this.case_.size();
   }

   @Override
   public double instanceof_() {
      return (double)this.native_.c_() + 0.5;
   }

   @Override
   public double throw_() {
      return (double)this.native_.d_() + 0.5;
   }

   @Override
   public double try_() {
      return (double)this.native_.b_() + 0.5;
   }

   private boolean private_() {
      rXu_1 var1 = this.finally_();
      if (var1 == null) {
         return false;
      } else {
         rpr_3 var2 = this.abstract_().byte_(kS_2.volatile_).case_();
         if (this.break_(var1, var2)) {
            return false;
         } else {
            for (int var3 = 0; var3 < this.else_(); var3++) {
               if (!this.extends_(var3).class_()) {
                  rdn_3 var4 = this.extends_(var3).implements_();
                  rdn_3 var5 = class_(this, var1, this.class_(var3, 1), var2);
                  if (var5.class_()) {
                     var1.break_();
                     return true;
                  }

                  this.break_(var3, var4);
               }
            }

            return false;
         }
      }
   }

   private boolean native_() {
      return this.catch_ > 8;
   }

   @Override
   protected rqs_3<rdn_3> ad_() {
      return this.case_;
   }

   @Override
   protected rgP_2 X_() {
      return new rgn_3("container.hopper");
   }
}
