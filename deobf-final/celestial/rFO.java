package celestial;

import java.io.IOException;

public class rFO implements ruS_2<At_1> {
   private int class_;
   private double break_;
   private double byte_;
   private double protected_;
   private int throws_;

   public double byte_() {
      return this.break_;
   }

   public rFO() {
   }

   public rFO(rsP_2 var1) {
      this.class_ = var1.V();
      this.break_ = var1.rx();
      this.byte_ = var1.re();
      this.protected_ = var1.BO();
      this.throws_ = var1.protected_();
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.readDouble();
      this.byte_ = var1.readDouble();
      this.protected_ = var1.readDouble();
      this.throws_ = var1.readShort();
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.writeDouble(this.break_);
      var1.writeDouble(this.byte_);
      var1.writeDouble(this.protected_);
      var1.writeShort(this.throws_);
   }

   public double throws_() {
      return this.protected_;
   }

   public int case_() {
      return this.throws_;
   }

   public double protected_() {
      return this.byte_;
   }
}
