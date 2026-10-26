package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrG_2 extends rPm_1<rbZ_2> {
   private final aI_2<? extends rbZ_2> id_class;
   private final float id_byte;
   private long id_protected;

   protected void id_byte(rrEm_1 var1, rbZ_2 var2, long var3) {
      rbZ_2 var5 = this.id_class(var2);
      iA_2.id_class(var2, var5, this.id_byte);
      if (var2.id_class(var5, 3.0) && var3 >= this.id_protected) {
         var2.id_class(var1, var5);
         var2.SF().id_break(il_3.id_continue);
         var5.SF().id_break(il_3.id_continue);
      }
   }

   private Optional<? extends rbZ_2> id_byte(rbZ_2 var1) {
      return var1.SF()
         .id_byte(il_3.id_private)
         .get()
         .stream()
         .filter(var1x -> var1x.BC() == this.id_class)
         .map(var0 -> (rbZ_2)var0)
         .filter(var1::id_class)
         .findFirst();
   }

   public rrG_2(aI_2<? extends rbZ_2> var1, float var2) {
      super(
         ImmutableMap.of(
            il_3.id_private, iC_2.VALUE_PRESENT, il_3.id_continue, iC_2.VALUE_ABSENT, il_3.id_volatile, iC_2.REGISTERED, il_3.id_final, iC_2.REGISTERED
         ),
         325
      );
      this.id_class = var1;
      this.id_byte = var2;
   }

   protected void id_class(rrEm_1 var1, rbZ_2 var2, long var3) {
      rbZ_2 var5 = this.id_byte(var2).get();
      var2.SF().id_class(il_3.id_continue, var5);
      var5.SF().id_class(il_3.id_continue, var2);
      iA_2.id_class(var2, var5, this.id_byte);
      int var6 = 275 + var2.Sa().nextInt(50);
      this.id_protected = var3 + (long)var6;
   }

   protected boolean id_class(rrEm_1 var1, rbZ_2 var2) {
      return var2.sQ() && this.id_byte(var2).isPresent();
   }

   private rbZ_2 id_class(rbZ_2 var1) {
      return (rbZ_2)var1.SF().id_byte(il_3.id_continue).get();
   }

   private boolean id_break(rbZ_2 var1) {
      iZ_2 var2 = var1.SF();
      return var2.id_class(il_3.id_continue) && var2.id_byte(il_3.id_continue).get().BC() == this.id_class;
   }

   protected boolean id_break(rrEm_1 var1, rbZ_2 var2, long var3) {
      if (!this.id_break(var2)) {
         return false;
      } else {
         rbZ_2 var5 = this.id_class(var2);
         return var5.BM() && var2.id_class(var5) && iA_2.id_class(var2.SF(), var5) && var3 <= this.id_protected;
      }
   }

   protected void id_protected(rrEm_1 var1, rbZ_2 var2, long var3) {
      var2.SF().id_break(il_3.id_continue);
      var2.SF().id_break(il_3.id_volatile);
      var2.SF().id_break(il_3.id_final);
      this.id_protected = 0L;
   }
}
