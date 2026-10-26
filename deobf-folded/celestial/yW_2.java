package celestial;

public class yW_2 implements rRp_1 {
   protected final int id_class;
   protected final int id_break;
   protected final rfH_2 id_byte;
   protected final int id_protected;
   protected final int id_throws;
   protected final int id_case;
   protected final roJ_2[][] id_catch;
   protected final xc_3[] id_private;
   protected final rXE[] id_implements;
   protected final rYB id_finally;

   @Override
   public xc_3 id_byte(rfH_2 var1) {
      int var2 = (var1.b_() >> 4) - this.id_class;
      int var3 = (var1.d_() >> 4) - this.id_break;
      return this.id_catch[var2][var3].id_byte(var1);
   }

   public yW_2(rYB var1, int var2, int var3, roJ_2[][] var4, rfH_2 var5, rfH_2 var6) {
      this.id_finally = var1;
      this.id_class = var2;
      this.id_break = var3;
      this.id_catch = var4;
      this.id_byte = var5;
      this.id_protected = var6.b_() - var5.b_() + 1;
      this.id_throws = var6.c_() - var5.c_() + 1;
      this.id_case = var6.d_() - var5.d_() + 1;
      this.id_private = null;
      this.id_implements = null;
   }

   @Override
   public rrse_3 id_class() {
      return this.id_finally.id_class();
   }

   @Override
   public float id_class(rpr_3 var1, boolean var2) {
      return this.id_finally.id_class(var1, var2);
   }

   public roJ_2 id_class(int var1, int var2) {
      return this.id_catch[var1][var2];
   }

   @Override
   public ryO_2 id_class(rfH_2 var1) {
      return this.id_class(var1, rox_3.IMMEDIATE);
   }

   public ryO_2 id_class(rfH_2 var1, rox_3 var2) {
      int var3 = (var1.b_() >> 4) - this.id_class;
      int var4 = (var1.d_() >> 4) - this.id_break;
      return this.id_catch[var3][var4].id_class(var1, var2);
   }

   @Override
   public int id_class(rfH_2 var1, rrsC_2 var2) {
      return this.id_finally.id_class(var1, var2);
   }

   public static yW_2 id_class(rYB var0, rfH_2 var1, rfH_2 var2, int var3) {
      return id_class(var0, var1, var2, var3, true);
   }

   public static yW_2 id_class(rYB var0, rfH_2 var1, rfH_2 var2, int var3, boolean var4) {
      int var5 = var1.b_() - var3 >> 4;
      int var6 = var1.d_() - var3 >> 4;
      int var7 = var2.b_() + var3 >> 4;
      int var8 = var2.d_() + var3 >> 4;
      roJ_2[][] var9 = new roJ_2[var7 - var5 + 1][var8 - var6 + 1];

      for (int var10 = var5; var10 <= var7; var10++) {
         for (int var11 = var6; var11 <= var8; var11++) {
            var9[var10 - var5][var11 - var6] = var0.id_throws(var10, var11);
         }
      }

      if (var4 && id_class(var1, var2, var5, var6, var9)) {
         return null;
      } else {
         boolean var13 = true;
         rfH_2 var14 = var1.id_break(-1, -1, -1);
         rfH_2 var12 = var2.id_break(1, 1, 1);
         return new yW_2(var0, var5, var6, var9, var14, var12);
      }
   }

   public static boolean id_class(rfH_2 var0, rfH_2 var1, int var2, int var3, roJ_2[][] var4) {
      for (int var5 = var0.b_() >> 4; var5 <= var1.b_() >> 4; var5++) {
         for (int var6 = var0.d_() >> 4; var6 <= var1.d_() >> 4; var6++) {
            roJ_2 var7 = var4[var5 - var2][var6 - var3];
            if (!var7.id_class(var0.c_(), var1.c_())) {
               return false;
            }
         }
      }

      return true;
   }

   protected int id_class(int var1, int var2, int var3) {
      int var4 = var1 - this.id_byte.b_();
      int var5 = var2 - this.id_byte.c_();
      int var6 = var3 - this.id_byte.d_();
      return var6 * this.id_protected * this.id_throws + var5 * this.id_protected + var4;
   }

   @Override
   public rXE id_break(rfH_2 var1) {
      int var2 = (var1.b_() >> 4) - this.id_class;
      int var3 = (var1.d_() >> 4) - this.id_break;
      return this.id_catch[var2][var3].id_break(var1);
   }

   public rYG id_throws(rfH_2 var1) {
      return this.id_finally.id_implements(var1);
   }

   protected final int id_protected(rfH_2 var1) {
      return this.id_class(var1.b_(), var1.c_(), var1.d_());
   }
}
