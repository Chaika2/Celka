package celestial;

import java.io.IOException;

public class rvp_3 implements ruS_2<At_1> {
   private int id_class;
   private int id_break;
   private rgP_2 id_byte;

   public rJP<?> id_byte() {
      return rVL.G.id_class(this.id_break);
   }

   public rvp_3() {
   }

   public rvp_3(int var1, rJP<?> var2, rgP_2 var3) {
      this.id_class = var1;
      this.id_break = rVL.G.id_class(var2);
      this.id_byte = var3;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = var1.id_case();
      this.id_byte = var1.id_throws();
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.id_protected(this.id_break);
      var1.id_class(this.id_byte);
   }

   public rgP_2 id_protected() {
      return this.id_byte;
   }
}
