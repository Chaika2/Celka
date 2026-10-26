package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Ms_1 implements PE, PP {
   ;
   private static short[] shorts347bd646f08b343d83dca157cd270e07;
   public static Object[] staticFields347bd646f08b343d83dca157cd270e07;
   private static String[] strings347bd646f08b343d83dca157cd270e07;
   private static boolean[] booleans347bd646f08b343d83dca157cd270e07;
   private static byte[] bytes347bd646f08b343d83dca157cd270e07;

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2089205699;
   }

   @Override
   public rRl_1 byte_() {
      return ((Ax_1)b_.class_[55]).native_();
   }

   static {
      ntfClinit();
   }

   @Override
   public ryZ_2 class_(cb_3 var1, rYB var2, rpm_3 var3, rff_3 var4) {
      return ((Ax_1)b_.class_[55]).break_(var1, (gm_3)var2, var3, var4);
   }

   @Override
   public void class_() {
      ((Ax_1)b_.class_[55]).package_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3877620367607544275L;
   }

   @Override
   public void class_(int var1, int var2, int var3, rXa_1 var4) {
      ((Ax_1)b_.class_[55]).class_(var1, var2, var3, var4);
   }

   @Override
   public void class_(int var1) {
      ((Ax_1)b_.class_[55]).class_(var1);
   }

   @Override
   public ryZ_2 class_(rpm_3 var1) {
      return ((Ax_1)b_.class_[55]).class_(var1);
   }

   @Override
   public void class_(boolean var1) {
      ((Ax_1)b_.class_[55]).class_(var1);
   }

   @Override
   public void class_(int var1, int var2, int var3, rXa_1 var4, boolean var5) {
      ((Ax_1)b_.class_[55]).class_(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean class_(rfH_2 var1, rpr_3 var2) {
      return ((Ax_1)b_.class_[55]).break_(var1, var2, true);
   }

   @Override
   public void class_(cb_3 var1, an_3 var2, boolean var3) {
      ((Ax_1)b_.class_[55]).class_(var1, var2, var3);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-41, -80, 108, -122, -11, 20, -114, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_() {
      ((Ax_1)b_.class_[55]).break_();
   }

   @Override
   public void break_(int var1) {
      ((Ax_1)b_.class_[55]).byte_(var1);
   }

   @Override
   public ryZ_2 break_(cb_3 var1, rYB var2, rpm_3 var3, rff_3 var4) {
      return ((Ax_1)b_.class_[55]).class_(var1, (gm_3)var2, var3, var4);
   }

   @Override
   public boolean break_(rfH_2 var1, rpr_3 var2) {
      return ((Ax_1)b_.class_[55]).class_(var1, var2, true);
   }

   @Override
   public int throws_() {
      return ((Ax_1)b_.class_[55]).break_;
   }

   private static void finally_() {
      strings347bd646f08b343d83dca157cd270e07 = new String[]{new String("INSTANCE")};
   }

   private static void catch_() {
      shorts347bd646f08b343d83dca157cd270e07 = new short[]{1, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 0};
   }

   private static void extends_() {
      Object[] var0 = new Object[]{new Ms_1(), null};
      var0[1] = new Ms_1[]{(Ms_1)var0[0]};
      staticFields347bd646f08b343d83dca157cd270e07 = var0;
   }

   private static void implements_() {
      booleans347bd646f08b343d83dca157cd270e07 = new boolean[]{true, false, true, true, true, false, false, false, true};
   }

   @Override
   public boolean protected_() {
      return ((Ax_1)b_.class_[55]).final_().c_() == -1 ? true : booleans347bd646f08b343d83dca157cd270e07[1];
   }

   private static void native_() {
      bytes347bd646f08b343d83dca157cd270e07 = new byte[]{-1, 2};
   }
}
