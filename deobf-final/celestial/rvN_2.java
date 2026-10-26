package celestial;

import java.io.IOException;

public class rvN_2 implements ruS_2<At_1> {
   private int class_;
   private double break_;
   private double byte_;
   private double protected_;
   private byte throws_;
   private byte case_;
   private boolean catch_;

   public double byte_() {
      return this.break_;
   }

   public rvN_2() {
   }

   public rvN_2(an_3 var1) {
      this.class_ = var1.V();
      this.break_ = var1.rx();
      this.byte_ = var1.re();
      this.protected_ = var1.BO();
      this.throws_ = (byte)((int)((Float)var1.throws_[15] * 256.0F / 360.0F));
      this.case_ = (byte)((int)((Float)var1.throws_[16] * 256.0F / 360.0F));
      this.catch_ = var1.BL();
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
      this.throws_ = var1.readByte();
      this.case_ = var1.readByte();
      this.catch_ = var1.readBoolean();
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
      var1.writeByte(this.throws_);
      var1.writeByte(this.case_);
      var1.writeBoolean(this.catch_);
   }

   public double throws_() {
      return this.protected_;
   }

   public byte catch_() {
      return this.case_;
   }

   public byte case_() {
      return this.throws_;
   }

   public double protected_() {
      return this.byte_;
   }

   public boolean private_() {
      return this.catch_;
   }
}
