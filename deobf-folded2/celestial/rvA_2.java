package celestial;

import java.io.IOException;

public class rvA_2 implements ruS_2<At_1> {
   private int id_class;
   private int id_break;

   public int id_byte() {
      return this.id_break;
   }

   public rvA_2() {
   }

   public rvA_2(an_3 var1, an_3 var2) {
      this.id_class = var1.V();
      this.id_break = var2 != null ? var2.V() : 0;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readInt();
      this.id_break = var1.readInt();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeInt(this.id_class);
      var1.writeInt(this.id_break);
   }

   public int id_break() {
      return this.id_class;
   }
}
