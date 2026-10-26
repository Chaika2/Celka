package celestial;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class rrxG_2 implements rrJi_1 {
   private rrxB_2 class_ = null;
   private String break_ = null;
   private Class[] byte_ = null;
   private boolean protected_ = false;
   private Method throws_ = null;

   public boolean byte_() {
      return this.protected_ ? this.throws_ != null : this.break_() != null;
   }

   public int byte_(Object var1) {
      return rrxr_3.byte_(this, var1);
   }

   public int byte_(Object... var1) {
      return rrxr_3.byte_(this, var1);
   }

   public rrxG_2(rrxB_2 var1, String var2) {
      this(var1, var2, (Class[])null);
   }

   public rrxG_2(rrxB_2 var1, String var2, Class[] var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      rrxM_2.class_(this);
   }

   public static Method class_(Class var0, String var1, Class[] var2) {
      Method[] var3 = var0.getDeclaredMethods();

      for (int var4 = 0; var4 < var3.length; var4++) {
         Method var5 = var3[var4];
         if (var5.getName().equals(var1)) {
            Class[] var6 = var5.getParameterTypes();
            if (rrxr_3.class_(var2, var6)) {
               return var5;
            }
         }
      }

      return null;
   }

   @Override
   public void class_() {
      Method var1 = this.break_();
   }

   public Object class_(Object var1) {
      return rrxr_3.private_(this, var1);
   }

   public static Method[] class_(Class var0, String var1) {
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

   public Object class_(Object... var1) {
      return rrxr_3.private_(this, var1);
   }

   public boolean break_(Object var1) {
      return rrxr_3.break_(this, var1);
   }

   public Method break_() {
      if (this.protected_) {
         return this.throws_;
      } else {
         this.protected_ = true;
         Class var1 = this.class_.break_();
         if (var1 == null) {
            return null;
         } else {
            try {
               if (this.byte_ == null) {
                  Method[] var2 = class_(var1, this.break_);
                  if (var2.length <= 0) {
                     rrMP.throws_("(Reflector) Method not present: " + var1.getName() + "." + this.break_);
                     return null;
                  }

                  if (var2.length > 1) {
                     rrMP.byte_("(Reflector) More than one method found: " + var1.getName() + "." + this.break_);

                     for (int var3 = 0; var3 < var2.length; var3++) {
                        Method var4 = var2[var3];
                        rrMP.byte_("(Reflector)  - " + var4);
                     }

                     return null;
                  }

                  this.throws_ = var2[0];
               } else {
                  this.throws_ = class_(var1, this.break_, this.byte_);
               }

               if (this.throws_ == null) {
                  rrMP.throws_("(Reflector) Method not present: " + var1.getName() + "." + this.break_);
                  return null;
               } else {
                  this.throws_.setAccessible(true);
                  return this.throws_;
               }
            } catch (Throwable var5) {
               var5.printStackTrace();
               return null;
            }
         }
      }
   }

   public boolean break_(Object... var1) {
      return rrxr_3.break_(this, var1);
   }

   public double throws_(Object var1) {
      return rrxr_3.case_(this, var1);
   }

   public void throws_() {
      this.protected_ = true;
      this.throws_ = null;
   }

   public double throws_(Object... var1) {
      return rrxr_3.case_(this, var1);
   }

   public void catch_(Object... var1) {
      rrxr_3.class_(this, var1);
   }

   public String case_(Object... var1) {
      return rrxr_3.catch_(this, var1);
   }

   public String case_(Object var1) {
      return rrxr_3.catch_(this, var1);
   }

   public float protected_(Object... var1) {
      return rrxr_3.throws_(this, var1);
   }

   public Class protected_() {
      Method var1 = this.break_();
      return var1 == null ? null : var1.getReturnType();
   }

   public float protected_(Object var1) {
      return rrxr_3.throws_(this, var1);
   }
}
