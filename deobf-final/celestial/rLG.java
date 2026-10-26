package celestial;

import java.io.IOException;

public class rLG implements ruS_2<Af_1> {
   private long class_;

   public rLG() {
   }

   public rLG(long var1) {
      this.class_ = var1;
   }

   public void class_(Af_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readLong();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeLong(this.class_);
   }
}
