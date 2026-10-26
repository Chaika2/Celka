package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlp_3 extends rrTF<AutoAccept> {
   private static byte[] byte_;
   private static boolean[] protected_;
   public Object[] class_;
   private static short[] case_;
   public static Object[] break_;
   private static String[] catch_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
      }
   }

   public rrlp_3(AutoAccept var1) {
      super(var1);
      this.byte_();
      rrIk_1 var6 = new rrIk_1("Включено", true);
      this.class_[0] = var6;
      rrIk_1 var7 = new rrIk_1("Только от друзей", true);
      this.class_[1] = var7;
      var1.class_(new GroupSetting("Запрос в клан", (rrIk_1)this.class_[0], (rrIk_1)this.class_[1]));
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-19, 109, -64, -110, -72, 61, -31, 127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void class_(rrLO var1) {
      this.byte_();
      if (((rrIk_1)this.class_[0]).class_()) {
         Aw_1 var2 = var1.break_();
         if (var2 != null) {
            String var3 = var1.protected_().toLowerCase();
            if (!Arrays.<String>stream((String[])break_[0]).map(String::toLowerCase).noneMatch(var3::contains)) {
               String var4 = var2.class_().getName();
               if (this.class_(var1, var4)) {
                  this.break_(var4);
               }
            }
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1234588252949324408L;
   }

   private boolean class_(rrLO var1, String var2) {
      this.byte_();
      if (((rrIk_1)this.class_[1]).class_()) {
         if (var1.class_() != null) {
            return false;
         }

         if (!((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).break_(var2)) {
            return false;
         }
      }

      return protected_[6];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 39901517;
   }

   private static void class_() {
      protected_ = new boolean[]{true, true, false, true, false, false, true, true, false, false, true};
   }

   private void break_(String var1) {
      ((cb_3)import_.class_[57]).case_("/clan accept " + var1);
   }

   private static void break_() {
      case_ = new short[]{0, 1, 0, 1, 0, 0, 1, 0, 57};
   }

   private static void throws_() {
      catch_ = new String[]{new String("Включено"), new String("Только от друзей"), new String("Запрос в клан"), new String("приглашает вас в клан")};
   }

   private static void case_() {
      byte_ = new byte[]{2, 2};
   }

   private static void protected_() {
      Object[] var0 = new Object[1];
      String[] var2 = new String[]{"приглашает вас в клан"};
      var0[0] = var2;
      break_ = var0;
   }
}
