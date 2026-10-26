package celestial;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class rrWk_1 {
   private static FloatBuffer id_class = BufferUtils.createFloatBuffer(16);
   private static float[] id_break = new float[16];

   private static float[] id_class(float[] var0) {
      float[] var1 = new float[16];

      for (int var2 = 0; var2 < 4; var2++) {
         for (int var3 = 0; var3 < 4; var3++) {
            var1[var2 * 4 + var3] = var0[var3 * 4 + var2];
         }
      }

      return var1;
   }

   public static String id_class() {
      ((Buffer)id_class).clear();
      GL11.glGetFloatv(2982, id_class);
      id_class.get(id_break);
      float[] var0 = id_class(id_break);
      return id_break(var0);
   }

   public static String id_class(rjV_2 var0) {
      var0.id_class(id_break);
      return id_break(id_break);
   }

   private static String id_break(float[] var0) {
      StringBuffer var1 = new StringBuffer();

      for (int var2 = 0; var2 < var0.length; var2++) {
         String var3 = String.format("%.2f", var0[var2]);
         if (var2 > 0) {
            if (var2 % 4 == 0) {
               var1.append("\n");
            } else {
               var1.append(", ");
            }
         }

         var3 = rrzX_2.id_class(var3, 5, ' ');
         var1.append(var3);
      }

      return var1.toString();
   }

   public static String id_break() {
      ((Buffer)id_class).clear();
      GL11.glGetFloatv(2983, id_class);
      id_class.get(id_break);
      float[] var0 = id_class(id_break);
      return id_break(var0);
   }
}
