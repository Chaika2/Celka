package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Gj_1 {
   public Object[] fieldsc2539fcd16d03c23acab3f85bec2d6b6;
   private static String[] stringsc2539fcd16d03c23acab3f85bec2d6b6;
   public static Object[] staticFieldsc2539fcd16d03c23acab3f85bec2d6b6;
   private static boolean[] booleansc2539fcd16d03c23acab3f85bec2d6b6;
   private static byte[] bytesc2539fcd16d03c23acab3f85bec2d6b6;
   private static short[] shortsc2539fcd16d03c23acab3f85bec2d6b6;

   private static void id_byte() {
      booleansc2539fcd16d03c23acab3f85bec2d6b6 = new boolean[]{true, false, true, true, false, true, false, false, true, true};
   }

   Gj_1(xd_3 var3, Predicate<xc_3> var4) {
      this.id_protected();
      this.fieldsc2539fcd16d03c23acab3f85bec2d6b6[shortsc2539fcd16d03c23acab3f85bec2d6b6[1]] = var3;
      this.fieldsc2539fcd16d03c23acab3f85bec2d6b6[1] = var4;
   }

   private Gj_1(dO_2 var3) {
      this(var3, var3::id_implements);
   }

   static {
      ntfClinit();
   }

   public boolean id_class(rYB var1, rfH_2 var2, xc_3 var3) {
      return ((Predicate)this.fieldsc2539fcd16d03c23acab3f85bec2d6b6[1]).test(var3);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9119599661984557219L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1088573053;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{46, 111, 68, 76, 86, 40, 83, 71}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      shortsc2539fcd16d03c23acab3f85bec2d6b6 = new short[]{10, 0, 1, 1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
   }

   private static void id_throws() {
      bytesc2539fcd16d03c23acab3f85bec2d6b6 = new byte[]{3, 10, 2, 3, 4, 5, 6, 7, 8, 9, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 2, 11};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{
         new Gj_1((dO_2)xu_3.PB),
         new Gj_1((dO_2)xu_3.sr),
         new Gj_1((dO_2)xu_3.sP),
         new Gj_1((dO_2)xu_3.bT),
         new Gj_1(xu_3.Pg, var0x -> true),
         new Gj_1(xu_3.Bg, var0x -> true),
         new Gj_1(xu_3.Ss, var0x -> var0x.id_byte(kf_3.id_volatile) >= 3 ? true : booleansc2539fcd16d03c23acab3f85bec2d6b6[1]),
         new GV(xu_3.Pf, null),
         new Gg_1(xu_3.hs, null),
         new GR(xu_3.Pw, null),
         null
      };
      var0[10] = new Gj_1[]{(Gj_1)var0[0], (Gj_1)var0[1], (Gj_1)var0[2], (Gj_1)var0[3], (Gj_1)var0[4], (Gj_1)var0[5], (Gj_1)var0[6]};
      staticFieldsc2539fcd16d03c23acab3f85bec2d6b6 = var0;
   }

   private static void id_case() {
      stringsc2539fcd16d03c23acab3f85bec2d6b6 = new String[]{
         new String("WHEAT"),
         new String("CARROTS"),
         new String("POTATOES"),
         new String("BEETROOT"),
         new String("PUMPKIN"),
         new String("MELON"),
         new String("NETHERWART"),
         new String("SUGARCANE"),
         new String("BAMBOO"),
         new String("CACTUS")
      };
   }

   private void id_protected() {
      if (this.fieldsc2539fcd16d03c23acab3f85bec2d6b6 == null) {
         this.fieldsc2539fcd16d03c23acab3f85bec2d6b6 = new Object[2];
         Object[] var1 = this.fieldsc2539fcd16d03c23acab3f85bec2d6b6;
      }
   }
}
