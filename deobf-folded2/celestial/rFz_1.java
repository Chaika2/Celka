package celestial;

import java.io.IOException;

public class rFz_1 implements ruS_2<At_1> {
   private rqO_2 id_class;
   private rqL_2 id_break;

   public rqL_2 id_byte() {
      return this.id_break;
   }

   public rFz_1() {
   }

   public rFz_1(rqO_2 var1, rqL_2 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      byte var2 = var1.readByte();
      if ((var2 & 1) > 0) {
         this.id_break = var1.id_class(rqL_2.class);
      }

      if ((var2 & 2) > 0) {
         this.id_class = var1.id_volatile();
      }
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      if (this.id_break != null) {
         if (this.id_class != null) {
            var1.writeByte(3);
            var1.id_class(this.id_break);
            var1.id_class(this.id_class);
         } else {
            var1.writeByte(1);
            var1.id_class(this.id_break);
         }
      } else if (this.id_class != null) {
         var1.writeByte(2);
         var1.id_class(this.id_class);
      } else {
         var1.writeByte(0);
      }
   }

   public rqO_2 id_break() {
      return this.id_class;
   }
}
