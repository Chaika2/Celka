package celestial;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class rJJ extends rJr_1 {
   private final rXu_1 class_ = new rXd_1();
   final rXu_1 break_ = new rJx_1(this, 2);
   private final rpq_3 byte_;

   public rJJ(int var1, rhz_3 var2) {
      this(var1, var2, rpq_3.class_);
   }

   public rJJ(int var1, rhz_3 var2, rpq_3 var3) {
      super(rJP.package_, var1);
      this.byte_ = var3;
      this.break_(new rJd_1(this, this.break_, 0, 49, 19));
      this.break_(new rJk_1(this, this.break_, 1, 49, 40));
      this.break_(new rJW(this, this.class_, 2, 129, 34, var3));

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < 9; var5++) {
            this.break_(new rJY(var2, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 9; var6++) {
         this.break_(new rJY(var2, var6, 8 + var6 * 18, 142));
      }
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.break_;
      rJY var4 = this.throws_.get(var2);
      if (var4 != null && var4.break_()) {
         rdn_3 var5 = var4.class_();
         var3 = var5.implements_();
         rdn_3 var6 = this.break_.extends_(0);
         rdn_3 var7 = this.break_.extends_(1);
         if (var2 == 2) {
            if (!this.class_(var5, 3, 39, true)) {
               return rdn_3.break_;
            }

            var4.class_(var5, var3);
         } else if (var2 != 0 && var2 != 1) {
            if (!var6.class_() && !var7.class_()) {
               if (var2 >= 3 && var2 < 30) {
                  if (!this.class_(var5, 30, 39, false)) {
                     return rdn_3.break_;
                  }
               } else if (var2 >= 30 && var2 < 39 && !this.class_(var5, 3, 30, false)) {
                  return rdn_3.break_;
               }
            } else if (!this.class_(var5, 0, 2, false)) {
               return rdn_3.break_;
            }
         } else if (!this.class_(var5, 3, 39, false)) {
            return rdn_3.break_;
         }

         if (var5.class_()) {
            var4.break_(rdn_3.break_);
         } else {
            var4.byte_();
         }

         if (var5.char_() == var3.char_()) {
            return rdn_3.break_;
         }

         var4.class_(var1, var5);
      }

      return var3;
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return class_(this.byte_, var1, xu_3.XS);
   }

   private void class_() {
      rdn_3 var1 = this.break_.extends_(0);
      rdn_3 var2 = this.break_.extends_(1);
      boolean var3 = !var1.class_() || !var2.class_();
      boolean var4 = !var1.class_() && !var2.class_();
      if (!var3) {
         this.class_.break_(0, rdn_3.break_);
      } else {
         boolean var5 = !var1.class_() && var1.break_() != rdy_3.dm && !var1.public_() || !var2.class_() && var2.break_() != rdy_3.dm && !var2.public_();
         if (var1.char_() > 1 || var2.char_() > 1 || !var4 && var5) {
            this.class_.break_(0, rdn_3.break_);
            this.native_();
            return;
         }

         byte var6 = 1;
         int var7;
         rdn_3 var8;
         if (var4) {
            if (var1.break_() != var2.break_()) {
               this.class_.break_(0, rdn_3.break_);
               this.native_();
               return;
            }

            rdb_3 var9 = var1.break_();
            int var10 = var9.finally_() - var1.catch_();
            int var11 = var9.finally_() - var2.catch_();
            int var12 = var10 + var11 + var9.finally_() * 5 / 100;
            var7 = Math.max(var9.finally_() - var12, 0);
            var8 = this.break_(var1, var2);
            if (!var8.throws_()) {
               if (!rdn_3.break_(var1, var2)) {
                  this.class_.break_(0, rdn_3.break_);
                  this.native_();
                  return;
               }

               var6 = 2;
            }
         } else {
            boolean var13 = !var1.class_();
            var7 = var13 ? var1.catch_() : var2.catch_();
            var8 = var13 ? var1 : var2;
         }

         this.class_.break_(0, this.class_(var8, var7, var6));
      }

      this.native_();
   }

   private rdn_3 class_(rdn_3 var1, int var2, int var3) {
      rdn_3 var4 = var1.implements_();
      var4.byte_("Enchantments");
      var4.byte_("StoredEnchantments");
      if (var2 > 0) {
         var4.break_(var2);
      } else {
         var4.byte_("Damage");
      }

      var4.throws_(var3);
      Map var5 = eA_2.class_(var1).entrySet().stream().filter(var0 -> var0.getKey().byte_()).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
      eA_2.class_(var5, var4);
      var4.byte_(0);
      if (var4.break_() == rdy_3.dm && var5.size() == 0) {
         var4 = new rdn_3(rdy_3.XM);
         if (var1.this_()) {
            var4.class_(var1.continue_());
         }
      }

      for (int var6 = 0; var6 < var5.size(); var6++) {
         var4.byte_(rJf_1.protected_(var4.instanceof_()));
      }

      return var4;
   }

   @Override
   public void class_(rXu_1 var1) {
      super.class_(var1);
      if (var1 == this.break_) {
         this.class_();
      }
   }

   @Override
   public void break_(rhd_3 var1) {
      super.break_(var1);
      this.byte_.class_((var2, var3) -> this.class_(var1, var2, this.break_));
   }

   private rdn_3 break_(rdn_3 var1, rdn_3 var2) {
      rdn_3 var3 = var1.implements_();
      Map var4 = eA_2.class_(var2);

      for (Entry var6 : var4.entrySet()) {
         ev_3 var7 = (ev_3)var6.getKey();
         if (!var7.byte_() || eA_2.class_(var7, var3) == 0) {
            var3.class_(var7, (Integer)var6.getValue());
         }
      }

      return var3;
   }
}
