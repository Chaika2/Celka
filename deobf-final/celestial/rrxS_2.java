package celestial;

import java.lang.reflect.Constructor;

public class rrxS_2 implements rrJi_1 {
   private rrxB_2 class_ = null;
   private Class[] break_ = null;
   private boolean byte_ = false;
   private Constructor protected_ = null;

   public boolean byte_() {
      return this.byte_ ? this.protected_ != null : this.break_() != null;
   }

   public rrxS_2(rrxB_2 var1, Class[] var2) {
      this.class_ = var1;
      this.break_ = var2;
      rrxM_2.class_(this);
   }

   public Object class_(Object... var1) {
      return rrxr_3.class_(this, var1);
   }

   @Override
   public void class_() {
      Constructor var1 = this.break_();
   }

   private static Constructor class_(Class var0, Class[] var1) {
      Constructor[] var2 = var0.getDeclaredConstructors();

      for (int var3 = 0; var3 < var2.length; var3++) {
         Constructor var4 = var2[var3];
         Class[] var5 = var4.getParameterTypes();
         if (rrxr_3.class_(var1, var5)) {
            return var4;
         }
      }

      return null;
   }

   public Constructor break_() {
      if (this.byte_) {
         return this.protected_;
      } else {
         this.byte_ = true;
         Class var1 = this.class_.break_();
         if (var1 == null) {
            return null;
         } else {
            try {
               this.protected_ = class_(var1, this.break_);
               if (this.protected_ == null) {
                  rrMP.break_("(Reflector) Constructor not present: " + var1.getName() + ", params: " + rrki_1.class_(this.break_));
               }

               if (this.protected_ != null) {
                  this.protected_.setAccessible(true);
               }
            } catch (Throwable var3) {
               var3.printStackTrace();
            }

            return this.protected_;
         }
      }
   }

   public void protected_() {
      this.byte_ = true;
      this.protected_ = null;
   }
}
