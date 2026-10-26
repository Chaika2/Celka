package celestial;

import java.util.Optional;

class rVV implements rgM_2<rgS_2> {
   private final rgA_2 id_break;

   rVV(rVj_1 var1, rVo_1 var2) {
      this.id_class = var2;
      this.id_break = new rgA_2();
   }

   @Override
   public Optional<rgS_2> accept(rgc_3 var1, String var2) {
      this.id_class.id_break();
      if (!rgL_2.id_byte(var2, var1, this.id_class)) {
         String var3 = var2.substring(0, this.id_class.id_class());
         if (!var3.isEmpty()) {
            this.id_break.id_class(rgS_2.id_class(var3, var1));
         }

         return Optional.of(this.id_break.id_break());
      } else {
         if (!var2.isEmpty()) {
            this.id_break.id_class(rgS_2.id_class(var2, var1));
         }

         return Optional.empty();
      }
   }
}
