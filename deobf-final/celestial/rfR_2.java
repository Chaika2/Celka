package celestial;

public class rfR_2 {
   private int class_;
   private int break_;
   private int byte_;
   private int protected_;
   private int throws_;
   private int case_;
   private int catch_;
   private int private_;
   private int implements_;
   private int finally_;
   private int extends_;

   public int byte_() {
      return this.break_ + this.finally_;
   }

   public rfR_2(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4 - var1 + 1;
      this.throws_ = var5 - var2 + 1;
      this.case_ = var6 - var3 + 1;
      this.catch_ = this.protected_ * this.throws_ * this.case_;
   }

   public boolean class_() {
      if (this.private_ == this.catch_) {
         return false;
      } else {
         this.implements_ = this.private_ % this.protected_;
         int var1 = this.private_ / this.protected_;
         this.finally_ = var1 % this.throws_;
         this.extends_ = var1 / this.throws_;
         this.private_++;
         return true;
      }
   }

   public int break_() {
      return this.class_ + this.implements_;
   }

   public int throws_() {
      int var1 = 0;
      if (this.implements_ == 0 || this.implements_ == this.protected_ - 1) {
         var1++;
      }

      if (this.finally_ == 0 || this.finally_ == this.throws_ - 1) {
         var1++;
      }

      if (this.extends_ == 0 || this.extends_ == this.case_ - 1) {
         var1++;
      }

      return var1;
   }

   public int protected_() {
      return this.byte_ + this.extends_;
   }
}
