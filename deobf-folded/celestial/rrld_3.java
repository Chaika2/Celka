package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrld_3 extends rrTF<WaterSpeed> {
   private static byte[] id_break;
   private static double[] id_byte;
   private static short[] id_protected;
   private static float[] id_case;
   public Object[] id_class;
   private static boolean[] id_catch;

   private static void id_byte() {
      id_protected = new short[]{0, 1, 57, 57, 57, 23, 57, 0, 0, 57, 17, 57, 17, 1, 0, 1, 57, 41, 57, 42, 57, 44, 0, 0, 1, 57, 0, 1};
   }

   public rrld_3(WaterSpeed var1) {
      super(var1);
      this.id_throws();
      rrIa_1 var6 = new rrIa_1();
      this.id_class[id_protected[0]] = var6;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8327104366150302132L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-7, -66, 119, 64, -68, 12, -46, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(rrLj_1 var1) {
      this.id_throws();
      if (var1.id_break() || !var1.id_class()) {
         ((rrIa_1)this.id_class[id_protected[23]]).id_class();
      }
   }

   @EventTarget
   public void id_class(rrLZ var1) {
      this.id_throws();
      if (var1.id_class() instanceof rmD_2 var2) {
         if (var2.id_break() == rmU_2.STOP_SPRINTING) {
            var1.id_class(true);
         } else if (var2.id_break() == rmU_2.RELEASE_SHIFT_KEY
            && (Float)((cb_3)id_import.id_class[57]).id_private[42] != id_case[2]
            && (Float)((cb_3)id_import.id_class[57]).id_private[44] == id_case[3]) {
            ((rrIa_1)this.id_class[id_protected[22]]).id_class();
         }
      }
   }

   @EventTarget
   public void id_class(rrLk_1 var1) {
      var1.id_class(id_byte[6]);
   }

   @EventTarget
   public void id_class(rrLz_1 var1) {
      this.id_throws();
      Boolean var9 = id_catch[0];
      this.id_class[1] = var9;
      float var2 = rrIi_1.id_class(this.id_case());
      float var3 = rrfj_3.id_class();
      boolean var4 = rrfo_3.id_break(1);
      if (((cb_3)id_import.id_class[57]).PZ() && (((cb_3)id_import.id_class[57]).Pj() || var4)) {
         if ((Boolean)((cb_3)id_import.id_class[57]).id_throws[23]) {
            return;
         }

         if (var4 && var3 == id_case[0] && !((cb_3)id_import.id_class[57]).Pj()) {
            var1.id_catch().id_byte = id_byte[0];
         }

         if (!rrfj_3.id_catch()) {
            ((rrIa_1)this.id_class[id_protected[7]]).id_class();
         }

         var1.id_class(((rrIa_1)this.id_class[id_protected[8]]).id_class(var2, 0.15F));
         rjU_2 var10000 = var1.id_catch();
         var10000.id_byte = var10000.id_byte
            + (
               ((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_implements
                  ? -0.2F
                  : (((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_private ? 0.06F : id_byte[3])
            );
         Boolean var10 = true;
         this.id_class[1] = var10;
      } else {
         ((rrIa_1)this.id_class[id_protected[14]]).id_class();
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1511173044;
   }

   @EventTarget
   public void id_class(rrAo_1 var1) {
      this.id_throws();
      if ((Boolean)this.id_class[1]) {
         var1.id_protected(var1.id_catch() + (((cb_3)id_import.id_class[57]).id_throws[41] % 2 == 0 ? 0.02 : 0.001));
      }
   }

   private static void id_class() {
      id_catch = new boolean[]{false, true, true, true, false, false, true, false};
   }

   @EventTarget
   public void id_class(rrAB var1) {
      this.id_throws();
      if ((Boolean)this.id_class[1]) {
         var1.id_class(id_catch[4]);
      }
   }

   private static void id_break() {
      id_break = new byte[]{2, 2};
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         this.id_class[1] = false;
      }
   }

   private float id_case() {
      return ((cb_3)id_import.id_class[57]).BL() ? 0.29F : 0.67F;
   }

   private static void id_protected() {
      id_byte = new double[]{0.0, -0.2F, 0.06F, 0.0, 0.02, 0.001, 0.0};
   }

   private static void id_private() {
      id_case = new float[]{0.0F, 0.15F, 0.0F, 0.0F, 0.29F, 0.67F};
   }

   @Override
   public boolean aK_() {
      this.id_throws();
      ((rrIa_1)this.id_class[id_protected[26]]).id_class();
      Boolean var5 = id_catch[5];
      this.id_class[1] = var5;
      return super.aK_();
   }
}
