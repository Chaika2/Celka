package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rPy_1 extends rPm_1<is_3> {
   private int class_;
   private rLC byte_;
   private rfH_2 protected_;
   private float throws_;

   protected void byte_(rrEm_1 var1, is_3 var2, long var3) {
      var2.SF().class_(il_3.this_, this.byte_);
      var2.public_().class_(this.byte_, (double)this.throws_);
   }

   public rPy_1() {
      this(150, 250);
   }

   public rPy_1(int var1, int var2) {
      super(ImmutableMap.of(il_3.interface_, iC_2.REGISTERED, il_3.this_, iC_2.VALUE_ABSENT, il_3.volatile_, iC_2.VALUE_PRESENT), var1, var2);
   }

   private boolean class_(is_3 var1, iH_2 var2) {
      return var2.class_().break_().implements_(var1.Bs()) <= var2.byte_();
   }

   private boolean class_(is_3 var1, iH_2 var2, long var3) {
      rfH_2 var5 = var2.class_().break_();
      this.byte_ = var1.public_().class_(var5, 0);
      this.throws_ = var2.break_();
      iZ_2 var6 = var1.SF();
      if (this.class_(var1, var2)) {
         var6.break_(il_3.interface_);
      } else {
         boolean var7 = this.byte_ != null && this.byte_.finally_();
         if (var7) {
            var6.break_(il_3.interface_);
         } else if (!var6.class_(il_3.interface_)) {
            var6.class_(il_3.interface_, var3);
         }

         if (this.byte_ != null) {
            return true;
         }

         rjU_2 var8 = iX_2.break_((aA_2)var1, 10, 7, rjU_2.protected_(var5));
         if (var8 != null) {
            this.byte_ = var1.public_().class_(var8.break_, var8.byte_, var8.protected_, 0);
            return this.byte_ != null;
         }
      }

      return false;
   }

   protected boolean class_(rrEm_1 var1, is_3 var2) {
      if (this.class_ > 0) {
         this.class_--;
         return false;
      } else {
         iZ_2 var3 = var2.SF();
         iH_2 var4 = var3.byte_(il_3.volatile_).get();
         boolean var5 = this.class_(var2, var4);
         if (!var5 && this.class_(var2, var4, var1.r())) {
            this.protected_ = var4.class_().break_();
            return true;
         } else {
            var3.break_(il_3.volatile_);
            if (var5) {
               var3.break_(il_3.interface_);
            }

            return false;
         }
      }
   }

   protected boolean class_(rrEm_1 var1, is_3 var2, long var3) {
      if (this.byte_ != null && this.protected_ != null) {
         Optional var5 = var2.SF().byte_(il_3.volatile_);
         rLy_1 var6 = var2.public_();
         return !var6.native_() && var5.isPresent() && !this.class_(var2, (iH_2)var5.get());
      } else {
         return false;
      }
   }

   protected void break_(rrEm_1 var1, is_3 var2, long var3) {
      if (var2.SF().class_(il_3.volatile_) && !this.class_(var2, var2.SF().byte_(il_3.volatile_).get()) && var2.public_().continue_()) {
         this.class_ = var1.long_().nextInt(40);
      }

      var2.public_().final_();
      var2.SF().break_(il_3.volatile_);
      var2.SF().break_(il_3.this_);
      this.byte_ = null;
   }

   protected void protected_(rrEm_1 var1, is_3 var2, long var3) {
      rLC var5 = var2.public_().finally_();
      iZ_2 var6 = var2.SF();
      if (this.byte_ != var5) {
         this.byte_ = var5;
         var6.class_(il_3.this_, var5);
      }

      if (var5 != null && this.protected_ != null) {
         iH_2 var7 = var6.byte_(il_3.volatile_).get();
         if (var7.class_().break_().private_(this.protected_) > 4.0 && this.class_(var2, var7, var1.r())) {
            this.protected_ = var7.class_().break_();
            this.byte_(var1, var2, var3);
         }
      }
   }
}
