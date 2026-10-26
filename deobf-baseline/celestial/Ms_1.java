package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Ms_1 implements PE, PP {
   private static short[] shorts347bd646f08b343d83dca157cd270e07;
   public static Object[] staticFields347bd646f08b343d83dca157cd270e07;
   private static String[] strings347bd646f08b343d83dca157cd270e07;
   private static boolean[] booleans347bd646f08b343d83dca157cd270e07;
   private static byte[] bytes347bd646f08b343d83dca157cd270e07;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2089205699;
   }

   @Override
   public rRl_1 id_byte() {
      return ((Ax_1)b_.id_class[shorts347bd646f08b343d83dca157cd270e07[8]]).id_native();
   }

   static {
      ntfClinit();
   }

   @Override
   public ryZ_2 id_class(cb_3 var1, rYB var2, rpm_3 var3, rff_3 var4) {
      return ((Ax_1)b_.id_class[shorts347bd646f08b343d83dca157cd270e07[10]]).id_break(var1, (gm_3)var2, var3, var4);
   }

   @Override
   public void id_class() {
      ((Ax_1)b_.id_class[shorts347bd646f08b343d83dca157cd270e07[1]]).id_package();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3877620367607544275L;
   }

   @Override
   public void id_class(int var1, int var2, int var3, rXa_1 var4) {
      ((Ax_1)b_.id_class[shorts347bd646f08b343d83dca157cd270e07[6]]).id_class(var1, var2, var3, var4);
   }

   @Override
   public void id_class(int var1) {
      ((Ax_1)b_.id_class[shorts347bd646f08b343d83dca157cd270e07[16]]).id_class(var1);
   }

   @Override
   public ryZ_2 id_class(rpm_3 var1) {
      return ((Ax_1)b_.id_class[shorts347bd646f08b343d83dca157cd270e07[11]]).id_class(var1);
   }

   @Override
   public void id_class(boolean var1) {
      ((Ax_1)b_.id_class[shorts347bd646f08b343d83dca157cd270e07[14]]).id_class(var1);
   }

   @Override
   public void id_class(int var1, int var2, int var3, rXa_1 var4, boolean var5) {
      ((Ax_1)b_.id_class[shorts347bd646f08b343d83dca157cd270e07[5]]).id_class(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean id_class(rfH_2 var1, rpr_3 var2) {
      return ((Ax_1)b_.id_class[shorts347bd646f08b343d83dca157cd270e07[3]]).id_break(var1, var2, booleans347bd646f08b343d83dca157cd270e07[2]);
   }

   @Override
   public void id_class(cb_3 var1, an_3 var2, boolean var3) {
      ((Ax_1)b_.id_class[shorts347bd646f08b343d83dca157cd270e07[12]]).id_class(var1, var2, var3);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-41, -80, 108, -122, -11, 20, -114, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break() {
      ((Ax_1)b_.id_class[shorts347bd646f08b343d83dca157cd270e07[4]]).id_break();
   }

   @Override
   public void id_break(int var1) {
      ((Ax_1)b_.id_class[shorts347bd646f08b343d83dca157cd270e07[15]]).id_byte(var1);
   }

   @Override
   public ryZ_2 id_break(cb_3 var1, rYB var2, rpm_3 var3, rff_3 var4) {
      return ((Ax_1)b_.id_class[shorts347bd646f08b343d83dca157cd270e07[9]]).id_class(var1, (gm_3)var2, var3, var4);
   }

   @Override
   public boolean id_break(rfH_2 var1, rpr_3 var2) {
      return ((Ax_1)b_.id_class[shorts347bd646f08b343d83dca157cd270e07[13]]).id_class(var1, var2, booleans347bd646f08b343d83dca157cd270e07[3]);
   }

   @Override
   public int id_throws() {
      return ((Ax_1)b_.id_class[shorts347bd646f08b343d83dca157cd270e07[7]]).id_break;
   }

   private static void id_finally() {
      strings347bd646f08b343d83dca157cd270e07 = new String[]{new String("INSTANCE")};
   }

   private static void id_catch() {
      shorts347bd646f08b343d83dca157cd270e07 = new short[]{1, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 0};
   }

   private static void id_extends() {
      Object[] var0 = new Object[]{new Ms_1(), null};
      var0[1] = new Ms_1[]{(Ms_1)var0[0]};
      staticFields347bd646f08b343d83dca157cd270e07 = var0;
   }

   private static void id_implements() {
      booleans347bd646f08b343d83dca157cd270e07 = new boolean[]{true, false, true, true, true, false, false, false, true};
   }

   @Override
   public boolean id_protected() {
      return ((Ax_1)b_.id_class[shorts347bd646f08b343d83dca157cd270e07[2]]).id_final().c_() == bytes347bd646f08b343d83dca157cd270e07[0]
         ? booleans347bd646f08b343d83dca157cd270e07[0]
         : booleans347bd646f08b343d83dca157cd270e07[1];
   }

   private static void id_native() {
      bytes347bd646f08b343d83dca157cd270e07 = new byte[]{-1, 2};
   }
}
