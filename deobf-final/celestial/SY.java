package celestial;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.SystemUtils;

public class SY implements PP, C_public {
   private static byte[] throws_;
   public static Object[] class_;
   private static String[] case_;
   public Object[] break_;
   private static short[] catch_;
   private static boolean[] private_;

   public SR byte_() {
      this.catch_();
      return (SR)this.break_[0];
   }

   public SY() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   public void class_(Consumer<SR> var1) {
      this.catch_();
      if ((SR)this.break_[0] != null) {
         var1.accept((SR)this.break_[0]);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1829059550;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{85, -108, 21, 21, 87, 54, -125, -95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rqM_2<rYB> var1) {
      rng_3 var4 = b_.this_();
      File var3;
      File var22;
      if (b_.finally_()) {
         var22 = rRJ.class_(var1, var4.class_(rrGr_1.implements_).toFile());
         if (var22.toPath().relativize(((File)b_.class_[24]).toPath()).getNameCount() != 2) {
            var22 = var22.getParentFile();
         }

         var22 = new File(var22, "baritone");
         var3 = var22;
      } else {
         if (b_.S() == null) {
            Object var13 = null;
            this.break_[0] = var13;
            gm_3 var14 = (gm_3)b_.class_[56];
            this.break_[1] = var14;
            return;
         }

         String var5 = b_.S().break_;
         if (SystemUtils.IS_OS_WINDOWS) {
            var5 = var5.replace(":", "_");
         }

         var22 = new File(C_class.B(), var5);
         var3 = C_class.B();
      }

      try (FileOutputStream var23 = new FileOutputStream(new File(var3, case_[3]))) {
         var23.write(case_[4].getBytes());
      } catch (IOException var21) {
      }

      Path var24 = rRJ.class_(var1, var22).toPath();
      if (!Files.exists(var24)) {
         try {
            Files.createDirectories(var24);
         } catch (IOException var18) {
         }
      }

      synchronized ((Map)class_[0]) {
         SR var15 = ((Map)class_[catch_[6]]).computeIfAbsent(var24, var1x -> new SR(var1x, var1));
         this.break_[catch_[7]] = var15;
      }

      gm_3 var16 = (gm_3)b_.class_[56];
      this.break_[1] = var16;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5372587157779214065L;
   }

   public void break_() {
      SR var1 = (SR)this.break_[0];
      Object var6 = null;
      this.break_[0] = var6;
      Object var7 = null;
      this.break_[1] = var7;
      if (var1 != null) {
         var1.byte_();
      }
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void finally_() {
      Object[] var0 = new Object[]{new HashMap()};
      class_ = var0;
   }

   private final void catch_() {
      if ((rYB)this.break_[1] != (gm_3)b_.class_[56]) {
         if ((SR)this.break_[0] != null) {
            this.break_();
         }

         if ((gm_3)b_.class_[56] != null) {
            this.class_(((gm_3)b_.class_[56]).E());
         }
      } else if ((SR)this.break_[0] == null && (gm_3)b_.class_[56] != null && (b_.finally_() || b_.S() != null)) {
         this.class_(((gm_3)b_.class_[56]).E());
      }
   }

   private static void case_() {
      case_ = new String[]{
         new String("baritone"), new String(":"), new String("_"), new String("readme.txt"), new String("https://github.com/cabaletta/baritone\n")
      };
   }

   private static void implements_() {
      throws_ = new byte[]{2, 2};
   }

   private static void protected_() {
      catch_ = new short[]{0, 24, 0, 56, 1, 0, 0, 0, 56, 1, 0, 0, 1, 0, 0, 1, 56, 0, 56, 56, 0, 56, 56};
   }

   private static void private_() {
      private_ = new boolean[]{false, false, false, true};
   }
}
