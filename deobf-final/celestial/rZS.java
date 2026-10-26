package celestial;

import java.io.IOException;

public class rZS implements ruS_2<rmH_2> {
   private double class_;
   private double break_;
   private double byte_;
   private float protected_;
   private float throws_;

   public double byte_() {
      return this.break_;
   }

   public rZS() {
   }

   public rZS(an_3 var1) {
      this.class_ = var1.rx();
      this.break_ = var1.re();
      this.byte_ = var1.BO();
      this.protected_ = (Float)var1.throws_[15];
      this.throws_ = (Float)var1.throws_[16];
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readDouble();
      this.break_ = var1.readDouble();
      this.byte_ = var1.readDouble();
      this.protected_ = var1.readFloat();
      this.throws_ = var1.readFloat();
   }

   public double break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeDouble(this.class_);
      var1.writeDouble(this.break_);
      var1.writeDouble(this.byte_);
      var1.writeFloat(this.protected_);
      var1.writeFloat(this.throws_);
   }

   public float throws_() {
      return this.protected_;
   }

   public float case_() {
      return this.throws_;
   }

   public double protected_() {
      return this.byte_;
   }
}
