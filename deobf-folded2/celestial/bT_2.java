package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bT_2 implements PP {
   private static short[] id_throws;
   private static boolean[] id_case;
   public static Object[] id_class;
   public Object[] id_break;
   private static byte[] id_catch;

   private void id_byte() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         Object[] var1 = this.id_break;
         var1[1] = false;
         var1[2] = 0;
      }
   }

   public bT_2(Ps_1 var1) {
      this.id_byte();
      Integer var6 = 0;
      this.id_break[2] = var6;
      this.id_break[0] = var1;
   }

   static {
      ntfClinit();
   }

   public void id_class(int var1) {
      Integer var6 = var1;
      this.id_break[2] = var6;
   }

   public void id_class(boolean var1) {
      if ((Integer)this.id_break[2] > 0) {
         Integer var8 = (Integer)this.id_break[2] - 1;
         this.id_break[2] = var8;
      } else {
         rjG_2 var2 = ((Ps_1)this.id_break[0]).id_byte();
         boolean var3 = var2 != null && var2.id_byte() == rjM_2.BLOCK ? true : id_case[5];
         if (var1 && var3) {
            ((Ps_1)this.id_break[0]).id_native().id_class((Boolean)this.id_break[1]);
            if (((Ps_1)this.id_break[0]).id_native().id_protected()) {
               ((Ps_1)this.id_break[0]).id_native().id_class();
               ((Ps_1)this.id_break[0]).id_native().id_break(((rff_3)var2).id_class(), ((rff_3)var2).id_break());
               ((Ps_1)this.id_break[0]).id_catch().id_class(rpm_3.MAIN_HAND);
            } else {
               if (((Ps_1)this.id_break[0]).id_native().id_class(((rff_3)var2).id_class(), ((rff_3)var2).id_break())) {
                  ((Ps_1)this.id_break[0]).id_catch().id_class(rpm_3.MAIN_HAND);
               }

               if (((Ps_1)this.id_break[0]).id_native().id_protected()) {
                  Integer var9 = (Integer)C_throws.id_break().Pg.id_class[0] - 1;
                  this.id_break[2] = var9;
                  ((Ps_1)this.id_break[0]).id_native().id_break(0);
               }
            }

            Boolean var10 = !((Ps_1)this.id_break[0]).id_native().id_protected() ? true : id_case[9];
            this.id_break[1] = var10;
            ((Ps_1)this.id_break[0]).id_native().id_class(false);
         } else {
            Boolean var11 = false;
            this.id_break[1] = var11;
         }
      }
   }

   public void id_class() {
      if (((Ps_1)this.id_break[0]).id_catch() != null && (Boolean)this.id_break[1]) {
         ((Ps_1)this.id_break[0]).id_native().id_class(false);
         ((Ps_1)this.id_break[0]).id_native().id_break();
         Boolean var5 = false;
         this.id_break[1] = var5;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6383739252937993269L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-114, -17, 3, 71, 81, -91, 66, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2071425103;
   }

   private static void id_break() {
      id_throws = new short[]{2, 0, 0, 1, 0, 0, 1, 2, 2, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1, 0, 1, 2};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{1};
      id_class = var0;
   }

   private static void id_case() {
      id_catch = new byte[]{3, 2};
   }

   private static void id_protected() {
      id_case = new boolean[]{false, false, false, true, true, false, true, false, true, false, false, false, true, false, false, true, false, true};
   }
}
