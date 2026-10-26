package celestial;

import java.lang.reflect.Constructor;

public class rrxS_2 implements rrJi_1 {
   private rrxB_2 id_class = null;
   private Class[] id_break = null;
   private boolean id_byte = false;
   private Constructor id_protected = null;

   public boolean id_byte() {
      return this.id_byte ? this.id_protected != null : this.id_break() != null;
   }

   public rrxS_2(rrxB_2 var1, Class[] var2) {
      this.id_class = var1;
      this.id_break = var2;
      rrxM_2.id_class(this);
   }

   public Object id_class(Object... var1) {
      return rrxr_3.id_class(this, var1);
   }

   @Override
   public void id_class() {
      Constructor var1 = this.id_break();
   }

   private static Constructor id_class(Class var0, Class[] var1) {
      Constructor[] var2 = var0.getDeclaredConstructors();

      for (int var3 = 0; var3 < var2.length; var3++) {
         Constructor var4 = var2[var3];
         Class[] var5 = var4.getParameterTypes();
         if (rrxr_3.id_class(var1, var5)) {
            return var4;
         }
      }

      return null;
   }

   public Constructor id_break() {
      if (this.id_byte) {
         return this.id_protected;
      } else {
         this.id_byte = true;
         Class var1 = this.id_class.id_break();
         if (var1 == null) {
            return null;
         } else {
            try {
               this.id_protected = id_class(var1, this.id_break);
               if (this.id_protected == null) {
                  rrMP.id_break("(Reflector) Constructor not present: " + var1.getName() + ", params: " + rrki_1.id_class(this.id_break));
               }

               if (this.id_protected != null) {
                  this.id_protected.setAccessible(true);
               }
            } catch (Throwable var3) {
               var3.printStackTrace();
            }

            return this.id_protected;
         }
      }
   }

   public void id_protected() {
      this.id_byte = true;
      this.id_protected = null;
   }
}
