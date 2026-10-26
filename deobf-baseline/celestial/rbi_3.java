package celestial;

import java.util.function.Predicate;

public class rbi_3 implements Predicate<iB_2> {
   public rbi_3(rba_3 var1) {
      this.id_class = var1;
   }

   public boolean id_class(iB_2 var1) {
      if (var1 instanceof rba_3) {
         return false;
      } else if (var1 instanceof rbR_2 || var1 instanceof rMi_1 || var1 instanceof rEi_1) {
         return true;
      } else if (var1 instanceof rOQ) {
         return !((rOQ)var1).sZ();
      } else if (!(var1 instanceof rhd_3) || !var1.id_native() && !((rhd_3)var1).id_implements()) {
         return this.id_class.id_byte(var1.ro()) ? false : !var1.Sc() && !var1.Pw();
      } else {
         return false;
      }
   }
}
