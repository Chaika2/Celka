package celestial;

import java.nio.Buffer;
import java.nio.IntBuffer;

public class rrxZ_2 {
   private static IntBuffer id_class = rrbb_3.id_break(1024);
   private static IntBuffer id_break = rrbb_3.id_break(1024);
   private static boolean id_byte;

   public static void id_class(int var0, rrxm_3 var1) {
      id_byte = rrbb_3.rs();
      rrxC_2[] var2 = var1.id_class();

      for (int var3 = 0; var3 < var2.length; var3++) {
         rrxC_2 var4 = var2[var3];
         id_class(var0, var4);
      }
   }

   private static void id_class(int var0, rrxC_2 var1) {
      fj_3 var2 = var1.id_class();
      int[] var3 = var1.id_break();
      int[] var4 = var1.id_byte();
      MT.id_super(var2.id_case);
      if (id_byte) {
         int var5 = var2.id_extends != null ? var2.id_extends.id_case : 0;
         int var6 = var2.id_native != null ? var2.id_native.id_case : 0;
         fJ_2 var7 = var2.id_extends();
         rrdA.id_class(var5, var6, var7.id_package(), var7.id_int(), var7.id_volatile());
         if (rrdZ.PV.id_case()) {
            rrdZ.PV.id_class(var2.id_case(), var2.id_private(), var2.id_catch(), var2.id_implements());
         }
      }

      if (id_class.capacity() < var3.length) {
         int var8 = rfU_2.id_byte(var3.length);
         id_class = rrbb_3.id_break(var8);
         id_break = rrbb_3.id_break(var8);
      }

      ((Buffer)id_class).clear();
      ((Buffer)id_break).clear();
      id_class.put(var3);
      id_break.put(var4);
      ((Buffer)id_class).flip();
      ((Buffer)id_break).flip();
      MT.id_class(var0, id_class, id_break);
   }
}
