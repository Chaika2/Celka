package celestial;

public class rdO_2 {
   int class_ = 64;
   int break_;
   rdb_3 byte_;
   rdX_2 protected_;
   rde_3 throws_ = rde_3.COMMON;
   rxK_2 case_;
   boolean catch_;
   boolean private_;

   public rdO_2 byte_(int var1) {
      this.break_ = var1;
      this.class_ = 1;
      return this;
   }

   public rdO_2 class_(rdb_3 var1) {
      this.byte_ = var1;
      return this;
   }

   public rdO_2 class_(rdX_2 var1) {
      this.protected_ = var1;
      return this;
   }

   public rdO_2 class_(rde_3 var1) {
      this.throws_ = var1;
      return this;
   }

   public rdO_2 class_() {
      this.catch_ = true;
      return this;
   }

   public rdO_2 class_(boolean var1) {
      this.private_ = var1;
      return this;
   }

   public rdO_2 class_(int var1) {
      if (this.break_ > 0) {
         throw new RuntimeException("Unable to have damage AND stack.");
      } else {
         this.class_ = var1;
         return this;
      }
   }

   public rdO_2 class_(rxK_2 var1) {
      this.case_ = var1;
      return this;
   }

   public rdO_2 break_(int var1) {
      return this.break_ == 0 ? this.byte_(var1) : this;
   }
}
