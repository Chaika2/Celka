package celestial;

import java.io.IOException;
import java.util.Set;

public class rvD_2 implements ruS_2<At_1> {
   private double class_;
   private double break_;
   private double byte_;
   private float protected_;
   private float throws_;
   private Set<rvU_2> case_;
   private int catch_;

   public double byte_() {
      return this.break_;
   }

   public rvD_2() {
   }

   public rvD_2(double var1, double var3, double var5, float var7, float var8, Set<rvU_2> var9, int var10) {
      this.class_ = var1;
      this.break_ = var3;
      this.byte_ = var5;
      this.protected_ = var7;
      this.throws_ = var8;
      this.case_ = var9;
      this.catch_ = var10;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readDouble();
      this.break_ = var1.readDouble();
      this.byte_ = var1.readDouble();
      this.protected_ = var1.readFloat();
      this.throws_ = var1.readFloat();
      this.case_ = rvU_2.class_(var1.readUnsignedByte());
      this.catch_ = var1.case_();
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
      var1.writeByte(rvU_2.class_(this.case_));
      var1.protected_(this.catch_);
   }

   public float throws_() {
      return this.protected_;
   }

   public int catch_() {
      return this.catch_;
   }

   public float case_() {
      return this.throws_;
   }

   public double protected_() {
      return this.byte_;
   }

   public Set<rvU_2> private_() {
      return this.case_;
   }
}
