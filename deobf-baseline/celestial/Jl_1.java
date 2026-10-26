package celestial;

import java.util.Arrays;

final class Jl_1 {
   private static final rpr_3[] id_throws = rpr_3.values();
   private static final int id_case = ryH_2.values().length;
   protected final boolean id_class;
   final boolean id_catch;
   final int id_private;
   final rjC_2[] id_implements;
   protected final rjC_2 id_break;
   protected final boolean id_byte;
   private final boolean[] id_finally;
   protected final boolean id_protected;

   Jl_1(xc_3 var1) {
      xd_3 var2 = var1.id_break();
      this.id_class = var1.id_implements(rRx_1.INSTANCE, rfH_2.id_protected);
      this.id_catch = var2.a_(var1, rRx_1.INSTANCE, rfH_2.id_protected);
      this.id_private = var2.id_protected(var1, rRx_1.INSTANCE, rfH_2.id_protected);
      if (!var1.id_native()) {
         this.id_implements = null;
      } else {
         this.id_implements = new rjC_2[id_throws.length];
         rjC_2 var3 = var2.id_class(var1, rRx_1.INSTANCE, rfH_2.id_protected);

         for (rpr_3 var7 : id_throws) {
            this.id_implements[var7.ordinal()] = rjw_3.id_class(var3, var7);
         }
      }

      this.id_break = var2.id_break(var1, rRx_1.INSTANCE, rfH_2.id_protected, rjm_3.id_break());
      this.id_byte = Arrays.stream(rpB_2.values()).anyMatch(var1x -> this.id_break.id_break(var1x) < 0.0 || this.id_break.id_byte(var1x) > 1.0);
      this.id_finally = new boolean[id_throws.length * id_case];

      for (rpr_3 var14 : id_throws) {
         for (ryH_2 var10 : ryH_2.values()) {
            this.id_finally[id_break(var14, var10)] = var10.id_class(var1, rRx_1.INSTANCE, rfH_2.id_protected, var14);
         }
      }

      this.id_protected = xd_3.id_class(var1.id_extends(rRx_1.INSTANCE, rfH_2.id_protected));
   }

   public boolean id_class(rpr_3 var1, ryH_2 var2) {
      return this.id_finally[id_break(var1, var2)];
   }

   private static int id_break(rpr_3 var0, ryH_2 var1) {
      return var0.ordinal() * id_case + var1.ordinal();
   }
}
