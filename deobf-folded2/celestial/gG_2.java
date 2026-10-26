package celestial;

import java.util.function.Consumer;

public class gG_2 {
   private final Aq_1 id_class;
   private int id_break = -1;
   private Consumer<rcd_3> id_byte;

   public gG_2(Aq_1 var1) {
      this.id_class = var1;
   }

   public void id_class(rfH_2 var1, Consumer<rcd_3> var2) {
      int var3 = this.id_class(var2);
      this.id_class.id_class(new rZW(var3, var1));
   }

   public void id_class(int var1, Consumer<rcd_3> var2) {
      int var3 = this.id_class(var2);
      this.id_class.id_class(new rZk_1(var3, var1));
   }

   private int id_class(Consumer<rcd_3> var1) {
      this.id_byte = var1;
      return ++this.id_break;
   }

   public boolean id_class(int var1, rcd_3 var2) {
      if (this.id_break == var1 && this.id_byte != null) {
         this.id_byte.accept(var2);
         this.id_byte = null;
         return true;
      } else {
         return false;
      }
   }
}
