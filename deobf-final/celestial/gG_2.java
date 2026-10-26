package celestial;

import java.util.function.Consumer;

public class gG_2 {
   private final Aq_1 class_;
   private int break_ = -1;
   private Consumer<rcd_3> byte_;

   public gG_2(Aq_1 var1) {
      this.class_ = var1;
   }

   public void class_(rfH_2 var1, Consumer<rcd_3> var2) {
      int var3 = this.class_(var2);
      this.class_.class_(new rZW(var3, var1));
   }

   public void class_(int var1, Consumer<rcd_3> var2) {
      int var3 = this.class_(var2);
      this.class_.class_(new rZk_1(var3, var1));
   }

   private int class_(Consumer<rcd_3> var1) {
      this.byte_ = var1;
      return ++this.break_;
   }

   public boolean class_(int var1, rcd_3 var2) {
      if (this.break_ == var1 && this.byte_ != null) {
         this.byte_.accept(var2);
         this.byte_ = null;
         return true;
      } else {
         return false;
      }
   }
}
