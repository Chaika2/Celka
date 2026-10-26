package celestial;

import java.io.IOException;

public class rvm_3 implements ruS_2<At_1> {
   private int id_class;

   public rvm_3() {
   }

   public rvm_3(int var1) {
      this.id_class = var1;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readByte();
   }

   public int id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeByte(this.id_class);
   }
}
