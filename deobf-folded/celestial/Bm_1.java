package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bm_1 extends Pv_1 implements PP {
   private static String[] id_break;
   private static short[] id_throws;

   public Bm_1(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rvV_2 var3) {
         if ((rrfq_3)rrfp_3.id_class[1] != null) {
            return;
         }

         rgP_2 var4 = var3.id_break();
         if (var4 == null) {
            return;
         }

         String var5 = var4.id_byte();
         if (var5.isEmpty()) {
            return;
         }

         id_break(var5);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7369341208060580759L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1242390226;
   }

   private static void id_class() {
      id_break = new String[]{
         new String("funtime.su"), new String("reallyworld"), new String("holyworld"), new String("sunrise"), new String("eztime.su"), new String("metahvh")
      };
   }

   private static void id_break() {
      id_throws = new short[]{1, 2, 0, 6, 7, 8, 9};
   }

   public static void id_break(String var0) {
      var0 = var0.toLowerCase();
      Aq_1 var1 = b_.id_void();
      rud_3 var2 = var1 == null ? null : var1.id_class();
      if (var0.contains(id_break[0])) {
         rrfp_3.id_break((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2], var2);
      } else if (var0.contains(id_break[1])) {
         rrfp_3.id_break((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[2]], var2);
      } else if (var0.contains(id_break[2])) {
         rrfp_3.id_break((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[6], var2);
      } else if (var0.contains(id_break[3])) {
         rrfp_3.id_break((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[7], var2);
      } else if (var0.contains(id_break[4])) {
         rrfp_3.id_break((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[8], var2);
      } else if (var0.contains(id_break[5])) {
         rrfp_3.id_break((rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[9], var2);
      }
   }

   public static String id_private(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-23, -39, 18, 15, -97, 30, 0, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
