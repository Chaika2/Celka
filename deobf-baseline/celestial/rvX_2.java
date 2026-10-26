package celestial;

import java.io.IOException;
import java.util.List;

public class rvX_2 implements ruS_2<At_1> {
   private int id_class;
   private List<rmG_2<?>> id_break;

   public int id_byte() {
      return this.id_class;
   }

   public rvX_2() {
   }

   public rvX_2(int var1, rmE_2 var2, boolean var3) {
      this.id_class = var1;
      if (var3) {
         this.id_break = var2.id_byte();
         var2.id_throws();
      } else {
         this.id_break = var2.id_break();
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = rmE_2.id_class(var1);
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      rmE_2.id_class(this.id_break, var1);
   }

   public List<rmG_2<?>> id_break() {
      return this.id_break;
   }
}
