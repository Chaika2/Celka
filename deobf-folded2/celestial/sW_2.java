package celestial;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum sW_2 {
   private static String[] strings6b259e9d4f13397ca074ec4185749984;
   public static Object[] staticFields6b259e9d4f13397ca074ec4185749984;
   private static byte[] bytes6b259e9d4f13397ca074ec4185749984;
   private static boolean[] booleans6b259e9d4f13397ca074ec4185749984;
   public Object[] fields6b259e9d4f13397ca074ec4185749984;
   private static short[] shorts6b259e9d4f13397ca074ec4185749984;

   private static void id_byte() {
      strings6b259e9d4f13397ca074ec4185749984 = new String[]{
         new String("POS1"),
         new String("pos1"),
         new String("p1"),
         new String("POS2"),
         new String("pos2"),
         new String("p2"),
         new String("SELECTION"),
         new String("sel"),
         new String("selection"),
         new String("SAVE"),
         new String("save"),
         new String("REMOVE"),
         new String("remove"),
         new String("delete")
      };
   }

   private sW_2(String... var3) {
      this.id_throws();
      this.fields6b259e9d4f13397ca074ec4185749984[0] = var3;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1254987353;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4170384171058804353L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-77, -18, 119, 71, -81, -116, -105, -90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static String[] id_class() {
      LinkedHashSet var0 = new LinkedHashSet();

      for (sW_2 var4 : values()) {
         var0.add(((String[])var4.fields6b259e9d4f13397ca074ec4185749984[0])[0]);
      }

      return var0.toArray(new String[0]);
   }

   public static sW_2 id_break(String var0) {
      for (sW_2 var4 : values()) {
         for (String var8 : (String[])var4.fields6b259e9d4f13397ca074ec4185749984[0]) {
            if (var8.equalsIgnoreCase(var0)) {
               return var4;
            }
         }
      }

      return null;
   }

   private void id_throws() {
      if (this.fields6b259e9d4f13397ca074ec4185749984 == null) {
         this.fields6b259e9d4f13397ca074ec4185749984 = new Object[1];
         Object[] var1 = this.fields6b259e9d4f13397ca074ec4185749984;
      }
   }

   private static void id_catch() {
      booleans6b259e9d4f13397ca074ec4185749984 = new boolean[]{
         false, false, false, false, false, false, true, false, false, true, false, true, false, true, true, false, true, true, false, false, true, true
      };
   }

   private static void id_case() {
      shorts6b259e9d4f13397ca074ec4185749984 = new short[]{5, 0, 0, 0, 0, 1, 2, 3, 4};
   }

   private static void id_protected() {
      bytes6b259e9d4f13397ca074ec4185749984 = new byte[]{5, 2, 3, 4, 2, 2, 2, 2, 2, 3, 3, 4, 2, 4, 5, 6};
   }

   private static void id_private() {
      Object[] var0 = new Object[6];
      String[] var2 = new String[]{"pos1", "p1"};
      var0[0] = new sW_2(var2);
      String[] var3 = new String[]{"pos2", "p2"};
      var0[1] = new sW_2(var3);
      String[] var4 = new String[]{"sel", "selection"};
      var0[2] = new sW_2(var4);
      String[] var5 = new String[]{"save"};
      var0[3] = new sW_2(var5);
      String[] var6 = new String[]{"remove", "delete"};
      var0[4] = new sW_2(var6);
      var0[5] = new sW_2[]{(sW_2)var0[0], (sW_2)var0[1], (sW_2)var0[2], (sW_2)var0[3], (sW_2)var0[4]};
      staticFields6b259e9d4f13397ca074ec4185749984 = var0;
   }
}
