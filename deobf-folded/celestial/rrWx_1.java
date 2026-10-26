package celestial;

public class rrWx_1 {
   private Object[] id_class;
   private int id_break = 0;

   public rrWx_1(Object var1, Object var2, Object var3, Object var4) {
      this(new Object[]{var1, var2, var3, var4});
   }

   public rrWx_1(Object var1, Object var2, Object var3) {
      this(new Object[]{var1, var2, var3});
   }

   public rrWx_1(Object var1, Object var2) {
      this(new Object[]{var1, var2});
   }

   public rrWx_1(Object[] var1) {
      this.id_class = (Object[])var1.clone();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 == this) {
         return true;
      } else if (!(var1 instanceof rrWx_1 var2)) {
         return false;
      } else {
         Object[] var3 = var2.id_break();
         if (var3.length != this.id_class.length) {
            return false;
         } else {
            for (int var4 = 0; var4 < this.id_class.length; var4++) {
               if (!id_class(this.id_class[var4], var3[var4])) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   @Override
   public String toString() {
      return "[" + rrbb_3.id_class(this.id_class) + "]";
   }

   @Override
   public int hashCode() {
      if (this.id_break == 0) {
         this.id_break = 7;

         for (int var1 = 0; var1 < this.id_class.length; var1++) {
            Object var2 = this.id_class[var1];
            if (var2 != null) {
               this.id_break = 31 * this.id_break + var2.hashCode();
            }
         }
      }

      return this.id_break;
   }

   private static boolean id_class(Object var0, Object var1) {
      if (var0 == var1) {
         return true;
      } else if (var0 == null) {
         return false;
      } else {
         return var1 == null ? false : var0.equals(var1);
      }
   }

   public Object[] id_class() {
      return (Object[])this.id_class.clone();
   }

   private Object[] id_break() {
      return this.id_class;
   }
}
