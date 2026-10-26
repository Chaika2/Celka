package celestial;

import java.io.IOException;
import java.util.List;

public class rFb_1 implements ruS_2<At_1> {
   private int id_class;
   private int[] id_break;

   public int id_byte() {
      return this.id_class;
   }

   public rFb_1() {
   }

   public rFb_1(an_3 var1) {
      this.id_class = var1.V();
      List var2 = var1.Bh();
      this.id_break = new int[var2.size()];

      for (int var3 = 0; var3 < var2.size(); var3++) {
         this.id_break[var3] = ((an_3)var2.get(var3)).V();
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.id_break();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.id_class(this.id_break);
   }

   public int[] id_break() {
      return this.id_break;
   }
}
