package celestial;

public class rrxV_2 implements rrxa_3 {
   private int protected_ = -1;
   private rqO_2 throws_;
   private int case_ = 0;
   private ff_3 catch_;
   public static final int class_ = 0;
   public static final int break_ = 1;
   public static final int byte_ = 2;

   public void byte_() {
      this.catch_ = null;
   }

   public rrxV_2(int var1, rqO_2 var2, int var3) {
      this.protected_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
   }

   @Override
   public String toString() {
      return "textureUnit: " + this.protected_ + ", location: " + this.throws_ + ", glTextureId: " + (this.catch_ != null ? this.catch_.new_() : "");
   }

   @Override
   public int class_() {
      return this.protected_;
   }

   public ff_3 break_() {
      if (this.catch_ == null) {
         fY_2 var1 = QY.instanceof_().A();
         this.catch_ = var1.break_(this.throws_);
         if (this.catch_ == null) {
            this.catch_ = new fH_2(this.throws_);
            var1.class_(this.throws_, this.catch_);
            this.catch_ = var1.break_(this.throws_);
         }
      }

      return this.catch_;
   }

   @Override
   public void throws_() {
   }

   @Override
   public int protected_() {
      ff_3 var1 = this.break_();
      if (this.case_ != 0 && var1 instanceof ff_3) {
         rrdE var2 = var1.implements_;
         if (var2 != null) {
            if (this.case_ == 1) {
               return var2.break_;
            }

            if (this.case_ == 2) {
               return var2.byte_;
            }
         }
      }

      return var1.new_();
   }
}
