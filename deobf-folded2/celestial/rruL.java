package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruL {
   private static boolean[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   private static void id_byte() {
      id_byte = new short[8];
   }

   public rruL() {
      this.id_throws();
      ArrayList var5 = new ArrayList();
      this.id_class[0] = var5;
   }

   static {
      ntfClinit();
   }

   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      for (int var6 = ((List)this.id_class[0]).size() - 1; var6 >= 0; var6--) {
         rruF var7 = (rruF)((List)this.id_class[0]).get(var6);
         if (var7.id_protected().id_break((float)var2, (float)var3) && var7.id_class(var1, var2, var3, var4, var5)) {
            return true;
         }
      }

      return id_break[2];
   }

   public List<rruF> id_class() {
      return (List<rruF>)this.id_class[0];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{100, 122, 26, -73, -7, 126, 110, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -655533607;
   }

   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5, boolean var6) {
      if (!var6) {
         for (rruF var8 : (List)this.id_class[0]) {
            var8.id_class(var1, var2, var3, var4, var5);
         }
      }
   }

   public void id_class(rruF... var1) {
      ((List)this.id_class[0]).addAll(Arrays.asList(var1));
   }

   public void id_class(float var1) {
      for (rruF var3 : (List)this.id_class[0]) {
         if (var3.id_break()) {
            var3.id_case().id_byte(var1);
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2901200006721061486L;
   }

   public void id_break(float var1) {
      for (rruF var3 : (List)this.id_class[0]) {
         if (var3.id_break()) {
            var3.id_case().id_break(var1);
         }
      }
   }

   public void id_break() {
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_break = new boolean[]{true, true, false, true};
   }
}
