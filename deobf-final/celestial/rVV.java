package celestial;

import java.util.Optional;

class rVV implements rgM_2<rgS_2> {
   private final rgA_2 break_;

   rVV(rVj_1 var1, rVo_1 var2) {
      this.class_ = var2;
      this.break_ = new rgA_2();
   }

   @Override
   public Optional<rgS_2> accept(rgc_3 var1, String var2) {
      this.class_.break_();
      if (!rgL_2.byte_(var2, var1, this.class_)) {
         String var3 = var2.substring(0, this.class_.class_());
         if (!var3.isEmpty()) {
            this.break_.class_(rgS_2.class_(var3, var1));
         }

         return Optional.of(this.break_.break_());
      } else {
         if (!var2.isEmpty()) {
            this.break_.class_(rgS_2.class_(var2, var1));
         }

         return Optional.empty();
      }
   }
}
