package celestial;

import java.util.List;

public record rrTP() implements rrTu_1 {
   public float class_;
   public List<rdn_3> break_;
   public IJ[] byte_;
   public int protected_;
   public float throws_;
   public float[] case_;
   public float catch_;
   public rgP_2 private_;

   @Override
   public rgP_2 byte_() {
      return this.private_;
   }

   rrTP(List<rdn_3> var1, float var2, float var3, float[] var4, float var5, int var6, rgP_2 var7, IJ[] var8) {
      this.break_ = var1;
      this.class_ = var2;
      this.throws_ = var3;
      this.case_ = var4;
      this.catch_ = var5;
      this.protected_ = var6;
      this.private_ = var7;
      this.byte_ = var8;
   }

   @Override
   public float class_() {
      return this.catch_;
   }

   @Override
   public float break_() {
      return this.throws_;
   }

   @Override
   public float[] throws_() {
      return this.case_;
   }

   @Override
   public IJ[] catch_() {
      return this.byte_;
   }

   public int case_() {
      return this.protected_;
   }

   @Override
   public List<rdn_3> protected_() {
      return this.break_;
   }

   @Override
   public float private_() {
      return this.class_;
   }
}
