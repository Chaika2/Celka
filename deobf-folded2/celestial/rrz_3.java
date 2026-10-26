package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrz_3 extends rPm_1<rsq_3> {
   private long id_class;

   protected void id_byte(rrEm_1 var1, rsq_3 var2, long var3) {
      rsq_3 var5 = (rsq_3)var2.SF().id_byte(il_3.id_continue).get();
      if (!(var2.id_int(var5) > 5.0)) {
         iA_2.id_class(var2, var5, 0.5F);
         if (var3 >= this.id_class) {
            var2.sm();
            var5.sm();
            this.id_class(var1, var2, var5);
         } else if (var2.Sa().nextInt(35) == 0) {
            var1.id_class(var5, (byte)12);
            var1.id_class(var2, (byte)12);
         }
      }
   }

   public rrz_3() {
      super(ImmutableMap.of(il_3.id_continue, iC_2.VALUE_PRESENT, il_3.id_private, iC_2.VALUE_PRESENT), 350, 350);
   }

   private boolean id_class(rsq_3 var1, rfH_2 var2) {
      rLC var3 = var1.id_public().id_class(var2, rRP.id_continue.id_byte());
      return var3 != null && var3.id_finally();
   }

   private void id_class(rrEm_1 var1, rsq_3 var2, rfH_2 var3) {
      rfK_2 var4 = rfK_2.id_class(var1.E(), var3);
      var2.SF().id_class(il_3.id_break, var4);
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      return var3 <= this.id_class && this.id_class(var2);
   }

   private void id_class(rrEm_1 var1, rsq_3 var2, rsq_3 var3) {
      Optional var4 = this.id_break(var1, var2);
      if (!var4.isPresent()) {
         var1.id_class(var3, (byte)13);
         var1.id_class(var2, (byte)13);
      } else {
         Optional var5 = this.id_break(var1, var2, var3);
         if (var5.isPresent()) {
            this.id_class(var1, (rsq_3)var5.get(), (rfH_2)var4.get());
         } else {
            var1.d().id_break((rfH_2)var4.get());
            ruP_2.id_byte(var1, (rfH_2)var4.get());
         }
      }
   }

   private boolean id_class(rsq_3 var1) {
      iZ_2 var2 = var1.SF();
      Optional var3 = var2.id_byte(il_3.id_continue).filter(var0 -> var0.BC() == aI_2.D);
      return !var3.isPresent() ? false : iA_2.id_class(var2, il_3.id_continue, aI_2.D) && var1.N_() && ((au_3)var3.get()).N_();
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2) {
      return this.id_class(var2);
   }

   private Optional<rfH_2> id_break(rrEm_1 var1, rsq_3 var2) {
      return var1.d().id_class(rRP.id_continue.id_break(), var2x -> this.id_class(var2, var2x), var2.Bs(), 48);
   }

   private Optional<rsq_3> id_break(rrEm_1 var1, rsq_3 var2, rsq_3 var3) {
      rsq_3 var4 = var2.id_break(var1, var3);
      if (var4 == null) {
         return Optional.empty();
      } else {
         var2.e_(6000);
         var3.e_(6000);
         var4.e_(-24000);
         var4.id_class(var2.rx(), var2.re(), var2.BO(), 0.0F, 0.0F);
         var1.id_class(var4);
         var1.id_class(var4, (byte)12);
         return Optional.of(var4);
      }
   }

   protected void id_break(rrEm_1 var1, rsq_3 var2, long var3) {
      au_3 var5 = var2.SF().id_byte(il_3.id_continue).get();
      iA_2.id_class(var2, var5, 0.5F);
      var1.id_class(var5, (byte)18);
      var1.id_class(var2, (byte)18);
      int var6 = 275 + var2.Sa().nextInt(50);
      this.id_class = var3 + (long)var6;
   }

   protected void id_protected(rrEm_1 var1, rsq_3 var2, long var3) {
      var2.SF().id_break(il_3.id_continue);
   }
}
