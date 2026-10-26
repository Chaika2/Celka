package celestial;

import java.io.IOException;

public class rFr_1 implements ruS_2<At_1> {
   private int id_class;
   private rLR id_break;

   public rFr_1() {
   }

   public rFr_1(int var1, rLR var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public an_3 id_class(rYB var1) {
      return var1.id_break(this.id_class);
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      this.id_break = rLR.id_class(var1.readUnsignedByte());
   }

   public rLR id_break() {
      return this.id_break;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.writeByte(rLR.id_class(this.id_break));
   }
}
