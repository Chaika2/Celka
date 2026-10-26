package celestial;

public class rrkf_1 implements rrkY {
   private int id_class;
   private boolean id_break;

   public rrkf_1(int var1, boolean var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public String toString() {
      return "BlenderSplit: " + this.id_class + ", " + this.id_break;
   }

   @Override
   public int id_class(int var1, int var2, int var3, int var4) {
      if (var1 == var2 && var2 == var3 && var3 == var4) {
         return var1;
      } else {
         boolean var5 = var1 < this.id_class;
         boolean var6 = var2 < this.id_class;
         boolean var7 = var3 < this.id_class;
         boolean var8 = var4 < this.id_class;
         if (var5 == var6 && var6 == var7 && var7 == var8) {
            return !var5 && this.id_break ? var1 : (var1 + var2 + var3 + var4) / 4;
         } else {
            rrWH var9 = new rrWH(4);
            rrWH var10 = new rrWH(4);
            this.id_class(var1, var9, var10);
            this.id_class(var2, var9, var10);
            this.id_class(var3, var9, var10);
            this.id_class(var4, var9, var10);
            if (var10.id_protected() > var9.id_protected()) {
               return this.id_break ? var10.id_byte(0) : this.id_class(var10);
            } else {
               return this.id_class(var9);
            }
         }
      }
   }

   private int id_class(rrWH var1) {
      int var2 = var1.id_byte();
      switch (var2) {
         case 2:
            return (var1.id_byte(0) + var1.id_byte(1)) / 2;
         case 3:
            return (var1.id_byte(0) + var1.id_byte(1) + var1.id_byte(2)) / 3;
         default:
            int var3 = 0;

            for (int var4 = 0; var4 < var2; var4++) {
               var3 += var1.id_byte(var4);
            }

            return var3 / var2;
      }
   }

   private void id_class(int var1, rrWH var2, rrWH var3) {
      if (var1 < this.id_class) {
         var2.id_class(var1);
      } else {
         var3.id_class(var1);
      }
   }
}
