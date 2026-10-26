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
      super(id_catch[0], id_catch[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_implements[0]]);
      this.id_while();
      rrlX_2 var5 = new rrlX_2(this);
      this.id_break[id_implements[1]] = var5;
   }

   static {
      ntfClinit();
   }

   public boolean id_this() {
      this.id_while();
      return (Boolean)this.id_break[id_implements[38]];
   }

   @EventTarget
   public void id_class(rrLW var1) {
      this.id_while();
      ((rrlX_2)this.id_break[id_implements[2]]).id_class(var1);
   }

   @EventTarget
   public void id_class(rrAl_1 var1) {
      this.id_while();
      if (var1.id_class() < id_protected[0]) {
         Boolean var6 = id_throws[5];
         this.id_break[id_implements[18]] = var6;
      }
   }

   @EventTarget
   public void id_class(rrAo_1 var1) {
      this.id_while();
      if ((Boolean)this.id_break[id_implements[6]] && rmD_2.id_break != (Boolean)this.id_break[id_implements[7]]) {
         var1.id_protected(!rmD_2.id_break ? id_throws[0] : id_throws[1]);
      }

      ((rrlX_2)this.id_break[id_implements[8]]).id_class(var1);
   }

   @EventTarget
   public void id_class(rrAB var1) {
      this.id_while();
      if ((Boolean)this.id_break[id_implements[9]]) {
         var1.id_class(id_throws[2]);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5528047994387930442L;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_while();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_implements[10]]) {
         ((Qw_1)id_import.id_class[id_implements[11]]).Pr = id_throws[3];
         Boolean var6 = this.id_throw();
         this.id_break[id_implements[12]] = var6;
         if ((Boolean)this.id_break[id_implements[13]]
            && (Integer)((cb_3)id_import.id_class[id_implements[14]]).id_throws[id_implements[15]] % id_private[0] == 0) {
            Boolean var7 = id_throws[4];
            this.id_break[id_implements[16]] = var7;
            ((rrlX_2)this.id_break[id_implements[17]]).id_class(id_byte[1]);
         }
      }
   }

   @Override
   public void id_class(boolean var1) {
      this.id_while();
      super.id_class(var1);
      ((rrlX_2)this.id_break[id_implements[31]]).id_class(id_byte[2]);
   }

   @Override
   public void id_class() {
      this.id_byte(id_throws[17]);
   }

   @EventTarget
   public void id_class(rrLz_1 var1) {
      this.id_while();
      if ((Boolean)this.id_break[id_implements[3]]) {
         var1.id_class(((rrlX_2)this.id_break[id_implements[4]]).id_class(var1));
      } else {
         ((rrlX_2)this.id_break[id_implements[5]]).id_class(id_byte[0]);
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
      if ((cb_3)id_import.id_class[id_implements[32]] != null) {
         rjU_2 var2 = ((cb_3)id_import.id_class[id_implements[33]]).rv();
         var2.id_break = var2.id_break * id_byte[3];
         var2.id_protected = var2.id_protected * id_byte[4];
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
      this.id_break[id_implements[36]] = var6;
   }

   public boolean id_continue() {
      this.id_while();
      return (Boolean)this.id_break[id_implements[35]];
   }

   private static void id_else() {
      id_private = new byte[]{6, 4, 2, 3};
   }

   private static void id_instanceof() {
      id_protected = new float[]{10.0F};
   }

   public boolean id_new() {
      this.id_while();
      return (Boolean)this.id_break[id_implements[37]];
   }

   private static void id_return() {
      id_catch = new String[]{new String("Strafe"), new String("Позволяет не замедляться при\nдвижении в стороны")};
   }

   public rrlX_2 id_super() {
      this.id_while();
      return (rrlX_2)this.id_break[id_implements[34]];
   }

   private boolean id_throw() {
      this.id_while();
      rrvT var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_implements[19]]).id_private();
      if ((cb_3)id_import.id_class[id_implements[20]] == null || (gm_3)id_import.id_class[id_implements[21]] == null) {
         return id_throws[6];
      } else if ((Boolean)this.id_break[id_implements[22]]) {
         return id_throws[7];
      } else if (var1.id_strictfp().aJ_() || var1.K().aJ_()) {
         return id_throws[8];
      } else if (var1.B().aJ_() && (Boolean)((cb_3)id_import.id_class[id_implements[23]]).id_throws[id_implements[24]]) {
         return id_throws[9];
      } else if (rrfZ_2.id_protected()) {
         return id_throws[10];
      } else if (((rhx_3)((cb_3)id_import.id_class[id_implements[25]]).id_implements[id_implements[26]]).id_break) {
         return id_throws[11];
      } else if (((cb_3)id_import.id_class[id_implements[27]]).id_break(rLD.id_goto)) {
         return id_throws[12];
      } else if (((cb_3)id_import.id_class[id_implements[28]]).h()) {
         return id_throws[13];
      } else if (((cb_3)id_import.id_class[id_implements[29]]).Sy()) {
         return id_throws[14];
      } else {
         return ((cb_3)id_import.id_class[id_implements[30]]).PZ() ? id_throws[15] : id_throws[16];
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
