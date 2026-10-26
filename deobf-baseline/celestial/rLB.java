package celestial;

import java.io.IOException;

public class rLB implements ruS_2<rLr_1> {
   private long id_class;

   public rLB() {
   }

   public rLB(long var1) {
      this.id_class = var1;
   }

   public void id_class(rLr_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readLong();
   }

   public long id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeLong(this.id_class);
   }
}
