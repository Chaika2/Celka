package celestial;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class rbw_3 extends rbq_3 {
   @Override
   public void byte_() {
      this.class_.throw_ = 200;
      List var1 = this.finally_();
      if (!var1.isEmpty()) {
         for (rfH_2 var3 : var1) {
            if (!this.class_.float_.break_(var3)) {
               this.class_.abstract_ = var3;
               return;
            }
         }

         this.class_.float_.finally_();
         this.class_.abstract_ = (rfH_2)var1.get(0);
      }
   }

   rbw_3(rbF_2 var1) {
      super(var1);
      this.class_ = var1;
   }

   private List<rfH_2> finally_() {
      rfH_2 var1 = this.class_.Bs();
      rga_3 var2 = ((rrEm_1)((rYB)this.class_.throws_[7])).d();
      Stream var3 = var2.byte_(var0 -> var0 == rRP.this_ || var0 == rRP.else_, var1, 20, rRr_1.ANY);
      return var3.map(rgU_2::throws_)
         .filter(var1x -> this.class_.extends_(var1x))
         .sorted(Comparator.comparingDouble(var1x -> var1x.private_(var1)))
         .collect(Collectors.toList());
   }

   @Override
   public boolean catch_() {
      return this.class_.throw_ == 0 && !this.class_.sx() && this.class_.sF();
   }

   @Override
   public boolean private_() {
      return false;
   }
}
