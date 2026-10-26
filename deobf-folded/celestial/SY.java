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
   private static byte[] id_throws;
   public static Object[] id_class;
   private static String[] id_case;
   public Object[] id_break;
   private static short[] id_catch;
   private static boolean[] id_private;

   public SR id_byte() {
      this.id_catch();
      return (SR)this.id_break[id_catch[0]];
   }

   public SY() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   public void id_class(Consumer<SR> var1) {
      this.id_catch();
      if ((SR)this.id_break[id_catch[13]] != null) {
         var1.accept((SR)this.id_break[id_catch[14]]);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1829059550;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{85, -108, 21, 21, 87, 54, -125, -95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rqM_2<rYB> var1) {
      rng_3 var4 = b_.id_this();
      File var3;
      File var22;
      if (b_.id_finally()) {
         var22 = rRJ.id_class(var1, var4.id_class(rrGr_1.id_implements).toFile());
         if (var22.toPath().relativize(((File)b_.id_class[24]).toPath()).getNameCount() != 2) {
            var22 = var22.getParentFile();
         }

         var22 = new File(var22, id_case[0]);
         var3 = var22;
      } else {
         if (b_.S() == null) {
            Object var13 = null;
            this.id_break[id_catch[2]] = var13;
            gm_3 var14 = (gm_3)b_.id_class[56];
            this.id_break[1] = var14;
            return;
         }

         String var5 = b_.S().id_break;
         if (SystemUtils.IS_OS_WINDOWS) {
            var5 = var5.replace(id_case[1], id_case[2]);
         }

         var22 = new File(C_class.B(), var5);
         var3 = C_class.B();
      }

      try (FileOutputStream var23 = new FileOutputStream(new File(var3, id_case[3]))) {
         var23.write(id_case[4].getBytes());
      } catch (IOException var21) {
      }

      Path var24 = rRJ.id_class(var1, var22).toPath();
      if (!Files.exists(var24)) {
         try {
            Files.createDirectories(var24);
         } catch (IOException var18) {
         }
      }

      synchronized ((Map)id_class[id_catch[5]]) {
         SR var15 = ((Map)id_class[id_catch[6]]).computeIfAbsent(var24, var1x -> new SR(var1x, var1));
         this.id_break[id_catch[7]] = var15;
      }

      gm_3 var16 = (gm_3)b_.id_class[56];
      this.id_break[1] = var16;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5372587157779214065L;
   }

   public void id_break() {
      SR var1 = (SR)this.id_break[id_catch[10]];
      Object var6 = null;
      this.id_break[id_catch[11]] = var6;
      Object var7 = null;
      this.id_break[1] = var7;
      if (var1 != null) {
         var1.id_byte();
      }
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{new HashMap()};
      id_class = var0;
   }

   private final void id_catch() {
      if ((rYB)this.id_break[1] != (gm_3)b_.id_class[56]) {
         if ((SR)this.id_break[id_catch[17]] != null) {
            this.id_break();
         }

         if ((gm_3)b_.id_class[56] != null) {
            this.id_class(((gm_3)b_.id_class[56]).E());
         }
      } else if ((SR)this.id_break[id_catch[20]] == null && (gm_3)b_.id_class[56] != null && (b_.id_finally() || b_.S() != null)) {
         this.id_class(((gm_3)b_.id_class[56]).E());
      }
   }

   private static void id_case() {
      id_case = new String[]{
         new String("baritone"), new String(":"), new String("_"), new String("readme.txt"), new String("https://github.com/cabaletta/baritone\n")
      };
   }

   private static void id_implements() {
      id_throws = new byte[]{2, 2};
   }

   private static void id_protected() {
      id_catch = new short[]{0, 24, 0, 56, 1, 0, 0, 0, 56, 1, 0, 0, 1, 0, 0, 1, 56, 0, 56, 56, 0, 56, 56};
   }

   private static void id_private() {
      id_private = new boolean[]{false, false, false, true};
   }
}
