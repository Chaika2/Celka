package celestial;

import java.io.IOException;

public class rma_3 implements ruS_2<rmH_2> {
   private float class_;
   private float break_;
   private boolean byte_;
   private boolean protected_;

   public float byte_() {
      return this.break_;
   }

   public rma_3() {
   }

   public rma_3(float var1, float var2, boolean var3, boolean var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readFloat();
      this.break_ = var1.readFloat();
      byte var2 = var1.readByte();
      this.byte_ = (var2 & 1) > 0;
      this.protected_ = (var2 & 2) > 0;
   }

   public float break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeFloat(this.class_);
      var1.writeFloat(this.break_);
      byte var2 = 0;
      if (this.byte_) {
         var2 = (byte)(var2 | 1);
      }

      if (this.protected_) {
         var2 = (byte)(var2 | 2);
      }

      var1.writeByte(var2);
   }

   public boolean throws_() {
      return this.protected_;
   }

   public boolean protected_() {
      return this.byte_;
   }
}
