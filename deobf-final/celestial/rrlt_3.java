package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlt_3 extends rrTF<AutoAccept> {
   private static short[] byte_;
   public Object[] class_;
   private static String[] protected_;
   private static boolean[] case_;
   public static Object[] break_;
   private static byte[] catch_;

   private static void byte_() {
      Object[] var0 = new Object[1];
      String[] var2 = new String[]{
         "has requested teleport",
         "просит телепортироваться",
         "просит к вам телепортироваться",
         "хочет телепортироваться к вам",
         "запрашивает телепорт к вам",
         "кинул запрос на телепортацию",
         "кинул запрос на телепорт",
         "кинул запрос на тп",
         "кинул запрос на тп к вам",
         "кинул запрос на телепорт к вам",
         "кинул запрос на телепортацию к вам"
      };
      var0[0] = var2;
      break_ = var0;
   }

   public rrlt_3(AutoAccept var1) {
      super(var1);
      this.throws_();
      rrIk_1 var6 = new rrIk_1("Включено", true);
      this.class_[0] = var6;
      rrIk_1 var7 = new rrIk_1("Только от друзей", true);
      this.class_[1] = var7;
      var1.class_(new GroupSetting("Запрос на телепорт", (rrIk_1)this.class_[0], (rrIk_1)this.class_[1]));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrLO var1) {
      this.throws_();
      if (((rrIk_1)this.class_[0]).class_()) {
         String var2 = var1.protected_().toLowerCase();
         if (!Arrays.<String>stream((String[])break_[0]).map(String::toLowerCase).noneMatch(var2::contains)) {
            if (this.class_(var1, var2)) {
               if (rrfZ_2.byte_()) {
                  rrfu_3.byte_(rrfu_3.class_(this.continue_()) + "Вы находитесь в PvP режиме!");
                  rrlw_3 var7 = (rrlw_3)rrlw_3.staticFieldsff97087b8aec3a608f6e6f0bcbd5ed33[0];
                  this.class_[2] = var7;
               } else {
                  this.case_();
               }
            }
         }
      }
   }

   private boolean class_(rrLO var1, String var2) {
      this.throws_();
      if (((rrIk_1)this.class_[1]).class_()) {
         if (var1.class_() != null) {
            return false;
         }

         if (!this.continue_().class_(var2.split("\\s+"))) {
            return false;
         }
      }

      return case_[6];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7725927935175892941L;
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.throws_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]
         && (rrlw_3)this.class_[2] == (rrlw_3)rrlw_3.staticFieldsff97087b8aec3a608f6e6f0bcbd5ed33[0]
         && !rrfZ_2.byte_()) {
         this.case_();
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1804448515;
   }

   private static void class_() {
      protected_ = new String[]{
         new String("Включено"),
         new String("Только от друзей"),
         new String("Запрос на телепорт"),
         new String("\\s+"),
         new String("/tpaccept"),
         new String("has requested teleport"),
         new String("просит телепортироваться"),
         new String("просит к вам телепортироваться"),
         new String("хочет телепортироваться к вам"),
         new String("запрашивает телепорт к вам"),
         new String("кинул запрос на телепортацию"),
         new String("кинул запрос на телепорт"),
         new String("кинул запрос на тп"),
         new String("кинул запрос на тп к вам"),
         new String("кинул запрос на телепорт к вам"),
         new String("кинул запрос на телепортацию к вам")
      };
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, -102, 114, 118, 31, -19, -103, -43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      this.throws_();
      ((cb_3)import_.class_[57]).case_("/tpaccept");
      rrlw_3 var5 = (rrlw_3)rrlw_3.staticFieldsff97087b8aec3a608f6e6f0bcbd5ed33[1];
      this.class_[2] = var5;
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
      }
   }

   private void case_() {
      this.break_();
   }

   private static void implements_() {
      byte_ = new short[]{0, 1, 0, 1, 0, 0, 0, 2, 0, 2, 0, 1, 57, 1, 2, 2};
   }

   private static void protected_() {
      catch_ = new byte[]{2, 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 3};
   }

   private static void private_() {
      case_ = new boolean[]{true, true, false, true, false, false, true, false, true, false, true};
   }

   @Override
   public boolean aK_() {
      this.throws_();
      Object var5 = null;
      this.class_[2] = var5;
      return super.aK_();
   }
}
