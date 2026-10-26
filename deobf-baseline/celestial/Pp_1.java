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
      Long var6 = id_throws[0];
      this.id_break[id_protected[0]] = var6;
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
            (rrfq_3)rrfp_3.id_class[id_protected[1]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[2]]
               || (rrfq_3)rrfp_3.id_class[id_protected[3]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[4]]
         )) {
         String var2 = var1.id_protected().toLowerCase();
         if (var2.contains(id_byte[0])) {
            Long var7 = rqR_2.id_break();
            this.id_break[id_protected[5]] = var7;
         } else if (var2.contains(id_byte[1])) {
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
         this.id_break = new Object[id_case[2]];
         Object[] var1 = this.id_break;
         var1[id_case[3]] = id_throws[4];
      }
   }

   private void id_case() {
      this.id_catch();
      if ((Long)this.id_break[id_protected[6]] != id_throws[1]) {
         long var1 = Math.max(id_throws[2], rqR_2.id_break() - (Long)this.id_break[id_protected[7]]);
         Duration var10000 = Duration.ofMillis(var1);
         rqy_3[] var10001 = new rqy_3[id_catch[0]];
         var10001[id_case[0]] = rqy_3.HOURS;
         var10001[id_case[1]] = rqy_3.MINUTES;
         var10001[id_catch[1]] = rqy_3.SECONDS;
         String var3 = rql_3.id_class(var10000, var10001);
         rVi_1 var4 = rrfu_3.id_class()
            .id_class(id_byte[2])
            .id_class(rVa_1.id_class(id_byte[3]))
            .id_break()
            .id_class(new rgN_2(" Дуэль длилась " + rgF_2.YELLOW + var3));
         ((cq_3)((Ps_1)this.id_class[id_protected[8]]).id_throws().id_class[id_protected[9]]).id_throws().id_break(var4);
      }
   }

   private void id_protected() {
      this.id_catch();
      Long var5 = id_throws[3];
      this.id_break[id_protected[10]] = var5;
   }

   private static void id_private() {
      id_throws = new long[]{-1L, -1L, 0L, -1L, 0L};
   }
}
