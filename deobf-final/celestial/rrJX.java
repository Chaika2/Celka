package celestial;

import java.awt.Rectangle;
import java.util.Arrays;
import java.util.List;

public class rrJX {
   private vm_3 class_;
   private rrJJ break_;
   private int byte_ = 0;
   private int protected_ = 0;
   private long throws_ = 0L;

   public rrJX(vm_3 var1, rrJJ var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(Ml_1 var1, int var2, int var3, List<LZ> var4) {
      if (Math.abs(var2 - this.byte_) <= 5 && Math.abs(var3 - this.protected_) <= 5) {
         short var5 = 700;
         if (System.currentTimeMillis() >= this.throws_ + (long)var5) {
            LZ var6 = rrJM.class_(var2, var3, var4);
            if (var6 != null) {
               Rectangle var7 = this.break_.class_(this.class_, var2, var3);
               String[] var8 = this.break_.class_(var6, var7.width);
               if (var8 != null) {
                  if (var8.length > 8) {
                     var8 = Arrays.copyOf(var8, 8);
                     var8[var8.length - 1] = var8[var8.length - 1] + " ...";
                  }

                  if (this.break_.class_()) {
                     int var9 = -528449408;
                     this.class_(var1, var7.x, var7.y, var7.x + var7.width, var7.y + var7.height, var9);
                  }

                  ch_3.class_(var1, var7.x, var7.y, var7.x + var7.width, var7.y + var7.height, -536870912);

                  for (int var13 = 0; var13 < var8.length; var13++) {
                     String var10 = var8[var13];
                     int var11 = 14540253;
                     if (var10.endsWith("!")) {
                        var11 = 16719904;
                     }

                     cm_3 var12 = (cm_3)QY.instanceof_().class_[15];
                     var12.class_(var1, var10, (float)(var7.x + 5), (float)(var7.y + 5 + var13 * 11), var11);
                  }
               }
            }
         }
      } else {
         this.byte_ = var2;
         this.protected_ = var3;
         this.throws_ = System.currentTimeMillis();
      }
   }

   private void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6) {
      ch_3.class_(var1, var2, var3 - 1, var4, var3, var6);
      ch_3.class_(var1, var2, var5, var4, var5 + 1, var6);
      ch_3.class_(var1, var2 - 1, var3, var2, var5, var6);
      ch_3.class_(var1, var4, var3, var4 + 1, var5, var6);
   }
}
