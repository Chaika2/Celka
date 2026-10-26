package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvy_1 extends cG_2 {
   private static float[] id_finally;
   private static boolean[] id_extends;
   private static short[] id_native;
   public Object[] id_break;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-53, 101, -52, -66, -76, 51, -55, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_long() {
      id_finally = new float[1];
   }

   private static void id_float() {
      id_extends = new boolean[]{false, false, false, true, true, false, false, true};
   }

   public rrvy_1(cG_2 var1) {
      super((gm_3)var1.id_class[id_native[0]], var1.sv());
      this.id_public();
      this.id_break[id_native[1]] = var1;
      this.id_protected(var1);
   }

   static {
      ntfClinit();
   }

   public void id_class(int var1, BiConsumer<Integer, rrvy_1> var2) {
      this.id_public();

      for (int var3 = id_extends[0]; var3 < var1; var3++) {
         this.id_private(
            new rjU_2(
               (double)((Float)((cG_2)this.id_break[id_native[2]]).id_private[id_native[3]]).floatValue(),
               (double)((Float)((cG_2)this.id_break[id_native[4]]).id_private[id_native[5]]).floatValue(),
               (double)((Float)((cG_2)this.id_break[id_native[6]]).id_private[id_native[7]]).floatValue()
            )
         );
         if (var2 != null) {
            var2.accept(var3, this);
         }
      }
   }

   public void id_class(int var1) {
      this.id_class(var1, null);
   }

   @Override
   public rdn_3 id_class(rXQ var1) {
      this.id_public();
      return ((cG_2)this.id_break[id_native[23]]).id_class(var1);
   }

   @Override
   public void id_class(rdn_3 var1, int var2) {
   }

   @Override
   public void id_class(rXQ var1, rdn_3 var2) {
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8676723994713416295L;
   }

   @Override
   public void id_class(rqA_2 var1, float var2, float var3) {
   }

   @Override
   public void U() {
   }

   @Override
   public void id_break(rfH_2 var1, xc_3 var2) {
   }

   @Override
   public boolean id_throws(rdn_3 var1) {
      return id_extends[2];
   }

   @Override
   public void Sk() {
   }

   @Override
   public Aw_1 id_continue() {
      return null;
   }

   public List<Float> id_else() {
      this.id_public();
      ArrayList var1 = new ArrayList();
      short var2 = id_native[8];

      for (int var3 = id_extends[1]; !this.BL() && var3 < var2; var3++) {
         float var4 = (Float)this.id_throws[id_native[9]];
         this.id_private(
            new rjU_2(
               (double)((Float)((cG_2)this.id_break[id_native[10]]).id_private[id_native[11]]).floatValue(),
               (double)((Float)((cG_2)this.id_break[id_native[12]]).id_private[id_native[13]]).floatValue(),
               (double)((Float)((cG_2)this.id_break[id_native[14]]).id_private[id_native[15]]).floatValue()
            )
         );
         if ((Float)this.id_throws[id_native[16]] != id_finally[0] && (Float)this.id_throws[id_native[17]] != var4) {
            var1.add((Float)this.id_throws[id_native[18]]);
         }
      }

      return var1;
   }

   private static int id_else(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -826193530;
   }

   @Override
   public boolean id_implements() {
      this.id_public();
      return ((cG_2)this.id_break[id_native[21]]).id_implements();
   }

   @Override
   public boolean id_try() {
      return id_extends[4];
   }

   private static void id_static() {
      id_native = new short[]{5, 0, 0, 42, 0, 43, 0, 44, 1000, 31, 0, 42, 0, 43, 0, 44, 31, 31, 31, 0, 0, 0, 0, 0, 0};
   }

   private void id_public() {
      if (this.id_break == null) {
         this.id_break = new Object[id_extends[7]];
         Object[] var1 = this.id_break;
      }
   }

   @Override
   public void id_private(float var1) {
   }

   @Override
   public boolean id_native() {
      this.id_public();
      return ((cG_2)this.id_break[id_native[20]]).id_native();
   }

   @Override
   public boolean SG() {
      return id_extends[6];
   }

   @Override
   public Iterable<rdn_3> PV() {
      this.id_public();
      return ((cG_2)this.id_break[id_native[19]]).PV();
   }

   @Override
   public void Bb() {
   }

   @Override
   public boolean Sy() {
      this.id_public();
      return ((cG_2)this.id_break[id_native[22]]).Sy();
   }

   @Override
   public boolean Sp() {
      return id_extends[5];
   }

   @Override
   public void St() {
   }

   @Override
   public rpZ_2 Su() {
      this.id_public();
      return ((cG_2)this.id_break[id_native[24]]).Su();
   }

   @Override
   public boolean SO() {
      return id_extends[3];
   }

   @Override
   public void Sv() {
   }
}
