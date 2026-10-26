package celestial;

import java.util.Properties;

public class rrbI_2 {
   private String class_;
   private rqO_2[] break_;
   private int byte_ = 1;
   private int protected_ = 64;
   private int throws_ = 3;
   private int case_ = 3;
   private int catch_ = -2130706433;
   private int private_ = 16777215;
   private int implements_ = 0;
   private int finally_ = Integer.MIN_VALUE;

   public int byte_() {
      return this.protected_;
   }

   public rrbI_2(String var1, Properties var2) {
      rrMz_1 var3 = new rrMz_1("CustomPanorama");
      this.class_ = var1;
      this.break_ = new rqO_2[6];

      for (int var4 = 0; var4 < this.break_.length; var4++) {
         this.break_[var4] = new rqO_2(var1 + "/panorama_" + var4 + ".png");
      }

      this.byte_ = var3.class_(var2.getProperty("weight"), 1);
      this.protected_ = var3.class_(var2.getProperty("blur1"), 64);
      this.throws_ = var3.class_(var2.getProperty("blur2"), 3);
      this.case_ = var3.class_(var2.getProperty("blur3"), 3);
      this.catch_ = rrMz_1.byte_(var2.getProperty("overlay1.top"), -2130706433);
      this.private_ = rrMz_1.byte_(var2.getProperty("overlay1.bottom"), 16777215);
      this.implements_ = rrMz_1.byte_(var2.getProperty("overlay2.top"), 0);
      this.finally_ = rrMz_1.byte_(var2.getProperty("overlay2.bottom"), Integer.MIN_VALUE);
   }

   @Override
   public String toString() {
      return this.class_
         + ", weight: "
         + this.byte_
         + ", blur: "
         + this.protected_
         + " "
         + this.throws_
         + " "
         + this.case_
         + ", overlay: "
         + this.catch_
         + " "
         + this.private_
         + " "
         + this.implements_
         + " "
         + this.finally_;
   }

   public rqO_2[] class_() {
      return this.break_;
   }

   public int break_() {
      return this.byte_;
   }

   public int throws_() {
      return this.case_;
   }

   public int catch_() {
      return this.private_;
   }

   public int case_() {
      return this.catch_;
   }

   public int implements_() {
      return this.finally_;
   }

   public int protected_() {
      return this.throws_;
   }

   public int private_() {
      return this.implements_;
   }
}
