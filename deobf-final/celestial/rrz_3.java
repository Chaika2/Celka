package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrz_3 extends rPm_1<rsq_3> {
   private long class_;

   protected void byte_(rrEm_1 var1, rsq_3 var2, long var3) {
      rsq_3 var5 = (rsq_3)var2.SF().byte_(il_3.continue_).get();
      if (!(var2.int_(var5) > 5.0)) {
         iA_2.class_(var2, var5, 0.5F);
         if (var3 >= this.class_) {
            var2.sm();
            var5.sm();
            this.class_(var1, var2, var5);
         } else if (var2.Sa().nextInt(35) == 0) {
            var1.class_(var5, (byte)12);
            var1.class_(var2, (byte)12);
         }
      }
   }

   public rrz_3() {
      super(ImmutableMap.of(il_3.continue_, iC_2.VALUE_PRESENT, il_3.private_, iC_2.VALUE_PRESENT), 350, 350);
   }

   private boolean class_(rsq_3 var1, rfH_2 var2) {
      rLC var3 = var1.public_().class_(var2, rRP.continue_.byte_());
      return var3 != null && var3.finally_();
   }

   private void class_(rrEm_1 var1, rsq_3 var2, rfH_2 var3) {
      rfK_2 var4 = rfK_2.class_(var1.E(), var3);
      var2.SF().class_(il_3.break_, var4);
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2, long var3) {
      return var3 <= this.class_ && this.class_(var2);
   }

   private void class_(rrEm_1 var1, rsq_3 var2, rsq_3 var3) {
      Optional var4 = this.break_(var1, var2);
      if (!var4.isPresent()) {
         var1.class_(var3, (byte)13);
         var1.class_(var2, (byte)13);
      } else {
         Optional var5 = this.break_(var1, var2, var3);
         if (var5.isPresent()) {
            this.class_(var1, (rsq_3)var5.get(), (rfH_2)var4.get());
         } else {
            var1.d().break_((rfH_2)var4.get());
            ruP_2.byte_(var1, (rfH_2)var4.get());
         }
      }
   }

   private boolean class_(rsq_3 var1) {
      iZ_2 var2 = var1.SF();
      Optional var3 = var2.byte_(il_3.continue_).filter(var0 -> var0.BC() == aI_2.D);
      return !var3.isPresent() ? false : iA_2.class_(var2, il_3.continue_, aI_2.D) && var1.N_() && ((au_3)var3.get()).N_();
   }

   protected boolean class_(rrEm_1 var1, rsq_3 var2) {
      return this.class_(var2);
   }

   private Optional<rfH_2> break_(rrEm_1 var1, rsq_3 var2) {
      return var1.d().class_(rRP.continue_.break_(), var2x -> this.class_(var2, var2x), var2.Bs(), 48);
   }

   private Optional<rsq_3> break_(rrEm_1 var1, rsq_3 var2, rsq_3 var3) {
      rsq_3 var4 = var2.break_(var1, var3);
      if (var4 == null) {
         return Optional.empty();
      } else {
         var2.e_(6000);
         var3.e_(6000);
         var4.e_(-24000);
         var4.class_(var2.rx(), var2.re(), var2.BO(), 0.0F, 0.0F);
         var1.class_(var4);
         var1.class_(var4, (byte)12);
         return Optional.of(var4);
      }
   }

   protected void break_(rrEm_1 var1, rsq_3 var2, long var3) {
      au_3 var5 = var2.SF().byte_(il_3.continue_).get();
      iA_2.class_(var2, var5, 0.5F);
      var1.class_(var5, (byte)18);
      var1.class_(var2, (byte)18);
      int var6 = 275 + var2.Sa().nextInt(50);
      this.class_ = var3 + (long)var6;
   }

   protected void protected_(rrEm_1 var1, rsq_3 var2, long var3) {
      var2.SF().break_(il_3.continue_);
   }
}
