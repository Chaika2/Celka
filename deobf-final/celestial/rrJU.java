package celestial;

import java.lang.reflect.Field;

public class rrJU implements rrJa_1 {
   private rrxB_2 class_ = null;
   private Class break_ = null;
   private int byte_;

   public rrJU(rrxB_2 var1, Class var2) {
      this(var1, var2, 0);
   }

   public rrJU(rrxB_2 var1, Class var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public Field class_() {
      Class var1 = this.class_.break_();
      if (var1 == null) {
         return null;
      } else {
         try {
            Field[] var2 = var1.getDeclaredFields();
            int var3 = 0;

            for (int var4 = 0; var4 < var2.length; var4++) {
               Field var5 = var2[var4];
               if (var5.getType() == this.break_) {
                  if (var3 == this.byte_) {
                     var5.setAccessible(true);
                     return var5;
                  }

                  var3++;
               }
            }

            rrMP.throws_("(Reflector) Field not present: " + var1.getName() + ".(type: " + this.break_ + ", index: " + this.byte_ + ")");
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
