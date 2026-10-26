package celestial;

import java.lang.reflect.Field;

public class rrxs_3 implements rrJi_1 {
   private rrJa_1 class_ = null;
   private boolean break_ = false;
   private Field byte_ = null;

   public Object byte_() {
      return rrxr_3.class_(null, this);
   }

   public rrxs_3(Field var1) {
      this(new rrJK(var1));
   }

   public rrxs_3(rrJa_1 var1) {
      this.class_ = var1;
      rrxM_2.class_(this);
   }

   public rrxs_3(rrxB_2 var1, String var2) {
      this(new rrJD(var1, var2));
   }

   public rrxs_3(rrxB_2 var1, Class var2) {
      this(var1, var2, 0);
   }

   public rrxs_3(rrxB_2 var1, Class var2, int var3) {
      this(new rrJU(var1, var2, var3));
   }

   public void class_(Object var1, Object var2) {
      rrxr_3.class_(var1, this, var2);
   }

   @Override
   public void class_() {
      Field var1 = this.break_();
   }

   public Object class_(Object var1) {
      return rrxr_3.class_(var1, this);
   }

   public void break_(Object var1) {
      rrxr_3.class_(null, this, var1);
   }

   public Field break_() {
      if (this.break_) {
         return this.byte_;
      } else {
         this.break_ = true;
         this.byte_ = this.class_.class_();
         if (this.byte_ != null) {
            this.byte_.setAccessible(true);
         }

         return this.byte_;
      }
   }

   public boolean protected_() {
      return this.break_() != null;
   }
}
