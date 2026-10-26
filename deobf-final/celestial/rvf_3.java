package celestial;

import java.io.IOException;

public class rvf_3 implements ruS_2<At_1> {
   private boolean class_;
   private boolean break_;
   private boolean byte_;
   private boolean protected_;
   private float throws_;
   private float case_;

   public boolean byte_() {
      return this.break_;
   }

   public rvf_3() {
   }

   public rvf_3(rhx_3 var1) {
      this.class_ = var1.class_;
      this.break_ = var1.break_;
      this.byte_ = var1.byte_;
      this.protected_ = var1.protected_;
      this.throws_ = var1.class_();
      this.case_ = var1.break_();
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      byte var2 = var1.readByte();
      this.class_ = (var2 & 1) != 0;
      this.break_ = (var2 & 2) != 0;
      this.byte_ = (var2 & 4) != 0;
      this.protected_ = (var2 & 8) != 0;
      this.throws_ = var1.readFloat();
      this.case_ = var1.readFloat();
   }

   public boolean break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      byte var2 = 0;
      if (this.class_) {
         var2 = (byte)(var2 | 1);
      }

      if (this.break_) {
         var2 = (byte)(var2 | 2);
      }

      if (this.byte_) {
         var2 = (byte)(var2 | 4);
      }

      if (this.protected_) {
         var2 = (byte)(var2 | 8);
      }

      var1.writeByte(var2);
      var1.writeFloat(this.throws_);
      var1.writeFloat(this.case_);
   }

   public boolean throws_() {
      return this.protected_;
   }

   public float catch_() {
      return this.case_;
   }

   public float case_() {
      return this.throws_;
   }

   public boolean protected_() {
      return this.byte_;
   }
}
