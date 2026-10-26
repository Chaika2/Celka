package celestial;

import java.io.IOException;
import java.util.Objects;

public class rvM_2 implements ruS_2<At_1> {
   private int id_class;
   private String id_break;

   public String id_byte() {
      return Objects.equals(this.id_break, "") ? null : this.id_break;
   }

   public rvM_2() {
   }

   public rvM_2(int var1, rnP_2 var2) {
      this.id_class = var1;
      if (var2 == null) {
         this.id_break = "";
      } else {
         this.id_break = var2.id_break();
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readByte();
      this.id_break = var1.id_throws(16);
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeByte(this.id_class);
      var1.id_class(this.id_break);
   }

   public int id_break() {
      return this.id_class;
   }
}
