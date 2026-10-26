package celestial;

import java.io.IOException;

public class rvq_3 implements ruS_2<At_1> {
   private int id_class;
   private rqO_2 id_break;

   public int id_byte() {
      return this.id_class;
   }

   public rvq_3() {
   }

   public rvq_3(int var1, rkw_3<?> var2) {
      this.id_class = var1;
      this.id_break = var2.id_case();
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readByte();
      this.id_break = var1.id_volatile();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeByte(this.id_class);
      var1.id_class(this.id_break);
   }

   public rqO_2 id_break() {
      return this.id_break;
   }
}
