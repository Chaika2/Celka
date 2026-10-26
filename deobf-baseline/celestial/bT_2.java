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
         this.id_break = new Object[id_catch[0]];
         Object[] var1 = this.id_break;
         var1[id_case[12]] = id_case[13];
         var1[id_catch[1]] = Integer.valueOf(id_case[14]);
      }
   }

   public bT_2(Ps_1 var1) {
      this.id_byte();
      Integer var6 = Integer.valueOf(id_case[0]);
      this.id_break[id_throws[0]] = var6;
      this.id_break[id_throws[1]] = var1;
   }

   static {
      ntfClinit();
   }

   public void id_class(int var1) {
      Integer var6 = var1;
      this.id_break[id_throws[27]] = var6;
   }

   public void id_class(boolean var1) {
      if ((Integer)this.id_break[id_throws[7]] > 0) {
         Integer var8 = (Integer)this.id_break[id_throws[8]] - id_case[3];
         this.id_break[id_throws[9]] = var8;
      } else {
         rjG_2 var2 = ((Ps_1)this.id_break[id_throws[10]]).id_byte();
         boolean var3 = var2 != null && var2.id_byte() == rjM_2.BLOCK ? id_case[4] : id_case[5];
         if (var1 && var3) {
            ((Ps_1)this.id_break[id_throws[11]]).id_native().id_class((Boolean)this.id_break[id_throws[12]]);
            if (((Ps_1)this.id_break[id_throws[13]]).id_native().id_protected()) {
               ((Ps_1)this.id_break[id_throws[14]]).id_native().id_class();
               ((Ps_1)this.id_break[id_throws[15]]).id_native().id_break(((rff_3)var2).id_class(), ((rff_3)var2).id_break());
               ((Ps_1)this.id_break[id_throws[16]]).id_catch().id_class(rpm_3.MAIN_HAND);
            } else {
               if (((Ps_1)this.id_break[id_throws[17]]).id_native().id_class(((rff_3)var2).id_class(), ((rff_3)var2).id_break())) {
                  ((Ps_1)this.id_break[id_throws[18]]).id_catch().id_class(rpm_3.MAIN_HAND);
               }

               if (((Ps_1)this.id_break[id_throws[19]]).id_native().id_protected()) {
                  Integer var9 = (Integer)C_throws.id_break().Pg.id_class[id_throws[20]] - id_case[6];
                  this.id_break[id_throws[21]] = var9;
                  ((Ps_1)this.id_break[id_throws[22]]).id_native().id_break(id_case[7]);
               }
            }

            Boolean var10 = !((Ps_1)this.id_break[id_throws[23]]).id_native().id_protected() ? id_case[8] : id_case[9];
            this.id_break[id_throws[24]] = var10;
            ((Ps_1)this.id_break[id_throws[25]]).id_native().id_class(id_case[10]);
         } else {
            Boolean var11 = id_case[11];
            this.id_break[id_throws[26]] = var11;
         }
      }
   }

   public void id_class() {
      if (((Ps_1)this.id_break[id_throws[2]]).id_catch() != null && (Boolean)this.id_break[id_throws[3]]) {
         ((Ps_1)this.id_break[id_throws[4]]).id_native().id_class(id_case[1]);
         ((Ps_1)this.id_break[id_throws[5]]).id_native().id_break();
         Boolean var5 = id_case[2];
         this.id_break[id_throws[6]] = var5;
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
