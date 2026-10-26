package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrY_2 extends rPm_1<is_3> {
   private final float class_;
   private rfH_2 byte_;
   private int protected_;
   private int throws_;
   private int case_;

   private boolean byte_(rrEm_1 var1, is_3 var2) {
      rfH_2 var3 = var2.Bs();
      rfH_2 var4 = var3.break_();
      return this.class_(var1, var3) || this.class_(var1, var4);
   }

   protected boolean byte_(rrEm_1 var1, is_3 var2, long var3) {
      return var2.n_() && this.byte_ != null && this.class_(var1, this.byte_) && !this.throws_(var1, var2) && !this.case_(var1, var2);
   }

   public rrY_2(float var1) {
      super(ImmutableMap.of(il_3.return_, iC_2.VALUE_PRESENT, il_3.volatile_, iC_2.VALUE_ABSENT));
      this.class_ = var1;
   }

   private boolean class_(rrEm_1 var1, rfH_2 var2) {
      return var1.byte_(var2).class_(rls_3.short_);
   }

   private Optional<rfH_2> class_(is_3 var1) {
      return var1.SF().byte_(il_3.return_);
   }

   protected void class_(rrEm_1 var1, is_3 var2, long var3) {
      super.protected_(var1, var2, var3);
      this.class_(var2).ifPresent(var3x -> {
         this.byte_ = var3x;
         this.protected_ = 100;
         this.throws_ = 3 + var1.int_.nextInt(4);
         this.case_ = 0;
         this.class_(var2, var3x);
      });
   }

   @Override
   protected boolean class_(long var1) {
      return false;
   }

   protected boolean class_(rrEm_1 var1, is_3 var2) {
      return var2.n_() && this.break_(var1, var2);
   }

   private void class_(is_3 var1, rfH_2 var2) {
      var1.SF().class_(il_3.volatile_, new iH_2(var2, this.class_, 0));
   }

   protected void break_(rrEm_1 var1, is_3 var2, long var3) {
      super.break_(var1, var2, var3);
      this.byte_ = null;
      this.protected_ = 0;
      this.throws_ = 0;
      this.case_ = 0;
   }

   private boolean break_(rrEm_1 var1, is_3 var2) {
      return this.byte_(var1, var2) || this.class_(var2).isPresent();
   }

   private boolean throws_(rrEm_1 var1, is_3 var2) {
      return !this.byte_(var1, var2) && this.protected_ <= 0;
   }

   private boolean case_(rrEm_1 var1, is_3 var2) {
      return this.byte_(var1, var2) && this.throws_ <= 0;
   }

   protected void protected_(rrEm_1 var1, is_3 var2, long var3) {
      if (!this.byte_(var1, var2)) {
         this.protected_--;
      } else if (this.case_ > 0) {
         this.case_--;
      } else if (this.protected_(var1, var2)) {
         var2.else_().class_();
         this.throws_--;
         this.case_ = 5;
      }
   }

   private boolean protected_(rrEm_1 var1, is_3 var2) {
      return this.class_(var1, var2.Bs());
   }
}
