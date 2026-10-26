package celestial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrQL implements rrQF {
   private static byte[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;

   private static void id_byte() {
      id_break = new byte[]{2, -1, -1, 2, 16, 16};
   }

   public rrQL(String var1) {
      this.id_case();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3689685068815369676L;
   }

   public String id_class(String var1, String var2) {
      if (Character.isUpperCase(var1.charAt(0))) {
         return var1 + var2;
      } else if (Character.isUpperCase(var2.charAt(0))) {
         return var2 + var1;
      } else {
         return var1.length() < var2.length() ? var2 + var1 : var1 + var2;
      }
   }

   public Pair<String, String> id_class(Random var1) {
      try {
         Pair var8;
         try (
            InputStream var2 = QY.id_instanceof().F().id_class(new rqO_2("celestial/" + (String)this.id_class[id_byte[1]])).id_break();
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var2));
         ) {
            ArrayList var4 = new ArrayList();

            String var5;
            while ((var5 = var3.readLine()) != null) {
               var4.add(var5.trim());
            }

            String var6 = (String)var4.get(var1.nextInt(var4.size()));

            String var7;
            do {
               var7 = (String)var4.get(var1.nextInt(var4.size()));
            } while (var6.equals(var7));

            var8 = Pair.of(var6, var7);
         }

         return var8;
      } catch (IOException var13) {
         var13.printStackTrace();
         return null;
      }
   }

   @Override
   public CompletableFuture<String> id_class() {
      ThreadLocalRandom var1 = ThreadLocalRandom.current();
      Pair var2 = this.id_class(var1);
      if (var2 == null) {
         return CompletableFuture.completedFuture(null);
      } else {
         CompletableFuture var3 = rrQV.id_byte((String)var2.getLeft());
         CompletableFuture var4 = rrQV.id_byte((String)var2.getRight());
         return CompletableFuture.allOf(var3, var4).thenApplyAsync(var4x -> {
            String var5 = (String)var3.join();
            String var6 = (String)var4.join();
            String var7 = this.id_class(var5, var1);
            String var8 = this.id_class(var6, var1);
            String var9 = this.id_class(var7, var8);
            if (var9.length() > 16) {
               var9 = var9.substring(0, 16);
            }

            return var9;
         });
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1454442927;
   }

   public void id_class(String var1) {
      this.id_class[0] = var1;
   }

   public String id_class(String var1, Random var2) {
      int var3 = var1.length();
      int var4 = -1;

      for (int var5 = 1; var5 < var3; var5++) {
         if (Character.isUpperCase(var1.charAt(var5))) {
            var4 = var5;
            break;
         }
      }

      if (var4 == -1) {
         var4 = var3 / 2;
      }

      String var7 = var1.substring(0, var4);
      String var6 = var1.substring(var4);
      return var2.nextBoolean() ? var7 : var6;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{38, 93, 80, 47, -32, 99, -22, 110}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_break() {
      return (String)this.id_class[0];
   }

   private static void id_throws() {
      id_protected = new boolean[]{false, true, false, false, true, false, false, true};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_byte = new short[4];
   }
}
