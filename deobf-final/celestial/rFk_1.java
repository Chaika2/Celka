package celestial;

import java.io.IOException;
import java.util.UUID;

public class rFk_1 implements ruS_2<At_1> {
   private int class_;
   private UUID break_;
   private double byte_;
   private double protected_;
   private double throws_;
   private byte case_;
   private byte catch_;

   public UUID byte_() {
      return this.break_;
   }

   public rFk_1() {
   }

   public rFk_1(rhd_3 var1) {
      this.class_ = var1.V();
      this.break_ = var1.sv().getId();
      this.byte_ = var1.rx();
      this.protected_ = var1.re();
      this.throws_ = var1.BO();
      this.case_ = (byte)((int)((Float)var1.throws_[15] * 256.0F / 360.0F));
      this.catch_ = (byte)((int)((Float)var1.throws_[16] * 256.0F / 360.0F));
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.private_();
      this.byte_ = var1.readDouble();
      this.protected_ = var1.readDouble();
      this.throws_ = var1.readDouble();
      this.case_ = var1.readByte();
      this.catch_ = var1.readByte();
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.class_(this.break_);
      var1.writeDouble(this.byte_);
      var1.writeDouble(this.protected_);
      var1.writeDouble(this.throws_);
      var1.writeByte(this.case_);
      var1.writeByte(this.catch_);
   }

   public double throws_() {
      return this.protected_;
   }

   public byte catch_() {
      return this.case_;
   }

   public double case_() {
      return this.throws_;
   }

   public double protected_() {
      return this.byte_;
   }

   public byte private_() {
      return this.catch_;
   }
}
