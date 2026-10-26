package celestial;

import java.util.function.Predicate;

public class rjB_2 {
   private final rjU_2 id_class;
   private final rjU_2 id_break;
   private final rjS_2 id_byte;
   private final rjs_3 id_protected;
   private final rjm_3 id_throws;
   private Predicate<xc_3> id_case = var0 -> true;

   public rjS_2 id_byte() {
      return this.id_byte;
   }

   public rjB_2(rjU_2 var1, rjU_2 var2, rjS_2 var3, rjs_3 var4, an_3 var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = rjm_3.id_class(var5);
   }

   public rjC_2 id_class(rXE var1, rRq_1 var2, rfH_2 var3) {
      return this.id_protected.id_class(var1) ? var1.id_protected(var2, var3) : rjw_3.id_class();
   }

   public void id_class(Predicate<xc_3> var1) {
      this.id_case = var1;
   }

   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return this.id_case != null && !this.id_case.test(var1) ? rjw_3.id_class() : this.id_byte.get(var1, var2, var3, this.id_throws);
   }

   public rjU_2 id_class() {
      return this.id_break;
   }

   public rjU_2 id_break() {
      return this.id_class;
   }
}
