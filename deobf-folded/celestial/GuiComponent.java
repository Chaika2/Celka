package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class GuiComponent implements MinecraftAccessor {
   private static boolean[] id_class;

   public rdn_3 id_byte() {
      return null;
   }

   static {
      ntfClinit();
   }

   public boolean id_class(char var1, int var2) {
      return id_class[6];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2008534072;
   }

   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      boolean var10000;
      label21: {
         if (this.id_class() instanceof rrZT var7 && var7.id_case().id_finally()) {
            var10000 = true;
            break label21;
         }

         var10000 = id_class[1];
      }

      boolean var6 = var10000;
      return this.id_protected().id_break((float)var2, (float)var3) && !var6 ? true : id_class[3];
   }

   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
   }

   public boolean id_class(int var1, int var2, int var3) {
      return id_class[5];
   }

   public void id_class(Category var1, Category var2) {
   }

   public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6, boolean var7) {
      return true;
   }

   public abstract rrZN id_class();

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4395724268278196479L;
   }

   public void id_break(int var1, int var2, int var3) {
   }

   public void id_break(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
   }

   private static void id_break() {
      id_class = new boolean[]{true, false, true, false, true, false, false};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-47, -14, 26, -98, 94, 94, 81, 24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public abstract rruv_1 id_protected();

   public void id_final() {
   }

   public void am_() {
   }

   public void an_() {
   }

   public void al_() {
   }
}
