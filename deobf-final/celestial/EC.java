package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum EC {
   ;
   private static String[] strings08a057b7f10f37959d555668d812e9fc;
   private static short[] shorts08a057b7f10f37959d555668d812e9fc;
   public Object[] fields08a057b7f10f37959d555668d812e9fc;
   private static boolean[] booleans08a057b7f10f37959d555668d812e9fc;
   private static byte[] bytes08a057b7f10f37959d555668d812e9fc;
   public static Object[] staticFields08a057b7f10f37959d555668d812e9fc;

   private void byte_() {
      if (this.fields08a057b7f10f37959d555668d812e9fc == null) {
         this.fields08a057b7f10f37959d555668d812e9fc = new Object[5];
         Object[] var1 = this.fields08a057b7f10f37959d555668d812e9fc;
         var1[0] = false;
         var1[1] = false;
         var1[2] = 0;
         var1[3] = 0;
         var1[4] = 0;
      }
   }

   EC(int var3, int var4, int var5) {
      this(var3, var4, var5, false, false);
   }

   EC(int var3, int var4, int var5, boolean var6, boolean var7) {
      this.byte_();
      Integer var12 = var3;
      this.fields08a057b7f10f37959d555668d812e9fc[2] = var12;
      Integer var13 = var4;
      this.fields08a057b7f10f37959d555668d812e9fc[3] = var13;
      Integer var14 = var5;
      this.fields08a057b7f10f37959d555668d812e9fc[4] = var14;
      Boolean var15 = var6;
      this.fields08a057b7f10f37959d555668d812e9fc[0] = var15;
      Boolean var16 = var7;
      this.fields08a057b7f10f37959d555668d812e9fc[1] = var16;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 479942904;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2316616713498407425L;
   }

   public void class_(EZ var1, int var2, int var3, int var4, Mr_1 var5) {
      if (!(Boolean)this.fields08a057b7f10f37959d555668d812e9fc[0] && !(Boolean)this.fields08a057b7f10f37959d555668d812e9fc[1]) {
         Integer var10 = var2 + (Integer)this.fields08a057b7f10f37959d555668d812e9fc[2];
         var5.class_[0] = var10;
         Integer var11 = var3 + (Integer)this.fields08a057b7f10f37959d555668d812e9fc[3];
         var5.class_[1] = var11;
         Integer var12 = var4 + (Integer)this.fields08a057b7f10f37959d555668d812e9fc[4];
         var5.class_[2] = var12;
         Double var13 = this.class_(var1, var2, var3, var4);
         var5.class_[3] = var13;
      } else {
         throw new UnsupportedOperationException();
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-33, -6, 41, -84, -69, -1, -96, 54}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public double class_(EZ var1, int var2, int var3, int var4) {
      throw new UnsupportedOperationException();
   }

   public abstract Ev_1 class_(EZ var1, rU_2 var2);

   private static void class_() {
      Object[] var0 = new Object[]{
         new El_1(0, -1, 0),
         new EV(0, 1, 0),
         new Eo_1(0, 0, -1),
         new EK(0, 0, 1),
         new ED(1, 0, 0),
         new EU(-1, 0, 0),
         new Ee_1(0, 1, -1),
         new Ea_1(0, 1, 1),
         new Ei_1(1, 1, 0),
         new EH(-1, 1, 0),
         new Ey_1(1, -1, 0, false, true),
         new Ep_1(-1, -1, 0, false, true),
         new Eq_1(0, -1, -1, false, true),
         new ET(0, -1, 1, false, true),
         new Et_1(1, 0, -1, false, true),
         new Ew_1(-1, 0, -1, false, true),
         new EI(1, 0, 1, false, true),
         new Ef_1(-1, 0, 1, false, true),
         new Ej_1(0, 0, -4, true, true),
         new Eg_1(0, 0, 4, true, true),
         new ER(4, 0, 0, true, true),
         new EY(-4, 0, 0, true, true),
         null
      };
      var0[22] = new EC[]{
         (EC)var0[0],
         (EC)var0[1],
         (EC)var0[2],
         (EC)var0[3],
         (EC)var0[4],
         (EC)var0[5],
         (EC)var0[6],
         (EC)var0[7],
         (EC)var0[8],
         (EC)var0[9],
         (EC)var0[10],
         (EC)var0[11],
         (EC)var0[12],
         (EC)var0[13],
         (EC)var0[14],
         (EC)var0[15],
         (EC)var0[16],
         (EC)var0[17],
         (EC)var0[18],
         (EC)var0[19],
         (EC)var0[20],
         (EC)var0[21]
      };
      staticFields08a057b7f10f37959d555668d812e9fc = var0;
   }

   private static void break_() {
      booleans08a057b7f10f37959d555668d812e9fc = new boolean[]{
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false
      };
   }

   private static void throws_() {
      strings08a057b7f10f37959d555668d812e9fc = new String[]{
         new String("DOWNWARD"),
         new String("PILLAR"),
         new String("TRAVERSE_NORTH"),
         new String("TRAVERSE_SOUTH"),
         new String("TRAVERSE_EAST"),
         new String("TRAVERSE_WEST"),
         new String("ASCEND_NORTH"),
         new String("ASCEND_SOUTH"),
         new String("ASCEND_EAST"),
         new String("ASCEND_WEST"),
         new String("DESCEND_EAST"),
         new String("DESCEND_WEST"),
         new String("DESCEND_NORTH"),
         new String("DESCEND_SOUTH"),
         new String("DIAGONAL_NORTHEAST"),
         new String("DIAGONAL_NORTHWEST"),
         new String("DIAGONAL_SOUTHEAST"),
         new String("DIAGONAL_SOUTHWEST"),
         new String("PARKOUR_NORTH"),
         new String("PARKOUR_SOUTH"),
         new String("PARKOUR_EAST"),
         new String("PARKOUR_WEST")
      };
   }

   private static void case_() {
      bytes08a057b7f10f37959d555668d812e9fc = new byte[]{
         22,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         13,
         14,
         15,
         16,
         17,
         18,
         19,
         20,
         21,
         -1,
         2,
         -1,
         2,
         3,
         3,
         4,
         4,
         5,
         -1,
         5,
         6,
         -1,
         6,
         7,
         7,
         8,
         8,
         9,
         -1,
         9,
         10,
         -1,
         10,
         11,
         -1,
         -1,
         11,
         12,
         -1,
         -1,
         12,
         13,
         -1,
         13,
         14,
         -1,
         14,
         15,
         -1,
         -1,
         15,
         16,
         16,
         17,
         -1,
         17,
         18,
         -4,
         18,
         19,
         4,
         19,
         20,
         4,
         20,
         21,
         -4,
         21,
         22,
         5,
         2,
         3,
         4,
         23
      };
   }

   private static void protected_() {
      shorts08a057b7f10f37959d555668d812e9fc = new short[]{
         22, 2, 3, 4, 0, 1, 0, 1, 2, 0, 3, 1, 4, 2, 3, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21
      };
   }
}
