package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Strafe extends Module implements rrnZ_2 {
   private static double[] id_byte;
   private static float[] id_protected;
   private static boolean[] id_throws;
   private static String[] id_catch;
   private static byte[] id_private;
   public Object[] id_break;
   private static short[] id_implements;

   public Strafe() {
      super("Strafe", "Позволяет не замедляться при\nдвижении в стороны", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[1]);
      this.id_while();
      rrlX_2 var5 = new rrlX_2(this);
      this.id_break[0] = var5;
   }

   static {
      ntfClinit();
   }

   public boolean id_this() {
      this.id_while();
      return (Boolean)this.id_break[3];
   }

   @EventTarget
   public void id_class(rrLW var1) {
      this.id_while();
      ((rrlX_2)this.id_break[0]).id_class(var1);
   }

   @EventTarget
   public void id_class(rrAl_1 var1) {
      this.id_while();
      if (var1.id_class() < 10.0F) {
         Boolean var6 = true;
         this.id_break[3] = var6;
      }
   }

   @EventTarget
   public void id_class(rrAo_1 var1) {
      this.id_while();
      if ((Boolean)this.id_break[2] && rmD_2.id_break != (Boolean)this.id_break[1]) {
         var1.id_protected(!rmD_2.id_break ? true : id_throws[1]);
      }

      ((rrlX_2)this.id_break[0]).id_class(var1);
   }

   @EventTarget
   public void id_class(rrAB var1) {
      this.id_while();
      if ((Boolean)this.id_break[2]) {
         var1.id_class(true);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5528047994387930442L;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_while();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((Qw_1)id_import.id_class[20]).Pr = false;
         Boolean var6 = this.id_throw();
         this.id_break[2] = var6;
         if ((Boolean)this.id_break[3] && (Integer)((cb_3)id_import.id_class[57]).id_throws[41] % 6 == 0) {
            Boolean var7 = false;
            this.id_break[3] = var7;
            ((rrlX_2)this.id_break[0]).id_class(0.0);
         }
      }
   }

   @Override
   public void id_class(boolean var1) {
      this.id_while();
      super.id_class(var1);
      ((rrlX_2)this.id_break[0]).id_class(0.15F);
   }

   @Override
   public void id_class() {
      this.id_byte(false);
   }

   @EventTarget
   public void id_class(rrLz_1 var1) {
      this.id_while();
      if ((Boolean)this.id_break[2]) {
         var1.id_class(((rrlX_2)this.id_break[0]).id_class(var1));
      } else {
         ((rrlX_2)this.id_break[0]).id_class(0.0);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 330663405;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-13, -34, 113, -64, 10, -44, -7, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      if ((cb_3)id_import.id_class[57] != null) {
         rjU_2 var2 = ((cb_3)id_import.id_class[57]).rv();
         var2.id_break *= 0.7;
         var2.id_protected *= 0.7;
      }
   }

   private static void id_goto() {
      id_implements = new short[]{
         1, 0, 0, 2, 0, 0, 2, 1, 0, 2, 0, 20, 2, 3, 57, 41, 3, 0, 3, 0, 57, 56, 3, 57, 23, 57, 18, 57, 57, 57, 57, 0, 57, 57, 0, 1, 1, 2, 3
      };
   }

   public void id_case(boolean var1) {
      this.id_while();
      Boolean var6 = var1;
      this.id_break[1] = var6;
   }

   public boolean id_continue() {
      this.id_while();
      return (Boolean)this.id_break[1];
   }

   private static void id_else() {
      id_private = new byte[]{6, 4, 2, 3};
   }

   private static void id_instanceof() {
      id_protected = new float[]{10.0F};
   }

   public boolean id_new() {
      this.id_while();
      return (Boolean)this.id_break[2];
   }

   private static void id_return() {
      id_catch = new String[]{new String("Strafe"), new String("Позволяет не замедляться при\nдвижении в стороны")};
   }

   public rrlX_2 id_super() {
      this.id_while();
      return (rrlX_2)this.id_break[0];
   }

   private boolean id_throw() {
      this.id_while();
      rrvT var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private();
      if ((cb_3)id_import.id_class[57] == null || (gm_3)id_import.id_class[56] == null) {
         return id_throws[6];
      } else if ((Boolean)this.id_break[3]) {
         return false;
      } else if (var1.id_strictfp().aJ_() || var1.K().aJ_()) {
         return id_throws[8];
      } else if (var1.B().aJ_() && (Boolean)((cb_3)id_import.id_class[57]).id_throws[23]) {
         return false;
      } else if (rrfZ_2.id_protected()) {
         return false;
      } else if (((rhx_3)((cb_3)id_import.id_class[57]).id_implements[18]).id_break) {
         return false;
      } else if (((cb_3)id_import.id_class[57]).id_break(rLD.id_goto)) {
         return false;
      } else if (((cb_3)id_import.id_class[57]).h()) {
         return false;
      } else if (((cb_3)id_import.id_class[57]).Sy()) {
         return false;
      } else {
         return ((cb_3)id_import.id_class[57]).PZ() ? false : id_throws[16];
      }
   }

   private static void id_try() {
      id_byte = new double[]{0.0, 0.0, 0.15F, 0.7, 0.7};
   }

   private void id_while() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
         this.id_break[1] = false;
         this.id_break[2] = false;
         this.id_break[3] = false;
      }
   }

   private static void id_public() {
      id_throws = new boolean[]{
         true, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false
      };
   }
}
