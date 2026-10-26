package celestial;

public class rjK_2 {
   public static final rjK_2 class_ = new rjK_2(0.0F, 0.0F);
   public static final rjK_2 break_ = new rjK_2(1.0F, 1.0F);
   public float byte_;
   public float protected_;

   public rjK_2(float var1, float var2) {
      this.byte_ = var1;
      this.protected_ = var2;
   }

   public boolean class_(rjK_2 var1) {
      return this.byte_ == var1.byte_ && this.protected_ == var1.protected_;
   }

   public rjK_2 class_(float var1, float var2) {
      this.byte_ = var1;
      this.protected_ = var2;
      return this;
   }
}
