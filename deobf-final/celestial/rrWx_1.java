package celestial;

public class rrWx_1 {
   private Object[] class_;
   private int break_ = 0;

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
      this.class_ = (Object[])var1.clone();
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
         Object[] var3 = var2.break_();
         if (var3.length != this.class_.length) {
            return false;
         } else {
            for (int var4 = 0; var4 < this.class_.length; var4++) {
               if (!class_(this.class_[var4], var3[var4])) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   @Override
   public String toString() {
      return "[" + rrbb_3.class_(this.class_) + "]";
   }

   @Override
   public int hashCode() {
      if (this.break_ == 0) {
         this.break_ = 7;

         for (int var1 = 0; var1 < this.class_.length; var1++) {
            Object var2 = this.class_[var1];
            if (var2 != null) {
               this.break_ = 31 * this.break_ + var2.hashCode();
            }
         }
      }

      return this.break_;
   }

   private static boolean class_(Object var0, Object var1) {
      if (var0 == var1) {
         return true;
      } else if (var0 == null) {
         return false;
      } else {
         return var1 == null ? false : var0.equals(var1);
      }
   }

   public Object[] class_() {
      return (Object[])this.class_.clone();
   }

   private Object[] break_() {
      return this.class_;
   }
}
