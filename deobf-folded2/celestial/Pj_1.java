package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pj_1 extends Pv_1 implements PP {
   private static String[] id_case;
   private static long[] id_catch;
   private static boolean[] id_private;
   public static Object[] id_break;
   private static short[] id_implements;
   private static byte[] id_finally;
   public Object[] id_throws;

   public rdn_3 id_byte(List<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.id_continue().id_byte();
         if (var4.equals("[⟲] Вернуться")) {
            return var3;
         }
      }

      return null;
   }

   public boolean id_byte() {
      this.id_private();
      if ((Long)this.id_throws[1] == -1L) {
         return true;
      } else {
         return System.currentTimeMillis() - this.id_throws[1] > this.id_throws[0] ? true : id_private[7];
      }
   }

   public Pj_1(C_class var1) {
      super(var1);
      this.id_private();
      Long var6 = 61000L;
      this.id_throws[0] = var6;
      Long var7 = -1L;
      this.id_throws[1] = var7;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -993273672;
   }

   @Override
   public void id_class(rrLh_1 var1) {
      if (var1.id_protected() == null) {
         String var2 = var1.id_class();
         Matcher var3 = ((Pattern)id_break[1]).matcher(var2);
         rrNW var4 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).id_throws();
         boolean var5 = false;
         if (var3.find()) {
            try {
               String var6 = var3.group(id_private[1]);
               long var7 = Long.parseLong(var6) * id_catch[2] + id_catch[3];
               this.id_class(var7);
            } catch (Exception var9) {
               var9.printStackTrace();
            }

            var5 = id_private[2];
         } else if (var2.contains("Предметы успешно перевыставлены")) {
            this.id_class(61000L);
            var5 = true;
         }

         if (var5) {
            var4.id_protected(true);
         }
      }
   }

   @Override
   public void id_class(rrAM var1) {
      this.id_private();
      super.id_class(var1);
      Long var6 = -1L;
      this.id_throws[1] = var6;
   }

   public rdn_3 id_class(List<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.id_continue().id_byte();
         if (var4.equals("[☃] Хранилище")) {
            return var3;
         }
      }

      return null;
   }

   public long id_class() {
      this.id_private();
      return (Long)this.id_throws[0];
   }

   public void id_class(long var1) {
      this.id_private();
      Long var7 = var1;
      this.id_throws[0] = var7;
      Long var8 = System.currentTimeMillis();
      this.id_throws[1] = var8;
   }

   public long id_break() {
      this.id_private();
      return (Long)this.id_throws[1];
   }

   public rdn_3 id_break(List<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.id_continue().id_byte();
         if (var4.equals("[⟲] Перевыставить предметы")) {
            return var3;
         }
      }

      return null;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-55, 82, -77, -58, -99, -70, 106, -107}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_break(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5174856842904469642L;
   }

   private static void id_throws() {
      id_finally = new byte[]{2, 3, 2};
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{
         Pattern.compile("Хранилище", 0),
         Pattern.compile("Вы можете переставлять предметы раз в минуту! Подождите (\\d+) сек."),
         "Предметы успешно перевыставлены"
      };
      id_break = var0;
   }

   private static void id_catch() {
      id_catch = new long[]{61000L, -1L, 1000L, 1000L, 61000L, -1L, -1L, 0L, 0L};
   }

   private static void id_case() {
      id_case = new String[]{
         new String("Предметы успешно перевыставлены"),
         new String("[☃] Хранилище"),
         new String("[⟲] Перевыставить предметы"),
         new String("[⟲] Вернуться"),
         new String("Хранилище"),
         new String("Вы можете переставлять предметы раз в минуту! Подождите (\\d+) сек."),
         new String("Предметы успешно перевыставлены")
      };
   }

   private static void id_implements() {
      id_private = new boolean[]{false, true, true, true, true, true, true, false, false, true, false, true};
   }

   private static void id_protected() {
      id_implements = new short[]{0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1};
   }

   private void id_private() {
      if (this.id_throws == null) {
         this.id_throws = new Object[2];
         Object[] var1 = this.id_throws;
         var1[0] = 0L;
         var1[1] = 0L;
      }
   }
}
