package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlM_2 extends rrTF<Spider> implements rrnF_2 {
   private static byte[] id_break;
   private static double[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;
   private static String[] id_case;
   private static boolean[] id_catch;
   private static float[] id_private;

   private static void id_int() {
      id_break = new byte[]{-1, -2, -3, 9, -2, -3, -1, 2};
   }

   public rrlM_2(Spider var1) {
      super(var1);
      this.id_return();
      rrTT var6 = new rrTT(this);
      this.id_class[id_protected[0]] = var6;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_case = new String[]{new String("Не найдено блоков в хотбаре!")};
   }

   private void id_class(rff_3 var1, rpm_3 var2, int var3) {
      rdH_2 var4 = new rdH_2((cb_3)id_import.id_class[id_protected[26]], var2, var1);
      rdn_3 var5;
      if (var3 == id_break[4]) {
         var5 = ((cb_3)id_import.id_class[id_protected[27]]).ss();
      } else if (var3 == id_break[5]) {
         var5 = ((cb_3)id_import.id_class[id_protected[28]]).Sn();
      } else {
         var5 = ((rhz_3)((cb_3)id_import.id_class[id_protected[29]]).id_implements[id_protected[30]]).id_extends(var3);
      }

      ryZ_2 var6 = var5.id_class(var4);
      if (var6.id_break()) {
         ((Ax_1)id_import.id_class[id_protected[31]])
            .id_break((cb_3)id_import.id_class[id_protected[32]], (gm_3)id_import.id_class[id_protected[33]], var2, var1);
         ((cb_3)id_import.id_class[id_protected[34]]).id_class(var2);
      }
   }

   private void id_class(rff_3 var1, int var2) {
      int var3 = ((rhz_3)((cb_3)id_import.id_class[id_protected[20]]).id_implements[id_protected[21]]).id_protected;
      if (var2 == id_break[1]) {
         this.id_class(var1, rpm_3.MAIN_HAND, var2);
      } else if (var2 == id_break[2]) {
         this.id_class(var1, rpm_3.OFF_HAND, var2);
      } else {
         if (var2 >= 0 && var2 < id_break[3]) {
            ((rhz_3)((cb_3)id_import.id_class[id_protected[22]]).id_implements[id_protected[23]]).id_protected = var2;
            this.id_class(var1, rpm_3.MAIN_HAND, var2);
            ((rhz_3)((cb_3)id_import.id_class[id_protected[24]]).id_implements[id_protected[25]]).id_protected = var3;
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-25, -80, -12, 107, 79, -15, -98, 32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7425507069312152563L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2037179714;
   }

   @EventTarget
   public void id_class(rrAO var1) {
      this.id_return();
      if ((Boolean)this.id_class[id_protected[18]]) {
         var1.id_catch(id_catch[3]);
         var1.id_protected(id_catch[4]);
         var1.id_byte(id_catch[5]);
         var1.id_throws(id_catch[6]);
         var1.id_case(id_catch[7]);
         Boolean var6 = id_catch[8];
         this.id_class[id_protected[19]] = var6;
      }
   }

   @EventTarget(
      id_class = 100
   )
   public void id_class(q_1 var1) {
      this.id_return();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[1]]) {
         PX var2 = new PX((Float)((cb_3)id_import.id_class[id_protected[2]]).id_throws[id_protected[3]], id_private[0]);
         ((rrTT)this.id_class[id_protected[4]]).id_class((rrTg_1)() -> var2, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_protected[5]]);
         if (((cb_3)id_import.id_class[id_protected[6]]).BL()) {
            ((cb_3)id_import.id_class[id_protected[7]]).sl();
         }

         if (!((cb_3)id_import.id_class[id_protected[8]]).z().id_break(var2, id_private[1])) {
            return;
         }

         int var3 = rrfY_2.id_class(id_catch[0]);
         if (var3 == id_break[0]) {
            return;
         }

         if (!((gm_3)id_import.id_class[id_protected[9]]).id_finally(((cb_3)id_import.id_class[id_protected[10]]).Bs())
            && ((Ax_1)id_import.id_class[id_protected[11]]).id_class(((cb_3)id_import.id_class[id_protected[12]]).Bs(), rpr_3.UP, id_catch[1])) {
            ((cb_3)id_import.id_class[id_protected[13]]).id_class(rpm_3.MAIN_HAND);
         }

         rjG_2 var5 = (rjG_2)id_import.id_class[id_protected[14]];
         if (!(var5 instanceof rff_3 var4)) {
            return;
         }

         if (((gm_3)id_import.id_class[id_protected[15]]).id_finally(var4.id_class())) {
            return;
         }

         if (((cb_3)id_import.id_class[id_protected[16]]).rv().id_byte < id_byte[0]) {
            Boolean var10 = id_catch[2];
            this.id_class[id_protected[17]] = var10;
            if (rmD_2.id_byte) {
               this.id_class(var4, var3);
            }
         }
      }
   }

   @Override
   public float id_break() {
      return id_private[2];
   }

   @Override
   public rrTp_1 id_catch() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_protected[41]];
   }

   private static void id_else() {
      id_byte = new double[1];
   }

   private void id_new() {
      Spider var1 = this.id_continue();
      String var2 = id_case[0];
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_protected[39]]).id_class(new rrtx_3(var1.id_final(), var2, id_protected[40]));
      rrfu_3.id_byte(rrfu_3.id_class((Module)var1) + var2);
   }

   private static void id_package() {
      id_protected = new short[]{
         0,
         0,
         57,
         15,
         0,
         0,
         57,
         57,
         57,
         56,
         57,
         55,
         57,
         57,
         64,
         56,
         57,
         1,
         1,
         1,
         57,
         1,
         57,
         1,
         57,
         1,
         57,
         57,
         57,
         57,
         1,
         55,
         57,
         56,
         57,
         57,
         56,
         0,
         0,
         0,
         2000,
         3
      };
   }

   private void id_return() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         this.id_class[1] = false;
      }
   }

   @Override
   public float id_private() {
      return id_private[3];
   }

   private static void id_final() {
      id_private = new float[]{81.0F, 0.05F, -1.0F, -1.0F};
   }

   private static void id_synchronized() {
      id_catch = new boolean[]{true, true, true, true, false, false, false, false, false, false, true, false, true, false};
   }

   @Override
   public boolean aI_() {
      if ((cb_3)id_import.id_class[id_protected[35]] != null && (gm_3)id_import.id_class[id_protected[36]] != null) {
         int var1 = rrfY_2.id_class(id_catch[10]);
         if (var1 == id_break[6]) {
            this.id_new();
            this.id_continue().id_volatile();
            return id_catch[11];
         } else {
            return super.aI_();
         }
      } else {
         return id_catch[9];
      }
   }

   @Override
   public boolean aK_() {
      this.id_return();
      ((rrTT)this.id_class[id_protected[37]]).id_final();
      ((rrTT)this.id_class[id_protected[38]]).id_finally();
      return super.aK_();
   }
}
