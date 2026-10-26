package celestial;

public class wD_2 {
   public float[] class_;
   public final int break_;

   public int byte_(int var1) {
      return (var1 + 4 - this.break_ / 90) % 4;
   }

   public wD_2(float[] var1, int var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(float[] var1) {
      if (this.class_ == null) {
         this.class_ = var1;
      }
   }

   public float class_(int var1) {
      if (this.class_ == null) {
         throw new NullPointerException("uvs");
      } else {
         int var2 = this.protected_(var1);
         return this.class_[var2 != 0 && var2 != 1 ? 2 : 0];
      }
   }

   public float break_(int var1) {
      if (this.class_ == null) {
         throw new NullPointerException("uvs");
      } else {
         int var2 = this.protected_(var1);
         return this.class_[var2 != 0 && var2 != 3 ? 3 : 1];
      }
   }

   private int protected_(int var1) {
      return (var1 + this.break_ / 90) % 4;
   }
}
