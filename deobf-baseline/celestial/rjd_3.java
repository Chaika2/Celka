package celestial;

import java.util.BitSet;

public final class rjd_3 extends rjp_3 {
   private final BitSet id_protected;
   private int id_throws;
   private int id_case;
   private int id_catch;
   private int id_private;
   private int id_implements;
   private int id_finally;

   public rjd_3(rjp_3 var1) {
      super(var1.id_class, var1.id_break, var1.id_byte);
      if (var1 instanceof rjd_3) {
         this.id_protected = (BitSet)((rjd_3)var1).id_protected.clone();
      } else {
         this.id_protected = new BitSet(this.id_class * this.id_break * this.id_byte);

         for (int var2 = 0; var2 < this.id_class; var2++) {
            for (int var3 = 0; var3 < this.id_break; var3++) {
               for (int var4 = 0; var4 < this.id_byte; var4++) {
                  if (var1.id_break(var2, var3, var4)) {
                     this.id_protected.set(this.id_class(var2, var3, var4));
                  }
               }
            }
         }
      }

      this.id_throws = var1.id_class(rpB_2.X);
      this.id_case = var1.id_class(rpB_2.Y);
      this.id_catch = var1.id_class(rpB_2.Z);
      this.id_private = var1.id_break(rpB_2.X);
      this.id_implements = var1.id_break(rpB_2.Y);
      this.id_finally = var1.id_break(rpB_2.Z);
   }

   public rjd_3(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3);
      this.id_protected = new BitSet(var1 * var2 * var3);
      this.id_throws = var4;
      this.id_case = var5;
      this.id_catch = var6;
      this.id_private = var7;
      this.id_implements = var8;
      this.id_finally = var9;
   }

   public rjd_3(int var1, int var2, int var3) {
      this(var1, var2, var3, var1, var2, var3, 0, 0, 0);
   }

   static rjd_3 id_class(rjp_3 var0, rjp_3 var1, rjc_3 var2, rjc_3 var3, rjc_3 var4, rjN_2 var5) {
      rjd_3 var6 = new rjd_3(var2.id_class().size() - 1, var3.id_class().size() - 1, var4.id_class().size() - 1);
      int[] var7 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
      var2.id_class((var7x, var8, var9) -> {
         boolean[] var10 = new boolean[]{false};
         boolean var11 = var3.id_class((var10x, var11x, var12) -> {
            boolean[] var13 = new boolean[]{false};
            boolean var14 = var4.id_class((var12x, var13x, var14x) -> {
               boolean var15 = var5.apply(var0.id_byte(var7x, var10x, var12x), var1.id_byte(var8, var11x, var13x));
               if (var15) {
                  var6.id_protected.set(var6.id_class(var9, var12, var14x));
                  var7[2] = Math.min(var7[2], var14x);
                  var7[5] = Math.max(var7[5], var14x);
                  var13[0] = true;
               }

               return true;
            });
            if (var13[0]) {
               var7[1] = Math.min(var7[1], var12);
               var7[4] = Math.max(var7[4], var12);
               var10[0] = true;
            }

            return var14;
         });
         if (var10[0]) {
            var7[0] = Math.min(var7[0], var9);
            var7[3] = Math.max(var7[3], var9);
         }

         return var11;
      });
      var6.id_throws = var7[0];
      var6.id_case = var7[1];
      var6.id_catch = var7[2];
      var6.id_private = var7[3] + 1;
      var6.id_implements = var7[4] + 1;
      var6.id_finally = var7[5] + 1;
      return var6;
   }

   @Override
   protected void id_class(int var1, int var2, int var3, int var4, boolean var5) {
      this.id_protected.set(this.id_class(var3, var4, var1), this.id_class(var3, var4, var2), var5);
   }

   @Override
   protected boolean id_class(int var1, int var2, int var3, int var4) {
      if (var3 < 0 || var4 < 0 || var1 < 0) {
         return false;
      } else {
         return var3 < this.id_class && var4 < this.id_break && var2 <= this.id_byte
            ? this.id_protected.nextClearBit(this.id_class(var3, var4, var1)) >= this.id_class(var3, var4, var2)
            : false;
      }
   }

   protected int id_class(int var1, int var2, int var3) {
      return (var1 * this.id_break + var2) * this.id_byte + var3;
   }

   @Override
   public boolean id_class() {
      return this.id_protected.isEmpty();
   }

   @Override
   public int id_class(rpB_2 var1) {
      return var1.id_class(this.id_throws, this.id_case, this.id_catch);
   }

   @Override
   public void id_class(int var1, int var2, int var3, boolean var4, boolean var5) {
      this.id_protected.set(this.id_class(var1, var2, var3), var5);
      if (var4 && var5) {
         this.id_throws = Math.min(this.id_throws, var1);
         this.id_case = Math.min(this.id_case, var2);
         this.id_catch = Math.min(this.id_catch, var3);
         this.id_private = Math.max(this.id_private, var1 + 1);
         this.id_implements = Math.max(this.id_implements, var2 + 1);
         this.id_finally = Math.max(this.id_finally, var3 + 1);
      }
   }

   @Override
   public int id_break(rpB_2 var1) {
      return var1.id_class(this.id_private, this.id_implements, this.id_finally);
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return this.id_protected.get(this.id_class(var1, var2, var3));
   }
}
