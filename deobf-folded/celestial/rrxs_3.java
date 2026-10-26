package celestial;

import java.lang.reflect.Field;

public class rrxs_3 implements rrJi_1 {
   private rrJa_1 id_class = null;
   private boolean id_break = false;
   private Field id_byte = null;

   public Object id_byte() {
      return rrxr_3.id_class(null, this);
   }

   public rrxs_3(Field var1) {
      this(new rrJK(var1));
   }

   public rrxs_3(rrJa_1 var1) {
      this.id_class = var1;
      rrxM_2.id_class(this);
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

   public void id_class(Object var1, Object var2) {
      rrxr_3.id_class(var1, this, var2);
   }

   @Override
   public void id_class() {
      Field var1 = this.id_break();
   }

   public Object id_class(Object var1) {
      return rrxr_3.id_class(var1, this);
   }

   public void id_break(Object var1) {
      rrxr_3.id_class(null, this, var1);
   }

   public Field id_break() {
      if (this.id_break) {
         return this.id_byte;
      } else {
         this.id_break = true;
         this.id_byte = this.id_class.id_class();
         if (this.id_byte != null) {
            this.id_byte.setAccessible(true);
         }

         return this.id_byte;
      }
   }

   public boolean id_protected() {
      return this.id_break() != null;
   }
}
