package celestial;

import java.io.IOException;

public class rZr_1 implements ruS_2<rmH_2> {
   private long id_class;

   public rZr_1() {
   }

   public rZr_1(long var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readLong();
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   public long id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeLong(this.id_class);
   }
}
