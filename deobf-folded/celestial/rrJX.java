package celestial;

import java.awt.Rectangle;
import java.util.Arrays;
import java.util.List;

public class rrJX {
   private vm_3 id_class;
   private rrJJ id_break;
   private int id_byte = 0;
   private int id_protected = 0;
   private long id_throws = 0L;

   public rrJX(vm_3 var1, rrJJ var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(Ml_1 var1, int var2, int var3, List<LZ> var4) {
      if (Math.abs(var2 - this.id_byte) <= 5 && Math.abs(var3 - this.id_protected) <= 5) {
         short var5 = 700;
         if (System.currentTimeMillis() >= this.id_throws + (long)var5) {
            LZ var6 = rrJM.id_class(var2, var3, var4);
            if (var6 != null) {
               Rectangle var7 = this.id_break.id_class(this.id_class, var2, var3);
               String[] var8 = this.id_break.id_class(var6, var7.width);
               if (var8 != null) {
                  if (var8.length > 8) {
                     var8 = Arrays.copyOf(var8, 8);
                     var8[var8.length - 1] = var8[var8.length - 1] + " ...";
                  }

                  if (this.id_break.id_class()) {
                     int var9 = -528449408;
                     this.id_class(var1, var7.x, var7.y, var7.x + var7.width, var7.y + var7.height, var9);
                  }

                  ch_3.id_class(var1, var7.x, var7.y, var7.x + var7.width, var7.y + var7.height, -536870912);

                  for (int var13 = 0; var13 < var8.length; var13++) {
                     String var10 = var8[var13];
                     int var11 = 14540253;
                     if (var10.endsWith("!")) {
                        var11 = 16719904;
                     }

                     cm_3 var12 = (cm_3)QY.id_instanceof().id_class[15];
                     var12.id_class(var1, var10, (float)(var7.x + 5), (float)(var7.y + 5 + var13 * 11), var11);
                  }
               }
            }
         }
      } else {
         this.id_byte = var2;
         this.id_protected = var3;
         this.id_throws = System.currentTimeMillis();
      }
   }

   private void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6) {
      ch_3.id_class(var1, var2, var3 - 1, var4, var3, var6);
      ch_3.id_class(var1, var2, var5, var4, var5 + 1, var6);
      ch_3.id_class(var1, var2 - 1, var3, var2, var5, var6);
      ch_3.id_class(var1, var4, var3, var4 + 1, var5, var6);
   }
}
