package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFv_1 implements rrqr_3 {
   private static byte[] id_break;
   public Object[] id_class;
   private static float[] id_byte;
   private static short[] id_protected;
   private static boolean[] id_throws;

   public rrFv_1(rrFZ var1, rVi_1 var2, rVi_1 var3) {
      this.id_finally();
      this.id_class[id_protected[0]] = var1;
      AnimValue var9 = new AnimValue(id_byte[0], id_throws[0]);
      this.id_class[id_protected[1]] = var9;
      this.id_class[id_protected[2]] = var2;
      this.id_class[id_protected[3]] = var3;
      String var12 = var3.getString();
      this.id_class[id_protected[4]] = var12;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1710678850;
   }

   @Override
   public void id_class(boolean var1) {
      ((AnimValue)this.id_class[id_protected[8]]).id_class(var1);
   }

   public rVi_1 id_class() {
      return (rVi_1)this.id_class[id_protected[5]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-90, 86, -91, 105, -30, 40, 31, -82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3696293320021037213L;
   }

   @Override
   public AnimValue id_break() {
      return (AnimValue)this.id_class[id_protected[7]];
   }

   @Override
   public boolean id_throws() {
      return id_throws[1];
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
      }
   }

   @Override
   public boolean id_catch() {
      return ((HudWidget)((rrFZ)this.id_class[id_protected[9]]).id_class[id_protected[10]]).id_super();
   }

   private static void id_extends() {
      id_protected = new short[]{4, 3, 0, 1, 2, 0, 1, 3, 3, 4, 0, 2};
   }

   public rVi_1 id_case() {
      return (rVi_1)this.id_class[id_protected[6]];
   }

   private static void id_implements() {
      id_throws = new boolean[]{false, true};
   }

   @Override
   public String id_private() {
      return (String)this.id_class[id_protected[11]];
   }

   private static void id_volatile() {
      id_break = new byte[]{5};
   }

   private static void id_native() {
      id_byte = new float[]{0.5F};
   }
}
