package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bG_2 extends bb_3 {
   private static byte[] id_protected;
   private static boolean[] id_throws;
   public static Object[] id_class;
   private static short[] id_case;
   private static String[] id_catch;
   public Object[] id_break;

   public bG_2(C_class var1, bM_2 var2) {
      super(var1, var2);
      this.id_final();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3575450969027118560L;
   }

   @Override
   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rFu_1 var2) {
         rgP_2 var5 = var2.id_byte();
         if (var2.id_break() != rFm_1.ACTIONBAR || var5 == null) {
            return;
         }

         String var4 = var5.id_byte();
         if (((Pattern)rrjM_2.id_class[id_case[6]]).matcher(var4).find()) {
            this.id_implements();
         }
      }
   }

   @Override
   public void id_class() {
      super.id_class();
      this.id_catch();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -212195467;
   }

   @Override
   public void id_class(rrLp_1 var1) {
      this.id_final();
      if (var1.id_case() == (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[2]) {
         rfH_2 var2 = var1.id_class();
         if (!var2.equals((rfH_2)this.id_break[id_case[1]])) {
            this.id_break[id_case[2]] = var2;
            Integer var8 = 1;
            this.id_break[1] = var8;
         } else {
            int var10002 = (Integer)this.id_break[1] + 1;
            Integer var9 = var10002;
            this.id_break[1] = var9;
            if (var10002 >= 15) {
               this.id_implements();
               this.id_catch();
            }
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{41, -15, -72, -80, -113, -32, -78, 82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{15};
      id_class = var0;
   }

   private static void id_finally() {
      id_protected = new byte[]{15, 2, 15};
   }

   private void id_catch() {
      this.id_final();
      Object var5 = null;
      this.id_break[id_case[7]] = var5;
      Integer var6 = Integer.valueOf(id_throws[2]);
      this.id_break[1] = var6;
   }

   private static void id_extends() {
      id_catch = new String[]{new String("Найден приват")};
   }

   private static void id_case() {
      id_case = new short[]{2, 0, 0, 1, 1, 1, 0, 0, 1};
   }

   private void id_implements() {
      rVi_1 var1 = new rgN_2(id_catch[0]).id_class(rgF_2.GRAY);
      this.id_class(var1);
      this.id_catch();
   }

   private static void id_private() {
      id_throws = new boolean[]{true, true, false, true, false, true, false};
   }

   private void id_final() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
         var1[1] = Integer.valueOf(id_throws[4]);
      }
   }
}
