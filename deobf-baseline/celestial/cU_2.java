package celestial;

enum cU_2 {
   ABOVE(0, 0, 28, 32, 8),
   BELOW(84, 0, 28, 32, 8),
   LEFT(0, 64, 32, 28, 5),
   RIGHT(96, 64, 32, 28, 5);

   private final int textureX;
   private final int textureY;
   private final int width;
   private final int height;
   private final int max;

   private cU_2(int var3, int var4, int var5, int var6, int var7) {
      this.textureX = var3;
      this.textureY = var4;
      this.width = var5;
      this.height = var6;
      this.max = var7;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int id_class(int var1) {
      switch (this) {
         case ABOVE:
            return (this.width + 4) * var1;
         case BELOW:
            return (this.width + 4) * var1;
         case LEFT:
            return -this.width + 4;
         case RIGHT:
            return 248;
         default:
            throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
      }
   }

   public boolean id_class(int var1, int var2, int var3, double var4, double var6) {
      int var8 = var1 + this.id_class(var3);
      int var9 = var2 + this.id_break(var3);
      return var4 > (double)var8 && var4 < (double)(var8 + this.width) && var6 > (double)var9 && var6 < (double)(var9 + this.height);
   }

   public void id_class(int var1, int var2, int var3, Hz_1 var4, rdn_3 var5) {
      int var6 = var1 + this.id_class(var3);
      int var7 = var2 + this.id_break(var3);
      switch (this) {
         case ABOVE:
            var6 += 6;
            var7 += 9;
            break;
         case BELOW:
            var6 += 6;
            var7 += 6;
            break;
         case LEFT:
            var6 += 10;
            var7 += 5;
            break;
         case RIGHT:
            var6 += 6;
            var7 += 5;
      }

      var4.id_break(var5, var6, var7);
   }

   public void id_class(Ml_1 var1, ch_3 var2, int var3, int var4, boolean var5, int var6) {
      int var7 = this.textureX;
      if (var6 > 0) {
         var7 += this.width;
      }

      if (var6 == this.max - 1) {
         var7 += this.width;
      }

      int var8 = var5 ? this.textureY + this.height : this.textureY;
      var2.id_break(var1, var3 + this.id_class(var6), var4 + this.id_break(var6), var7, var8, this.width, this.height);
   }

   public int id_class() {
      return this.max;
   }

   public int id_break(int var1) {
      switch (this) {
         case ABOVE:
            return -this.height + 4;
         case BELOW:
            return 136;
         case LEFT:
            return this.height * var1;
         case RIGHT:
            return this.height * var1;
         default:
            throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
      }
   }
}
