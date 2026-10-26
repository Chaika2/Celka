package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvV implements MinecraftAccessor {
   private static short[] id_byte;
   public Object[] id_class;
   public static Object[] id_break;
   private static boolean[] id_protected;
   private static byte[] id_throws;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrtu_3()};
      id_break = var0;
   }

   public rrvV() {
      this.id_private();
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   public void id_class(int var1, int var2, int var3) {
      ((rrtu_3)id_break[0]).id_class(var1, var2, var3);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-60, -67, -23, 19, 58, 66, -56, 101}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3100168369420032286L;
   }

   public void id_class(Ml_1 var1, int var2, int var3) {
      ((rrtu_3)id_break[0]).id_class(var1, var2, var3, false);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1591041356;
   }

   public void id_class(int var1, int var2, int var3, boolean var4, boolean var5) {
      ((rrtu_3)id_break[0]).id_class(var1, var2, var3, var4, var5);
   }

   public TargetHud id_class() {
      return (TargetHud)this.id_class[0];
   }

   public void id_break() {
      ((rrtu_3)id_break[0]).id_throws();
   }

   private static void id_throws() {
      id_byte = new short[7];
   }

   private static void id_catch() {
      id_protected = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_case() {
      id_throws = new byte[]{7, 2, 3, 4, 5, 6};
   }

   private void id_protected() {
      rrtu_3 var10000 = (rrtu_3)id_break[0];
      rrtN_2[] var10001 = new rrtN_2[7];
      TargetHud var5;
      TargetHud var10004 = var5 = new TargetHud();
      this.id_class[0] = var5;
      var10001[0] = var10004;
      var10001[1] = new HudWidget();
      var10001[2] = new rrFS();
      var10001[3] = new rrvi_1();
      var10001[4] = new rrFu_1();
      var10001[5] = new rrFd_1();
      var10001[6] = new rrvo_1();
      var10000.id_class(var10001);
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
