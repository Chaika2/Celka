package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrfq_3 {
   private static short[] shorts8f8c034c8eef39ccbbc33e665d937d16;
   public static Object[] staticFields8f8c034c8eef39ccbbc33e665d937d16;
   public Object[] fields8f8c034c8eef39ccbbc33e665d937d16;
   private static byte[] bytes8f8c034c8eef39ccbbc33e665d937d16;
   private static boolean[] booleans8f8c034c8eef39ccbbc33e665d937d16;
   private static String[] strings8f8c034c8eef39ccbbc33e665d937d16;

   private static void id_byte() {
      shorts8f8c034c8eef39ccbbc33e665d937d16 = new short[]{10, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
   }

   private rrfq_3(String... var3) {
      this.id_case();
      this.fields8f8c034c8eef39ccbbc33e665d937d16[0] = var3;
   }

   static {
      ntfClinit();
   }

   public String[] id_class() {
      return (String[])this.fields8f8c034c8eef39ccbbc33e665d937d16[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7291560322713899716L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-30, 101, 120, 26, -11, 93, 76, 3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -875439063;
   }

   private static void id_break() {
      bytes8f8c034c8eef39ccbbc33e665d937d16 = new byte[]{10, 2, 3, 4, 5, 6, 7, 8, 9, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 2, 6, 7, 7, 8, 8, 9, 9, 10, 11};
   }

   // $FF: synthetic method
   private static rrfq_3[] id_throws() {
      rrfq_3[] var10000 = new rrfq_3[10];
      var10000[0] = (rrfq_3)staticFields8f8c034c8eef39ccbbc33e665d937d16[0];
      var10000[1] = (rrfq_3)staticFields8f8c034c8eef39ccbbc33e665d937d16[1];
      var10000[2] = (rrfq_3)staticFields8f8c034c8eef39ccbbc33e665d937d16[2];
      var10000[3] = (rrfq_3)staticFields8f8c034c8eef39ccbbc33e665d937d16[3];
      var10000[4] = (rrfq_3)staticFields8f8c034c8eef39ccbbc33e665d937d16[4];
      var10000[5] = (rrfq_3)staticFields8f8c034c8eef39ccbbc33e665d937d16[5];
      var10000[6] = (rrfq_3)staticFields8f8c034c8eef39ccbbc33e665d937d16[6];
      var10000[7] = (rrfq_3)staticFields8f8c034c8eef39ccbbc33e665d937d16[7];
      var10000[8] = (rrfq_3)staticFields8f8c034c8eef39ccbbc33e665d937d16[8];
      var10000[9] = (rrfq_3)staticFields8f8c034c8eef39ccbbc33e665d937d16[9];
      return var10000;
   }

   // $FF: synthetic method
   private static void ntfClinit() {
      id_private();
      id_protected();
      id_byte();
      id_break();
      id_catch();
   }

   private static void id_catch() {
      Object[] var0 = new Object[11];
      String var10004 = new String("REALLY_WORLD");
      String[] var2 = new String[]{new String("reallyworld"), new String("playrw")};
      var0[0] = new rrfq_3(var10004, 0, var2);
      var10004 = new String("ARES_MINE");
      String[] var3 = new String[]{new String("aresmine")};
      var0[1] = new rrfq_3(var10004, 1, var3);
      var10004 = new String("FUNTIME");
      String[] var4 = new String[]{new String("funtime")};
      var0[2] = new rrfq_3(var10004, 2, var4);
      var10004 = new String("FUNSKY");
      String[] var5 = new String[]{new String("funsky")};
      var0[3] = new rrfq_3(var10004, 3, var5);
      var10004 = new String("SPOOKY_TIME");
      String[] var6 = new String[]{new String("spookytime")};
      var0[4] = new rrfq_3(var10004, 4, var6);
      var10004 = new String("SLIME_WORLD");
      String[] var7 = new String[]{new String("slimeworld")};
      var0[5] = new rrfq_3(var10004, 5, var7);
      var10004 = new String("HOLY_WORLD");
      String[] var8 = new String[]{new String("holyworld"), new String("hollyworld")};
      var0[6] = new rrfq_3(var10004, 6, var8);
      var10004 = new String("SUNRISE");
      String[] var9 = new String[]{new String("sunmc")};
      var0[7] = new rrfq_3(var10004, 7, var9);
      var10004 = new String("INFINITY_HVH");
      String[] var10 = new String[]{new String("infinityhvh")};
      var0[8] = new rrfq_3(var10004, 8, var10);
      var10004 = new String("META_HVH");
      String[] var11 = new String[]{new String("metahvh")};
      var0[9] = new rrfq_3(var10004, 9, var11);
      var0[10] = new rrfq_3[]{(rrfq_3)var0[0], (rrfq_3)var0[1], (rrfq_3)var0[2], (rrfq_3)var0[3], (rrfq_3)var0[4], (rrfq_3)var0[5], (rrfq_3)var0[6], (rrfq_3)var0[7], (rrfq_3)var0[8], (rrfq_3)var0[9]};
      staticFields8f8c034c8eef39ccbbc33e665d937d16 = var0;
   }

   private void id_case() {
      if (this.fields8f8c034c8eef39ccbbc33e665d937d16 == null) {
         this.fields8f8c034c8eef39ccbbc33e665d937d16 = new Object[1];
      }

   }

   private static void id_protected() {
      strings8f8c034c8eef39ccbbc33e665d937d16 = new String[]{new String("REALLY_WORLD"), new String("reallyworld"), new String("playrw"), new String("ARES_MINE"), new String("aresmine"), new String("FUNTIME"), new String("funtime"), new String("FUNSKY"), new String("funsky"), new String("SPOOKY_TIME"), new String("spookytime"), new String("SLIME_WORLD"), new String("slimeworld"), new String("HOLY_WORLD"), new String("holyworld"), new String("hollyworld"), new String("SUNRISE"), new String("sunmc"), new String("INFINITY_HVH"), new String("infinityhvh"), new String("META_HVH"), new String("metahvh")};
   }

   private static void id_private() {
      booleans8f8c034c8eef39ccbbc33e665d937d16 = new boolean[]{false, true, false, false, true, false, true, true, false, true, true, false, true, false, true, false, true, false, false, true, true, false, true, false, true, false, true};
   }
}
