package celestial;

import java.io.IOException;

public class rvc_3 implements ruS_2<At_1> {
   private int class_;
   private int break_;
   private int byte_;
   private int protected_;

   public int byte_() {
      return this.break_;
   }

   public void byte_(int var1) {
      this.protected_ = var1;
   }

   public rvc_3() {
   }

   public rvc_3(int var1, rjU_2 var2) {
      this.class_ = var1;
      double var3 = 3.9;
      double var5 = rfU_2.class_(var2.break_, -3.9, 3.9);
      double var7 = rfU_2.class_(var2.byte_, -3.9, 3.9);
      double var9 = rfU_2.class_(var2.protected_, -3.9, 3.9);
      this.break_ = (int)(var5 * 8000.0);
      this.byte_ = (int)(var7 * 8000.0);
      this.protected_ = (int)(var9 * 8000.0);
   }

   public rvc_3(an_3 var1) {
      this(var1.V(), var1.rv());
   }

   @Override
   public String toString() {
      return "SEntityVelocityPacket{entityID=" + this.class_ + ", motionX=" + this.break_ + ", motionY=" + this.byte_ + ", motionZ=" + this.protected_ + "}";
   }

   public void class_(int var1) {
      this.break_ = var1;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.readShort();
      this.byte_ = var1.readShort();
      this.protected_ = var1.readShort();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.writeShort(this.break_);
      var1.writeShort(this.byte_);
      var1.writeShort(this.protected_);
   }

   public void break_(int var1) {
      this.byte_ = var1;
   }

   public int break_() {
      return this.class_;
   }

   public int throws_() {
      return this.protected_;
   }

   public int protected_() {
      return this.byte_;
   }
}
