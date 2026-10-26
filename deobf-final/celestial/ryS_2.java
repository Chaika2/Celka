package celestial;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

public class ryS_2 extends ryO_2 {
   private final rgP_2[] class_ = new rgP_2[]{rgN_2.byte_, rgN_2.byte_, rgN_2.byte_, rgN_2.byte_};
   private boolean break_ = true;
   private rhd_3 byte_;
   private final rpl_3[] protected_ = new rpl_3[4];
   private rxL_2 throws_ = rxL_2.BLACK;

   public ryS_2() {
      super(ryW_2.private_);
   }

   public void class_(boolean var1) {
      this.break_ = var1;
      if (!var1) {
         this.byte_ = null;
      }
   }

   public boolean class_(rxL_2 var1) {
      if (var1 != this.private_()) {
         this.throws_ = var1;
         this.break_();
         this.extends_.class_(this.char_(), this.abstract_(), this.abstract_(), 3);
         return true;
      } else {
         return false;
      }
   }

   public rpl_3 class_(int var1, Function<rgP_2, rpl_3> var2) {
      if (this.protected_[var1] == null && this.class_[var1] != null) {
         this.protected_[var1] = (rpl_3)var2.apply(this.class_[var1]);
      }

      return this.protected_[var1];
   }

   public void class_(rhd_3 var1) {
      this.byte_ = var1;
   }

   public gy_3 class_(rhN_2 var1) {
      String var2 = var1 == null ? "Sign" : var1.g().getString();
      Object var3 = var1 == null ? new rgN_2("Sign") : var1.L_();
      return new gy_3(gV_2.byte_, rjU_2.class_((rja_3)this.native_), rjK_2.class_, (rrEm_1)this.extends_, 2, var2, (rgP_2)var3, this.extends_.const_(), var1);
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);

      for (int var2 = 0; var2 < 4; var2++) {
         String var3 = rgB_2.class_(this.class_[var2]);
         var1.class_("Text" + (var2 + 1), var3);
      }

      var1.class_("Color", this.throws_.byte_());
      return var1;
   }

   public rgP_2 class_(int var1) {
      return this.class_[var1];
   }

   public void class_(int var1, rgP_2 var2) {
      this.class_[var1] = var2;
      this.protected_[var1] = null;
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      this.break_ = false;
      super.class_(var1, var2);
      this.throws_ = rxL_2.class_(var2.native_("Color"), rxL_2.BLACK);

      for (int var3 = 0; var3 < 4; var3++) {
         String var4 = var2.native_("Text" + (var3 + 1));
         rVi_1 var5 = rgB_2.class_(var4.isEmpty() ? "\"\"" : var4);
         if (this.extends_ instanceof rrEm_1) {
            try {
               this.class_[var3] = rgv_3.class_(this.class_((rhN_2)null), var5, (an_3)null, 0);
            } catch (CommandSyntaxException var7) {
               this.class_[var3] = var5;
            }
         } else {
            this.class_[var3] = var5;
         }

         this.protected_[var3] = null;
      }
   }

   public boolean break_(rhd_3 var1) {
      for (rgP_2 var5 : this.class_) {
         rgc_3 var6 = var5 == null ? null : var5.class_();
         if (var6 != null && var6.private_() != null) {
            rgl_3 var7 = var6.private_();
            if (var7.class_() == rgH_2.RUN_COMMAND) {
               var1.rC().f().class_(this.class_((rhN_2)var1), var7.break_());
            }
         }
      }

      return true;
   }

   public boolean throws_() {
      return this.break_;
   }

   public rhd_3 catch_() {
      return this.byte_;
   }

   public rxL_2 private_() {
      return this.throws_;
   }

   @Override
   public boolean ac_() {
      return true;
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.native_, 9, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.class_(new rcd_3());
   }
}
