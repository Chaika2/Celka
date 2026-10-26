package celestial;

import java.util.ArrayDeque;

public class gf_3 implements gj_3 {
   private final gw_3 class_;

   public gf_3(gt_3 var1) {
      this.class_ = new gw_3(var1);
   }

   @Override
   public String toString() {
      return "function " + this.class_.class_();
   }

   @Override
   public void class_(Oa_1 var1, gy_3 var2, ArrayDeque<Oi_1> var3, int var4) {
      this.class_.class_(var1).ifPresent(var4x -> {
         gj_3[] var5 = var4x.break_();
         int var6 = var4 - var3.size();
         int var7 = Math.min(var5.length, var6);

         for (int var8 = var7 - 1; var8 >= 0; var8--) {
            var3.addFirst(new Oi_1(var1, var2, var5[var8]));
         }
      });
   }
}
