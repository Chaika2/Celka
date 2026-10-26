package celestial;

import java.io.IOException;

public class rFz_1 implements ruS_2<At_1> {
   private rqO_2 class_;
   private rqL_2 break_;

   public rqL_2 byte_() {
      return this.break_;
   }

   public rFz_1() {
   }

   public rFz_1(rqO_2 var1, rqL_2 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      byte var2 = var1.readByte();
      if ((var2 & 1) > 0) {
         this.break_ = var1.class_(rqL_2.class);
      }

      if ((var2 & 2) > 0) {
         this.class_ = var1.volatile_();
      }
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      if (this.break_ != null) {
         if (this.class_ != null) {
            var1.writeByte(3);
            var1.class_(this.break_);
            var1.class_(this.class_);
         } else {
            var1.writeByte(1);
            var1.class_(this.break_);
         }
      } else if (this.class_ != null) {
         var1.writeByte(2);
         var1.class_(this.class_);
      } else {
         var1.writeByte(0);
      }
   }

   public rqO_2 break_() {
      return this.class_;
   }
}
