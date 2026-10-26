package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtj_3 extends rrtt_3 {
   private static short[] id_throws;
   public Object[] id_protected;
   private static float[] id_native;
   private static byte[] id_volatile;
   private static boolean[] id_final;
   private static int[] id_package;

   private static void id_char() {
      id_final = new boolean[]{false, true, false, false, true, true, false, true, false, true};
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, 1, -70, 85, -75, -63, -94, 89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrtj_3(rrtN_2 var1, rrIc_1 var2, float var3, float var4, float var5, float var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.id_interface();
      ArrayList var13 = new ArrayList();
      this.id_protected[id_throws[0]] = var13;

      for (rrIk_1 var8 : var2.id_class()) {
         ((List)this.id_protected[id_throws[1]]).add(new rrwP_2(var8));
      }

      Float var14 = var6;
      this.id_protected[id_throws[2]] = var14;
   }

   static {
      ntfClinit();
   }

   private void id_interface() {
      if (this.id_protected == null) {
         this.id_protected = new Object[id_volatile[2]];
         Object[] var1 = this.id_protected;
         var1[id_final[9]] = id_native[5];
      }
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      if (!super.id_class(var1, var2, var3, var4, var5)) {
         return id_final[0];
      } else {
         for (rrwP_2 var7 : this.id_goto()) {
            if (var4 == 0 && var7.id_class().id_break((float)var2, (float)var3)) {
               var7.id_case().id_class(Boolean.valueOf(!var7.id_protected() ? id_final[1] : id_final[2]), id_final[3], id_final[4]);
               return id_final[5];
            }
         }

         return id_final[6];
      }
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      super.id_class(var1, var2, var3, var4);
      this.id_private().id_interface().id_class(var1, () -> this.id_class(var1));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2547471126011272116L;
   }

   private void id_class(Ml_1 var1) {
      this.id_interface();
      rrZO var2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[3]]).id_finally();
      float var3 = this.id_package();
      float var4 = this.id_final();
      float var5 = this.id_new();
      float var6 = var3;
      float var7 = var4 + id_native[0];
      byte var8 = id_volatile[0];
      byte var9 = id_volatile[1];
      rrtF_2.id_protected(var1, this, var2, this.id_finally().id_throws(), var3, var4, rrZF.k_, id_throws[4]);
      float var10 = id_native[1];

      for (rrwP_2 var12 : this.id_goto()) {
         rrIk_1 var13 = var12.id_case();
         float var14 = var2.id_break(var13.id_throws());
         float var15 = (float)var2.id_class();
         if (var6 + var14 > var3 + var5) {
            var6 = var3;
            var7 += (float)var9;
         }

         var12.id_class(new rruv_1(var6, var7, var14, var15).id_class(id_native[2], id_native[3]));
         rruv_1 var16 = var12.id_class();
         rrtF_2.id_protected(var1, this, var2, var13.id_throws(), var6, var7, var13.id_class() ? id_package[0] : id_package[1], id_throws[5]);
         var6 += var14 + (float)var8;
         var10 = Math.max(var10, var16.id_protected() + var15 - var4);
      }

      Float var21 = var10 + id_native[4];
      this.id_protected[id_throws[6]] = var21;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1138959986;
   }

   private List<rrwP_2> id_goto() {
      this.id_interface();
      return ((List)this.id_protected[id_throws[9]])
         .stream()
         .filter(var0 -> !var0.id_case().id_private() && !var0.id_throws().id_case() ? id_final[8] : id_final[7])
         .toList();
   }

   @Override
   public float id_continue() {
      this.id_interface();
      return (Float)this.id_protected[id_throws[7]];
   }

   private static void id_instanceof() {
      id_throws = new short[]{0, 0, 1, 0, 255, 255, 1, 1, 0, 0, 0, 1};
   }

   public List<rrwP_2> id_return() {
      this.id_interface();
      return (List<rrwP_2>)this.id_protected[id_throws[10]];
   }

   private static void id_throw() {
      id_volatile = new byte[]{5, 10, 2};
   }

   private static void id_try() {
      id_native = new float[]{10.0F, 0.0F, 1.0F, 1.0F, 15.0F, 0.0F};
   }

   private static void id_while() {
      id_package = new int[]{-16711936, -65536};
   }

   public float id_public() {
      this.id_interface();
      return (Float)this.id_protected[id_throws[11]];
   }

   @Override
   public List<? extends rrtn_3> id_protected() {
      this.id_interface();
      return (List<? extends rrtn_3>)this.id_protected[id_throws[8]];
   }
}
