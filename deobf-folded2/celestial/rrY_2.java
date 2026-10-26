package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrY_2 extends rPm_1<is_3> {
   private final float id_class;
   private rfH_2 id_byte;
   private int id_protected;
   private int id_throws;
   private int id_case;

   private boolean id_byte(rrEm_1 var1, is_3 var2) {
      rfH_2 var3 = var2.Bs();
      rfH_2 var4 = var3.id_break();
      return this.id_class(var1, var3) || this.id_class(var1, var4);
   }

   protected boolean id_byte(rrEm_1 var1, is_3 var2, long var3) {
      return var2.n_() && this.id_byte != null && this.id_class(var1, this.id_byte) && !this.id_throws(var1, var2) && !this.id_case(var1, var2);
   }

   public rrY_2(float var1) {
      super(ImmutableMap.of(il_3.id_return, iC_2.VALUE_PRESENT, il_3.id_volatile, iC_2.VALUE_ABSENT));
      this.id_class = var1;
   }

   private boolean id_class(rrEm_1 var1, rfH_2 var2) {
      return var1.id_byte(var2).id_class(rls_3.id_short);
   }

   private Optional<rfH_2> id_class(is_3 var1) {
      return var1.SF().id_byte(il_3.id_return);
   }

   protected void id_class(rrEm_1 var1, is_3 var2, long var3) {
      super.id_protected(var1, var2, var3);
      this.id_class(var2).ifPresent(var3x -> {
         this.id_byte = var3x;
         this.id_protected = 100;
         this.id_throws = 3 + var1.id_int.nextInt(4);
         this.id_case = 0;
         this.id_class(var2, var3x);
      });
   }

   @Override
   protected boolean id_class(long var1) {
      return false;
   }

   protected boolean id_class(rrEm_1 var1, is_3 var2) {
      return var2.n_() && this.id_break(var1, var2);
   }

   private void id_class(is_3 var1, rfH_2 var2) {
      var1.SF().id_class(il_3.id_volatile, new iH_2(var2, this.id_class, 0));
   }

   protected void id_break(rrEm_1 var1, is_3 var2, long var3) {
      super.id_break(var1, var2, var3);
      this.id_byte = null;
      this.id_protected = 0;
      this.id_throws = 0;
      this.id_case = 0;
   }

   private boolean id_break(rrEm_1 var1, is_3 var2) {
      return this.id_byte(var1, var2) || this.id_class(var2).isPresent();
   }

   private boolean id_throws(rrEm_1 var1, is_3 var2) {
      return !this.id_byte(var1, var2) && this.id_protected <= 0;
   }

   private boolean id_case(rrEm_1 var1, is_3 var2) {
      return this.id_byte(var1, var2) && this.id_throws <= 0;
   }

   protected void id_protected(rrEm_1 var1, is_3 var2, long var3) {
      if (!this.id_byte(var1, var2)) {
         this.id_protected--;
      } else if (this.id_case > 0) {
         this.id_case--;
      } else if (this.id_protected(var1, var2)) {
         var2.id_else().id_class();
         this.id_throws--;
         this.id_case = 5;
      }
   }

   private boolean id_protected(rrEm_1 var1, is_3 var2) {
      return this.id_class(var1, var2.Bs());
   }
}
