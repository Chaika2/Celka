package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrwI_2 {
   public Object[] id_case;
   private static boolean[] id_class;
   private static short[] id_break;

   public rrwI_2() {
      this.id_catch();
      ArrayList var5 = new ArrayList();
      this.id_case[0] = var5;
   }

   static {
      ntfClinit();
   }

   public List<Setting<?>> b() {
      return (List<Setting<?>>)this.id_case[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1914629133;
   }

   public <T extends Setting<?>> T id_class(T var1) {
      ((List)this.id_case[0]).add(var1);
      return (T)var1;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8949400235690979340L;
   }

   public void id_class(Setting<?>... var1) {
      ((List)this.id_case[0]).addAll(Arrays.asList(var1));
   }

   public <T extends Setting<?>> T id_throws(String var1) {
      for (Setting var3 : (List)this.id_case[0]) {
         if (var3.id_throws().equalsIgnoreCase(var1.toLowerCase())) {
            return (T)var3;
         }
      }

      return null;
   }

   private void id_catch() {
      if (this.id_case == null) {
         this.id_case = new Object[1];
         Object[] var1 = this.id_case;
      }
   }

   public static String id_case(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{61, -39, -18, -114, -61, -87, 107, 97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_private() {
      id_class = new boolean[]{true};
   }

   private static void id_volatile() {
      id_break = new short[5];
   }

   public abstract String id_synchronized();
}
