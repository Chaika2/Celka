package celestial;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GS extends Ev_1 {
   private static double[] id_super;
   private static short[] id_this;
   private static byte[] id_else;
   private static boolean[] id_synchronized;
   public Object[] id_continue;

   @Override
   public EA id_byte(EA var1) {
      this.id_super();
      super.id_byte(var1);
      if (var1.id_byte() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]) {
         return var1;
      } else if (((Ps_1)this.id_new[1]).id_volatile().equals((rU_2)this.id_new[4])) {
         return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
      } else if (!this.id_extends()) {
         return var1.id_class((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
      } else {
         double var2 = ((Ps_1)this.id_new[1]).id_catch().Ps().id_break - ((double)((rU_2)this.id_new[4]).b_() + 0.5);
         double var4 = ((Ps_1)this.id_new[1]).id_catch().Ps().id_protected - ((double)((rU_2)this.id_new[4]).d_() + 0.5);
         double var6 = Math.sqrt(var2 * var2 + var4 * var4);
         int var10002 = (Integer)this.id_continue[0];
         Integer var12 = var10002 + 1;
         this.id_continue[0] = var12;
         if (var10002 < 10 && var6 < 0.2) {
            return var1;
         } else {
            EF.id_class((Ps_1)this.id_new[1], var1, ((rU_2[])this.id_new[5])[0]);
            return var1;
         }
      }
   }

   private static void id_int() {
      id_synchronized = new boolean[]{true, false, false, false, true, true, true, false, true, false, true, false, false};
   }

   public GS(C_case var1, rU_2 var2, rU_2 var3) {
      super(var1, var2, var3, new rU_2[]{var3});
      this.id_super();
      Integer var8 = 0;
      this.id_continue[0] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class() {
      this.id_super();
      super.id_class();
      Integer var5 = 0;
      this.id_continue[0] = var5;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6446363898700991857L;
   }

   @Override
   public double id_class(EZ var1) {
      return id_protected(
         var1, (Integer)((rU_2)this.id_new[3]).id_break[0], (Integer)((rU_2)this.id_new[3]).id_break[1], (Integer)((rU_2)this.id_new[3]).id_break[2]
      );
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1460893017;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-94, 3, 32, -117, 38, 101, 23, -116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_super = new double[]{1000000.0, 1000000.0, 6.666666666666667, 0.5, 0.5, 0.2};
   }

   private static void id_new() {
      id_else = new byte[]{2, 10};
   }

   private static void id_package() {
      id_this = new short[]{0, 0, 3, 0, 3, 1, 3, 2, 3, 4, 20, 2, 1, 4, 3, 4, 1, 4, 1, 4, 0, 0, 1, 5};
   }

   private void id_super() {
      if (this.id_continue == null) {
         this.id_continue = new Object[1];
         Object[] var1 = this.id_continue;
         var1[0] = 0;
      }
   }

   public static double id_protected(EZ var0, int var1, int var2, int var3) {
      if (!(Boolean)var0.id_break[20]) {
         return 1000000.0;
      } else if (!EF.id_class(var0, var1, var2 - 2, var3)) {
         return 1000000.0;
      } else {
         xc_3 var4 = var0.id_class(var1, var2 - 1, var3);
         xd_3 var5 = var4.id_break();
         return var5 != xu_3.PJ && var5 != xu_3.BD ? id_package[1] + EF.id_class(var0, var1, var2 - 1, var3, var4, false) : id_super[2];
      }
   }

   @Override
   public Set<rU_2> id_native() {
      return ImmutableSet.of((rU_2)this.id_new[3], (rU_2)this.id_new[4]);
   }
}
