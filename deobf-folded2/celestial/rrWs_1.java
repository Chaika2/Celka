package celestial;

import com.google.common.collect.UnmodifiableIterator;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class rrWs_1 {
   public static String id_class(IntBuffer var0) {
      if (var0 == null) {
         return "null";
      } else {
         StringBuffer var1 = new StringBuffer();
         var1.append("(pos=" + var0.position() + " lim=" + var0.limit() + " cap=" + var0.capacity() + ")");
         var1.append("[");
         int var2 = Math.min(var0.limit(), 1024);

         for (int var3 = 0; var3 < var2; var3++) {
            if (var3 > 0) {
               var1.append(", ");
            }

            var1.append(var0.get(var3));
         }

         var1.append("]");
         return var1.toString();
      }
   }

   private static String id_class(int var0, lD_2 var1) {
      StringBuffer var2 = new StringBuffer();
      ByteBuffer var3 = var1.id_new();
      jZ_2 var4 = var1.id_return();
      int var5 = var1.id_public() + var0 * var4.id_break();
      UnmodifiableIterator var6 = var4.id_byte().iterator();

      while (var6.hasNext()) {
         jv_3 var7 = (jv_3)var6.next();
         if (var7.id_case() > 0) {
            var2.append("(");
         }

         for (int var8 = 0; var8 < var7.id_case(); var8++) {
            if (var8 > 0) {
               var2.append(" ");
            }

            switch (var7.id_class()) {
               case FLOAT:
                  var2.append(var3.getFloat(var5));
                  break;
               case UBYTE:
               case BYTE:
                  var2.append(var3.get(var5));
                  break;
               case USHORT:
               case SHORT:
                  var2.append(var3.getShort(var5));
                  break;
               case UINT:
               case INT:
                  var2.append(var3.getShort(var5));
                  break;
               default:
                  var2.append("??");
            }

            var5 += var7.id_class().id_class();
         }

         if (var7.id_case() > 0) {
            var2.append(")");
         }
      }

      return var2.toString();
   }

   public static String id_class(lD_2 var0) {
      int var1 = var0.id_package();
      String var2 = "";
      byte var3 = -1;
      if (var1 == 7) {
         var2 = "quad";
         var3 = 4;
      } else {
         if (var1 != 4) {
            return "Invalid draw mode: " + var1;
         }

         var2 = "triangle";
         var3 = 3;
      }

      StringBuffer var4 = new StringBuffer();
      int var5 = var0.id_int();

      for (int var6 = 0; var6 < var5; var6++) {
         if (var6 % var3 == 0) {
            var4.append(var2 + " " + var6 / var3 + "\n");
         }

         String var7 = id_class(var6, var0);
         var4.append(var7);
         var4.append("\n");
      }

      return var4.toString();
   }

   public static int[] id_break(IntBuffer var0) {
      int[] var1 = new int[var0.limit()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = var0.get(var2);
      }

      return var1;
   }
}
