package celestial;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class rbw_3 extends rbq_3 {
   @Override
   public void id_byte() {
      this.id_class.id_throw = 200;
      List var1 = this.id_finally();
      if (!var1.isEmpty()) {
         for (rfH_2 var3 : var1) {
            if (!this.id_class.id_float.id_break(var3)) {
               this.id_class.id_abstract = var3;
               return;
            }
         }

         this.id_class.id_float.id_finally();
         this.id_class.id_abstract = (rfH_2)var1.get(0);
      }
   }

   rbw_3(rbF_2 var1) {
      super(var1);
      this.id_class = var1;
   }

   private List<rfH_2> id_finally() {
      rfH_2 var1 = this.id_class.Bs();
      rga_3 var2 = ((rrEm_1)((rYB)this.id_class.id_throws[7])).d();
      Stream var3 = var2.id_byte(var0 -> var0 == rRP.id_this || var0 == rRP.id_else, var1, 20, rRr_1.ANY);
      return var3.map(rgU_2::id_throws)
         .filter(var1x -> this.id_class.id_extends(var1x))
         .sorted(Comparator.comparingDouble(var1x -> var1x.id_private(var1)))
         .collect(Collectors.toList());
   }

   @Override
   public boolean id_catch() {
      return this.id_class.id_throw == 0 && !this.id_class.sx() && this.id_class.sF();
   }

   @Override
   public boolean id_private() {
      return false;
   }
}
