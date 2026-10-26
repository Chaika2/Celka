package celestial;

public class rLH {
   private rLq_1[] id_class = new rLq_1[128];
   private int id_break;

   public boolean id_byte() {
      return this.id_break == 0;
   }

   public void id_class(rLq_1 var1, float var2) {
      float var3 = var1.id_catch;
      var1.id_catch = var2;
      if (var2 < var3) {
         this.id_class(var1.id_protected);
      } else {
         this.id_break(var1.id_protected);
      }
   }

   private void id_class(int var1) {
      rLq_1 var2 = this.id_class[var1];
      float var4 = var2.id_catch;

      while (var1 > 0) {
         int var3 = var1 - 1 >> 1;
         rLq_1 var5 = this.id_class[var3];
         if (!(var4 < var5.id_catch)) {
            break;
         }

         this.id_class[var1] = var5;
         var5.id_protected = var1;
         var1 = var3;
      }

      this.id_class[var1] = var2;
      var2.id_protected = var1;
   }

   public rLq_1 id_class(rLq_1 var1) {
      if (var1.id_protected >= 0) {
         throw new IllegalStateException("OW KNOWS!");
      } else {
         if (this.id_break == this.id_class.length) {
            rLq_1[] var2 = new rLq_1[this.id_break << 1];
            System.arraycopy(this.id_class, 0, var2, 0, this.id_break);
            this.id_class = var2;
         }

         this.id_class[this.id_break] = var1;
         var1.id_protected = this.id_break;
         this.id_class(this.id_break++);
         return var1;
      }
   }

   public void id_class() {
      this.id_break = 0;
   }

   private void id_break(int var1) {
      rLq_1 var2 = this.id_class[var1];
      float var3 = var2.id_catch;

      while (true) {
         int var4 = 1 + (var1 << 1);
         int var5 = var4 + 1;
         if (var4 >= this.id_break) {
            break;
         }

         rLq_1 var6 = this.id_class[var4];
         float var7 = var6.id_catch;
         rLq_1 var8;
         float var9;
         if (var5 >= this.id_break) {
            var8 = null;
            var9 = Float.POSITIVE_INFINITY;
         } else {
            var8 = this.id_class[var5];
            var9 = var8.id_catch;
         }

         if (var7 < var9) {
            if (!(var7 < var3)) {
               break;
            }

            this.id_class[var1] = var6;
            var6.id_protected = var1;
            var1 = var4;
         } else {
            if (!(var9 < var3)) {
               break;
            }

            this.id_class[var1] = var8;
            var8.id_protected = var1;
            var1 = var5;
         }
      }

      this.id_class[var1] = var2;
      var2.id_protected = var1;
   }

   public rLq_1 id_break() {
      rLq_1 var1 = this.id_class[0];
      this.id_class[0] = this.id_class[--this.id_break];
      this.id_class[this.id_break] = null;
      if (this.id_break > 0) {
         this.id_break(0);
      }

      var1.id_protected = -1;
      return var1;
   }
}
