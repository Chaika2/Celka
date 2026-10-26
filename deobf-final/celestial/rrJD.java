package celestial;

import java.lang.reflect.Field;

public class rrJD implements rrJa_1 {
   private rrxB_2 class_ = null;
   private String break_ = null;

   public rrJD(rrxB_2 var1, String var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public Field class_() {
      Class var1 = this.class_.break_();
      if (var1 == null) {
         return null;
      } else {
         try {
            Field var2 = this.class_(var1, this.break_);
            var2.setAccessible(true);
            return var2;
         } catch (NoSuchFieldException var3) {
            rrMP.throws_("(Reflector) Field not present: " + var1.getName() + "." + this.break_);
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

   private Field class_(Class var1, String var2) throws NoSuchFieldException {
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
         return this.class_(var1.getSuperclass(), var2);
      }
   }
}
