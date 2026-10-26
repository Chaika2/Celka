package celestial;

import java.util.Arrays;

public class rrbe_3 {
   private rqO_2 class_;
   private float[] break_;

   public rrbe_3(rqO_2 var1, float[] var2) {
      this.class_ = var1;
      this.break_ = (float[])var2.clone();
      Arrays.sort(this.break_);
   }

   @Override
   public String toString() {
      return "location: " + this.class_ + ", values: [" + rrbb_3.class_(this.break_) + "]";
   }

   public Integer class_(rdn_3 var1, gm_3 var2, iB_2 var3) {
      rdb_3 var4 = var1.break_();
      rdE_2 var5 = rdv_3.class_(var4, this.class_);
      if (var5 == null) {
         return null;
      } else {
         float var6 = var5.call(var1, var2, var3);
         int var7 = Arrays.binarySearch(this.break_, var6);
         return var7;
      }
   }

   public rqO_2 class_() {
      return this.class_;
   }

   public float[] break_() {
      return this.break_;
   }
}
