package celestial;

public class rqw_3 {
   public float class_;
   public float break_;
   private long byte_;
   private final float protected_;
   private float throws_ = 1.0F;

   public rqw_3(float var1, long var2) {
      this.protected_ = 1000.0F / var1;
      this.byte_ = var2;
   }

   public void class_(float var1) {
      this.throws_ = var1;
   }

   public float class_() {
      return this.throws_;
   }

   public int class_(long var1) {
      this.break_ = (float)(var1 - this.byte_) / this.protected_ * this.throws_;
      this.byte_ = var1;
      this.class_ = this.class_ + this.break_;
      int var3 = (int)this.class_;
      this.class_ -= (float)var3;
      return var3;
   }
}
