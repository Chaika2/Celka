package celestial;

import java.io.IOException;

public class rvG_2 implements ruS_2<At_1> {
   private int[] id_class;

   public rvG_2() {
   }

   public rvG_2(int... var1) {
      this.id_class = var1;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = new int[var1.id_case()];

      for (int var2 = 0; var2 < this.id_class.length; var2++) {
         this.id_class[var2] = var1.id_case();
      }
   }

   public int[] id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class.length);

      for (int var5 : this.id_class) {
         var1.id_protected(var5);
      }
   }
}
