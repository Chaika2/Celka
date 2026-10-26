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
      super((gm_3)var1.id_class[5], var1.sv());
      this.id_public();
      this.id_break[0] = var1;
      this.id_protected(var1);
   }

   static {
      ntfClinit();
   }

   public void id_class(int var1, BiConsumer<Integer, rrvy_1> var2) {
      this.id_public();

      for(int var3 = false; var3 < var1; ++var3) {
         this.id_private(new rjU_2((double)(Float)((cG_2)this.id_break[0]).id_private[42], (double)(Float)((cG_2)this.id_break[0]).id_private[43], (double)(Float)((cG_2)this.id_break[0]).id_private[44]));
         if (var2 != null) {
            var2.accept(var3, this);
         }
      }

   }

   public void id_class(int var1) {
      this.id_class(var1, (BiConsumer)null);
   }

   public rdn_3 id_class(rXQ var1) {
      this.id_public();
      return ((cG_2)this.id_break[0]).id_class(var1);
   }

   public void id_class(rdn_3 var1, int var2) {
   }

   public void id_class(rXQ var1, rdn_3 var2) {
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8676723994713416295L;
   }

   public void id_class(rqA_2 var1, float var2, float var3) {
   }

   public void U() {
   }

   public void id_break(rfH_2 var1, xc_3 var2) {
   }

   public boolean id_throws(rdn_3 var1) {
      return false;
   }

   // $FF: synthetic method
   private static void ntfClinit() {
      id_float();
      id_static();
      id_long();
   }

   public void Sk() {
   }

   public Aw_1 id_continue() {
      return null;
   }

   public List<Float> id_else() {
      this.id_public();
      ArrayList var1 = new ArrayList();
      short var2 = 1000;

      for(int var3 = false; !this.BL() && var3 < var2; ++var3) {
         float var4 = (Float)this.id_throws[31];
         this.id_private(new rjU_2((double)(Float)((cG_2)this.id_break[0]).id_private[42], (double)(Float)((cG_2)this.id_break[0]).id_private[43], (double)(Float)((cG_2)this.id_break[0]).id_private[44]));
         if ((Float)this.id_throws[31] != id_finally[0] && (Float)this.id_throws[31] != var4) {
            var1.add((Float)this.id_throws[31]);
         }
      }

      return var1;
   }

   private static int id_else(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -826193530;
   }

   public boolean id_implements() {
      this.id_public();
      return ((cG_2)this.id_break[0]).id_implements();
   }

   public boolean id_try() {
      return true;
   }

   private static void id_static() {
      id_native = new short[]{5, 0, 0, 42, 0, 43, 0, 44, 1000, 31, 0, 42, 0, 43, 0, 44, 31, 31, 31, 0, 0, 0, 0, 0, 0};
   }

   private void id_public() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }

   }

   public void id_private(float var1) {
   }

   public boolean id_native() {
      this.id_public();
      return ((cG_2)this.id_break[0]).id_native();
   }

   public boolean SG() {
      return false;
   }

   public Iterable<rdn_3> PV() {
      this.id_public();
      return ((cG_2)this.id_break[0]).PV();
   }

   public void Bb() {
   }

   public boolean Sy() {
      this.id_public();
      return ((cG_2)this.id_break[0]).Sy();
   }

   public boolean Sp() {
      return false;
   }

   public void St() {
   }

   public rpZ_2 Su() {
      this.id_public();
      return ((cG_2)this.id_break[0]).Su();
   }

   public boolean SO() {
      return true;
   }

   public void Sv() {
   }
}
