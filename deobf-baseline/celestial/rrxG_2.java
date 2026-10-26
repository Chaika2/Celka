package celestial;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class rrxG_2 implements rrJi_1 {
   private rrxB_2 id_class = null;
   private String id_break = null;
   private Class[] id_byte = null;
   private boolean id_protected = false;
   private Method id_throws = null;

   public boolean id_byte() {
      return this.id_protected ? this.id_throws != null : this.id_break() != null;
   }

   public int id_byte(Object var1) {
      return rrxr_3.id_byte(this, var1);
   }

   public int id_byte(Object... var1) {
      return rrxr_3.id_byte(this, var1);
   }

   public rrxG_2(rrxB_2 var1, String var2) {
      this(var1, var2, (Class[])null);
   }

   public rrxG_2(rrxB_2 var1, String var2, Class[] var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      rrxM_2.id_class(this);
   }

   public static Method id_class(Class var0, String var1, Class[] var2) {
      Method[] var3 = var0.getDeclaredMethods();

      for (int var4 = 0; var4 < var3.length; var4++) {
         Method var5 = var3[var4];
         if (var5.getName().equals(var1)) {
            Class[] var6 = var5.getParameterTypes();
            if (rrxr_3.id_class(var2, var6)) {
               return var5;
            }
         }
      }

      return null;
   }

   @Override
   public void id_class() {
      Method var1 = this.id_break();
   }

   public Object id_class(Object var1) {
      return rrxr_3.id_private(this, var1);
   }

   public static Method[] id_class(Class var0, String var1) {
      ArrayList var2 = new ArrayList();
      Method[] var3 = var0.getDeclaredMethods();

      for (int var4 = 0; var4 < var3.length; var4++) {
         Method var5 = var3[var4];
         if (var5.getName().equals(var1)) {
            var2.add(var5);
         }
      }

      return var2.toArray(new Method[var2.size()]);
   }

   public Object id_class(Object... var1) {
      return rrxr_3.id_private(this, var1);
   }

   public boolean id_break(Object var1) {
      return rrxr_3.id_break(this, var1);
   }

   public Method id_break() {
      if (this.id_protected) {
         return this.id_throws;
      } else {
         this.id_protected = true;
         Class var1 = this.id_class.id_break();
         if (var1 == null) {
            return null;
         } else {
            try {
               if (this.id_byte == null) {
                  Method[] var2 = id_class(var1, this.id_break);
                  if (var2.length <= 0) {
                     rrMP.id_throws("(Reflector) Method not present: " + var1.getName() + "." + this.id_break);
                     return null;
                  }

                  if (var2.length > 1) {
                     rrMP.id_byte("(Reflector) More than one method found: " + var1.getName() + "." + this.id_break);

                     for (int var3 = 0; var3 < var2.length; var3++) {
                        Method var4 = var2[var3];
                        rrMP.id_byte("(Reflector)  - " + var4);
                     }

                     return null;
                  }

                  this.id_throws = var2[0];
               } else {
                  this.id_throws = id_class(var1, this.id_break, this.id_byte);
               }

               if (this.id_throws == null) {
                  rrMP.id_throws("(Reflector) Method not present: " + var1.getName() + "." + this.id_break);
                  return null;
               } else {
                  this.id_throws.setAccessible(true);
                  return this.id_throws;
               }
            } catch (Throwable var5) {
               var5.printStackTrace();
               return null;
            }
         }
      }
   }

   public boolean id_break(Object... var1) {
      return rrxr_3.id_break(this, var1);
   }

   public double id_throws(Object var1) {
      return rrxr_3.id_case(this, var1);
   }

   public void id_throws() {
      this.id_protected = true;
      this.id_throws = null;
   }

   public double id_throws(Object... var1) {
      return rrxr_3.id_case(this, var1);
   }

   public void id_catch(Object... var1) {
      rrxr_3.id_class(this, var1);
   }

   public String id_case(Object... var1) {
      return rrxr_3.id_catch(this, var1);
   }

   public String id_case(Object var1) {
      return rrxr_3.id_catch(this, var1);
   }

   public float id_protected(Object... var1) {
      return rrxr_3.id_throws(this, var1);
   }

   public Class id_protected() {
      Method var1 = this.id_break();
      return var1 == null ? null : var1.getReturnType();
   }

   public float id_protected(Object var1) {
      return rrxr_3.id_throws(this, var1);
   }
}
