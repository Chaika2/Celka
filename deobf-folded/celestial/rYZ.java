package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rYZ implements rYn_1 {
   private static final Logger id_protected = LogManager.getLogger();
   private static final int id_throws = (int)Math.round(Math.log(16.0) / Math.log(2.0)) - 2;
   private static final int id_case = (int)Math.round(Math.log(256.0) / Math.log(2.0)) - 2;
   public static final int id_class = 1 << id_throws + id_throws + id_case;
   public static final int id_break = (1 << id_throws) - 1;
   public static final int id_byte = (1 << id_case) - 1;
   private final rpn_3<rYG> id_catch;
   private final rYG[] id_private;

   public rYZ(rpn_3<rYG> var1, rfj_3 var2, rYY var3, int[] var4) {
      this(var1);
      int var5 = var2.id_break() >> 2;
      int var6 = var2.id_byte() >> 2;
      if (var4 != null) {
         for (int var7 = 0; var7 < var4.length; var7++) {
            this.id_private[var7] = (rYG)var1.id_class(var4[var7]);
            if (this.id_private[var7] == null) {
               int var8 = var7 & id_break;
               int var9 = var7 >> id_throws + id_throws & id_byte;
               int var10 = var7 >> id_throws & id_break;
               this.id_private[var7] = var3.id_protected(var5 + var8, var9, var6 + var10);
            }
         }
      } else {
         for (int var11 = 0; var11 < this.id_private.length; var11++) {
            int var12 = var11 & id_break;
            int var13 = var11 >> id_throws + id_throws & id_byte;
            int var14 = var11 >> id_throws & id_break;
            this.id_private[var11] = var3.id_protected(var5 + var12, var13, var6 + var14);
         }
      }
   }

   public rYZ(rpn_3<rYG> var1, rfj_3 var2, rYY var3) {
      this(var1);
      int var4 = var2.id_break() >> 2;
      int var5 = var2.id_byte() >> 2;

      for (int var6 = 0; var6 < this.id_private.length; var6++) {
         int var7 = var6 & id_break;
         int var8 = var6 >> id_throws + id_throws & id_byte;
         int var9 = var6 >> id_throws & id_break;
         this.id_private[var6] = var3.id_protected(var4 + var7, var8, var5 + var9);
      }
   }

   public rYZ(rpn_3<rYG> var1, int[] var2) {
      this(var1);

      for (int var3 = 0; var3 < this.id_private.length; var3++) {
         int var4 = var2[var3];
         rYG var5 = (rYG)var1.id_class(var4);
         if (var5 == null) {
            id_protected.warn("Received invalid biome id: " + var4);
            this.id_private[var3] = (rYG)var1.id_class(0);
         } else {
            this.id_private[var3] = var5;
         }
      }
   }

   private rYZ(rpn_3<rYG> var1) {
      this(var1, new rYG[id_class]);
   }

   public rYZ(rpn_3<rYG> var1, rYG[] var2) {
      this.id_catch = var1;
      this.id_private = var2;
   }

   public int[] id_class() {
      int[] var1 = new int[this.id_private.length];

      for (int var2 = 0; var2 < this.id_private.length; var2++) {
         var1[var2] = this.id_catch.id_class(this.id_private[var2]);
      }

      return var1;
   }

   @Override
   public rYG id_protected(int var1, int var2, int var3) {
      int var4 = var1 & id_break;
      int var5 = rfU_2.id_class(var2, 0, id_byte);
      int var6 = var3 & id_break;
      return this.id_private[var5 << id_throws + id_throws | var6 << id_throws | var4];
   }
}
