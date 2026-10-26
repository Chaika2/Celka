package celestial;

import java.lang.reflect.Field;

public class rrJD implements rrJa_1 {
   private rrxB_2 id_class = null;
   private String id_break = null;

   public rrJD(rrxB_2 var1, String var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public Field id_class() {
      Class var1 = this.id_class.id_break();
      if (var1 == null) {
         return null;
      } else {
         try {
            Field var2 = this.id_class(var1, this.id_break);
            var2.setAccessible(true);
            return var2;
         } catch (NoSuchFieldException var3) {
            rrMP.id_throws("(Reflector) Field not present: " + var1.getName() + "." + this.id_break);
            return null;
         } catch (SecurityException var4) {
            var4.printStackTrace();
            return null;
         } catch (Throwable var5) {
            var5.printStackTrace();
            return null;
         }
      }
   }

   private Field id_class(Class var1, String var2) throws NoSuchFieldException {
      Field[] var3 = var1.getDeclaredFields();

      for (int var4 = 0; var4 < var3.length; var4++) {
         Field var5 = var3[var4];
         if (var5.getName().equals(var2)) {
            return var5;
         }
      }

      if (var1 == Object.class) {
         throw new NoSuchFieldException(var2);
      } else {
         return this.id_class(var1.getSuperclass(), var2);
      }
   }
}
