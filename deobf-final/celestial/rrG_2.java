package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrG_2 extends rPm_1<rbZ_2> {
   private final aI_2<? extends rbZ_2> class_;
   private final float byte_;
   private long protected_;

   protected void byte_(rrEm_1 var1, rbZ_2 var2, long var3) {
      rbZ_2 var5 = this.class_(var2);
      iA_2.class_(var2, var5, this.byte_);
      if (var2.class_(var5, 3.0) && var3 >= this.protected_) {
         var2.class_(var1, var5);
         var2.SF().break_(il_3.continue_);
         var5.SF().break_(il_3.continue_);
      }
   }

   private Optional<? extends rbZ_2> byte_(rbZ_2 var1) {
      return var1.SF().byte_(il_3.private_).get().stream().filter(var1x -> var1x.BC() == this.class_).map(var0 -> (rbZ_2)var0).filter(var1::class_).findFirst();
   }

   public rrG_2(aI_2<? extends rbZ_2> var1, float var2) {
      super(
         ImmutableMap.of(il_3.private_, iC_2.VALUE_PRESENT, il_3.continue_, iC_2.VALUE_ABSENT, il_3.volatile_, iC_2.REGISTERED, il_3.final_, iC_2.REGISTERED),
         325
      );
      this.class_ = var1;
      this.byte_ = var2;
   }

   protected void class_(rrEm_1 var1, rbZ_2 var2, long var3) {
      rbZ_2 var5 = this.byte_(var2).get();
      var2.SF().class_(il_3.continue_, var5);
      var5.SF().class_(il_3.continue_, var2);
      iA_2.class_(var2, var5, this.byte_);
      int var6 = 275 + var2.Sa().nextInt(50);
      this.protected_ = var3 + (long)var6;
   }

   protected boolean class_(rrEm_1 var1, rbZ_2 var2) {
      return var2.sQ() && this.byte_(var2).isPresent();
   }

   private rbZ_2 class_(rbZ_2 var1) {
      return (rbZ_2)var1.SF().byte_(il_3.continue_).get();
   }

   private boolean break_(rbZ_2 var1) {
      iZ_2 var2 = var1.SF();
      return var2.class_(il_3.continue_) && var2.byte_(il_3.continue_).get().BC() == this.class_;
   }

   protected boolean break_(rrEm_1 var1, rbZ_2 var2, long var3) {
      if (!this.break_(var2)) {
         return false;
      } else {
         rbZ_2 var5 = this.class_(var2);
         return var5.BM() && var2.class_(var5) && iA_2.class_(var2.SF(), var5) && var3 <= this.protected_;
      }
   }

   protected void protected_(rrEm_1 var1, rbZ_2 var2, long var3) {
      var2.SF().break_(il_3.continue_);
      var2.SF().break_(il_3.volatile_);
      var2.SF().break_(il_3.final_);
      this.protected_ = 0L;
   }
}
