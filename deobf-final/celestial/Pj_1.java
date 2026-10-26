package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pj_1 extends Pv_1 implements PP {
   private static String[] case_;
   private static long[] catch_;
   private static boolean[] private_;
   public static Object[] break_;
   private static short[] implements_;
   private static byte[] finally_;
   public Object[] throws_;

   public rdn_3 byte_(List<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.continue_().byte_();
         if (var4.equals("[⟲] Вернуться")) {
            return var3;
         }
      }

      return null;
   }

   public boolean byte_() {
      this.private_();
      if ((Long)this.throws_[1] == -1L) {
         return true;
      } else {
         return System.currentTimeMillis() - this.throws_[1] > this.throws_[0] ? true : private_[7];
      }
   }

   public Pj_1(C_class var1) {
      super(var1);
      this.private_();
      Long var6 = 61000L;
      this.throws_[0] = var6;
      Long var7 = -1L;
      this.throws_[1] = var7;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -993273672;
   }

   @Override
   public void class_(rrLh_1 var1) {
      if (var1.protected_() == null) {
         String var2 = var1.class_();
         Matcher var3 = ((Pattern)break_[1]).matcher(var2);
         rrNW var4 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).throws_();
         boolean var5 = false;
         if (var3.find()) {
            try {
               String var6 = var3.group(private_[1]);
               long var7 = Long.parseLong(var6) * catch_[2] + catch_[3];
               this.class_(var7);
            } catch (Exception var9) {
               var9.printStackTrace();
            }

            var5 = private_[2];
         } else if (var2.contains("Предметы успешно перевыставлены")) {
            this.class_(61000L);
            var5 = true;
         }

         if (var5) {
            var4.protected_(true);
         }
      }
   }

   @Override
   public void class_(rrAM var1) {
      this.private_();
      super.class_(var1);
      Long var6 = -1L;
      this.throws_[1] = var6;
   }

   public rdn_3 class_(List<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.continue_().byte_();
         if (var4.equals("[☃] Хранилище")) {
            return var3;
         }
      }

      return null;
   }

   public long class_() {
      this.private_();
      return (Long)this.throws_[0];
   }

   public void class_(long var1) {
      this.private_();
      Long var7 = var1;
      this.throws_[0] = var7;
      Long var8 = System.currentTimeMillis();
      this.throws_[1] = var8;
   }

   public long break_() {
      this.private_();
      return (Long)this.throws_[1];
   }

   public rdn_3 break_(List<rdn_3> var1) {
      for (rdn_3 var3 : var1) {
         String var4 = var3.continue_().byte_();
         if (var4.equals("[⟲] Перевыставить предметы")) {
            return var3;
         }
      }

      return null;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-55, 82, -77, -58, -99, -70, 106, -107}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long break_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5174856842904469642L;
   }

   private static void throws_() {
      finally_ = new byte[]{2, 3, 2};
   }

   private static void finally_() {
      Object[] var0 = new Object[]{
         Pattern.compile("Хранилище", 0),
         Pattern.compile("Вы можете переставлять предметы раз в минуту! Подождите (\\d+) сек."),
         "Предметы успешно перевыставлены"
      };
      break_ = var0;
   }

   private static void catch_() {
      catch_ = new long[]{61000L, -1L, 1000L, 1000L, 61000L, -1L, -1L, 0L, 0L};
   }

   private static void case_() {
      case_ = new String[]{
         new String("Предметы успешно перевыставлены"),
         new String("[☃] Хранилище"),
         new String("[⟲] Перевыставить предметы"),
         new String("[⟲] Вернуться"),
         new String("Хранилище"),
         new String("Вы можете переставлять предметы раз в минуту! Подождите (\\d+) сек."),
         new String("Предметы успешно перевыставлены")
      };
   }

   private static void implements_() {
      private_ = new boolean[]{false, true, true, true, true, true, true, false, false, true, false, true};
   }

   private static void protected_() {
      implements_ = new short[]{0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1};
   }

   private void private_() {
      if (this.throws_ == null) {
         this.throws_ = new Object[2];
         Object[] var1 = this.throws_;
         var1[0] = 0L;
         var1[1] = 0L;
      }
   }
}
