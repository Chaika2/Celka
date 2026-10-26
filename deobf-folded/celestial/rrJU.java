package celestial;

import java.lang.reflect.Field;

public class rrJU implements rrJa_1 {
   private rrxB_2 id_class = null;
   private Class id_break = null;
   private int id_byte;

   public rrJU(rrxB_2 var1, Class var2) {
      this(var1, var2, 0);
   }

   public rrJU(rrxB_2 var1, Class var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public Field id_class() {
      Class var1 = this.id_class.id_break();
      if (var1 == null) {
         return null;
      } else {
         try {
            Field[] var2 = var1.getDeclaredFields();
            int var3 = 0;

            for (int var4 = 0; var4 < var2.length; var4++) {
               Field var5 = var2[var4];
               if (var5.getType() == this.id_break) {
                  if (var3 == this.id_byte) {
                     var5.setAccessible(true);
                     return var5;
                  }

                  var3++;
               }
            }

            rrMP.id_throws("(Reflector) Field not present: " + var1.getName() + ".(type: " + this.id_break + ", index: " + this.id_byte + ")");
            return null;
         } catch (SecurityException var6) {
            var6.printStackTrace();
            return null;
         } catch (Throwable var7) {
            var7.printStackTrace();
            return null;
         }
      }
   }
}
