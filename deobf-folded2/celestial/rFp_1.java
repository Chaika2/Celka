package celestial;

import java.io.IOException;

public class rFp_1 implements ruS_2<At_1> {
   private long id_class;
   private long id_break;

   public long id_byte() {
      return this.id_break;
   }

   public rFp_1() {
   }

   public rFp_1(long var1, long var3, boolean var5) {
      this.id_class = var1;
      this.id_break = var3;
      if (!var5) {
         this.id_break = -this.id_break;
         if (this.id_break == 0L) {
            this.id_break = -1L;
         }
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readLong();
      this.id_break = var1.readLong();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeLong(this.id_class);
      var1.writeLong(this.id_break);
   }

   public long id_break() {
      return this.id_class;
   }
}
