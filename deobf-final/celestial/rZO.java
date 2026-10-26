package celestial;

import java.io.IOException;

public class rZO implements ruS_2<rmH_2> {
   protected double class_;
   protected double break_;
   protected double byte_;
   protected float protected_;
   protected float throws_;
   protected boolean case_;
   protected boolean catch_;
   protected boolean private_;

   public double byte_(double var1) {
      return this.catch_ ? this.byte_ : var1;
   }

   public boolean byte_() {
      return this.catch_;
   }

   public rZO() {
   }

   public rZO(boolean var1) {
      this.case_ = var1;
   }

   public float class_(float var1) {
      return this.private_ ? this.protected_ : var1;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.case_ = var1.readUnsignedByte() != 0;
   }

   public double class_(double var1) {
      return this.catch_ ? this.class_ : var1;
   }

   public double break_(double var1) {
      return this.catch_ ? this.break_ : var1;
   }

   public boolean break_() {
      return this.case_;
   }

   public float break_(float var1) {
      return this.private_ ? this.throws_ : var1;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeByte(this.case_ ? 1 : 0);
   }
}
