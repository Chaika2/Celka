package celestial;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class rrWk_1 {
   private static FloatBuffer class_ = BufferUtils.createFloatBuffer(16);
   private static float[] break_ = new float[16];

   private static float[] class_(float[] var0) {
      float[] var1 = new float[16];

      for (int var2 = 0; var2 < 4; var2++) {
         for (int var3 = 0; var3 < 4; var3++) {
            var1[var2 * 4 + var3] = var0[var3 * 4 + var2];
         }
      }

      return var1;
   }

   public static String class_() {
      ((Buffer)class_).clear();
      GL11.glGetFloatv(2982, class_);
      class_.get(break_);
      float[] var0 = class_(break_);
      return break_(var0);
   }

   public static String class_(rjV_2 var0) {
      var0.class_(break_);
      return break_(break_);
   }

   private static String break_(float[] var0) {
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

         var3 = rrzX_2.class_(var3, 5, ' ');
         var1.append(var3);
      }

      return var1.toString();
   }

   public static String break_() {
      ((Buffer)class_).clear();
      GL11.glGetFloatv(2983, class_);
      class_.get(break_);
      float[] var0 = class_(break_);
      return break_(var0);
   }
}
