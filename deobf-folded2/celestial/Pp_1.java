package celestial;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pp_1 extends Pv_1 {
   private static String[] id_byte;
   private static short[] id_protected;
   private static long[] id_throws;
   public Object[] id_break;
   private static boolean[] id_case;
   private static byte[] id_catch;

   private static void id_byte() {
      id_catch = new byte[]{3, 2};
   }

   public Pp_1(C_class var1) {
      super(var1);
      this.id_catch();
      Long var6 = -1L;
      this.id_break[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6326508002934234513L;
   }

   @Override
   public void id_class(rrAM var1) {
      this.id_protected();
   }

   @Override
   public void id_class(rrLO var1) {
      this.id_catch();
      if (var1.id_class() == null
         && (
            (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
               || (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         )) {
         String var2 = var1.id_protected().toLowerCase();
         if (var2.contains("[⚔] дуэль началась")) {
            Long var7 = rqR_2.id_break();
            this.id_break[0] = var7;
         } else if (var2.contains("[⚔] дуэль завершена")) {
            this.id_case();
            this.id_protected();
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2129577809;
   }

   private static void id_class() {
      id_protected = new short[]{0, 1, 2, 1, 4, 0, 0, 0, 1, 19, 0};
   }

   @Override
   public void id_class(rrFK var1) {
      this.id_protected();
   }

   private static void id_break() {
      id_case = new boolean[]{false, true, true, false};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-122, -65, 97, 85, 63, 76, 49, 96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_byte = new String[]{new String("[⚔] дуэль началась"), new String("[⚔] дуэль завершена"), new String("[⚔]"), new String("#FF6600")};
   }

   private void id_catch() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
         var1[0] = 0L;
      }
   }

   private void id_case() {
      this.id_catch();
      if ((Long)this.id_break[0] != -1L) {
         long var1 = Math.max(0L, rqR_2.id_break() - (Long)this.id_break[0]);
         String var3 = rql_3.id_class(Duration.ofMillis(var1), rqy_3.HOURS, rqy_3.MINUTES, rqy_3.SECONDS);
         rVi_1 var4 = rrfu_3.id_class()
            .id_class("[⚔]")
            .id_class(rVa_1.id_class("#FF6600"))
            .id_break()
            .id_class(new rgN_2(" Дуэль длилась " + rgF_2.YELLOW + var3));
         ((cq_3)((Ps_1)this.id_class[1]).id_throws().id_class[19]).id_throws().id_break(var4);
      }
   }

   private void id_protected() {
      this.id_catch();
      Long var5 = -1L;
      this.id_break[0] = var5;
   }

   private static void id_private() {
      id_throws = new long[]{-1L, -1L, 0L, -1L, 0L};
   }
}
