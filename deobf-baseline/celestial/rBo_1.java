package celestial;

import java.util.List;
import java.util.stream.Collectors;

public class rBo_1 extends rBU {
   public rBo_1(aA_2 var1, double var2) {
      super(var1, var2, 240, false);
   }

   private rfH_2 id_class(rjh_3 var1) {
      rrEm_1 var2 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
      rga_3 var3 = var2.d();
      List var4 = var3.id_byte(var0 -> true, var1.id_int(), 8, rRr_1.IS_OCCUPIED).map(rgU_2::id_throws).collect(Collectors.toList());
      return var4.isEmpty() ? null : (rfH_2)var4.get(var2.id_int.nextInt(var4.size()));
   }

   private boolean id_class(rsq_3 var1) {
      return var1.id_class(((rYB)this.id_class.id_throws[7]).r());
   }

   private rjU_2 id_finally() {
      return iX_2.id_break(this.id_class, 10, 7);
   }

   @Override
   protected rjU_2 id_catch() {
      float var1 = ((rYB)this.id_class.id_throws[7]).id_int.nextFloat();
      if (((rYB)this.id_class.id_throws[7]).id_int.nextFloat() < 0.3F) {
         return this.id_finally();
      } else {
         rjU_2 var2;
         if (var1 < 0.7F) {
            var2 = this.id_extends();
            if (var2 == null) {
               var2 = this.id_native();
            }
         } else {
            var2 = this.id_native();
            if (var2 == null) {
               var2 = this.id_extends();
            }
         }

         return var2 == null ? this.id_finally() : var2;
      }
   }

   private rjU_2 id_extends() {
      rrEm_1 var1 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
      List var2 = var1.id_class(aI_2.D, this.id_class.rN().id_class(32.0), this::id_class);
      if (var2.isEmpty()) {
         return null;
      } else {
         rsq_3 var3 = (rsq_3)var2.get(((rYB)this.id_class.id_throws[7]).id_int.nextInt(var2.size()));
         rjU_2 var4 = var3.Ps();
         return iX_2.id_class(this.id_class, 10, 7, var4);
      }
   }

   private rjh_3 id_volatile() {
      rrEm_1 var1 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
      List var2 = rjh_3.id_class(rjh_3.id_class(this.id_class), 2).filter(var1x -> var1.id_break(var1x) == 0).collect(Collectors.toList());
      return var2.isEmpty() ? null : (rjh_3)var2.get(var1.id_int.nextInt(var2.size()));
   }

   private rjU_2 id_native() {
      rjh_3 var1 = this.id_volatile();
      if (var1 == null) {
         return null;
      } else {
         rfH_2 var2 = this.id_class(var1);
         return var2 == null ? null : iX_2.id_class(this.id_class, 10, 7, rjU_2.id_protected(var2));
      }
   }
}
