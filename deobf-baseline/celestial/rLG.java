package celestial;

import java.io.IOException;

public class rLG implements ruS_2<Af_1> {
   private long id_class;

   public rLG() {
   }

   public rLG(long var1) {
      this.id_class = var1;
   }

   public void id_class(Af_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readLong();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeLong(this.id_class);
   }
}
